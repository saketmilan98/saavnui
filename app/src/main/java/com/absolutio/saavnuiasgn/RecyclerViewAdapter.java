package com.absolutio.saavnuiasgn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContext;
    private List<FeatArtGetSet> mData;

    public RecyclerViewAdapter(Context mContext, List<FeatArtGetSet> mData){
        this.mContext=mContext;
        this.mData=mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.radio_card, viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.viewTitle.setText(mData.get(i).getTitle());
        myViewHolder.viewLang.setText(mData.get(i).getLang());
        myViewHolder.viewImage.setImageResource(mData.get(i).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView viewTitle;
        TextView viewLang;
        ImageView viewImage;
        public MyViewHolder(View itemView){
            super(itemView);

            viewTitle = (TextView) itemView.findViewById(R.id.textview1);
            viewLang = (TextView) itemView.findViewById(R.id.textview2);
            viewImage = (ImageView) itemView.findViewById(R.id.imageview1);


        }
    }

}
