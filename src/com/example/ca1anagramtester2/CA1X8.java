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

public class CA1X8 extends ActionBarActivity {

	EditText EditTextTestCA1X8;			TextView TextViewTitleAnswerCA1X8;			TextView textViewCA1X8;
	String useranswerCA1X8;

	EditText EditTextCA1X8Answer1;		EditText EditTextCA1X8Answer2;		EditText EditTextCA1X8Answer3;
	EditText EditTextCA1X8Answer4;		EditText EditTextCA1X8Answer5;		EditText EditTextCA1X8Answer6;
	EditText EditTextCA1X8Answer7;		EditText EditTextCA1X8Answer8;		EditText EditTextCA1X8Answer9;
	EditText EditTextCA1X8Answer10;		EditText EditTextCA1X8Answer11;		EditText EditTextCA1X8Answer12;
	EditText EditTextCA1X8Answer13;		EditText EditTextCA1X8Answer14;		EditText EditTextCA1X8Answer15;		EditText EditTextCA1X8Answer16;
	EditText EditTextCA1X8Answer17;		EditText EditTextCA1X8Answer18;


	TextView CA1X8Answer1Letter1;		TextView CA1X8Answer1Letter2;		TextView CA1X8Answer1Letter3;
	TextView CA1X8Answer1Letter4;		TextView CA1X8Answer1Letter5;		TextView CA1X8Answer1Letter6;
	TextView CA1X8Answer1Letter7;		TextView CA1X8Answer1Letter8;		TextView CA1X8Answer1Letter9;
	TextView CA1X8Answer1Letter10;		TextView CA1X8Answer1Letter11;		TextView CA1X8Answer1Letter12;
	TextView CA1X8Answer1Letter13;		TextView CA1X8Answer1Letter14;		TextView CA1X8Answer1Letter15;		TextView CA1X8Answer1Letter16;
	TextView CA1X8Answer1Letter17;		TextView CA1X8Answer1Letter18;


