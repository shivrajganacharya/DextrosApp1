package com.example.sidsa.quiz;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Instructions extends Fragment  implements inter1{

    ProgressBar mprogressBar;
    public int counter;
    int counter2 = 60, counter1=59;
    TextView tv;
    Button btnTimmer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    private Button b1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_instructions, container, false);
        b1= (Button) view.findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i=0;i<5;i++)
                {
                    a[i]=0;
                }
                Initialfrag fragment = new Initialfrag();

                FragmentManager fragmentManager = getFragmentManager();

                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

                b1.setVisibility(view.INVISIBLE);
            }
        });
        return view;
    }
}
