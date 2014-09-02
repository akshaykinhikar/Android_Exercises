package com.example.twofragmentscustommsginteraction_6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class FirstFragment extends Fragment {
	String msg;
	EditText et;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v= inflater.inflate(R.layout.fragment_first, container, false);

		Button pass_text_btn = (Button) v.findViewById(R.id.button1);
		et =(EditText) v.findViewById(R.id.editText1);

		pass_text_btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				msg = et.getText().toString();
				((MainActivity)getActivity()).startSecondFragment(msg);
			}

		});



		return v;

	}

	interface FragmentLoadListener{
		void startSecondFragment(String messageFromFirstFragment);
	}
}


