package com.dindac.uts_33418109;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<Wisata> listWisata = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        listWisata.addAll(WisataData.getListData());
        showRecyclerList();

    }
    private void showRecyclerList(){
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWistAdapter listWisataAdapter = new ListWistAdapter(listWisata);
        rvWisata.setAdapter(listWisataAdapter);
    }

    private void showRecyclerCardView(){
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        CardViewWisataAdapter cardViewWisataAdapter = new CardViewWisataAdapter(listWisata);
        rvWisata.setAdapter(cardViewWisataAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {

            case R.id.action_cardview:
                showRecyclerCardView();
                break;

            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_profile:
                Intent intent = new Intent(this, Profile.class);
                startActivity(intent);
                break;

        }
    }
}
