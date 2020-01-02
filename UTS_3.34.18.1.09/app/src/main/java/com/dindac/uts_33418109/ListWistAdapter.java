package com.dindac.uts_33418109;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWistAdapter extends RecyclerView.Adapter<ListWistAdapter.ListViewHolder> {
    private ArrayList<Wisata> listWisata;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    private OnItemClickCallback onItemClickCallback;
    public ListWistAdapter(ArrayList<Wisata> list) {
        this.listWisata = list;
    }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_wisata, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Wisata wisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisata.getPhoto())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.imgPhoto);
        holder.tvName.setText(wisata.getName());
        holder.tvDetail.setText(wisata.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                onItemClickCallback.onItemClicked(listWisata.get(holder.getAdapterPosition()));
                // Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listWisata.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(holder.itemView.getContext(), DetailsListWisata.class);
                intent.putExtra("judul",wisata.getName());
                intent.putExtra("isi",wisata.getDetail());
                intent.putExtra("image_url",wisata.getPhoto());
                holder.itemView.getContext().startActivity(intent);
                //holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }

    }
    public interface OnItemClickCallback {
        void onItemClicked(Wisata data);
    }
}
