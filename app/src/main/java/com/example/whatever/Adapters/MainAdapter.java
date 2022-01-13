package com.example.whatever.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatever.Models.MainModel;
import com.example.whatever.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder>{

    ArrayList<MainModel> list ;
    Context context ;


    @NonNull
    @Override
    public
    viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main2,parent,false);
        return new viewholder(view);
    }

    @Override
    public
    void onBindViewHolder(@NonNull viewholder holder, int position) {

        final MainModel model= list.get (position);
        holder.foodimaige.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());

    }

    @Override
    public
    int getItemCount() {

        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView foodimaige ;
        TextView mainName , price , description;

        public viewholder(@NonNull View itemView) {

            super(itemView);

            foodimaige = itemView.findViewById(R.id.imageView);
            mainName = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            description = itemView.findViewById(R.id.description);

        }
    }
}
