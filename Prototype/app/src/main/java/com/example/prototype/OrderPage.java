package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderPage extends AppCompatActivity {
    private Button btn_placeOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        btn_placeOrder = (Button)findViewById(R.id.btn_placeOrder2);
        btn_placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openHome();
            }
        });

        View homeView = findViewById(R.id.btn_order_home);
        homeView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openHome();
            }
        });

        View historyView = findViewById(R.id.btn_order_history);
        historyView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openHistory();
            }
        });

        View infoView = findViewById(R.id.btn_order_info);
        infoView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openInfo();
            }
        });
    }

    public void openHome(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
    public void openHistory(){
        Intent intent = new Intent(this, OrderHistory.class);
        startActivity(intent);
    }
    public void openInfo(){
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
    }
}