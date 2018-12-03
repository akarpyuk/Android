package com.first.firstprogramm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;

import com.first.firstprogramm.R;
import com.first.firstprogramm.dto.CategoriesDTO;

import java.util.List;

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.CategoryViewHolder>{

    private List<CategoriesDTO> data;
    private LayoutInflater inflater;

    public CategoryListAdapter(Context context, List<CategoriesDTO> data) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public CategoryListAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false);
        View view = inflater.inflate(R.layout.category_item, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListAdapter.CategoryViewHolder categoryViewHolder, int position) {

        CategoriesDTO item = data.get(position);
        categoryViewHolder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView title;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_category);
            title = itemView.findViewById(R.id.title_category);
        }
    }
}
