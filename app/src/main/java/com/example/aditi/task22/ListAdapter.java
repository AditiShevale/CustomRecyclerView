package com.example.aditi.task22;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aditi on 30/3/18.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    List<Details>mDetails;
    public ListAdapter(List<Details> details){
        mDetails=details;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list,parent,false);
        return  new MyViewHolder(itemview);
    }
/*, recyclerView, new RecyclerTouchListener.ClickListener()*/
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Details details= mDetails.get(position);
        holder.txtname.setText(details.getName());
    }

    @Override
    public int getItemCount() {
        return mDetails.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView txtname;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.textView);
        }
}
}
