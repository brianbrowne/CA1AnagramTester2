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

public class CA1X4 extends ActionBarActivity {
	
	
	EditText EditTextTestCA1X4;			TextView TextViewTitleAnswerCA1X4;			TextView textViewCA1X4;
	String useranswerCA1X4;
	
	EditText EditTextCA1X4Answer1;		EditText EditTextCA1X4Answer2;		EditText EditTextCA1X4Answer3;
	EditText EditTextCA1X4Answer4;		EditText EditTextCA1X4Answer5;		EditText EditTextCA1X4Answer6;
	EditText EditTextCA1X4Answer7;		EditText EditTextCA1X4Answer8;		EditText EditTextCA1X4Answer9;
	EditText EditTextCA1X4Answer10;		EditText EditTextCA1X4Answer11;		EditText EditTextCA1X4Answer12;
	EditText EditTextCA1X4Answer13;		EditText EditTextCA1X4Answer14;		EditText EditTextCA1X4Answer15;		EditText EditTextCA1X4Answer16;
    
	
	TextView CA1X4Answer1Letter1;		TextView CA1X4Answer1Letter2;		TextView CA1X4Answer1Letter3;
	TextView CA1X4Answer1Letter4;		TextView CA1X4Answer1Letter5;		TextView CA1X4Answer1Letter6;
	TextView CA1X4Answer1Letter7;		TextView CA1X4Answer1Letter8;		TextView CA1X4Answer1Letter9;
	TextView CA1X4Answer1Letter10;		TextView CA1X4Answer1Letter11;		TextView CA1X4Answer1Letter12;
	TextView CA1X4Answer1Letter13;		TextView CA1X4Answer1Letter14;		TextView CA1X4Answer1Letter15;		TextView CA1X4Answer1Letter16;
    
	
	TextView textViewAnswer1CA1X4;		TextView textViewAnswer2CA1X4;		TextView textViewAnswer3CA1X4;		TextView textViewAnswer4CA1X4;
	TextView textViewAnswer5CA1X4;		TextView textViewAnswer6CA1X4;		TextView textViewAnswer7CA1X4;		TextView textViewAnswer8CA1X4;
	TextView textViewAnswer9CA1X4;		TextView textViewAnswer10CA1X4;		TextView textViewAnswer11CA1X4;		TextView textViewAnswer12CA1X4;
	TextView textViewAnswer13CA1X4;		TextView textViewAnswer14CA1X4;		TextView textViewAnswer15CA1X4;		TextView textViewAnswer16CA1X4;

