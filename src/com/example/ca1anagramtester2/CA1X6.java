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

public class CA1X6 extends ActionBarActivity {

	EditText EditTextTestCA1X6;			TextView TextViewTitleAnswerCA1X6;			TextView textViewCA1X6;
	String useranswerCA1X6;

	EditText EditTextCA1X6Answer1;		EditText EditTextCA1X6Answer2;		EditText EditTextCA1X6Answer3;
	EditText EditTextCA1X6Answer4;		EditText EditTextCA1X6Answer5;		EditText EditTextCA1X6Answer6;
	EditText EditTextCA1X6Answer7;		EditText EditTextCA1X6Answer8;		EditText EditTextCA1X6Answer9;
	EditText EditTextCA1X6Answer10;		EditText EditTextCA1X6Answer11;		EditText EditTextCA1X6Answer12;
	EditText EditTextCA1X6Answer13;		EditText EditTextCA1X6Answer14;		EditText EditTextCA1X6Answer15;		EditText EditTextCA1X6Answer16;


	TextView CA1X6Answer1Letter1;		TextView CA1X6Answer1Letter2;		TextView CA1X6Answer1Letter3;
	TextView CA1X6Answer1Letter4;		TextView CA1X6Answer1Letter5;		TextView CA1X6Answer1Letter6;
	TextView CA1X6Answer1Letter7;		TextView CA1X6Answer1Letter8;		TextView CA1X6Answer1Letter9;
	TextView CA1X6Answer1Letter10;		TextView CA1X6Answer1Letter11;		TextView CA1X6Answer1Letter12;
	TextView CA1X6Answer1Letter13;		TextView CA1X6Answer1Letter14;		TextView CA1X6Answer1Letter15;		TextView CA1X6Answer1Letter16;


