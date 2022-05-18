package com.example.hw_3_32_sakiev_nursultan;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChislaAdapter extends RecyclerView.Adapter<ChislaViewHolder> {
    private ArrayList<String> chisla=new ArrayList<>();

    public ChislaAdapter(ArrayList<String> chisla) {
        this.chisla = chisla;
    }

    @NonNull
    @Override
    public ChislaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChislaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chisla,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChislaViewHolder holder, int position) {
holder.bind(chisla.get(position));
    }

    @Override
    public int getItemCount() {
        return chisla.size() ;
    }
}
