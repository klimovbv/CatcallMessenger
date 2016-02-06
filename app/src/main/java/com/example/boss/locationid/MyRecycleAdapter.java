package com.example.boss.locationid;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.ViewHolder> {

    private ArrayList<String> dataForAdapter;

    public MyRecycleAdapter (ArrayList<String> dataForAdapter){
        this.dataForAdapter = dataForAdapter;
    }
    @Override
    public MyRecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyRecycleAdapter.ViewHolder holder, int position) {
        holder.txtViewTitle.setText(dataForAdapter.get(position));
    }

    @Override
    public int getItemCount() {
        return dataForAdapter.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public CardView cardView;
        public TextView txtViewTitle;
        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view;
            txtViewTitle = (TextView) view.findViewById(R.id.textView);
        }
    }

}
