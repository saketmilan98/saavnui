package com.absolutio.saavnuiasgn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    List<FeatArtGetSet> listtrend;
    List<FeatArtGetSet> listrecommend;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        listtrend = new ArrayList<>();
        listtrend.add(new FeatArtGetSet("Aankh Marey","Hindi",R.drawable.tankhmare));
        listtrend.add(new FeatArtGetSet("Chehre","Hindi",R.drawable.tchehre));
        listtrend.add(new FeatArtGetSet("Drishtikone","Anupam Roy",R.drawable.tdristikone));
        listtrend.add(new FeatArtGetSet("Nira Patola","Hindi",R.drawable.tnirapatola));
        listtrend.add(new FeatArtGetSet("Tere Bin","Hindi",R.drawable.tterebin));
        listtrend.add(new FeatArtGetSet("Weekly top 15","Saavn",R.drawable.tweektop15));

        RecyclerView rvtrend = (RecyclerView)rootView.findViewById(R.id.recyclerviewtrend);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getActivity(),listtrend);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        rvtrend.setLayoutManager(layoutManager);
        //rv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvtrend.setAdapter(myAdapter);




        listrecommend = new ArrayList<>();
        listrecommend.add(new FeatArtGetSet("Chogada","Loveyatri",R.drawable.rdailymix));
        listrecommend.add(new FeatArtGetSet("Ankh Lad Jaave","Loveyatri",R.drawable.rmytopsongs));
        listrecommend.add(new FeatArtGetSet("Proper Patola","Namaste England",R.drawable.rnamasteeng));
        listrecommend.add(new FeatArtGetSet("Palak Muchhal","Singles",R.drawable.rpalakmuchhal));
        listrecommend.add(new FeatArtGetSet("Urvashi","Urvashi",R.drawable.rmixurvashi));
        listrecommend.add(new FeatArtGetSet("Unplugged","Saavn",R.drawable.runplugged));

        RecyclerView rvrecommend = (RecyclerView)rootView.findViewById(R.id.recyclerviewrecommend);
        RecyclerViewAdapter myAdapterr = new RecyclerViewAdapter(getActivity(),listrecommend);
        LinearLayoutManager layoutManagerr = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        rvrecommend.setLayoutManager(layoutManagerr);
        //rv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvrecommend.setAdapter(myAdapterr);






        return rootView;
    }
}