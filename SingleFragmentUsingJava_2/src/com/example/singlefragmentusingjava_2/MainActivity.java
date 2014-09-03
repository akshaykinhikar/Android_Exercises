package com.example.singlefragmentusingjava_2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity //Changed from activity to FragmentActivity
{

	//getSupportFragmentManager() for v4
	FragmentManager fm = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     // Create new fragment and transaction
        FirstFragment first = new FirstFragment(); //get FirstFragment in first
        FragmentTransaction ft = fm.beginTransaction(); //begin Transaction
        ft.add(R.id.fragmentHolder, first); //add fragment "first" in activity main
        ft.commit(); //commit transaction
       
    }
}
