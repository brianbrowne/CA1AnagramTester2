package com.example.ca1anagramtester2;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class CAX10 extends ActionBarActivity {

	EditText EditTextTest;			TextView TextViewTitleAnswer;			TextView textView;
	String useranswer;

	EditText EditTextCAX10Answer1;		EditText EditTextCAX10Answer2;		EditText EditTextCAX10Answer3;
	EditText EditTextCAX10Answer4;		EditText EditTextCAX10Answer5;		EditText EditTextCAX10Answer6;
	EditText EditTextCAX10Answer7;		EditText EditTextCAX10Answer8;		EditText EditTextCAX10Answer9;
	EditText EditTextCAX10Answer10;		EditText EditTextCAX10Answer11;		EditText EditTextCAX10Answer12;
	EditText EditTextCAX10Answer13;		EditText EditTextCAX10Answer14;


	TextView CAX10Answer1Letter1;		TextView CAX10Answer1Letter2;		TextView CAX10Answer1Letter3;
	TextView CAX10Answer1Letter4;		TextView CAX10Answer1Letter5;		TextView CAX10Answer1Letter6;
	TextView CAX10Answer1Letter7;		TextView CAX10Answer1Letter8;		TextView CAX10Answer1Letter9;
	TextView CAX10Answer1Letter10;		TextView CAX10Answer1Letter11;		TextView CAX10Answer1Letter12;
	TextView CAX10Answer1Letter13;		TextView CAX10Answer1Letter14;


	TextView textViewAnswer1;		TextView textViewAnswer2;		TextView textViewAnswer3;		TextView textViewAnswer4;
	TextView textViewAnswer5;		TextView textViewAnswer6;		TextView textViewAnswer7;		TextView textViewAnswer8;
	TextView textViewAnswer9;		TextView textViewAnswer10;		TextView textViewAnswer11;		TextView textViewAnswer12;
	TextView textViewAnswer13;		TextView textViewAnswer14;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cax10);

		EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
		textView = (TextView) findViewById(R.id.PullTestStringCAX10);
		TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);


		CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
		CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
		CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
		CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);		CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);
		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);		CAX10Answer1Letter10 = (TextView) findViewById(R.id.CAX10Answer1Letter10);
		CAX10Answer1Letter11 = (TextView) findViewById(R.id.CAX10Answer1Letter11);		CAX10Answer1Letter12 = (TextView) findViewById(R.id.CAX10Answer1Letter12);
		CAX10Answer1Letter13 = (TextView) findViewById(R.id.CAX10Answer1Letter13);		CAX10Answer1Letter14 = (TextView) findViewById(R.id.CAX10Answer1Letter14);

		EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
		EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
		EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);
		EditTextCAX10Answer7 = (EditText)findViewById(R.id.EditTextCAX10Answer7);		EditTextCAX10Answer8 = (EditText)findViewById(R.id.EditTextCAX10Answer8);
		EditTextCAX10Answer9 = (EditText)findViewById(R.id.EditTextCAX10Answer9);		EditTextCAX10Answer10 = (EditText)findViewById(R.id.EditTextCAX10Answer10);
		EditTextCAX10Answer11 = (EditText)findViewById(R.id.EditTextCAX10Answer11);		EditTextCAX10Answer12 = (EditText)findViewById(R.id.EditTextCAX10Answer12);
		EditTextCAX10Answer13 = (EditText)findViewById(R.id.EditTextCAX10Answer13);		EditTextCAX10Answer14 = (EditText)findViewById(R.id.EditTextCAX10Answer14);


		textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
		textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
		textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);
		textViewAnswer7 = (TextView) findViewById(R.id.textViewAnswer7);		textViewAnswer8 = (TextView) findViewById(R.id.textViewAnswer8);
		textViewAnswer9 = (TextView) findViewById(R.id.textViewAnswer9);		textViewAnswer10 = (TextView) findViewById(R.id.textViewAnswer10);
		textViewAnswer11 = (TextView) findViewById(R.id.textViewAnswer11);		textViewAnswer12 = (TextView) findViewById(R.id.textViewAnswer12);
		textViewAnswer13 = (TextView) findViewById(R.id.textViewAnswer13);		textViewAnswer14 = (TextView) findViewById(R.id.textViewAnswer14);	



		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	/////////////////DONE///////////////////
	public void onClickCAX10TestAnswers(View v)
	{
		if (randomInt==1)
		{
			String anagram1Answer1="Smoothing of results";
			String anagram1Answer2="Avoid large losses";
			String anagram1Answer3="Diversification";
			String anagram1Answer4="Limit exposure to risk (single event, accumulations)";
			String anagram1Answer5="Increase capacity to accept risk"; 
			String anagram1Answer6="Financial assistance";
			String anagram1Answer7="Expertise";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
			EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);
			EditTextCAX10Answer7 = (EditText)findViewById(R.id.EditTextCAX10Answer7);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
			textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);
			textViewAnswer7 = (TextView) findViewById(R.id.textViewAnswer7);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();
			String checkUserAnswer5=EditTextCAX10Answer5.getText().toString();	String checkUserAnswer6=EditTextCAX10Answer6.getText().toString();
			String checkUserAnswer7=EditTextCAX10Answer7.getText().toString();

			if(anagram1Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram1Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram1Answer1);
			}

			if(anagram1Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram1Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram1Answer2);
			}

			if(anagram1Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram1Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram1Answer3);
			}

			if(anagram1Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram1Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram1Answer4);
			}

			if(anagram1Answer5.equals(checkUserAnswer5)){
				textViewAnswer5.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5.setText(anagram1Answer5);
			}else{
				textViewAnswer5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5.setText(anagram1Answer5);
			}

			if(anagram1Answer6.equals(checkUserAnswer6)){
				textViewAnswer6.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6.setText(anagram1Answer6);
			}else{
				textViewAnswer6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6.setText(anagram1Answer6);
			}

			if(anagram1Answer7.equals(checkUserAnswer7)){
				textViewAnswer7.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7.setText(anagram1Answer7);
			}else{
				textViewAnswer7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7.setText(anagram1Answer7);
			}
		}
		if(randomInt==2){

			String anagram2Answer1="Discounted covers";
			String anagram2Answer2="Integrated risk covers";
			String anagram2Answer3="Post loss funding";
			String anagram2Answer4="Securitisation";
			String anagram2Answer5="Insurance derivates";
			String anagram2Answer6="Swaps";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
			EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
			textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();
			String checkUserAnswer5=EditTextCAX10Answer5.getText().toString();	String checkUserAnswer6=EditTextCAX10Answer6.getText().toString();

			if(anagram2Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram2Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram2Answer1);
			}

			if(anagram2Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram2Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram2Answer2);
			}

			if(anagram2Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram2Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram2Answer3);
			}

			if(anagram2Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram2Answer1);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram2Answer4);
			}

			if(anagram2Answer5.equals(checkUserAnswer5)){
				textViewAnswer5.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5.setText(anagram2Answer5);
			}else{
				textViewAnswer5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5.setText(anagram2Answer5);
			}

			if(anagram2Answer6.equals(checkUserAnswer6)){
				textViewAnswer6.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6.setText(anagram2Answer6);
			}else{
				textViewAnswer6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6.setText(anagram2Answer6);
			}

		}
		if(randomInt==3){

			String anagram3Answer1="Diversification";
			String anagram3Answer2="Exploits risk as an opportunity";
			String anagram3Answer3="Solvency improves (source of capital)";
			String anagram3Answer4="Cheaper cover (than reinsurance)";
			String anagram3Answer5="Available when reinsurance may not be";
			String anagram3Answer6="Results smoothed";
			String anagram3Answer7="Tax advantages";
			String anagram3Answer8="Efficient risk management tool";
			String anagram3Answer9="Security of payments improved";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
			EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);
			EditTextCAX10Answer7 = (EditText)findViewById(R.id.EditTextCAX10Answer7);		EditTextCAX10Answer8 = (EditText)findViewById(R.id.EditTextCAX10Answer8);
			EditTextCAX10Answer9 = (EditText)findViewById(R.id.EditTextCAX10Answer9);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
			textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);
			textViewAnswer7 = (TextView) findViewById(R.id.textViewAnswer7);		textViewAnswer8 = (TextView) findViewById(R.id.textViewAnswer8);
			textViewAnswer9 = (TextView) findViewById(R.id.textViewAnswer9);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();
			String checkUserAnswer5=EditTextCAX10Answer5.getText().toString();	String checkUserAnswer6=EditTextCAX10Answer6.getText().toString();
			String checkUserAnswer7=EditTextCAX10Answer7.getText().toString();	String checkUserAnswer8=EditTextCAX10Answer8.getText().toString();
			String checkUserAnswer9=EditTextCAX10Answer9.getText().toString();

			if(anagram3Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram3Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram3Answer1);
			}

			if(anagram3Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram3Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram3Answer2);
			}

			if(anagram3Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram3Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram3Answer3);
			}

			if(anagram3Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram3Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram3Answer4);
			}

			if(anagram3Answer5.equals(checkUserAnswer5)){
				textViewAnswer5.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5.setText(anagram3Answer5);
			}else{
				textViewAnswer5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5.setText(anagram3Answer5);
			}

			if(anagram3Answer6.equals(checkUserAnswer6)){
				textViewAnswer6.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6.setText(anagram3Answer6);
			}else{
				textViewAnswer6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6.setText(anagram3Answer6);
			}

			if(anagram3Answer7.equals(checkUserAnswer7)){
				textViewAnswer7.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7.setText(anagram3Answer7);
			}else{
				textViewAnswer7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7.setText(anagram3Answer7);
			}

			if(anagram3Answer8.equals(checkUserAnswer8)){
				textViewAnswer8.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8.setText(anagram3Answer8);
			}else{
				textViewAnswer8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8.setText(anagram3Answer8);
			}

			if(anagram3Answer9.equals(checkUserAnswer9)){
				textViewAnswer9.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9.setText(anagram3Answer9);
			}else{
				textViewAnswer9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9.setText(anagram3Answer9);
			}

		}
		if(randomInt==4){

			String anagram4Answer1="Substandard lives (identify and offer terms)";
			String anagram4Answer2="Avoid anti-selection";
			String anagram4Answer3="Financial underwriting to reduce the risk of overinsurance on large policies";
			String anagram4Answer4="Experience does not depart too far from that assumed in the pricing basis";
			String anagram4Answer5="Risk classification to ensure that all risks are treated fairly";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
			EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
			textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();
			String checkUserAnswer5=EditTextCAX10Answer5.getText().toString();

			if(anagram4Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram4Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram4Answer1);
			}

			if(anagram4Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram4Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram4Answer2);
			}

			if(anagram4Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram4Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram4Answer3);
			}

			if(anagram4Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram4Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram4Answer4);
			}

			if(anagram4Answer5.equals(checkUserAnswer5)){
				textViewAnswer5.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5.setText(anagram4Answer5);
			}else{
				textViewAnswer5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5.setText(anagram4Answer5);
			}


		}
		if(randomInt==5){

			String anagram5Answer1="Data recording";
			String anagram5Answer2="Accounting and auditing";
			String anagram5Answer3="Monitor liabilities taken on";
			String anagram5Answer4="Options and guarantees";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();

			if(anagram5Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram5Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram5Answer1);
			}

			if(anagram5Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram5Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram5Answer2);
			}

			if(anagram5Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram5Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram5Answer3);
			}

			if(anagram5Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram5Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram5Answer4);
			}



		}
		if(randomInt==6){

			String anagram6Answer1="Immunisation";
			String anagram6Answer2="Derivates purchased OTC";
			String anagram6Answer3="Option pricing methods";
			String anagram6Answer4="Liability hedging";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();

			if(anagram6Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram6Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram6Answer1);
			}

			if(anagram6Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram6Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram6Answer2);
			}

			if(anagram6Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram6Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram6Answer3);
			}

			if(anagram6Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram6Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram6Answer4);
			}




		}
		if(randomInt==7){

			String anagram7Answer1="Geographical area of business";
			String anagram7Answer2="Investment - asset classes and assets held within a class";
			String anagram7Answer3="Reinsurance providers";
			String anagram7Answer4="Lines of business";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();

			if(anagram7Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram7Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram7Answer1);
			}

			if(anagram7Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram7Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram7Answer2);
			}

			if(anagram7Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram7Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram7Answer3);
			}

			if(anagram7Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram7Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram7Answer4);
			}




		}
		if(randomInt==8){

			String anagram8Answer1="Regulatory requirement to demonstrate solvency";
			String anagram8Answer2="Expenses of launching a new product/ starting a new operation";
			String anagram8Answer3="Guarantees can be offered";
			String anagram8Answer4="Cashflow timing management";
			String anagram8Answer5="Unexpected events cushion, eg adverse experience, fines";
			String anagram8Answer6="Smooth profit";
			String anagram8Answer7="Help demonstrate financial strength/attract NB/ obtain good credit rating";
			String anagram8Answer8="Investment freedom to mismatch";
			String anagram8Answer9="Opportunities, eg mergers and acquisitions";
			String anagram8Answer10="New business strain financing";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
			EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);
			EditTextCAX10Answer7 = (EditText)findViewById(R.id.EditTextCAX10Answer7);		EditTextCAX10Answer8 = (EditText)findViewById(R.id.EditTextCAX10Answer8);
			EditTextCAX10Answer9 = (EditText)findViewById(R.id.EditTextCAX10Answer9);		EditTextCAX10Answer10 = (EditText)findViewById(R.id.EditTextCAX10Answer10);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
			textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);
			textViewAnswer7 = (TextView) findViewById(R.id.textViewAnswer7);		textViewAnswer8 = (TextView) findViewById(R.id.textViewAnswer8);
			textViewAnswer9 = (TextView) findViewById(R.id.textViewAnswer9);		textViewAnswer10 = (TextView) findViewById(R.id.textViewAnswer10);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();
			String checkUserAnswer5=EditTextCAX10Answer5.getText().toString();	String checkUserAnswer6=EditTextCAX10Answer6.getText().toString();
			String checkUserAnswer7=EditTextCAX10Answer7.getText().toString();	String checkUserAnswer8=EditTextCAX10Answer8.getText().toString();
			String checkUserAnswer9=EditTextCAX10Answer9.getText().toString();	String checkUserAnswer10=EditTextCAX10Answer10.getText().toString();

			if(anagram8Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram8Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram8Answer1);
			}

			if(anagram8Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram8Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram8Answer2);
			}

			if(anagram8Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram8Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram8Answer3);
			}

			if(anagram8Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram8Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram8Answer4);
			}

			if(anagram8Answer5.equals(checkUserAnswer5)){
				textViewAnswer5.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5.setText(anagram8Answer5);
			}else{
				textViewAnswer5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5.setText(anagram8Answer5);
			}

			if(anagram8Answer6.equals(checkUserAnswer6)){
				textViewAnswer6.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6.setText(anagram8Answer6);
			}else{
				textViewAnswer6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6.setText(anagram8Answer6);
			}

			if(anagram8Answer7.equals(checkUserAnswer7)){
				textViewAnswer7.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7.setText(anagram8Answer7);
			}else{
				textViewAnswer7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7.setText(anagram8Answer7);
			}

			if(anagram8Answer8.equals(checkUserAnswer8)){
				textViewAnswer8.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8.setText(anagram8Answer8);
			}else{
				textViewAnswer8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8.setText(anagram8Answer8);
			}

			if(anagram8Answer9.equals(checkUserAnswer9)){
				textViewAnswer9.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9.setText(anagram8Answer9);
			}else{
				textViewAnswer9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9.setText(anagram8Answer9);
			}

			if(anagram8Answer10.equals(checkUserAnswer10)){
				textViewAnswer10.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10.setText(anagram8Answer10);
			}else{
				textViewAnswer10.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10.setText(anagram8Answer10);
			}



		}
		if(randomInt==9){

			String anagram9Acronym = "SLUM CRESS DWARF";
			String anagram9Answer1="Securitisation";
			String anagram9Answer2="Liquidity facilities";
			String anagram9Answer3="Unsecured senior debt";
			String anagram9Answer4="Merging funds";
			String anagram9Answer5="Contingent capital";
			String anagram9Answer6="Reinsurance";
			String anagram9Answer7="Equity";
			String anagram9Answer8="Subordinate debt";
			String anagram9Answer9="Surplus distribution deferral";
			String anagram9Answer10="Derivates";
			String anagram9Answer11="Weaken valuation basis";
			String anagram9Answer12="Asset change";
			String anagram9Answer13="Retain profits";
			String anagram9Answer14="Financial reinsurance";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
			EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);
			EditTextCAX10Answer7 = (EditText)findViewById(R.id.EditTextCAX10Answer7);		EditTextCAX10Answer8 = (EditText)findViewById(R.id.EditTextCAX10Answer8);
			EditTextCAX10Answer9 = (EditText)findViewById(R.id.EditTextCAX10Answer9);		EditTextCAX10Answer10 = (EditText)findViewById(R.id.EditTextCAX10Answer10);
			EditTextCAX10Answer11 = (EditText)findViewById(R.id.EditTextCAX10Answer11);		EditTextCAX10Answer12 = (EditText)findViewById(R.id.EditTextCAX10Answer12);
			EditTextCAX10Answer13 = (EditText)findViewById(R.id.EditTextCAX10Answer13);		EditTextCAX10Answer14 = (EditText)findViewById(R.id.EditTextCAX10Answer14);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
			textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);
			textViewAnswer7 = (TextView) findViewById(R.id.textViewAnswer7);		textViewAnswer8 = (TextView) findViewById(R.id.textViewAnswer8);
			textViewAnswer9 = (TextView) findViewById(R.id.textViewAnswer9);		textViewAnswer10 = (TextView) findViewById(R.id.textViewAnswer10);
			textViewAnswer11 = (TextView) findViewById(R.id.textViewAnswer11);		textViewAnswer12 = (TextView) findViewById(R.id.textViewAnswer12);
			textViewAnswer13 = (TextView) findViewById(R.id.textViewAnswer13);		textViewAnswer14 = (TextView) findViewById(R.id.textViewAnswer14);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();
			String checkUserAnswer5=EditTextCAX10Answer5.getText().toString();	String checkUserAnswer6=EditTextCAX10Answer6.getText().toString();
			String checkUserAnswer7=EditTextCAX10Answer7.getText().toString();	String checkUserAnswer8=EditTextCAX10Answer8.getText().toString();
			String checkUserAnswer9=EditTextCAX10Answer9.getText().toString();	String checkUserAnswer10=EditTextCAX10Answer10.getText().toString();
			String checkUserAnswer11=EditTextCAX10Answer11.getText().toString();	String checkUserAnswer12=EditTextCAX10Answer12.getText().toString();
			String checkUserAnswer13=EditTextCAX10Answer13.getText().toString();	String checkUserAnswer14=EditTextCAX10Answer14.getText().toString();

			if(anagram9Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram9Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram9Answer1);
			}

			if(anagram9Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram9Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram9Answer2);
			}

			if(anagram9Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram9Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram9Answer3);
			}

			if(anagram9Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram9Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram9Answer4);
			}

			if(anagram9Answer5.equals(checkUserAnswer5)){
				textViewAnswer5.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5.setText(anagram9Answer5);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram9Answer5);
			}

			if(anagram9Answer6.equals(checkUserAnswer6)){
				textViewAnswer6.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6.setText(anagram9Answer6);
			}else{
				textViewAnswer6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6.setText(anagram9Answer6);
			}

			if(anagram9Answer7.equals(checkUserAnswer7)){
				textViewAnswer7.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7.setText(anagram9Answer7);
			}else{
				textViewAnswer7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7.setText(anagram9Answer7);
			}

			if(anagram9Answer8.equals(checkUserAnswer8)){
				textViewAnswer8.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8.setText(anagram9Answer8);
			}else{
				textViewAnswer8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8.setText(anagram9Answer8);
			}

			if(anagram9Answer9.equals(checkUserAnswer9)){
				textViewAnswer9.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9.setText(anagram9Answer9);
			}else{
				textViewAnswer9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9.setText(anagram9Answer9);
			}

			if(anagram9Answer10.equals(checkUserAnswer10)){
				textViewAnswer10.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10.setText(anagram9Answer10);
			}else{
				textViewAnswer10.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10.setText(anagram9Answer10);
			}

			if(anagram9Answer11.equals(checkUserAnswer11)){
				textViewAnswer11.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer11.setText(anagram9Answer11);
			}else{
				textViewAnswer11.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11.setText(anagram9Answer11);
			}

			if(anagram9Answer12.equals(checkUserAnswer12)){
				textViewAnswer12.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer12.setText(anagram9Answer12);
			}else{
				textViewAnswer12.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12.setText(anagram9Answer12);
			}

			if(anagram9Answer13.equals(checkUserAnswer13)){
				textViewAnswer13.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer13.setText(anagram9Answer13);
			}else{
				textViewAnswer13.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13.setText(anagram9Answer13);
			}

			if(anagram9Answer14.equals(checkUserAnswer14)){
				textViewAnswer14.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer14.setText(anagram9Answer14);
			}else{
				textViewAnswer14.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14.setText(anagram9Answer14);
			}



		}
		if(randomInt==10){

			String anagram10Answer1="Quantification of risks and capital requirement";
			String anagram10Answer2="Supervisory regime";
			String anagram10Answer3="Disclosure requirements";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);

			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();

			if(anagram10Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram10Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram10Answer1);
			}

			if(anagram10Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram10Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram10Answer2);
			}

			if(anagram10Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram10Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram10Answer3);
			}


		}
		if(randomInt==11){

			String anagram11Answer1="Pillar I minimum";
			String anagram11Answer2="Intervention of supervisors";
			String anagram11Answer3="Spervisors evaluation";
			String anagram11Answer4="Assessment of capital requirement process";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();

			if(anagram11Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram11Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram11Answer1);
			}

			if(anagram11Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram11Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram11Answer2);
			}

			if(anagram11Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram11Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram11Answer3);
			}

			if(anagram11Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram11Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram11Answer4);
			}


		}
		if(randomInt==12){

			String anagram12Answer1="Profile of risk";
			String anagram12Answer2="Activities of business";
			String anagram12Answer3="Risk management activities";
			String anagram12Answer4="Condition financially and performance";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);


			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();

			if(anagram12Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram12Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram12Answer1);
			}

			if(anagram12Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram12Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram12Answer2);
			}

			if(anagram12Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram12Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram12Answer3);
			}

			if(anagram12Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram12Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram12Answer4);
			}


		}
		if(randomInt==13){

			String anagram13Answer1="Management information";
			String anagram13Answer2="Update assumptions for future experience";
			String anagram13Answer3="Trend monitoring - take corrective actions";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);

			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();

			if(anagram13Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram13Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram13Answer1);
			}

			if(anagram13Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram13Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram13Answer2);
			}

			if(anagram13Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram13Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram13Answer3);
			}



		}
		if(randomInt==14){

			String anagram14Answer1="Random fluctuations";
			String anagram14Answer2="Abnormal fluctuations";
			String anagram14Answer3="Trends";
			String anagram14Answer4="Cycles (economic)";
			String anagram14Answer5="Heterogeneity in data";

			EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
			EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
			EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);

			textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
			textViewAnswer3 = (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
			textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);

			String checkUserAnswer1=EditTextCAX10Answer1.getText().toString();	String checkUserAnswer2=EditTextCAX10Answer2.getText().toString();
			String checkUserAnswer3=EditTextCAX10Answer3.getText().toString();	String checkUserAnswer4=EditTextCAX10Answer4.getText().toString();
			String checkUserAnswer5=EditTextCAX10Answer5.getText().toString();

			if(anagram14Answer1.equals(checkUserAnswer1)){
				textViewAnswer1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1.setText(anagram14Answer1);
			}else{
				textViewAnswer1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1.setText(anagram14Answer1);
			}

			if(anagram14Answer2.equals(checkUserAnswer2)){
				textViewAnswer2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2.setText(anagram14Answer2);
			}else{
				textViewAnswer2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2.setText(anagram14Answer2);
			}

			if(anagram14Answer3.equals(checkUserAnswer3)){
				textViewAnswer3.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3.setText(anagram14Answer3);
			}else{
				textViewAnswer3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3.setText(anagram14Answer3);
			}

			if(anagram14Answer4.equals(checkUserAnswer4)){
				textViewAnswer4.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4.setText(anagram14Answer4);
			}else{
				textViewAnswer4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4.setText(anagram14Answer4);
			}

			if(anagram14Answer5.equals(checkUserAnswer5)){
				textViewAnswer5.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5.setText(anagram14Answer5);
			}else{
				textViewAnswer5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5.setText(anagram14Answer5);
			}


		}


	}

	
	//////////////////////DONE//////////////////
	public void onClickGetTitleCAX10(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(14)+1;//when you click "Display Database"
		
		TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);
		TextViewTitleAnswer.setText(null);

		EditTextTest = (EditText) findViewById(R.id.EditTextTestCAX10);
		EditTextTest.setText(null);

		CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
		CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
		CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
		CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);		CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);
		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);		CAX10Answer1Letter10 = (TextView) findViewById(R.id.CAX10Answer1Letter10);
		CAX10Answer1Letter11 = (TextView) findViewById(R.id.CAX10Answer1Letter11);		CAX10Answer1Letter12 = (TextView) findViewById(R.id.CAX10Answer1Letter12);
		CAX10Answer1Letter13 = (TextView) findViewById(R.id.CAX10Answer1Letter13);		CAX10Answer1Letter14 = (TextView) findViewById(R.id.CAX10Answer1Letter14);


		CAX10Answer1Letter1.setText(null);		CAX10Answer1Letter2.setText(null);		CAX10Answer1Letter3.setText(null);		CAX10Answer1Letter4.setText(null);
		CAX10Answer1Letter5.setText(null);		CAX10Answer1Letter6.setText(null);		CAX10Answer1Letter7.setText(null);		CAX10Answer1Letter8.setText(null);
		CAX10Answer1Letter9.setText(null);		CAX10Answer1Letter10.setText(null);		CAX10Answer1Letter11.setText(null);		CAX10Answer1Letter12.setText(null);
		CAX10Answer1Letter13.setText(null);		CAX10Answer1Letter13.setText(null);		CAX10Answer1Letter14.setText(null);		




		EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
		EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
		EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);
		EditTextCAX10Answer7 = (EditText)findViewById(R.id.EditTextCAX10Answer7);		EditTextCAX10Answer8 = (EditText)findViewById(R.id.EditTextCAX10Answer8);
		EditTextCAX10Answer9 = (EditText)findViewById(R.id.EditTextCAX10Answer9);		EditTextCAX10Answer10 = (EditText)findViewById(R.id.EditTextCAX10Answer10);
		EditTextCAX10Answer11 = (EditText)findViewById(R.id.EditTextCAX10Answer11);		EditTextCAX10Answer12 = (EditText)findViewById(R.id.EditTextCAX10Answer12);
		EditTextCAX10Answer13 = (EditText)findViewById(R.id.EditTextCAX10Answer13);		EditTextCAX10Answer14 = (EditText)findViewById(R.id.EditTextCAX10Answer14);


		EditTextCAX10Answer1.setText(null);		EditTextCAX10Answer2.setText(null);		EditTextCAX10Answer3.setText(null);		EditTextCAX10Answer4.setText(null);
		EditTextCAX10Answer5.setText(null);		EditTextCAX10Answer6.setText(null);		EditTextCAX10Answer7.setText(null);		EditTextCAX10Answer8.setText(null);
		EditTextCAX10Answer9.setText(null);		EditTextCAX10Answer10.setText(null);		EditTextCAX10Answer11.setText(null);		EditTextCAX10Answer12.setText(null);
		EditTextCAX10Answer13.setText(null);		EditTextCAX10Answer14.setText(null);		


		textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
		textViewAnswer3= (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
		textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);
		textViewAnswer7 = (TextView) findViewById(R.id.textViewAnswer7);		textViewAnswer8 = (TextView) findViewById(R.id.textViewAnswer8);
		textViewAnswer9 = (TextView) findViewById(R.id.textViewAnswer9);		textViewAnswer10 = (TextView) findViewById(R.id.textViewAnswer10);
		textViewAnswer11 = (TextView) findViewById(R.id.textViewAnswer11);		textViewAnswer12 = (TextView) findViewById(R.id.textViewAnswer12);
		textViewAnswer13 = (TextView) findViewById(R.id.textViewAnswer13);		textViewAnswer14 = (TextView) findViewById(R.id.textViewAnswer14);
		

		textViewAnswer1.setText(null);		textViewAnswer2.setText(null);		textViewAnswer3.setText(null);		textViewAnswer4.setText(null);
		textViewAnswer5.setText(null);		textViewAnswer6.setText(null);		textViewAnswer7.setText(null);		textViewAnswer8.setText(null);
		textViewAnswer9.setText(null);		textViewAnswer10.setText(null);		textViewAnswer11.setText(null);		textViewAnswer12.setText(null);
		textViewAnswer13.setText(null);		textViewAnswer14.setText(null);		
		
		TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);
		TextViewTitleAnswer.setText(null);

		EditTextTest = (EditText) findViewById(R.id.EditTextTestCAX10);
		EditTextTest.setText(null);

		
		if(randomInt == 1){
			
			String anagram1Acronym = "SAD LIFE";

			String anagram1Title = "Reasons for using reinsurance";
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram1Title);
			

			

		}

		if(randomInt == 2){

			String anagram2Title = "Alternative risk transfer (ART) products";
			String anagram2Acronym = "DIPSIS";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram2Title);
			
			
			
		}

		if(randomInt == 3){

			String anagram3Title = "Possible reasons fo rusing ART";
			String anagram3Acronym = "DESCARTES";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram3Title);
			
			
			

		}

		if(randomInt == 4){

			String anagram4Title = "Reasons for underwriting";
			String anagram4Acronym = "SAFER";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram4Title);
			
			
			
		}

		if(randomInt == 5){

			String anagram5Title = "Management Control Systems";
			String anagram5Acronym = "DAMO";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram5Title);
			
			

			
		}

		if(randomInt == 6){

			String anagram6Title = "Managing options and guarantees";
			String anagram6Acronym = "IDOL";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram6Title);
			
			
			
		}

		if(randomInt == 7){

			String anagram7Title = "Diversification";
			String anagram7Acronym = "GIRL";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram7Title);
			
			

			
		}

		if(randomInt == 8){

			String anagram8Title = "Why financial providers need capital";
			String anagram8Acronym = "REG CUSHION";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram8Title);
			
			
		}

		if(randomInt == 9){

			String anagram9Title = "Capital management tools";
			String anagram9Acronym = "SLUM CRESS DWARF";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram9Title);
			
			
		}

		if(randomInt == 10){

			String anagram10Title = "Solvency II Pillars";
			String anagram10Acronym = "QSD";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram10Title);
			
			
		}

		if(randomInt == 11){

			String anagram11Title = "Basel II: Pillar II-2 interlocking principles";
			String anagram11Acronym = "PISA";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram11Title);
			
			
		}

		if(randomInt == 12){

			String anagram12Title = "Basel II: Pillar III, Disclosure requirements";
			String anagram12Acronym = "PARC";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram12Title);
			
			
			
		}

		if(randomInt == 13){

			String anagram13Title = "Reasons for monitoring experience";
			String anagram13Acronym = "MUT";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram13Title);
			
			
			
		}

		if(randomInt == 14){

			String anagram14Title = "When monitoring, experience under investigation may have been affected by";
			String anagram14Acronym = "RATCH";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram14Title);
			
			
			
		}


	}

	//////////////////////DONE////////////////
	public void onClickTestYourselfAnagramCAX10(View v)
	{
		if (randomInt==1)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);

			CAX10Answer1Letter1.setText("S");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("D");
			CAX10Answer1Letter4.setText("L");
			CAX10Answer1Letter5.setText("I");
			CAX10Answer1Letter6.setText("F");
			CAX10Answer1Letter7.setText("E");
			
			
			String Acronym="Reasons for using reinsurance";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText( Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);

			CAX10Answer1Letter1.setText("D");
			CAX10Answer1Letter2.setText("I");
			CAX10Answer1Letter3.setText("P");
			CAX10Answer1Letter4.setText("S");
			CAX10Answer1Letter5.setText("I");
			CAX10Answer1Letter6.setText("S");

			
			String Acronym="Alternative risk transfer (ART) products";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);
			CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);

			CAX10Answer1Letter1.setText("D");
			CAX10Answer1Letter2.setText("E");
			CAX10Answer1Letter3.setText("S");
			CAX10Answer1Letter4.setText("C");
			CAX10Answer1Letter5.setText("A");
			CAX10Answer1Letter6.setText("R");
			CAX10Answer1Letter7.setText("T");
			CAX10Answer1Letter8.setText("E");
			CAX10Answer1Letter9.setText("S");
			
			

			String Acronym="Reasons for underwriting";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);

			CAX10Answer1Letter1.setText("S");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("F");
			CAX10Answer1Letter4.setText("E");
			CAX10Answer1Letter5.setText("R");
			
			
			String Acronym="Reasons for underwriting";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("D");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("M");
			CAX10Answer1Letter4.setText("O");
			
			
			String Acronym="Management Control Systems";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}

		if (randomInt==6)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("I");
			CAX10Answer1Letter2.setText("D");
			CAX10Answer1Letter3.setText("O");
			CAX10Answer1Letter4.setText("L");
			
			
			String Acronym="Managing options and guarantees";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);


			CAX10Answer1Letter1.setText("G");
			CAX10Answer1Letter2.setText("I");
			CAX10Answer1Letter3.setText("R");
			CAX10Answer1Letter4.setText("L");
			
			
			String Acronym="Diversification";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);
			CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);
			CAX10Answer1Letter10 = (TextView) findViewById(R.id.CAX10Answer1Letter10);

			CAX10Answer1Letter1.setText("R");
			CAX10Answer1Letter2.setText("E");
			CAX10Answer1Letter3.setText("G");
			CAX10Answer1Letter4.setText("C");
			CAX10Answer1Letter5.setText("U");
			CAX10Answer1Letter6.setText("S");
			CAX10Answer1Letter7.setText("H");
			CAX10Answer1Letter8.setText("I");
			CAX10Answer1Letter9.setText("O");
			CAX10Answer1Letter10.setText("N");
			
			
			String Acronym="Why financial providers need capital";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);
			CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);
			CAX10Answer1Letter10 = (TextView) findViewById(R.id.CAX10Answer1Letter10);
			CAX10Answer1Letter11 = (TextView) findViewById(R.id.CAX10Answer1Letter11);
			CAX10Answer1Letter12 = (TextView) findViewById(R.id.CAX10Answer1Letter12);
			CAX10Answer1Letter13 = (TextView) findViewById(R.id.CAX10Answer1Letter13);
			CAX10Answer1Letter14 = (TextView) findViewById(R.id.CAX10Answer1Letter14);

			CAX10Answer1Letter1.setText("S");
			CAX10Answer1Letter2.setText("L");
			CAX10Answer1Letter3.setText("U");
			CAX10Answer1Letter4.setText("M");
			CAX10Answer1Letter5.setText("C");
			CAX10Answer1Letter6.setText("R");
			CAX10Answer1Letter7.setText("E");
			CAX10Answer1Letter8.setText("S");
			CAX10Answer1Letter9.setText("S");
			CAX10Answer1Letter10.setText("D");
			CAX10Answer1Letter11.setText("W");
			CAX10Answer1Letter12.setText("A");
			CAX10Answer1Letter13.setText("R");
			CAX10Answer1Letter14.setText("F");
			
			
			String Acronym="Capital management tools";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);

			CAX10Answer1Letter1.setText("Q");
			CAX10Answer1Letter2.setText("S");
			CAX10Answer1Letter3.setText("D");
			
			
			String Acronym="Solvency II Pillars";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("P");
			CAX10Answer1Letter2.setText("I");
			CAX10Answer1Letter3.setText("S");
			CAX10Answer1Letter4.setText("A");

			
			String Acronym="Basel II: Pillar II-2 interlocking principles";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==12){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("P");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("R");
			CAX10Answer1Letter4.setText("C");
			
			
			String Acronym="Basel II: Pillar III, Disclosure requirements";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==13){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);

			CAX10Answer1Letter1.setText("M");
			CAX10Answer1Letter2.setText("U");
			CAX10Answer1Letter3.setText("T");
			
			
			String Acronym="Reasons for monitoring experience";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==14){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);

			CAX10Answer1Letter1.setText("R");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("T");
			CAX10Answer1Letter4.setText("C");
			CAX10Answer1Letter5.setText("H");
			
			
			String Acronym="When monitoring, experience under investigation may have been affected by";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
	}

	///////////DONE///////////////////
	public void onClickGetAnagramCAX10(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(14)+1;//when you click "Display Database"
		
		TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);
		TextViewTitleAnswer.setText(null);

		EditTextTest = (EditText) findViewById(R.id.EditTextTestCAX10);
		EditTextTest.setText(null);

		CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
		CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
		CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
		CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);		CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);
		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);		CAX10Answer1Letter10 = (TextView) findViewById(R.id.CAX10Answer1Letter10);
		CAX10Answer1Letter11 = (TextView) findViewById(R.id.CAX10Answer1Letter11);		CAX10Answer1Letter12 = (TextView) findViewById(R.id.CAX10Answer1Letter12);
		CAX10Answer1Letter13 = (TextView) findViewById(R.id.CAX10Answer1Letter13);		CAX10Answer1Letter14 = (TextView) findViewById(R.id.CAX10Answer1Letter14);


		CAX10Answer1Letter1.setText(null);		CAX10Answer1Letter2.setText(null);		CAX10Answer1Letter3.setText(null);		CAX10Answer1Letter4.setText(null);
		CAX10Answer1Letter5.setText(null);		CAX10Answer1Letter6.setText(null);		CAX10Answer1Letter7.setText(null);		CAX10Answer1Letter8.setText(null);
		CAX10Answer1Letter9.setText(null);		CAX10Answer1Letter10.setText(null);		CAX10Answer1Letter11.setText(null);		CAX10Answer1Letter12.setText(null);
		CAX10Answer1Letter13.setText(null);		CAX10Answer1Letter13.setText(null);		CAX10Answer1Letter14.setText(null);		




		EditTextCAX10Answer1 = (EditText)findViewById(R.id.EditTextCAX10Answer1);		EditTextCAX10Answer2 = (EditText)findViewById(R.id.EditTextCAX10Answer2);
		EditTextCAX10Answer3 = (EditText)findViewById(R.id.EditTextCAX10Answer3);		EditTextCAX10Answer4 = (EditText)findViewById(R.id.EditTextCAX10Answer4);
		EditTextCAX10Answer5 = (EditText)findViewById(R.id.EditTextCAX10Answer5);		EditTextCAX10Answer6 = (EditText)findViewById(R.id.EditTextCAX10Answer6);
		EditTextCAX10Answer7 = (EditText)findViewById(R.id.EditTextCAX10Answer7);		EditTextCAX10Answer8 = (EditText)findViewById(R.id.EditTextCAX10Answer8);
		EditTextCAX10Answer9 = (EditText)findViewById(R.id.EditTextCAX10Answer9);		EditTextCAX10Answer10 = (EditText)findViewById(R.id.EditTextCAX10Answer10);
		EditTextCAX10Answer11 = (EditText)findViewById(R.id.EditTextCAX10Answer11);		EditTextCAX10Answer12 = (EditText)findViewById(R.id.EditTextCAX10Answer12);
		EditTextCAX10Answer13 = (EditText)findViewById(R.id.EditTextCAX10Answer13);		EditTextCAX10Answer14 = (EditText)findViewById(R.id.EditTextCAX10Answer14);


		EditTextCAX10Answer1.setText(null);		EditTextCAX10Answer2.setText(null);		EditTextCAX10Answer3.setText(null);		EditTextCAX10Answer4.setText(null);
		EditTextCAX10Answer5.setText(null);		EditTextCAX10Answer6.setText(null);		EditTextCAX10Answer7.setText(null);		EditTextCAX10Answer8.setText(null);
		EditTextCAX10Answer9.setText(null);		EditTextCAX10Answer10.setText(null);		EditTextCAX10Answer11.setText(null);		EditTextCAX10Answer12.setText(null);
		EditTextCAX10Answer13.setText(null);		EditTextCAX10Answer14.setText(null);		


		textViewAnswer1 = (TextView) findViewById(R.id.textViewAnswer1);		textViewAnswer2= (TextView) findViewById(R.id.textViewAnswer2);
		textViewAnswer3= (TextView) findViewById(R.id.textViewAnswer3);		textViewAnswer4 = (TextView) findViewById(R.id.textViewAnswer4);
		textViewAnswer5 = (TextView) findViewById(R.id.textViewAnswer5);		textViewAnswer6 = (TextView) findViewById(R.id.textViewAnswer6);
		textViewAnswer7 = (TextView) findViewById(R.id.textViewAnswer7);		textViewAnswer8 = (TextView) findViewById(R.id.textViewAnswer8);
		textViewAnswer9 = (TextView) findViewById(R.id.textViewAnswer9);		textViewAnswer10 = (TextView) findViewById(R.id.textViewAnswer10);
		textViewAnswer11 = (TextView) findViewById(R.id.textViewAnswer11);		textViewAnswer12 = (TextView) findViewById(R.id.textViewAnswer12);
		textViewAnswer13 = (TextView) findViewById(R.id.textViewAnswer13);		textViewAnswer14 = (TextView) findViewById(R.id.textViewAnswer14);
		

		textViewAnswer1.setText(null);		textViewAnswer2.setText(null);		textViewAnswer3.setText(null);		textViewAnswer4.setText(null);
		textViewAnswer5.setText(null);		textViewAnswer6.setText(null);		textViewAnswer7.setText(null);		textViewAnswer8.setText(null);
		textViewAnswer9.setText(null);		textViewAnswer10.setText(null);		textViewAnswer11.setText(null);		textViewAnswer12.setText(null);
		textViewAnswer13.setText(null);		textViewAnswer14.setText(null);		
		
		TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);
		TextViewTitleAnswer.setText(null);

		EditTextTest = (EditText) findViewById(R.id.EditTextTestCAX10);
		EditTextTest.setText(null);


		if(randomInt == 1){

			String anagram1Title = "Reasons for using reinsurance";
			String anagram1Acronym = "SAD LIFE";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram1Acronym);
			
			
			

		}

		if(randomInt==2){

			String anagram2Title = "Alternative risk transfer (ART) products";
			String anagram2Acronym = "DIPSIS";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram2Acronym);

			
		}

		if(randomInt==3){

			String anagram3Title = "Possible reasons fo rusing ART";
			String anagram3Acronym = "DESCARTES";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram3Acronym);
			
			
			
		}

		if(randomInt==4){

			String anagram4Title = "Reasons for underwriting";
			String anagram4Acronym = "SAFER";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram4Acronym);
			

			
		}

		if(randomInt==5){

			String anagram5Title = "Management Control Systems";
			String anagram5Acronym = "DAMO";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram5Acronym);
			
			
			
		}

		if(randomInt==6){

			String anagram6Title = "Managing options and guarantees";
			String anagram6Acronym = "IDOL";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram6Acronym);

			
		}

		if(randomInt==7){

			String anagram7Title = "Diversification";
			String anagram7Acronym = "GIRL";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram7Acronym);
			
			
			
		}

		if(randomInt==8){

			String anagram8Title = "Why financial providers need capital";
			String anagram8Acronym = "REG CUSHION";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram8Acronym);
			
			
			
		}

		if(randomInt==9){

			String anagram9Title = "Capital management tools";
			String anagram9Acronym = "SLUM CRESS DWARF";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram9Acronym);
			
			
			
		}

		if(randomInt==10){

			String anagram10Title = "Solvency II Pillars";
			String anagram10Acronym = "QSD";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram10Acronym);
			
			
			
		}

		if(randomInt==11){

			String anagram11Title = "Basel II: Pillar II-4 interlocking principles";
			String anagram11Acronym = "PISA";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram11Acronym);
			
			
			
		}

		if(randomInt==12){

			String anagram12Title = "Basel II: Pillar III, Disclosure requirements";
			String anagram12Acronym = "PARC";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram12Acronym);
			
			
			
		}

		if(randomInt==13){

			String anagram13Title = "Reasons for monitoring experience";
			String anagram13Acronym = "MUT";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram13Acronym);
			
			
			
		}

		if(randomInt==14){

			String anagram14Title = "When monitoring, experience under investigation may have been affected by";
			String anagram14Acronym = "RATCH";
			
			textView = (TextView) findViewById(R.id.PullTestStringCAX10);//take in string
			textView.setText(anagram14Acronym);
			
			
		}



	}

	/////////////////////////DONE///////////////////////
	public void onClickTestYourselfTitleCAX10(View v){
		
		if (randomInt==1)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);

			CAX10Answer1Letter1.setText("S");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("D");
			CAX10Answer1Letter4.setText("L");
			CAX10Answer1Letter5.setText("I");
			CAX10Answer1Letter6.setText("F");
			CAX10Answer1Letter7.setText("E");
			
			
			String Acronym="SAD LIFE";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);

			CAX10Answer1Letter1.setText("D");
			CAX10Answer1Letter2.setText("I");
			CAX10Answer1Letter3.setText("P");
			CAX10Answer1Letter4.setText("S");
			CAX10Answer1Letter5.setText("I");
			CAX10Answer1Letter6.setText("S");
			
			
			String Acronym="Alternative risk transfer (ART) products";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FFOO00"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);
			CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);

			CAX10Answer1Letter1.setText("D");
			CAX10Answer1Letter2.setText("E");
			CAX10Answer1Letter3.setText("S");
			CAX10Answer1Letter4.setText("C");
			CAX10Answer1Letter5.setText("A");
			CAX10Answer1Letter6.setText("R");
			CAX10Answer1Letter7.setText("T");
			CAX10Answer1Letter8.setText("E");
			CAX10Answer1Letter9.setText("S");

			String Acronym="DESCARTES";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);

			CAX10Answer1Letter1.setText("S");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("F");
			CAX10Answer1Letter4.setText("E");
			CAX10Answer1Letter5.setText("R");
			
			
			String Acronym="SAFER";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("D");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("M");
			CAX10Answer1Letter4.setText("O");
			
			
			String Acronym="DAMO";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}

		if (randomInt==6)
		{
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("I");
			CAX10Answer1Letter2.setText("D");
			CAX10Answer1Letter3.setText("O");
			CAX10Answer1Letter4.setText("L");
			
			
			String Acronym="IDOL";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);


			CAX10Answer1Letter1.setText("G");
			CAX10Answer1Letter2.setText("I");
			CAX10Answer1Letter3.setText("R");
			CAX10Answer1Letter4.setText("L");
			
			
			String Acronym="GIRL";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);
			CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);
			CAX10Answer1Letter10 = (TextView) findViewById(R.id.CAX10Answer1Letter10);

			CAX10Answer1Letter1.setText("R");
			CAX10Answer1Letter2.setText("E");
			CAX10Answer1Letter3.setText("G");
			CAX10Answer1Letter4.setText("C");
			CAX10Answer1Letter5.setText("U");
			CAX10Answer1Letter6.setText("S");
			CAX10Answer1Letter7.setText("H");
			CAX10Answer1Letter8.setText("I");
			CAX10Answer1Letter9.setText("O");
			CAX10Answer1Letter10.setText("N");
			
			
			String Acronym="REG CUSHION";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);		CAX10Answer1Letter6 = (TextView) findViewById(R.id.CAX10Answer1Letter6);
			CAX10Answer1Letter7 = (TextView) findViewById(R.id.CAX10Answer1Letter7);
			CAX10Answer1Letter8 = (TextView) findViewById(R.id.CAX10Answer1Letter8);		CAX10Answer1Letter9 = (TextView) findViewById(R.id.CAX10Answer1Letter9);
			CAX10Answer1Letter10 = (TextView) findViewById(R.id.CAX10Answer1Letter10);
			CAX10Answer1Letter11 = (TextView) findViewById(R.id.CAX10Answer1Letter11);
			CAX10Answer1Letter12 = (TextView) findViewById(R.id.CAX10Answer1Letter12);
			CAX10Answer1Letter13 = (TextView) findViewById(R.id.CAX10Answer1Letter13);
			CAX10Answer1Letter14 = (TextView) findViewById(R.id.CAX10Answer1Letter14);

			CAX10Answer1Letter1.setText("S");
			CAX10Answer1Letter2.setText("L");
			CAX10Answer1Letter3.setText("U");
			CAX10Answer1Letter4.setText("M");
			CAX10Answer1Letter5.setText("C");
			CAX10Answer1Letter6.setText("R");
			CAX10Answer1Letter7.setText("E");
			CAX10Answer1Letter8.setText("S");
			CAX10Answer1Letter9.setText("S");
			CAX10Answer1Letter10.setText("D");
			CAX10Answer1Letter11.setText("W");
			CAX10Answer1Letter12.setText("A");
			CAX10Answer1Letter13.setText("R");
			CAX10Answer1Letter14.setText("F");
			
			
			String Acronym="SLUM CRESS DWARF";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);

			CAX10Answer1Letter1.setText("Q");
			CAX10Answer1Letter2.setText("S");
			CAX10Answer1Letter3.setText("D");
			
			
			String Acronym="QSD";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("P");
			CAX10Answer1Letter2.setText("I");
			CAX10Answer1Letter3.setText("S");
			CAX10Answer1Letter4.setText("A");
			
			
			String Acronym="PISA";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==12){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);

			CAX10Answer1Letter1.setText("P");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("R");
			CAX10Answer1Letter4.setText("C");
			
			
			String Acronym="PARC";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==13){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);

			CAX10Answer1Letter1.setText("M");
			CAX10Answer1Letter2.setText("U");
			CAX10Answer1Letter3.setText("T");
			
			
			String Acronym="MUT";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
		if (randomInt==14){
			
			CAX10Answer1Letter1 = (TextView) findViewById(R.id.CAX10Answer1Letter1);		CAX10Answer1Letter2 = (TextView) findViewById(R.id.CAX10Answer1Letter2);
			CAX10Answer1Letter3 = (TextView) findViewById(R.id.CAX10Answer1Letter3);		CAX10Answer1Letter4 = (TextView) findViewById(R.id.CAX10Answer1Letter4);
			CAX10Answer1Letter5 = (TextView) findViewById(R.id.CAX10Answer1Letter5);

			CAX10Answer1Letter1.setText("R");
			CAX10Answer1Letter2.setText("A");
			CAX10Answer1Letter3.setText("T");
			CAX10Answer1Letter4.setText("C");
			CAX10Answer1Letter5.setText("H");
			
			
			String Acronym="RATCH";

			EditTextTest = (EditText)findViewById(R.id.EditTextTestCAX10);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswerCAX10);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswer.setText(Acronym);
			}else{
				TextViewTitleAnswer.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswer.setText(Acronym);
			}

		}
	}














	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cax10, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_cax10,
					container, false);
			return rootView;
		}
	}

}
