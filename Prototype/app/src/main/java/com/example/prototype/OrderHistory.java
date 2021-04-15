package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);


        View infoView = findViewById(R.id.btn_history_home);
        infoView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openHome();
            }
        });

        View historyView = findViewById(R.id.btn_history_Info);
        historyView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openInfo();
            }
        });
    }
    public void openHome(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
    public void openInfo(){
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
    }
}