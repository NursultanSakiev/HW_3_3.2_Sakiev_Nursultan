package com.example.hw_3_32_sakiev_nursultan;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChislaViewHolder extends RecyclerView.ViewHolder {
    private TextView tvChisla;
    public ChislaViewHolder(@NonNull View itemView) {
        super(itemView);
        tvChisla=itemView.findViewById(R.id.chisla);
    }
    public void bind(String chisla){
        tvChisla.setText(chisla);
    }

}
