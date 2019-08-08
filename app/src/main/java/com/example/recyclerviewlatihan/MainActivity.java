package com.example.recyclerviewlatihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import com.example.recyclerviewlatihan.Adapter.ItemAdapter;
import com.example.recyclerviewlatihan.Model.ItemModel;

import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    List<ItemModel> itemModels;
    ItemAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        itemModels=DataDummy.generateDummy();
        adapter = new ItemAdapter(this, itemModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }


}
