package com.example.listview_01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity implements OnItemClickListener {
	ListView l;
	String[] Languages={"C","Java","Python"}; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        l= (ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Languages);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> adapterview, View view,int i, long l) {
		TextView temp= (TextView) view;
		Toast.makeText(this,temp.getText()+"" +i,Toast.LENGTH_LONG).show();
	}

    
}
