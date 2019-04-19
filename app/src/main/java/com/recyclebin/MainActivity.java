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
        contactsList.add(new Contacts("saugat Malla","9860345213",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan","9860345217",R.drawable.bhuwan));
        contactsList.add(new Contacts("Rajesh","9860345567",R.drawable.rajesh));
        contactsList.add(new Contacts("Dahayang","98012342123",R.drawable.dahayang));
        contactsList.add(new Contacts("Dwayne","98012342112",R.drawable.dwayne));
        contactsList.add(new Contacts("Johnny","9860321987",R.drawable.johnny));
        contactsList.add(new Contacts("Grant","9868761987",R.drawable.grant));
        contactsList.add(new Contacts("Robert","9841433451",R.drawable.robert));
        contactsList.add(new Contacts("stephen","9860344871",R.drawable.stephen));
        contactsList.add(new Contacts("Jacky","9841561234",R.drawable.jacky));
        contactsList.add(new Contacts("Anmol KC","9845123456",R.drawable.anmol));

        //pass this list to adapter

        ContactAdapter contactAdapter = new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager( this, 2));
    }
}
