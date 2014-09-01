package com.example.twofragmentscustommsginteraction_6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class FirstFragment extends Fragment {
	String ms;
	
	public FirstFragment() {
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		
		 
		View v= inflater.inflate(R.layout.fragment_first, container, false);
		
		Button go = (Button) v.findViewById(R.id.button1);
		 final EditText et =(EditText) v.findViewById(R.id.editText1);
		 
		
		go.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
				((MainActivity)getActivity()).go(et.getText().toString());
			}
			  
		});
		
		
				
		return v;
		
	}

	interface LoadSecondFragment{
		void go(String abc);
	}
}


