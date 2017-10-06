package com.example.ducng.mvp_rx_di.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ducng.mvp_rx_di.R;
import com.example.ducng.mvp_rx_di.model.DataItemList;
import com.example.ducng.mvp_rx_di.model.ListResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ducng on 10/6/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context mContext;
    private List<DataItemList> listResponses = new ArrayList<>();


    public MainAdapter(Context context, List<DataItemList> list) {
        mContext = context;
        listResponses = list;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_image, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        holder.tvCity.setText(listResponses.get(position).getName());
        holder.tvDesc.setText(listResponses.get(position).getDescription());
        Glide.with(mContext)
                .load(listResponses.get(position).getBackground())
                .into(holder.background);

    }

    @Override
    public int getItemCount() {
        return listResponses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCity, tvDesc;
        ImageView background;

        public ViewHolder(View itemView) {
            super(itemView);

            tvCity = (TextView) itemView.findViewById(R.id.city);
            tvDesc = (TextView) itemView.findViewById(R.id.hotel);
            background = (ImageView) itemView.findViewById(R.id.image);


        }
    }
}
