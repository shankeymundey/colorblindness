package com.example.shankey.colourblindness;

import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Start extends AppCompatActivity {
       public  static android.support.v4.app.FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
       fragmentManager=getSupportFragmentManager();
        if(findViewById(R.id.fragment_container)!=null){

            if(savedInstanceState!=null){
                return;
            }

            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            Plateone p1=new Plateone();
            fragmentTransaction.add(R.id.fragment_container,p1,null);
            fragmentTransaction.commit();

        }





    }
}
