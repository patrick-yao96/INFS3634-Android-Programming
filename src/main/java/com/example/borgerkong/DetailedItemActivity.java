package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedItemActivity extends AppCompatActivity {
    private ImageView itemImage_view;
    private TextView item_name_view;
    private TextView item_price_view;
    private TextView item_desc_view;
    private TextView counter_view;
    private Button add_button;
    private Button minus_button;
    private Button confirm_button ;



    private int current_counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_item);

        //Receiving Intent
        Intent intent = getIntent();

        //Receiving itemID
        final int itemID = intent.getIntExtra("itemID",0);

        //Getting all data
       final Item item = BorgerKongDatabase.getItemByID(itemID);

        //Linking all views
        itemImage_view = findViewById(R.id.item_image);
        item_name_view = findViewById(R.id.item_name);
        item_price_view = findViewById(R.id.item_price);
        item_desc_view = findViewById(R.id.item_desc);
        counter_view = findViewById(R.id.counter);
        add_button = findViewById(R.id.add_button);
        minus_button = findViewById(R.id.minus_button);
        confirm_button = findViewById(R.id.order_button);

        //Setting all the data
        itemImage_view.setImageResource(item.getItem_imageDrawableID());
        item_name_view.setText(item.getItem_name());
        item_price_view.setText("$"+item.getItem_price()+" ");
        item_desc_view.setText(item.getItem_description());

        //Counter function

        add_button.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                current_counter++;
                counter_view.setText(current_counter+" ");
            }

        });

        minus_button.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                current_counter--;
                if(current_counter>0)
                {
                    counter_view.setText(current_counter+" ");
                }else{
                    current_counter = 0;
                    counter_view.setText(current_counter+" ");
                }
            }

        });

        //Confirm and passing the amount per item
        confirm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent main_intent = new Intent(context, MainActivity.class);
                main_intent.putExtra("itemID",itemID);
                main_intent.putExtra("itemCounter",current_counter);
                if(current_counter>0)
                {

                    DataHolder.getInstance().item.add(BorgerKongDatabase.getItemByID(itemID));
                    DataHolder.getInstance().counterList.add(current_counter);
                }
                context.startActivity(main_intent);

            }
        });



    }

}
