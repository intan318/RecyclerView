package com.example.recyclerviewlatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewlatihan.Model.ItemModel;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    TextView detailTitle;
    TextView detailDescription;
    ImageView detailImage;
    List<ItemModel> itemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initData();

        Intent i = getIntent();
        String detTitle = i.getStringExtra("title");
        String detDesc = i.getStringExtra("description");
        Integer detImage = i.getIntExtra("image", 0);

        detailTitle.setText(detTitle);
        detailDescription.setText(detDesc);
        Glide.with(this)
                .load(detImage)
                .into(detailImage);
;
    }

    private void initData() {
        detailTitle = findViewById(R.id.txtNamaDetail);
        detailDescription = findViewById(R.id.txtDescDetail);
        detailImage = findViewById(R.id.imgDetail);
    }

}
