package com.example.linearlayout_java_13;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
      
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        
        
        TextView tv = new TextView(this);
        tv.setText("Dynamic Linear Layouts");
        tv.setTextColor(Color.parseColor("#0000cc"));
        tv.setBackgroundColor(Color.parseColor("#FFFFFF"));
        ll.addView(tv);
        this.setContentView(ll);
    }
}
