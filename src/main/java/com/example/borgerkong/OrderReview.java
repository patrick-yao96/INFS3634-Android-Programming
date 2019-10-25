package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderReview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_review);


        //Intent data transfer

        Intent intentReceiver = getIntent();
        int itemID = intentReceiver.getIntExtra("itemID",0);

        int itemCounter = intentReceiver.getIntExtra("itemCounter",0);

        Intent intent = new Intent(this, OrderReviewAdapter.class);
        intent.putExtra("itemID",itemID);
        intent.putExtra("itemCounter",itemCounter);




        //recycler view for order selection
        RecyclerView order_recycler = findViewById(R.id.orderReview_recycler);
        LinearLayoutManager orderLayoutManager = new LinearLayoutManager(this);

        order_recycler.setLayoutManager(orderLayoutManager);

        OrderReviewAdapter orderAdapter = new OrderReviewAdapter(this);

        //Giving the data to the adapter
        orderAdapter.setData(DataHolder.getInstance().item);
        order_recycler.setAdapter(orderAdapter);

        //color
        TextView total = findViewById(R.id.order_total);
        TextView total_1 = findViewById(R.id.totalTextView);
        total.setBackgroundColor(Color.parseColor("#d3d3d3"));
        total_1.setBackgroundColor(Color.parseColor("#d3d3d3"));

        int totalCost = 0;
        for(int i = 0; i<DataHolder.getInstance().item.size();i++)
        {
            int item_sum=0;
            item_sum=DataHolder.getInstance().item.get(i).getItem_price()*DataHolder.getInstance().counterList.get(i);
            totalCost = totalCost+item_sum;
        }
        total.setText("$"+totalCost+" ");




    }
}
