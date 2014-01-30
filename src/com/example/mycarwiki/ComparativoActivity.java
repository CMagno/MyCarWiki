package com.example.mycarwiki;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ComparativoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comparativo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.comparativo, menu);
		return true;
	}

}
