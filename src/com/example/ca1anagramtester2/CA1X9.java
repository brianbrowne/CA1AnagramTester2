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

public class CA1X9 extends ActionBarActivity {

	EditText EditTextTestCA1X9;			TextView TextViewTitleAnswerCA1X9;			TextView textViewCA1X9;
	String useranswerCA1X9;

	EditText EditTextCA1X9Answer1;		EditText EditTextCA1X9Answer2;		EditText EditTextCA1X9Answer3;
	EditText EditTextCA1X9Answer4;		EditText EditTextCA1X9Answer5;		EditText EditTextCA1X9Answer6;
	EditText EditTextCA1X9Answer7;		EditText EditTextCA1X9Answer8;		EditText EditTextCA1X9Answer9;
	EditText EditTextCA1X9Answer10;		EditText EditTextCA1X9Answer11;		EditText EditTextCA1X9Answer12;
	EditText EditTextCA1X9Answer13;		EditText EditTextCA1X9Answer14;		EditText EditTextCA1X9Answer15;		EditText EditTextCA1X9Answer16;
	EditText EditTextCA1X9Answer17;		EditText EditTextCA1X9Answer18;


	TextView CA1X9Answer1Letter1;		TextView CA1X9Answer1Letter2;		TextView CA1X9Answer1Letter3;
	TextView CA1X9Answer1Letter4;		TextView CA1X9Answer1Letter5;		TextView CA1X9Answer1Letter6;
	TextView CA1X9Answer1Letter7;		TextView CA1X9Answer1Letter8;		TextView CA1X9Answer1Letter9;
	TextView CA1X9Answer1Letter10;		TextView CA1X9Answer1Letter11;		TextView CA1X9Answer1Letter12;
	TextView CA1X9Answer1Letter13;		TextView CA1X9Answer1Letter14;		TextView CA1X9Answer1Letter15;		TextView CA1X9Answer1Letter16;
	TextView CA1X9Answer1Letter17;		TextView CA1X9Answer1Letter18;


