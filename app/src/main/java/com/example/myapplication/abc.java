package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class abc extends ArrayAdapter<Test> {
    List<Test>list;
    int i;
    public abc(@NonNull Context context, int resource,List<Test>list) {
        super(context, resource);
        this.list=list;
        i=resource;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.listvew_holder,parent,false);
        MyHolder myHolder = new MyHolder();
        myHolder.textView =view.findViewById(R.id.tv);
        myHolder.imageView = view.findViewById(R.id.iv);
        myHolder.textView.setText(list.get(position).string);
        myHolder.imageView.setImageResource(list.get(position).i);
        Log.i("TAG", "getView: "+list.get(position).string);
        return view;
    }
    static class MyHolder {
        TextView textView;
        ImageView imageView;

        public MyHolder() {

        }
    }
}
