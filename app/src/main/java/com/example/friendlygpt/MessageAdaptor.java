package com.example.friendlygpt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdaptor extends RecyclerView.Adapter<MessageAdaptor.MyViewHolder>{
    List<Message> messageList;
    public MessageAdaptor(List<Message> messageList) {
        this.messageList=messageList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View chatView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,null);
        MyViewHolder myViewHolder = new MyViewHolder(chatView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Message message = messageList.get(position);
        if (message.getSentBy().equals(Message.SENT_BY_ME)){
            holder.loutLeftChat.setVisibility(View.GONE);
            holder.loutRigthChat.setVisibility(View.VISIBLE);
            holder.rightTextView.setText(message.getMessage());
        }else{
            holder.loutRigthChat.setVisibility(View.GONE);
            holder.loutLeftChat.setVisibility(View.VISIBLE);
            holder.leftTextView.setText(message.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
    LinearLayout loutLeftChat, loutRigthChat;
    TextView leftTextView, rightTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            loutLeftChat = itemView.findViewById(R.id.loutLeftChat);
            loutRigthChat = itemView.findViewById(R.id.loutRightChat);
            leftTextView = itemView.findViewById(R.id.tvLeftChat);
            rightTextView = itemView.findViewById(R.id.tvRightChat);

        }
    }

}
