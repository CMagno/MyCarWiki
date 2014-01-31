package com.example.mycarwiki;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CadastrarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar);
		
		Spinner marcas = (Spinner) findViewById(R.id.spinnerMarcasCadastrar);
		Spinner modelos = (Spinner) findViewById(R.id.spinnerModelosCadastrar);
		ArrayAdapter<CharSequence> admarcas;
		
		admarcas = ArrayAdapter.createFromResource(this, R.array.string_array_marcas_comparativo, android.R.layout.simple_spinner_item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastrar, menu);
		return true;
	}

}
