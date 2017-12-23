package com.example.android.miwok;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        MiwokFragmentPagerAdapter miwokFragmentPagerAdapter = new MiwokFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(miwokFragmentPagerAdapter);
    }
}