package com.example.roomie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.roomie.R;
import com.example.roomie.adapter.ChatAdapter;
import com.example.roomie.item.ChatItem;

public class ChatsFragment extends Fragment {
    ChatAdapter chatAdapter;

    public ChatsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_chats, container, false);

        RecyclerView rv_chats = root.findViewById(R.id.rv_chats);
        rv_chats.setLayoutManager(new LinearLayoutManager(getContext(),
                RecyclerView.VERTICAL, false));

        chatAdapter = new ChatAdapter();

        chatAdapter.Add(new ChatItem("Kristina Prozorova"));
        chatAdapter.Add(new ChatItem("Emil Ilyasov"));
        chatAdapter.Add(new ChatItem("Ilyas Ilyasov"));
        chatAdapter.Add(new ChatItem("Vlada Progulyaeva"));
        chatAdapter.Add(new ChatItem("Anonymous Anonymous"));
        chatAdapter.Add(new ChatItem("Vladimir Putin"));
        chatAdapter.Add(new ChatItem("Dmitry Medvedev"));
        chatAdapter.Add(new ChatItem("Kristina Prozorova"));
        chatAdapter.Add(new ChatItem("Emil Ilyasov"));
        chatAdapter.Add(new ChatItem("Ilyas Ilyasov"));
        chatAdapter.Add(new ChatItem("Vlada Progulyaeva"));
        chatAdapter.Add(new ChatItem("Anonymous Anonymous"));
        chatAdapter.Add(new ChatItem("Vladimir Putin"));
        chatAdapter.Add(new ChatItem("Dmitry Medvedev"));
        chatAdapter.Add(new ChatItem("Kristina Prozorova"));
        chatAdapter.Add(new ChatItem("Emil Ilyasov"));
        chatAdapter.Add(new ChatItem("Ilyas Ilyasov"));
        chatAdapter.Add(new ChatItem("Vlada Progulyaeva"));
        chatAdapter.Add(new ChatItem("Anonymous Anonymous"));
        chatAdapter.Add(new ChatItem("Vladimir Putin"));
        chatAdapter.Add(new ChatItem("Dmitry Medvedev"));

        rv_chats.setAdapter(chatAdapter);
        return root;
    }
}