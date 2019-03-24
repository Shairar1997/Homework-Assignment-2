package com.example.homeworkassignment2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.BeerViewHolder> {
    private ArrayList<ClassSchedule> mClass;
    private RecyclerViewClickListener mListener;

    public ClassAdapter(ArrayList<ClassSchedule> class1, RecyclerViewClickListener listener) {
        mClass = class1;
        mListener = listener;
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public static class BeerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView weekNo, activity1, activity2;
        private RecyclerViewClickListener mListener;

        public BeerViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            weekNo = v.findViewById(R.id.WeekName);
            activity1 = v.findViewById(R.id.Description);
            activity2 = v.findViewById(R.id.Description1);

        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }

    @Override
    public ClassAdapter.BeerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.class_schedule_list_row, parent, false);
        return new BeerViewHolder(v, mListener);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(BeerViewHolder holder, int position) {
        ClassSchedule class1 = mClass.get(position);
        holder.weekNo.setText(class1.getWeekNo());
        holder.activity1.setText(class1.getActivity1());
        holder.activity2.setText(class1.getActivity2());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mClass.size();
    }

}
