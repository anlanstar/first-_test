package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.logging.Handler;

public class listAdapter extends BaseAdapter {
    Context context;
    List<Test> list;
    LayoutInflater inflater;
    public listAdapter() {
    }

    public listAdapter(Context context, List<Test> list) {
        this.context = context;
        inflater= LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.i("TAG", "context: "+context);
        View inflate = inflater.inflate(R.layout.listvew_holder, viewGroup,false);
        View v=LayoutInflater.from(context).inflate(R.layout.listvew_holder,viewGroup,false);
        Log.i("TAG", "getView: "+inflate);
        MyHolder myHolder = new MyHolder();
        myHolder.textView =v.findViewById(R.id.tv);
        myHolder.imageView = v.findViewById(R.id.iv);
        myHolder.textView.setText(list.get(i).string);
        myHolder.imageView.setImageResource(list.get(i).i);
        return v;
    }

    static class MyHolder {
        TextView textView;
        ImageView imageView;

        public MyHolder() {

        }
    }
}
