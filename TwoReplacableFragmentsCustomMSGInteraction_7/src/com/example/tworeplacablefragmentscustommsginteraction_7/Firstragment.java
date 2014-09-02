package com.example.tworeplacablefragmentscustommsginteraction_7;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class Firstragment extends Fragment {

	public Firstragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		
		
		
		View v= inflater.inflate(R.layout.fragment_firstragment, container,
				false);
		
		Button go = (Button) v.findViewById(R.id.button1);
		
		go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				((MainActivity) getActivity()).go();
			}
		});
		
		return v;
	}

}

	interface LoadSecondFragment{
		void go();
	}
