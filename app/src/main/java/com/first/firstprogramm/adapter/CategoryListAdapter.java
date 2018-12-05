package com.first.firstprogramm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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
        View view = inflater.inflate(R.layout.category_item, parent, false);

        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryListAdapter.CategoryViewHolder categoryViewHolder, final int position) {

        final CategoriesDTO item = data.get(position);
        categoryViewHolder.title.setText(item.getTitle());
        categoryViewHolder.imageView.setImageResource(item.getImage());

        /*int count = item.getCount();
        int price = item.getPrice();*/

        categoryViewHolder.count.setText(String.valueOf(item.getCount()));
        categoryViewHolder.price.setText(String.valueOf(item.getPrice()));


        categoryViewHolder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = item.getCount()+1;
                int price = item.getPrice();

                int curPrice = price*count;

                item.setCount(count);
                //item.setPrice(price);

                categoryViewHolder.count.setText(String.valueOf(count));
                categoryViewHolder.price.setText(String.valueOf(curPrice));
            }
        });

        categoryViewHolder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = item.getCount()-1;
                int price = item.getPrice();

                if(count<0) count=0;

                int curPrice = price*count;

                item.setCount(count);
                //item.setPrice(price);

                categoryViewHolder.count.setText(String.valueOf(count));
                categoryViewHolder.price.setText(String.valueOf(curPrice));
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView title, count, price;
        ImageView imageView;
        Button addButton, removeButton;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_category);

            title = itemView.findViewById(R.id.title_category);
            imageView = itemView.findViewById(R.id.image_category);
            count = itemView.findViewById(R.id.count_view);
            price = itemView.findViewById(R.id.price);

            addButton = itemView.findViewById(R.id.button_plus);
            removeButton = itemView.findViewById(R.id.button_minus);


        }
    }
}
