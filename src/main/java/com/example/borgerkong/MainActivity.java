package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycler view for menu selection
        RecyclerView item_recycler = findViewById(R.id.item_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        item_recycler.setLayoutManager(layoutManager);

        ItemMenuAdapter menuAdapter = new ItemMenuAdapter();

       menuAdapter.setData(BorgerKongDatabase.getAllItems());
       item_recycler.setAdapter(menuAdapter);


        Intent intentReceiver = getIntent();
        final int itemID = intentReceiver.getIntExtra("itemID",0);

        final int itemCounter = intentReceiver.getIntExtra("itemCounter",0);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(BorgerKongDatabase.getItemByID(itemID));



        //View Order Button
        Button viewOrder;
        viewOrder = findViewById(R.id.viewOrder_button);
        viewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = view.getContext();
                Intent intent = new Intent(context, OrderReview.class);
                intent.putExtra("itemID",itemID);
                intent.putExtra("itemCounter",itemCounter);
                context.startActivity(intent);
            }
        });









    }
}
