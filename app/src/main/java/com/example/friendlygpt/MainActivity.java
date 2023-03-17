package com.example.friendlygpt;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView welcomeTextView;
    EditText messageEditText;
    ImageButton sendButton;
    List<Message> messageList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageList = new ArrayList<>();


        recyclerView= findViewById(R.id.recyclerView);
        welcomeTextView = findViewById(R.id.txtWelcome);
        messageEditText = findViewById(R.id.etMessage);
        sendButton = findViewById(R.id.btnSend);

        sendButton.setOnClickListener((v)->{
            String question = messageEditText.getText().toString().trim();

        });

    }
}
