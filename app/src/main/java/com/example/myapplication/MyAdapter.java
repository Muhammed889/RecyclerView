package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<MyItem> myItems;

    public MyAdapter(List<MyItem> myItems) {
        this.myItems = myItems;
    }

    @NonNull
    @Override

    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View root = inflator.inflate(R.layout.product_item,parent,false);
        return new MyViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
      holder.itemName.setText(myItems.get(position).getName());
      holder.itemPrice.setText(myItems.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return myItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        final public TextView itemName;
        final  public   TextView itemPrice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

             itemName = itemView.findViewById(R.id.item_name);
             itemPrice = itemView.findViewById(R.id.item_price);
        }
    }
}
