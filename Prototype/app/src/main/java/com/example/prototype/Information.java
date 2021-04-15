package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        View infoView = findViewById(R.id.btn_info_home);
        infoView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openHome();
            }
        });

        View historyView = findViewById(R.id.btn_info_history);
        historyView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openHistory();
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
}
