package com.irvan.muhammad.work.goschooljakarta;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Irvan on 03/05/2017.
 */

public class customListAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList data;
    private static LayoutInflater inflater = null;
    public Resources res;
    DataSekolah tempValues = null;
    public customListAdapter(Activity a, ArrayList d, Resources resLocal) {
        activity = a;
        data = d;
        res = resLocal;
        inflater = ( LayoutInflater )activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public static class ViewHolder{
        public TextView itemNomor;
        public TextView itemNama;
        public TextView itemAlamat;
        public TextView itemTelepon;

    }

    @Override
    public int getCount() {
        if(data.size()<=0)
            return 1;
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        ViewHolder holder;
        if(convertView == null){
            vi = inflater.inflate(R.layout.list_sekolah, null);
            holder = new ViewHolder();
            holder.itemNomor = (TextView)vi.findViewById(R.id.textNomor);
            holder.itemNama = (TextView)vi.findViewById(R.id.textNama);
            holder.itemAlamat = (TextView)vi.findViewById(R.id.textAlamat);
            holder.itemTelepon = (TextView)vi.findViewById(R.id.textTelepon);
            vi.setTag(holder);
        }else
            holder=(ViewHolder)vi.getTag();
        if(data.size() <= 0){
            holder.itemNama.setText("-");
        }else{
            tempValues=null;
            tempValues = (DataSekolah) data.get(position);
            holder.itemNomor.setText(tempValues.getNomor());
            holder.itemNama.setText(tempValues.getNamaSekolah());
            holder.itemAlamat.setText(tempValues.getAlamat());
            holder.itemTelepon.setText(tempValues.getTelepon());
            //vi.setOnClickListener(new OnItemClickListener(position));
        }
        return vi;
    }
    private class OnItemClickListener implements View.OnClickListener {
        private int mPosition;
        OnItemClickListener(int position){
            mPosition = position;
        }

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            MainActivity sct = (MainActivity)activity;
            sct.onItemClick(mPosition);
        }
    }
}
