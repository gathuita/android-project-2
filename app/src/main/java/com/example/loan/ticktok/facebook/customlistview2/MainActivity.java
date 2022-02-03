package com.example.loan.ticktok.facebook.customlistview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.berry, R.drawable.mango, R.drawable.orange, R.drawable.ovacando, R.drawable.pawpaw, R.drawable.kiwi};

    String[] Fruits = {"Strawberry", "Mango", "Orange", "Avacando", "Pawpaw", ""};

    String[] FruitNumber = {"It's a sweet Fruit", "It's a sweet Fruit", "It's a sweet Fruit", "It's a sweet Fruit", "It's a sweet Fruit", "It's a sweet Fruit", "It's a sweet Fruit"};

    ListView lView;

    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lView = (ListView) findViewById(R.id.androidList);

        lAdapter = new ListAdapter(MainActivity.this, Fruits, FruitNumber, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,Fruits[i]+" "+FruitNumber[i], Toast.LENGTH_SHORT).show();


            }
        });
    }
}
