package ru.mirea.maksimov.Lesson3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String text = (String) getIntent().getSerializableExtra("time");
        String string = String.format("Квадрат значения моего номера по списку составляет 324, а текущее время: %s", text);
        TextView textView = findViewById(R.id.textView);
        textView.setText(string);


    }
}
