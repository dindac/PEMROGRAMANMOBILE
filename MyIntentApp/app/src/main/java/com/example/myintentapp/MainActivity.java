package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btndial;
    Button btnwebsite;
    Button btnExplisit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btndial= findViewById(R.id.btn_dial);
        btndial.setOnClickListener(this);

        btnwebsite = findViewById(R.id.btn_website);
        btnwebsite.setOnClickListener(this);

        btnExplisit= findViewById(R.id.btn_explisit);
        btnExplisit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_data:
                Intent moveData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveData.putExtra(MoveActivityWithData.Extra_Name, "Dinda Cahya");
                moveData.putExtra(MoveActivityWithData.Extra_Age, 19);
                startActivity(moveData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "0812345678";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_explisit:
                Intent exp = new Intent (MainActivity.this, Hal1Activity.class);
                startActivity(exp);
                break;
            case R.id.btn_website:
                String web = "https://www.polines.ac.id";
                Intent openweb = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
                startActivity(openweb);
                break;
        }
    }
}