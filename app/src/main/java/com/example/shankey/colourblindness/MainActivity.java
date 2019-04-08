package com.example.shankey.colourblindness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
    }

    public void btn1(View view) {
        Intent intent=new Intent(this,Detail.class);
        startActivity(intent);

    }

    public void btn2(View view) {

        Intent intent=new Intent(this,Test.class);
        startActivity(intent);


    }
}
