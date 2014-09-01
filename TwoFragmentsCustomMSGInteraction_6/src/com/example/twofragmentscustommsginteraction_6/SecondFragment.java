package com.example.twofragmentscustommsginteraction_6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
@SuppressLint("ValidFragment") public class SecondFragment extends Fragment {
 String ms;
	public SecondFragment() {

	
	}

	public SecondFragment(String sa) {
		ms = sa;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		  
		View v= inflater.inflate(R.layout.fragment_second, container, false);
	
		TextView tv2= (TextView)v.findViewById(R.id.tv2); 
		tv2.setText(ms);
	//	String strtext = getArguments().getString("sa"); 
		return v;
	}

}
