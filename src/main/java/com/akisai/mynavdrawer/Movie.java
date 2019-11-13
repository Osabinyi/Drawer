package com.akisai.mynavdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Movie extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        listView = findViewById(R.id.list_view);

        final ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Avocado");
        fruits.add("Grapes");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Watermelon");
        fruits.add("Pawpaw");
        fruits.add("Peanut");

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,fruits);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You selected"+fruits.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
