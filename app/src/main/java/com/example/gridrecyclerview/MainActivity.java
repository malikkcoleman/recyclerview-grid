package com.example.gridrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Create Variables
    RecyclerView dataList;
    List<Integer> names;
    List<Integer> images;

    // Adapter class for RecyclerView
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set variables to their correct view by id
        dataList = findViewById(R.id.dataList);

        // ArrayLists of data for RecyclerView
        names = new ArrayList<>();
        images = new ArrayList<>();

        // Add the names to the name ArrayList using string created in the string .xml file
        names.add(R.string.mothman);
        names.add(R.string.adam_ackler);
        names.add(R.string.wendigo);
        names.add(R.string.old_scratch);
        names.add(R.string.borne_from_the_earth);
        names.add(R.string.grim_reaper);
        names.add(R.string.headless_horseman);
        names.add(R.string.headless_coalminer);
        names.add(R.string.hells_gate);
        names.add(R.string.poition_seller);
        names.add(R.string.righteous_reckoning);
        names.add(R.string.zombie_apocalypse);

        // Add the images to the images ArrayList using the images saved in the drawable folder
        images.add(R.drawable.mothman);
        images.add(R.drawable.adamackler);
        images.add(R.drawable.wendigo);
        images.add(R.drawable.oldscratch);
        images.add(R.drawable.bornefromtheearth);
        images.add(R.drawable.grimreaper);
        images.add(R.drawable.headlesshorseman);
        images.add(R.drawable.headlesscoalminer);
        images.add(R.drawable.hellsgate);
        images.add(R.drawable.potionseller);
        images.add(R.drawable.righteousreckoning);
        images.add(R.drawable.zombieapocalypse);

        // Pass this, and the created Array Lists to the newly created object Adapter
        adapter = new Adapter(this, names, images);

        // Choose the Layout you want to use, pass it this, number of cols (spanCount), Orientation (VERTICAL), reverseLayout(true/false)
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);




    }

}