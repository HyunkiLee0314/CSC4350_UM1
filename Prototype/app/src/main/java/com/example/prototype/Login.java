package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button btn_log2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_log2 = (Button)findViewById(R.id.btn_login2);
        btn_log2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openHome();
            }
        });
    }

    public void openHome(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}