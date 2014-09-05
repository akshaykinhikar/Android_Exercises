package com.example.landscape_portrait_12;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getResources().getConfiguration().orientation ==
				Configuration.ORIENTATION_PORTRAIT) {
			setContentView(R.layout.activity_portrait);
			Toast.makeText(this, "Welcome to Portrait", Toast.LENGTH_LONG).show();
		} else {
			setContentView(R.layout.activity_landscape);
			
			Toast.makeText(this, "Welcome to LandScape", Toast.LENGTH_LONG).show();
		}

	}
}