	int randomInt;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x4);
		
		EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
		textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);
		TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);
		
		
		CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
		CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
		CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
		CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
		CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);		CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
		CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);		CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
		CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);		CA1X4Answer1Letter14 = (TextView) findViewById(R.id.CA1X4Answer1Letter14);
		CA1X4Answer1Letter15 = (TextView) findViewById(R.id.CA1X4Answer1Letter15);		CA1X4Answer1Letter16 = (TextView) findViewById(R.id.CA1X4Answer1Letter16);
		
		
		EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
		EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
		EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);		EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
		EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);		EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
		EditTextCA1X4Answer9 = (EditText)findViewById(R.id.EditTextCA1X4Answer9);		EditTextCA1X4Answer10 = (EditText)findViewById(R.id.EditTextCA1X4Answer10);
		EditTextCA1X4Answer11 = (EditText)findViewById(R.id.EditTextCA1X4Answer11);		EditTextCA1X4Answer12 = (EditText)findViewById(R.id.EditTextCA1X4Answer12);
		EditTextCA1X4Answer13 = (EditText)findViewById(R.id.EditTextCA1X4Answer13);		EditTextCA1X4Answer14 = (EditText)findViewById(R.id.EditTextCA1X4Answer14);
		EditTextCA1X4Answer15 = (EditText)findViewById(R.id.EditTextCA1X4Answer15);		EditTextCA1X4Answer16 = (EditText)findViewById(R.id.EditTextCA1X4Answer16);
		
		
		textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
		textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
		textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
		textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);		textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
		textViewAnswer9CA1X4 = (TextView) findViewById(R.id.textViewAnswer9CA1X4);		textViewAnswer10CA1X4 = (TextView) findViewById(R.id.textViewAnswer10CA1X4);
		textViewAnswer11CA1X4 = (TextView) findViewById(R.id.textViewAnswer11CA1X4);		textViewAnswer12CA1X4 = (TextView) findViewById(R.id.textViewAnswer12CA1X4);
		textViewAnswer13CA1X4 = (TextView) findViewById(R.id.textViewAnswer13CA1X4);		textViewAnswer14CA1X4 = (TextView) findViewById(R.id.textViewAnswer14CA1X4);
		textViewAnswer15CA1X4 = (TextView) findViewById(R.id.textViewAnswer15CA1X4);		textViewAnswer16CA1X4 = (TextView) findViewById(R.id.textViewAnswer16CA1X4);
		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	/////////////////DONE///////////////////////
	public void onClickCA1X4TestAnswers(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym1Answer1="Security (ie default risk)";
			String Acronym1Answer2="Yield (real/nominal, expected return/running yield relative to other assets)";
			String Acronym1Answer3="Spread (volatility of markets values, diversification)";
			String Acronym1Answer4="Term (short,medium,long)";
			String Acronym1Answer5="Expenses/exchange rate (dealing/management)	(currency risk)";
			String Acronym1Answer6="Marketability";
			String Acronym1Answer7="Tax";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);
			EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);
			textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();	String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();	String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();
			String checkuseranswerCA1X46=EditTextCA1X4Answer5.getText().toString();
			String checkuseranswerCA1X47=EditTextCA1X4Answer5.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym1Answer1);
			}
			
			if(Acronym1Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym1Answer2);
			}
			
			if(Acronym1Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym1Answer3);
			}
			
			if(Acronym1Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym1Answer4);
			}
			
			if(Acronym1Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym1Answer5);
			}
			
			if(Acronym1Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym1Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym1Answer6);
			}
			
			if(Acronym1Answer7.equals(checkuseranswerCA1X47)){
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X4.setText(Acronym1Answer7);
			}else{
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X4.setText(Acronym1Answer7);
			}
		}
		if(randomInt==2){
			
			
			String Acronym2Answer1="Protect monetary values";
			String Acronym2Answer2="Opportunities (to take advantage of)";
			String Acronym2Answer3="Uncertain liablities";
			String Acronym2Answer4="Recent inflow of cash";
			String Acronym2Answer5="Short-term liabilities";
			String Acronym2Answer6="General economic uncertainity";
			String Acronym2Answer7="Recession";
			String Acronym2Answer8="Interest rates rising";
			String Acronym2Answer9="Depreciation of domestic currency";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);		EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);		EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
			EditTextCA1X4Answer9 = (EditText)findViewById(R.id.EditTextCA1X4Answer9);		
					
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);		textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
			textViewAnswer9CA1X4 = (TextView) findViewById(R.id.textViewAnswer9CA1X4);		
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();	String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();	String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();	String checkuseranswerCA1X46=EditTextCA1X4Answer6.getText().toString();
			String checkuseranswerCA1X47=EditTextCA1X4Answer7.getText().toString();	String checkuseranswerCA1X48=EditTextCA1X4Answer8.getText().toString();
			String checkuseranswerCA1X49=EditTextCA1X4Answer9.getText().toString();	
			
			if(Acronym2Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym2Answer1);
			}
			
			if(Acronym2Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym2Answer2);
			}
			
			if(Acronym2Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym2Answer3);
			}
			
			if(Acronym2Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym2Answer4);
			}
			
			if(Acronym2Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym2Answer5);
			}
			
			if(Acronym2Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym2Answer6);
			}
			
			if(Acronym2Answer7.equals(checkuseranswerCA1X47)){
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X4.setText(Acronym2Answer7);
			}else{
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X4.setText(Acronym2Answer7);
			}
			
			if(Acronym2Answer8.equals(checkuseranswerCA1X48)){
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X4.setText(Acronym2Answer8);
			}else{
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X4.setText(Acronym2Answer8);
			}
			
			if(Acronym2Answer9.equals(checkuseranswerCA1X49)){
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X4.setText(Acronym2Answer9);
			}else{
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X4.setText(Acronym2Answer9);
			}
			
		}
		if(randomInt==3){
			
			
			String Acronym3Answer1="Tax position";
			String Acronym3Answer2="Regulation on investor";
			String Acronym3Answer3="Assets currently held";
			String Acronym3Answer4="Income requirements";
			String Acronym3Answer5="Tastes";
			String Acronym3Answer6="Other (competitors, other assets, opportunities)";
			String Acronym3Answer7="Risk appetite";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);		EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();		String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();		String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();		String checkuseranswerCA1X46=EditTextCA1X4Answer6.getText().toString();
			String checkuseranswerCA1X47=EditTextCA1X4Answer7.getText().toString();
			
			if(Acronym3Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym3Answer1);
			}
			
			if(Acronym3Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym3Answer2);
			}
			
			if(Acronym3Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym3Answer3);
			}
			
			if(Acronym3Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym3Answer4);
			}
			
			if(Acronym3Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym3Answer5);
			}
			
			if(Acronym3Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym3Answer6);
			}
			
			if(Acronym3Answer7.equals(checkuseranswerCA1X47)){
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X4.setText(Acronym3Answer7);
			}else{
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X4.setText(Acronym3Answer7);
			}
			
			
			
		}
		if(randomInt==4){
			
			
			String Acronym4Answer1="Liquidity preference";
			String Acronym4Answer2="Inflation risk premium";
			String Acronym4Answer3="Market segmentation";
			String Acronym4Answer4="Expectations";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();	String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();	String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			
			
			if(Acronym4Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym4Answer1);
			}
			
			if(Acronym4Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym4Answer2);
			}
			
			if(Acronym4Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym4Answer3);
			}
			
			if(Acronym4Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym4Answer4);
			}
			
			
		}
		if(randomInt==5){
			
			
			String Acronym5Answer1="Comparables";
			String Acronym5Answer2="Age/condition/use/flexibility";
			String Acronym5Answer3="Location";
			String Acronym5Answer4="Lease";
			String Acronym5Answer5="Size";
			String Acronym5Answer6="Tenant";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);
			EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4= (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			
			
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();	String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();	String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();	String checkuseranswerCA1X46=EditTextCA1X4Answer6.getText().toString();
			
			
			if(Acronym5Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym5Answer1);
			}
			
			if(Acronym5Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym5Answer2);
			}
			
			if(Acronym5Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym5Answer3);
			}
			
			if(Acronym5Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym5Answer4);
			}
			
			if(Acronym5Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym5Answer5);
			}
			
			if(Acronym5Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym5Answer6);
			}
			
						

			
		}
		if(randomInt==6){
			
			
			String Acronym6Answer1="Marketability (bad)";
			String Acronym6Answer2="Obsolescence";
			String Acronym6Answer3="Voids";
			String Acronym6Answer4="Income (stepped)";
			String Acronym6Answer5="Expenses (management/dealing/maintenance/insurance)";
			String Acronym6Answer6="Volatile capital values";
			String Acronym6Answer7="Indivisibility";
			String Acronym6Answer8="Running yield > Equities";
			String Acronym6Answer9="Uniqueness";
			String Acronym6Answer10="Subjective valuations";
			String Acronym6Answer11="Changeable (risks)";
			String Acronym6Answer12="Large unit size";
			String Acronym6Answer13="Inflation (it hedges against)";
			String Acronym6Answer14="Political (government intervention/rent planning controls";
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);
			EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);
			EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
			EditTextCA1X4Answer9 = (EditText)findViewById(R.id.EditTextCA1X4Answer9);
			EditTextCA1X4Answer10 = (EditText)findViewById(R.id.EditTextCA1X4Answer10);
			EditTextCA1X4Answer11 = (EditText)findViewById(R.id.EditTextCA1X4Answer11);
			EditTextCA1X4Answer12 = (EditText)findViewById(R.id.EditTextCA1X4Answer12);
			EditTextCA1X4Answer13 = (EditText)findViewById(R.id.EditTextCA1X4Answer13);
			EditTextCA1X4Answer14 = (EditText)findViewById(R.id.EditTextCA1X4Answer14);
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4= (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);		textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
			textViewAnswer9CA1X4 = (TextView) findViewById(R.id.textViewAnswer9CA1X4);		textViewAnswer10CA1X4= (TextView) findViewById(R.id.textViewAnswer10CA1X4);
			textViewAnswer11CA1X4 = (TextView) findViewById(R.id.textViewAnswer11CA1X4);
			textViewAnswer12CA1X4 = (TextView) findViewById(R.id.textViewAnswer12CA1X4);
			textViewAnswer13CA1X4 = (TextView) findViewById(R.id.textViewAnswer13CA1X4);
			textViewAnswer14CA1X4 = (TextView) findViewById(R.id.textViewAnswer14CA1X4);
			
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();	String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();	String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();	String checkuseranswerCA1X46=EditTextCA1X4Answer6.getText().toString();
			String checkuseranswerCA1X47=EditTextCA1X4Answer7.getText().toString();	String checkuseranswerCA1X48=EditTextCA1X4Answer8.getText().toString();
			String checkuseranswerCA1X49=EditTextCA1X4Answer9.getText().toString();	String checkuseranswerCA1X410=EditTextCA1X4Answer10.getText().toString();
			String checkuseranswerCA1X411=EditTextCA1X4Answer11.getText().toString();
			String checkuseranswerCA1X412=EditTextCA1X4Answer12.getText().toString();
			String checkuseranswerCA1X413=EditTextCA1X4Answer13.getText().toString();
			String checkuseranswerCA1X414=EditTextCA1X4Answer14.getText().toString();
			
			if(Acronym6Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym6Answer1);
			}
			
			if(Acronym6Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym6Answer2);
			}
			
			if(Acronym6Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym6Answer3);
			}
			
			if(Acronym6Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym6Answer4);
			}
			
			if(Acronym6Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym6Answer5);
			}
			
			if(Acronym6Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym6Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym6Answer6);
			}
			
			if(Acronym6Answer7.equals(checkuseranswerCA1X47)){
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X4.setText(Acronym6Answer7);
			}else{
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X4.setText(Acronym6Answer7);
			}
			
			if(Acronym6Answer8.equals(checkuseranswerCA1X48)){
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X4.setText(Acronym6Answer8);
			}else{
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X4.setText(Acronym6Answer8);
			}
			
			if(Acronym6Answer9.equals(checkuseranswerCA1X49)){
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X4.setText(Acronym6Answer9);
			}else{
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X4.setText(Acronym6Answer9);
			}
			
			if(Acronym6Answer10.equals(checkuseranswerCA1X410)){
				textViewAnswer10CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X4.setText(Acronym6Answer10);
			}else{
				textViewAnswer10CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X4.setText(Acronym6Answer10);
			}
			
			if(Acronym6Answer11.equals(checkuseranswerCA1X411)){
				textViewAnswer11CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X4.setText(Acronym6Answer11);
			}else{
				textViewAnswer11CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X4.setText(Acronym6Answer11);
			}
			
			if(Acronym6Answer12.equals(checkuseranswerCA1X412)){
				textViewAnswer12CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X4.setText(Acronym6Answer12);
			}else{
				textViewAnswer12CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X4.setText(Acronym6Answer12);
			}
			
			if(Acronym6Answer13.equals(checkuseranswerCA1X413)){
				textViewAnswer13CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X4.setText(Acronym6Answer13);
			}else{
				textViewAnswer13CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X4.setText(Acronym6Answer13);
			}
			
			if(Acronym6Answer14.equals(checkuseranswerCA1X414)){
				textViewAnswer14CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CA1X4.setText(Acronym6Answer14);
			}else{
				textViewAnswer14CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CA1X4.setText(Acronym6Answer14);
			}

			
		}
		if(randomInt==7){
			
			String Acronym6Answer1="Diversification";
			String Acronym6Answer2="Expenses";
			String Acronym6Answer3="Sales (forced)";
			String Acronym6Answer4="Control";
			String Acronym6Answer5="Expertise";
			String Acronym6Answer6="NAV (discount to NAV)";
			String Acronym6Answer7="Divisibility";
			String Acronym6Answer8="Valuation (also volatility of values)";
			String Acronym6Answer9="Exposure to other sectors";
			String Acronym6Answer10="Gearing";
			String Acronym6Answer11="Marketability";
			String Acronym6Answer12="Equities (correlation with)";
			String Acronym6Answer13="Taxation";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);
			EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);
			EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
			EditTextCA1X4Answer9 = (EditText)findViewById(R.id.EditTextCA1X4Answer9);
			EditTextCA1X4Answer10 = (EditText)findViewById(R.id.EditTextCA1X4Answer10);
			EditTextCA1X4Answer11 = (EditText)findViewById(R.id.EditTextCA1X4Answer11);
			EditTextCA1X4Answer12 = (EditText)findViewById(R.id.EditTextCA1X4Answer12);
			EditTextCA1X4Answer13 = (EditText)findViewById(R.id.EditTextCA1X4Answer13);
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4= (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);		textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
			textViewAnswer9CA1X4 = (TextView) findViewById(R.id.textViewAnswer9CA1X4);		textViewAnswer10CA1X4= (TextView) findViewById(R.id.textViewAnswer10CA1X4);
			textViewAnswer11CA1X4 = (TextView) findViewById(R.id.textViewAnswer11CA1X4);
			textViewAnswer12CA1X4 = (TextView) findViewById(R.id.textViewAnswer12CA1X4);
			textViewAnswer13CA1X4 = (TextView) findViewById(R.id.textViewAnswer13CA1X4);

			
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();	String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();	String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();	String checkuseranswerCA1X46=EditTextCA1X4Answer6.getText().toString();
			String checkuseranswerCA1X47=EditTextCA1X4Answer7.getText().toString();	String checkuseranswerCA1X48=EditTextCA1X4Answer8.getText().toString();
			String checkuseranswerCA1X49=EditTextCA1X4Answer9.getText().toString();	String checkuseranswerCA1X410=EditTextCA1X4Answer10.getText().toString();
			String checkuseranswerCA1X411=EditTextCA1X4Answer11.getText().toString();
			String checkuseranswerCA1X412=EditTextCA1X4Answer12.getText().toString();
			String checkuseranswerCA1X413=EditTextCA1X4Answer13.getText().toString();

			
			if(Acronym6Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym6Answer1);
			}
			
			if(Acronym6Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym6Answer2);
			}
			
			if(Acronym6Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym6Answer3);
			}
			
			if(Acronym6Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym6Answer4);
			}
			
			if(Acronym6Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym6Answer5);
			}
			
			if(Acronym6Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym6Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym6Answer6);
			}
			
			if(Acronym6Answer7.equals(checkuseranswerCA1X47)){
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X4.setText(Acronym6Answer7);
			}else{
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X4.setText(Acronym6Answer7);
			}
			
			if(Acronym6Answer8.equals(checkuseranswerCA1X48)){
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X4.setText(Acronym6Answer8);
			}else{
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X4.setText(Acronym6Answer8);
			}
			
			if(Acronym6Answer9.equals(checkuseranswerCA1X49)){
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X4.setText(Acronym6Answer9);
			}else{
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X4.setText(Acronym6Answer9);
			}
			
			if(Acronym6Answer10.equals(checkuseranswerCA1X410)){
				textViewAnswer10CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X4.setText(Acronym6Answer10);
			}else{
				textViewAnswer10CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X4.setText(Acronym6Answer10);
			}
			
			if(Acronym6Answer11.equals(checkuseranswerCA1X411)){
				textViewAnswer11CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X4.setText(Acronym6Answer11);
			}else{
				textViewAnswer11CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X4.setText(Acronym6Answer11);
			}
			
			if(Acronym6Answer12.equals(checkuseranswerCA1X412)){
				textViewAnswer12CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X4.setText(Acronym6Answer12);
			}else{
				textViewAnswer12CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X4.setText(Acronym6Answer12);
			}
			
			if(Acronym6Answer13.equals(checkuseranswerCA1X413)){
				textViewAnswer13CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X4.setText(Acronym6Answer13);
			}else{
				textViewAnswer13CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X4.setText(Acronym6Answer13);
			}
			
			
		}
		if(randomInt==8){
			
			String Acronym8Answer1="Charges (management), higher for UTs than ITCs";
			String Acronym8Answer2="Assets (ITCs can invest in a  wider range compared to UTs)";
			String Acronym8Answer3="Liquidity (UTs eg property, need to hold more cash)(implies lower expected returns but greater price stability)";
			String Acronym8Answer4="Marketability (shares of ITCs are often less marketable than the underlying assets whereas marketability of units in UTs are guaranteed by the managers)";
			String Acronym8Answer5="ITCs can gear, leading to extra volatility. UTs have limited power to gear";
			String Acronym8Answer6="Expected return (higher for ITCs due to gearing";
			String Acronym8Answer7="NAV (ITC shares are more volatile than the underlying asset because of the size of any discount to NAV change. Volatility of units in a UT should be similar to that of the underlying assets";
			String Acronym8Answer8="Tax (subject to different tax treatment)";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);		EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);		EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
			
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);		textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
			
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();		String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();		String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();		String checkuseranswerCA1X46=EditTextCA1X4Answer6.getText().toString();
			String checkuseranswerCA1X47=EditTextCA1X4Answer7.getText().toString();		String checkuseranswerCA1X48=EditTextCA1X4Answer8.getText().toString();
			
			
			if(Acronym8Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCA1X47)){
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X4.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X4.setText(Acronym8Answer7);
			}
			
			if(Acronym8Answer8.equals(checkuseranswerCA1X48)){
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X4.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X4.setText(Acronym8Answer8);
			}
			
						

			
		}
		if(randomInt==9){			
			
			String Acronym9Answer1="Fast growing economies";
			String Acronym9Answer2="Undervalued markets";
			String Acronym9Answer3="Match liabilities in the foreign currency";
			String Acronym9Answer4="Exchange rate (strengthening currencies";
			String Acronym9Answer5="Diversification (reduce risk)";
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);
			
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();	String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();	String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();
			
			
			if(Acronym9Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym9Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym9Answer1);
			}
			
			if(Acronym9Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym9Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym9Answer2);
			}
			
			if(Acronym9Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym9Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym9Answer3);
			}
			
			if(Acronym9Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym9Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym9Answer4);
			}
			
			if(Acronym9Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym9Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym9Answer5);
			}
			
			
		}
		if(randomInt==10){
			
			
			String Acronym8Answer1="Derivatives (invest in derivatives based on overseas assets)";
			String Acronym8Answer2="Investment in collective investment schemes specialising on overseas investment";
			String Acronym8Answer3="Multinationals (advs - easy to deal in home market, expertise in home market) (disadvs - earnings diluted by domestic earnings, lack of control over business)";
			String Acronym8Answer4="Export (invest in companies (domestic) with a substantial export trade)";
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();		String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();		String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			
			
			if(Acronym8Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym8Answer4);
			}
			
			

			
		}
		if(randomInt==11){
			
			String Acronym8Answer1="Adverse currency movement";
			String Acronym8Answer2="Mismatches of liabilities in the currency";
			String Acronym8Answer3="Overseas custodian (costs)";
			String Acronym8Answer4="Repatriation of funds issues";
			String Acronym8Answer5="Time delays";
			String Acronym8Answer6="Administration (additional)";
			String Acronym8Answer7="Lack of good quality information";
			String Acronym8Answer8="Tax disadvantages (eg withholding taxes)";
			String Acronym8Answer9="Regulation may be poor";
			String Acronym8Answer10="Accounting practices may be different";
			String Acronym8Answer11="Marketability (poor and lack of liquidity)";
			String Acronym8Answer12="Political instability";
			String Acronym8Answer13="Language problems";
			String Acronym8Answer14="Expertise (costs of obtaining)";
			String Acronym8Answer15="Restrictions on foreign ownership";
			
			
			EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
			EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
			EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);		EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
			EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);
			EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
			EditTextCA1X4Answer9 = (EditText)findViewById(R.id.EditTextCA1X4Answer9);
			EditTextCA1X4Answer10 = (EditText)findViewById(R.id.EditTextCA1X4Answer10);
			EditTextCA1X4Answer11 = (EditText)findViewById(R.id.EditTextCA1X4Answer11);
			EditTextCA1X4Answer12 = (EditText)findViewById(R.id.EditTextCA1X4Answer12);
			EditTextCA1X4Answer13 = (EditText)findViewById(R.id.EditTextCA1X4Answer13);
			EditTextCA1X4Answer14 = (EditText)findViewById(R.id.EditTextCA1X4Answer14);
			EditTextCA1X4Answer15 = (EditText)findViewById(R.id.EditTextCA1X4Answer15);
			
			
			textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
			textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
			textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
			textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);
			textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
			textViewAnswer9CA1X4 = (TextView) findViewById(R.id.textViewAnswer9CA1X4);
			textViewAnswer10CA1X4 = (TextView) findViewById(R.id.textViewAnswer10CA1X4);
			textViewAnswer11CA1X4 = (TextView) findViewById(R.id.textViewAnswer11CA1X4);
			textViewAnswer12CA1X4 = (TextView) findViewById(R.id.textViewAnswer12CA1X4);
			textViewAnswer13CA1X4 = (TextView) findViewById(R.id.textViewAnswer13CA1X4);
			textViewAnswer14CA1X4 = (TextView) findViewById(R.id.textViewAnswer14CA1X4);
			textViewAnswer15CA1X4 = (TextView) findViewById(R.id.textViewAnswer15CA1X4);
			
			String checkuseranswerCA1X41=EditTextCA1X4Answer1.getText().toString();		String checkuseranswerCA1X42=EditTextCA1X4Answer2.getText().toString();
			String checkuseranswerCA1X43=EditTextCA1X4Answer3.getText().toString();		String checkuseranswerCA1X44=EditTextCA1X4Answer4.getText().toString();
			String checkuseranswerCA1X45=EditTextCA1X4Answer5.getText().toString();		String checkuseranswerCA1X46=EditTextCA1X4Answer6.getText().toString();
			String checkuseranswerCA1X47=EditTextCA1X4Answer7.getText().toString();
			String checkuseranswerCA1X48=EditTextCA1X4Answer8.getText().toString();
			String checkuseranswerCA1X49=EditTextCA1X4Answer8.getText().toString();
			String checkuseranswerCA1X410=EditTextCA1X4Answer10.getText().toString();
			String checkuseranswerCA1X411=EditTextCA1X4Answer11.getText().toString();
			String checkuseranswerCA1X412=EditTextCA1X4Answer12.getText().toString();
			String checkuseranswerCA1X413=EditTextCA1X4Answer13.getText().toString();
			String checkuseranswerCA1X414=EditTextCA1X4Answer14.getText().toString();
			String checkuseranswerCA1X415=EditTextCA1X4Answer15.getText().toString();
			
			if(Acronym8Answer1.equals(checkuseranswerCA1X41)){
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X4.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X4.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCA1X42)){
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X4.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X4.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCA1X43)){
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X4.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X4.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCA1X44)){
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X4.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X4.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCA1X45)){
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X4.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X4.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCA1X46)){
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X4.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X4.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCA1X47)){
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X4.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X4.setText(Acronym8Answer7);
			}
			
			if(Acronym8Answer8.equals(checkuseranswerCA1X48)){
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X4.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X4.setText(Acronym8Answer8);
			}
			
			if(Acronym8Answer9.equals(checkuseranswerCA1X49)){
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X4.setText(Acronym8Answer9);
			}else{
				textViewAnswer9CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X4.setText(Acronym8Answer9);
			}
			
			if(Acronym8Answer10.equals(checkuseranswerCA1X410)){
				textViewAnswer10CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X4.setText(Acronym8Answer10);
			}else{
				textViewAnswer10CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X4.setText(Acronym8Answer10);
			}
			
			if(Acronym8Answer11.equals(checkuseranswerCA1X411)){
				textViewAnswer11CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X4.setText(Acronym8Answer11);
			}else{
				textViewAnswer11CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X4.setText(Acronym8Answer11);
			}
			
			if(Acronym8Answer12.equals(checkuseranswerCA1X412)){
				textViewAnswer12CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X4.setText(Acronym8Answer12);
			}else{
				textViewAnswer12CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X4.setText(Acronym8Answer12);
			}
			
			if(Acronym8Answer13.equals(checkuseranswerCA1X413)){
				textViewAnswer13CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X4.setText(Acronym8Answer13);
			}else{
				textViewAnswer13CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X4.setText(Acronym8Answer13);
			}
			
			if(Acronym8Answer14.equals(checkuseranswerCA1X414)){
				textViewAnswer14CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CA1X4.setText(Acronym8Answer14);
			}else{
				textViewAnswer14CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CA1X4.setText(Acronym8Answer14);
			}
			
			if(Acronym8Answer15.equals(checkuseranswerCA1X415)){
				textViewAnswer15CA1X4.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CA1X4.setText(Acronym8Answer15);
			}else{
				textViewAnswer15CA1X4.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CA1X4.setText(Acronym8Answer15);
			}

			
		}
		
	}

	////////////////DONE//////////////////////
	public void onClickGetAcronymCA1X4(View v)
	{
		
		TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);
		TextViewTitleAnswerCA1X4.setText(null);
		
		EditTextTestCA1X4 = (EditText) findViewById(R.id.EditTextTestCA1X4);
		EditTextTestCA1X4.setText(null);
		
		CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
		CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
		CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
		CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
		CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);		CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
		CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);		CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
		CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);		CA1X4Answer1Letter14 = (TextView) findViewById(R.id.CA1X4Answer1Letter14);
		CA1X4Answer1Letter15 = (TextView) findViewById(R.id.CA1X4Answer1Letter15);		CA1X4Answer1Letter16 = (TextView) findViewById(R.id.CA1X4Answer1Letter16);
		
		CA1X4Answer1Letter1.setText(null);		CA1X4Answer1Letter2.setText(null);		CA1X4Answer1Letter3.setText(null);		CA1X4Answer1Letter4.setText(null);
		CA1X4Answer1Letter5.setText(null);		CA1X4Answer1Letter6.setText(null);		CA1X4Answer1Letter7.setText(null);		CA1X4Answer1Letter8.setText(null);
		CA1X4Answer1Letter9.setText(null);		CA1X4Answer1Letter10.setText(null);		CA1X4Answer1Letter11.setText(null);		CA1X4Answer1Letter12.setText(null);
		CA1X4Answer1Letter13.setText(null);		CA1X4Answer1Letter13.setText(null);		CA1X4Answer1Letter14.setText(null);		CA1X4Answer1Letter15.setText(null);
		CA1X4Answer1Letter16.setText(null);
		
		
		
		EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
		EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
		EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);		EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
		EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);		EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
		EditTextCA1X4Answer9 = (EditText)findViewById(R.id.EditTextCA1X4Answer9);		EditTextCA1X4Answer10 = (EditText)findViewById(R.id.EditTextCA1X4Answer10);
		EditTextCA1X4Answer11 = (EditText)findViewById(R.id.EditTextCA1X4Answer11);		EditTextCA1X4Answer12 = (EditText)findViewById(R.id.EditTextCA1X4Answer12);
		EditTextCA1X4Answer13 = (EditText)findViewById(R.id.EditTextCA1X4Answer13);		EditTextCA1X4Answer14 = (EditText)findViewById(R.id.EditTextCA1X4Answer14);
		EditTextCA1X4Answer15 = (EditText)findViewById(R.id.EditTextCA1X4Answer15);		EditTextCA1X4Answer16 = (EditText)findViewById(R.id.EditTextCA1X4Answer16);
		
		EditTextCA1X4Answer1.setText(null);		EditTextCA1X4Answer2.setText(null);		EditTextCA1X4Answer3.setText(null);		EditTextCA1X4Answer4.setText(null);
		EditTextCA1X4Answer5.setText(null);		EditTextCA1X4Answer6.setText(null);		EditTextCA1X4Answer7.setText(null);		EditTextCA1X4Answer8.setText(null);
		EditTextCA1X4Answer9.setText(null);		EditTextCA1X4Answer10.setText(null);		EditTextCA1X4Answer11.setText(null);		EditTextCA1X4Answer12.setText(null);
		EditTextCA1X4Answer13.setText(null);		EditTextCA1X4Answer14.setText(null);		EditTextCA1X4Answer15.setText(null);
		EditTextCA1X4Answer16.setText(null);
		
		textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
		textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
		textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
		textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);		textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
		textViewAnswer9CA1X4 = (TextView) findViewById(R.id.textViewAnswer9CA1X4);		textViewAnswer10CA1X4 = (TextView) findViewById(R.id.textViewAnswer10CA1X4);
		textViewAnswer11CA1X4 = (TextView) findViewById(R.id.textViewAnswer11CA1X4);		textViewAnswer12CA1X4 = (TextView) findViewById(R.id.textViewAnswer12CA1X4);
		textViewAnswer13CA1X4 = (TextView) findViewById(R.id.textViewAnswer13CA1X4);		textViewAnswer14CA1X4 = (TextView) findViewById(R.id.textViewAnswer14CA1X4);
		textViewAnswer15CA1X4 = (TextView) findViewById(R.id.textViewAnswer15CA1X4);		textViewAnswer16CA1X4 = (TextView) findViewById(R.id.textViewAnswer16CA1X4);
		
		textViewAnswer1CA1X4.setText(null);		textViewAnswer2CA1X4.setText(null);		textViewAnswer3CA1X4.setText(null);		textViewAnswer4CA1X4.setText(null);
		textViewAnswer5CA1X4.setText(null);		textViewAnswer6CA1X4.setText(null);		textViewAnswer7CA1X4.setText(null);		textViewAnswer8CA1X4.setText(null);
		textViewAnswer9CA1X4.setText(null);		textViewAnswer10CA1X4.setText(null);		textViewAnswer11CA1X4.setText(null);		textViewAnswer12CA1X4.setText(null);
		textViewAnswer13CA1X4.setText(null);		textViewAnswer14CA1X4.setText(null);		textViewAnswer15CA1X4.setText(null);		textViewAnswer16CA1X4.setText(null);
		
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(11)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);
		TextViewTitleAnswerCA1X4.setText(null);
		
		EditTextTestCA1X4 = (EditText) findViewById(R.id.EditTextTestCA1X4);
		EditTextTestCA1X4.setText(null);
		
		if(randomInt == 1){

			String Acronym1Acronym ="SYSTEM T";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym1Acronym);

		}

		if(randomInt == 2){
			
			String Acronym2Acronym ="POURS GRID";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym2Acronym);
			
			

		}

		if(randomInt == 3){

			String Acronym3Acronym ="TRAITOR";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym3Acronym);
			
			

		}

		if(randomInt == 4){

			String Acronym4Acronym ="LIME";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym4Acronym);
			
			
		}

		if(randomInt == 5){

			String Acronym5Acronym ="CALL ST";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym5Acronym);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Acronym ="MOVIE VIRUS CLIP";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym6Acronym);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Acronym ="DESCEND VEG MET";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym7Acronym);
			
			
		}

		if(randomInt == 8){

			String Acronym8Acronym="CALM GENT";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym8Acronym);
			
			
		}

		if(randomInt == 9){

			String Acronym9Acronym ="FUMED";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym9Acronym);
			
			
			
		}

		if(randomInt == 10){

			String Acronym10Acronym ="DIME";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym10Acronym);
			
			
		}

		if(randomInt == 11){

			String Acronym11Acronym ="A MORTAL TRAMPLER";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym11Acronym);
			
			
		}

		
	}

	////////////////DONE/////////////////////
	public void onClickTestYourselfAcronymCA1X4(View v)
	{
		
		if (randomInt==1)
		{
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);
			CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			
			CA1X4Answer1Letter1.setText("S");
			CA1X4Answer1Letter2.setText("Y");
			CA1X4Answer1Letter3.setText("S");
			CA1X4Answer1Letter4.setText("T");
			CA1X4Answer1Letter5.setText("E");
			CA1X4Answer1Letter6.setText("M");
			CA1X4Answer1Letter7.setText("T");
			
			String Acronym="SYSTEM T";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);

			CA1X4Answer1Letter1.setText("P");
			CA1X4Answer1Letter2.setText("O");
			CA1X4Answer1Letter3.setText("U");
			CA1X4Answer1Letter4.setText("R");
			CA1X4Answer1Letter5.setText("S");
			CA1X4Answer1Letter6.setText("G");
			CA1X4Answer1Letter7.setText("R");
			CA1X4Answer1Letter8.setText("I");
			CA1X4Answer1Letter9.setText("D");
			
			
			String Acronym="POURS GRID";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);

			CA1X4Answer1Letter1.setText("T");
			CA1X4Answer1Letter2.setText("R");
			CA1X4Answer1Letter3.setText("A");
			CA1X4Answer1Letter4.setText("I");
			CA1X4Answer1Letter5.setText("T");
			CA1X4Answer1Letter6.setText("O");
			CA1X4Answer1Letter7.setText("R");

			String Acronym="TRAITOR";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
						
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			

			CA1X4Answer1Letter1.setText("L");
			CA1X4Answer1Letter2.setText("I");
			CA1X4Answer1Letter3.setText("M");
			CA1X4Answer1Letter4.setText("E");
			
			String Acronym="LIME";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			

			CA1X4Answer1Letter1.setText("C");
			CA1X4Answer1Letter2.setText("A");
			CA1X4Answer1Letter3.setText("L");
			CA1X4Answer1Letter4.setText("L");
			CA1X4Answer1Letter5.setText("S");
			CA1X4Answer1Letter6.setText("T");
			
			
			String Acronym="CALL ST";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);		CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
			CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);	CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
			CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
			CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);
			CA1X4Answer1Letter14 = (TextView) findViewById(R.id.CA1X4Answer1Letter14);
			
			CA1X4Answer1Letter1.setText("M");
			CA1X4Answer1Letter2.setText("O");
			CA1X4Answer1Letter3.setText("V");
			CA1X4Answer1Letter4.setText("I");
			CA1X4Answer1Letter5.setText("E");
			CA1X4Answer1Letter6.setText("V");
			CA1X4Answer1Letter7.setText("I");
			CA1X4Answer1Letter8.setText("R");
			CA1X4Answer1Letter9.setText("U");
			CA1X4Answer1Letter10.setText("S");
			CA1X4Answer1Letter11.setText("C");		
			CA1X4Answer1Letter12.setText("L");
			CA1X4Answer1Letter13.setText("I");
			CA1X4Answer1Letter14.setText("P");
			
			String Acronym="MOVIE VIRUS CLIP";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);
			CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);
			CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);
			CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
			CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);
			CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
			CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);

			CA1X4Answer1Letter1.setText("D");
			CA1X4Answer1Letter2.setText("E");
			CA1X4Answer1Letter3.setText("S");
			CA1X4Answer1Letter4.setText("C");
			CA1X4Answer1Letter5.setText("E");
			CA1X4Answer1Letter6.setText("N");
			CA1X4Answer1Letter7.setText("D");
			CA1X4Answer1Letter8.setText("V");
			CA1X4Answer1Letter9.setText("E");
			CA1X4Answer1Letter10.setText("G");
			CA1X4Answer1Letter11.setText("M");
			CA1X4Answer1Letter12.setText("E");
			CA1X4Answer1Letter13.setText("T");
			
			String Acronym="DESCEND VEG MET";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);

			CA1X4Answer1Letter1.setText("C");
			CA1X4Answer1Letter2.setText("A");
			CA1X4Answer1Letter3.setText("L");
			CA1X4Answer1Letter4.setText("M");
			CA1X4Answer1Letter5.setText("G");
			CA1X4Answer1Letter6.setText("E");
			CA1X4Answer1Letter7.setText("N");
			CA1X4Answer1Letter8.setText("T");
			
			
			String Acronym="CALM GENT";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);
			

			CA1X4Answer1Letter1.setText("F");
			CA1X4Answer1Letter2.setText("U");
			CA1X4Answer1Letter3.setText("M");
			CA1X4Answer1Letter4.setText("E");
			CA1X4Answer1Letter5.setText("D");
			
			String Acronym="FUMED";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			

			CA1X4Answer1Letter1.setText("D");
			CA1X4Answer1Letter2.setText("I");
			CA1X4Answer1Letter3.setText("M");			
			CA1X4Answer1Letter4.setText("E");
			
			
			String Acronym="DIME";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);
			CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
			CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);
			CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
			CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);
			CA1X4Answer1Letter14 = (TextView) findViewById(R.id.CA1X4Answer1Letter14);
			CA1X4Answer1Letter15 = (TextView) findViewById(R.id.CA1X4Answer1Letter15);

			CA1X4Answer1Letter1.setText("A");
			CA1X4Answer1Letter2.setText("M");
			CA1X4Answer1Letter3.setText("O");			
			CA1X4Answer1Letter4.setText("R");
			CA1X4Answer1Letter5.setText("T");			
			CA1X4Answer1Letter6.setText("A");
			CA1X4Answer1Letter7.setText("L");
			CA1X4Answer1Letter8.setText("T");
			CA1X4Answer1Letter9.setText("R");
			CA1X4Answer1Letter10.setText("A");
			CA1X4Answer1Letter11.setText("M");
			CA1X4Answer1Letter12.setText("P");
			CA1X4Answer1Letter13.setText("L");
			CA1X4Answer1Letter14.setText("E");
			CA1X4Answer1Letter15.setText("R");
			
			String Acronym="A MORTAL TRAMPLER";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		
	}
	
	///////////////DONE//////////////////////
	public void onClickGetTitleCA1X4(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(11)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);
		TextViewTitleAnswerCA1X4.setText(null);
		
		EditTextTestCA1X4 = (EditText) findViewById(R.id.EditTextTestCA1X4);
		EditTextTestCA1X4.setText(null);
		
		CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
		CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
		CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
		CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
		CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);		CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
		CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);		CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
		CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);		CA1X4Answer1Letter14 = (TextView) findViewById(R.id.CA1X4Answer1Letter14);
		CA1X4Answer1Letter15 = (TextView) findViewById(R.id.CA1X4Answer1Letter15);		CA1X4Answer1Letter16 = (TextView) findViewById(R.id.CA1X4Answer1Letter16);
		
		CA1X4Answer1Letter1.setText(null);		CA1X4Answer1Letter2.setText(null);		CA1X4Answer1Letter3.setText(null);
		CA1X4Answer1Letter4.setText(null);		CA1X4Answer1Letter5.setText(null);		CA1X4Answer1Letter6.setText(null);
		CA1X4Answer1Letter7.setText(null);		CA1X4Answer1Letter8.setText(null);		CA1X4Answer1Letter9.setText(null);
		CA1X4Answer1Letter10.setText(null);		CA1X4Answer1Letter11.setText(null);		CA1X4Answer1Letter12.setText(null);
		CA1X4Answer1Letter13.setText(null);		CA1X4Answer1Letter13.setText(null);		CA1X4Answer1Letter14.setText(null);
		CA1X4Answer1Letter15.setText(null);		CA1X4Answer1Letter16.setText(null);
		
		
		
		EditTextCA1X4Answer1 = (EditText)findViewById(R.id.EditTextCA1X4Answer1);		EditTextCA1X4Answer2 = (EditText)findViewById(R.id.EditTextCA1X4Answer2);
		EditTextCA1X4Answer3 = (EditText)findViewById(R.id.EditTextCA1X4Answer3);		EditTextCA1X4Answer4 = (EditText)findViewById(R.id.EditTextCA1X4Answer4);
		EditTextCA1X4Answer5 = (EditText)findViewById(R.id.EditTextCA1X4Answer5);		EditTextCA1X4Answer6 = (EditText)findViewById(R.id.EditTextCA1X4Answer6);
		EditTextCA1X4Answer7 = (EditText)findViewById(R.id.EditTextCA1X4Answer7);		EditTextCA1X4Answer8 = (EditText)findViewById(R.id.EditTextCA1X4Answer8);
		EditTextCA1X4Answer9 = (EditText)findViewById(R.id.EditTextCA1X4Answer9);		EditTextCA1X4Answer10 = (EditText)findViewById(R.id.EditTextCA1X4Answer10);
		EditTextCA1X4Answer11 = (EditText)findViewById(R.id.EditTextCA1X4Answer11);		EditTextCA1X4Answer12 = (EditText)findViewById(R.id.EditTextCA1X4Answer12);
		EditTextCA1X4Answer13 = (EditText)findViewById(R.id.EditTextCA1X4Answer13);		EditTextCA1X4Answer14 = (EditText)findViewById(R.id.EditTextCA1X4Answer14);
		EditTextCA1X4Answer15 = (EditText)findViewById(R.id.EditTextCA1X4Answer15);		EditTextCA1X4Answer16 = (EditText)findViewById(R.id.EditTextCA1X4Answer16);
		
		EditTextCA1X4Answer1.setText(null);		EditTextCA1X4Answer2.setText(null);		EditTextCA1X4Answer3.setText(null);
		EditTextCA1X4Answer4.setText(null);		EditTextCA1X4Answer5.setText(null);		EditTextCA1X4Answer6.setText(null);
		EditTextCA1X4Answer7.setText(null);		EditTextCA1X4Answer8.setText(null);		EditTextCA1X4Answer9.setText(null);
		EditTextCA1X4Answer10.setText(null);		EditTextCA1X4Answer11.setText(null);		EditTextCA1X4Answer12.setText(null);
		EditTextCA1X4Answer13.setText(null);		EditTextCA1X4Answer14.setText(null);		EditTextCA1X4Answer15.setText(null);
		EditTextCA1X4Answer16.setText(null);
		
		textViewAnswer1CA1X4 = (TextView) findViewById(R.id.textViewAnswer1CA1X4);		textViewAnswer2CA1X4= (TextView) findViewById(R.id.textViewAnswer2CA1X4);
		textViewAnswer3CA1X4 = (TextView) findViewById(R.id.textViewAnswer3CA1X4);		textViewAnswer4CA1X4 = (TextView) findViewById(R.id.textViewAnswer4CA1X4);
		textViewAnswer5CA1X4 = (TextView) findViewById(R.id.textViewAnswer5CA1X4);		textViewAnswer6CA1X4 = (TextView) findViewById(R.id.textViewAnswer6CA1X4);
		textViewAnswer7CA1X4 = (TextView) findViewById(R.id.textViewAnswer7CA1X4);		textViewAnswer8CA1X4 = (TextView) findViewById(R.id.textViewAnswer8CA1X4);
		textViewAnswer9CA1X4 = (TextView) findViewById(R.id.textViewAnswer9CA1X4);		textViewAnswer10CA1X4 = (TextView) findViewById(R.id.textViewAnswer10CA1X4);
		textViewAnswer11CA1X4 = (TextView) findViewById(R.id.textViewAnswer11CA1X4);		textViewAnswer12CA1X4 = (TextView) findViewById(R.id.textViewAnswer12CA1X4);
		textViewAnswer13CA1X4 = (TextView) findViewById(R.id.textViewAnswer13CA1X4);		textViewAnswer14CA1X4 = (TextView) findViewById(R.id.textViewAnswer14CA1X4);
		textViewAnswer15CA1X4 = (TextView) findViewById(R.id.textViewAnswer15CA1X4);		textViewAnswer16CA1X4 = (TextView) findViewById(R.id.textViewAnswer16CA1X4);
		
		textViewAnswer1CA1X4.setText(null);		textViewAnswer2CA1X4.setText(null);		textViewAnswer3CA1X4.setText(null);
		textViewAnswer4CA1X4.setText(null);		textViewAnswer5CA1X4.setText(null);		textViewAnswer6CA1X4.setText(null);
		textViewAnswer7CA1X4.setText(null);		textViewAnswer8CA1X4.setText(null);		textViewAnswer9CA1X4.setText(null);
		textViewAnswer10CA1X4.setText(null);		textViewAnswer11CA1X4.setText(null);		textViewAnswer12CA1X4.setText(null);
		textViewAnswer13CA1X4.setText(null);		textViewAnswer14CA1X4.setText(null);		textViewAnswer15CA1X4.setText(null);
		textViewAnswer16CA1X4.setText(null);
		
		
		if(randomInt == 1){

			String Acronym1Title = "Features of assets in general/investment and risk characteristics";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym1Title);
			
			

		}

		if(randomInt == 2){
			
			String Acronym2Title = "Money market insruments - reasons for holding";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym2Title);
			
			
		}

		if(randomInt == 3){

			String Acronym3Title = "Features on the investor";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym3Title);
			
			

		}

		if(randomInt == 4){

			String Acronym4Title = "Yield curve theories";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym4Title);
			
			
		}

		if(randomInt == 5){

			String Acronym5Title = "Prime property";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym5Title);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Title = "Investment and risk characteristics of property";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym6Title);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Title = "Factors to consider when comparing direct and indirect property investments";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym7Title);
			
			
		}

		if(randomInt == 8){

			String Acronym8Title = "Difference between ITCs and UTs";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym8Title);
			
			
		}

		if(randomInt == 9){

			String Acronym9Title = "Reasons why an investor would hold overseas assets";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym9Title);
			
			
			
		}

		if(randomInt == 10){

			String Acronym10Title = "Methods of indirect overseas investment";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym10Title);
			
			
		}

		if(randomInt == 11){

			String Acronym11Title = "Potential drawbacks of overseas investment";
			
			textViewCA1X4 = (TextView) findViewById(R.id.PullTestStringCA1X4);//take in string
			textViewCA1X4.setText(Acronym11Title);
			
			
		}

		
	}
	
	///////////////DONE////////////////////
	public void onClickTestYourselfTitleCA1X4(View v)
	{
		if (randomInt==1)
		{
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);
			CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			
			CA1X4Answer1Letter1.setText("S");
			CA1X4Answer1Letter2.setText("Y");
			CA1X4Answer1Letter3.setText("S");
			CA1X4Answer1Letter4.setText("T");
			CA1X4Answer1Letter5.setText("E");
			CA1X4Answer1Letter6.setText("M");
			CA1X4Answer1Letter7.setText("T");
			
			String Acronym="Features of assets in general/investment and risk characteristics";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
			
		}

		if (randomInt==2)
		{
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);		CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);

			CA1X4Answer1Letter1.setText("P");
			CA1X4Answer1Letter2.setText("O");
			CA1X4Answer1Letter3.setText("U");
			CA1X4Answer1Letter4.setText("R");
			CA1X4Answer1Letter5.setText("S");
			CA1X4Answer1Letter6.setText("G");
			CA1X4Answer1Letter7.setText("R");
			CA1X4Answer1Letter8.setText("I");
			CA1X4Answer1Letter9.setText("D");

			
			String Acronym="Money market insruments - reasons for holding";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			
						
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			

			CA1X4Answer1Letter1.setText("T");
			CA1X4Answer1Letter2.setText("R");
			CA1X4Answer1Letter3.setText("A");
			CA1X4Answer1Letter4.setText("I");
			CA1X4Answer1Letter5.setText("T");
			CA1X4Answer1Letter6.setText("O");
			CA1X4Answer1Letter7.setText("R");
			
			

			String Acronym="Features on the investor";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			

			CA1X4Answer1Letter1.setText("L");
			CA1X4Answer1Letter2.setText("I");
			CA1X4Answer1Letter3.setText("M");
			CA1X4Answer1Letter4.setText("E");
			
			
			String Acronym="Yield curve theories";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
						
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			

			CA1X4Answer1Letter1.setText("C");
			CA1X4Answer1Letter2.setText("A");
			CA1X4Answer1Letter3.setText("L");
			CA1X4Answer1Letter4.setText("L");
			CA1X4Answer1Letter5.setText("S");
			CA1X4Answer1Letter6.setText("T");
			
			
			String Acronym="Prime property";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
						
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);		CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);		CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
			CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);
			CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
			CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);
			CA1X4Answer1Letter14 = (TextView) findViewById(R.id.CA1X4Answer1Letter14);
			
			CA1X4Answer1Letter1.setText("M");
			CA1X4Answer1Letter2.setText("O");
			CA1X4Answer1Letter3.setText("V");
			CA1X4Answer1Letter4.setText("I");
			CA1X4Answer1Letter5.setText("E");
			CA1X4Answer1Letter6.setText("V");
			CA1X4Answer1Letter7.setText("I");
			CA1X4Answer1Letter8.setText("R");
			CA1X4Answer1Letter9.setText("U");
			CA1X4Answer1Letter10.setText("S");
			CA1X4Answer1Letter11.setText("C");
			CA1X4Answer1Letter12.setText("L");
			CA1X4Answer1Letter13.setText("I");
			CA1X4Answer1Letter14.setText("P");
			
			String Acronym="Investment and risk characteristics of property";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==7){
			
						
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);
			CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);
			CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);
			CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
			CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);
			CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
			CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);

			CA1X4Answer1Letter1.setText("D");
			CA1X4Answer1Letter2.setText("E");
			CA1X4Answer1Letter3.setText("S");
			CA1X4Answer1Letter4.setText("C");
			CA1X4Answer1Letter5.setText("E");
			CA1X4Answer1Letter6.setText("N");
			CA1X4Answer1Letter7.setText("D");
			CA1X4Answer1Letter8.setText("V");
			CA1X4Answer1Letter9.setText("E");
			CA1X4Answer1Letter10.setText("G");
			CA1X4Answer1Letter11.setText("M");
			CA1X4Answer1Letter12.setText("E");
			CA1X4Answer1Letter13.setText("T");
			
			
			String Acronym="Factors to consider when comparing direct and indirect property investments";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);

			CA1X4Answer1Letter1.setText("C");
			CA1X4Answer1Letter2.setText("A");
			CA1X4Answer1Letter3.setText("L");
			CA1X4Answer1Letter4.setText("M");
			CA1X4Answer1Letter5.setText("G");
			CA1X4Answer1Letter6.setText("E");
			CA1X4Answer1Letter7.setText("N");
			CA1X4Answer1Letter8.setText("T");
			
			
			String Acronym="Difference between ITCs and UTs";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);
			

			CA1X4Answer1Letter1.setText("F");
			CA1X4Answer1Letter2.setText("U");
			CA1X4Answer1Letter3.setText("M");
			CA1X4Answer1Letter4.setText("E");
			CA1X4Answer1Letter5.setText("D");
			
			String Acronym="Reasons why an investor would hold overseas assets";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			

			CA1X4Answer1Letter1.setText("D");			
			CA1X4Answer1Letter2.setText("I");
			CA1X4Answer1Letter3.setText("M");			
			CA1X4Answer1Letter4.setText("E");
			
			
			String Acronym="Methods of indirect overseas investment";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			
			CA1X4Answer1Letter1 = (TextView) findViewById(R.id.CA1X4Answer1Letter1);		CA1X4Answer1Letter2 = (TextView) findViewById(R.id.CA1X4Answer1Letter2);
			CA1X4Answer1Letter3 = (TextView) findViewById(R.id.CA1X4Answer1Letter3);		CA1X4Answer1Letter4 = (TextView) findViewById(R.id.CA1X4Answer1Letter4);
			CA1X4Answer1Letter5 = (TextView) findViewById(R.id.CA1X4Answer1Letter5);		CA1X4Answer1Letter6 = (TextView) findViewById(R.id.CA1X4Answer1Letter6);
			CA1X4Answer1Letter7 = (TextView) findViewById(R.id.CA1X4Answer1Letter7);
			CA1X4Answer1Letter8 = (TextView) findViewById(R.id.CA1X4Answer1Letter8);
			CA1X4Answer1Letter9 = (TextView) findViewById(R.id.CA1X4Answer1Letter9);
			CA1X4Answer1Letter10 = (TextView) findViewById(R.id.CA1X4Answer1Letter10);
			CA1X4Answer1Letter11 = (TextView) findViewById(R.id.CA1X4Answer1Letter11);
			CA1X4Answer1Letter12 = (TextView) findViewById(R.id.CA1X4Answer1Letter12);
			CA1X4Answer1Letter13 = (TextView) findViewById(R.id.CA1X4Answer1Letter13);
			CA1X4Answer1Letter14 = (TextView) findViewById(R.id.CA1X4Answer1Letter14);
			CA1X4Answer1Letter15 = (TextView) findViewById(R.id.CA1X4Answer1Letter15);

			CA1X4Answer1Letter1.setText("A");
			CA1X4Answer1Letter2.setText("M");
			CA1X4Answer1Letter3.setText("O");
			CA1X4Answer1Letter4.setText("R");
			CA1X4Answer1Letter5.setText("T");
			CA1X4Answer1Letter6.setText("A");
			CA1X4Answer1Letter7.setText("L");
			CA1X4Answer1Letter8.setText("T");
			CA1X4Answer1Letter9.setText("R");
			CA1X4Answer1Letter10.setText("A");
			CA1X4Answer1Letter11.setText("M");
			CA1X4Answer1Letter12.setText("P");
			CA1X4Answer1Letter13.setText("L");
			CA1X4Answer1Letter14.setText("E");
			CA1X4Answer1Letter15.setText("R");
			
			String Acronym="Potential drawbacks of overseas investment";

			EditTextTestCA1X4 = (EditText)findViewById(R.id.EditTextTestCA1X4);
			useranswerCA1X4=EditTextTestCA1X4.getText().toString();
			TextViewTitleAnswerCA1X4 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X4);

			if(Acronym.equals(useranswerCA1X4)){
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X4.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X4.setText(Acronym);
			}

		}
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x4, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x4,
					container, false);
			return rootView;
		}
	}

}
