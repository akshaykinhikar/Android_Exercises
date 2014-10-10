package com.example.listview_with_image_detail;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView list;
	int image[] = {R.drawable.image1};
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    Resources res=getResources();
    String[] name = res.getStringArray(R.array.Names);
    String[] Surname = res.getStringArray(R.array.Surname);
    
    list =findViewById(R.id.)
    
    }


   
    
}
