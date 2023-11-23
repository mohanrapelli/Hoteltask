package com.example.taskk.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskk.Model.Vegmodel;
import com.example.taskk.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class mycustomadapter1 extends RecyclerView.Adapter<mycustomadapter1.vegviewholder> {
    List<Vegmodel> vegmodelList;

    public mycustomadapter1(List<Vegmodel> vegmodelList) {
        this.vegmodelList = vegmodelList;
    }

    @NonNull
    @Override
    public mycustomadapter1.vegviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.veglayout,parent,false);
        return new vegviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter1.vegviewholder holder, int position) {
        Vegmodel vegmodel=vegmodelList.get(position);
        holder.textVieww.setText(vegmodel.getDishname1());
        holder.textVieww1.setText(String.valueOf(vegmodel.getPrice1()));
        holder.shapeableImageView1.setImageResource(vegmodel.getImage1());

    }

    @Override
    public int getItemCount() {
        return vegmodelList.size();
    }
    public class vegviewholder extends RecyclerView.ViewHolder{
        TextView textVieww,textVieww1;
        ImageView shapeableImageView1;


        public vegviewholder(@NonNull View itemView) {
            super(itemView);
            textVieww=itemView.findViewById(R.id.textview1);
            textVieww1=itemView.findViewById(R.id.textview2);
            shapeableImageView1=itemView.findViewById(R.id.pic);

        }
    }
}
