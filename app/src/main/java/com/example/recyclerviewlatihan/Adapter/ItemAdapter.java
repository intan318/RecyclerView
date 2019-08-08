package com.example.recyclerviewlatihan.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewlatihan.DetailActivity;
import com.example.recyclerviewlatihan.MainActivity;
import com.example.recyclerviewlatihan.Model.ItemModel;
import com.example.recyclerviewlatihan.R;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    Context context;
    List<ItemModel> itemModels;

    //constructor menghubungkan di adapter
    public ItemAdapter(Context context, List<ItemModel> itemModels) {
        this.context = context; //context ini sam kyk context yang ada di mainactivity
        this.itemModels = itemModels;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.title.setText(itemModels.get(i).getTitle());
        viewHolder.description.setText(itemModels.get(i).getDescription());

        Glide.with(context)
                .load(itemModels.get(i).getImage())
                .into(viewHolder.image);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ItemModel data = itemModels.get(i);

                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("title", data.getTitle());
                i.putExtra("description", data.getDescription());
                i.putExtra("image", data.getImage());


                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return itemModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txtNamaItem);
            description = itemView.findViewById(R.id.txtDescItem);
            image = itemView.findViewById(R.id.imgItem);
                }

        }

    }
