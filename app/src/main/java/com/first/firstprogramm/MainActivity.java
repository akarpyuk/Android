package com.first.firstprogramm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.first.firstprogramm.fragment.CatalogActivity;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView mainImage;
    Button btnCatalog;
    Button btnConstructor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_layout); //setContentView(int)

        btnCatalog = findViewById(R.id.btn_catalog);
        btnConstructor = findViewById(R.id.btn_constructor);

        mainImage = findViewById(R.id.main_image);
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(mainImage);

        // обработчик на нажатиЯ кнопки View Products
        btnCatalog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Запускаем Activity вывода всех продуктов
                Intent intent = new Intent(MainActivity.this,CatalogActivity.class);
                startActivity(intent);

            }
        });
    }

    public void onClick(View view){
        Intent intent = new Intent(MainActivity.this,CatalogActivity.class);
        startActivity(intent);

    }


}
