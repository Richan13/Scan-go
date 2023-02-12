package com.example.scan_go;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
//import org.apache.http.client.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;

public class searchzipcode extends AppCompatActivity {
    Button btnsearch;
    EditText edit_zip;
    ListView lv_stores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zipcode);

        String getStoreDetailsURL = "https://apimdev.wakefern.com/mockexample/V1/getStoreDetails/?Zipcode";

        // assign values to each control on the layout
        btnsearch = findViewById(R.id.btn_getzip);
        edit_zip = findViewById(R.id.edit_zip);
        lv_stores = findViewById(R.id.lv_stores);

        // check listener
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(searchzipcode.this, storelist.class));
            }
        });
    }
}
