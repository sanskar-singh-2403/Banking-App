package com.example.gripproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.gripproject.R;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.customerButton);
        button2=findViewById(R.id.transactionButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Customers Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, UserList.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Transactions Page", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}