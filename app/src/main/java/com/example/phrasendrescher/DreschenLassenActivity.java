package com.example.phrasendrescher;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DreschenLassenActivity extends Activity {

	private TextView textView1;
	private TextView textView2;
	private TextView textView3;
	private TextView textView4;
	private Random zufallsGenerator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.dreschen_lassen);
		
		textView1 = (TextView) findViewById(R.id.txt_text_teil1);
		textView2 = (TextView) findViewById(R.id.txt_text_teil2);
		textView3 = (TextView) findViewById(R.id.txt_text_teil3);
		textView4 = (TextView) findViewById(R.id.txt_text_teil4);
		
		zufallsGenerator = new Random();
	}

	public void onButtonClick(View view) {
		
		erzeugePhrase();
		
	}

	private void erzeugePhrase() {
		
		final String[] textTeil1 = getResources().getStringArray(R.array.einleitung);
		final String[] textTeil2 = getResources().getStringArray(R.array.adjektive);
		final String[] textTeil3 = getResources().getStringArray(R.array.substantive1);
		final String[] textTeil4 = getResources().getStringArray(R.array.substantive2);
		
		textView1.setText(textTeil1[zufallsGenerator.nextInt(textTeil1.length)]);
		textView2.setText(textTeil2[zufallsGenerator.nextInt(textTeil2.length)]);
		textView3.setText(textTeil3[zufallsGenerator.nextInt(textTeil3.length)]);
		textView4.setText(textTeil4[zufallsGenerator.nextInt(textTeil4.length)] + "!");
	}
}
