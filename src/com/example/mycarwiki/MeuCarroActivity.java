package com.example.mycarwiki;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MeuCarroActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meu_carro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.meu_carro, menu);
		return true;
	}

}
