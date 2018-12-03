package com.first.firstprogramm.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.first.firstprogramm.R;
import com.first.firstprogramm.adapter.CategoryListAdapter;
import com.first.firstprogramm.dto.CategoriesDTO;

import java.util.ArrayList;
import java.util.List;

public class CatalogActivity extends AppCompatActivity{

    List<CategoriesDTO> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_fragment);

        createMockCategoriesData();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        CategoryListAdapter categoryListAdapter = new CategoryListAdapter(this, data);
        recyclerView.setAdapter(categoryListAdapter);

        //Intent intent = getIntent();
    }

    private void createMockCategoriesData(){
        data.add(new CategoriesDTO("Item 1"));
        data.add(new CategoriesDTO("Item 2"));
        data.add(new CategoriesDTO("Item 3"));
    }
}
