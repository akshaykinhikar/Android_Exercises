package com.example.twofragmentsinteraction_5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends FragmentActivity implements OnClickListener {
	 FragmentManager fm =getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
       
        Fragment one = new FirstFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.FragmentHolder,one);
        ft.commit();
       
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    //method for loading second fragment
    public void go(){	
    	
    	Fragment second = new SecondFragment();
    	FragmentTransaction ft = fm.beginTransaction();
    	ft.replace(R.id.FragmentHolder, second);
    	ft.commit();
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}


	
}

