package com.example.database_sharedpreferences;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	public static final String PREFS_NAME = "MyFile";
	String FILENAME = "hello_file";
	String string = "hello world!";

	Button save;
	EditText name,password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
		SharedPreferences.Editor editor = settings.edit();

		save = (Button) findViewById(R.id.button_Save);
		name = (EditText) findViewById(R.id.usernameView);
		password = (EditText) findViewById(R.id.passwordView);


		save.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				FileOutputStream fos;
				try {
					fos = openFileOutput(PREFS_NAME, Context.MODE_PRIVATE);
					String uname = name.getText().toString() + " ";
					fos.write(uname.getBytes());
					fos.write(name.getText().toString().getBytes());
					fos.close();
					
					Toast.makeText(MainActivity.this, "User Name and Password Saved Sucessfully...", Toast.LENGTH_LONG).show();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}

		});



				editor.commit();
	}







	@Override
	protected void onStop(){
		super.onStop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
