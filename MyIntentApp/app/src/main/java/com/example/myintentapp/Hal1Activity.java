package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hal1Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnHAL1;
    EditText editNama;
    private String KEY_NAME = "nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);
        btnHAL1 = findViewById(R.id.btn_hal1);
        editNama = findViewById(R.id.text_nama);

        btnHAL1.setOnClickListener(this);
    }
    @Override
    public void onClick (View view) {
        String nama = editNama.getText().toString();
        Intent intent  = new Intent(Hal1Activity.this, Hal2Activity.class).putExtra(KEY_NAME, nama);
        startActivity(intent);
    }

    }

