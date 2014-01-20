package com.example.dynamicfragmentforlegacy;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button cmdLoad = (Button) findViewById( R.id.cmdLoadFragment );
		cmdLoad.setOnClickListener( new OnClickListener()
		{
			@Override
			public void onClick ( View view )
			{
				FragmentManager manager = getSupportFragmentManager();
				FragmentTransaction transaction = manager.beginTransaction();
				HelloFragment helloFragment = new HelloFragment();
				transaction.add( R.id.linearFragment, helloFragment );
				transaction.commit();
			}
		});
	}
}