	TextView textViewAnswer1CA1X9;		TextView textViewAnswer2CA1X9;		TextView textViewAnswer3CA1X9;		TextView textViewAnswer4CA1X9;
	TextView textViewAnswer5CA1X9;		TextView textViewAnswer6CA1X9;		TextView textViewAnswer7CA1X9;		TextView textViewAnswer8CA1X9;
	TextView textViewAnswer9CA1X9;		TextView textViewAnswer10CA1X9;		TextView textViewAnswer11CA1X9;		TextView textViewAnswer12CA1X9;
	TextView textViewAnswer13CA1X9;		TextView textViewAnswer14CA1X9;		TextView textViewAnswer15CA1X9;		TextView textViewAnswer16CA1X9;
	TextView textViewAnswer17CA1X9;		TextView textViewAnswer18CA1X9;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x9);

		EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
		textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);
		TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);


		CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
		CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
		CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
		CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);		CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);		CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
		CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);		CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
		CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);		CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
		CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);		CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);
		CA1X9Answer1Letter17 = (TextView) findViewById(R.id.CA1X9Answer1Letter17);		CA1X9Answer1Letter18 = (TextView) findViewById(R.id.CA1X9Answer1Letter18);


		EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
		EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
		EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
		EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
		EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
		EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
		EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
		EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);
		EditTextCA1X9Answer17 = (EditText)findViewById(R.id.EditTextCA1X9Answer17);		EditTextCA1X9Answer18 = (EditText)findViewById(R.id.EditTextCA1X9Answer18);		


		textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
		textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
		textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
		textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
		textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
		textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
		textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
		textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);
		textViewAnswer17CA1X9 = (TextView) findViewById(R.id.textViewAnswer17CA1X9);		textViewAnswer18CA1X9 = (TextView) findViewById(R.id.textViewAnswer18CA1X9);



		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}


	///////////////////DONE////////////////
	public void onClickCA1X9TestAnswers(View v)
	{
		if (randomInt==1)
		{

			String Acronym1Answer1="Business (CUFE = claims experience, underwriting, financing provision unsuccessful, exposure to a risk > expected)";
			String Acronym1Answer2="External (CELT = competition, earthquake (natural), legislation, tax)";
			String Acronym1Answer3="Liquidity (how quickly an asset can be realised into cash to cover liabilities)";
			String Acronym1Answer4="Credit (CDCD = credit: default, counterparty risk, debtors)";
			String Acronym1Answer5="Operational (THIRD = Third party reliance, inadequate internal process, recovery plan failure, domanince risk)";
			String Acronym1Answer6="Market MALM = Market: asset value change, liability value change, matching assets/liabs)";




			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
			EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);
			EditTextCA1X9Answer17 = (EditText)findViewById(R.id.EditTextCA1X9Answer17);		EditTextCA1X9Answer18 = (EditText)findViewById(R.id.EditTextCA1X9Answer18);		


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
			textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);
			textViewAnswer17CA1X9 = (TextView) findViewById(R.id.textViewAnswer17CA1X9);		textViewAnswer18CA1X9 = (TextView) findViewById(R.id.textViewAnswer18CA1X9);	

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();
			String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();
			String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();
			String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();
			String checkuseranswerCA1X915=EditTextCA1X9Answer15.getText().toString();
			String checkuseranswerCA1X916=EditTextCA1X9Answer16.getText().toString();
			String checkuseranswerCA1X917=EditTextCA1X9Answer17.getText().toString();
			String checkuseranswerCA1X918=EditTextCA1X9Answer18.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym1Answer1);
			}

			if(Acronym1Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym1Answer2);
			}

			if(Acronym1Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym1Answer3);
			}

			if(Acronym1Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym1Answer4);
			}

			if(Acronym1Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym1Answer5);
			}

			if(Acronym1Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym1Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym1Answer6);
			}

		}
		if(randomInt==2){


			String Acronym2Answer1="Character and ability of the borrower";
			String Acronym2Answer2="Amount of the loan";
			String Acronym2Answer3="Security of the loan/borrower";
			String Acronym2Answer4="Purpose of the loan";
			String Acronym2Answer5="Ability to repay the loan";
			String Acronym2Answer6="Rish vd reward (losses are expected, build into price";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();	String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();	String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();	String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();

			if(Acronym2Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym2Answer1);
			}

			if(Acronym2Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym2Answer2);
			}

			if(Acronym2Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym2Answer3);
			}

			if(Acronym2Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym2Answer4);
			}

			if(Acronym2Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym2Answer5);
			}

			if(Acronym2Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym2Answer6);
			}



		}
		if(randomInt==3){


			String Acronym3Answer1="Needs not met";
			String Acronym3Answer2="Illiquid asset risk";
			String Acronym3Answer3="Mismatch of asset vs liabilities";
			String Acronym3Answer4="Benefit chnges";
			String Acronym3Answer5="Underfunding";
			String Acronym3Answer6="Sponsor insolvency";



			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);
			EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();		String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();		String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();		String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();		String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();		String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();		String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();		String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();

			if(Acronym3Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym3Answer1);
			}

			if(Acronym3Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym3Answer2);
			}

			if(Acronym3Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym3Answer3);
			}

			if(Acronym3Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym3Answer4);
			}

			if(Acronym3Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym3Answer5);
			}

			if(Acronym3Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym3Answer6);
			}


		}
		if(randomInt==4){

			String Acronym4Answer1="Benefirs are inadequate";
			String Acronym4Answer2="Expenses";
			String Acronym4Answer3="Annvity risk (terms of purchase)";
			String Acronym4Answer4="Needs not met";
			String Acronym4Answer5="Inflation risk (reduced purchasing power, income eroded by inflation";
			String Acronym4Answer6="Investment return > expected";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);
			EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);
			EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);
			textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);
			textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();

			if(Acronym4Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym4Answer1);
			}

			if(Acronym4Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym4Answer2);
			}

			if(Acronym4Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym4Answer3);
			}

			if(Acronym4Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym4Answer4);
			}

			if(Acronym4Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym4Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym4Answer5);
			}

			if(Acronym4Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym4Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym4Answer6);
			}


		}
		if(randomInt==5){


			String Acronym5Answer1="Benefit decreased";
			String Acronym5Answer2="Economic mismanagment";
			String Acronym5Answer3="Default of sponsor";
			String Acronym5Answer4="Communication of sponsor to beneficiaries inadequate";
			String Acronym5Answer5="Contributions/premiums not paid by sponsor in a timely manner";
			String Acronym5Answer6="Takeover";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);
			EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);
			EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);
			EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);

			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9= (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9= (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		


			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();	String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();	String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();	String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();

			if(Acronym5Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym5Answer1);
			}

			if(Acronym5Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym5Answer2);
			}

			if(Acronym5Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym5Answer3);
			}

			if(Acronym5Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym5Answer4);
			}

			if(Acronym5Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym5Answer5);
			}

			if(Acronym5Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym5Answer6);
			}

		}
		if(randomInt==6){


			String Acronym6Answer1="Future uncertainty of level of contributions/premiums";
			String Acronym6Answer2="Insufficient assets (risk of)";
			String Acronym6Answer3="Liquidity risk (shortfall)";
			String Acronym6Answer4="Takeover";
			String Acronym6Answer5="Hybrid schemes (guarantee risks)";
			String Acronym6Answer6="Sponsor insolvency (risk of extra cont/prems needed)";




			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);
			EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);
			EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);
			EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);
			EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);

			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9= (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9= (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);
			textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);


			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();	String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();	String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();	String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();
			String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();

			if(Acronym6Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym6Answer1);
			}

			if(Acronym6Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym6Answer2);
			}

			if(Acronym6Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym6Answer3);
			}

			if(Acronym6Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym6Answer4);
			}

			if(Acronym6Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym6Answer5);
			}

			if(Acronym6Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym6Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym6Answer6);
			}


		}
		if(randomInt==7){

			String Acronym7Answer1="Benefits differ from expected";
			String Acronym7Answer2="Inflation risk";
			String Acronym7Answer3="Liquidity risk";
			String Acronym7Answer4="Unaffordable contributions/premiums";
			String Acronym7Answer5="Sponsor insolvency";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);
			EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);
			EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);
			EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9 = (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);
			textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);
			textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);
			textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();
			String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();

			if(Acronym7Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym7Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym7Answer1);
			}

			if(Acronym7Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym7Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym7Answer2);
			}

			if(Acronym7Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym7Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym7Answer3);
			}

			if(Acronym7Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym7Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym7Answer4);
			}

			if(Acronym7Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym7Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym7Answer5);
			}


		}
		if(randomInt==8){

			String Acronym8Answer1="Fraud";
			String Acronym8Answer2="Advice inappropriate";
			String Acronym8Answer3="Benefits payments incorrect";
			String Acronym8Answer4="Decisions incorrect";
			String Acronym8Answer5="Admin costs";
			String Acronym8Answer6="Fines resulting from non-compliance";
			String Acronym8Answer7="Tax changes";

			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
			EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();		String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();		String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();		String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();		String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();		String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();		String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();		String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();
			String checkuseranswerCA1X915=EditTextCA1X9Answer15.getText().toString();		String checkuseranswerCA1X916=EditTextCA1X9Answer16.getText().toString();

			if(Acronym8Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}

			if(Acronym8Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}

			if(Acronym8Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}

			if(Acronym8Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym8Answer6);
			}

			if(Acronym8Answer7.equals(checkuseranswerCA1X97)){
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X9.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X9.setText(Acronym8Answer7);
			}


		}
		if(randomInt==9){			

			String Acronym9Answer1="Complicated productes";
			String Acronym9Answer2="Rubbish (Incompetent!) advisors";
			String Acronym9Answer3="Integrity of advisor lacking (eg due to sales-related payments";
			String Acronym9Answer4="Model or parameter errors";
			String Acronym9Answer5="Errors in data relating to members";
			String Acronym9Answer6="State-encuraged but inappropriate actions";

			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		



			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		


			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();


			if(Acronym9Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym9Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym9Answer1);
			}

			if(Acronym9Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym9Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym9Answer2);
			}

			if(Acronym9Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym9Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym9Answer3);
			}

			if(Acronym9Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym9Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym9Answer4);
			}

			if(Acronym9Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym9Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym9Answer5);
			}

			if(Acronym9Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym9Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym9Answer6);
			}




		}
		if(randomInt==10){


			String Acronym8Answer1="Moral hazard eliminated as far as possible";
			String Acronym8Answer2="Ultimate limit on liability undertaken";
			String Acronym8Answer3="Data exists with which to price risk";
			String Acronym8Answer4="Pooling a large number of similar risks";
			String Acronym8Answer5="Independent risk events";
			String Acronym8Answer6="Small probability of occurence";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);

			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();		String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();		String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();		String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();		String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();

			if(Acronym8Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}

			if(Acronym8Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}

			if(Acronym8Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}

			if(Acronym8Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym8Answer6);
			}


		}
		if(randomInt==11){

			String Acronym8Answer1="Reinvestment";
			String Acronym8Answer2="Opportunity cost of capital";
			String Acronym8Answer3="Diversification";
			String Acronym8Answer4="Expenses";
			String Acronym8Answer5="Needs";
			String Acronym8Answer6="Tax";
			String Acronym8Answer7="Illiquidty risk";
			String Acronym8Answer8="Capital process";
			String Acronym8Answer9="Income";
			String Acronym8Answer10="Default risk";
			String Acronym8Answer11="Erosion due to inflation";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);
			EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);
			EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);
			textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);
			textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();		String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();		String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();		String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();
			String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();

			if(Acronym8Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}

			if(Acronym8Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}

			if(Acronym8Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}

			if(Acronym8Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym8Answer6);
			}

			if(Acronym8Answer7.equals(checkuseranswerCA1X97)){
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X9.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X9.setText(Acronym8Answer7);
			}

			if(Acronym8Answer8.equals(checkuseranswerCA1X98)){
				textViewAnswer8CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X9.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X9.setText(Acronym8Answer8);
			}

			if(Acronym8Answer9.equals(checkuseranswerCA1X99)){
				textViewAnswer9CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X9.setText(Acronym8Answer9);
			}else{
				textViewAnswer9CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X9.setText(Acronym8Answer9);
			}

			if(Acronym8Answer10.equals(checkuseranswerCA1X910)){
				textViewAnswer10CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X9.setText(Acronym8Answer10);
			}else{
				textViewAnswer10CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X9.setText(Acronym8Answer10);
			}

			if(Acronym8Answer11.equals(checkuseranswerCA1X911)){
				textViewAnswer11CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X9.setText(Acronym8Answer11);
			}else{
				textViewAnswer11CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X9.setText(Acronym8Answer11);
			}


		}
		if(randomInt==12){


			String Acronym8Answer1="Identification (risks that threaten income + assets of organisation)";
			String Acronym8Answer2="Measurement (probability + severity)";
			String Acronym8Answer3="Control";
			String Acronym8Answer4="Financing (resources available to cover risk)";
			String Acronym8Answer5="Monitoring";



			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);	


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();		String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();		String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();	

			if(Acronym8Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym8Answer3);
			}

			if(Acronym8Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym8Answer4);
			}

			if(Acronym8Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym8Answer5);
			}


		}
		if(randomInt==13){

			String Acronym13Answer1="Value at risk (potential loss over a given time period + confidence interval)";
			String Acronym13Answer2="Asset risks (active risk, historical + forward looking error)";
			String Acronym13Answer3="Liability Risks (actual vs expected)";
			String Acronym13Answer4="Expected shortfall (expectation of losses below a certain level";
			String Acronym13Answer5="TailVar (if ES is a percentile point than it is a TailVar or ES conditional on those being a shortfall)";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);

			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();
			String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();

			if(Acronym13Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym13Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym13Answer1);
			}

			if(Acronym13Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym13Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym13Answer2);
			}

			if(Acronym13Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym13Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym13Answer3);
			}

			if(Acronym13Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym13Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym13Answer4);
			}

			if(Acronym13Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym13Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym13Answer5);
			}



		}
		if(randomInt==14){

			String Acronym14Answer1="Stability and quality of their business improved";
			String Acronym14Answer2="Avoid surprises";
			String Acronym14Answer3="Growth and returns improved by exploiting risk opportunities";
			String Acronym14Answer4="Allocate capital through better management to improve growth + return";
			String Acronym14Answer5="Synergies used to identify opportunities";
			String Acronym14Answer6="Arbitrage opportunities";
			String Acronym14Answer7="Confidence for stakeholders that business is well managed";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
			EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);
			EditTextCA1X9Answer17 = (EditText)findViewById(R.id.EditTextCA1X9Answer17);		EditTextCA1X9Answer18 = (EditText)findViewById(R.id.EditTextCA1X9Answer18);		


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
			textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);
			textViewAnswer17CA1X9 = (TextView) findViewById(R.id.textViewAnswer17CA1X9);		textViewAnswer18CA1X9 = (TextView) findViewById(R.id.textViewAnswer18CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();
			String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();
			String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();
			String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();
			String checkuseranswerCA1X915=EditTextCA1X9Answer15.getText().toString();
			String checkuseranswerCA1X916=EditTextCA1X9Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym14Answer6);
			}

			if(Acronym14Answer7.equals(checkuseranswerCA1X97)){
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X9.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X9.setText(Acronym14Answer7);
			}


		}

		if(randomInt==15){

			String Acronym14Answer1="Correlation matrix";
			String Acronym14Answer2="Ruin probability ";
			String Acronym14Answer3="Interactions between risks";
			String Acronym14Answer4="Subjective risks";
			String Acronym14Answer5="Past data caution";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
			EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);
			EditTextCA1X9Answer17 = (EditText)findViewById(R.id.EditTextCA1X9Answer17);		EditTextCA1X9Answer18 = (EditText)findViewById(R.id.EditTextCA1X9Answer18);		


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
			textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);
			textViewAnswer17CA1X9 = (TextView) findViewById(R.id.textViewAnswer17CA1X9);		textViewAnswer18CA1X9 = (TextView) findViewById(R.id.textViewAnswer18CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();
			String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();
			String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();
			String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();
			String checkuseranswerCA1X915=EditTextCA1X9Answer15.getText().toString();
			String checkuseranswerCA1X916=EditTextCA1X9Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}



		}

		if(randomInt==16){

			String Acronym14Answer1="Consider constraints";
			String Acronym14Answer2="Hedge exploitation";
			String Acronym14Answer3="All risks incorporated";
			String Acronym14Answer4="Operational efficiencies";
			String Acronym14Answer5="Strategies - evaluate all relevant";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
			EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);
			EditTextCA1X9Answer17 = (EditText)findViewById(R.id.EditTextCA1X9Answer17);		EditTextCA1X9Answer18 = (EditText)findViewById(R.id.EditTextCA1X9Answer18);		


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
			textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);
			textViewAnswer17CA1X9 = (TextView) findViewById(R.id.textViewAnswer17CA1X9);		textViewAnswer18CA1X9 = (TextView) findViewById(R.id.textViewAnswer18CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();
			String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();
			String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();
			String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();
			String checkuseranswerCA1X915=EditTextCA1X9Answer15.getText().toString();
			String checkuseranswerCA1X916=EditTextCA1X9Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}



		}

		if(randomInt==17){

			String Acronym14Answer1="Scenario analysis";
			String Acronym14Answer2="Stress testing";
			String Acronym14Answer3="Stochastic medelling";


			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
			EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);
			EditTextCA1X9Answer17 = (EditText)findViewById(R.id.EditTextCA1X9Answer17);		EditTextCA1X9Answer18 = (EditText)findViewById(R.id.EditTextCA1X9Answer18);		


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
			textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);
			textViewAnswer17CA1X9 = (TextView) findViewById(R.id.textViewAnswer17CA1X9);		textViewAnswer18CA1X9 = (TextView) findViewById(R.id.textViewAnswer18CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();
			String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();
			String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();
			String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();
			String checkuseranswerCA1X915=EditTextCA1X9Answer15.getText().toString();
			String checkuseranswerCA1X916=EditTextCA1X9Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}



		}

		if(randomInt==18){

			String Acronym14Answer1="Reinsurance";
			String Acronym14Answer2="Investment income";
			String Acronym14Answer3="Short-term outlook by mgmt";
			String Acronym14Answer4="Kompetition";
			String Acronym14Answer5="Legislation";
			String Acronym14Answer6="Inflation";
			String Acronym14Answer7="Fraud";
			String Acronym14Answer8="Expenses";
			String Acronym14Answer9="Data";
			String Acronym14Answer10="Rates";
			String Acronym14Answer11="Options + guarantees";
			String Acronym14Answer12="Withdrawals";
			String Acronym14Answer13="New business";
			String Acronym14Answer14="Control failure";
			String Acronym14Answer15="Accumulation of risk";
			String Acronym14Answer16="Tax";
			String Acronym14Answer17="Selection (anti)";

			EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
			EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
			EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
			EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
			EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
			EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
			EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
			EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);
			EditTextCA1X9Answer17 = (EditText)findViewById(R.id.EditTextCA1X9Answer17);		EditTextCA1X9Answer18 = (EditText)findViewById(R.id.EditTextCA1X9Answer18);		


			textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
			textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
			textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
			textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
			textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
			textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
			textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
			textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);
			textViewAnswer17CA1X9 = (TextView) findViewById(R.id.textViewAnswer17CA1X9);		textViewAnswer18CA1X9 = (TextView) findViewById(R.id.textViewAnswer18CA1X9);

			String checkuseranswerCA1X91=EditTextCA1X9Answer1.getText().toString();	String checkuseranswerCA1X92=EditTextCA1X9Answer2.getText().toString();
			String checkuseranswerCA1X93=EditTextCA1X9Answer3.getText().toString();	String checkuseranswerCA1X94=EditTextCA1X9Answer4.getText().toString();
			String checkuseranswerCA1X95=EditTextCA1X9Answer5.getText().toString();
			String checkuseranswerCA1X96=EditTextCA1X9Answer6.getText().toString();
			String checkuseranswerCA1X97=EditTextCA1X9Answer7.getText().toString();
			String checkuseranswerCA1X98=EditTextCA1X9Answer8.getText().toString();
			String checkuseranswerCA1X99=EditTextCA1X9Answer9.getText().toString();
			String checkuseranswerCA1X910=EditTextCA1X9Answer10.getText().toString();
			String checkuseranswerCA1X911=EditTextCA1X9Answer11.getText().toString();
			String checkuseranswerCA1X912=EditTextCA1X9Answer12.getText().toString();
			String checkuseranswerCA1X913=EditTextCA1X9Answer13.getText().toString();
			String checkuseranswerCA1X914=EditTextCA1X9Answer14.getText().toString();
			String checkuseranswerCA1X915=EditTextCA1X9Answer15.getText().toString();
			String checkuseranswerCA1X916=EditTextCA1X9Answer16.getText().toString();
			String checkuseranswerCA1X917=EditTextCA1X9Answer17.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X91)){
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X9.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X92)){
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X9.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X93)){
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X9.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X94)){
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X9.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X95)){
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X9.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X96)){
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X9.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X9.setText(Acronym14Answer6);
			}

			if(Acronym14Answer7.equals(checkuseranswerCA1X97)){
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X9.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X9.setText(Acronym14Answer7);
			}

			if(Acronym14Answer8.equals(checkuseranswerCA1X98)){
				textViewAnswer8CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X9.setText(Acronym14Answer8);
			}else{
				textViewAnswer8CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X9.setText(Acronym14Answer8);
			}

			if(Acronym14Answer9.equals(checkuseranswerCA1X99)){
				textViewAnswer9CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X9.setText(Acronym14Answer9);
			}else{
				textViewAnswer9CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X9.setText(Acronym14Answer9);
			}

			if(Acronym14Answer10.equals(checkuseranswerCA1X910)){
				textViewAnswer10CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X9.setText(Acronym14Answer10);
			}else{
				textViewAnswer10CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X9.setText(Acronym14Answer10);
			}

			if(Acronym14Answer11.equals(checkuseranswerCA1X911)){
				textViewAnswer11CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X9.setText(Acronym14Answer11);
			}else{
				textViewAnswer11CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X9.setText(Acronym14Answer11);
			}

			if(Acronym14Answer12.equals(checkuseranswerCA1X912)){
				textViewAnswer12CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X9.setText(Acronym14Answer12);
			}else{
				textViewAnswer12CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X9.setText(Acronym14Answer12);
			}

			if(Acronym14Answer13.equals(checkuseranswerCA1X913)){
				textViewAnswer13CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X9.setText(Acronym14Answer13);
			}else{
				textViewAnswer13CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X9.setText(Acronym14Answer13);
			}

			if(Acronym14Answer14.equals(checkuseranswerCA1X914)){
				textViewAnswer14CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CA1X9.setText(Acronym14Answer14);
			}else{
				textViewAnswer14CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CA1X9.setText(Acronym14Answer14);
			}

			if(Acronym14Answer15.equals(checkuseranswerCA1X915)){
				textViewAnswer15CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CA1X9.setText(Acronym14Answer15);
			}else{
				textViewAnswer15CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CA1X9.setText(Acronym14Answer15);
			}

			if(Acronym14Answer16.equals(checkuseranswerCA1X916)){
				textViewAnswer16CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer16CA1X9.setText(Acronym14Answer16);
			}else{
				textViewAnswer16CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer16CA1X9.setText(Acronym14Answer16);
			}

			if(Acronym14Answer17.equals(checkuseranswerCA1X917)){
				textViewAnswer17CA1X9.setTextColor(Color.parseColor("#006400"));
				textViewAnswer17CA1X9.setText(Acronym14Answer17);
			}else{
				textViewAnswer17CA1X9.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer17CA1X9.setText(Acronym14Answer17);
			}


		}



	}

	//////////////////////DONE///////////////


	public void onClickGetAcronymCA1X9(View v)
	{

		TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);
		TextViewTitleAnswerCA1X9.setText(null);

		EditTextTestCA1X9 = (EditText) findViewById(R.id.EditTextTestCA1X9);
		EditTextTestCA1X9.setText(null);

		CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
		CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
		CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
		CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);		CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);		CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
		CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);		CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
		CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);		CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
		CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);		CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

		CA1X9Answer1Letter1.setText(null);		CA1X9Answer1Letter2.setText(null);		CA1X9Answer1Letter3.setText(null);		CA1X9Answer1Letter4.setText(null);
		CA1X9Answer1Letter5.setText(null);		CA1X9Answer1Letter6.setText(null);		CA1X9Answer1Letter7.setText(null);		CA1X9Answer1Letter8.setText(null);
		CA1X9Answer1Letter9.setText(null);		CA1X9Answer1Letter10.setText(null);		CA1X9Answer1Letter11.setText(null);		CA1X9Answer1Letter12.setText(null);
		CA1X9Answer1Letter13.setText(null);		CA1X9Answer1Letter13.setText(null);		CA1X9Answer1Letter14.setText(null);		CA1X9Answer1Letter15.setText(null);
		CA1X9Answer1Letter16.setText(null);



		EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
		EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
		EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
		EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
		EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
		EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
		EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
		EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);

		EditTextCA1X9Answer1.setText(null);		EditTextCA1X9Answer2.setText(null);		EditTextCA1X9Answer3.setText(null);		EditTextCA1X9Answer4.setText(null);
		EditTextCA1X9Answer5.setText(null);		EditTextCA1X9Answer6.setText(null);		EditTextCA1X9Answer7.setText(null);		EditTextCA1X9Answer8.setText(null);
		EditTextCA1X9Answer9.setText(null);		EditTextCA1X9Answer10.setText(null);		EditTextCA1X9Answer11.setText(null);		EditTextCA1X9Answer12.setText(null);
		EditTextCA1X9Answer13.setText(null);		EditTextCA1X9Answer14.setText(null);		EditTextCA1X9Answer15.setText(null);
		EditTextCA1X9Answer16.setText(null);

		textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
		textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
		textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
		textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
		textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
		textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
		textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
		textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);

		textViewAnswer1CA1X9.setText(null);		textViewAnswer2CA1X9.setText(null);		textViewAnswer3CA1X9.setText(null);		textViewAnswer4CA1X9.setText(null);
		textViewAnswer5CA1X9.setText(null);		textViewAnswer6CA1X9.setText(null);		textViewAnswer7CA1X9.setText(null);		textViewAnswer8CA1X9.setText(null);
		textViewAnswer9CA1X9.setText(null);		textViewAnswer10CA1X9.setText(null);		textViewAnswer11CA1X9.setText(null);		textViewAnswer12CA1X9.setText(null);
		textViewAnswer13CA1X9.setText(null);		textViewAnswer14CA1X9.setText(null);		textViewAnswer15CA1X9.setText(null);		textViewAnswer16CA1X9.setText(null);

		TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);
		TextViewTitleAnswerCA1X9.setText(null);

		EditTextTestCA1X9 = (EditText) findViewById(R.id.EditTextTestCA1X9);
		EditTextTestCA1X9.setText(null);

		Random randomNum = new Random();
		randomInt = randomNum.nextInt(18)+1;//when you click "Display Database"



		if(randomInt == 1){

			String Acronym1Acronym ="BELCOM";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym1Acronym);

		}

		if(randomInt == 2){

			String Acronym2Acronym ="CASPAR";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym2Acronym);



		}

		if(randomInt == 3){

			String Acronym3Acronym ="NIMBUS";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym3Acronym);



		}

		if(randomInt == 4){

			String Acronym4Acronym ="BEANII";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym4Acronym);


		}

		if(randomInt == 5){

			String Acronym5Acronym ="BED CCT";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym5Acronym);


		}

		if(randomInt == 6){



			String Acronym6Acronym ="FILTHS";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym6Acronym);


		}

		if(randomInt == 7){



			String Acronym7Acronym ="BILUS";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym7Acronym);


		}

		if(randomInt == 8){

			String Acronym8Acronym="FAB DAFT";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym8Acronym);


		}

		if(randomInt == 9){

			String Acronym9Acronym ="CRIMES";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym9Acronym);



		}

		if(randomInt == 10){

			String Acronym10Acronym ="MUDPIS";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym10Acronym);


		}

		if(randomInt == 11){

			String Acronym11Acronym ="RODENTICIDE";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym11Acronym);


		}

		if(randomInt == 12){

			String Acronym12Acronym ="IMCFM";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym12Acronym);


		}

		if(randomInt == 13){

			String Acronym13Acronym ="VALET";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym13Acronym);


		}

		if(randomInt == 14){

			String Acronym14Acronym ="SAGA SAC";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Acronym);


		}

		if(randomInt == 15){

			String Acronym14Acronym ="CRISP";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Acronym);


		}

		if(randomInt == 16){

			String Acronym14Acronym ="CHAOS";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Acronym);


		}

		if(randomInt == 17){

			String Acronym14Acronym ="SSS";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Acronym);


		}

		if(randomInt == 18){

			String Acronym14Acronym ="RISK LIFE DROWN CATS";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Acronym);


		}


	}



	//////////////////DONE////////////////////
	public void onClickTestYourselfAcronymCA1X9(View v)
	{

		if (randomInt==1)
		{

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);
			CA1X9Answer1Letter17 = (TextView) findViewById(R.id.CA1X9Answer1Letter17);
			CA1X9Answer1Letter18 = (TextView) findViewById(R.id.CA1X9Answer1Letter18);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("E");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("C");
			CA1X9Answer1Letter5.setText("O");
			CA1X9Answer1Letter6.setText("M");

			String Acronym="BELCOM";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}
		}

		if (randomInt==2)
		{	

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);		CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);		CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);

			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("S");
			CA1X9Answer1Letter4.setText("P");
			CA1X9Answer1Letter5.setText("A");
			CA1X9Answer1Letter6.setText("R");


			String Acronym="CASPAR";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			CA1X9Answer1Letter1.setText("N");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("M");
			CA1X9Answer1Letter4.setText("B");
			CA1X9Answer1Letter5.setText("U");
			CA1X9Answer1Letter6.setText("S");


			String Acronym="NIMBUS";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}
		}

		if (randomInt==4)
		{

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("E");
			CA1X9Answer1Letter3.setText("A");
			CA1X9Answer1Letter4.setText("N");
			CA1X9Answer1Letter5.setText("I");
			CA1X9Answer1Letter6.setText("I");

			String Acronym="BEANII";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}
		}
		if (randomInt==5)
		{


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("E");
			CA1X9Answer1Letter3.setText("D");
			CA1X9Answer1Letter4.setText("C");
			CA1X9Answer1Letter5.setText("C");
			CA1X9Answer1Letter6.setText("T");

			String Acronym="BED CCT";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==6)
		{	

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);		CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);		CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);	CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);

			CA1X9Answer1Letter1.setText("F");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("T");
			CA1X9Answer1Letter5.setText("H");
			CA1X9Answer1Letter6.setText("S");

			String Acronym="FILTHS";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==7){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);
			CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("U");
			CA1X9Answer1Letter5.setText("S");


			String Acronym="BILUS";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==8){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("F");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("B");
			CA1X9Answer1Letter4.setText("D");
			CA1X9Answer1Letter5.setText("A");
			CA1X9Answer1Letter6.setText("F");
			CA1X9Answer1Letter7.setText("T");



			String Acronym="RAM";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==9){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);


			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("R");
			CA1X9Answer1Letter3.setText("I");
			CA1X9Answer1Letter4.setText("M");
			CA1X9Answer1Letter4.setText("E");
			CA1X9Answer1Letter4.setText("S");

			String Acronym="CRIMES";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==10){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);

			CA1X9Answer1Letter1.setText("M");
			CA1X9Answer1Letter2.setText("U");
			CA1X9Answer1Letter3.setText("D");
			CA1X9Answer1Letter4.setText("P");
			CA1X9Answer1Letter5.setText("I");
			CA1X9Answer1Letter6.setText("S");



			String Acronym="MUDPIS";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==11){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);

			CA1X9Answer1Letter1.setText("R");
			CA1X9Answer1Letter2.setText("O");
			CA1X9Answer1Letter3.setText("D");
			CA1X9Answer1Letter4.setText("E");
			CA1X9Answer1Letter5.setText("N");
			CA1X9Answer1Letter6.setText("T");
			CA1X9Answer1Letter7.setText("I");
			CA1X9Answer1Letter8.setText("C");
			CA1X9Answer1Letter9.setText("I");
			CA1X9Answer1Letter10.setText("D");
			CA1X9Answer1Letter11.setText("E");

			String Acronym="RODENTICIDE";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==12){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);

			CA1X9Answer1Letter1.setText("I");
			CA1X9Answer1Letter2.setText("M");
			CA1X9Answer1Letter3.setText("C");
			CA1X9Answer1Letter4.setText("F");
			CA1X9Answer1Letter5.setText("M");


			String Acronym="IMCFM";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==13){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);
			CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);

			CA1X9Answer1Letter1.setText("V");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("E");
			CA1X9Answer1Letter5.setText("T");


			String Acronym="VALET";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==14){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("S");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("G");
			CA1X9Answer1Letter4.setText("A");
			CA1X9Answer1Letter5.setText("S");
			CA1X9Answer1Letter6.setText("A");
			CA1X9Answer1Letter7.setText("C");




			String Acronym="SAGA SAC";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==15){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("R");
			CA1X9Answer1Letter3.setText("I");
			CA1X9Answer1Letter4.setText("S");
			CA1X9Answer1Letter5.setText("P");


			String Acronym="CRISP";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==16){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("H");
			CA1X9Answer1Letter3.setText("A");
			CA1X9Answer1Letter4.setText("O");
			CA1X9Answer1Letter5.setText("S");



			String Acronym="CHAOS";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==17){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("S");
			CA1X9Answer1Letter2.setText("S");
			CA1X9Answer1Letter3.setText("S");


			String Acronym="SSS";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==18){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);
			CA1X9Answer1Letter17 = (TextView) findViewById(R.id.CA1X9Answer1Letter17);

			CA1X9Answer1Letter1.setText("R");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("S");
			CA1X9Answer1Letter4.setText("K");
			CA1X9Answer1Letter5.setText("L");
			CA1X9Answer1Letter6.setText("I");
			CA1X9Answer1Letter7.setText("F");
			CA1X9Answer1Letter8.setText("E");
			CA1X9Answer1Letter9.setText("D");
			CA1X9Answer1Letter10.setText("R");
			CA1X9Answer1Letter11.setText("O");
			CA1X9Answer1Letter12.setText("W");
			CA1X9Answer1Letter13.setText("N");
			CA1X9Answer1Letter14.setText("C");
			CA1X9Answer1Letter15.setText("A");
			CA1X9Answer1Letter16.setText("T");
			CA1X9Answer1Letter17.setText("S");


			String Acronym="SEMANTIC WIMP";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}


	}



	///////////////////DONE/////////////
	public void onClickGetTitleCA1X9(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(18)+1;//when you click "Display Database"

		TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);
		TextViewTitleAnswerCA1X9.setText(null);

		EditTextTestCA1X9 = (EditText) findViewById(R.id.EditTextTestCA1X9);
		EditTextTestCA1X9.setText(null);

		CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
		CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
		CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
		CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);		CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);		CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
		CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);		CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
		CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);		CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
		CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);		CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

		CA1X9Answer1Letter1.setText(null);		CA1X9Answer1Letter2.setText(null);		CA1X9Answer1Letter3.setText(null);
		CA1X9Answer1Letter4.setText(null);		CA1X9Answer1Letter5.setText(null);		CA1X9Answer1Letter6.setText(null);
		CA1X9Answer1Letter7.setText(null);		CA1X9Answer1Letter8.setText(null);		CA1X9Answer1Letter9.setText(null);
		CA1X9Answer1Letter10.setText(null);		CA1X9Answer1Letter11.setText(null);		CA1X9Answer1Letter12.setText(null);
		CA1X9Answer1Letter13.setText(null);		CA1X9Answer1Letter13.setText(null);		CA1X9Answer1Letter14.setText(null);
		CA1X9Answer1Letter15.setText(null);		CA1X9Answer1Letter16.setText(null);



		EditTextCA1X9Answer1 = (EditText)findViewById(R.id.EditTextCA1X9Answer1);		EditTextCA1X9Answer2 = (EditText)findViewById(R.id.EditTextCA1X9Answer2);
		EditTextCA1X9Answer3 = (EditText)findViewById(R.id.EditTextCA1X9Answer3);		EditTextCA1X9Answer4 = (EditText)findViewById(R.id.EditTextCA1X9Answer4);
		EditTextCA1X9Answer5 = (EditText)findViewById(R.id.EditTextCA1X9Answer5);		EditTextCA1X9Answer6 = (EditText)findViewById(R.id.EditTextCA1X9Answer6);
		EditTextCA1X9Answer7 = (EditText)findViewById(R.id.EditTextCA1X9Answer7);		EditTextCA1X9Answer8 = (EditText)findViewById(R.id.EditTextCA1X9Answer8);
		EditTextCA1X9Answer9 = (EditText)findViewById(R.id.EditTextCA1X9Answer9);		EditTextCA1X9Answer10 = (EditText)findViewById(R.id.EditTextCA1X9Answer10);
		EditTextCA1X9Answer11 = (EditText)findViewById(R.id.EditTextCA1X9Answer11);		EditTextCA1X9Answer12 = (EditText)findViewById(R.id.EditTextCA1X9Answer12);
		EditTextCA1X9Answer13 = (EditText)findViewById(R.id.EditTextCA1X9Answer13);		EditTextCA1X9Answer14 = (EditText)findViewById(R.id.EditTextCA1X9Answer14);
		EditTextCA1X9Answer15 = (EditText)findViewById(R.id.EditTextCA1X9Answer15);		EditTextCA1X9Answer16 = (EditText)findViewById(R.id.EditTextCA1X9Answer16);

		EditTextCA1X9Answer1.setText(null);		EditTextCA1X9Answer2.setText(null);		EditTextCA1X9Answer3.setText(null);
		EditTextCA1X9Answer4.setText(null);		EditTextCA1X9Answer5.setText(null);		EditTextCA1X9Answer6.setText(null);
		EditTextCA1X9Answer7.setText(null);		EditTextCA1X9Answer8.setText(null);		EditTextCA1X9Answer9.setText(null);
		EditTextCA1X9Answer10.setText(null);		EditTextCA1X9Answer11.setText(null);		EditTextCA1X9Answer12.setText(null);
		EditTextCA1X9Answer13.setText(null);		EditTextCA1X9Answer14.setText(null);		EditTextCA1X9Answer15.setText(null);
		EditTextCA1X9Answer16.setText(null);

		textViewAnswer1CA1X9 = (TextView) findViewById(R.id.textViewAnswer1CA1X9);		textViewAnswer2CA1X9= (TextView) findViewById(R.id.textViewAnswer2CA1X9);
		textViewAnswer3CA1X9 = (TextView) findViewById(R.id.textViewAnswer3CA1X9);		textViewAnswer4CA1X9 = (TextView) findViewById(R.id.textViewAnswer4CA1X9);
		textViewAnswer5CA1X9 = (TextView) findViewById(R.id.textViewAnswer5CA1X9);		textViewAnswer6CA1X9 = (TextView) findViewById(R.id.textViewAnswer6CA1X9);
		textViewAnswer7CA1X9 = (TextView) findViewById(R.id.textViewAnswer7CA1X9);		textViewAnswer8CA1X9 = (TextView) findViewById(R.id.textViewAnswer8CA1X9);
		textViewAnswer9CA1X9 = (TextView) findViewById(R.id.textViewAnswer9CA1X9);		textViewAnswer10CA1X9 = (TextView) findViewById(R.id.textViewAnswer10CA1X9);
		textViewAnswer11CA1X9 = (TextView) findViewById(R.id.textViewAnswer11CA1X9);		textViewAnswer12CA1X9 = (TextView) findViewById(R.id.textViewAnswer12CA1X9);
		textViewAnswer13CA1X9 = (TextView) findViewById(R.id.textViewAnswer13CA1X9);		textViewAnswer14CA1X9 = (TextView) findViewById(R.id.textViewAnswer14CA1X9);
		textViewAnswer15CA1X9 = (TextView) findViewById(R.id.textViewAnswer15CA1X9);		textViewAnswer16CA1X9 = (TextView) findViewById(R.id.textViewAnswer16CA1X9);

		textViewAnswer1CA1X9.setText(null);		textViewAnswer2CA1X9.setText(null);		textViewAnswer3CA1X9.setText(null);
		textViewAnswer4CA1X9.setText(null);		textViewAnswer5CA1X9.setText(null);		textViewAnswer6CA1X9.setText(null);
		textViewAnswer7CA1X9.setText(null);		textViewAnswer8CA1X9.setText(null);		textViewAnswer9CA1X9.setText(null);
		textViewAnswer10CA1X9.setText(null);		textViewAnswer11CA1X9.setText(null);		textViewAnswer12CA1X9.setText(null);
		textViewAnswer13CA1X9.setText(null);		textViewAnswer14CA1X9.setText(null);		textViewAnswer15CA1X9.setText(null);
		textViewAnswer16CA1X9.setText(null);


		if(randomInt == 1){

			String Acronym1Title ="Types of risk";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym1Title);



		}

		if(randomInt == 2){

			String Acronym2Title ="Principles (or canons) of lending";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym2Title);


		}

		if(randomInt == 3){

			String Acronym3Title ="DB Benefit Risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym3Title);



		}

		if(randomInt == 4){

			String Acronym4Title ="CD Benefit risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym4Title);


		}

		if(randomInt == 5){

			String Acronym5Title ="DB and DDC Benefit risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym5Title);


		}

		if(randomInt == 6){



			String Acronym6Title ="DB Contributions/Premium risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym6Title);


		}

		if(randomInt == 7){



			String Acronym7Title ="DC Contributions/Premium risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym7Title);


		}

		if(randomInt == 8){

			String Acronym8Title ="DB AND DC contribution/premium risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym8Title);


		}

		if(randomInt == 9){

			String Acronym9Title ="Causes of inappropriate advice in a benefit scheme";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym9Title);



		}

		if(randomInt == 10){

			String Acronym10Title ="Additional criteria for an insurable risk";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym10Title);


		}

		if(randomInt == 11){

			String Acronym11Title ="Benefit scheme investment risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym11Title);


		}

		if(randomInt == 12){

			String Acronym12Title ="Risk Manaagement Control Cycle";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym12Title);


		}

		if(randomInt == 13){

			String Acronym13Title ="Types of Risk Measures";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym13Title);


		}

		if(randomInt == 14){

			String Acronym14Title ="Risk control through risk managment";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Title);


		}

		if(randomInt == 15){

			String Acronym14Title ="Issues to consider in evaluating risk";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Title);


		}

		if(randomInt == 16){

			String Acronym14Title ="Characteristics of good risk management process";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Title);


		}

		if(randomInt == 17){

			String Acronym14Title ="3 methods of evaluating risks";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Title);


		}

		if(randomInt == 18){

			String Acronym14Title = "Risks in life and General Insurance";

			textViewCA1X9 = (TextView) findViewById(R.id.PullTestStringCA1X9);//take in string
			textViewCA1X9.setText(Acronym14Title);


		}



	}




	////////////////////DONE/////////////
	public void onClickTestYourselfTitleCA1X9(View v)
	{
		if (randomInt==1)
		{

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);
			CA1X9Answer1Letter17 = (TextView) findViewById(R.id.CA1X9Answer1Letter17);
			CA1X9Answer1Letter18 = (TextView) findViewById(R.id.CA1X9Answer1Letter18);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("E");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("C");
			CA1X9Answer1Letter5.setText("O");
			CA1X9Answer1Letter6.setText("M");
			

			String Acronym="Types of risk";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==2)
		{

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);		CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);		CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);

			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("S");
			CA1X9Answer1Letter4.setText("P");
			CA1X9Answer1Letter5.setText("A");
			CA1X9Answer1Letter6.setText("R");



			String Acronym="Principles (or canons) of lending";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}
		}

		if (randomInt==3)
		{


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);		CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);		CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);

			CA1X9Answer1Letter1.setText("N");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("M");
			CA1X9Answer1Letter4.setText("B");
			CA1X9Answer1Letter5.setText("U");
			CA1X9Answer1Letter6.setText("S");



			String Acronym="DB Benefit Risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}
		}

		if (randomInt==4)
		{


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("E");
			CA1X9Answer1Letter3.setText("A");
			CA1X9Answer1Letter4.setText("N");
			CA1X9Answer1Letter5.setText("I");
			CA1X9Answer1Letter6.setText("I");


			String Acronym="CD Benefit risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}
		}
		if (randomInt==5)
		{


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("E");
			CA1X9Answer1Letter3.setText("D");
			CA1X9Answer1Letter4.setText("C");
			CA1X9Answer1Letter5.setText("C");
			CA1X9Answer1Letter6.setText("T");


			String Acronym="DB and DDC Benefit risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==6)
		{


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);		CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);		CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);

			CA1X9Answer1Letter1.setText("F");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("T");
			CA1X9Answer1Letter5.setText("H");
			CA1X9Answer1Letter6.setText("S");



			String Acronym="DB Contributions/Premium risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==7){

			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);
			CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);

			CA1X9Answer1Letter1.setText("B");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("U");
			CA1X9Answer1Letter5.setText("S");
			
			

			String Acronym="DC Contributions/Premium risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==8){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("F");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("B");
			CA1X9Answer1Letter4.setText("D");
			CA1X9Answer1Letter5.setText("A");
			CA1X9Answer1Letter6.setText("F");
			CA1X9Answer1Letter7.setText("T");



			String Acronym="DB AND DC contribution/premium risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==9){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);


			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("R");
			CA1X9Answer1Letter3.setText("I");
			CA1X9Answer1Letter4.setText("M");
			CA1X9Answer1Letter5.setText("E");
			CA1X9Answer1Letter6.setText("S");

			String Acronym="Causes of inappropriate advice in a benefit scheme";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==10){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);		CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);

			CA1X9Answer1Letter1.setText("M");
			CA1X9Answer1Letter2.setText("U");
			CA1X9Answer1Letter3.setText("D");	
			CA1X9Answer1Letter4.setText("P");
			CA1X9Answer1Letter5.setText("I");
			CA1X9Answer1Letter6.setText("S");



			String Acronym="Additional criteria for an insurable risk";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==11){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);		CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);

			CA1X9Answer1Letter1.setText("R");
			CA1X9Answer1Letter2.setText("O");
			CA1X9Answer1Letter3.setText("D");	
			CA1X9Answer1Letter4.setText("E");
			CA1X9Answer1Letter5.setText("N");	
			CA1X9Answer1Letter6.setText("T");
			CA1X9Answer1Letter7.setText("I");
			CA1X9Answer1Letter8.setText("C");
			CA1X9Answer1Letter9.setText("I");
			CA1X9Answer1Letter10.setText("D");
			CA1X9Answer1Letter11.setText("E");

			String Acronym="Benefit scheme investment risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==12){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);

			CA1X9Answer1Letter1.setText("I");
			CA1X9Answer1Letter2.setText("M");
			CA1X9Answer1Letter3.setText("C");
			CA1X9Answer1Letter4.setText("F");
			CA1X9Answer1Letter5.setText("M");


			String Acronym="Risk Manaagement Control Cycle";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==13){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);
			CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);

			CA1X9Answer1Letter1.setText("V");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("L");
			CA1X9Answer1Letter4.setText("E");
			CA1X9Answer1Letter5.setText("T");


			String Acronym="Types of Risk Measures";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}
		if (randomInt==14){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("S");
			CA1X9Answer1Letter2.setText("A");
			CA1X9Answer1Letter3.setText("G");
			CA1X9Answer1Letter4.setText("A");
			CA1X9Answer1Letter5.setText("S");
			CA1X9Answer1Letter6.setText("A");
			CA1X9Answer1Letter7.setText("C");
			
			String Acronym="Risk control through risk managment";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==15){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("R");
			CA1X9Answer1Letter3.setText("I");
			CA1X9Answer1Letter4.setText("S");
			CA1X9Answer1Letter5.setText("P");

			String Acronym="Issues to consider in evaluating risk";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==16){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("C");
			CA1X9Answer1Letter2.setText("H");
			CA1X9Answer1Letter3.setText("A");
			CA1X9Answer1Letter4.setText("O");
			CA1X9Answer1Letter5.setText("S");
			
			String Acronym="Characteristics of good risk management process";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==17){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);

			CA1X9Answer1Letter1.setText("S");
			CA1X9Answer1Letter2.setText("S");
			CA1X9Answer1Letter3.setText("S");

			String Acronym="3 methods of evaluating risks";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}

		if (randomInt==18){


			CA1X9Answer1Letter1 = (TextView) findViewById(R.id.CA1X9Answer1Letter1);		CA1X9Answer1Letter2 = (TextView) findViewById(R.id.CA1X9Answer1Letter2);
			CA1X9Answer1Letter3 = (TextView) findViewById(R.id.CA1X9Answer1Letter3);		CA1X9Answer1Letter4 = (TextView) findViewById(R.id.CA1X9Answer1Letter4);
			CA1X9Answer1Letter5 = (TextView) findViewById(R.id.CA1X9Answer1Letter5);
			CA1X9Answer1Letter6 = (TextView) findViewById(R.id.CA1X9Answer1Letter6);
			CA1X9Answer1Letter7 = (TextView) findViewById(R.id.CA1X9Answer1Letter7);
			CA1X9Answer1Letter8 = (TextView) findViewById(R.id.CA1X9Answer1Letter8);
			CA1X9Answer1Letter9 = (TextView) findViewById(R.id.CA1X9Answer1Letter9);
			CA1X9Answer1Letter10 = (TextView) findViewById(R.id.CA1X9Answer1Letter10);
			CA1X9Answer1Letter11 = (TextView) findViewById(R.id.CA1X9Answer1Letter11);
			CA1X9Answer1Letter12 = (TextView) findViewById(R.id.CA1X9Answer1Letter12);
			CA1X9Answer1Letter13 = (TextView) findViewById(R.id.CA1X9Answer1Letter13);
			CA1X9Answer1Letter14 = (TextView) findViewById(R.id.CA1X9Answer1Letter14);
			CA1X9Answer1Letter15 = (TextView) findViewById(R.id.CA1X9Answer1Letter15);
			CA1X9Answer1Letter16 = (TextView) findViewById(R.id.CA1X9Answer1Letter16);
			CA1X9Answer1Letter17 = (TextView) findViewById(R.id.CA1X9Answer1Letter17);

			CA1X9Answer1Letter1.setText("R");
			CA1X9Answer1Letter2.setText("I");
			CA1X9Answer1Letter3.setText("S");
			CA1X9Answer1Letter4.setText("K");
			CA1X9Answer1Letter5.setText("L");
			CA1X9Answer1Letter6.setText("I");
			CA1X9Answer1Letter7.setText("F");
			CA1X9Answer1Letter8.setText("E");
			CA1X9Answer1Letter9.setText("D");
			CA1X9Answer1Letter10.setText("R");
			CA1X9Answer1Letter11.setText("O");
			CA1X9Answer1Letter12.setText("W");
			CA1X9Answer1Letter13.setText("N");
			CA1X9Answer1Letter14.setText("C");
			CA1X9Answer1Letter15.setText("A");
			CA1X9Answer1Letter16.setText("T");
			CA1X9Answer1Letter17.setText("S");
			

			String Acronym="Risks in life and General Insurance";

			EditTextTestCA1X9 = (EditText)findViewById(R.id.EditTextTestCA1X9);
			useranswerCA1X9=EditTextTestCA1X9.getText().toString();
			TextViewTitleAnswerCA1X9 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X9);

			if(Acronym.equals(useranswerCA1X9)){
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X9.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X9.setText(Acronym);
			}

		}



	}
























	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x9, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x9,
					container, false);
			return rootView;
		}
	}

}
