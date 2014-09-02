package com.example.fragment_lifecycle_7;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.util.Log;
import android.view.Menu;


public class MainActivity extends FragmentActivity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Log.i("TAG", "MainActivity onCreate() was called");
		FragmentManager fm = getSupportFragmentManager();
		Fragment life = new LifeCycleFragment();
		FragmentTransaction ft = fm.beginTransaction();
		ft.add(R.id.fragmentHolder, life);
		ft.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
