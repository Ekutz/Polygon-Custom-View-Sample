package com.ekutz.android.polygoncustomview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jsPark on 2018. 5. 22..
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    Context context;
    List<TwoStrings> data;

    public CustomAdapter(Context context, List<TwoStrings> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);

        CustomViewHolder holder = new CustomViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.index.setText(data.get(position).getIndex());
        holder.describer.setText(data.get(position).getDescriber());

        if(position==0 || position==data.size()-1){
            holder.index.setVisibility(View.INVISIBLE);
            holder.describer.setVisibility(View.INVISIBLE);
        } else {
            holder.index.setVisibility(View.VISIBLE);
            holder.describer.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView index, describer;

        public CustomViewHolder(View itemView) {
            super(itemView);
            index = (TextView)itemView.findViewById(R.id.item_index);
            describer = (TextView)itemView.findViewById(R.id.item_describer);
        }
    }
}
