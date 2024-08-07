package com.example.gridbrowser.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gridbrowser.R;
import com.example.gridbrowser.adapter.GridViewAdapter;
import com.example.gridbrowser.databinding.ActivityMainBinding;
import com.example.gridbrowser.models.Link;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Link> list;
    private GridViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = Arrays.asList(
                new Link("Avito", "https://www.avito.ru/", R.drawable.avito),
                new Link("Codewars", "https://www.codewars.com/dashboard", R.drawable.codewars),
                new Link("GitHub", "https://github.com/", R.drawable.github),
                new Link("Gismeteo", "https://www.gismeteo.ru/", R.drawable.gismeteo),
                new Link("Leetcode", "https://leetcode.com/", R.drawable.leetcode),
                new Link("StackOverFlow", "https://stackoverflow.com/", R.drawable.stackoverflow)
        );

        adapter = new GridViewAdapter(list, MainActivity.this);

        binding.browserGridsGV.setAdapter(adapter);

        binding.browserGridsGV.setOnItemClickListener((parent, view, position, id) -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(list.get(position).getUrl())));
        });



    }
}