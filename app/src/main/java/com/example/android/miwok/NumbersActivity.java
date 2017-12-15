package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Find the root view so we can add child views to it
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //Initialize an Arraylist
        ArrayList<String> words = new ArrayList<String>();

        //Populating the Arraylist
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //for loop making the same task adding view to the rootview
        for(int count = 0;count<words.size();count++){

            // Create a new TextView
            TextView wordView = new TextView(this);

             // Set the text to be word at the current index
             wordView.setText(words.get(count));

            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordView);

        }

    }
}
