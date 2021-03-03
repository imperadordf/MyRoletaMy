package com.example.myroleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Rodar(View view) {

        TextView text = findViewById(R.id.Sorteado);

        int randomNumber = new Random().nextInt(23);

        text.setText("Número Sorteado: "+ randomNumber);
    }
}