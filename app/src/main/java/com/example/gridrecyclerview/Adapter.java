package com.example.gridrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<Integer> names;
    List<Integer> images;
    Context context;
    // Bind layout resource file made to our RecyclerView to user
    LayoutInflater inflater;

    public Adapter(Context context, List<Integer> names, List<Integer> images){
        this.names = names;
        this.images = images;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_grid_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(names.get(position));
        holder.gridIcon.setImageResource(images.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView gridIcon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById((R.id.tvName));
            gridIcon = itemView.findViewById(R.id.ivImage);
        }
    }
}
