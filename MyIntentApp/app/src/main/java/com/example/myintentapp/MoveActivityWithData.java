package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithData extends AppCompatActivity {
    public static final String Extra_Name = "extra_name";
    public static final String Extra_Age = "extra_age";

    TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TvDataReceived = findViewById(R.id.tv_data_received);

        String nama = getIntent().getStringExtra(Extra_Name);
        int umur = getIntent().getIntExtra(Extra_Age, 0);

        String display = "Nama : "+nama+",\nUmur : "+umur;
        TvDataReceived.setText(display);

    }
}
