package com.example.fragmentsession;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
String[] data;
private final Context main2Activity;

   public MyAdapter(String[] data, Context main2Activity){
       this.data=data;
       this.main2Activity = main2Activity;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(main2Activity);
        View view=layoutInflater.inflate(R.layout.colorexample,parent,false);
        return new MyViewHolder(view);//returns view
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       //String pos=data[position];
        ((TextView) holder.view.findViewById(R.id.text)).setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;//so that jitne length ho array ki utne views get created
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
       public View view;


        public MyViewHolder(View view) {
            super(view);
            this.view=view;
        }
    }
}

