package com.example.twofragmentsinteraction_5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class FirstFragment extends Fragment {

	public FirstFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.fragment_first, container, false);
		
		 Button go = (Button) v.findViewById(R.id.button1); // go button's object is created
		 go.setOnClickListener(new OnClickListener() {  //onClicklistener is set
			
		public void onClick(View arg0) {	
				((MainActivity)getActivity()).go();	
			}
		});
		
		return v;
	
	}

}


	//interface is crated
interface LoadSecondFragment{
	void go(); // method go() is called
}