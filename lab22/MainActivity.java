package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("mylog", "onCreate");

        fragmentManager = getSupportFragmentManager();

        if(savedInstanceState == null){
            fragmentManager.beginTransaction().replace(R.id.container,
                    BlankFragment.newInstance(null, null), "myfragment").commit();

        }else{
            if(fragmentManager.findFragmentByTag("myfragment")== null){
                fragmentManager.beginTransaction().replace(R.id.container,
                        BlankFragment.newInstance(null, null), "myfragment").commit();
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mylog", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mylog", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mylog", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mylog", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mylog", "onDestroy");
    }

    public void changeMode(View view) {
        Log.i("mylog","changeMode");

        if(fragmentManager.findFragmentByTag("myfragment")== null){
            fragmentManager.beginTransaction().replace(R.id.container,
                    BlankFragment.newInstance(null, null), "myfragment").commit();
        }else{
            fragmentManager.beginTransaction().replace(R.id.container,
                    BlankFragment2.newInstance(null, null), "myfragment2").commit();
        }

    }
}