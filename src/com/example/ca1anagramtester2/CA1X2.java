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

public class CA1X2 extends ActionBarActivity {
	
	EditText EditTextTestCAX2;			TextView TextViewTitleAnswerCAX2;			TextView textViewCAX2;
	String useranswerCAX2;
	
	EditText EditTextCAX2Answer1;		EditText EditTextCAX2Answer2;		EditText EditTextCAX2Answer3;
	EditText EditTextCAX2Answer4;		EditText EditTextCAX2Answer5;		EditText EditTextCAX2Answer6;
	EditText EditTextCAX2Answer7;		EditText EditTextCAX2Answer8;		EditText EditTextCAX2Answer9;
	EditText EditTextCAX2Answer10;		EditText EditTextCAX2Answer11;		EditText EditTextCAX2Answer12;
	EditText EditTextCAX2Answer13;		EditText EditTextCAX2Answer14;		EditText EditTextCAX2Answer15;		EditText EditTextCAX2Answer16;
	EditText EditTextCAX2Answer17;		EditText EditTextCAX2Answer18;
    
	
	TextView CAX2Answer1Letter1;		TextView CAX2Answer1Letter2;		TextView CAX2Answer1Letter3;
	TextView CAX2Answer1Letter4;		TextView CAX2Answer1Letter5;		TextView CAX2Answer1Letter6;
	TextView CAX2Answer1Letter7;		TextView CAX2Answer1Letter8;		TextView CAX2Answer1Letter9;
	TextView CAX2Answer1Letter10;		TextView CAX2Answer1Letter11;		TextView CAX2Answer1Letter12;
	TextView CAX2Answer1Letter13;		TextView CAX2Answer1Letter14;		TextView CAX2Answer1Letter15;		TextView CAX2Answer1Letter16;
	TextView CAX2Answer1Letter17;		TextView CAX2Answer1Letter18;
    
	
	TextView textViewAnswer1CAX2;		TextView textViewAnswer2CAX2;		TextView textViewAnswer3CAX2;		TextView textViewAnswer4CAX2;
	TextView textViewAnswer5CAX2;		TextView textViewAnswer6CAX2;		TextView textViewAnswer7CAX2;		TextView textViewAnswer8CAX2;
	TextView textViewAnswer9CAX2;		TextView textViewAnswer10CAX2;		TextView textViewAnswer11CAX2;		TextView textViewAnswer12CAX2;
	TextView textViewAnswer13CAX2;		TextView textViewAnswer14CAX2;		TextView textViewAnswer15CAX2;		TextView textViewAnswer16CAX2;
	TextView textViewAnswer17CAX2;		TextView textViewAnswer18CAX2;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x2);
		
		EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
		textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);
		TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);
		
		
		CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
		CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
		CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
		CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);
		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);		CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);
		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);		CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);
		CAX2Answer1Letter15 = (TextView) findViewById(R.id.CAX2Answer1Letter15);		CAX2Answer1Letter16 = (TextView) findViewById(R.id.CAX2Answer1Letter16);
		CAX2Answer1Letter17 = (TextView) findViewById(R.id.CAX2Answer1Letter17);		CAX2Answer1Letter18 = (TextView) findViewById(R.id.CAX2Answer1Letter18);
		
		
		EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
		EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
		EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);		EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
		EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);		EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
		EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);		EditTextCAX2Answer10 = (EditText)findViewById(R.id.EditTextCAX2Answer10);
		EditTextCAX2Answer11 = (EditText)findViewById(R.id.EditTextCAX2Answer11);		EditTextCAX2Answer12 = (EditText)findViewById(R.id.EditTextCAX2Answer12);
		EditTextCAX2Answer13 = (EditText)findViewById(R.id.EditTextCAX2Answer13);		EditTextCAX2Answer14 = (EditText)findViewById(R.id.EditTextCAX2Answer14);
		EditTextCAX2Answer15 = (EditText)findViewById(R.id.EditTextCAX2Answer15);		EditTextCAX2Answer16 = (EditText)findViewById(R.id.EditTextCAX2Answer16);
		EditTextCAX2Answer17 = (EditText)findViewById(R.id.EditTextCAX2Answer17);		EditTextCAX2Answer18 = (EditText)findViewById(R.id.EditTextCAX2Answer18);
		
		
		textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
		textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
		textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
		textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
		textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		textViewAnswer10CAX2 = (TextView) findViewById(R.id.textViewAnswer10CAX2);
		textViewAnswer11CAX2 = (TextView) findViewById(R.id.textViewAnswer11CAX2);		textViewAnswer12CAX2 = (TextView) findViewById(R.id.textViewAnswer12CAX2);
		textViewAnswer13CAX2 = (TextView) findViewById(R.id.textViewAnswer13CAX2);		textViewAnswer14CAX2 = (TextView) findViewById(R.id.textViewAnswer14CAX2);
		textViewAnswer15CAX2 = (TextView) findViewById(R.id.textViewAnswer15CAX2);		textViewAnswer16CAX2 = (TextView) findViewById(R.id.textViewAnswer16CAX2);
		textViewAnswer17CAX2 = (TextView) findViewById(R.id.textViewAnswer17CAX2);		textViewAnswer18CAX2 = (TextView) findViewById(R.id.textViewAnswer18CAX2);
		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	
	////////////done///////////
	public void onClickCAX2TestAnswers(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym1Answer1="Reinsurance contracts";
			String Acronym1Answer2="Insurance contracts";
			String Acronym1Answer3="Pension schemes";
			String Acronym1Answer4="Investment schemes";
			String Acronym1Answer5="Derivatives"; 
			
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);
			
			
			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);
			
			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX2.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText(Acronym1Answer1);
			}
			
			if(Acronym1Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX2.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText(Acronym1Answer2);
			}
			
			if(Acronym1Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX2.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText(Acronym1Answer3);
			}
			
			if(Acronym1Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX2.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText(Acronym1Answer4);
			}
			
			if(Acronym1Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX2.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText(Acronym1Answer5);
			}
		}
		if(randomInt==2){
			
			String Acronym2Answer1="Financial institutions";
			String Acronym2Answer2="Individuals";
			String Acronym2Answer3="Other corporations";
			String Acronym2Answer4="Employers";
			String Acronym2Answer5="The State";
			
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);	
					
			
			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);
			
			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();
			
			if(Acronym2Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX2.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText(Acronym2Answer1);
			}
			
			if(Acronym2Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX2.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText(Acronym2Answer2);
			}
			
			if(Acronym2Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX2.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText(Acronym2Answer3);
			}
			
			if(Acronym2Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX2.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText(Acronym2Answer4);
			}
			
			if(Acronym2Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX2.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText(Acronym2Answer5);
			}
			
			
			
		}
		if(randomInt==3){		
			
			String Acronym3Answer1="Administration simple";
			String Acronym3Answer2="Marketability";
			String Acronym3Answer3="Profitability";
			String Acronym3Answer4="Level and form benefits";
			String Acronym3Answer5="Early leaver benefits";
			String Acronym3Answer6="Discretionary benefits";
			String Acronym3Answer7="Interests and needs of customers";
			String Acronym3Answer8="Risk appetite of the parties involved";
			String Acronym3Answer9="Expenses vs charges";
			String Acronym3Answer10="Competition";
			String Acronym3Answer11="Terms and conditions";
			String Acronym3Answer12="Financing (capital requirements)";
			String Acronym3Answer13="Accounting";
			String Acronym3Answer14="Consistency with other products";
			String Acronym3Answer15="Timing of contributions of premiums";
			String Acronym3Answer16="Onerousness of options and guarantees";
			String Acronym3Answer17="Regulation";
			String Acronym3Answer18="Subsidies (cross)";
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);		EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);		EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
			EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);		EditTextCAX2Answer10 = (EditText)findViewById(R.id.EditTextCAX2Answer10);
			EditTextCAX2Answer11 = (EditText)findViewById(R.id.EditTextCAX2Answer11);		EditTextCAX2Answer12 = (EditText)findViewById(R.id.EditTextCAX2Answer12);
			EditTextCAX2Answer13 = (EditText)findViewById(R.id.EditTextCAX2Answer13);		EditTextCAX2Answer13 = (EditText)findViewById(R.id.EditTextCAX2Answer13);
			EditTextCAX2Answer14 = (EditText)findViewById(R.id.EditTextCAX2Answer14);
			EditTextCAX2Answer15 = (EditText)findViewById(R.id.EditTextCAX2Answer15);
			EditTextCAX2Answer16 = (EditText)findViewById(R.id.EditTextCAX2Answer16);
			EditTextCAX2Answer17 = (EditText)findViewById(R.id.EditTextCAX2Answer17);
			EditTextCAX2Answer18 = (EditText)findViewById(R.id.EditTextCAX2Answer18);
			
			
			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
			textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		textViewAnswer10CAX2 = (TextView) findViewById(R.id.textViewAnswer10CAX2);
			textViewAnswer11CAX2 = (TextView) findViewById(R.id.textViewAnswer11CAX2);		textViewAnswer12CAX2 = (TextView) findViewById(R.id.textViewAnswer12CAX2);
			textViewAnswer13CAX2 = (TextView) findViewById(R.id.textViewAnswer13CAX2);		textViewAnswer14CAX2 = (TextView) findViewById(R.id.textViewAnswer14CAX2);
			textViewAnswer15CAX2 = (TextView) findViewById(R.id.textViewAnswer15CAX2);
			textViewAnswer16CAX2 = (TextView) findViewById(R.id.textViewAnswer16CAX2);
			textViewAnswer17CAX2 = (TextView) findViewById(R.id.textViewAnswer17CAX2);
			textViewAnswer18CAX2 = (TextView) findViewById(R.id.textViewAnswer18CAX2);
			
			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();		String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();		String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();		String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();		String checkuseranswerCAX28=EditTextCAX2Answer8.getText().toString();
			String checkuseranswerCAX29=EditTextCAX2Answer9.getText().toString();		String checkuseranswerCAX210=EditTextCAX2Answer10.getText().toString();
			String checkuseranswerCAX211=EditTextCAX2Answer11.getText().toString();		String checkuseranswerCAX212=EditTextCAX2Answer12.getText().toString();
			String checkuseranswerCAX213=EditTextCAX2Answer13.getText().toString();		String checkuseranswerCAX214=EditTextCAX2Answer14.getText().toString();
			String checkuseranswerCAX215=EditTextCAX2Answer15.getText().toString();
			String checkuseranswerCAX216=EditTextCAX2Answer16.getText().toString();
			String checkuseranswerCAX217=EditTextCAX2Answer17.getText().toString();
			String checkuseranswerCAX218=EditTextCAX2Answer18.getText().toString();
			
			if(Acronym3Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX2.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText(Acronym3Answer1);
			}
			
			if(Acronym3Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX2.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText(Acronym3Answer2);
			}
			
			if(Acronym3Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX2.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText(Acronym3Answer3);
			}
			
			if(Acronym3Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX2.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText(Acronym3Answer4);
			}
			
			if(Acronym3Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX2.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText(Acronym3Answer5);
			}
			
			if(Acronym3Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX2.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText(Acronym3Answer6);
			}
			
			if(Acronym3Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX2.setText(Acronym3Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText(Acronym3Answer7);
			}
			
			if(Acronym3Answer8.equals(checkuseranswerCAX28)){
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX2.setText(Acronym3Answer8);
			}else{
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX2.setText(Acronym3Answer8);
			}
			
			if(Acronym3Answer9.equals(checkuseranswerCAX29)){
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX2.setText(Acronym3Answer9);
			}else{
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX2.setText(Acronym3Answer9);
			}
			
			if(Acronym3Answer10.equals(checkuseranswerCAX210)){
				textViewAnswer10CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX2.setText(Acronym3Answer10);
			}else{
				textViewAnswer10CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX2.setText(Acronym3Answer10);
			}
			
			if(Acronym3Answer11.equals(checkuseranswerCAX211)){
				textViewAnswer11CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CAX2.setText(Acronym3Answer11);
			}else{
				textViewAnswer11CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX2.setText(Acronym3Answer11);
			}
			
			if(Acronym3Answer12.equals(checkuseranswerCAX212)){
				textViewAnswer12CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CAX2.setText(Acronym3Answer12);
			}else{
				textViewAnswer12CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX2.setText(Acronym3Answer12);
			}
			
			if(Acronym3Answer13.equals(checkuseranswerCAX213)){
				textViewAnswer13CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CAX2.setText(Acronym3Answer13);
			}else{
				textViewAnswer13CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX2.setText(Acronym3Answer13);
			}
			
			if(Acronym3Answer14.equals(checkuseranswerCAX214)){
				textViewAnswer14CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CAX2.setText(Acronym3Answer14);
			}else{
				textViewAnswer14CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CAX2.setText(Acronym3Answer14);
			}
			if(Acronym3Answer15.equals(checkuseranswerCAX215)){
				textViewAnswer15CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CAX2.setText(Acronym3Answer15);
			}else{
				textViewAnswer15CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CAX2.setText(Acronym3Answer15);
			}
			if(Acronym3Answer16.equals(checkuseranswerCAX216)){
				textViewAnswer16CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer16CAX2.setText(Acronym3Answer16);
			}else{
				textViewAnswer16CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer16CAX2.setText(Acronym3Answer16);
			}
			if(Acronym3Answer17.equals(checkuseranswerCAX217)){
				textViewAnswer17CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer17CAX2.setText(Acronym3Answer17);
			}else{
				textViewAnswer17CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer17CAX2.setText(Acronym3Answer17);
			}
			if(Acronym3Answer18.equals(checkuseranswerCAX218)){
				textViewAnswer18CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer18CAX2.setText(Acronym3Answer18);
			}else{
				textViewAnswer18CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer18CAX2.setText(Acronym3Answer18);
			}
			
		}
		if(randomInt==4){
			
			String Acronym4Answer1="Claim, frequency, amount, volatility and delays";
			String Acronym4Answer2="Accumulations of risk (geographical and by class of business) and catastrophes";
			String Acronym4Answer3="Poor persistency ie high laspses and low renewals";
			String Acronym4Answer4="Expenses being higher than expected";
			String Acronym4Answer5="Investment risks eg poor or volatile returns, falls in asset values, default risk";
			String Acronym4Answer6="Credit risk ie failure of a counterparty such as a reinsurer or a broker";
			String Acronym4Answer7="Operational risks eg fraud, systems failure, regulatory charges";
			String Acronym4Answer8="New business volumes too high and hence new business strain, or too low and not enough business over which to spread overheads";
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);
			EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);
			EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
			
			
			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);
			textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);
			textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
			
			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();
			String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();
			String checkuseranswerCAX28=EditTextCAX2Answer8.getText().toString();
			
			if(Acronym4Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX2.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText(Acronym4Answer1);
			}
			
			if(Acronym4Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX2.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText(Acronym4Answer2);
			}
			
			if(Acronym4Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX2.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText(Acronym4Answer3);
			}
			
			if(Acronym4Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX2.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText(Acronym4Answer4);
			}
			
			if(Acronym4Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX2.setText(Acronym4Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText(Acronym4Answer5);
			}
			
			if(Acronym4Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX2.setText(Acronym4Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText(Acronym4Answer6);
			}
			
			if(Acronym4Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX2.setText(Acronym4Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText(Acronym4Answer7);
			}
			
			if(Acronym4Answer8.equals(checkuseranswerCAX28)){
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX2.setText(Acronym4Answer8);
			}else{
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX2.setText(Acronym4Answer8);
			}
			
			
		}
		if(randomInt==5){
			
			String Acronym5Answer1="Renewal administration";
			String Acronym5Answer2="Asset management";
			String Acronym5Answer3="Profits";
			String Acronym5Answer4="Initial administration";
			String Acronym5Answer5="Design of the contract";
			String Acronym5Answer6="Commission";
			String Acronym5Answer7="Overheads";
			String Acronym5Answer8="Sales/advertising";
			String Acronym5Answer9="Terminal eg paying benefits";
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);
			EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);
			EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
			EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);
			
			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2= (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
			textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		
			
			
			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();	String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();	String checkuseranswerCAX28=EditTextCAX2Answer8.getText().toString();
			String checkuseranswerCAX29=EditTextCAX2Answer9.getText().toString();	
			
			if(Acronym5Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX2.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText(Acronym5Answer1);
			}
			
			if(Acronym5Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX2.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText(Acronym5Answer2);
			}
			
			if(Acronym5Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX2.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText(Acronym5Answer3);
			}
			
			if(Acronym5Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX2.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText(Acronym5Answer4);
			}
			
			if(Acronym5Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX2.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText(Acronym5Answer5);
			}
			
			if(Acronym5Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX2.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText(Acronym5Answer6);
			}
			
			if(Acronym5Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX2.setText(Acronym5Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText(Acronym5Answer7);
			}
			
			if(Acronym5Answer8.equals(checkuseranswerCAX28)){
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX2.setText(Acronym5Answer8);
			}else{
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX2.setText(Acronym5Answer8);
			}
			
			if(Acronym5Answer9.equals(checkuseranswerCAX29)){
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX2.setText(Acronym5Answer9);
			}else{
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX2.setText(Acronym5Answer9);
			}
			

			
		}
		if(randomInt==6){			
			
			String Acronym6Answer1="Financial backers";
			String Acronym6Answer2="Actuaries";
			String Acronym6Answer3="Client or clients";
			String Acronym6Answer4="Accountants";
			String Acronym6Answer5="Lawyers";
			String Acronym6Answer6="Administrators";
			String Acronym6Answer7="Clients' customers";
			
			
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);
			EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);
			
			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2= (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		
			
			
			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();	String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();
			
			if(Acronym6Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX2.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText(Acronym6Answer1);
			}
			
			if(Acronym6Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX2.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText(Acronym6Answer2);
			}
			
			if(Acronym6Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX2.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText(Acronym6Answer3);
			}
			
			if(Acronym6Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX2.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText(Acronym6Answer4);
			}
			
			if(Acronym6Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX2.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText(Acronym6Answer5);
			}
			
			if(Acronym6Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX2.setText(Acronym6Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText(Acronym6Answer6);
			}
			
			if(Acronym6Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX2.setText(Acronym6Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText(Acronym6Answer7);
			}
			
		}
			
			
		
	}

	////////////done///////////
	public void onClickGetAnagramCAX2(View v)
	{
		
		TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);
		TextViewTitleAnswerCAX2.setText(null);
		
		EditTextTestCAX2 = (EditText) findViewById(R.id.EditTextTestCAX2);
		EditTextTestCAX2.setText(null);
		
		CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
		CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
		CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
		CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);
		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);		CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);
		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);		CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);
		CAX2Answer1Letter15 = (TextView) findViewById(R.id.CAX2Answer1Letter15);		CAX2Answer1Letter16 = (TextView) findViewById(R.id.CAX2Answer1Letter16);
		CAX2Answer1Letter17 = (TextView) findViewById(R.id.CAX2Answer1Letter17);		CAX2Answer1Letter18 = (TextView) findViewById(R.id.CAX2Answer1Letter18);
		
		CAX2Answer1Letter1.setText(null);		CAX2Answer1Letter2.setText(null);		CAX2Answer1Letter3.setText(null);		CAX2Answer1Letter4.setText(null);
		CAX2Answer1Letter5.setText(null);		CAX2Answer1Letter6.setText(null);		CAX2Answer1Letter7.setText(null);		CAX2Answer1Letter8.setText(null);
		CAX2Answer1Letter9.setText(null);		CAX2Answer1Letter10.setText(null);		CAX2Answer1Letter11.setText(null);		CAX2Answer1Letter12.setText(null);
		CAX2Answer1Letter13.setText(null);		CAX2Answer1Letter13.setText(null);		CAX2Answer1Letter14.setText(null);		CAX2Answer1Letter15.setText(null);
		CAX2Answer1Letter16.setText(null);		CAX2Answer1Letter17.setText(null);		CAX2Answer1Letter18.setText(null);
		
		
		
		EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
		EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
		EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);		EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
		EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);		EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
		EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);		EditTextCAX2Answer10 = (EditText)findViewById(R.id.EditTextCAX2Answer10);
		EditTextCAX2Answer11 = (EditText)findViewById(R.id.EditTextCAX2Answer11);		EditTextCAX2Answer12 = (EditText)findViewById(R.id.EditTextCAX2Answer12);
		EditTextCAX2Answer13 = (EditText)findViewById(R.id.EditTextCAX2Answer13);		EditTextCAX2Answer14 = (EditText)findViewById(R.id.EditTextCAX2Answer14);
		EditTextCAX2Answer15 = (EditText)findViewById(R.id.EditTextCAX2Answer15);		EditTextCAX2Answer16 = (EditText)findViewById(R.id.EditTextCAX2Answer16);
		EditTextCAX2Answer17 = (EditText)findViewById(R.id.EditTextCAX2Answer17);		EditTextCAX2Answer18 = (EditText)findViewById(R.id.EditTextCAX2Answer18);
		
		EditTextCAX2Answer1.setText(" ");		EditTextCAX2Answer2.setText(" ");		EditTextCAX2Answer3.setText(" ");		EditTextCAX2Answer4.setText(" ");
		EditTextCAX2Answer5.setText(" ");		EditTextCAX2Answer6.setText(" ");		EditTextCAX2Answer7.setText(" ");		EditTextCAX2Answer8.setText(" ");
		EditTextCAX2Answer9.setText(" ");		EditTextCAX2Answer10.setText(" ");		EditTextCAX2Answer11.setText(" ");		EditTextCAX2Answer12.setText(" ");
		EditTextCAX2Answer13.setText(" ");		EditTextCAX2Answer14.setText(" ");		EditTextCAX2Answer15.setText(" ");
		EditTextCAX2Answer16.setText(" ");		EditTextCAX2Answer17.setText(" ");		EditTextCAX2Answer18.setText(" ");
		
		textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
		textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
		textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
		textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
		textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		textViewAnswer10CAX2 = (TextView) findViewById(R.id.textViewAnswer10CAX2);
		textViewAnswer11CAX2 = (TextView) findViewById(R.id.textViewAnswer11CAX2);		textViewAnswer12CAX2 = (TextView) findViewById(R.id.textViewAnswer12CAX2);
		textViewAnswer13CAX2 = (TextView) findViewById(R.id.textViewAnswer13CAX2);		textViewAnswer14CAX2 = (TextView) findViewById(R.id.textViewAnswer14CAX2);
		textViewAnswer15CAX2 = (TextView) findViewById(R.id.textViewAnswer15CAX2);		textViewAnswer16CAX2 = (TextView) findViewById(R.id.textViewAnswer16CAX2);
		textViewAnswer17CAX2 = (TextView) findViewById(R.id.textViewAnswer17CAX2);		textViewAnswer18CAX2 = (TextView) findViewById(R.id.textViewAnswer18CAX2);
		
		textViewAnswer1CAX2.setText(null);		textViewAnswer2CAX2.setText(null);		textViewAnswer3CAX2.setText(null);		textViewAnswer4CAX2.setText(null);
		textViewAnswer5CAX2.setText(null);		textViewAnswer6CAX2.setText(null);		textViewAnswer7CAX2.setText(null);		textViewAnswer8CAX2.setText(null);
		textViewAnswer9CAX2.setText(null);		textViewAnswer10CAX2.setText(null);		textViewAnswer11CAX2.setText(null);		textViewAnswer12CAX2.setText(null);
		textViewAnswer13CAX2.setText(null);		textViewAnswer14CAX2.setText(null);		textViewAnswer15CAX2.setText(null);		textViewAnswer16CAX2.setText(null);
		textViewAnswer17CAX2.setText(null);		textViewAnswer18CAX2.setText(null);
		
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(6)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);
		TextViewTitleAnswerCAX2.setText(null);
		
		EditTextTestCAX2 = (EditText) findViewById(R.id.EditTextTestCAX2);
		EditTextTestCAX2.setText(null);
		
		if(randomInt == 1){

			String Acronym1Acronym ="RIPID";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym1Acronym);

		}

		if(randomInt == 2){
			
			String Acronym2Acronym ="FICES";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym2Acronym);
			
			

		}

		if(randomInt == 3){

			String Acronym3Acronym ="AMPLE DIRECT FACTORS";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym3Acronym);
			
			

		}

		if(randomInt == 4){

			String Acronym4Acronym ="CAPE ICON";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym4Acronym);
			
			
		}

		if(randomInt == 5){

			String Acronym5Acronym ="RAPID COST";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym5Acronym);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Acronym ="FACALAC";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym6Acronym);
			
			
		}

	}
	
	///////////done////////////
	public void onClickTestYourselfAnagramCAX2(View v)
	{
		
		if (randomInt==1)
		{
			String Acronym1Answer1="Reinsurance contracts";
			String Acronym1Answer2="Insurance contracts";
			String Acronym1Answer3="Pension schemes";
			String Acronym1Answer4="Investment schemes";
			String Acronym1Answer5="Derivatives";
			
			
			
			String Acronym1Answer1SubString = Acronym1Answer1.substring(0, 1); 
			String Acronym1Answer2SubString = Acronym1Answer2.substring(0, 1);
			String Acronym1Answer3SubString = Acronym1Answer3.substring(0, 1);
			String Acronym1Answer4SubString = Acronym1Answer4.substring(0, 1);
			String Acronym1Answer5SubString = Acronym1Answer5.substring(0, 1);
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);
			
			CAX2Answer1Letter1.setText(Acronym1Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym1Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym1Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym1Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym1Answer5SubString);
			
			String Acronym="RIPID";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}
		}

		if (randomInt==2)
		{	
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);

			CAX2Answer1Letter1.setText("F");
			CAX2Answer1Letter2.setText("I");
			CAX2Answer1Letter3.setText("C");
			CAX2Answer1Letter4.setText("E");
			CAX2Answer1Letter5.setText("S");
						
			String Acronym="FICES";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			
			String Acronym3Answer1SubString = "A"; 
			String Acronym3Answer2SubString = "M";
			String Acronym3Answer3SubString = "P";
			String Acronym3Answer4SubString = "L";
			String Acronym3Answer5SubString = "E";
			String Acronym3Answer6SubString = "D";
			String Acronym3Answer7SubString = "I";
			String Acronym3Answer8SubString = "R";
			String Acronym3Answer9SubString = "E";
			String Acronym3Answer10SubString = "C";
			String Acronym3Answer11SubString = "T";
			String Acronym3Answer12SubString = "F";
			String Acronym3Answer13SubString = "A";
			String Acronym3Answer14SubString = "C";
			String Acronym3Answer15SubString = "T";
			String Acronym3Answer16SubString = "O";
			String Acronym3Answer17SubString = "R";
			String Acronym3Answer18SubString = "S";
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);
			CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);
			CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);
			CAX2Answer1Letter15 = (TextView) findViewById(R.id.CAX2Answer1Letter15);
			CAX2Answer1Letter16 = (TextView) findViewById(R.id.CAX2Answer1Letter16);
			CAX2Answer1Letter17 = (TextView) findViewById(R.id.CAX2Answer1Letter17);
			CAX2Answer1Letter18 = (TextView) findViewById(R.id.CAX2Answer1Letter18);

			CAX2Answer1Letter1.setText(Acronym3Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym3Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym3Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym3Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym3Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym3Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym3Answer7SubString);
			CAX2Answer1Letter8.setText(Acronym3Answer8SubString);
			CAX2Answer1Letter9.setText(Acronym3Answer9SubString);
			CAX2Answer1Letter10.setText(Acronym3Answer10SubString);
			CAX2Answer1Letter11.setText(Acronym3Answer11SubString);
			CAX2Answer1Letter12.setText(Acronym3Answer12SubString);
			CAX2Answer1Letter13.setText(Acronym3Answer13SubString);
			CAX2Answer1Letter14.setText(Acronym3Answer14SubString);
			CAX2Answer1Letter15.setText(Acronym3Answer15SubString);
			CAX2Answer1Letter16.setText(Acronym3Answer16SubString);
			CAX2Answer1Letter17.setText(Acronym3Answer17SubString);
			CAX2Answer1Letter18.setText(Acronym3Answer18SubString);

			

			String Acronym="AMPLE DIRECT FACTORS";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			String Acronym4Answer1="Claim, frequency, amount, volatility and delays";
			String Acronym4Answer2="Accumulations of risk (geographical and by class of business) and catastrophes";
			String Acronym4Answer3="Poor persistency ie high laspses and low renewals";
			String Acronym4Answer4="Expenses being higher than expected";
			String Acronym4Answer5="Investment risks eg poor or volatile returns, falls in asset values, default risk";
			String Acronym4Answer6="Credit risk ie failure of a counterparty such as a reinsurer or a broker";
			String Acronym4Answer7="Operational risks eg fraud, systems failure, regulatory charges";
			String Acronym4Answer8="New business volumes too high and hence new business strain, or too low and not enough business over which to spread overheads";

			
			
			String Acronym4Answer1SubString = Acronym4Answer1.substring(0, 1); 
			String Acronym4Answer2SubString = Acronym4Answer2.substring(0, 1);
			String Acronym4Answer3SubString = Acronym4Answer3.substring(0, 1);
			String Acronym4Answer4SubString = Acronym4Answer4.substring(0, 1);
			String Acronym4Answer5SubString = Acronym4Answer5.substring(0, 1);
			String Acronym4Answer6SubString = Acronym4Answer6.substring(0, 1);
			String Acronym4Answer7SubString = Acronym4Answer7.substring(0, 1);
			String Acronym4Answer8SubString = Acronym4Answer8.substring(0, 1);
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);
			CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);

			CAX2Answer1Letter1.setText(Acronym4Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym4Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym4Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym4Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym4Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym4Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym4Answer7SubString);
			CAX2Answer1Letter8.setText(Acronym4Answer8SubString);
			
			String Acronym="CAPE ICON";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			String Acronym5Answer1="Renewal administration";
			String Acronym5Answer2="Asset management";
			String Acronym5Answer3="Profits";
			String Acronym5Answer4="Initial administration";
			String Acronym5Answer5="Design of the contract";
			String Acronym5Answer6="Commission";
			String Acronym5Answer7="Overheads";
			String Acronym5Answer8="Sales/advertising";
			String Acronym5Answer9="Terminal eg paying benefits";
			

			
			
			String Acronym3Answer1SubString = Acronym5Answer1.substring(0, 1); 
			String Acronym3Answer2SubString = Acronym5Answer2.substring(0, 1);
			String Acronym3Answer3SubString = Acronym5Answer3.substring(0, 1);
			String Acronym3Answer4SubString = Acronym5Answer4.substring(0, 1);
			String Acronym3Answer5SubString = Acronym5Answer5.substring(0, 1);
			String Acronym3Answer6SubString = Acronym5Answer6.substring(0, 1);
			String Acronym3Answer7SubString = Acronym5Answer7.substring(0, 1);
			String Acronym3Answer8SubString = Acronym5Answer8.substring(0, 1);
			String Acronym3Answer9SubString = Acronym5Answer9.substring(0, 1);
			
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			

			CAX2Answer1Letter1.setText(Acronym3Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym3Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym3Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym3Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym3Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym3Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym3Answer7SubString);
			CAX2Answer1Letter8.setText(Acronym3Answer8SubString);
			CAX2Answer1Letter9.setText(Acronym3Answer9SubString);
			
			
			String Acronym="RAPID COST";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
			String Acronym6Answer1="Financial backers";
			String Acronym6Answer2="Actuaries";
			String Acronym6Answer3="Client or clients";
			String Acronym6Answer4="Accountants";
			String Acronym6Answer5="Lawyers";
			String Acronym6Answer6="Administrators";
			String Acronym6Answer7="Clients' customers";
			

			
			
			String Acronym6Answer1SubString = Acronym6Answer1.substring(0, 1); 
			String Acronym6Answer2SubString = Acronym6Answer2.substring(0, 1);
			String Acronym6Answer3SubString = Acronym6Answer3.substring(0, 1);
			String Acronym6Answer4SubString = Acronym6Answer4.substring(0, 1);
			String Acronym6Answer5SubString = Acronym6Answer5.substring(0, 1); 
			String Acronym6Answer6SubString = Acronym6Answer6.substring(0, 1);
			String Acronym6Answer7SubString = Acronym6Answer7.substring(0, 1);
			
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			
			CAX2Answer1Letter1.setText(Acronym6Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym6Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym6Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym6Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym6Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym6Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym6Answer7SubString);
			
			
			String Acronym="FACALAC";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}

		}
		
	}
	
	
	///////////done//////////////
	public void onClickGetTitleCAX2(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(6)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);
		TextViewTitleAnswerCAX2.setText(null);
		
		EditTextTestCAX2 = (EditText) findViewById(R.id.EditTextTestCAX2);
		EditTextTestCAX2.setText(null);
		
		CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
		CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
		CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
		CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);
		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);		CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);
		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);		CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);
		CAX2Answer1Letter15 = (TextView) findViewById(R.id.CAX2Answer1Letter15);		CAX2Answer1Letter16 = (TextView) findViewById(R.id.CAX2Answer1Letter16);
		CAX2Answer1Letter17 = (TextView) findViewById(R.id.CAX2Answer1Letter17);		CAX2Answer1Letter18 = (TextView) findViewById(R.id.CAX2Answer1Letter18);
		
		CAX2Answer1Letter1.setText(null);		CAX2Answer1Letter2.setText(null);		CAX2Answer1Letter3.setText(null);
		CAX2Answer1Letter4.setText(null);		CAX2Answer1Letter5.setText(null);		CAX2Answer1Letter6.setText(null);
		CAX2Answer1Letter7.setText(null);		CAX2Answer1Letter8.setText(null);		CAX2Answer1Letter9.setText(null);
		CAX2Answer1Letter10.setText(null);		CAX2Answer1Letter11.setText(null);		CAX2Answer1Letter12.setText(null);
		CAX2Answer1Letter13.setText(null);		CAX2Answer1Letter13.setText(null);		CAX2Answer1Letter14.setText(null);
		CAX2Answer1Letter15.setText(null);		CAX2Answer1Letter16.setText(null);		CAX2Answer1Letter17.setText(null);
		CAX2Answer1Letter18.setText(null);
		
		
		
		EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
		EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
		EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);		EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
		EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);		EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
		EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);		EditTextCAX2Answer10 = (EditText)findViewById(R.id.EditTextCAX2Answer10);
		EditTextCAX2Answer11 = (EditText)findViewById(R.id.EditTextCAX2Answer11);		EditTextCAX2Answer12 = (EditText)findViewById(R.id.EditTextCAX2Answer12);
		EditTextCAX2Answer13 = (EditText)findViewById(R.id.EditTextCAX2Answer13);		EditTextCAX2Answer14 = (EditText)findViewById(R.id.EditTextCAX2Answer14);
		EditTextCAX2Answer15 = (EditText)findViewById(R.id.EditTextCAX2Answer15);		EditTextCAX2Answer16 = (EditText)findViewById(R.id.EditTextCAX2Answer16);
		EditTextCAX2Answer17 = (EditText)findViewById(R.id.EditTextCAX2Answer17);		EditTextCAX2Answer18 = (EditText)findViewById(R.id.EditTextCAX2Answer18);
		
		EditTextCAX2Answer1.setText(null);		EditTextCAX2Answer2.setText(null);		EditTextCAX2Answer3.setText(null);
		EditTextCAX2Answer4.setText(null);		EditTextCAX2Answer5.setText(null);		EditTextCAX2Answer6.setText(null);
		EditTextCAX2Answer7.setText(null);		EditTextCAX2Answer8.setText(null);		EditTextCAX2Answer9.setText(null);
		EditTextCAX2Answer10.setText(null);		EditTextCAX2Answer11.setText(null);		EditTextCAX2Answer12.setText(null);
		EditTextCAX2Answer13.setText(null);		EditTextCAX2Answer14.setText(null);		EditTextCAX2Answer15.setText(null);
		EditTextCAX2Answer16.setText(null);		EditTextCAX2Answer17.setText(null);		EditTextCAX2Answer18.setText(null);
		
		textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
		textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
		textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
		textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
		textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		textViewAnswer10CAX2 = (TextView) findViewById(R.id.textViewAnswer10CAX2);
		textViewAnswer11CAX2 = (TextView) findViewById(R.id.textViewAnswer11CAX2);		textViewAnswer12CAX2 = (TextView) findViewById(R.id.textViewAnswer12CAX2);
		textViewAnswer13CAX2 = (TextView) findViewById(R.id.textViewAnswer13CAX2);		textViewAnswer14CAX2 = (TextView) findViewById(R.id.textViewAnswer14CAX2);
		textViewAnswer15CAX2 = (TextView) findViewById(R.id.textViewAnswer15CAX2);		textViewAnswer16CAX2 = (TextView) findViewById(R.id.textViewAnswer16CAX2);
		textViewAnswer17CAX2 = (TextView) findViewById(R.id.textViewAnswer17CAX2);		textViewAnswer18CAX2 = (TextView) findViewById(R.id.textViewAnswer18CAX2);
		
		textViewAnswer1CAX2.setText(null);		textViewAnswer2CAX2.setText(null);		textViewAnswer3CAX2.setText(null);
		textViewAnswer4CAX2.setText(null);		textViewAnswer5CAX2.setText(null);		textViewAnswer6CAX2.setText(null);
		textViewAnswer7CAX2.setText(null);		textViewAnswer8CAX2.setText(null);		textViewAnswer9CAX2.setText(null);
		textViewAnswer10CAX2.setText(null);		textViewAnswer11CAX2.setText(null);		textViewAnswer12CAX2.setText(null);
		textViewAnswer13CAX2.setText(null);		textViewAnswer14CAX2.setText(null);		textViewAnswer15CAX2.setText(null);
		textViewAnswer16CAX2.setText(null);		textViewAnswer17CAX2.setText(null);		textViewAnswer18CAX2.setText(null);
		
		
		if(randomInt == 1){

			String Acronym1Title = "Financial products";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym1Title);
			
			

		}

		if(randomInt == 2){
			
			String Acronym2Title = "Who provides benefits?";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym2Title);
			
			
		}

		if(randomInt == 3){

			String Acronym3Title = "Contract design";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym3Title);
			
			

		}

		if(randomInt == 4){

			String Acronym4Title = "Key risks under general insurance contracts";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym4Title);
			
			
		}

		if(randomInt == 5){

			String Acronym5Title = "type of expense loading";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym5Title);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Title = "Parties involved in contract design";
			
			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(Acronym6Title);
			
			
		}

		


	}

	//////////////done//////////////
	public void onClickTestYourselfTitleCAX2(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym1Answer1="Reinsurance contracts";
			String Acronym1Answer2="Insurance contracts";
			String Acronym1Answer3="Pension schemes";
			String Acronym1Answer4="Investment schemes";
			String Acronym1Answer5="Derivatives";
			
			
			
			String Acronym1Answer1SubString = Acronym1Answer1.substring(0, 1); 
			String Acronym1Answer2SubString = Acronym1Answer2.substring(0, 1);
			String Acronym1Answer3SubString = Acronym1Answer3.substring(0, 1);
			String Acronym1Answer4SubString = Acronym1Answer4.substring(0, 1);
			String Acronym1Answer5SubString = Acronym1Answer5.substring(0, 1);
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);
			
			CAX2Answer1Letter1.setText(Acronym1Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym1Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym1Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym1Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym1Answer5SubString);
			
			String Acronym="Financial products";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
				//colours
				//input first letter of ACRONYM
			}
			
		}

		if (randomInt==2)
		{
			
			String Acronym2Answer1="Financial institutions";
			String Acronym2Answer2="Individuals";
			String Acronym2Answer3="Other corporations";
			String Acronym2Answer4="Employers";
			String Acronym2Answer5="The State";
			
			
			String Acronym2Answer1SubString = Acronym2Answer1.substring(0, 1); 
			String Acronym2Answer2SubString = Acronym2Answer2.substring(0, 1);
			String Acronym2Answer3SubString = Acronym2Answer3.substring(0, 1);
			String Acronym2Answer4SubString = Acronym2Answer4.substring(0, 1);
			String Acronym2Answer5SubString = Acronym2Answer5.substring(0, 1);
			
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);

			CAX2Answer1Letter1.setText("F");
			CAX2Answer1Letter2.setText("I");
			CAX2Answer1Letter3.setText("C");
			CAX2Answer1Letter4.setText("E");
			CAX2Answer1Letter5.setText("S");
			

			
			String Acronym="Who provides benefits?";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			
			String Acronym3Answer1="Administration simple";
			String Acronym3Answer2="Marketability";
			String Acronym3Answer3="Profitability";
			String Acronym3Answer4="Level and form benefits";
			String Acronym3Answer5="Early leaver benefits";
			String Acronym3Answer6="Discretionary benefits";
			String Acronym3Answer7="Interests and needs of customers";
			String Acronym3Answer8="Risk appetite of the parties involved";
			String Acronym3Answer9="Expenses vs charges";
			String Acronym3Answer10="Competition";
			String Acronym3Answer11="Terms and conditions";
			String Acronym3Answer12="Financing (capital requirements)";
			String Acronym3Answer13="Accounting";
			String Acronym3Answer14="Consistency with other products";
			String Acronym3Answer15="Timing of contributions of premiums";
			String Acronym3Answer16="Onerousness of options and guarantees";
			String Acronym3Answer17="Regulation";
			String Acronym3Answer18="Subsidies (cross)";
			
			
			String Acronym3Answer1SubString = Acronym3Answer1.substring(0, 1); 
			String Acronym3Answer2SubString = Acronym3Answer2.substring(0, 1);
			String Acronym3Answer3SubString = Acronym3Answer3.substring(0, 1);
			String Acronym3Answer4SubString = Acronym3Answer4.substring(0, 1);
			String Acronym3Answer5SubString = Acronym3Answer5.substring(0, 1);
			String Acronym3Answer6SubString = Acronym3Answer6.substring(0, 1);
			String Acronym3Answer7SubString = Acronym3Answer7.substring(0, 1);
			String Acronym3Answer8SubString = Acronym3Answer8.substring(0, 1);
			String Acronym3Answer9SubString = Acronym3Answer9.substring(0, 1);
			String Acronym3Answer10SubString = Acronym3Answer10.substring(0, 1);
			String Acronym3Answer11SubString = Acronym3Answer11.substring(0, 1);
			String Acronym3Answer12SubString = Acronym3Answer12.substring(0, 1);
			String Acronym3Answer13SubString = Acronym3Answer13.substring(0, 1);
			String Acronym3Answer14SubString = Acronym3Answer14.substring(0, 1);
			String Acronym3Answer15SubString = Acronym3Answer15.substring(0, 1);
			String Acronym3Answer16SubString = Acronym3Answer16.substring(0, 1);
			String Acronym3Answer17SubString = Acronym3Answer17.substring(0, 1);
			String Acronym3Answer18SubString = Acronym3Answer18.substring(0, 1);
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);
			CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);
			CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);
			CAX2Answer1Letter15 = (TextView) findViewById(R.id.CAX2Answer1Letter15);
			CAX2Answer1Letter16 = (TextView) findViewById(R.id.CAX2Answer1Letter16);
			CAX2Answer1Letter17 = (TextView) findViewById(R.id.CAX2Answer1Letter17);
			CAX2Answer1Letter18 = (TextView) findViewById(R.id.CAX2Answer1Letter18);

			CAX2Answer1Letter1.setText(Acronym3Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym3Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym3Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym3Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym3Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym3Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym3Answer7SubString);
			CAX2Answer1Letter8.setText(Acronym3Answer8SubString);
			CAX2Answer1Letter9.setText(Acronym3Answer9SubString);
			CAX2Answer1Letter10.setText(Acronym3Answer10SubString);
			CAX2Answer1Letter11.setText(Acronym3Answer11SubString);
			CAX2Answer1Letter12.setText(Acronym3Answer12SubString);
			CAX2Answer1Letter13.setText(Acronym3Answer13SubString);
			CAX2Answer1Letter14.setText(Acronym3Answer14SubString);
			CAX2Answer1Letter15.setText(Acronym3Answer15SubString);
			CAX2Answer1Letter16.setText(Acronym3Answer16SubString);
			CAX2Answer1Letter17.setText(Acronym3Answer17SubString);
			CAX2Answer1Letter18.setText(Acronym3Answer18SubString);
			

			String Acronym="Contract design";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			
			String Acronym4Answer1="Claim, frequency, amount, volatility and delays";
			String Acronym4Answer2="Accumulations of risk (geographical and by class of business) and catastrophes";
			String Acronym4Answer3="Poor persistency ie high laspses and low renewals";
			String Acronym4Answer4="Expenses being higher than expected";
			String Acronym4Answer5="Investment risks eg poor or volatile returns, falls in asset values, default risk";
			String Acronym4Answer6="Credit risk ie failure of a counterparty such as a reinsurer or a broker";
			String Acronym4Answer7="Operational risks eg fraud, systems failure, regulatory charges";
			String Acronym4Answer8="New business volumes too high and hence new business strain, or too low and not enough business over which to spread overheads";


			
			
			String Acronym4Answer1SubString = Acronym4Answer1.substring(0, 1); 
			String Acronym4Answer2SubString = Acronym4Answer2.substring(0, 1);
			String Acronym4Answer3SubString = Acronym4Answer3.substring(0, 1);
			String Acronym4Answer4SubString = Acronym4Answer4.substring(0, 1);
			String Acronym4Answer5SubString = Acronym4Answer5.substring(0, 1);
			String Acronym4Answer6SubString = Acronym4Answer6.substring(0, 1);
			String Acronym4Answer7SubString = Acronym4Answer7.substring(0, 1);
			String Acronym4Answer8SubString = Acronym4Answer8.substring(0, 1);
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);
			CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);

			CAX2Answer1Letter1.setText(Acronym4Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym4Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym4Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym4Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym4Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym4Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym4Answer7SubString);
			CAX2Answer1Letter8.setText(Acronym4Answer8SubString);
			
			String Acronym="Key risks under general insurance contracts";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			String Acronym5Answer1="Renewal administration";
			String Acronym5Answer2="Asset management";
			String Acronym5Answer3="Profits";
			String Acronym5Answer4="Initial administration";
			String Acronym5Answer5="Design of the contract";
			String Acronym5Answer6="Commission";
			String Acronym5Answer7="Overheads";
			String Acronym5Answer8="Sales/advertising";
			String Acronym5Answer9="Terminal eg paying benefits";
			

			
			
			String Acronym3Answer1SubString = Acronym5Answer1.substring(0, 1); 
			String Acronym3Answer2SubString = Acronym5Answer2.substring(0, 1);
			String Acronym3Answer3SubString = Acronym5Answer3.substring(0, 1);
			String Acronym3Answer4SubString = Acronym5Answer4.substring(0, 1);
			String Acronym3Answer5SubString = Acronym5Answer5.substring(0, 1);
			String Acronym3Answer6SubString = Acronym5Answer6.substring(0, 1);
			String Acronym3Answer7SubString = Acronym5Answer7.substring(0, 1);
			String Acronym3Answer8SubString = Acronym5Answer8.substring(0, 1);
			String Acronym3Answer9SubString = Acronym5Answer9.substring(0, 1);
			
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			

			CAX2Answer1Letter1.setText(Acronym3Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym3Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym3Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym3Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym3Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym3Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym3Answer7SubString);
			CAX2Answer1Letter8.setText(Acronym3Answer8SubString);
			CAX2Answer1Letter9.setText(Acronym3Answer9SubString);
			
			
			String Acronym="type of expense loading";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{			
			
			String Acronym6Answer1="Financial backers";
			String Acronym6Answer2="Actuaries";
			String Acronym6Answer3="Client or clients";
			String Acronym6Answer4="Accountants";
			String Acronym6Answer5="Lawyers";
			String Acronym6Answer6="Administrators";
			String Acronym6Answer7="Clients' customers";
			

			
			
			String Acronym6Answer1SubString = Acronym6Answer1.substring(0, 1); 
			String Acronym6Answer2SubString = Acronym6Answer2.substring(0, 1);
			String Acronym6Answer3SubString = Acronym6Answer3.substring(0, 1);
			String Acronym6Answer4SubString = Acronym6Answer4.substring(0, 1);
			String Acronym6Answer5SubString = Acronym6Answer5.substring(0, 1); 
			String Acronym6Answer6SubString = Acronym6Answer6.substring(0, 1);
			String Acronym6Answer7SubString = Acronym6Answer7.substring(0, 1);
			
			
			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			
			CAX2Answer1Letter1.setText(Acronym6Answer1SubString);
			CAX2Answer1Letter2.setText(Acronym6Answer2SubString);
			CAX2Answer1Letter3.setText(Acronym6Answer3SubString);
			CAX2Answer1Letter4.setText(Acronym6Answer4SubString);
			CAX2Answer1Letter5.setText(Acronym6Answer5SubString);
			CAX2Answer1Letter6.setText(Acronym6Answer6SubString);
			CAX2Answer1Letter7.setText(Acronym6Answer7SubString);
			
			
			String Acronym="Parties involved in contract design";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX2.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX2.setText(Acronym);
			}

		}
		
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x2, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x2,
					container, false);
			return rootView;
		}
	}

}
