package com.example.teste;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityb);
        TextView textViewMostra = findViewById(R.id.textviewB);

        String textoRecebido = getIntent().getStringExtra("inputText");
        textViewMostra.setText(textoRecebido);
    }
}
