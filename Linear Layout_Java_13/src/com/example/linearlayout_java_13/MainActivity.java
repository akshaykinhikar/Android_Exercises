package com.example.linearlayout_java_13;

import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		View parentLayout = new RelativeLayout(this);
	    parentLayout.setBackgroundColor(Color.WHITE);
	    android.widget.RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	    parentLayout.setLayoutParams(params);
	    ViewGroup sv = null;
		sv.addView(parentLayout);
		
		//setContentView(R.layout.activity_main);
	
	
	
	}

	
}
