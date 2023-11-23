package com.example.taskk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.taskk.Adapter.mycustomadapter1;
import com.example.taskk.Adapter.mycustomadapter2;
import com.example.taskk.Model.Nonvegmodel;
import com.example.taskk.Model.Vegmodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1, recyclerView2;
    List<Vegmodel> vegmodelList;
    List<Nonvegmodel> nonvegmodelList;
    mycustomadapter1 mycustomadapter1;
    mycustomadapter2 mycustomadapter2;
    GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1 = findViewById(R.id.recyclerview1);
        recyclerView2 = findViewById(R.id.recyclerview2);
        vegmodelList = new ArrayList<>();
        nonvegmodelList = new ArrayList<>();
        Vegmodel v1 = new Vegmodel("Panner", R.drawable.panner, 300);
        Vegmodel v2 = new Vegmodel("Parota", R.drawable.parata, 290);
        Vegmodel v3 = new Vegmodel("Idli", R.drawable.idli, 150);
        Vegmodel v4 = new Vegmodel("Puri", R.drawable.puri, 190);
        Vegmodel v5 = new Vegmodel("Bonda", R.drawable.bonda, 130);
        Vegmodel v6 = new Vegmodel("Manchuria", R.drawable.manchuria, 200);
        Vegmodel v7 = new Vegmodel("Veg Biryani", R.drawable.veg, 250);
        vegmodelList.add(v1);
        vegmodelList.add(v2);
        vegmodelList.add(v3);
        vegmodelList.add(v4);
        vegmodelList.add(v7);
        vegmodelList.add(v5);
        vegmodelList.add(v6);
        mycustomadapter1 = new mycustomadapter1(vegmodelList);

        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(mycustomadapter1);
        mycustomadapter2 = new mycustomadapter2(nonvegmodelList);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setAdapter(mycustomadapter2);
        IntializeDataintoRecycleview();


    }

    private void IntializeDataintoRecycleview() {
        Nonvegmodel n1 = new Nonvegmodel("Chicken Biryani", R.drawable.biryani, 330);
        Nonvegmodel n2 = new Nonvegmodel("Chicken Popcorn", R.drawable.popcorn, 290);
        Nonvegmodel n3 = new Nonvegmodel("Chicken 65", R.drawable.ww, 270);
        Nonvegmodel n4 = new Nonvegmodel("Chicken Curry", R.drawable.curry, 310);
        Nonvegmodel n5 = new Nonvegmodel(" Butter Chicken ", R.drawable.butter, 270);
        Nonvegmodel n6 = new Nonvegmodel("Chicken Wings", R.drawable.kfc, 220);
        Nonvegmodel n7 = new Nonvegmodel("Chicken Mandi", R.drawable.mandi, 230);
        Nonvegmodel n8 = new Nonvegmodel("Chicken Shawarma", R.drawable.shawarma, 190);
        nonvegmodelList.add(n1);
        nonvegmodelList.add(n2);
        nonvegmodelList.add(n4);
        nonvegmodelList.add(n3);
        nonvegmodelList.add(n5);
        nonvegmodelList.add(n6);
        nonvegmodelList.add(n7);
        nonvegmodelList.add(n8);
        mycustomadapter2.notifyDataSetChanged();
    }
}