package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.peacock);
        ImageView imageView1 = findViewById(R.id.parrot);
        ImageView imageView2 = findViewById(R.id.kingfisher);
        imageView.setOnClickListener(view -> {


            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("bird","Peacock");
            startActivity(intent);

        });
        imageView1.setOnClickListener(view -> {


            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("bird","Parrot");
            startActivity(intent);

        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("bird","Kingfishers");
                startActivity(intent);

            }
        });


    }
}
