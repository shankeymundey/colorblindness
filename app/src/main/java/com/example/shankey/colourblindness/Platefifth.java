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
public class Platefifth extends Fragment {
    Button nextbtn;
    ImageView i1;
    TextView t1;
    int s=0;
    FragmentTransaction fragmentTransaction;

    public Platefifth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_platefifth, container, false);
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

                fragmentTransaction= Start.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Sixth(),null);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);

                fragmentTransaction.commit();
            }
        });


        return view;

    }
    public void answer(){

        i1.setImageResource(R.drawable.fivea);
        t1.setText("“3”\tThose with normal color vision see a 3.\n" +
                "“5”\tThose with red green color blindness see a 5.\n" +
                "Nothing\tThose with total color blindness see nothing. ");
        s=1;
    }
    public void question(){


        i1.setImageResource(R.drawable.pltfive);
        t1.setText("  ");
        s=0;
    }


}
