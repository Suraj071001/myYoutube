package com.example.vedioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity<userlist> extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        userlist = new ArrayList<>();

        userlist.add(new Model(R.drawable.img,"ANIME CLIPS 4K","android.resource://" + getPackageName() + "/" + R.raw.v1));
        userlist.add(new Model(R.drawable.img_1,"anime edit","android.resource://" + getPackageName() + "/" + R.raw.v2));
        userlist.add(new Model(R.drawable.img_2,"[Feel Like God Zenitsu AMV","android.resource://" + getPackageName() + "/" + R.raw.v3));
        userlist.add(new Model(R.drawable.img_3,"THIS IS 4K ANIME _ Goku Edit [ULTRA HD INSTINCT]","android.resource://" + getPackageName() + "/" + R.raw.v4));
        userlist.add(new Model(R.drawable.img_4,"Anime Edit ","android.resource://" + getPackageName() + "/" + R.raw.v5));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(this,userlist);
        recyclerView.setAdapter(c);

    }
}