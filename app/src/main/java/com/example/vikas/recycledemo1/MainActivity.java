package com.example.vikas.recycledemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Person P;
ArrayList<Person> al;
MyAdaptor myAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.re);


RecyclerView.LayoutManager rls=new GridLayoutManager(this,2);
      //  RecyclerView.LayoutManager rls=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
int img[]={R.drawable.vitamind,R.drawable.vitaminbb,R.drawable.vitamine, R.drawable.vitamind};
        recyclerView.setLayoutManager(rls);
        al=new ArrayList<>();
        for(int i=0;i<4;i++){
            P=new Person();
            P.setName("manish \n---------------");
            P.setDesc("I am Student");
            P.setImage(img[i]);
            al.add(P);
        }

        myAdaptor=new MyAdaptor(this,al);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(myAdaptor);
    }
}
