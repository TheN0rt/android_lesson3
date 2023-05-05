package ru.mirea.maksimov.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void sendValue(View view) {
//        Bundle extras = getIntent().getExtras();
//
//        if (extras != null) {
//            TextView ageView = findViewById(R.id.textViewBook);
//            String university = extras.getString(MainActivity.KEY);
//            ageView.setText(String.format("Моя любимая книга: %s", university)); // Ломает приложение
//        }
        Intent data = new Intent();
        EditText textBook = findViewById(R.id.bookValue);
        String text = textBook.getText().toString();
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}