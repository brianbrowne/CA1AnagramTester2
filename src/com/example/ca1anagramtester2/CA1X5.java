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

public class CA1X5 extends ActionBarActivity {
	
	EditText EditTextTestCA1X5;			TextView TextViewTitleAnswerCA1X5;			TextView textViewCA1X5;
	String useranswerCA1X5;
	
	EditText EditTextCA1X5Answer1;		EditText EditTextCA1X5Answer2;		EditText EditTextCA1X5Answer3;
	EditText EditTextCA1X5Answer4;		EditText EditTextCA1X5Answer5;		EditText EditTextCA1X5Answer6;
	EditText EditTextCA1X5Answer7;		EditText EditTextCA1X5Answer8;		EditText EditTextCA1X5Answer9;
	EditText EditTextCA1X5Answer10;		EditText EditTextCA1X5Answer11;		EditText EditTextCA1X5Answer12;
	EditText EditTextCA1X5Answer13;		EditText EditTextCA1X5Answer14;		EditText EditTextCA1X5Answer15;		EditText EditTextCA1X5Answer16;
    
	
	TextView CA1X5Answer1Letter1;		TextView CA1X5Answer1Letter2;		TextView CA1X5Answer1Letter3;
	TextView CA1X5Answer1Letter4;		TextView CA1X5Answer1Letter5;		TextView CA1X5Answer1Letter6;
	TextView CA1X5Answer1Letter7;		TextView CA1X5Answer1Letter8;		TextView CA1X5Answer1Letter9;
	TextView CA1X5Answer1Letter10;		TextView CA1X5Answer1Letter11;		TextView CA1X5Answer1Letter12;
	TextView CA1X5Answer1Letter13;		TextView CA1X5Answer1Letter14;		TextView CA1X5Answer1Letter15;		TextView CA1X5Answer1Letter16;
    
	
	TextView textViewAnswer1CA1X5;		TextView textViewAnswer2CA1X5;		TextView textViewAnswer3CA1X5;		TextView textViewAnswer4CA1X5;
	TextView textViewAnswer5CA1X5;		TextView textViewAnswer6CA1X5;		TextView textViewAnswer7CA1X5;		TextView textViewAnswer8CA1X5;
	TextView textViewAnswer9CA1X5;		TextView textViewAnswer10CA1X5;		TextView textViewAnswer11CA1X5;		TextView textViewAnswer12CA1X5;
	TextView textViewAnswer13CA1X5;		TextView textViewAnswer14CA1X5;		TextView textViewAnswer15CA1X5;		TextView textViewAnswer16CA1X5;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x5);
		
		EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
		textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);
		TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);
		
		
		CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
		CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
		CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
		CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);
		CA1X5Answer1Letter9 = (TextView) findViewById(R.id.CA1X5Answer1Letter9);		CA1X5Answer1Letter10 = (TextView) findViewById(R.id.CA1X5Answer1Letter10);
		CA1X5Answer1Letter11 = (TextView) findViewById(R.id.CA1X5Answer1Letter11);		CA1X5Answer1Letter12 = (TextView) findViewById(R.id.CA1X5Answer1Letter12);
		CA1X5Answer1Letter13 = (TextView) findViewById(R.id.CA1X5Answer1Letter13);		CA1X5Answer1Letter14 = (TextView) findViewById(R.id.CA1X5Answer1Letter14);
		CA1X5Answer1Letter15 = (TextView) findViewById(R.id.CA1X5Answer1Letter15);		CA1X5Answer1Letter16 = (TextView) findViewById(R.id.CA1X5Answer1Letter16);
		
		
		EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
		EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
		EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);		EditTextCA1X5Answer6 = (EditText)findViewById(R.id.EditTextCA1X5Answer6);
		EditTextCA1X5Answer7 = (EditText)findViewById(R.id.EditTextCA1X5Answer7);		EditTextCA1X5Answer8 = (EditText)findViewById(R.id.EditTextCA1X5Answer8);
		EditTextCA1X5Answer9 = (EditText)findViewById(R.id.EditTextCA1X5Answer9);		EditTextCA1X5Answer10 = (EditText)findViewById(R.id.EditTextCA1X5Answer10);
		EditTextCA1X5Answer11 = (EditText)findViewById(R.id.EditTextCA1X5Answer11);		EditTextCA1X5Answer12 = (EditText)findViewById(R.id.EditTextCA1X5Answer12);
		EditTextCA1X5Answer13 = (EditText)findViewById(R.id.EditTextCA1X5Answer13);		EditTextCA1X5Answer14 = (EditText)findViewById(R.id.EditTextCA1X5Answer14);
		EditTextCA1X5Answer15 = (EditText)findViewById(R.id.EditTextCA1X5Answer15);		EditTextCA1X5Answer16 = (EditText)findViewById(R.id.EditTextCA1X5Answer16);
		
		
		textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
		textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
		textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);		textViewAnswer6CA1X5 = (TextView) findViewById(R.id.textViewAnswer6CA1X5);
		textViewAnswer7CA1X5 = (TextView) findViewById(R.id.textViewAnswer7CA1X5);		textViewAnswer8CA1X5 = (TextView) findViewById(R.id.textViewAnswer8CA1X5);
		textViewAnswer9CA1X5 = (TextView) findViewById(R.id.textViewAnswer9CA1X5);		textViewAnswer10CA1X5 = (TextView) findViewById(R.id.textViewAnswer10CA1X5);
		textViewAnswer11CA1X5 = (TextView) findViewById(R.id.textViewAnswer11CA1X5);		textViewAnswer12CA1X5 = (TextView) findViewById(R.id.textViewAnswer12CA1X5);
		textViewAnswer13CA1X5 = (TextView) findViewById(R.id.textViewAnswer13CA1X5);		textViewAnswer14CA1X5 = (TextView) findViewById(R.id.textViewAnswer14CA1X5);
		textViewAnswer15CA1X5 = (TextView) findViewById(R.id.textViewAnswer15CA1X5);		textViewAnswer16CA1X5 = (TextView) findViewById(R.id.textViewAnswer16CA1X5);
		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	

	////////////////////DONE/////////////////////
	public void onClickCA1X5TestAnswers(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym1Answer1="Cashflows (institutional)";
			String Acronym1Answer2="Other economic factors (eg economic news)";
			String Acronym1Answer3="Public sector borrowing";
			String Acronym1Answer4="Inflation";
			String Acronym1Answer5="Exchange rate";
			String Acronym1Answer6="Returns on alternative investments";
			String Acronym1Answer7="Short-term interest rates";
			
			
			EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
			EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
			EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);
			EditTextCA1X5Answer6 = (EditText)findViewById(R.id.EditTextCA1X5Answer6);
			EditTextCA1X5Answer7 = (EditText)findViewById(R.id.EditTextCA1X5Answer7);
			
			
			textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
			textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
			textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);
			textViewAnswer6CA1X5 = (TextView) findViewById(R.id.textViewAnswer6CA1X5);
			textViewAnswer7CA1X5 = (TextView) findViewById(R.id.textViewAnswer7CA1X5);
			
			String checkuseranswerCA1X51=EditTextCA1X5Answer1.getText().toString();	String checkuseranswerCA1X52=EditTextCA1X5Answer2.getText().toString();
			String checkuseranswerCA1X53=EditTextCA1X5Answer3.getText().toString();	String checkuseranswerCA1X54=EditTextCA1X5Answer4.getText().toString();
			String checkuseranswerCA1X55=EditTextCA1X5Answer5.getText().toString();
			String checkuseranswerCA1X56=EditTextCA1X5Answer5.getText().toString();
			String checkuseranswerCA1X57=EditTextCA1X5Answer5.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCA1X51)){
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X5.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X5.setText(Acronym1Answer1);
			}
			
			if(Acronym1Answer2.equals(checkuseranswerCA1X52)){
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X5.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X5.setText(Acronym1Answer2);
			}
			
			if(Acronym1Answer3.equals(checkuseranswerCA1X53)){
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X5.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X5.setText(Acronym1Answer3);
			}
			
			if(Acronym1Answer4.equals(checkuseranswerCA1X54)){
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X5.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X5.setText(Acronym1Answer4);
			}
			
			if(Acronym1Answer5.equals(checkuseranswerCA1X55)){
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X5.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X5.setText(Acronym1Answer5);
			}
			
			if(Acronym1Answer6.equals(checkuseranswerCA1X56)){
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X5.setText(Acronym1Answer6);
			}else{
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X5.setText(Acronym1Answer6);
			}
			
			if(Acronym1Answer7.equals(checkuseranswerCA1X57)){
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X5.setText(Acronym1Answer7);
			}else{
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X5.setText(Acronym1Answer7);
			}
		}
		if(randomInt==2){
			
			
			String Acronym2Answer1="Cashflows (institutional)";
			String Acronym2Answer2="Real interest rates and inflation (expectations)";
			String Acronym2Answer3="Alternative investments";
			String Acronym2Answer4="Political climate";
			String Acronym2Answer5="Supply factors";
			String Acronym2Answer6="Economic growth in the economy (real level)";
			String Acronym2Answer7="Currency movements (expectations)";
			String Acronym2Answer8="Taxation";
			String Acronym2Answer9="Overseas equity markets";
			String Acronym2Answer10="Riskiness of equity investment (investors' perceptions)";
			
			
			EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
			EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
			EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);		EditTextCA1X5Answer6 = (EditText)findViewById(R.id.EditTextCA1X5Answer6);
			EditTextCA1X5Answer7 = (EditText)findViewById(R.id.EditTextCA1X5Answer7);		EditTextCA1X5Answer8 = (EditText)findViewById(R.id.EditTextCA1X5Answer8);
			EditTextCA1X5Answer9 = (EditText)findViewById(R.id.EditTextCA1X5Answer9);
			EditTextCA1X5Answer10 = (EditText)findViewById(R.id.EditTextCA1X5Answer10);
					
			
			textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
			textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
			textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);		textViewAnswer6CA1X5 = (TextView) findViewById(R.id.textViewAnswer6CA1X5);
			textViewAnswer7CA1X5 = (TextView) findViewById(R.id.textViewAnswer7CA1X5);		textViewAnswer8CA1X5 = (TextView) findViewById(R.id.textViewAnswer8CA1X5);
			textViewAnswer9CA1X5 = (TextView) findViewById(R.id.textViewAnswer9CA1X5);
			textViewAnswer10CA1X5 = (TextView) findViewById(R.id.textViewAnswer10CA1X5);
			
			String checkuseranswerCA1X51=EditTextCA1X5Answer1.getText().toString();	String checkuseranswerCA1X52=EditTextCA1X5Answer2.getText().toString();
			String checkuseranswerCA1X53=EditTextCA1X5Answer3.getText().toString();	String checkuseranswerCA1X54=EditTextCA1X5Answer4.getText().toString();
			String checkuseranswerCA1X55=EditTextCA1X5Answer5.getText().toString();	String checkuseranswerCA1X56=EditTextCA1X5Answer6.getText().toString();
			String checkuseranswerCA1X57=EditTextCA1X5Answer7.getText().toString();	String checkuseranswerCA1X58=EditTextCA1X5Answer8.getText().toString();
			String checkuseranswerCA1X59=EditTextCA1X5Answer9.getText().toString();
			String checkuseranswerCA1X510=EditTextCA1X5Answer10.getText().toString();
			
			if(Acronym2Answer1.equals(checkuseranswerCA1X51)){
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X5.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X5.setText(Acronym2Answer1);
			}
			
			if(Acronym2Answer2.equals(checkuseranswerCA1X52)){
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X5.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X5.setText(Acronym2Answer2);
			}
			
			if(Acronym2Answer3.equals(checkuseranswerCA1X53)){
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X5.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X5.setText(Acronym2Answer3);
			}
			
			if(Acronym2Answer4.equals(checkuseranswerCA1X54)){
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X5.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X5.setText(Acronym2Answer4);
			}
			
			if(Acronym2Answer5.equals(checkuseranswerCA1X55)){
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X5.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X5.setText(Acronym2Answer5);
			}
			
			if(Acronym2Answer6.equals(checkuseranswerCA1X56)){
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X5.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X5.setText(Acronym2Answer6);
			}
			
			if(Acronym2Answer7.equals(checkuseranswerCA1X57)){
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X5.setText(Acronym2Answer7);
			}else{
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X5.setText(Acronym2Answer7);
			}
			
			if(Acronym2Answer8.equals(checkuseranswerCA1X58)){
				textViewAnswer8CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X5.setText(Acronym2Answer8);
			}else{
				textViewAnswer8CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X5.setText(Acronym2Answer8);
			}
			
			if(Acronym2Answer9.equals(checkuseranswerCA1X59)){
				textViewAnswer9CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X5.setText(Acronym2Answer9);
			}else{
				textViewAnswer9CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X5.setText(Acronym2Answer9);
			}
			
			if(Acronym2Answer10.equals(checkuseranswerCA1X510)){
				textViewAnswer10CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X5.setText(Acronym2Answer10);
			}else{
				textViewAnswer10CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X5.setText(Acronym2Answer10);
			}
			
		}
		if(randomInt==3){
			
			
			String Acronym3Answer1="Segmented markets";
			String Acronym3Answer2="Location (fixed)";
			String Acronym3Answer3="Investment market";
			String Acronym3Answer4="Cashflows (institutional)";
			String Acronym3Answer5="Economic growth";
			String Acronym3Answer6="Development cycles";
			String Acronym3Answer7="Planning permission rules/lack of physical space in areas";
			String Acronym3Answer8="Occupation market";
			String Acronym3Answer9="Time lag in developing new properties";
			String Acronym3Answer10="Transaction costs (high)";
			String Acronym3Answer11="Exchange rates";
			String Acronym3Answer12="Real interest rates";
			
			
			EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
			EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
			EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);		EditTextCA1X5Answer6 = (EditText)findViewById(R.id.EditTextCA1X5Answer6);
			EditTextCA1X5Answer7 = (EditText)findViewById(R.id.EditTextCA1X5Answer7);
			EditTextCA1X5Answer8 = (EditText)findViewById(R.id.EditTextCA1X5Answer8);
			EditTextCA1X5Answer9 = (EditText)findViewById(R.id.EditTextCA1X5Answer9);
			EditTextCA1X5Answer10 = (EditText)findViewById(R.id.EditTextCA1X5Answer10);
			EditTextCA1X5Answer11 = (EditText)findViewById(R.id.EditTextCA1X5Answer11);
			EditTextCA1X5Answer12 = (EditText)findViewById(R.id.EditTextCA1X5Answer12);
			
			
			textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
			textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
			textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);		textViewAnswer6CA1X5 = (TextView) findViewById(R.id.textViewAnswer6CA1X5);
			textViewAnswer7CA1X5 = (TextView) findViewById(R.id.textViewAnswer7CA1X5);
			textViewAnswer8CA1X5 = (TextView) findViewById(R.id.textViewAnswer8CA1X5);
			textViewAnswer9CA1X5 = (TextView) findViewById(R.id.textViewAnswer9CA1X5);
			textViewAnswer10CA1X5 = (TextView) findViewById(R.id.textViewAnswer10CA1X5);
			textViewAnswer11CA1X5 = (TextView) findViewById(R.id.textViewAnswer11CA1X5);
			textViewAnswer12CA1X5 = (TextView) findViewById(R.id.textViewAnswer12CA1X5);
			
			String checkuseranswerCA1X51=EditTextCA1X5Answer1.getText().toString();		String checkuseranswerCA1X52=EditTextCA1X5Answer2.getText().toString();
			String checkuseranswerCA1X53=EditTextCA1X5Answer3.getText().toString();		String checkuseranswerCA1X54=EditTextCA1X5Answer4.getText().toString();
			String checkuseranswerCA1X55=EditTextCA1X5Answer5.getText().toString();		String checkuseranswerCA1X56=EditTextCA1X5Answer6.getText().toString();
			String checkuseranswerCA1X57=EditTextCA1X5Answer7.getText().toString();
			String checkuseranswerCA1X58=EditTextCA1X5Answer8.getText().toString();
			String checkuseranswerCA1X59=EditTextCA1X5Answer9.getText().toString();
			String checkuseranswerCA1X510=EditTextCA1X5Answer10.getText().toString();
			String checkuseranswerCA1X511=EditTextCA1X5Answer11.getText().toString();
			String checkuseranswerCA1X512=EditTextCA1X5Answer12.getText().toString();
			
			if(Acronym3Answer1.equals(checkuseranswerCA1X51)){
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X5.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X5.setText(Acronym3Answer1);
			}
			
			if(Acronym3Answer2.equals(checkuseranswerCA1X52)){
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X5.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X5.setText(Acronym3Answer2);
			}
			
			if(Acronym3Answer3.equals(checkuseranswerCA1X53)){
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X5.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X5.setText(Acronym3Answer3);
			}
			
			if(Acronym3Answer4.equals(checkuseranswerCA1X54)){
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X5.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X5.setText(Acronym3Answer4);
			}
			
			if(Acronym3Answer5.equals(checkuseranswerCA1X55)){
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X5.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X5.setText(Acronym3Answer5);
			}
			
			if(Acronym3Answer6.equals(checkuseranswerCA1X56)){
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X5.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X5.setText(Acronym3Answer6);
			}
			
			if(Acronym3Answer7.equals(checkuseranswerCA1X57)){
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X5.setText(Acronym3Answer7);
			}else{
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X5.setText(Acronym3Answer7);
			}
			
			if(Acronym3Answer8.equals(checkuseranswerCA1X58)){
				textViewAnswer8CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X5.setText(Acronym3Answer8);
			}else{
				textViewAnswer8CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X5.setText(Acronym3Answer8);
			}
			
			if(Acronym3Answer9.equals(checkuseranswerCA1X59)){
				textViewAnswer9CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X5.setText(Acronym3Answer9);
			}else{
				textViewAnswer9CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X5.setText(Acronym3Answer9);
			}
			
			if(Acronym3Answer10.equals(checkuseranswerCA1X510)){
				textViewAnswer10CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X5.setText(Acronym3Answer10);
			}else{
				textViewAnswer10CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X5.setText(Acronym3Answer10);
			}
			
			if(Acronym3Answer11.equals(checkuseranswerCA1X511)){
				textViewAnswer11CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X5.setText(Acronym3Answer11);
			}else{
				textViewAnswer11CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X5.setText(Acronym3Answer11);
			}
			
			if(Acronym3Answer12.equals(checkuseranswerCA1X512)){
				textViewAnswer12CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X5.setText(Acronym3Answer12);
			}else{
				textViewAnswer12CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X5.setText(Acronym3Answer12);
			}
			
			
			
		}
		if(randomInt==4){
			
			
			String Acronym4Answer1="Smoothed market value";
			String Acronym4Answer2="Historic book value";
			String Acronym4Answer3="Adjusted book value";
			String Acronym4Answer4="Market value";
			String Acronym4Answer5="Fair value";
			String Acronym4Answer6="Arbitrage value";
			String Acronym4Answer7="Discounted cashflow";
			String Acronym4Answer8="Stochastic modelling";
			
			
			EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
			EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
			EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);		
			EditTextCA1X5Answer6 = (EditText)findViewById(R.id.EditTextCA1X5Answer6);		
			EditTextCA1X5Answer7 = (EditText)findViewById(R.id.EditTextCA1X5Answer7);		
			EditTextCA1X5Answer8 = (EditText)findViewById(R.id.EditTextCA1X5Answer8);		
			
			
			
			textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
			textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
			textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);		
			textViewAnswer6CA1X5 = (TextView) findViewById(R.id.textViewAnswer6CA1X5);		
			textViewAnswer7CA1X5 = (TextView) findViewById(R.id.textViewAnswer7CA1X5);		
			textViewAnswer8CA1X5 = (TextView) findViewById(R.id.textViewAnswer8CA1X5);		
			
			
			String checkuseranswerCA1X51=EditTextCA1X5Answer1.getText().toString();	String checkuseranswerCA1X52=EditTextCA1X5Answer2.getText().toString();
			String checkuseranswerCA1X53=EditTextCA1X5Answer3.getText().toString();	String checkuseranswerCA1X54=EditTextCA1X5Answer4.getText().toString();
			String checkuseranswerCA1X55=EditTextCA1X5Answer3.getText().toString();	
			String checkuseranswerCA1X56=EditTextCA1X5Answer3.getText().toString();	
			String checkuseranswerCA1X57=EditTextCA1X5Answer3.getText().toString();	
			String checkuseranswerCA1X58=EditTextCA1X5Answer3.getText().toString();	
			
			
			if(Acronym4Answer1.equals(checkuseranswerCA1X51)){
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X5.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X5.setText(Acronym4Answer1);
			}
			
			if(Acronym4Answer2.equals(checkuseranswerCA1X52)){
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X5.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X5.setText(Acronym4Answer2);
			}
			
			if(Acronym4Answer3.equals(checkuseranswerCA1X53)){
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X5.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X5.setText(Acronym4Answer3);
			}
			
			if(Acronym4Answer4.equals(checkuseranswerCA1X54)){
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X5.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X5.setText(Acronym4Answer4);
			}
			
			if(Acronym4Answer5.equals(checkuseranswerCA1X55)){
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X5.setText(Acronym4Answer5);
			}else{
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X5.setText(Acronym4Answer5);
			}
			
			if(Acronym4Answer6.equals(checkuseranswerCA1X56)){
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X5.setText(Acronym4Answer6);
			}else{
				textViewAnswer6CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X5.setText(Acronym4Answer6);
			}
			
			if(Acronym4Answer7.equals(checkuseranswerCA1X57)){
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X5.setText(Acronym4Answer7);
			}else{
				textViewAnswer7CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X5.setText(Acronym4Answer7);
			}
			
			if(Acronym4Answer8.equals(checkuseranswerCA1X58)){
				textViewAnswer8CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X5.setText(Acronym4Answer8);
			}else{
				textViewAnswer8CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X5.setText(Acronym4Answer8);
			}
			
			
		}
		if(randomInt==5){
			
			
			String Acronym5Answer1="Net asset value (NAV)";
			String Acronym5Answer2="Economic value added (EVA)";
			String Acronym5Answer3="Dividend discount model";
			String Acronym5Answer4="Market value";
			String Acronym5Answer5="Measurable key factor (dividend yield, payout ratio)";
			
			
			
			EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
			EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
			EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);
			
			
			
			textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
			textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
			textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);
			
			
			
			String checkuseranswerCA1X51=EditTextCA1X5Answer1.getText().toString();	String checkuseranswerCA1X52=EditTextCA1X5Answer2.getText().toString();
			String checkuseranswerCA1X53=EditTextCA1X5Answer3.getText().toString();	String checkuseranswerCA1X54=EditTextCA1X5Answer4.getText().toString();
			String checkuseranswerCA1X55=EditTextCA1X5Answer5.getText().toString();	
			
			
			if(Acronym5Answer1.equals(checkuseranswerCA1X51)){
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X5.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X5.setText(Acronym5Answer1);
			}
			
			if(Acronym5Answer2.equals(checkuseranswerCA1X52)){
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X5.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X5.setText(Acronym5Answer2);
			}
			
			if(Acronym5Answer3.equals(checkuseranswerCA1X53)){
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X5.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X5.setText(Acronym5Answer3);
			}
			
			if(Acronym5Answer4.equals(checkuseranswerCA1X54)){
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X5.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X5.setText(Acronym5Answer4);
			}
			
			if(Acronym5Answer5.equals(checkuseranswerCA1X55)){
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X5.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X5.setText(Acronym5Answer5);
			}
			
		
			
		}
		if(randomInt==6){
			
			
			String Acronym6Answer1="Growth in economy";
			String Acronym6Answer2="Inflation rate";
			String Acronym6Answer3="Exchange rate";
			
			
			EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
			EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);
			
			textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
			textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);
			
			
			String checkuseranswerCA1X51=EditTextCA1X5Answer1.getText().toString();	String checkuseranswerCA1X52=EditTextCA1X5Answer2.getText().toString();
			String checkuseranswerCA1X53=EditTextCA1X5Answer3.getText().toString();	
			
			if(Acronym6Answer1.equals(checkuseranswerCA1X51)){
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X5.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X5.setText(Acronym6Answer1);
			}
			
			if(Acronym6Answer2.equals(checkuseranswerCA1X52)){
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X5.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X5.setText(Acronym6Answer2);
			}
			
			if(Acronym6Answer3.equals(checkuseranswerCA1X53)){
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X5.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CA1X5.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X5.setText(Acronym6Answer3);
			}
			
		}
			
		
	}

	/////////////////////DONE/////////////////
	public void onClickGetAcronymCA1X5(View v)
	{
		
		TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);
		TextViewTitleAnswerCA1X5.setText(null);
		
		EditTextTestCA1X5 = (EditText) findViewById(R.id.EditTextTestCA1X5);
		EditTextTestCA1X5.setText(null);
		
		CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
		CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
		CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
		CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);
		CA1X5Answer1Letter9 = (TextView) findViewById(R.id.CA1X5Answer1Letter9);		CA1X5Answer1Letter10 = (TextView) findViewById(R.id.CA1X5Answer1Letter10);
		CA1X5Answer1Letter11 = (TextView) findViewById(R.id.CA1X5Answer1Letter11);		CA1X5Answer1Letter12 = (TextView) findViewById(R.id.CA1X5Answer1Letter12);
		CA1X5Answer1Letter13 = (TextView) findViewById(R.id.CA1X5Answer1Letter13);		CA1X5Answer1Letter14 = (TextView) findViewById(R.id.CA1X5Answer1Letter14);
		CA1X5Answer1Letter15 = (TextView) findViewById(R.id.CA1X5Answer1Letter15);		CA1X5Answer1Letter16 = (TextView) findViewById(R.id.CA1X5Answer1Letter16);
		
		CA1X5Answer1Letter1.setText(null);		CA1X5Answer1Letter2.setText(null);		CA1X5Answer1Letter3.setText(null);		CA1X5Answer1Letter4.setText(null);
		CA1X5Answer1Letter5.setText(null);		CA1X5Answer1Letter6.setText(null);		CA1X5Answer1Letter7.setText(null);		CA1X5Answer1Letter8.setText(null);
		CA1X5Answer1Letter9.setText(null);		CA1X5Answer1Letter10.setText(null);		CA1X5Answer1Letter11.setText(null);		CA1X5Answer1Letter12.setText(null);
		CA1X5Answer1Letter13.setText(null);		CA1X5Answer1Letter13.setText(null);		CA1X5Answer1Letter14.setText(null);		CA1X5Answer1Letter15.setText(null);
		CA1X5Answer1Letter16.setText(null);
		
		
		
		EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
		EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
		EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);		EditTextCA1X5Answer6 = (EditText)findViewById(R.id.EditTextCA1X5Answer6);
		EditTextCA1X5Answer7 = (EditText)findViewById(R.id.EditTextCA1X5Answer7);		EditTextCA1X5Answer8 = (EditText)findViewById(R.id.EditTextCA1X5Answer8);
		EditTextCA1X5Answer9 = (EditText)findViewById(R.id.EditTextCA1X5Answer9);		EditTextCA1X5Answer10 = (EditText)findViewById(R.id.EditTextCA1X5Answer10);
		EditTextCA1X5Answer11 = (EditText)findViewById(R.id.EditTextCA1X5Answer11);		EditTextCA1X5Answer12 = (EditText)findViewById(R.id.EditTextCA1X5Answer12);
		EditTextCA1X5Answer13 = (EditText)findViewById(R.id.EditTextCA1X5Answer13);		EditTextCA1X5Answer14 = (EditText)findViewById(R.id.EditTextCA1X5Answer14);
		EditTextCA1X5Answer15 = (EditText)findViewById(R.id.EditTextCA1X5Answer15);		EditTextCA1X5Answer16 = (EditText)findViewById(R.id.EditTextCA1X5Answer16);
		
		EditTextCA1X5Answer1.setText(null);		EditTextCA1X5Answer2.setText(null);		EditTextCA1X5Answer3.setText(null);		EditTextCA1X5Answer4.setText(null);
		EditTextCA1X5Answer5.setText(null);		EditTextCA1X5Answer6.setText(null);		EditTextCA1X5Answer7.setText(null);		EditTextCA1X5Answer8.setText(null);
		EditTextCA1X5Answer9.setText(null);		EditTextCA1X5Answer10.setText(null);		EditTextCA1X5Answer11.setText(null);		EditTextCA1X5Answer12.setText(null);
		EditTextCA1X5Answer13.setText(null);		EditTextCA1X5Answer14.setText(null);		EditTextCA1X5Answer15.setText(null);
		EditTextCA1X5Answer16.setText(null);
		
		textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
		textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
		textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);		textViewAnswer6CA1X5 = (TextView) findViewById(R.id.textViewAnswer6CA1X5);
		textViewAnswer7CA1X5 = (TextView) findViewById(R.id.textViewAnswer7CA1X5);		textViewAnswer8CA1X5 = (TextView) findViewById(R.id.textViewAnswer8CA1X5);
		textViewAnswer9CA1X5 = (TextView) findViewById(R.id.textViewAnswer9CA1X5);		textViewAnswer10CA1X5 = (TextView) findViewById(R.id.textViewAnswer10CA1X5);
		textViewAnswer11CA1X5 = (TextView) findViewById(R.id.textViewAnswer11CA1X5);		textViewAnswer12CA1X5 = (TextView) findViewById(R.id.textViewAnswer12CA1X5);
		textViewAnswer13CA1X5 = (TextView) findViewById(R.id.textViewAnswer13CA1X5);		textViewAnswer14CA1X5 = (TextView) findViewById(R.id.textViewAnswer14CA1X5);
		textViewAnswer15CA1X5 = (TextView) findViewById(R.id.textViewAnswer15CA1X5);		textViewAnswer16CA1X5 = (TextView) findViewById(R.id.textViewAnswer16CA1X5);
		
		textViewAnswer1CA1X5.setText(null);		textViewAnswer2CA1X5.setText(null);		textViewAnswer3CA1X5.setText(null);		textViewAnswer4CA1X5.setText(null);
		textViewAnswer5CA1X5.setText(null);		textViewAnswer6CA1X5.setText(null);		textViewAnswer7CA1X5.setText(null);		textViewAnswer8CA1X5.setText(null);
		textViewAnswer9CA1X5.setText(null);		textViewAnswer10CA1X5.setText(null);		textViewAnswer11CA1X5.setText(null);		textViewAnswer12CA1X5.setText(null);
		textViewAnswer13CA1X5.setText(null);		textViewAnswer14CA1X5.setText(null);		textViewAnswer15CA1X5.setText(null);		textViewAnswer16CA1X5.setText(null);
		
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(6)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);
		TextViewTitleAnswerCA1X5.setText(null);
		
		EditTextTestCA1X5 = (EditText) findViewById(R.id.EditTextTestCA1X5);
		EditTextTestCA1X5.setText(null);
		
		if(randomInt == 1){

			String Acronym1Acronym ="COPIERS";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym1Acronym);

		}

		if(randomInt == 2){
			
			String Acronym2Acronym ="CRAP SECTOR";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym2Acronym);
			
			

		}

		if(randomInt == 3){

			String Acronym3Acronym ="SLICED POTTER";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym3Acronym);
			
			

		}

		if(randomInt == 4){

			String Acronym4Acronym ="SHAM FADS";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym4Acronym);
			
			
		}

		if(randomInt == 5){

			String Acronym5Acronym ="NEDMM";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym5Acronym);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Acronym ="GIE";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym6Acronym);
			
			
		}

		
	}

	///////////////////DONE//////////////////////
	public void onClickTestYourselfAcronymCA1X5(View v)
	{
		
		if (randomInt==1)
		{
			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);
			CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);
			
			CA1X5Answer1Letter1.setText("C");
			CA1X5Answer1Letter2.setText("O");
			CA1X5Answer1Letter3.setText("P");
			CA1X5Answer1Letter4.setText("I");
			CA1X5Answer1Letter5.setText("E");
			CA1X5Answer1Letter6.setText("R");
			CA1X5Answer1Letter7.setText("S");
			
			String Acronym="COPIERS";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);
			CA1X5Answer1Letter9 = (TextView) findViewById(R.id.CA1X5Answer1Letter9);
			CA1X5Answer1Letter10 = (TextView) findViewById(R.id.CA1X5Answer1Letter10);

			CA1X5Answer1Letter1.setText("C");
			CA1X5Answer1Letter2.setText("R");
			CA1X5Answer1Letter3.setText("A");
			CA1X5Answer1Letter4.setText("P");
			CA1X5Answer1Letter5.setText("S");
			CA1X5Answer1Letter6.setText("E");
			CA1X5Answer1Letter7.setText("C");
			CA1X5Answer1Letter8.setText("T");
			CA1X5Answer1Letter9.setText("O");
			CA1X5Answer1Letter10.setText("R");
			
			
			String Acronym="CRAP SECTOR";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
		}

		if (randomInt==3)
		{			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);
			CA1X5Answer1Letter9 = (TextView) findViewById(R.id.CA1X5Answer1Letter9);
			CA1X5Answer1Letter10 = (TextView) findViewById(R.id.CA1X5Answer1Letter10);
			CA1X5Answer1Letter11 = (TextView) findViewById(R.id.CA1X5Answer1Letter11);
			CA1X5Answer1Letter12 = (TextView) findViewById(R.id.CA1X5Answer1Letter12);

			CA1X5Answer1Letter1.setText("S");
			CA1X5Answer1Letter2.setText("L");
			CA1X5Answer1Letter3.setText("I");
			CA1X5Answer1Letter4.setText("C");
			CA1X5Answer1Letter5.setText("E");
			CA1X5Answer1Letter6.setText("D");
			CA1X5Answer1Letter7.setText("P");
			CA1X5Answer1Letter8.setText("O");
			CA1X5Answer1Letter9.setText("T");
			CA1X5Answer1Letter10.setText("T");
			CA1X5Answer1Letter11.setText("E");
			CA1X5Answer1Letter12.setText("R");

			String Acronym="SLICED POTTER";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
						
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		
			CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);		
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		
			CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);		
			

			CA1X5Answer1Letter1.setText("S");
			CA1X5Answer1Letter2.setText("H");
			CA1X5Answer1Letter3.setText("A");
			CA1X5Answer1Letter4.setText("M");
			CA1X5Answer1Letter5.setText("F");
			CA1X5Answer1Letter6.setText("A");
			CA1X5Answer1Letter7.setText("D");
			CA1X5Answer1Letter8.setText("S");
			
			String Acronym="SHAM FADS";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);
			

			CA1X5Answer1Letter1.setText("N");
			CA1X5Answer1Letter2.setText("E");
			CA1X5Answer1Letter3.setText("D");
			CA1X5Answer1Letter4.setText("M");
			CA1X5Answer1Letter5.setText("M");
			
			
			
			String Acronym="NEDMM";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);
			
			CA1X5Answer1Letter1.setText("G");
			CA1X5Answer1Letter2.setText("I");
			CA1X5Answer1Letter3.setText("E");
			
			String Acronym="GIE";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}

		}
				
	}
	
	/////////////////DONE//////////////////////
	public void onClickGetTitleCA1X5(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(6)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);
		TextViewTitleAnswerCA1X5.setText(null);
		
		EditTextTestCA1X5 = (EditText) findViewById(R.id.EditTextTestCA1X5);
		EditTextTestCA1X5.setText(null);
		
		CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
		CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
		CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
		CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);
		CA1X5Answer1Letter9 = (TextView) findViewById(R.id.CA1X5Answer1Letter9);		CA1X5Answer1Letter10 = (TextView) findViewById(R.id.CA1X5Answer1Letter10);
		CA1X5Answer1Letter11 = (TextView) findViewById(R.id.CA1X5Answer1Letter11);		CA1X5Answer1Letter12 = (TextView) findViewById(R.id.CA1X5Answer1Letter12);
		CA1X5Answer1Letter13 = (TextView) findViewById(R.id.CA1X5Answer1Letter13);		CA1X5Answer1Letter14 = (TextView) findViewById(R.id.CA1X5Answer1Letter14);
		CA1X5Answer1Letter15 = (TextView) findViewById(R.id.CA1X5Answer1Letter15);		CA1X5Answer1Letter16 = (TextView) findViewById(R.id.CA1X5Answer1Letter16);
		
		CA1X5Answer1Letter1.setText(null);		CA1X5Answer1Letter2.setText(null);		CA1X5Answer1Letter3.setText(null);
		CA1X5Answer1Letter4.setText(null);		CA1X5Answer1Letter5.setText(null);		CA1X5Answer1Letter6.setText(null);
		CA1X5Answer1Letter7.setText(null);		CA1X5Answer1Letter8.setText(null);		CA1X5Answer1Letter9.setText(null);
		CA1X5Answer1Letter10.setText(null);		CA1X5Answer1Letter11.setText(null);		CA1X5Answer1Letter12.setText(null);
		CA1X5Answer1Letter13.setText(null);		CA1X5Answer1Letter13.setText(null);		CA1X5Answer1Letter14.setText(null);
		CA1X5Answer1Letter15.setText(null);		CA1X5Answer1Letter16.setText(null);
		
		
		
		EditTextCA1X5Answer1 = (EditText)findViewById(R.id.EditTextCA1X5Answer1);		EditTextCA1X5Answer2 = (EditText)findViewById(R.id.EditTextCA1X5Answer2);
		EditTextCA1X5Answer3 = (EditText)findViewById(R.id.EditTextCA1X5Answer3);		EditTextCA1X5Answer4 = (EditText)findViewById(R.id.EditTextCA1X5Answer4);
		EditTextCA1X5Answer5 = (EditText)findViewById(R.id.EditTextCA1X5Answer5);		EditTextCA1X5Answer6 = (EditText)findViewById(R.id.EditTextCA1X5Answer6);
		EditTextCA1X5Answer7 = (EditText)findViewById(R.id.EditTextCA1X5Answer7);		EditTextCA1X5Answer8 = (EditText)findViewById(R.id.EditTextCA1X5Answer8);
		EditTextCA1X5Answer9 = (EditText)findViewById(R.id.EditTextCA1X5Answer9);		EditTextCA1X5Answer10 = (EditText)findViewById(R.id.EditTextCA1X5Answer10);
		EditTextCA1X5Answer11 = (EditText)findViewById(R.id.EditTextCA1X5Answer11);		EditTextCA1X5Answer12 = (EditText)findViewById(R.id.EditTextCA1X5Answer12);
		EditTextCA1X5Answer13 = (EditText)findViewById(R.id.EditTextCA1X5Answer13);		EditTextCA1X5Answer14 = (EditText)findViewById(R.id.EditTextCA1X5Answer14);
		EditTextCA1X5Answer15 = (EditText)findViewById(R.id.EditTextCA1X5Answer15);		EditTextCA1X5Answer16 = (EditText)findViewById(R.id.EditTextCA1X5Answer16);
		
		EditTextCA1X5Answer1.setText(null);		EditTextCA1X5Answer2.setText(null);		EditTextCA1X5Answer3.setText(null);
		EditTextCA1X5Answer4.setText(null);		EditTextCA1X5Answer5.setText(null);		EditTextCA1X5Answer6.setText(null);
		EditTextCA1X5Answer7.setText(null);		EditTextCA1X5Answer8.setText(null);		EditTextCA1X5Answer9.setText(null);
		EditTextCA1X5Answer10.setText(null);		EditTextCA1X5Answer11.setText(null);		EditTextCA1X5Answer12.setText(null);
		EditTextCA1X5Answer13.setText(null);		EditTextCA1X5Answer14.setText(null);		EditTextCA1X5Answer15.setText(null);
		EditTextCA1X5Answer16.setText(null);
		
		textViewAnswer1CA1X5 = (TextView) findViewById(R.id.textViewAnswer1CA1X5);		textViewAnswer2CA1X5= (TextView) findViewById(R.id.textViewAnswer2CA1X5);
		textViewAnswer3CA1X5 = (TextView) findViewById(R.id.textViewAnswer3CA1X5);		textViewAnswer4CA1X5 = (TextView) findViewById(R.id.textViewAnswer4CA1X5);
		textViewAnswer5CA1X5 = (TextView) findViewById(R.id.textViewAnswer5CA1X5);		textViewAnswer6CA1X5 = (TextView) findViewById(R.id.textViewAnswer6CA1X5);
		textViewAnswer7CA1X5 = (TextView) findViewById(R.id.textViewAnswer7CA1X5);		textViewAnswer8CA1X5 = (TextView) findViewById(R.id.textViewAnswer8CA1X5);
		textViewAnswer9CA1X5 = (TextView) findViewById(R.id.textViewAnswer9CA1X5);		textViewAnswer10CA1X5 = (TextView) findViewById(R.id.textViewAnswer10CA1X5);
		textViewAnswer11CA1X5 = (TextView) findViewById(R.id.textViewAnswer11CA1X5);		textViewAnswer12CA1X5 = (TextView) findViewById(R.id.textViewAnswer12CA1X5);
		textViewAnswer13CA1X5 = (TextView) findViewById(R.id.textViewAnswer13CA1X5);		textViewAnswer14CA1X5 = (TextView) findViewById(R.id.textViewAnswer14CA1X5);
		textViewAnswer15CA1X5 = (TextView) findViewById(R.id.textViewAnswer15CA1X5);		textViewAnswer16CA1X5 = (TextView) findViewById(R.id.textViewAnswer16CA1X5);
		
		textViewAnswer1CA1X5.setText(null);		textViewAnswer2CA1X5.setText(null);		textViewAnswer3CA1X5.setText(null);
		textViewAnswer4CA1X5.setText(null);		textViewAnswer5CA1X5.setText(null);		textViewAnswer6CA1X5.setText(null);
		textViewAnswer7CA1X5.setText(null);		textViewAnswer8CA1X5.setText(null);		textViewAnswer9CA1X5.setText(null);
		textViewAnswer10CA1X5.setText(null);		textViewAnswer11CA1X5.setText(null);		textViewAnswer12CA1X5.setText(null);
		textViewAnswer13CA1X5.setText(null);		textViewAnswer14CA1X5.setText(null);		textViewAnswer15CA1X5.setText(null);
		textViewAnswer16CA1X5.setText(null);
		
		
		if(randomInt == 1){

			String Acronym1Title = "Economic factors influencing bond yields";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym1Title);
			
			

		}

		if(randomInt == 2){
			
			String Acronym2Title = "Factors affecting the level of the equity market";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym2Title);
			
			
		}

		if(randomInt == 3){

			String Acronym3Title = "Factors affecting the level of the property market";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym3Title);
			
			

		}

		if(randomInt == 4){

			String Acronym4Title = "Ways of valuing assets";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym4Title);
			
			
		}

		if(randomInt == 5){

			String Acronym5Title = "Five ways to value equities";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym5Title);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Title = "Factors affecting short-term interest rates";
			
			textViewCA1X5 = (TextView) findViewById(R.id.PullTestStringCA1X5);//take in string
			textViewCA1X5.setText(Acronym6Title);
			
			
		}

		
	}
	
	///////////////////DONE/////////////////
	public void onClickTestYourselfTitleCA1X5(View v)
	{
		if (randomInt==1)
		{
			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);
			CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);
			
			CA1X5Answer1Letter1.setText("C");
			CA1X5Answer1Letter2.setText("O");
			CA1X5Answer1Letter3.setText("P");
			CA1X5Answer1Letter4.setText("I");
			CA1X5Answer1Letter5.setText("E");
			CA1X5Answer1Letter6.setText("R");
			CA1X5Answer1Letter7.setText("S");
			
			String Acronym="Economic factors influencing bond yields";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
			
		}

		if (randomInt==2)
		{
			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);
			CA1X5Answer1Letter9 = (TextView) findViewById(R.id.CA1X5Answer1Letter9);		CA1X5Answer1Letter10 = (TextView) findViewById(R.id.CA1X5Answer1Letter10);
			

			CA1X5Answer1Letter1.setText("C");
			CA1X5Answer1Letter2.setText("R");
			CA1X5Answer1Letter3.setText("A");
			CA1X5Answer1Letter4.setText("P");
			CA1X5Answer1Letter5.setText("S");
			CA1X5Answer1Letter6.setText("E");
			CA1X5Answer1Letter7.setText("C");
			CA1X5Answer1Letter8.setText("T");
			CA1X5Answer1Letter9.setText("O");
			CA1X5Answer1Letter10.setText("R");

			
			String Acronym="Factors affecting the level of the equity market";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			
						
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);
			CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);
			CA1X5Answer1Letter9 = (TextView) findViewById(R.id.CA1X5Answer1Letter9);
			CA1X5Answer1Letter10 = (TextView) findViewById(R.id.CA1X5Answer1Letter10);
			CA1X5Answer1Letter11 = (TextView) findViewById(R.id.CA1X5Answer1Letter11);
			CA1X5Answer1Letter12 = (TextView) findViewById(R.id.CA1X5Answer1Letter12);
			

			CA1X5Answer1Letter1.setText("S");
			CA1X5Answer1Letter2.setText("L");
			CA1X5Answer1Letter3.setText("I");
			CA1X5Answer1Letter4.setText("C");
			CA1X5Answer1Letter5.setText("E");
			CA1X5Answer1Letter6.setText("D");
			CA1X5Answer1Letter7.setText("P");
			CA1X5Answer1Letter8.setText("O");
			CA1X5Answer1Letter9.setText("T");
			CA1X5Answer1Letter10.setText("T");
			CA1X5Answer1Letter11.setText("E");
			CA1X5Answer1Letter12.setText("R");
			
			

			String Acronym="Factors affecting the level of the property market";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		
			CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);		
			CA1X5Answer1Letter7 = (TextView) findViewById(R.id.CA1X5Answer1Letter7);		
			CA1X5Answer1Letter8 = (TextView) findViewById(R.id.CA1X5Answer1Letter8);		
			

			CA1X5Answer1Letter1.setText("S");
			CA1X5Answer1Letter2.setText("H");
			CA1X5Answer1Letter3.setText("A");
			CA1X5Answer1Letter4.setText("M");
			CA1X5Answer1Letter5.setText("F");
			CA1X5Answer1Letter6.setText("A");
			CA1X5Answer1Letter7.setText("D");
			CA1X5Answer1Letter8.setText("S");
			
			
			String Acronym="Ways of valuing assets";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
						
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			CA1X5Answer1Letter5 = (TextView) findViewById(R.id.CA1X5Answer1Letter5);		CA1X5Answer1Letter6 = (TextView) findViewById(R.id.CA1X5Answer1Letter6);
			

			CA1X5Answer1Letter1.setText("N");
			CA1X5Answer1Letter2.setText("E");
			CA1X5Answer1Letter3.setText("D");
			CA1X5Answer1Letter4.setText("M");
			CA1X5Answer1Letter5.setText("M");
			
			
			String Acronym="Five ways to value equities";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
						
			CA1X5Answer1Letter1 = (TextView) findViewById(R.id.CA1X5Answer1Letter1);		CA1X5Answer1Letter2 = (TextView) findViewById(R.id.CA1X5Answer1Letter2);
			CA1X5Answer1Letter3 = (TextView) findViewById(R.id.CA1X5Answer1Letter3);		CA1X5Answer1Letter4 = (TextView) findViewById(R.id.CA1X5Answer1Letter4);
			
			
			CA1X5Answer1Letter1.setText("G");
			CA1X5Answer1Letter2.setText("I");
			CA1X5Answer1Letter3.setText("E");
			
			
			String Acronym="Factors affecting short-term interest rates";

			EditTextTestCA1X5 = (EditText)findViewById(R.id.EditTextTestCA1X5);
			useranswerCA1X5=EditTextTestCA1X5.getText().toString();
			TextViewTitleAnswerCA1X5 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X5);

			if(Acronym.equals(useranswerCA1X5)){
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X5.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X5.setText(Acronym);
			}

		}
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x5, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x5,
					container, false);
			return rootView;
		}
	}

}
