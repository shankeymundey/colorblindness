package com.example.shankey.colourblindness;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Twenty extends Fragment {

    Button nextbtn;
    ImageView i1;
    TextView t1;
    int s=0;
    FragmentTransaction fragmentTransaction;

    public Twenty() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_twenty, container, false);
        i1=view.findViewById(R.id.i1);
        nextbtn=view.findViewById(R.id.nextbtn);
        t1=view.findViewById(R.id.t1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (s){
                    case 0:answer(); break;
                    case 1:question();

                }


            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction= Start.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Twentyone(),null);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);

                fragmentTransaction.commit();
            }
        });


        return view;
    }

    public void answer(){

        i1.setImageResource(R.drawable.twentya);
        t1.setText("Those with normal color vision should be able to trace a green wiggly line.\n" +
                "Most people with any form of color blindness will be unable to trace the correct line  ");
        s=1;
    }
    public void question(){


        i1.setImageResource(R.drawable.twenty);
        t1.setText("  ");
        s=0;
    }



}
