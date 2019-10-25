package com.example.borgerkong;

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

public class ItemMenuAdapter extends RecyclerView.Adapter<ItemMenuAdapter.ItemViewHolder> {

    //ArrayList to hold menu items

    private ArrayList<Item> itemsToAdapt;



    //Custom View Holder Class
    public class ItemViewHolder extends RecyclerView.ViewHolder
    {
        public View view;
        public ImageView item_image;
        public TextView item_name;
        public TextView item_price;

        // Item View Holder Constructor
        public ItemViewHolder(View v)
        {
            super(v);
            view = v;
            item_image = v.findViewById(R.id.item_image_recycler);
            item_name = v.findViewById(R.id.item_name_recycler);
            item_price = v.findViewById(R.id.item_price_recycler);

        }
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_recycler_layout, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemMenuAdapter.ItemViewHolder holder, int position) {
        final Item itemAtPosition = itemsToAdapt.get(position);
        holder.item_name.setText(itemAtPosition.getItem_name());
        holder.item_price.setText("$"+itemAtPosition.getItem_price()+" ");
        holder.item_image.setImageResource(itemAtPosition.getItem_imageDrawableID());

        //on Click to detailed page
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, DetailedItemActivity.class);
                intent.putExtra("itemID", itemAtPosition.getItemID());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }

    //set data method
    public void setData(ArrayList<Item> itemsToAdapts)

    {
        this.itemsToAdapt=itemsToAdapts;
    }
}
