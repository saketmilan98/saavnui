package com.absolutio.saavnuiasgn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RadFeatFragment extends Fragment {

    List<FeatArtGetSet> listfeat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_rad_featured, container, false);

        listfeat = new ArrayList<>();
        listfeat.add(new FeatArtGetSet("Romance","Hindi",R.drawable.romance));
        listfeat.add(new FeatArtGetSet("Chill","Hindi",R.drawable.chill));
        listfeat.add(new FeatArtGetSet("Retro","Hindi",R.drawable.retro));
        listfeat.add(new FeatArtGetSet("Oldies","Hindi",R.drawable.oldies));
        listfeat.add(new FeatArtGetSet("Latest","Hindi",R.drawable.chill));
        listfeat.add(new FeatArtGetSet("Pop","Hindi",R.drawable.retro));

        RecyclerView rv = (RecyclerView)rootView.findViewById(R.id.recyclerviewfeat);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getActivity(),listfeat);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        //rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rv.setAdapter(myAdapter);
        return rootView;
    }
}
