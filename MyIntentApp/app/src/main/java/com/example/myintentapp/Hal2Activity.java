package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hal2Activity extends AppCompatActivity {
    TextView txtNama;
    String nama;
    private String KEY_NAME = "nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);
        txtNama = findViewById(R.id.text_hasil);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txtNama.setText(nama);
    }
}
