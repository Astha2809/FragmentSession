package com.example.fragmentsession;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] ar=new String[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Main2Activity.this,FragmentColorsName.class);
                startActivity(it);
;
            }
        });
       // initUi();
    }
//    private void initUi(){
//
//       // adapter=new com.example.fragmentsession.MyAdapter(ar,this.getBaseContext());
//       // adapter=new com.example.fragmentsession.MyAdapter(this,ar);
//       // recyclerView.setAdapter(adapter);
//
//        ar[0] = "red";
//        ar[1] = "orange";
//        ar[2] = "yellow";
//        ar[3] = "blue";
//        ar[4] = "green";
//        ar[5] = "grey";
//        ar[6] = "white";
//        ar[7] = "peach";
//        ar[8] = "brown";
//        ar[9] = "purple";
//        recyclerView=findViewById(R.id.recycler_main2);
//        recyclerView.setHasFixedSize(true);
//        layoutManager=new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter=new MyAdapter(ar,this);
//        recyclerView.setAdapter(adapter);
//
//
//
//    }

}
