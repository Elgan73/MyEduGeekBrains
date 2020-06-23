package com.example.myedugeekbrains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView doom;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doom = findViewById(R.id.backgroundImage);
        textView = findViewById(R.id.textView);
    }

    public void tapToImage(View view) {
        doom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapToDoomImage();
            }
        });
    }

    public void tapToDoomImage() {
        textView.setVisibility(View.VISIBLE);
    }
}