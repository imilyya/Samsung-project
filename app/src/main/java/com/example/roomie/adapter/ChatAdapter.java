package com.example.roomie.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomie.R;
import com.example.roomie.databinding.ChatItemBinding;
import com.example.roomie.item.ChatItem;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder>{
    private List<ChatItem> chatList = new ArrayList<>();

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View newView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,
                parent, false);
        return new ChatViewHolder(newView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ChatViewHolder holder, int position) {
        holder.bind(chatList.get(position));
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder{
        private ChatItemBinding chatItemBinding;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            chatItemBinding = ChatItemBinding.bind(itemView);
        }

        public void bind(ChatItem chatItem){
            chatItemBinding.name.setText(chatItem.getName());
            chatItemBinding.profilePhoto.setImageResource(R.drawable.img);
        }
    }

    public void Add(ChatItem chatItem){
        chatList.add(chatItem);
    }

    public void Clear(){
        chatList.clear();
        notifyDataSetChanged();
    }
}