	TextView textViewAnswer1CA1X8;		TextView textViewAnswer2CA1X8;		TextView textViewAnswer3CA1X8;		TextView textViewAnswer4CA1X8;
	TextView textViewAnswer5CA1X8;		TextView textViewAnswer6CA1X8;		TextView textViewAnswer7CA1X8;		TextView textViewAnswer8CA1X8;
	TextView textViewAnswer9CA1X8;		TextView textViewAnswer10CA1X8;		TextView textViewAnswer11CA1X8;		TextView textViewAnswer12CA1X8;
	TextView textViewAnswer13CA1X8;		TextView textViewAnswer14CA1X8;		TextView textViewAnswer15CA1X8;		TextView textViewAnswer16CA1X8;
	TextView textViewAnswer17CA1X8;		TextView textViewAnswer18CA1X8;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x8);

		EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
		textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);
		TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);


		CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
		CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
		CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
		CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);		CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);		CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
		CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);		CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
		CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);		CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
		CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);		CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);
		CA1X8Answer1Letter17 = (TextView) findViewById(R.id.CA1X8Answer1Letter17);		CA1X8Answer1Letter18 = (TextView) findViewById(R.id.CA1X8Answer1Letter18);


		EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
		EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
		EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
		EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
		EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
		EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
		EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
		EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
		EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


		textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
		textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
		textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
		textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
		textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
		textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
		textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
		textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
		textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);


		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	///////////////////HAS 20//////////////////
	///////////////////DONE////////////////////
	public void onClickCA1X8TestAnswers(View v)
	{
		if (randomInt==1)
		{

			String Acronym1Answer1="Ease of calculation of the discontinuance benefits";
			String Acronym1Answer2="Policyholders' reasonable expectations (PRE)";
			String Acronym1Answer3="Implementation cost of the discontinuance terms";
			String Acronym1Answer4="Competitive considerations";
			String Acronym1Answer5="New business disclosure";
			String Acronym1Answer6="Asset share (discontinuance benefits often based on asset share of a policy)";
			String Acronym1Answer7="Fairness (to policyholder or scheme member, other policyholders or scheme members, provider of benefits)";
			String Acronym1Answer8="Frequency of change of discontinuance terms";
			String Acronym1Answer9="Form of discontinuance terms offered (eg lump sum or paid up value)";
			


			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);	

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();
			String checkuseranswerCA1X817=EditTextCA1X8Answer17.getText().toString();
			String checkuseranswerCA1X818=EditTextCA1X8Answer18.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym1Answer1);
			}

			if(Acronym1Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym1Answer2);
			}

			if(Acronym1Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym1Answer3);
			}

			if(Acronym1Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym1Answer4);
			}

			if(Acronym1Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym1Answer5);
			}

			if(Acronym1Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym1Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym1Answer6);
			}

			if(Acronym1Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym1Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym1Answer7);
			}

			if(Acronym1Answer8.equals(checkuseranswerCA1X88)){
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X8.setText(Acronym1Answer8);
			}else{
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X8.setText(Acronym1Answer8);
			}

			if(Acronym1Answer9.equals(checkuseranswerCA1X89)){
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X8.setText(Acronym1Answer9);
			}else{
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X8.setText(Acronym1Answer9);
			}

		}
		if(randomInt==2){


			String Acronym2Answer1="Funding level of the scheme";
			String Acronym2Answer2="Admin expense";
			String Acronym2Answer3="Transfer value out or stay";
			String Acronym2Answer4="Regualtion";
			String Acronym2Answer5="Ease of calculation";
			String Acronym2Answer6="Fairness";


			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();	String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();	String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();	String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();

			if(Acronym2Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym2Answer1);
			}

			if(Acronym2Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym2Answer2);
			}

			if(Acronym2Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym2Answer3);
			}

			if(Acronym2Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym2Answer4);
			}

			if(Acronym2Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym2Answer5);
			}

			if(Acronym2Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym2Answer6);
			}



		}
		if(randomInt==3){


			String Acronym3Answer1="Amount and timing of any loan or debt redemption";
			String Acronym3Answer2="Current value of all surplus assets";
			String Acronym3Answer3="Estimation of future profits available to equity shareholders, net of tax";
			String Acronym3Answer4="Considerations relating to staff benefit scheme (eg ones in deficit)";
			String Acronym3Answer5="Outstanding financial obligations, minority interests, tax";
			String Acronym3Answer6="Problems of staff relationships and redundancies";
			


			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);
			EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();		String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();		String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();		String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();		String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();		String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();		String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();		String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();

			if(Acronym3Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym3Answer1);
			}

			if(Acronym3Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym3Answer2);
			}

			if(Acronym3Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym3Answer3);
			}

			if(Acronym3Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym3Answer4);
			}

			if(Acronym3Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym3Answer5);
			}

			if(Acronym3Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym3Answer6);
			}

			
		}
		if(randomInt==4){

			String Acronym4Answer1="Relocation of staff or whether there is an adequate labour force available";
			String Acronym4Answer2="Integration of the systems platform";
			String Acronym4Answer3="Location of the operation";
			String Acronym4Answer4="Effect on unit costs";
			

			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);
			EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);
			EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);
			textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);
			textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();

			if(Acronym4Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym4Answer1);
			}

			if(Acronym4Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym4Answer2);
			}

			if(Acronym4Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym4Answer3);
			}

			if(Acronym4Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym4Answer4);
			}

		
		}
		if(randomInt==5){


			String Acronym5Answer1="Beneficiary TV (transfer funds to beneficiary)";
			String Acronym5Answer2="Insurance company TV (transfer funds to insurance company)";
			String Acronym5Answer3="Guaranteed level of benefits TV";
			String Acronym5Answer4="Accrual of benefits ceased, scheme continues";
			String Acronym5Answer5="Scheme TV, same sponsor (transfer liabilities to another scheme with same sponsor";
			String Acronym5Answer6="Statutory scheme (central discontinuance fund)";
			

			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);
			EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);
			EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);
			EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);

			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8= (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8= (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		


			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();	String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();	String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();	String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();

			if(Acronym5Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym5Answer1);
			}

			if(Acronym5Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym5Answer2);
			}

			if(Acronym5Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym5Answer3);
			}

			if(Acronym5Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym5Answer4);
			}

			if(Acronym5Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym5Answer5);
			}

			if(Acronym5Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym5Answer6);
			}

		}
		if(randomInt==6){


			String Acronym6Answer1="Shareholder decisions";
			String Acronym6Answer2="Individual decisions";
			String Acronym6Answer3="Reason for the valuation (ie accounting purposes or to demonstrate financial strategy)";
			String Acronym6Answer4="Regulation (method of valuation)";
			String Acronym6Answer5="Investment decisions";
			String Acronym6Answer6="Needs of the client (eg beneficiaries, shareholders)";
			



			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);
			EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);
			EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);
			EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);
			EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);

			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8= (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8= (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);
			textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);


			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();	String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();	String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();	String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();

			if(Acronym6Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym6Answer1);
			}

			if(Acronym6Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym6Answer2);
			}

			if(Acronym6Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym6Answer3);
			}

			if(Acronym6Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym6Answer4);
			}

			if(Acronym6Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym6Answer5);
			}

			if(Acronym6Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym6Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym6Answer6);
			}

		
		}
		if(randomInt==7){

			String Acronym7Answer1="Influence investment strategy";
			String Acronym7Answer2="Contribution or premium setting";
			String Acronym7Answer3="Mergers and acquisitions (value the provider for)";
			String Acronym7Answer4="Accounting (published and internal management accounts)";
			String Acronym7Answer5="Discretionary benefits and benefit improvements";
			String Acronym7Answer6="Discontinuance benefits or surrender benefits (calculate value, eg TV)";
			String Acronym7Answer7="Option terms";
			String Acronym7Answer8="Guarantee costing";
			String Acronym7Answer9="Statutory reasons, eg funding valaution, information to beneficiaries";

			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);
			EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);
			EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);
			EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8 = (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);
			textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);
			textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);
			textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();
			String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();

			if(Acronym7Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym7Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym7Answer1);
			}

			if(Acronym7Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym7Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym7Answer2);
			}

			if(Acronym7Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym7Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym7Answer3);
			}

			if(Acronym7Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym7Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym7Answer4);
			}

			if(Acronym7Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym7Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym7Answer5);
			}

			if(Acronym7Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym7Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym7Answer6);
			}

			if(Acronym7Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym7Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym7Answer7);
			}
			
			if(Acronym7Answer8.equals(checkuseranswerCA1X88)){
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X8.setText(Acronym7Answer8);
			}else{
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X8.setText(Acronym7Answer8);
			}

			if(Acronym7Answer9.equals(checkuseranswerCA1X89)){
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X8.setText(Acronym7Answer9);
			}else{
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X8.setText(Acronym7Answer9);
			}

		}
		if(randomInt==8){

			String Acronym8Answer1="Risks covered (financial and non-financial)";
			String Acronym8Answer2="Additional protection against insolvency";
			String Acronym8Answer3="Mismatching of asssets and liabilities";
			
			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();		String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();		String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();		String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();		String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();		String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();		String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();		String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();		String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym8Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}


		}
		if(randomInt==9){			

			String Acronym9Answer1="Cultural basis";
			String Acronym9Answer2="Anti-selection";
			String Acronym9Answer3="Sophistication of consumer";
			String Acronym9Answer4="Economic state";
			String Acronym9Answer5="Demographic factor";

			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		



			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		


			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();	


			if(Acronym9Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym9Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym9Answer1);
			}

			if(Acronym9Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym9Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym9Answer2);
			}

			if(Acronym9Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym9Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym9Answer3);
			}

			if(Acronym9Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym9Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym9Answer4);
			}

			if(Acronym9Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym9Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym9Answer5);
			}




		}
		if(randomInt==10){


			String Acronym8Answer1="Statistical analysis";
			String Acronym8Answer2="Proportionate approach";
			String Acronym8Answer3="Equalisation of reserves";
			String Acronym8Answer4="Case by case estimate";
			

			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);

			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();		String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();		String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();		String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();		String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();

			if(Acronym8Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}

			if(Acronym8Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym8Answer4);
			}

		
		}
		if(randomInt==11){

			String Acronym8Answer1="Going concern";
			String Acronym8Answer2="Entity (business)";
			String Acronym8Answer3="Realisation";
			String Acronym8Answer4="Money management";
			String Acronym8Answer5="Matching";
			String Acronym8Answer6="Accruals";
			String Acronym8Answer7="Consistency";
			String Acronym8Answer8="Cost";
			String Acronym8Answer9="Aspect (dual)";
			String Acronym8Answer10="Materiality";
			String Acronym8Answer11="Prudence";


			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);
			EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);
			EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);
			textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);
			textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();		String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();		String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();		String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();

			if(Acronym8Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}

			if(Acronym8Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym8Answer4);
			}

			if(Acronym8Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym8Answer5);
			}

			if(Acronym8Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym8Answer6);
			}

			if(Acronym8Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym8Answer7);
			}

			if(Acronym8Answer8.equals(checkuseranswerCA1X88)){
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X8.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X8.setText(Acronym8Answer8);
			}

			if(Acronym8Answer9.equals(checkuseranswerCA1X89)){
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X8.setText(Acronym8Answer9);
			}else{
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X8.setText(Acronym8Answer9);
			}
			
			if(Acronym8Answer10.equals(checkuseranswerCA1X810)){
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X8.setText(Acronym8Answer10);
			}else{
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X8.setText(Acronym8Answer10);
			}
			
			if(Acronym8Answer11.equals(checkuseranswerCA1X811)){
				textViewAnswer11CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X8.setText(Acronym8Answer11);
			}else{
				textViewAnswer11CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X8.setText(Acronym8Answer11);
			}


		}
		if(randomInt==12){


			String Acronym8Answer1="Commission ratio";
			String Acronym8Answer2="Operating ratio";
			String Acronym8Answer3="Ratio of outward reinsurance premiums to gross premium income";
			String Acronym8Answer4="Expense ratio";



			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);	


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();		String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();		String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();	

			if(Acronym8Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym8Answer1);
			}

			if(Acronym8Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym8Answer2);
			}

			if(Acronym8Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym8Answer3);
			}

			if(Acronym8Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym8Answer4);
			}


		}
		if(randomInt==13){

			String Acronym13Answer1="Consistency in the accounting treatment from year to year";
			String Acronym13Answer2="Avoid distortions resulting from contribution fluctuations";
			String Acronym13Answer3="Recognise the realistic costs of accruing benefits";
			String Acronym13Answer4="Disclosure of appropriate information";
			

			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);

			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();
			String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();

			if(Acronym13Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym13Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym13Answer1);
			}

			if(Acronym13Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym13Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym13Answer2);
			}

			if(Acronym13Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym13Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym13Answer3);
			}

			if(Acronym13Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym13Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym13Answer4);
			}



		}
		if(randomInt==14){

			String Acronym14Answer1="Director's pension costs";
			String Acronym14Answer2="Investment strategy and performance";
			String Acronym14Answer3="Surplus/deficit arising in last year and acccrued to date";
			String Acronym14Answer4="Calculation methods and assumptions";
			String Acronym14Answer5="Liabilities accruing over the year and accrued to date";
			String Acronym14Answer6="Options and guarantees";
			String Acronym14Answer7="Sponsors' contributions obligations and members' contributions";
			String Acronym14Answer8="Uncertainities (risk)";
			String Acronym14Answer9="Rights in wind up";
			String Acronym14Answer10="Expense";
			
			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}

			if(Acronym14Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}

			if(Acronym14Answer8.equals(checkuseranswerCA1X88)){
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}else{
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}

			if(Acronym14Answer9.equals(checkuseranswerCA1X89)){
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X8.setText(Acronym14Answer9);
			}else{
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X8.setText(Acronym14Answer9);
			}

			if(Acronym14Answer10.equals(checkuseranswerCA1X810)){
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X8.setText(Acronym14Answer10);
			}else{
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X8.setText(Acronym14Answer10);
			}

		}
		
		if(randomInt==15){

			String Acronym14Answer1="Payment commencment";
			String Acronym14Answer2="Request";
			String Acronym14Answer3="Intervals";
			String Acronym14Answer4="Combination";
			String Acronym14Answer5="Entry";
			

			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}



		}
		
		if(randomInt==16){

			String Acronym14Answer1="Sponsor aware of financial significance of benefits";
			String Acronym14Answer2="Informed decisions can be made";
			String Acronym14Answer3="Misleading beneficiaries avoided (eg over expense charges)";
			String Acronym14Answer4="Manages the expectations of members";
			String Acronym14Answer5="Encourages take up";
			String Acronym14Answer6="Regulatory requirement";
			String Acronym14Answer7="Security of scheme improved as sponsor/trustees are made more accountable";
			
			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}

			if(Acronym14Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}



		}
		
		if(randomInt==17){

			String Acronym14Answer1="Divergence of actual vs expected (show financial effect/signifance of)";
			String Acronym14Answer2="Information to managment and for accounts";
			String Acronym14Answer3="Variance of whole = sum of the parts";
			String Acronym14Answer4="Experience monitoring to feedback into ACC";
			String Acronym14Answer5="Reconcile values for succesive years";
			String Acronym14Answer6="Group into one-off/recurring sources of surplus";
			String Acronym14Answer7="Executive remuneration schemes (data for)";
			String Acronym14Answer8="New business strain (show effects of)";
			String Acronym14Answer9="Check on valution assumptions and calculations";
			String Acronym14Answer10="Extra check on valuation data and process";
			
			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}

			if(Acronym14Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}

			if(Acronym14Answer8.equals(checkuseranswerCA1X88)){
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}else{
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}

			if(Acronym14Answer9.equals(checkuseranswerCA1X89)){
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X8.setText(Acronym14Answer9);
			}else{
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X8.setText(Acronym14Answer9);
			}

			if(Acronym14Answer10.equals(checkuseranswerCA1X810)){
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X8.setText(Acronym14Answer10);
			}else{
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X8.setText(Acronym14Answer10);
			}


		}
		
		if(randomInt==18){

			String Acronym14Answer1="Salary growth";
			String Acronym14Answer2="Expenses";
			String Acronym14Answer3="Mortality";
			String Acronym14Answer4="Amount of claims";
			String Acronym14Answer5="New business levels";
			String Acronym14Answer6="Taxation";
			String Acronym14Answer7="Inflation";
			String Acronym14Answer8="Commission";
			String Acronym14Answer9="Withdrawals/lapses";
			String Acronym14Answer10="Investement income/gains";
			String Acronym14Answer11="Morbidity";
			String Acronym14Answer12="Premiums/contributions paid";
			
			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}

			if(Acronym14Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}

			if(Acronym14Answer8.equals(checkuseranswerCA1X88)){
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}else{
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}

			if(Acronym14Answer9.equals(checkuseranswerCA1X89)){
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X8.setText(Acronym14Answer9);
			}else{
				textViewAnswer9CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X8.setText(Acronym14Answer9);
			}

			if(Acronym14Answer10.equals(checkuseranswerCA1X810)){
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X8.setText(Acronym14Answer10);
			}else{
				textViewAnswer10CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X8.setText(Acronym14Answer10);
			}

			if(Acronym14Answer11.equals(checkuseranswerCA1X811)){
				textViewAnswer11CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X8.setText(Acronym14Answer11);
			}else{
				textViewAnswer11CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X8.setText(Acronym14Answer11);
			}

			if(Acronym14Answer12.equals(checkuseranswerCA1X812)){
				textViewAnswer12CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X8.setText(Acronym14Answer12);
			}else{
				textViewAnswer12CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X8.setText(Acronym14Answer12);
			}

	
		}
		
		if(randomInt==19){

			String Acronym14Answer1="Renewal increase/withdrawal decrease";
			String Acronym14Answer2="Expense control";
			String Acronym14Answer3="Tax management policy";
			String Acronym14Answer4="Amount of claim/benefit reduction";
			String Acronym14Answer5="Investment returns increase";
			String Acronym14Answer6="Likelihood of claim decrease";
			
			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}



		}
		
		if(randomInt==20){

			String Acronym14Answer1="Provision of capital";
			String Acronym14Answer2="Objectives (business) of the company";
			String Acronym14Answer3="Expectations of policyholders";
			String Acronym14Answer4="Margins for future adverse experience";
			String Acronym14Answer5="Legislation for benefit schemes";
			String Acronym14Answer6="Industrial relations";
			String Acronym14Answer7="Source of surplus";
			String Acronym14Answer8="Tax treatment";
			
			EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
			EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
			EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
			EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
			EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
			EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
			EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
			EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);
			EditTextCA1X8Answer17 = (EditText)findViewById(R.id.EditTextCA1X8Answer17);		EditTextCA1X8Answer18 = (EditText)findViewById(R.id.EditTextCA1X8Answer18);		


			textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
			textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
			textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
			textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
			textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
			textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
			textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
			textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);
			textViewAnswer17CA1X8 = (TextView) findViewById(R.id.textViewAnswer17CA1X8);		textViewAnswer18CA1X8 = (TextView) findViewById(R.id.textViewAnswer18CA1X8);

			String checkuseranswerCA1X81=EditTextCA1X8Answer1.getText().toString();	String checkuseranswerCA1X82=EditTextCA1X8Answer2.getText().toString();
			String checkuseranswerCA1X83=EditTextCA1X8Answer3.getText().toString();	String checkuseranswerCA1X84=EditTextCA1X8Answer4.getText().toString();
			String checkuseranswerCA1X85=EditTextCA1X8Answer5.getText().toString();
			String checkuseranswerCA1X86=EditTextCA1X8Answer6.getText().toString();
			String checkuseranswerCA1X87=EditTextCA1X8Answer7.getText().toString();
			String checkuseranswerCA1X88=EditTextCA1X8Answer8.getText().toString();
			String checkuseranswerCA1X89=EditTextCA1X8Answer9.getText().toString();
			String checkuseranswerCA1X810=EditTextCA1X8Answer10.getText().toString();
			String checkuseranswerCA1X811=EditTextCA1X8Answer11.getText().toString();
			String checkuseranswerCA1X812=EditTextCA1X8Answer12.getText().toString();
			String checkuseranswerCA1X813=EditTextCA1X8Answer13.getText().toString();
			String checkuseranswerCA1X814=EditTextCA1X8Answer14.getText().toString();
			String checkuseranswerCA1X815=EditTextCA1X8Answer15.getText().toString();
			String checkuseranswerCA1X816=EditTextCA1X8Answer16.getText().toString();

			if(Acronym14Answer1.equals(checkuseranswerCA1X81)){
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X8.setText(Acronym14Answer1);
			}

			if(Acronym14Answer2.equals(checkuseranswerCA1X82)){
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X8.setText(Acronym14Answer2);
			}

			if(Acronym14Answer3.equals(checkuseranswerCA1X83)){
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X8.setText(Acronym14Answer3);
			}

			if(Acronym14Answer4.equals(checkuseranswerCA1X84)){
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X8.setText(Acronym14Answer4);
			}

			if(Acronym14Answer5.equals(checkuseranswerCA1X85)){
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X8.setText(Acronym14Answer5);
			}

			if(Acronym14Answer6.equals(checkuseranswerCA1X86)){
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X8.setText(Acronym14Answer6);
			}

			if(Acronym14Answer7.equals(checkuseranswerCA1X87)){
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X8.setText(Acronym14Answer7);
			}

			if(Acronym14Answer8.equals(checkuseranswerCA1X88)){
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}else{
				textViewAnswer8CA1X8.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X8.setText(Acronym14Answer8);
			}

		}

	}

	//////////////////////HAS 20///////////////////
	/////////////////////DONE/////////////////
	public void onClickGetAcronymCA1X8(View v)
	{

		TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);
		TextViewTitleAnswerCA1X8.setText(null);

		EditTextTestCA1X8 = (EditText) findViewById(R.id.EditTextTestCA1X8);
		EditTextTestCA1X8.setText(null);

		CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
		CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
		CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
		CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);		CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);		CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
		CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);		CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
		CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);		CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
		CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);		CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

		CA1X8Answer1Letter1.setText(null);		CA1X8Answer1Letter2.setText(null);		CA1X8Answer1Letter3.setText(null);		CA1X8Answer1Letter4.setText(null);
		CA1X8Answer1Letter5.setText(null);		CA1X8Answer1Letter6.setText(null);		CA1X8Answer1Letter7.setText(null);		CA1X8Answer1Letter8.setText(null);
		CA1X8Answer1Letter9.setText(null);		CA1X8Answer1Letter10.setText(null);		CA1X8Answer1Letter11.setText(null);		CA1X8Answer1Letter12.setText(null);
		CA1X8Answer1Letter13.setText(null);		CA1X8Answer1Letter13.setText(null);		CA1X8Answer1Letter14.setText(null);		CA1X8Answer1Letter15.setText(null);
		CA1X8Answer1Letter16.setText(null);



		EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
		EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
		EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
		EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
		EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
		EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
		EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
		EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);

		EditTextCA1X8Answer1.setText(null);		EditTextCA1X8Answer2.setText(null);		EditTextCA1X8Answer3.setText(null);		EditTextCA1X8Answer4.setText(null);
		EditTextCA1X8Answer5.setText(null);		EditTextCA1X8Answer6.setText(null);		EditTextCA1X8Answer7.setText(null);		EditTextCA1X8Answer8.setText(null);
		EditTextCA1X8Answer9.setText(null);		EditTextCA1X8Answer10.setText(null);		EditTextCA1X8Answer11.setText(null);		EditTextCA1X8Answer12.setText(null);
		EditTextCA1X8Answer13.setText(null);		EditTextCA1X8Answer14.setText(null);		EditTextCA1X8Answer15.setText(null);
		EditTextCA1X8Answer16.setText(null);

		textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
		textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
		textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
		textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
		textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
		textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
		textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
		textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);

		textViewAnswer1CA1X8.setText(null);		textViewAnswer2CA1X8.setText(null);		textViewAnswer3CA1X8.setText(null);		textViewAnswer4CA1X8.setText(null);
		textViewAnswer5CA1X8.setText(null);		textViewAnswer6CA1X8.setText(null);		textViewAnswer7CA1X8.setText(null);		textViewAnswer8CA1X8.setText(null);
		textViewAnswer9CA1X8.setText(null);		textViewAnswer10CA1X8.setText(null);		textViewAnswer11CA1X8.setText(null);		textViewAnswer12CA1X8.setText(null);
		textViewAnswer13CA1X8.setText(null);		textViewAnswer14CA1X8.setText(null);		textViewAnswer15CA1X8.setText(null);		textViewAnswer16CA1X8.setText(null);
		
		TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);
		TextViewTitleAnswerCA1X8.setText(null);

		EditTextTestCA1X8 = (EditText) findViewById(R.id.EditTextTestCA1X8);
		EditTextTestCA1X8.setText(null);

		Random randomNum = new Random();
		randomInt = randomNum.nextInt(20)+1;//when you click "Display Database"

		

		if(randomInt == 1){

			String Acronym1Acronym ="EPIC NAFFF";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym1Acronym);

		}

		if(randomInt == 2){

			String Acronym2Acronym ="FAT REF";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym2Acronym);



		}

		if(randomInt == 3){

			String Acronym3Acronym ="ACE COP";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym3Acronym);



		}

		if(randomInt == 4){

			String Acronym4Acronym ="RILE";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym4Acronym);


		}

		if(randomInt == 5){

			String Acronym5Acronym ="BIG ASS";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym5Acronym);


		}

		if(randomInt == 6){



			String Acronym6Acronym ="SIRRIN";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym6Acronym);


		}

		if(randomInt == 7){



			String Acronym7Acronym ="ICMADDOGS";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym7Acronym);


		}

		if(randomInt == 8){

			String Acronym8Acronym="RAM";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym8Acronym);


		}

		if(randomInt == 9){

			String Acronym9Acronym ="CASED";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym9Acronym);



		}

		if(randomInt == 10){

			String Acronym10Acronym ="SPEC";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym10Acronym);


		}

		if(randomInt == 11){

			String Acronym11Acronym ="GERM MAC CAMP";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym11Acronym);


		}

		if(randomInt == 12){

			String Acronym12Acronym ="CORE";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym12Acronym);


		}

		if(randomInt == 13){

			String Acronym13Acronym ="CARD";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym13Acronym);


		}

		if(randomInt == 14){

			String Acronym14Acronym ="DISCLOSURE";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Acronym);


		}
		
		if(randomInt == 15){

			String Acronym14Acronym ="PRICE";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Acronym);


		}
		
		if(randomInt == 16){

			String Acronym14Acronym ="SIMMERS";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Acronym);


		}
		
		if(randomInt == 17){

			String Acronym14Acronym ="DIVERGENCE";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Acronym);


		}
		
		if(randomInt == 18){

			String Acronym14Acronym ="SEMANTIC WIMP";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Acronym);


		}
		
		if(randomInt == 19){

			String Acronym14Acronym ="RETAIL";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Acronym);


		}
		
		if(randomInt == 20){

			String Acronym14Acronym ="POEM LIST";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Acronym);


		}
		

	}

	///////////////////HAS 20////////////////////
	///////////////////DONE///////////////////
	public void onClickTestYourselfAcronymCA1X8(View v)
	{

		if (randomInt==1)
		{

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);
			CA1X8Answer1Letter17 = (TextView) findViewById(R.id.CA1X8Answer1Letter17);
			CA1X8Answer1Letter18 = (TextView) findViewById(R.id.CA1X8Answer1Letter18);

			CA1X8Answer1Letter1.setText("E");
			CA1X8Answer1Letter2.setText("P");
			CA1X8Answer1Letter3.setText("I");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("N");
			CA1X8Answer1Letter6.setText("A");
			CA1X8Answer1Letter7.setText("F");
			CA1X8Answer1Letter8.setText("F");
			CA1X8Answer1Letter9.setText("F");
			
			String Acronym="EPIC NAFFF";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}
		}

		if (randomInt==2)
		{	

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);		CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);		CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);

			CA1X8Answer1Letter1.setText("F");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("T");
			CA1X8Answer1Letter4.setText("R");
			CA1X8Answer1Letter5.setText("E");
			CA1X8Answer1Letter6.setText("F");


			String Acronym="FAT REF";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			CA1X8Answer1Letter1.setText("A");
			CA1X8Answer1Letter2.setText("C");
			CA1X8Answer1Letter3.setText("E");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("O");
			CA1X8Answer1Letter6.setText("P");
			

			String Acronym="ACE COP";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}
		}

		if (randomInt==4)
		{

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);

			CA1X8Answer1Letter1.setText("R");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("L");
			CA1X8Answer1Letter4.setText("E");
			
			String Acronym="RILE";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}
		}
		if (randomInt==5)
		{


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);

			CA1X8Answer1Letter1.setText("B");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("G");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("S");
			CA1X8Answer1Letter6.setText("S");
			
			String Acronym="BIG ASS";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==6)
		{	

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);		CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);		CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);	CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("R");
			CA1X8Answer1Letter4.setText("R");
			CA1X8Answer1Letter5.setText("E");
			CA1X8Answer1Letter6.setText("N");
			
			String Acronym="SIRREN";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==7){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);
			CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);

			CA1X8Answer1Letter1.setText("I");
			CA1X8Answer1Letter2.setText("C");
			CA1X8Answer1Letter3.setText("M");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("D");
			CA1X8Answer1Letter6.setText("D");
			CA1X8Answer1Letter7.setText("O");
			CA1X8Answer1Letter8.setText("G");
			CA1X8Answer1Letter9.setText("S");

			String Acronym="ICMADDOGS";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==8){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("R");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("M");
			


			String Acronym="RAM";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==9){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		


			CA1X8Answer1Letter1.setText("C");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("S");
			CA1X8Answer1Letter4.setText("E");
			CA1X8Answer1Letter4.setText("D");

			String Acronym="CASED";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==10){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("P");
			CA1X8Answer1Letter3.setText("E");
			CA1X8Answer1Letter4.setText("C");
			


			String Acronym="SPEC";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==11){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);

			CA1X8Answer1Letter1.setText("G");
			CA1X8Answer1Letter2.setText("E");
			CA1X8Answer1Letter3.setText("R");
			CA1X8Answer1Letter4.setText("M");
			CA1X8Answer1Letter5.setText("M");
			CA1X8Answer1Letter6.setText("A");
			CA1X8Answer1Letter7.setText("C");
			CA1X8Answer1Letter8.setText("C");
			CA1X8Answer1Letter9.setText("A");
			CA1X8Answer1Letter10.setText("M");
			CA1X8Answer1Letter11.setText("P");

			String Acronym="GERM MAC CAMP";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==12){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);

			CA1X8Answer1Letter1.setText("C");
			CA1X8Answer1Letter2.setText("O");
			CA1X8Answer1Letter3.setText("R");
			CA1X8Answer1Letter4.setText("E");


			String Acronym="CORE";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==13){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);
			CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);

			CA1X8Answer1Letter1.setText("C");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("R");
			CA1X8Answer1Letter4.setText("D");
			

			String Acronym="CARD";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==14){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("D");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("S");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("L");
			CA1X8Answer1Letter6.setText("O");
			CA1X8Answer1Letter7.setText("S");
			CA1X8Answer1Letter8.setText("U");
			CA1X8Answer1Letter9.setText("R");
			CA1X8Answer1Letter10.setText("E");
			


			String Acronym="DISCLOSURE";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		
		if (randomInt==15){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("P");
			CA1X8Answer1Letter2.setText("R");
			CA1X8Answer1Letter3.setText("I");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("E");
			

			String Acronym="PRICE";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		
		if (randomInt==16){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("M");
			CA1X8Answer1Letter4.setText("M");
			CA1X8Answer1Letter5.setText("E");
			CA1X8Answer1Letter6.setText("R");
			CA1X8Answer1Letter7.setText("S");
			

			String Acronym="SIMMERS";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		
		if (randomInt==17){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("D");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("V");
			CA1X8Answer1Letter4.setText("E");
			CA1X8Answer1Letter5.setText("R");
			CA1X8Answer1Letter6.setText("G");
			CA1X8Answer1Letter7.setText("E");
			CA1X8Answer1Letter8.setText("N");
			CA1X8Answer1Letter9.setText("C");
			CA1X8Answer1Letter10.setText("E");


			String Acronym="DIVERGENCE";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		
		if (randomInt==18){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("E");
			CA1X8Answer1Letter3.setText("M");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("N");
			CA1X8Answer1Letter6.setText("T");
			CA1X8Answer1Letter7.setText("I");
			CA1X8Answer1Letter8.setText("C");
			CA1X8Answer1Letter9.setText("W");
			CA1X8Answer1Letter10.setText("I");
			CA1X8Answer1Letter11.setText("M");
			CA1X8Answer1Letter12.setText("P");
			
			
			String Acronym="SEMANTIC WIMP";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==19){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("R");
			CA1X8Answer1Letter2.setText("E");
			CA1X8Answer1Letter3.setText("T");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("I");
			CA1X8Answer1Letter6.setText("L");
			

			String Acronym="RETAIL";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		
		if (randomInt==20){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("P");
			CA1X8Answer1Letter2.setText("O");
			CA1X8Answer1Letter3.setText("E");
			CA1X8Answer1Letter4.setText("M");
			CA1X8Answer1Letter5.setText("L");
			CA1X8Answer1Letter6.setText("I");
			CA1X8Answer1Letter7.setText("S");
			CA1X8Answer1Letter8.setText("T");
			

			String Acronym="POEM LIST";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		



	}

	////////////////////HAS 20//////////////
	///////////////////DONE///////////////
	public void onClickGetTitleCA1X8(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(20)+1;//when you click "Display Database"

		TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);
		TextViewTitleAnswerCA1X8.setText(null);

		EditTextTestCA1X8 = (EditText) findViewById(R.id.EditTextTestCA1X8);
		EditTextTestCA1X8.setText(null);

		CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
		CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
		CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
		CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);		CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);		CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
		CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);		CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
		CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);		CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
		CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);		CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

		CA1X8Answer1Letter1.setText(null);		CA1X8Answer1Letter2.setText(null);		CA1X8Answer1Letter3.setText(null);
		CA1X8Answer1Letter4.setText(null);		CA1X8Answer1Letter5.setText(null);		CA1X8Answer1Letter6.setText(null);
		CA1X8Answer1Letter7.setText(null);		CA1X8Answer1Letter8.setText(null);		CA1X8Answer1Letter9.setText(null);
		CA1X8Answer1Letter10.setText(null);		CA1X8Answer1Letter11.setText(null);		CA1X8Answer1Letter12.setText(null);
		CA1X8Answer1Letter13.setText(null);		CA1X8Answer1Letter13.setText(null);		CA1X8Answer1Letter14.setText(null);
		CA1X8Answer1Letter15.setText(null);		CA1X8Answer1Letter16.setText(null);



		EditTextCA1X8Answer1 = (EditText)findViewById(R.id.EditTextCA1X8Answer1);		EditTextCA1X8Answer2 = (EditText)findViewById(R.id.EditTextCA1X8Answer2);
		EditTextCA1X8Answer3 = (EditText)findViewById(R.id.EditTextCA1X8Answer3);		EditTextCA1X8Answer4 = (EditText)findViewById(R.id.EditTextCA1X8Answer4);
		EditTextCA1X8Answer5 = (EditText)findViewById(R.id.EditTextCA1X8Answer5);		EditTextCA1X8Answer6 = (EditText)findViewById(R.id.EditTextCA1X8Answer6);
		EditTextCA1X8Answer7 = (EditText)findViewById(R.id.EditTextCA1X8Answer7);		EditTextCA1X8Answer8 = (EditText)findViewById(R.id.EditTextCA1X8Answer8);
		EditTextCA1X8Answer9 = (EditText)findViewById(R.id.EditTextCA1X8Answer9);		EditTextCA1X8Answer10 = (EditText)findViewById(R.id.EditTextCA1X8Answer10);
		EditTextCA1X8Answer11 = (EditText)findViewById(R.id.EditTextCA1X8Answer11);		EditTextCA1X8Answer12 = (EditText)findViewById(R.id.EditTextCA1X8Answer12);
		EditTextCA1X8Answer13 = (EditText)findViewById(R.id.EditTextCA1X8Answer13);		EditTextCA1X8Answer14 = (EditText)findViewById(R.id.EditTextCA1X8Answer14);
		EditTextCA1X8Answer15 = (EditText)findViewById(R.id.EditTextCA1X8Answer15);		EditTextCA1X8Answer16 = (EditText)findViewById(R.id.EditTextCA1X8Answer16);

		EditTextCA1X8Answer1.setText(null);		EditTextCA1X8Answer2.setText(null);		EditTextCA1X8Answer3.setText(null);
		EditTextCA1X8Answer4.setText(null);		EditTextCA1X8Answer5.setText(null);		EditTextCA1X8Answer6.setText(null);
		EditTextCA1X8Answer7.setText(null);		EditTextCA1X8Answer8.setText(null);		EditTextCA1X8Answer9.setText(null);
		EditTextCA1X8Answer10.setText(null);		EditTextCA1X8Answer11.setText(null);		EditTextCA1X8Answer12.setText(null);
		EditTextCA1X8Answer13.setText(null);		EditTextCA1X8Answer14.setText(null);		EditTextCA1X8Answer15.setText(null);
		EditTextCA1X8Answer16.setText(null);

		textViewAnswer1CA1X8 = (TextView) findViewById(R.id.textViewAnswer1CA1X8);		textViewAnswer2CA1X8= (TextView) findViewById(R.id.textViewAnswer2CA1X8);
		textViewAnswer3CA1X8 = (TextView) findViewById(R.id.textViewAnswer3CA1X8);		textViewAnswer4CA1X8 = (TextView) findViewById(R.id.textViewAnswer4CA1X8);
		textViewAnswer5CA1X8 = (TextView) findViewById(R.id.textViewAnswer5CA1X8);		textViewAnswer6CA1X8 = (TextView) findViewById(R.id.textViewAnswer6CA1X8);
		textViewAnswer7CA1X8 = (TextView) findViewById(R.id.textViewAnswer7CA1X8);		textViewAnswer8CA1X8 = (TextView) findViewById(R.id.textViewAnswer8CA1X8);
		textViewAnswer9CA1X8 = (TextView) findViewById(R.id.textViewAnswer9CA1X8);		textViewAnswer10CA1X8 = (TextView) findViewById(R.id.textViewAnswer10CA1X8);
		textViewAnswer11CA1X8 = (TextView) findViewById(R.id.textViewAnswer11CA1X8);		textViewAnswer12CA1X8 = (TextView) findViewById(R.id.textViewAnswer12CA1X8);
		textViewAnswer13CA1X8 = (TextView) findViewById(R.id.textViewAnswer13CA1X8);		textViewAnswer14CA1X8 = (TextView) findViewById(R.id.textViewAnswer14CA1X8);
		textViewAnswer15CA1X8 = (TextView) findViewById(R.id.textViewAnswer15CA1X8);		textViewAnswer16CA1X8 = (TextView) findViewById(R.id.textViewAnswer16CA1X8);

		textViewAnswer1CA1X8.setText(null);		textViewAnswer2CA1X8.setText(null);		textViewAnswer3CA1X8.setText(null);
		textViewAnswer4CA1X8.setText(null);		textViewAnswer5CA1X8.setText(null);		textViewAnswer6CA1X8.setText(null);
		textViewAnswer7CA1X8.setText(null);		textViewAnswer8CA1X8.setText(null);		textViewAnswer9CA1X8.setText(null);
		textViewAnswer10CA1X8.setText(null);		textViewAnswer11CA1X8.setText(null);		textViewAnswer12CA1X8.setText(null);
		textViewAnswer13CA1X8.setText(null);		textViewAnswer14CA1X8.setText(null);		textViewAnswer15CA1X8.setText(null);
		textViewAnswer16CA1X8.setText(null);


		if(randomInt == 1){

			String Acronym1Title ="Setting discontinuance terms in life insurance";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym1Title);



		}

		if(randomInt == 2){

			String Acronym2Title ="Considerations for setting discontinuance terms in a benefit scheme";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym2Title);


		}

		if(randomInt == 3){

			String Acronym3Title ="Projecting solvency";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym3Title);



		}

		if(randomInt == 4){

			String Acronym4Title ="Considerations for an acquiring company";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym4Title);


		}

		if(randomInt == 5){

			String Acronym5Title ="Options for provision of outstanding benefits in a personal benefit scheme";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym5Title);


		}

		if(randomInt == 6){



			String Acronym6Title ="Factors affecting the strength of the basis";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym6Title);


		}

		if(randomInt == 7){



			String Acronym7Title ="Reasons for valuing liabilities/provisions";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym7Title);


		}

		if(randomInt == 8){

			String Acronym8Title ="reasons for global provisions";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym8Title);


		}

		if(randomInt == 9){

			String Acronym9Title ="Factors affecting the value of options";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym9Title);



		}

		if(randomInt == 10){

			String Acronym10Title ="Methods of calculating provisions";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym10Title);


		}

		if(randomInt == 11){

			String Acronym11Title ="Accounting concepts and principles";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym11Title);


		}

		if(randomInt == 12){

			String Acronym12Title ="Ratios used to analyse accounts";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym12Title);


		}

		if(randomInt == 13){

			String Acronym13Title ="Common aims of accounting standards";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym13Title);


		}

		if(randomInt == 14){

			String Acronym14Title ="Information to be disclosed from a benefit scheme";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Title);


		}
		
		if(randomInt == 15){

			String Acronym14Title ="when information from a benefit scheme should be disclosed";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Title);


		}
		
		if(randomInt == 16){

			String Acronym14Title ="Reasons why disclosure is important";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Title);


		}

		if(randomInt == 17){

			String Acronym14Title ="Reasons for performing an analysis of surplus";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Title);


		}
		
		if(randomInt == 18){

			String Acronym14Title = "Sources of surplus";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Title);


		}
		
		if(randomInt == 19){

			String Acronym14Title ="Levers on surplus";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Title);


		}
		
		if(randomInt == 20){

			String Acronym14Title ="Issues surrounding the amount of surplus to distribute";

			textViewCA1X8 = (TextView) findViewById(R.id.PullTestStringCA1X8);//take in string
			textViewCA1X8.setText(Acronym14Title);


		}

	}


	/////////////////////HAS 20////////////
	//////////////////////DONE//////////////
	public void onClickTestYourselfTitleCA1X8(View v)
	{
		if (randomInt==1)
		{

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);
			CA1X8Answer1Letter17 = (TextView) findViewById(R.id.CA1X8Answer1Letter17);
			CA1X8Answer1Letter18 = (TextView) findViewById(R.id.CA1X8Answer1Letter18);

			CA1X8Answer1Letter1.setText("E");
			CA1X8Answer1Letter2.setText("P");
			CA1X8Answer1Letter3.setText("I");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("N");
			CA1X8Answer1Letter6.setText("A");
			CA1X8Answer1Letter7.setText("F");
			CA1X8Answer1Letter8.setText("F");
			CA1X8Answer1Letter9.setText("F");
			
			String Acronym="Setting discontinuance terms in life insurance";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==2)
		{

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);		CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);		CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);

			CA1X8Answer1Letter1.setText("F");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("T");
			CA1X8Answer1Letter4.setText("R");
			CA1X8Answer1Letter5.setText("E");
			CA1X8Answer1Letter6.setText("F");



			String Acronym="Considerations for setting discontinuance terms in a benefit scheme";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}
		}

		if (randomInt==3)
		{


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);		CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);		CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);

			CA1X8Answer1Letter1.setText("A");
			CA1X8Answer1Letter2.setText("C");
			CA1X8Answer1Letter3.setText("E");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("O");
			CA1X8Answer1Letter6.setText("P");
			


			String Acronym="Projecting solvency";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}
		}

		if (randomInt==4)
		{


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);

			CA1X8Answer1Letter1.setText("R");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("L");
			CA1X8Answer1Letter4.setText("E");
			

			String Acronym="Considerations for an acquiring company";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}
		}
		if (randomInt==5)
		{


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);

			CA1X8Answer1Letter1.setText("B");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("G");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("S");
			CA1X8Answer1Letter6.setText("S");
			

			String Acronym="Options for provision of outstanding benefits in a personal benefit scheme";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==6)
		{


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);		CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);		CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("R");
			CA1X8Answer1Letter4.setText("R");
			CA1X8Answer1Letter5.setText("I");
			CA1X8Answer1Letter6.setText("N");
			


			String Acronym="SIRRIN";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==7){

			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);
			CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);

			CA1X8Answer1Letter1.setText("I");
			CA1X8Answer1Letter2.setText("C");
			CA1X8Answer1Letter3.setText("M");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("D");
			CA1X8Answer1Letter6.setText("D");
			CA1X8Answer1Letter7.setText("O");
			CA1X8Answer1Letter8.setText("G");
			CA1X8Answer1Letter9.setText("S");

			String Acronym="Reasons for valuing liabilities/provisions";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==8){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("R");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("M");
			


			String Acronym="reasons for global provisions";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==9){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		


			CA1X8Answer1Letter1.setText("C");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("S");
			CA1X8Answer1Letter4.setText("E");
			CA1X8Answer1Letter5.setText("D");

			String Acronym="Factors affecting the value of options";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==10){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);		CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("P");
			CA1X8Answer1Letter3.setText("E");	
			CA1X8Answer1Letter4.setText("C");
			


			String Acronym="Methods of calculating provisions";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==11){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);		CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);

			CA1X8Answer1Letter1.setText("G");
			CA1X8Answer1Letter2.setText("E");
			CA1X8Answer1Letter3.setText("R");	
			CA1X8Answer1Letter4.setText("M");
			CA1X8Answer1Letter5.setText("M");	
			CA1X8Answer1Letter6.setText("A");
			CA1X8Answer1Letter7.setText("C");
			CA1X8Answer1Letter8.setText("C");
			CA1X8Answer1Letter9.setText("A");
			CA1X8Answer1Letter10.setText("M");
			CA1X8Answer1Letter11.setText("P");

			String Acronym="Accounting concepts and principles";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==12){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);

			CA1X8Answer1Letter1.setText("C");
			CA1X8Answer1Letter2.setText("O");
			CA1X8Answer1Letter3.setText("R");
			CA1X8Answer1Letter4.setText("E");


			String Acronym="Ratios used to analyse accounts";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==13){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);
			CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);

			CA1X8Answer1Letter1.setText("C");
			CA1X8Answer1Letter2.setText("A");
			CA1X8Answer1Letter3.setText("R");
			CA1X8Answer1Letter4.setText("D");
			

			String Acronym="Common aims of accounting standards";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		if (randomInt==14){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("D");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("S");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("L");
			CA1X8Answer1Letter6.setText("O");
			CA1X8Answer1Letter7.setText("S");
			CA1X8Answer1Letter8.setText("U");
			CA1X8Answer1Letter9.setText("R");
			CA1X8Answer1Letter10.setText("E");
			

			String Acronym="Information to be disclosed from a benefit scheme";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}
		
		if (randomInt==15){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("P");
			CA1X8Answer1Letter2.setText("R");
			CA1X8Answer1Letter3.setText("I");
			CA1X8Answer1Letter4.setText("C");
			CA1X8Answer1Letter5.setText("E");
			
			String Acronym="when information from a benefit scheme should be disclosed";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==16){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("M");
			CA1X8Answer1Letter4.setText("M");
			CA1X8Answer1Letter5.setText("E");
			CA1X8Answer1Letter6.setText("R");
			CA1X8Answer1Letter7.setText("S");
			

			String Acronym="Reasons why disclosure is important";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==17){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("D");
			CA1X8Answer1Letter2.setText("I");
			CA1X8Answer1Letter3.setText("V");
			CA1X8Answer1Letter4.setText("E");
			CA1X8Answer1Letter5.setText("R");
			CA1X8Answer1Letter6.setText("G");
			CA1X8Answer1Letter7.setText("E");
			CA1X8Answer1Letter8.setText("N");
			CA1X8Answer1Letter9.setText("C");
			CA1X8Answer1Letter10.setText("E");

			String Acronym="Reasons for performing an analysis of surplus";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==18){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("S");
			CA1X8Answer1Letter2.setText("E");
			CA1X8Answer1Letter3.setText("M");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("N");
			CA1X8Answer1Letter6.setText("T");
			CA1X8Answer1Letter7.setText("I");
			CA1X8Answer1Letter8.setText("C");
			CA1X8Answer1Letter9.setText("W");
			CA1X8Answer1Letter10.setText("H");
			CA1X8Answer1Letter11.setText("I");
			CA1X8Answer1Letter12.setText("P");

			String Acronym="Sources of surplus";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==19){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("R");
			CA1X8Answer1Letter2.setText("E");
			CA1X8Answer1Letter3.setText("T");
			CA1X8Answer1Letter4.setText("A");
			CA1X8Answer1Letter5.setText("I");
			CA1X8Answer1Letter6.setText("L");
			

			String Acronym="Levers on surplus";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		if (randomInt==20){


			CA1X8Answer1Letter1 = (TextView) findViewById(R.id.CA1X8Answer1Letter1);		CA1X8Answer1Letter2 = (TextView) findViewById(R.id.CA1X8Answer1Letter2);
			CA1X8Answer1Letter3 = (TextView) findViewById(R.id.CA1X8Answer1Letter3);		CA1X8Answer1Letter4 = (TextView) findViewById(R.id.CA1X8Answer1Letter4);
			CA1X8Answer1Letter5 = (TextView) findViewById(R.id.CA1X8Answer1Letter5);
			CA1X8Answer1Letter6 = (TextView) findViewById(R.id.CA1X8Answer1Letter6);
			CA1X8Answer1Letter7 = (TextView) findViewById(R.id.CA1X8Answer1Letter7);
			CA1X8Answer1Letter8 = (TextView) findViewById(R.id.CA1X8Answer1Letter8);
			CA1X8Answer1Letter9 = (TextView) findViewById(R.id.CA1X8Answer1Letter9);
			CA1X8Answer1Letter10 = (TextView) findViewById(R.id.CA1X8Answer1Letter10);
			CA1X8Answer1Letter11 = (TextView) findViewById(R.id.CA1X8Answer1Letter11);
			CA1X8Answer1Letter12 = (TextView) findViewById(R.id.CA1X8Answer1Letter12);
			CA1X8Answer1Letter13 = (TextView) findViewById(R.id.CA1X8Answer1Letter13);
			CA1X8Answer1Letter14 = (TextView) findViewById(R.id.CA1X8Answer1Letter14);
			CA1X8Answer1Letter15 = (TextView) findViewById(R.id.CA1X8Answer1Letter15);
			CA1X8Answer1Letter16 = (TextView) findViewById(R.id.CA1X8Answer1Letter16);

			CA1X8Answer1Letter1.setText("P");
			CA1X8Answer1Letter2.setText("O");
			CA1X8Answer1Letter3.setText("E");
			CA1X8Answer1Letter4.setText("M");
			CA1X8Answer1Letter5.setText("L");
			CA1X8Answer1Letter6.setText("I");
			CA1X8Answer1Letter7.setText("S");
			CA1X8Answer1Letter8.setText("T");
			

			String Acronym="Issues surrounding the amount of surplus to distribute";

			EditTextTestCA1X8 = (EditText)findViewById(R.id.EditTextTestCA1X8);
			useranswerCA1X8=EditTextTestCA1X8.getText().toString();
			TextViewTitleAnswerCA1X8 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X8);

			if(Acronym.equals(useranswerCA1X8)){
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X8.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X8.setText(Acronym);
			}

		}

		
		
	}





























	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x8, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x8,
					container, false);
			return rootView;
		}
	}

}
