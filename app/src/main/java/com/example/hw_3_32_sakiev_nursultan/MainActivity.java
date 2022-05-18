package com.example.hw_3_32_sakiev_nursultan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private RecyclerView recyclerView;
private ChislaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_chisla);
        ArrayList<String> chisla=new ArrayList<>();
        chisla.add("43423");
        chisla.add("43423");
        chisla.add("43423");
        chisla.add("43423");
        chisla.add("43423");
        chisla.add("43423");
        chisla.add("43423");
        chisla.add("43423");
adapter=new ChislaAdapter(chisla);
recyclerView.setAdapter(adapter);
    }
}