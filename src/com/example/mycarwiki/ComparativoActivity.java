package com.example.mycarwiki;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

public class ComparativoActivity extends Activity implements OnItemSelectedListener {
	
	Spinner marcaCarro1, marcaCarro2, modeloCarro1, modeloCarro2;
	ArrayAdapter<CharSequence> admarcas, adchev, adfiat, adford, advolks;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comparativo);
		
		/* Preenchimento dos Spinners */
		marcaCarro1 = (Spinner) findViewById(R.id.spinnerMarcasCarro1Comparativo);
		marcaCarro2 = (Spinner) findViewById(R.id.spinnerMarcasCarro2Comparativo);
		modeloCarro1 = (Spinner) findViewById(R.id.spinnerModelosCarro1Comparativo);
		modeloCarro2 = (Spinner) findViewById(R.id.spinnerModelosCarro2Comparativo);
		admarcas = ArrayAdapter.createFromResource(this, R.array.string_array_marcas_comparativo, android.R.layout.simple_spinner_item);
		adchev = ArrayAdapter.createFromResource(this, R.array.string_array_modelos_chevrolet_comparativo, android.R.layout.simple_spinner_item);
		adfiat = ArrayAdapter.createFromResource(this, R.array.string_array_modelos_fiat_comparativo, android.R.layout.simple_spinner_item);
		adford = ArrayAdapter.createFromResource(this, R.array.string_array_modelos_ford_comparativo, android.R.layout.simple_spinner_item);
		advolks = ArrayAdapter.createFromResource(this, R.array.string_array_modelos_volkswagen_comparativo, android.R.layout.simple_spinner_item);
		marcaCarro1.setAdapter(admarcas);
		marcaCarro1.setOnItemSelectedListener(this);
		marcaCarro2.setAdapter(admarcas);
		marcaCarro2.setOnItemSelectedListener(this);
		modeloCarro1.setAdapter(adchev);
		modeloCarro1.setOnItemSelectedListener(this);
		modeloCarro2.setAdapter(adchev);
		modeloCarro2.setOnItemSelectedListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.comparativo, menu);
		return true;
	}
	
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		
		switch(parent.getId()){
			case R.id.spinnerMarcasCarro1Comparativo:
				switch(pos){
					case 0:
						modeloCarro1.setAdapter(adchev);
						break;
					case 1:
						modeloCarro1.setAdapter(adfiat);
						break;
					case 2:
						modeloCarro1.setAdapter(adford);
						break;
					case 3:
						modeloCarro1.setAdapter(advolks);
						break;
				}
				modeloCarro1.refreshDrawableState();
				break;
			case R.id.spinnerMarcasCarro2Comparativo:
				switch(pos){
				case 0:
					modeloCarro2.setAdapter(adchev);
					break;
				case 1:
					modeloCarro2.setAdapter(adfiat);
					break;
				case 2:
					modeloCarro2.setAdapter(adford);
					break;
				case 3:
					modeloCarro2.setAdapter(advolks);
					break;
				}
				modeloCarro2.refreshDrawableState();
				break;
		}
    }

    public void onNothingSelected(AdapterView<?> parent) {
    	
    }

}
