package com.mparticle.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WebServiceActivity extends Activity {

	Button mStartStop;
	
	boolean mRunning;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webservice);
		mStartStop = (Button)findViewById(R.id.btn_start_stop);
		mStartStop.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View vw) {
				mRunning = !mRunning;
				if (mRunning) {
					mStartStop.setText(R.string.btn_stop);
				} else {
					mStartStop.setText(R.string.btn_start);
				}
			}
		});
		mRunning = true;
		mStartStop.setText(R.string.btn_stop);
	}
}