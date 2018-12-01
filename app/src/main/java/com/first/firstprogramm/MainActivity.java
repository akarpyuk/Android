package com.first.firstprogramm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {

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
    }
}
