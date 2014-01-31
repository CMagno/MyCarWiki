package com.example.mycarwiki;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AtualizaKmActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atualiza_km);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.atualiza_km, menu);
		return true;
	}

}
