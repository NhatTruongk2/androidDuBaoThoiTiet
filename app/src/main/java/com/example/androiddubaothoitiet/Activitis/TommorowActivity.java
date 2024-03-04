package com.example.androiddubaothoitiet.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddubaothoitiet.Domain.TommorowDomain;
import com.example.androiddubaothoitiet.R;

import java.util.ArrayList;

public class TommorowActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterTommorow;
private RecyclerView recyclerView;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tommorow);

    initRecyclerview();
    setVariable();
    }

    private void setVariable() {
       ConstraintLayout backBtn=findViewById(R.id.back_btn);
backBtn.setOnClickListener(v -> startActivity(new Intent(TommorowActivity.this,MainActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<TommorowDomain> items=new ArrayList<>();

        items.add(new TommorowDomain("Sat","Storm","storm",25,10));
        items.add(new TommorowDomain("Sun","Storm","storm",25,10));
        items.add(new TommorowDomain("Mon","Storm","storm",25,10));
        items.add(new TommorowDomain("Tue","Storm","storm",25,10));
        items.add(new TommorowDomain("Wen","Storm","storm",25,10));
        items.add(new TommorowDomain("Thu","Storm","storm",25,10));

        recyclerView=findViewById(R.id.view2);
        recyclerView.setAdapter(adapterTommorow);

    }
}
