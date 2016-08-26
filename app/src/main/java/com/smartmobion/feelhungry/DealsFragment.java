package com.smartmobion.feelhungry;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.smartmobion.feelhungry.adapters.DealsAdapter;

import java.util.ArrayList;


public class DealsFragment extends android.support.v4.app.Fragment {
    RecyclerView recyclerView;
    TypedArray navIcons;
    RecyclerView.Adapter recyclerViewAdapter;

    ListView lv;
    Context context;
    DealsAdapter arrayAdapter;
    //ArrayAdapter<Integer> arrayAdapter;
    ArrayList dealsList;
    public static int [] dealsImages={R.drawable.ccd,R.drawable.bbq,R.drawable.kfc,R.drawable.kj,R.drawable.etc,R.drawable.dominozz};



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.deals_layout, container, false);

        //Initialize Views
        lv  = (ListView)rootView.findViewById(R.id.listView);




        lv.setAdapter(new DealsAdapter(getContext(), dealsImages));

        /**
         *Here , pass the titles and icons array to the adapter .
         *Additionally , pass the context of 'this' activity .
         *So that , later we can use the fragmentManager of this activity to add/replace fragments.
         */


        return rootView;


    }
}
