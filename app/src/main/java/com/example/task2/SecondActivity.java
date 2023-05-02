package com.example.task2;

import static com.example.task2.R.id.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Object View;
    TextView text;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        TextView viewById = (TextView) findViewById(textView);

        text=(TextView) findViewById(R.id.textView);
        text.setText(getIntent().getExtras().getString("bird"));

        }
        }

