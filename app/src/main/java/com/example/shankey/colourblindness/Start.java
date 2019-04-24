package com.example.shankey.colourblindness;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
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
    @Override
    public  void onBackPressed(){
        AlertDialog.Builder ob=new AlertDialog.Builder(this);
        ob.setTitle("do you want to exit the test");
        ob.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                 Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                  startActivity(intent);

            }

        });
        ob.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        ob.create();
        ob.show();




    }
}
