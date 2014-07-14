package com.example.arrayadapterstudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	Spinner spn;

	String[] technologies = { "App Engine", "XMPP", "NoSQL", "Objectify" };

	String[] words = { "Apple", "Banana", "Applet", "15 August 1950",
			"Crime Master Gogo", "Application", "1950 September",
			"19 July 2014" };

	AutoCompleteTextView actv;

	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spn = (Spinner) findViewById(R.id.spinner1);
		actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getBaseContext(), android.R.layout.simple_spinner_item,
				technologies);

		spn.setAdapter(adapter);

		spn.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long id) {
				String itemSelected = technologies[position];
				Toast.makeText(getBaseContext(), itemSelected + " selected ",
						Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});

		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
				getBaseContext(), android.R.layout.simple_dropdown_item_1line,
				words);

		actv.setThreshold(1);
		actv.setAdapter(adapter2);

		lv = (ListView) findViewById(R.id.listView1);
		ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
				getBaseContext(),
				android.R.layout.simple_list_item_single_choice, words);

		lv.setAdapter(adapter3);
		lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

		// lv.setOnItemSelectedListener(//listener)

	}
}
