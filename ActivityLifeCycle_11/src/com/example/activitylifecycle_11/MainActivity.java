package com.example.activitylifecycle_11;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("TAG", "onCreate is called");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("TAG", "onStart is called");
	}

	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d("TAG", "onResume is called");
	}

	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d("TAG", "onResume is called");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("TAG", "onStop is called");
	}

	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("TAG", "onDestroy is called");
	}
	

}
