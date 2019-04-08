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
public class Sixteen extends Fragment {
    Button nextbtn;
    ImageView i1;
    TextView t1;
    int s=0;
    FragmentTransaction fragmentTransaction;

    public Sixteen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sixteen, container, false);
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

                fragmentTransaction= Start.fragmentManager.beginTransaction().replace(R.id.fragment_container,new Seventeen(),null);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);

                fragmentTransaction.commit();
            }
        });


        return view;
    }

    public void answer(){

        i1.setImageResource(R.drawable.sixteena);
        t1.setText("“26”\tThose with normal color vision should see a 26.\n" +
                "6, faint 2\tRed color blind (protanopia) people will see a 6, mild red color blind people (prontanomaly) will also faintly see a number 2.\n" +
                "2, faint 6\tGreen color blind (deuteranopia) people will see a 2, mild green color blind people (deuteranomaly) may also faintly see a number 6.  ");
        s=1;
    }
    public void question(){


        i1.setImageResource(R.drawable.sixteen);
        t1.setText("  ");
        s=0;
    }

}
