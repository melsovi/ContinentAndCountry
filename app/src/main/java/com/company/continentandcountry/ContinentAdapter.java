package com.company.continentandcountry;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {
    private ArrayList<Continent> data;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<Continent> data, OnClick onClick) {
        this.data = data;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(data.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onClick(data.get(position));

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ContinentViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView ivContinent;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_continent);
            ivContinent = itemView.findViewById(R.id.image_view_continent);
        }

        public void bind(Continent data) {
            name.setText(data.getName());
            ivContinent.setImageResource(data.getImage());

        }
    }

}
