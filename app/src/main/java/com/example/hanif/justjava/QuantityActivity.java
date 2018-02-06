package com.example.hanif.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class QuantityActivity extends AppCompatActivity {

    private Button btn_submit_order;
    private Button btn_increment;
    private Button btn_decrement;
    private TextView tv_price;
    private TextView tv_quantity;
    private int qty = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantity);

        btn_increment = findViewById(R.id.btn_increment);
        btn_increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = qty+1;
                display(qty);
            }
        });

        btn_decrement = findViewById(R.id.btn_decrement);
        btn_decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qty > 1){
                   qty = qty-1;
                }else{
                    qty = 1;
                }
                display(qty);
            }
        });

        btn_submit_order = findViewById(R.id.btn_submit_order);
        btn_submit_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayprice(qty*5);
            }
        });
    }

    private void display(int number) {
        tv_quantity = findViewById(R.id.tv_quantity);
        tv_quantity.setText(""+number);
    }

    private void displayprice(int number){
        tv_price = findViewById(R.id.tv_price);
        tv_price.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
