package com.example.kylebolam.bolamkylewk3.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kylebolam.bolamkylewk3.R;

/**
 * Created by kylebolam on 1/25/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private final LayoutInflater mInflater;
    private Context mContext;



    public ListViewAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        TextView view = new TextView(mContext);
//        view.setText(String.valueOf(position));
//        return view;

        View rowView = mInflater.inflate(R.layout.list_item, parent, false);
        TextView textView = (TextView)rowView.findViewById(R.id.list_view_tv);
        textView.setText(String.valueOf(position));
        return rowView;

    }
}
