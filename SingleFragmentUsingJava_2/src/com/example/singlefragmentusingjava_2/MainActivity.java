package com.example.singlefragmentusingjava_2;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity //Changed from activity to FragmentActivity
{

	//getSupportFragmentManager() for v4
	FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     // Create new fragment and transaction
        Fragment first = new FirstFragment(); //get FirstFragment in first
        FragmentTransaction ft = fm.beginTransaction(); //begin Transaction
        ft.add(R.id.fragmentHolder, first); //add fragment "first" in activity main
        ft.commit(); //commit transaction
       
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
