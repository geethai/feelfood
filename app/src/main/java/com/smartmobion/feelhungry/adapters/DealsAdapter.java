package com.smartmobion.feelhungry.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.smartmobion.feelhungry.R;

public class DealsAdapter extends BaseAdapter{
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public DealsAdapter(Context mainActivity, int[] dealsImages) {
        // TODO Auto-generated constructor stub
        context=mainActivity;
        imageId=dealsImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return imageId.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.cardview_deals_layout, null);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+imageId[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}