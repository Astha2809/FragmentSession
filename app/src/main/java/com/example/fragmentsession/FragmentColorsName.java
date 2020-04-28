package com.example.fragmentsession;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentsession.FragmentActionListener;
import com.example.fragmentsession.MyAdapter;
import com.example.fragmentsession.R;

public class FragmentColorsName extends Fragment
{
    View rootView;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] ar=new String[10];
    FragmentActionListener fragmentActionListener;

    private final View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

           //Toast.makeText(com.example.fragmentsession.FragmentColorsName.this,"selected",Toast.LENGTH_LONG).show();
            //Toast.makeText(com.example.fragmentsession.FragmentColorsName.this,"selct",Toast.LENGTH_LONG).show();

        }

    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragmentcolornames,container,false);
        initUi();
        return rootView;
    }
    public void setFragmentActionListener(FragmentActionListener fragmentActionListener){
        this.fragmentActionListener=fragmentActionListener;

    }

    private void initUi(){
        ar[0] = "red";
        ar[1] = "orange";
        ar[2] = "yellow";
        ar[3] = "blue";
        ar[4] = "green";
        ar[5] = "grey";
        ar[6] = "white";
        ar[7] = "peach";
        ar[8] = "brown";
        ar[9] = "purple";
      Context context=getContext();
        recyclerView= recyclerView.findViewById(R.id.recycler_main2);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new MyAdapter(ar,context);
        recyclerView.setAdapter(adapter);


    }

}
