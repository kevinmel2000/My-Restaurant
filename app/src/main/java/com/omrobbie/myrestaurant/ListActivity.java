package com.omrobbie.myrestaurant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView rv_list;
    private RestaurantAdapter adapter;
    private List<MenuData> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        setupEnv();
        setupList();
        loadDummyData();
    }

    private void setupEnv() {
        rv_list = (RecyclerView) findViewById(R.id.rv_list);
        list = new ArrayList<>();
    }

    private void setupList() {
        adapter = new RestaurantAdapter(list);
        rv_list.setLayoutManager(new LinearLayoutManager(this));
        rv_list.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rv_list.setAdapter(adapter);
    }

    private void loadDummyData() {
        list.add(new MenuData("Nasi goreng", "Rp. 10.000"));
        list.add(new MenuData("Mie ayam pangsit", "Rp. 13.000"));

        for (int i = 0; i < 15; i++) {
            list.add(new MenuData("Menu " + i, "Rp " + (i + 2) + "0.000"));
        }

        adapter.replaceAll(list);
    }
}