	TextView textViewAnswer1CA1X6;		TextView textViewAnswer2CA1X6;		TextView textViewAnswer3CA1X6;		TextView textViewAnswer4CA1X6;
	TextView textViewAnswer5CA1X6;		TextView textViewAnswer6CA1X6;		TextView textViewAnswer7CA1X6;		TextView textViewAnswer8CA1X6;
	TextView textViewAnswer9CA1X6;		TextView textViewAnswer10CA1X6;		TextView textViewAnswer11CA1X6;		TextView textViewAnswer12CA1X6;
	TextView textViewAnswer13CA1X6;		TextView textViewAnswer14CA1X6;		TextView textViewAnswer15CA1X6;		TextView textViewAnswer16CA1X6;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x6);

		EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
		textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);
		TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);


		CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
		CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
		CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
		CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
		CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);		CA1X6Answer1Letter10 = (TextView) findViewById(R.id.CA1X6Answer1Letter10);
		CA1X6Answer1Letter11 = (TextView) findViewById(R.id.CA1X6Answer1Letter11);		CA1X6Answer1Letter12 = (TextView) findViewById(R.id.CA1X6Answer1Letter12);
		CA1X6Answer1Letter13 = (TextView) findViewById(R.id.CA1X6Answer1Letter13);		CA1X6Answer1Letter14 = (TextView) findViewById(R.id.CA1X6Answer1Letter14);
		CA1X6Answer1Letter15 = (TextView) findViewById(R.id.CA1X6Answer1Letter15);		CA1X6Answer1Letter16 = (TextView) findViewById(R.id.CA1X6Answer1Letter16);


		EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
		EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
		EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);		EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);
		EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);		EditTextCA1X6Answer8 = (EditText)findViewById(R.id.EditTextCA1X6Answer8);
		EditTextCA1X6Answer9 = (EditText)findViewById(R.id.EditTextCA1X6Answer9);		EditTextCA1X6Answer10 = (EditText)findViewById(R.id.EditTextCA1X6Answer10);
		EditTextCA1X6Answer11 = (EditText)findViewById(R.id.EditTextCA1X6Answer11);		EditTextCA1X6Answer12 = (EditText)findViewById(R.id.EditTextCA1X6Answer12);
		EditTextCA1X6Answer13 = (EditText)findViewById(R.id.EditTextCA1X6Answer13);		EditTextCA1X6Answer14 = (EditText)findViewById(R.id.EditTextCA1X6Answer14);
		EditTextCA1X6Answer15 = (EditText)findViewById(R.id.EditTextCA1X6Answer15);		EditTextCA1X6Answer16 = (EditText)findViewById(R.id.EditTextCA1X6Answer16);


		textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
		textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
		textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);		textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);
		textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);		textViewAnswer8CA1X6 = (TextView) findViewById(R.id.textViewAnswer8CA1X6);
		textViewAnswer9CA1X6 = (TextView) findViewById(R.id.textViewAnswer9CA1X6);		textViewAnswer10CA1X6 = (TextView) findViewById(R.id.textViewAnswer10CA1X6);
		textViewAnswer11CA1X6 = (TextView) findViewById(R.id.textViewAnswer11CA1X6);		textViewAnswer12CA1X6 = (TextView) findViewById(R.id.textViewAnswer12CA1X6);
		textViewAnswer13CA1X6 = (TextView) findViewById(R.id.textViewAnswer13CA1X6);		textViewAnswer14CA1X6 = (TextView) findViewById(R.id.textViewAnswer14CA1X6);
		textViewAnswer15CA1X6 = (TextView) findViewById(R.id.textViewAnswer15CA1X6);		textViewAnswer16CA1X6 = (TextView) findViewById(R.id.textViewAnswer16CA1X6);


		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	////////////////////////DONE////////////////
	public void onClickCA1X6TestAnswers(View v)
	{
		if (randomInt==1)
		{

			String Acronym1Answer1="Default (probability of)";
			String Acronym1Answer2="Objectives (failing to achieve)";
			String Acronym1Answer3="Underperforming compared to investors";
			String Acronym1Answer4="Return expected variablity";
			


			EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
			EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
			EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);
			EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);
			EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);


			textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
			textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
			textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);
			textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);
			textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);

			String checkuseranswerCA1X61=EditTextCA1X6Answer1.getText().toString();	String checkuseranswerCA1X62=EditTextCA1X6Answer2.getText().toString();
			String checkuseranswerCA1X63=EditTextCA1X6Answer3.getText().toString();	String checkuseranswerCA1X64=EditTextCA1X6Answer4.getText().toString();
			String checkuseranswerCA1X65=EditTextCA1X6Answer5.getText().toString();
			String checkuseranswerCA1X66=EditTextCA1X6Answer5.getText().toString();
			String checkuseranswerCA1X67=EditTextCA1X6Answer5.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCA1X61)){
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X6.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X6.setText(Acronym1Answer1);
			}

			if(Acronym1Answer2.equals(checkuseranswerCA1X62)){
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X6.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X6.setText(Acronym1Answer2);
			}

			if(Acronym1Answer3.equals(checkuseranswerCA1X63)){
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X6.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X6.setText(Acronym1Answer3);
			}

			if(Acronym1Answer4.equals(checkuseranswerCA1X64)){
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X6.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X6.setText(Acronym1Answer4);
			}

			
		}
		if(randomInt==2){


			String Acronym2Answer1="Variablity of market values (short-term stability seems	more important)";
			String Acronym2Answer2="Asset classes returns (expected returns, taxation, expenses, feel-good factor)";
			String Acronym2Answer3="Nature of their assets and liabilities (real, domestic)";
			String Acronym2Answer4="Practical considerations (high expenses, lack of expertise)";
			String Acronym2Answer5="Investment freedom and constraints (risk appetite, individual's excess assets,uncertainty of future income and outgo, expenses, lack of expertise)";
			String Acronym2Answer6="Cashflow requirements (when are assets proceeds required)";
			


			EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
			EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
			EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);		EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);
			EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);		EditTextCA1X6Answer8 = (EditText)findViewById(R.id.EditTextCA1X6Answer8);
			EditTextCA1X6Answer9 = (EditText)findViewById(R.id.EditTextCA1X6Answer9);
			EditTextCA1X6Answer10 = (EditText)findViewById(R.id.EditTextCA1X6Answer10);


			textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
			textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
			textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);		textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);
			textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);		textViewAnswer8CA1X6 = (TextView) findViewById(R.id.textViewAnswer8CA1X6);
			textViewAnswer9CA1X6 = (TextView) findViewById(R.id.textViewAnswer9CA1X6);
			textViewAnswer10CA1X6 = (TextView) findViewById(R.id.textViewAnswer10CA1X6);

			String checkuseranswerCA1X61=EditTextCA1X6Answer1.getText().toString();	String checkuseranswerCA1X62=EditTextCA1X6Answer2.getText().toString();
			String checkuseranswerCA1X63=EditTextCA1X6Answer3.getText().toString();	String checkuseranswerCA1X64=EditTextCA1X6Answer4.getText().toString();
			String checkuseranswerCA1X65=EditTextCA1X6Answer5.getText().toString();	String checkuseranswerCA1X66=EditTextCA1X6Answer6.getText().toString();
			String checkuseranswerCA1X67=EditTextCA1X6Answer7.getText().toString();	String checkuseranswerCA1X68=EditTextCA1X6Answer8.getText().toString();
			String checkuseranswerCA1X69=EditTextCA1X6Answer9.getText().toString();
			String checkuseranswerCA1X610=EditTextCA1X6Answer10.getText().toString();

			if(Acronym2Answer1.equals(checkuseranswerCA1X61)){
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X6.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X6.setText(Acronym2Answer1);
			}

			if(Acronym2Answer2.equals(checkuseranswerCA1X62)){
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X6.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X6.setText(Acronym2Answer2);
			}

			if(Acronym2Answer3.equals(checkuseranswerCA1X63)){
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X6.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X6.setText(Acronym2Answer3);
			}

			if(Acronym2Answer4.equals(checkuseranswerCA1X64)){
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X6.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X6.setText(Acronym2Answer4);
			}

			if(Acronym2Answer5.equals(checkuseranswerCA1X65)){
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X6.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X6.setText(Acronym2Answer5);
			}

			if(Acronym2Answer6.equals(checkuseranswerCA1X66)){
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X6.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X6.setText(Acronym2Answer6);
			}


		}
		if(randomInt==3){

			String Acronym3Answer1="Size of the assets in relation to the liabilities and in absolute terms";
			String Acronym3Answer2="Other funds strategies (competition)";
			String Acronym3Answer3="Uncertainty level of existing liabilities, both in amount and timing";
			String Acronym3Answer4="Nature of existing liabilities (fixed, real, varying)";
			String Acronym3Answer5="Diversification need";
			String Acronym3Answer6="Existing asset portfolio (level of free assets)";
			String Acronym3Answer7="Restrictions (statutory, legal, voluntary)";
			String Acronym3Answer8="Term of existing liabilities";
			String Acronym3Answer9="Return (expected long-term return from various asset classes)";
			String Acronym3Answer10="Accrual of future liabilities";
			String Acronym3Answer11="Currency of existing liabilities";
			String Acronym3Answer12="Tax (tax of different investments and tax position of the investor)";
			String Acronym3Answer13="Objectives of the institution";
			String Acronym3Answer14="Risk appetite of the institution";
			String Acronym3Answer15="Statutory valuation and solvency requirements";


			EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
			EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
			EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);		EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);
			EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);
			EditTextCA1X6Answer8 = (EditText)findViewById(R.id.EditTextCA1X6Answer8);
			EditTextCA1X6Answer9 = (EditText)findViewById(R.id.EditTextCA1X6Answer9);
			EditTextCA1X6Answer10 = (EditText)findViewById(R.id.EditTextCA1X6Answer10);
			EditTextCA1X6Answer11 = (EditText)findViewById(R.id.EditTextCA1X6Answer11);
			EditTextCA1X6Answer12 = (EditText)findViewById(R.id.EditTextCA1X6Answer12);
			EditTextCA1X6Answer13 = (EditText)findViewById(R.id.EditTextCA1X6Answer13);
			EditTextCA1X6Answer14 = (EditText)findViewById(R.id.EditTextCA1X6Answer14);
			EditTextCA1X6Answer15 = (EditText)findViewById(R.id.EditTextCA1X6Answer15);


			textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
			textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
			textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);		textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);
			textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);
			textViewAnswer8CA1X6 = (TextView) findViewById(R.id.textViewAnswer8CA1X6);
			textViewAnswer9CA1X6 = (TextView) findViewById(R.id.textViewAnswer9CA1X6);
			textViewAnswer10CA1X6 = (TextView) findViewById(R.id.textViewAnswer10CA1X6);
			textViewAnswer11CA1X6 = (TextView) findViewById(R.id.textViewAnswer11CA1X6);
			textViewAnswer12CA1X6 = (TextView) findViewById(R.id.textViewAnswer12CA1X6);
			textViewAnswer13CA1X6 = (TextView) findViewById(R.id.textViewAnswer13CA1X6);
			textViewAnswer14CA1X6 = (TextView) findViewById(R.id.textViewAnswer14CA1X6);
			textViewAnswer15CA1X6 = (TextView) findViewById(R.id.textViewAnswer15CA1X6);

			String checkuseranswerCA1X61=EditTextCA1X6Answer1.getText().toString();		String checkuseranswerCA1X62=EditTextCA1X6Answer2.getText().toString();
			String checkuseranswerCA1X63=EditTextCA1X6Answer3.getText().toString();		String checkuseranswerCA1X64=EditTextCA1X6Answer4.getText().toString();
			String checkuseranswerCA1X65=EditTextCA1X6Answer5.getText().toString();		String checkuseranswerCA1X66=EditTextCA1X6Answer6.getText().toString();
			String checkuseranswerCA1X67=EditTextCA1X6Answer7.getText().toString();
			String checkuseranswerCA1X68=EditTextCA1X6Answer8.getText().toString();
			String checkuseranswerCA1X69=EditTextCA1X6Answer9.getText().toString();
			String checkuseranswerCA1X610=EditTextCA1X6Answer10.getText().toString();
			String checkuseranswerCA1X611=EditTextCA1X6Answer11.getText().toString();
			String checkuseranswerCA1X612=EditTextCA1X6Answer12.getText().toString();
			String checkuseranswerCA1X613=EditTextCA1X6Answer13.getText().toString();
			String checkuseranswerCA1X614=EditTextCA1X6Answer14.getText().toString();
			String checkuseranswerCA1X615=EditTextCA1X6Answer15.getText().toString();

			if(Acronym3Answer1.equals(checkuseranswerCA1X61)){
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X6.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X6.setText(Acronym3Answer1);
			}

			if(Acronym3Answer2.equals(checkuseranswerCA1X62)){
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X6.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X6.setText(Acronym3Answer2);
			}

			if(Acronym3Answer3.equals(checkuseranswerCA1X63)){
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X6.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X6.setText(Acronym3Answer3);
			}

			if(Acronym3Answer4.equals(checkuseranswerCA1X64)){
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X6.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X6.setText(Acronym3Answer4);
			}

			if(Acronym3Answer5.equals(checkuseranswerCA1X65)){
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X6.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X6.setText(Acronym3Answer5);
			}

			if(Acronym3Answer6.equals(checkuseranswerCA1X66)){
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X6.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X6.setText(Acronym3Answer6);
			}

			if(Acronym3Answer7.equals(checkuseranswerCA1X67)){
				textViewAnswer7CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X6.setText(Acronym3Answer7);
			}else{
				textViewAnswer7CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X6.setText(Acronym3Answer7);
			}

			if(Acronym3Answer8.equals(checkuseranswerCA1X68)){
				textViewAnswer8CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X6.setText(Acronym3Answer8);
			}else{
				textViewAnswer8CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X6.setText(Acronym3Answer8);
			}

			if(Acronym3Answer9.equals(checkuseranswerCA1X69)){
				textViewAnswer9CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X6.setText(Acronym3Answer9);
			}else{
				textViewAnswer9CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X6.setText(Acronym3Answer9);
			}

			if(Acronym3Answer10.equals(checkuseranswerCA1X610)){
				textViewAnswer10CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X6.setText(Acronym3Answer10);
			}else{
				textViewAnswer10CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X6.setText(Acronym3Answer10);
			}

			if(Acronym3Answer11.equals(checkuseranswerCA1X611)){
				textViewAnswer11CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X6.setText(Acronym3Answer11);
			}else{
				textViewAnswer11CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X6.setText(Acronym3Answer11);
			}

			if(Acronym3Answer12.equals(checkuseranswerCA1X612)){
				textViewAnswer12CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X6.setText(Acronym3Answer12);
			}else{
				textViewAnswer12CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X6.setText(Acronym3Answer12);
			}
			
			if(Acronym3Answer13.equals(checkuseranswerCA1X613)){
				textViewAnswer13CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X6.setText(Acronym3Answer13);
			}else{
				textViewAnswer13CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X6.setText(Acronym3Answer13);
			}
			
			if(Acronym3Answer14.equals(checkuseranswerCA1X614)){
				textViewAnswer14CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CA1X6.setText(Acronym3Answer14);
			}else{
				textViewAnswer14CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CA1X6.setText(Acronym3Answer14);
			}
			
			if(Acronym3Answer15.equals(checkuseranswerCA1X615)){
				textViewAnswer15CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CA1X6.setText(Acronym3Answer15);
			}else{
				textViewAnswer15CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CA1X6.setText(Acronym3Answer15);
			}



		}
		if(randomInt==4){


			String Acronym4Answer1="Types of assets that an investor can invest in (restrictions)";
			String Acronym4Answer2="Extent of mismatching allowed is limited";
			String Acronym4Answer3="Currency (match assets and liabilities by currency)";
			String Acronym4Answer4="Hold a certain proportion of total assets in a particular class (eg gov stock)";
			String Acronym4Answer5="Single counterparty maximum exposure";
			String Acronym4Answer6="Custodianship of assets";
			String Acronym4Answer7="Amount of any one asset used to demonstrate solvency";
			String Acronym4Answer8="Mismatching reserve (requirement to hold one)";


			EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
			EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
			EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);		
			EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);		
			EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);		
			EditTextCA1X6Answer8 = (EditText)findViewById(R.id.EditTextCA1X6Answer8);		



			textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
			textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
			textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);		
			textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);		
			textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);		
			textViewAnswer8CA1X6 = (TextView) findViewById(R.id.textViewAnswer8CA1X6);		


			String checkuseranswerCA1X61=EditTextCA1X6Answer1.getText().toString();	String checkuseranswerCA1X62=EditTextCA1X6Answer2.getText().toString();
			String checkuseranswerCA1X63=EditTextCA1X6Answer3.getText().toString();	String checkuseranswerCA1X64=EditTextCA1X6Answer4.getText().toString();
			String checkuseranswerCA1X65=EditTextCA1X6Answer5.getText().toString();	
			String checkuseranswerCA1X66=EditTextCA1X6Answer6.getText().toString();	
			String checkuseranswerCA1X67=EditTextCA1X6Answer7.getText().toString();	
			String checkuseranswerCA1X68=EditTextCA1X6Answer8.getText().toString();	


			if(Acronym4Answer1.equals(checkuseranswerCA1X61)){
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X6.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X6.setText(Acronym4Answer1);
			}

			if(Acronym4Answer2.equals(checkuseranswerCA1X62)){
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X6.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X6.setText(Acronym4Answer2);
			}

			if(Acronym4Answer3.equals(checkuseranswerCA1X63)){
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X6.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X6.setText(Acronym4Answer3);
			}

			if(Acronym4Answer4.equals(checkuseranswerCA1X64)){
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X6.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X6.setText(Acronym4Answer4);
			}

			if(Acronym4Answer5.equals(checkuseranswerCA1X65)){
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X6.setText(Acronym4Answer5);
			}else{
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X6.setText(Acronym4Answer5);
			}

			if(Acronym4Answer6.equals(checkuseranswerCA1X66)){
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X6.setText(Acronym4Answer6);
			}else{
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X6.setText(Acronym4Answer6);
			}

			if(Acronym4Answer7.equals(checkuseranswerCA1X67)){
				textViewAnswer7CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X6.setText(Acronym4Answer7);
			}else{
				textViewAnswer7CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X6.setText(Acronym4Answer7);
			}

			if(Acronym4Answer8.equals(checkuseranswerCA1X68)){
				textViewAnswer8CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X6.setText(Acronym4Answer8);
			}else{
				textViewAnswer8CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X6.setText(Acronym4Answer8);
			}


		}
		if(randomInt==5){


			String Acronym5Answer1="Fixed monetary liabilities (immunisation generally aimed at)";
			String Acronym5Answer2="Investments in equities and property ruled out";
			String Acronym5Answer3="Rebalance portfolio consistently";
			String Acronym5Answer4="Mismatching profits possibility removed";
			String Acronym5Answer5="Small changes in interest rate relied upon by theory";
			String Acronym5Answer6="Flat yield curve assumed and requires same change in interest rate at all times";
			String Acronym5Answer7="Assets of a suitably long discounted mean term may not exist";
			String Acronym5Answer8="Ignores dealing costs of rebalancing portfolio";
			String Acronym5Answer9="time lag if index-linked assets/liabilities used";

			EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
			EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
			EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);
			EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);
			EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);
			EditTextCA1X6Answer8 = (EditText)findViewById(R.id.EditTextCA1X6Answer8);
			EditTextCA1X6Answer9 = (EditText)findViewById(R.id.EditTextCA1X6Answer9);


			textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
			textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
			textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);
			textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);
			textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);
			textViewAnswer8CA1X6 = (TextView) findViewById(R.id.textViewAnswer8CA1X6);
			textViewAnswer9CA1X6 = (TextView) findViewById(R.id.textViewAnswer9CA1X6);


			String checkuseranswerCA1X61=EditTextCA1X6Answer1.getText().toString();	String checkuseranswerCA1X62=EditTextCA1X6Answer2.getText().toString();
			String checkuseranswerCA1X63=EditTextCA1X6Answer3.getText().toString();	String checkuseranswerCA1X64=EditTextCA1X6Answer4.getText().toString();
			String checkuseranswerCA1X65=EditTextCA1X6Answer5.getText().toString();
			String checkuseranswerCA1X66=EditTextCA1X6Answer6.getText().toString();
			String checkuseranswerCA1X67=EditTextCA1X6Answer7.getText().toString();
			String checkuseranswerCA1X68=EditTextCA1X6Answer8.getText().toString();
			String checkuseranswerCA1X69=EditTextCA1X6Answer9.getText().toString();


			if(Acronym5Answer1.equals(checkuseranswerCA1X61)){
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X6.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X6.setText(Acronym5Answer1);
			}

			if(Acronym5Answer2.equals(checkuseranswerCA1X62)){
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X6.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X6.setText(Acronym5Answer2);
			}

			if(Acronym5Answer3.equals(checkuseranswerCA1X63)){
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X6.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X6.setText(Acronym5Answer3);
			}

			if(Acronym5Answer4.equals(checkuseranswerCA1X64)){
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X6.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X6.setText(Acronym5Answer4);
			}

			if(Acronym5Answer5.equals(checkuseranswerCA1X65)){
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X6.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X6.setText(Acronym5Answer5);
			}
			
			if(Acronym5Answer6.equals(checkuseranswerCA1X66)){
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X6.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X6.setText(Acronym5Answer6);
			}

			if(Acronym5Answer7.equals(checkuseranswerCA1X67)){
				textViewAnswer7CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X6.setText(Acronym5Answer7);
			}else{
				textViewAnswer7CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X6.setText(Acronym5Answer7);
			}
			
			if(Acronym5Answer8.equals(checkuseranswerCA1X68)){
				textViewAnswer8CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X6.setText(Acronym5Answer8);
			}else{
				textViewAnswer8CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X6.setText(Acronym5Answer8);
			}
			
			if(Acronym5Answer9.equals(checkuseranswerCA1X69)){
				textViewAnswer9CA1X6.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X6.setText(Acronym5Answer9);
			}else{
				textViewAnswer9CA1X6.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X6.setText(Acronym5Answer9);
			}

		}
		

	}

	//////////////////////DONE/////////////////
	public void onClickGetAcronymCA1X6(View v)
	{

		TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);
		TextViewTitleAnswerCA1X6.setText(null);

		EditTextTestCA1X6 = (EditText) findViewById(R.id.EditTextTestCA1X6);
		EditTextTestCA1X6.setText(null);

		CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
		CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
		CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
		CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
		CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);		CA1X6Answer1Letter10 = (TextView) findViewById(R.id.CA1X6Answer1Letter10);
		CA1X6Answer1Letter11 = (TextView) findViewById(R.id.CA1X6Answer1Letter11);		CA1X6Answer1Letter12 = (TextView) findViewById(R.id.CA1X6Answer1Letter12);
		CA1X6Answer1Letter13 = (TextView) findViewById(R.id.CA1X6Answer1Letter13);		CA1X6Answer1Letter14 = (TextView) findViewById(R.id.CA1X6Answer1Letter14);
		CA1X6Answer1Letter15 = (TextView) findViewById(R.id.CA1X6Answer1Letter15);		CA1X6Answer1Letter16 = (TextView) findViewById(R.id.CA1X6Answer1Letter16);

		CA1X6Answer1Letter1.setText(null);		CA1X6Answer1Letter2.setText(null);		CA1X6Answer1Letter3.setText(null);		CA1X6Answer1Letter4.setText(null);
		CA1X6Answer1Letter5.setText(null);		CA1X6Answer1Letter6.setText(null);		CA1X6Answer1Letter7.setText(null);		CA1X6Answer1Letter8.setText(null);
		CA1X6Answer1Letter9.setText(null);		CA1X6Answer1Letter10.setText(null);		CA1X6Answer1Letter11.setText(null);		CA1X6Answer1Letter12.setText(null);
		CA1X6Answer1Letter13.setText(null);		CA1X6Answer1Letter13.setText(null);		CA1X6Answer1Letter14.setText(null);		CA1X6Answer1Letter15.setText(null);
		CA1X6Answer1Letter16.setText(null);



		EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
		EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
		EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);		EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);
		EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);		EditTextCA1X6Answer8 = (EditText)findViewById(R.id.EditTextCA1X6Answer8);
		EditTextCA1X6Answer9 = (EditText)findViewById(R.id.EditTextCA1X6Answer9);		EditTextCA1X6Answer10 = (EditText)findViewById(R.id.EditTextCA1X6Answer10);
		EditTextCA1X6Answer11 = (EditText)findViewById(R.id.EditTextCA1X6Answer11);		EditTextCA1X6Answer12 = (EditText)findViewById(R.id.EditTextCA1X6Answer12);
		EditTextCA1X6Answer13 = (EditText)findViewById(R.id.EditTextCA1X6Answer13);		EditTextCA1X6Answer14 = (EditText)findViewById(R.id.EditTextCA1X6Answer14);
		EditTextCA1X6Answer15 = (EditText)findViewById(R.id.EditTextCA1X6Answer15);		EditTextCA1X6Answer16 = (EditText)findViewById(R.id.EditTextCA1X6Answer16);

		EditTextCA1X6Answer1.setText(null);		EditTextCA1X6Answer2.setText(null);		EditTextCA1X6Answer3.setText(null);		EditTextCA1X6Answer4.setText(null);
		EditTextCA1X6Answer5.setText(null);		EditTextCA1X6Answer6.setText(null);		EditTextCA1X6Answer7.setText(null);		EditTextCA1X6Answer8.setText(null);
		EditTextCA1X6Answer9.setText(null);		EditTextCA1X6Answer10.setText(null);		EditTextCA1X6Answer11.setText(null);		EditTextCA1X6Answer12.setText(null);
		EditTextCA1X6Answer13.setText(null);		EditTextCA1X6Answer14.setText(null);		EditTextCA1X6Answer15.setText(null);
		EditTextCA1X6Answer16.setText(null);

		textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
		textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
		textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);		textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);
		textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);		textViewAnswer8CA1X6 = (TextView) findViewById(R.id.textViewAnswer8CA1X6);
		textViewAnswer9CA1X6 = (TextView) findViewById(R.id.textViewAnswer9CA1X6);		textViewAnswer10CA1X6 = (TextView) findViewById(R.id.textViewAnswer10CA1X6);
		textViewAnswer11CA1X6 = (TextView) findViewById(R.id.textViewAnswer11CA1X6);		textViewAnswer12CA1X6 = (TextView) findViewById(R.id.textViewAnswer12CA1X6);
		textViewAnswer13CA1X6 = (TextView) findViewById(R.id.textViewAnswer13CA1X6);		textViewAnswer14CA1X6 = (TextView) findViewById(R.id.textViewAnswer14CA1X6);
		textViewAnswer15CA1X6 = (TextView) findViewById(R.id.textViewAnswer15CA1X6);		textViewAnswer16CA1X6 = (TextView) findViewById(R.id.textViewAnswer16CA1X6);

		textViewAnswer1CA1X6.setText(null);		textViewAnswer2CA1X6.setText(null);		textViewAnswer3CA1X6.setText(null);		textViewAnswer4CA1X6.setText(null);
		textViewAnswer5CA1X6.setText(null);		textViewAnswer6CA1X6.setText(null);		textViewAnswer7CA1X6.setText(null);		textViewAnswer8CA1X6.setText(null);
		textViewAnswer9CA1X6.setText(null);		textViewAnswer10CA1X6.setText(null);		textViewAnswer11CA1X6.setText(null);		textViewAnswer12CA1X6.setText(null);
		textViewAnswer13CA1X6.setText(null);		textViewAnswer14CA1X6.setText(null);		textViewAnswer15CA1X6.setText(null);		textViewAnswer16CA1X6.setText(null);

		Random randomNum = new Random();
		randomInt = randomNum.nextInt(5)+1;//when you click "Display Database"

		TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);
		TextViewTitleAnswerCA1X6.setText(null);

		EditTextTestCA1X6 = (EditText) findViewById(R.id.EditTextTestCA1X6);
		EditTextTestCA1X6.setText(null);

		if(randomInt == 1){

			String Acronym1Acronym ="DOUR";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym1Acronym);

		}

		if(randomInt == 2){

			String Acronym2Acronym ="VAN PIC";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym2Acronym);



		}

		if(randomInt == 3){

			String Acronym3Acronym ="SOUNDER TRACTORS";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym3Acronym);



		}

		if(randomInt == 4){

			String Acronym4Acronym ="TECH SCAM";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym4Acronym);


		}

		if(randomInt == 5){

			String Acronym5Acronym ="FIRMS FAIL";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym5Acronym);


		}

		
	}

	/////////////////////DONE/////////////////////
	public void onClickTestYourselfAcronymCA1X6(View v)
	{

		if (randomInt==1)
		{

			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);
			CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);

			CA1X6Answer1Letter1.setText("D");
			CA1X6Answer1Letter2.setText("O");
			CA1X6Answer1Letter3.setText("U");
			CA1X6Answer1Letter4.setText("R");
			

			String Acronym="DOUR";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}
		}

		if (randomInt==2)
		{


			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
			CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);
			CA1X6Answer1Letter10 = (TextView) findViewById(R.id.CA1X6Answer1Letter10);

			CA1X6Answer1Letter1.setText("V");
			CA1X6Answer1Letter2.setText("A");
			CA1X6Answer1Letter3.setText("N");
			CA1X6Answer1Letter4.setText("P");
			CA1X6Answer1Letter5.setText("I");
			CA1X6Answer1Letter6.setText("C");
			


			String Acronym="VAN PIC";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}
		}

		if (randomInt==3)
		{			
			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
			CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);
			CA1X6Answer1Letter10 = (TextView) findViewById(R.id.CA1X6Answer1Letter10);
			CA1X6Answer1Letter11 = (TextView) findViewById(R.id.CA1X6Answer1Letter11);
			CA1X6Answer1Letter12 = (TextView) findViewById(R.id.CA1X6Answer1Letter12);
			CA1X6Answer1Letter13 = (TextView) findViewById(R.id.CA1X6Answer1Letter13);
			CA1X6Answer1Letter14 = (TextView) findViewById(R.id.CA1X6Answer1Letter14);
			CA1X6Answer1Letter15 = (TextView) findViewById(R.id.CA1X6Answer1Letter15);

			CA1X6Answer1Letter1.setText("S");
			CA1X6Answer1Letter2.setText("O");
			CA1X6Answer1Letter3.setText("U");
			CA1X6Answer1Letter4.setText("N");
			CA1X6Answer1Letter5.setText("D");
			CA1X6Answer1Letter6.setText("E");
			CA1X6Answer1Letter7.setText("R");
			CA1X6Answer1Letter8.setText("T");
			CA1X6Answer1Letter9.setText("R");
			CA1X6Answer1Letter10.setText("A");
			CA1X6Answer1Letter11.setText("C");
			CA1X6Answer1Letter12.setText("T");
			CA1X6Answer1Letter13.setText("O");
			CA1X6Answer1Letter14.setText("R");
			CA1X6Answer1Letter15.setText("S");

			String Acronym="SOUNDER TRACTORS";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}
		}

		if (randomInt==4)
		{

			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		
			CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);		
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		
			CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);		


			CA1X6Answer1Letter1.setText("T");
			CA1X6Answer1Letter2.setText("E");
			CA1X6Answer1Letter3.setText("C");
			CA1X6Answer1Letter4.setText("H");
			CA1X6Answer1Letter5.setText("S");
			CA1X6Answer1Letter6.setText("C");
			CA1X6Answer1Letter7.setText("A");
			CA1X6Answer1Letter8.setText("M");

			String Acronym="TECH SCAM";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}
		}
		if (randomInt==5)
		{


			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);
			CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);
			CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
			CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);

			CA1X6Answer1Letter1.setText("F");
			CA1X6Answer1Letter2.setText("I");
			CA1X6Answer1Letter3.setText("R");
			CA1X6Answer1Letter4.setText("M");
			CA1X6Answer1Letter5.setText("S");
			CA1X6Answer1Letter6.setText("F");
			CA1X6Answer1Letter7.setText("A");
			CA1X6Answer1Letter8.setText("I");
			CA1X6Answer1Letter9.setText("L");


			String Acronym="FIRMS FAIL";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}

		}

		
	}

	//////////////////////DONE//////////////////
	public void onClickGetTitleCA1X6(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(5)+1;//when you click "Display Database"

		TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);
		TextViewTitleAnswerCA1X6.setText(null);

		EditTextTestCA1X6 = (EditText) findViewById(R.id.EditTextTestCA1X6);
		EditTextTestCA1X6.setText(null);

		CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
		CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
		CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
		CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
		CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);		CA1X6Answer1Letter10 = (TextView) findViewById(R.id.CA1X6Answer1Letter10);
		CA1X6Answer1Letter11 = (TextView) findViewById(R.id.CA1X6Answer1Letter11);		CA1X6Answer1Letter12 = (TextView) findViewById(R.id.CA1X6Answer1Letter12);
		CA1X6Answer1Letter13 = (TextView) findViewById(R.id.CA1X6Answer1Letter13);		CA1X6Answer1Letter14 = (TextView) findViewById(R.id.CA1X6Answer1Letter14);
		CA1X6Answer1Letter15 = (TextView) findViewById(R.id.CA1X6Answer1Letter15);		CA1X6Answer1Letter16 = (TextView) findViewById(R.id.CA1X6Answer1Letter16);

		CA1X6Answer1Letter1.setText(null);		CA1X6Answer1Letter2.setText(null);		CA1X6Answer1Letter3.setText(null);
		CA1X6Answer1Letter4.setText(null);		CA1X6Answer1Letter5.setText(null);		CA1X6Answer1Letter6.setText(null);
		CA1X6Answer1Letter7.setText(null);		CA1X6Answer1Letter8.setText(null);		CA1X6Answer1Letter9.setText(null);
		CA1X6Answer1Letter10.setText(null);		CA1X6Answer1Letter11.setText(null);		CA1X6Answer1Letter12.setText(null);
		CA1X6Answer1Letter13.setText(null);		CA1X6Answer1Letter13.setText(null);		CA1X6Answer1Letter14.setText(null);
		CA1X6Answer1Letter15.setText(null);		CA1X6Answer1Letter16.setText(null);



		EditTextCA1X6Answer1 = (EditText)findViewById(R.id.EditTextCA1X6Answer1);		EditTextCA1X6Answer2 = (EditText)findViewById(R.id.EditTextCA1X6Answer2);
		EditTextCA1X6Answer3 = (EditText)findViewById(R.id.EditTextCA1X6Answer3);		EditTextCA1X6Answer4 = (EditText)findViewById(R.id.EditTextCA1X6Answer4);
		EditTextCA1X6Answer5 = (EditText)findViewById(R.id.EditTextCA1X6Answer5);		EditTextCA1X6Answer6 = (EditText)findViewById(R.id.EditTextCA1X6Answer6);
		EditTextCA1X6Answer7 = (EditText)findViewById(R.id.EditTextCA1X6Answer7);		EditTextCA1X6Answer8 = (EditText)findViewById(R.id.EditTextCA1X6Answer8);
		EditTextCA1X6Answer9 = (EditText)findViewById(R.id.EditTextCA1X6Answer9);		EditTextCA1X6Answer10 = (EditText)findViewById(R.id.EditTextCA1X6Answer10);
		EditTextCA1X6Answer11 = (EditText)findViewById(R.id.EditTextCA1X6Answer11);		EditTextCA1X6Answer12 = (EditText)findViewById(R.id.EditTextCA1X6Answer12);
		EditTextCA1X6Answer13 = (EditText)findViewById(R.id.EditTextCA1X6Answer13);		EditTextCA1X6Answer14 = (EditText)findViewById(R.id.EditTextCA1X6Answer14);
		EditTextCA1X6Answer15 = (EditText)findViewById(R.id.EditTextCA1X6Answer15);		EditTextCA1X6Answer16 = (EditText)findViewById(R.id.EditTextCA1X6Answer16);

		EditTextCA1X6Answer1.setText(null);		EditTextCA1X6Answer2.setText(null);		EditTextCA1X6Answer3.setText(null);
		EditTextCA1X6Answer4.setText(null);		EditTextCA1X6Answer5.setText(null);		EditTextCA1X6Answer6.setText(null);
		EditTextCA1X6Answer7.setText(null);		EditTextCA1X6Answer8.setText(null);		EditTextCA1X6Answer9.setText(null);
		EditTextCA1X6Answer10.setText(null);		EditTextCA1X6Answer11.setText(null);		EditTextCA1X6Answer12.setText(null);
		EditTextCA1X6Answer13.setText(null);		EditTextCA1X6Answer14.setText(null);		EditTextCA1X6Answer15.setText(null);
		EditTextCA1X6Answer16.setText(null);

		textViewAnswer1CA1X6 = (TextView) findViewById(R.id.textViewAnswer1CA1X6);		textViewAnswer2CA1X6= (TextView) findViewById(R.id.textViewAnswer2CA1X6);
		textViewAnswer3CA1X6 = (TextView) findViewById(R.id.textViewAnswer3CA1X6);		textViewAnswer4CA1X6 = (TextView) findViewById(R.id.textViewAnswer4CA1X6);
		textViewAnswer5CA1X6 = (TextView) findViewById(R.id.textViewAnswer5CA1X6);		textViewAnswer6CA1X6 = (TextView) findViewById(R.id.textViewAnswer6CA1X6);
		textViewAnswer7CA1X6 = (TextView) findViewById(R.id.textViewAnswer7CA1X6);		textViewAnswer8CA1X6 = (TextView) findViewById(R.id.textViewAnswer8CA1X6);
		textViewAnswer9CA1X6 = (TextView) findViewById(R.id.textViewAnswer9CA1X6);		textViewAnswer10CA1X6 = (TextView) findViewById(R.id.textViewAnswer10CA1X6);
		textViewAnswer11CA1X6 = (TextView) findViewById(R.id.textViewAnswer11CA1X6);		textViewAnswer12CA1X6 = (TextView) findViewById(R.id.textViewAnswer12CA1X6);
		textViewAnswer13CA1X6 = (TextView) findViewById(R.id.textViewAnswer13CA1X6);		textViewAnswer14CA1X6 = (TextView) findViewById(R.id.textViewAnswer14CA1X6);
		textViewAnswer15CA1X6 = (TextView) findViewById(R.id.textViewAnswer15CA1X6);		textViewAnswer16CA1X6 = (TextView) findViewById(R.id.textViewAnswer16CA1X6);

		textViewAnswer1CA1X6.setText(null);		textViewAnswer2CA1X6.setText(null);		textViewAnswer3CA1X6.setText(null);
		textViewAnswer4CA1X6.setText(null);		textViewAnswer5CA1X6.setText(null);		textViewAnswer6CA1X6.setText(null);
		textViewAnswer7CA1X6.setText(null);		textViewAnswer8CA1X6.setText(null);		textViewAnswer9CA1X6.setText(null);
		textViewAnswer10CA1X6.setText(null);		textViewAnswer11CA1X6.setText(null);		textViewAnswer12CA1X6.setText(null);
		textViewAnswer13CA1X6.setText(null);		textViewAnswer14CA1X6.setText(null);		textViewAnswer15CA1X6.setText(null);
		textViewAnswer16CA1X6.setText(null);


		if(randomInt == 1){

			String Acronym1Title = "Ways of defining risk";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym1Title);



		}

		if(randomInt == 2){

			String Acronym2Title = "Main factors to be taken into account by an individual in setting a strategic investment policy";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym2Title);


		}

		if(randomInt == 3){

			String Acronym3Title = "Factors influencing investment strategy";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym3Title);



		}

		if(randomInt == 4){

			String Acronym4Title = "Regulatory controls on assets";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym4Title);


		}

		if(randomInt == 5){

			String Acronym5Title = "The limitations of classical immunisation theory";

			textViewCA1X6 = (TextView) findViewById(R.id.PullTestStringCA1X6);//take in string
			textViewCA1X6.setText(Acronym5Title);

		}
	}

	///////////////////////DONE////////////////////
	public void onClickTestYourselfTitleCA1X6(View v)
	{
		if (randomInt==1)
		{

			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);
			CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);

			CA1X6Answer1Letter1.setText("D");
			CA1X6Answer1Letter2.setText("O");
			CA1X6Answer1Letter3.setText("U");
			CA1X6Answer1Letter4.setText("R");
			

			String Acronym="Ways of defining risk";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}

		}

		if (randomInt==2)
		{

			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
			CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);		CA1X6Answer1Letter10 = (TextView) findViewById(R.id.CA1X6Answer1Letter10);


			CA1X6Answer1Letter1.setText("V");
			CA1X6Answer1Letter2.setText("A");
			CA1X6Answer1Letter3.setText("N");
			CA1X6Answer1Letter4.setText("P");
			CA1X6Answer1Letter5.setText("I");
			CA1X6Answer1Letter6.setText("C");
			


			String Acronym="Main factors to be taken into account by an individual in setting a strategic investment policy";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}
		}

		if (randomInt==3)
		{


			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);
			CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);
			CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);
			CA1X6Answer1Letter10 = (TextView) findViewById(R.id.CA1X6Answer1Letter10);
			CA1X6Answer1Letter11 = (TextView) findViewById(R.id.CA1X6Answer1Letter11);
			CA1X6Answer1Letter12 = (TextView) findViewById(R.id.CA1X6Answer1Letter12);
			CA1X6Answer1Letter13 = (TextView) findViewById(R.id.CA1X6Answer1Letter13);
			CA1X6Answer1Letter14 = (TextView) findViewById(R.id.CA1X6Answer1Letter14);
			CA1X6Answer1Letter15 = (TextView) findViewById(R.id.CA1X6Answer1Letter15);


			CA1X6Answer1Letter1.setText("S");
			CA1X6Answer1Letter2.setText("O");
			CA1X6Answer1Letter3.setText("U");
			CA1X6Answer1Letter4.setText("N");
			CA1X6Answer1Letter5.setText("D");
			CA1X6Answer1Letter6.setText("E");
			CA1X6Answer1Letter7.setText("R");
			CA1X6Answer1Letter8.setText("T");
			CA1X6Answer1Letter9.setText("R");
			CA1X6Answer1Letter10.setText("A");
			CA1X6Answer1Letter11.setText("C");
			CA1X6Answer1Letter12.setText("T");
			CA1X6Answer1Letter13.setText("O");
			CA1X6Answer1Letter14.setText("R");
			CA1X6Answer1Letter15.setText("S");



			String Acronym="Factors influencing investment strategy";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}
		}

		if (randomInt==4)
		{

			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		
			CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);		
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		
			CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);		


			CA1X6Answer1Letter1.setText("T");
			CA1X6Answer1Letter2.setText("E");
			CA1X6Answer1Letter3.setText("C");
			CA1X6Answer1Letter4.setText("H");
			CA1X6Answer1Letter5.setText("S");
			CA1X6Answer1Letter6.setText("C");
			CA1X6Answer1Letter7.setText("A");
			CA1X6Answer1Letter8.setText("M");


			String Acronym="Regulatory controls on assets";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}
		}
		if (randomInt==5)
		{


			CA1X6Answer1Letter1 = (TextView) findViewById(R.id.CA1X6Answer1Letter1);		CA1X6Answer1Letter2 = (TextView) findViewById(R.id.CA1X6Answer1Letter2);
			CA1X6Answer1Letter3 = (TextView) findViewById(R.id.CA1X6Answer1Letter3);		CA1X6Answer1Letter4 = (TextView) findViewById(R.id.CA1X6Answer1Letter4);
			CA1X6Answer1Letter5 = (TextView) findViewById(R.id.CA1X6Answer1Letter5);		CA1X6Answer1Letter6 = (TextView) findViewById(R.id.CA1X6Answer1Letter6);
			CA1X6Answer1Letter7 = (TextView) findViewById(R.id.CA1X6Answer1Letter7);		
			CA1X6Answer1Letter8 = (TextView) findViewById(R.id.CA1X6Answer1Letter8);		
			CA1X6Answer1Letter9 = (TextView) findViewById(R.id.CA1X6Answer1Letter9);		


			CA1X6Answer1Letter1.setText("F");
			CA1X6Answer1Letter2.setText("I");
			CA1X6Answer1Letter3.setText("R");
			CA1X6Answer1Letter4.setText("M");
			CA1X6Answer1Letter5.setText("S");
			CA1X6Answer1Letter6.setText("F");
			CA1X6Answer1Letter7.setText("A");
			CA1X6Answer1Letter8.setText("I");
			CA1X6Answer1Letter9.setText("L");


			String Acronym="The limitations of classical immunisation theory";

			EditTextTestCA1X6 = (EditText)findViewById(R.id.EditTextTestCA1X6);
			useranswerCA1X6=EditTextTestCA1X6.getText().toString();
			TextViewTitleAnswerCA1X6 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X6);

			if(Acronym.equals(useranswerCA1X6)){
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X6.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X6.setText(Acronym);
			}

		}

	}
























	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x6, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x6,
					container, false);
			return rootView;
		}
	}

}
