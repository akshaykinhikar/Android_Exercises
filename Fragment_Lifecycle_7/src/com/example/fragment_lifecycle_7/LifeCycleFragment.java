package com.example.fragment_lifecycle_7;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class LifeCycleFragment extends Fragment {

	// Get label for log entries
//	private final String TAG = this.getClass().getSimpleName();

	public LifeCycleFragment() {
		// Required empty public constructor
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d("TAG", "onAttach() was called From Fragment LifeCycle ");
	}

	@Override
	public void onCreate(Bundle saved) { 
		super.onCreate(saved);
		if (null != saved) {
			// Restore state here
		}
		Log.d("TAG", "onCreate() was called From Fragment LifeCycle ");
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		Log.d("TAG", "onCreateView() was called From Fragment LifeCycle ");
		return inflater.inflate(R.layout.fragment_life_cycle, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.d("TAG", "onActivityCreated() was called From Fragment LifeCycle ");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d("TAG", "onStart() was called From Fragment LifeCycle ");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d("TAG", "onResume() was called From Fragment LifeCycle ");
	}
	
	
	@Override
	public void onPause() {
		super.onPause();
		Log.d("TAG", "onPause() was called From Fragment LifeCycle ");
	}
	
	
	@Override
	public void onStop() {
		super.onStop();
		Log.d("TAG", "onStop() was called From Fragment LifeCycle ");
	}


//	******************************************************************************//

	// Called during the life cycle, when instance state should be saved/restored

//	******************************************************************************//
  

    @Override
    public void onSaveInstanceState(Bundle toSave) { 
        super.onSaveInstanceState(toSave);
        Log.d("TAG", "onSavedinstanceState() was called From Fragment LifeCycle ");
    }

    @Override
    public void onDestroyView() {
    	super.onDestroyView();
    	Log.d("TAG", "onDestroyView() was called From Fragment LifeCycle ");
    }

    @Override
    public void onDestroy() {
    	super.onDestroy();
    	Log.d("TAG", "onDestroy() was called From Fragment LifeCycle ");
    }
    
    @Override
    public void onDetach() {
    	super.onDetach();
    	Log.d("TAG", "onDetach() was called From Fragment LifeCycle ");
    }
    
}
