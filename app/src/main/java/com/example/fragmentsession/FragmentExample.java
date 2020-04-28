package com.example.fragmentsession;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentExample extends Fragment {

    private static final String TAG ="myfrag";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG,"oncreateview");

        return inflater.inflate(R.layout.example_fragment,container,false);


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG,"oncreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        Log.e(TAG,"onAttach");
        super.onAttach(context);
    }

    @Override
    public void onPause() {
        Log.e(TAG,"onpause");
        super.onPause();
    }

    @Override
    public void onStart() {
        Log.e(TAG,"onstart");
        super.onStart();
    }

    @Override
    public void onStop() {
        Log.e(TAG,"onstop");
        super.onStop();
    }

    @Override
    public void onResume() {
        Log.e(TAG,"oncresume");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG,"ondestroy");
        super.onDestroy();
    }


}



