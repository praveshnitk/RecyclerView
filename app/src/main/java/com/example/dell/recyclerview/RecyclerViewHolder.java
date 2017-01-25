package com.example.dell.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dell on 19-Feb-16.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1,tv2;
    ImageView imageView;
    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1=(TextView) itemView.findViewById(R.id.list_title);
        tv2=(TextView) itemView.findViewById(R.id.list_desc);
        imageView=(ImageView) itemView.findViewById(R.id.list_avatar);


    }
}
