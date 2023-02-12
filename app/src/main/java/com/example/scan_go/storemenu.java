package com.example.scan_go;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;
import java.net.URI;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class storemenu extends AppCompatActivity {

    ImageButton shoprite;
    ImageButton pricerite;
    ImageButton freshgrocer;
    ImageButton gourmetgrocer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_menu);

        shoprite=findViewById(R.id.button1);
        pricerite=findViewById(R.id.button2);
        freshgrocer=findViewById(R.id.button3);
        //idk why its button 6 and not 4 for the xml
        gourmetgrocer=findViewById(R.id.button6);
        shoprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(storemenu.this, searchzipcode.class));
            }

        });
        pricerite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(storemenu.this, searchzipcode.class));
            }

        });
        freshgrocer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(storemenu.this, searchzipcode.class));
            }

        });
        gourmetgrocer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(storemenu.this, searchzipcode.class));
            }

        });
    }
}



    /** getStoreDetails and getItemDetails URL for demo*/
