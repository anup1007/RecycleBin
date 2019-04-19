package com.recyclebin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Create a list of Contact
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("saugat Malla","9860345213","bakhu","ahsajdha@gmail.com",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan","9860345217","bakhu","ahsajdha@gmail.com",R.drawable.bhuwan));
        contactsList.add(new Contacts("Rajesh","9860345567","bakhu","ahsajdha@gmail.com",R.drawable.rajesh));
        contactsList.add(new Contacts("Dahayang","98012342123","bakhu","ahsajdha@gmail.com",R.drawable.dahayang));
        contactsList.add(new Contacts("Dwayne","98012342112","bakhu","ahsajdha@gmail.com",R.drawable.dwayne));
        contactsList.add(new Contacts("Johnny","9860321987","bakhu","ahsajdha@gmail.com",R.drawable.johnny));
        contactsList.add(new Contacts("Grant","9868761987","bakhu","ahsajdha@gmail.com",R.drawable.grant));
        contactsList.add(new Contacts("Robert","9841433451","bakhu","ahsajdha@gmail.com",R.drawable.robert));
        contactsList.add(new Contacts("stephen","9860344871","bakhu","ahsajdha@gmail.com",R.drawable.stephen));
        contactsList.add(new Contacts("Jacky","9841561234","bakhu","ahsajdha@gmail.com",R.drawable.jacky));
        contactsList.add(new Contacts("Anmol KC","9845123456","bakhu","ahsajdha@gmail.com",R.drawable.anmol));

        //pass this list to adapter

        ContactAdapter contactAdapter = new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager( this, 2));
    }
}
