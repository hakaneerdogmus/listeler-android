package com.hakanerdogmus.listeler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("Emine");
        myMusicians.add("Hakan");
        myMusicians.add("Erdoğmuş");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));

        System.out.println(myMusicians.size());


        HashSet<String> mySet = new HashSet<String>();

        mySet.add("Bulut");
        mySet.add("Bulut");
        mySet.add("Erdoğmuş");

        System.out.println(mySet.size());

    


    }
}