package com.example.tema_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myboton = (Button) findViewById(R.id.botonborrar);
        TextView mytexview = (TextView) findViewById(R.id.texview1);
        myboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mytexview.setText("");
            }
        });
    }
}