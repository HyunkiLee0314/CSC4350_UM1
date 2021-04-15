package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private Button btn_placeOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btn_placeOrder = (Button)findViewById(R.id.btn_placeorder);
        btn_placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openOrderPage();
            }
        });

        View infoView = findViewById(R.id.btn_info);
        infoView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openInfo();
            }
        });

        View historyView = findViewById(R.id.btn_OrderHistory);
        historyView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openHistory();
            }
        });
    }

    public void openOrderPage(){
        Intent intent = new Intent(this, OrderPage.class);
        startActivity(intent);
    }
    public void openInfo(){
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
    }
    public void openHistory(){
        Intent intent = new Intent(this, OrderHistory.class);
        startActivity(intent);
    }
}