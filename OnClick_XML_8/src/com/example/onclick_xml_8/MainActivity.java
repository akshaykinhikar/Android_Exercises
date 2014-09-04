package com.example.onclick_xml_8;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}



	/** Called when the user clicks the Send button */
	public void gotoNewActivity(View v){
		Intent intent = new Intent(this, NewActivity.class);
		startActivity(intent);
	}
	
	
}
