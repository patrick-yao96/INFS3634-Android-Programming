package com.example.borgerkong;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OrderReviewAdapter extends RecyclerView.Adapter<OrderReviewAdapter.OrderViewHolder> {

    //ArrayList to hold menu items

    private ArrayList<Item> itemsToAdapt;

    //Context
    private Context context;

    //Adapter Constructor
    public OrderReviewAdapter(Context context)
    {
        this.context = context;
    }



    //Custom View Holder Class
    public class OrderViewHolder extends RecyclerView.ViewHolder
    {
        public View view;
        public ImageView item_image;
        public TextView item_name;
        public TextView item_price;
        public TextView item_quantity;

        // Item View Holder Constructor
        public OrderViewHolder(View v)
        {
            super(v);
            view = v;
            item_image = v.findViewById(R.id.item_image_recycler);
            item_name = v.findViewById(R.id.item_name_recycler);
            item_price = v.findViewById(R.id.item_price_recycler);
            item_quantity = v.findViewById(R.id.item_quantity_recycler);

        }
    }



    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_layout, parent, false);
        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderReviewAdapter.OrderViewHolder holder, int position) {
        final Item itemAtPosition = itemsToAdapt.get(position);
        holder.item_name.setText(itemAtPosition.getItem_name());
        holder.item_price.setText("$"+itemAtPosition.getItem_price()+" ");
        holder.item_image.setImageResource(itemAtPosition.getItem_imageDrawableID());
        holder.item_quantity.setText("X"+DataHolder.getInstance().counterList.get(position)+" ");

    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }

    //set data method
    public void setData(ArrayList<Item> itemsToAdapt)

    {
        this.itemsToAdapt=itemsToAdapt;
    }



}
