package com.example.putextraintent;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        displayIntentData();
        
        findViewById(R.id.sendButton).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SecondActivity.this,MainActivity.class);
				intent.putExtra("key",((EditText)findViewById(R.id.dataToSend)).getText().toString());
				startActivity(intent);
				//notice we dont call finish() here
			}
		});
    }
    @Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		setIntent(intent);//must store the new intent unless getIntent() will return the old one
		displayIntentData();
    }
    
    private void displayIntentData(){
    	Intent intent = getIntent();
    	TextView tv = (TextView)findViewById(R.id.intentData);
    	Bundle extras=intent.getExtras();
    	if(extras!=null){
    		tv.setText("Data received: "+extras.getString("key"));
    	}else{
    		tv.setText("No extradata received");
    	}
    }
}
