package com.example.twofragmentscustommsginteraction_6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity implements
		FirstFragment.FragmentLoadListener {

	FragmentManager fm = getSupportFragmentManager();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Fragment one = new FirstFragment();
		FragmentTransaction ft = fm.beginTransaction();
		ft.add(R.id.fragment_holder, one);
		ft.commit();

	}

	@Override
	public void startSecondFragment(String messageFromFirstFragment) {

		SecondFragment second = new SecondFragment();
		Bundle args = new Bundle();
        args.putString(SecondFragment.KEY_MESSAGE, messageFromFirstFragment);
        second.setArguments(args);

		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.fragment_holder, second,"second");
		ft.commit();
	}

}
