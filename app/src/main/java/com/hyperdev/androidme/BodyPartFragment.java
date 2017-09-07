package com.hyperdev.androidme;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hyperdev.androidme.data.AndroidImageAssets;

import static com.hyperdev.androidme.R.id.Body;

/**
 * A simple {@link Fragment} subclass.
 */
public class BodyPartFragment extends Fragment {

    private View head;
    private View body;
    private View leg;
    AndroidImageAssets images = new AndroidImageAssets();

    public BodyPartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_body_part, container, false);
        head = view.findViewById(R.id.Head);
        body = view.findViewById(Body);
        leg = view.findViewById(R.id.Legs);

        return view;
    }

    public void changeHead(int pic){
        images.getHeads();
    }

    public void changeBody(int pic){
        images.getBodies();
    }

    public void changeLeg(int pic){
        images.getLegs();
    }




}
