package com.example.customgridview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
public class MainActivity extends Activity {
	GridView grid;
	String[] Images = {
			"Img1",
			"Img2",
			"Img3",
			"Img4"
	
	} ;
	int[] imageId = {
			R.drawable.image1,
			R.drawable.image2,
			R.drawable.image3,
			R.drawable.image4
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CustomGrid adapter = new CustomGrid(MainActivity.this, Images, imageId);
		grid=(GridView)findViewById(R.id.grid);
		grid.setAdapter(adapter);
		grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MainActivity.this, "You Clicked at " +Images[+ position], Toast.LENGTH_SHORT).show();
			}
		});
	}
}



