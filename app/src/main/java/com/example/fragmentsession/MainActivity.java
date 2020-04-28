package com.example.fragmentsession;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="myActivity";
    Fragment2 fragment2=new Fragment2();
    FragmentExample fragmentExample=new FragmentExample();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

TextView fram1text=findViewById(R.id.frag1text);
TextView fram2text=findViewById(R.id.fragtext);






    }

    @Override
    protected void onDestroy() {
        Log.e(TAG,"ondestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.e(TAG,"onresume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.e(TAG,"onstop");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.e(TAG,"onstart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG,"onrestart");
        super.onRestart();
    }


    public void frag1(View view){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        FragmentExample fragmentExample=new FragmentExample();
        fragmentTransaction.add(R.id.frame,fragmentExample);
        fragmentTransaction.commit();
        Toast.makeText(MainActivity.this,"b1",Toast.LENGTH_SHORT).show();

    }
   public void frag2(View view){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragment2 fragment2=new Fragment2();
        fragmentTransaction.replace(R.id.frame,fragment2);
        fragmentTransaction.commit();
       Toast.makeText(MainActivity.this,"b2",Toast.LENGTH_SHORT).show();

   }
   public void frag3(View view){
        //FragmentManager fragmentManager=getSupportFragmentManager().findFragmentById(R.id.fragment1);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

       //List<String> aa = new ArrayList<String>();
        if(fragmentExample.isAdded()) {
            fragmentTransaction.hide(fragmentExample);
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.hide(fragment2);
            fragmentTransaction.commit();
        }
        //fragmentManager.findFragmentById(R.id.fragment1);

        //Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();



   }


    public void frag4(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(fragmentExample.isAdded()){
            fragmentTransaction.show(fragmentExample);
            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.show(fragment2);
            fragmentTransaction.commit();
        }

    }

    public void frag5(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(fragmentExample.isAdded()){
            fragmentTransaction.remove(fragmentExample);
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.remove(fragment2);
            fragmentTransaction.commit();
        }

    }

    public void newActivity(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
