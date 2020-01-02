package com.dindac.uts_33418109;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class DetailsListWisata extends AppCompatActivity {
    private int Wisata_id;
    ImageView imgDetail;
    TextView tvIsi, tvJudul;

    private ArrayList<Wisata> listWisata = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_wisata);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Wisata_id = getIntent().getIntExtra("Wisata_id",0);
        tvJudul = findViewById(R.id.tv_judul_details);
        tvIsi = findViewById(R.id.tv_isi_details);
        imgDetail = findViewById(R.id.img_details);

        listWisata.addAll(WisataData.getListData());

        setLayout();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    void setLayout(){
        getSupportActionBar().setTitle(listWisata.get(Wisata_id).getName());
        tvJudul.setText(listWisata.get(Wisata_id).getName());
        tvIsi.setText(listWisata.get(Wisata_id).getDetail());
        Glide.with(this)
                .load(listWisata.get(Wisata_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }


    }
