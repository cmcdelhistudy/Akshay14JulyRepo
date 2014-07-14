package com.example.viewsystems;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button btn;
	CheckBox cb;
	RadioButton rbMale;
	RatingBar rb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn = (Button) findViewById(R.id.button1);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getBaseContext(), "Button Clicked ",
						Toast.LENGTH_SHORT).show();
			}
		});

		cb = (CheckBox) findViewById(R.id.checkBox1);

		cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {

				String state = (arg1 == true) ? "Checked" : "Unchecked";
				Toast.makeText(getBaseContext(), "Checkbox " + state,
						Toast.LENGTH_SHORT).show();

			}
		});

		rbMale = (RadioButton) findViewById(R.id.radioMale);

		rbMale.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				String state = (arg1 == true) ? "Male" : "Female";
				Toast.makeText(getBaseContext(), "You are " + state,
						Toast.LENGTH_SHORT).show();
			}
		});

		rb = (RatingBar) findViewById(R.id.ratingBar1);
		rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

			@Override
			public void onRatingChanged(RatingBar arg0, float rating,
					boolean fromUser) {

				Toast.makeText(getBaseContext(),
						"Current Rating " + rating + " from user " + fromUser,
						Toast.LENGTH_SHORT).show();

			}
		});

		rb.setRating(2.5f);

	}
}
