package com.example.androiddubaothoitiet.Activitis;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddubaothoitiet.Adapter.HourlyAdapter;
import com.example.androiddubaothoitiet.Domain.Hourly;
import com.example.androiddubaothoitiet.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<Hourly> items = new ArrayList<>();
        items.add(new Hourly("10pm",28,"cloudy"));
        items.add(new Hourly("11pm",29,"sun"));
        items.add(new Hourly("12pm",30,"wind"));
        items.add(new Hourly("1am",29,"rainy"));
        items.add(new Hourly("2am",27,"cloudy"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterHourly =new HourlyAdapter(items);
        recyclerView.setAdapter(adapterHourly);
    }
}
