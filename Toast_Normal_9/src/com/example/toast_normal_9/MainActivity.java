package com.example.toast_normal_9;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		btn = (Button)this.findViewById(R.id.btn_for_toast);
		btn.setOnClickListener(this);
		
	}
	
	public void myToast(){						//Custom Toast
		Context context = getApplicationContext();
		CharSequence text = "Button Pressed";
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}
	@Override
	public void onClick(View v) {
		myToast();							//call to Toast
		
	}

}
