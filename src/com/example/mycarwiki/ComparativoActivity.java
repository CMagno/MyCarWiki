package com.example.mycarwiki;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ComparativoActivity extends Activity {
	
	Spinner marcaCarro1, marcaCarro2, modeloCarro1, modeloCarro2;
	ArrayAdapter<CharSequence> admarc1, admarc2, admod1, admod2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comparativo);
		
		/* Preenchimento dos Spinners */
		marcaCarro1 = (Spinner) findViewById(R.id.spinnerMarcasCarro1Comparativo);
		marcaCarro2 = (Spinner) findViewById(R.id.spinnerMarcasCarro2Comparativo);
		modeloCarro1 = (Spinner) findViewById(R.id.spinnerModelosCarro1Comparativo);
		modeloCarro2 = (Spinner) findViewById(R.id.spinnerModelosCarro2Comparativo);
		admarc1 = ArrayAdapter.createFromResource(this, R.array.string_array_marcas_comparativo, android.R.layout.simple_spinner_item);
		admarc2 = ArrayAdapter.createFromResource(this, R.array.string_array_marcas_comparativo, android.R.layout.simple_spinner_item);
		admod1 = ArrayAdapter.createFromResource(this, R.array.string_array_modelos_chevrolet_comparativo, android.R.layout.simple_spinner_item);
		admod1 = ArrayAdapter.createFromResource(this, R.array.string_array_modelos_chevrolet_comparativo, android.R.layout.simple_spinner_item);
		admarc1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		admarc2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		admod1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		admod2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		marcaCarro1.setAdapter(admarc1);
		marcaCarro2.setAdapter(admarc2);
		modeloCarro1.setAdapter(admod1);
		modeloCarro2.setAdapter(admod2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.comparativo, menu);
		return true;
	}

}
