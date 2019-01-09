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

public class RadArtFragment extends Fragment {

    List<FeatArtGetSet> listfeat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_rad_artists, container, false);

        listfeat = new ArrayList<>();
        listfeat.add(new FeatArtGetSet("Arijit Singh","Hindi",R.drawable.arijit));
        listfeat.add(new FeatArtGetSet("Neha Kakkar","Hindi",R.drawable.neha));
        listfeat.add(new FeatArtGetSet("Atif Aslam","Hindi",R.drawable.atif));
        listfeat.add(new FeatArtGetSet("Madhuri Dixit","Hindi",R.drawable.madhuri));
        listfeat.add(new FeatArtGetSet("Nucleya","Hindi",R.drawable.nucleya));
        listfeat.add(new FeatArtGetSet("Kishore Kumar","Hindi",R.drawable.kishorekumar));

        RecyclerView rv = (RecyclerView)rootView.findViewById(R.id.recyclerviewart);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getActivity(),listfeat);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        //rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rv.setAdapter(myAdapter);


        return rootView;
    }
}
