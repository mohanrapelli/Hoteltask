package com.example.taskk.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskk.Model.Nonvegmodel;
import com.example.taskk.Model.Vegmodel;
import com.example.taskk.R;

import java.util.List;

public class mycustomadapter2 extends RecyclerView.Adapter<mycustomadapter2.nonvegviewholder> {
    List<Nonvegmodel> nonvegmodelList;

    public mycustomadapter2(List<Nonvegmodel> nonvegmodelList) {
        this.nonvegmodelList = nonvegmodelList;
    }

    @NonNull
    @Override
    public mycustomadapter2.nonvegviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.nonveglayout,parent,false);
        return new nonvegviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter2.nonvegviewholder holder, int position) {
        Nonvegmodel vegmodel=nonvegmodelList.get(position);
        holder.textVieww3.setText(vegmodel.getDishname2());
        holder.textVieww2.setText(String.valueOf(vegmodel.getPrice2()));
        holder.shapeableImageView2.setImageResource(vegmodel.getImage2());

    }

    @Override
    public int getItemCount() {
        return nonvegmodelList.size();
    }
    public class nonvegviewholder extends RecyclerView.ViewHolder{
        TextView textVieww3,textVieww2;
        ImageView shapeableImageView2;


        public nonvegviewholder(@NonNull View itemView) {
            super(itemView);
            textVieww3=itemView.findViewById(R.id.textview3);
            textVieww2=itemView.findViewById(R.id.textview4);
            shapeableImageView2=itemView.findViewById(R.id.pic1);

        }
    }
}
