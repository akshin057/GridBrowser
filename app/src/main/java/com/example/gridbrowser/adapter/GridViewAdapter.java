package com.example.gridbrowser.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gridbrowser.R;
import com.example.gridbrowser.models.Link;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    private final List<Link> list;
    private final Context context;
    private LayoutInflater layoutInflater;
    private TextView itemTV;
    private ImageView itemIV;

    public GridViewAdapter(List<Link> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (layoutInflater == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.gridview_item, null);
        }

        itemIV = convertView.findViewById(R.id.itemIV);
        itemTV = convertView.findViewById(R.id.itemTV);

        itemIV.setImageResource(list.get(position).getImage());
        itemTV.setText(list.get(position).getName());

        return convertView;
    }
}
