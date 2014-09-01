package com.example.tworeplacablefragmentsjava_4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
    FragmentManager fm = getSupportFragmentManager();
    
    Fragment one = new FirstFragment();
    Fragment two = new SecongFragment();
    
    FragmentTransaction ft = fm.beginTransaction();
    
    ft.add(R.id.firstHolder,one);	// firstFragment is added
    ft.add(R.id.secondHolder, two);	// Second Fragment is added
    //ft.replace(R.id.firstHolder, two); //Replace First Fragment
    ft.commit();
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
