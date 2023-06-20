package com.example.gripproject.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gripproject.ListAdapters.CustomAdapter;
import com.example.gripproject.R;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] arr={"Customer 1","Customer 2","Customer 3","Customer 4","Customer 5","Customer 6","Customer 7","Customer 8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c=new CustomAdapter(arr);
        recyclerView.setAdapter(c);
    }
}