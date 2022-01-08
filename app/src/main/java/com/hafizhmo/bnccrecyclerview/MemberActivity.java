package com.hafizhmo.bnccrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MemberActivity extends AppCompatActivity {

    private ArrayList<MemberModel> members;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        RecyclerView recyclerView = findViewById(R.id.member_recycler);

        MemberAdapter adapter = new MemberAdapter(this, members);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        members = new ArrayList<>();
        members.add(new MemberModel("Harry Potter", R.drawable.harry));
        members.add(new MemberModel("Hermione Granger", R.drawable.hermione));
        members.add(new MemberModel("Ronald Weasley", R.drawable.ron));
        members.add(new MemberModel("Cho Chang", R.drawable.cho));
        members.add(new MemberModel("Cedric Diggory", R.drawable.cedric));
        members.add(new MemberModel("Rubeus Hagrid", R.drawable.hagrid));
        members.add(new MemberModel("Minerva McGonagall", R.drawable.mcgonagall));
    }
}