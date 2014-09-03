package com.example.onclick_xml_8_v1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	Button click;											//click button 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	
	click = (Button) findViewById(R.id.button1);  //definition for button
	click.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		Log.d("My Tag", "In onClick"); //Log
		Toast.makeText(this, "Button Pressed", Toast.LENGTH_LONG).show(); //Toast Messsage
		
	}

}
