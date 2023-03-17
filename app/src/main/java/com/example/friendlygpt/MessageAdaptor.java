package com.example.friendlygpt;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessageAdaptor {

    public class MyViewHolder extends RecyclerView.ViewHolder{
    LinearLayout loutLeftChat, loutRigthChat;
    TextView leftTextView, rightTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            loutLeftChat = itemView.findViewById(R.id.loutLeftChat);
        }
    }

}
