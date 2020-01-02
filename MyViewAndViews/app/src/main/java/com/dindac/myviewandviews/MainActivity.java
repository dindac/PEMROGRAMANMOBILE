package com.dindac.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btndonasi;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle("Donasi Pesawat R80");
            }
            btndonasi = findViewById(R.id.btn_donasi);
            btndonasi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_donasi:
                startActivity(new Intent(MainActivity.this, DonasiActivity.class));
                break;
        }

    }
}



