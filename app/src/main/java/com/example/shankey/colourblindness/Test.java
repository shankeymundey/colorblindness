package com.example.shankey.colourblindness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test extends AppCompatActivity {
  Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        bt=(Button)findViewById(R.id.bt);
    }







    public void btclick(View view) {

        Intent intent=new Intent(this,Start.class);
        startActivity(intent);


    }
}
