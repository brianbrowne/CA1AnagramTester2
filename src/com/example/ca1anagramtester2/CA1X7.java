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

public class CA1X7 extends ActionBarActivity {
	
	EditText EditTextTestCA1X7;			TextView TextViewTitleAnswerCA1X7;			TextView textViewCA1X7;
	String useranswerCA1X7;
	
	EditText EditTextCA1X7Answer1;		EditText EditTextCA1X7Answer2;		EditText EditTextCA1X7Answer3;
	EditText EditTextCA1X7Answer4;		EditText EditTextCA1X7Answer5;		EditText EditTextCA1X7Answer6;
	EditText EditTextCA1X7Answer7;		EditText EditTextCA1X7Answer8;		EditText EditTextCA1X7Answer9;
	EditText EditTextCA1X7Answer10;		EditText EditTextCA1X7Answer11;		EditText EditTextCA1X7Answer12;
	EditText EditTextCA1X7Answer13;		EditText EditTextCA1X7Answer14;		EditText EditTextCA1X7Answer15;		EditText EditTextCA1X7Answer16;
	EditText EditTextCA1X7Answer17;		EditText EditTextCA1X7Answer18;
    
	
	TextView CA1X7Answer1Letter1;		TextView CA1X7Answer1Letter2;		TextView CA1X7Answer1Letter3;
	TextView CA1X7Answer1Letter4;		TextView CA1X7Answer1Letter5;		TextView CA1X7Answer1Letter6;
	TextView CA1X7Answer1Letter7;		TextView CA1X7Answer1Letter8;		TextView CA1X7Answer1Letter9;
	TextView CA1X7Answer1Letter10;		TextView CA1X7Answer1Letter11;		TextView CA1X7Answer1Letter12;
	TextView CA1X7Answer1Letter13;		TextView CA1X7Answer1Letter14;		TextView CA1X7Answer1Letter15;		TextView CA1X7Answer1Letter16;
	TextView CA1X7Answer1Letter17;		TextView CA1X7Answer1Letter18;
    
	
	TextView textViewAnswer1CA1X7;		TextView textViewAnswer2CA1X7;		TextView textViewAnswer3CA1X7;		TextView textViewAnswer4CA1X7;
	TextView textViewAnswer5CA1X7;		TextView textViewAnswer6CA1X7;		TextView textViewAnswer7CA1X7;		TextView textViewAnswer8CA1X7;
	TextView textViewAnswer9CA1X7;		TextView textViewAnswer10CA1X7;		TextView textViewAnswer11CA1X7;		TextView textViewAnswer12CA1X7;
	TextView textViewAnswer13CA1X7;		TextView textViewAnswer14CA1X7;		TextView textViewAnswer15CA1X7;		TextView textViewAnswer16CA1X7;
	TextView textViewAnswer17CA1X7;		TextView textViewAnswer18CA1X7;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x7);
		
		EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
		textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);
		TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);
		
		
		CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
		CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
		CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
		CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);		CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);		CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
		CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);		CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
		CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);		CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
		CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);		CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);
		CA1X7Answer1Letter17 = (TextView) findViewById(R.id.CA1X7Answer1Letter17);		CA1X7Answer1Letter18 = (TextView) findViewById(R.id.CA1X7Answer1Letter18);
		
		
		EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
		EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
		EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
		EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
		EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
		EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);		EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
		EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);		EditTextCA1X7Answer14 = (EditText)findViewById(R.id.EditTextCA1X7Answer14);
		EditTextCA1X7Answer15 = (EditText)findViewById(R.id.EditTextCA1X7Answer15);		EditTextCA1X7Answer16 = (EditText)findViewById(R.id.EditTextCA1X7Answer16);
		EditTextCA1X7Answer17 = (EditText)findViewById(R.id.EditTextCA1X7Answer17);		EditTextCA1X7Answer18 = (EditText)findViewById(R.id.EditTextCA1X7Answer18);		
		
		
		textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
		textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
		textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
		textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
		textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
		textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
		textViewAnswer13CA1X7 = (TextView) findViewById(R.id.textViewAnswer13CA1X7);		textViewAnswer14CA1X7 = (TextView) findViewById(R.id.textViewAnswer14CA1X7);
		textViewAnswer15CA1X7 = (TextView) findViewById(R.id.textViewAnswer15CA1X7);		textViewAnswer16CA1X7 = (TextView) findViewById(R.id.textViewAnswer16CA1X7);
		textViewAnswer17CA1X7 = (TextView) findViewById(R.id.textViewAnswer17CA1X7);		textViewAnswer18CA1X7 = (TextView) findViewById(R.id.textViewAnswer18CA1X7);
		
		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	///////////////////DONE//////////////////
	public void onClickCA1X7TestAnswers(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym1Answer1="Valid";
			String Acronym1Answer2="Adequately documented";
			String Acronym1Answer3="Rigorous";
			String Acronym1Answer4="Inputs to parameter values appropriate";
			String Acronym1Answer5="Arbitrage free (economic interpretation)";
			String Acronym1Answer6="Behaviour reasonable";
			String Acronym1Answer7="Length/expense of run not too long/high";
			String Acronym1Answer8="Easy to understand";
			String Acronym1Answer9="Communicable workings and outputs";
			String Acronym1Answer10="Reflects risk profile of contracts modelled";
			String Acronym1Answer11="Independent verification of outputs";
			String Acronym1Answer12="Sensible joint behaviour of variables";
			String Acronym1Answer13="Parameters allow for all significant features";
			String Acronym1Answer14="Simple but retain key features";
			String Acronym1Answer15="Clear results";
			String Acronym1Answer16="A range of implementation methods";
			String Acronym1Answer17="Refineable";
			String Acronym1Answer18="Developable";
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
			EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);		EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
			EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);		EditTextCA1X7Answer14 = (EditText)findViewById(R.id.EditTextCA1X7Answer14);
			EditTextCA1X7Answer15 = (EditText)findViewById(R.id.EditTextCA1X7Answer15);		EditTextCA1X7Answer16 = (EditText)findViewById(R.id.EditTextCA1X7Answer16);
			EditTextCA1X7Answer17 = (EditText)findViewById(R.id.EditTextCA1X7Answer17);		EditTextCA1X7Answer18 = (EditText)findViewById(R.id.EditTextCA1X7Answer18);		
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
			textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
			textViewAnswer13CA1X7 = (TextView) findViewById(R.id.textViewAnswer13CA1X7);		textViewAnswer14CA1X7 = (TextView) findViewById(R.id.textViewAnswer14CA1X7);
			textViewAnswer15CA1X7 = (TextView) findViewById(R.id.textViewAnswer15CA1X7);		textViewAnswer16CA1X7 = (TextView) findViewById(R.id.textViewAnswer16CA1X7);
			textViewAnswer17CA1X7 = (TextView) findViewById(R.id.textViewAnswer17CA1X7);		textViewAnswer18CA1X7 = (TextView) findViewById(R.id.textViewAnswer18CA1X7);	
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();	String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();
			String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();
			String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();
			String checkuseranswerCA1X710=EditTextCA1X7Answer10.getText().toString();
			String checkuseranswerCA1X711=EditTextCA1X7Answer11.getText().toString();
			String checkuseranswerCA1X712=EditTextCA1X7Answer12.getText().toString();
			String checkuseranswerCA1X713=EditTextCA1X7Answer13.getText().toString();
			String checkuseranswerCA1X714=EditTextCA1X7Answer14.getText().toString();
			String checkuseranswerCA1X715=EditTextCA1X7Answer15.getText().toString();
			String checkuseranswerCA1X716=EditTextCA1X7Answer16.getText().toString();
			String checkuseranswerCA1X717=EditTextCA1X7Answer17.getText().toString();
			String checkuseranswerCA1X718=EditTextCA1X7Answer18.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym1Answer1);
			}
			
			if(Acronym1Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym1Answer2);
			}
			
			if(Acronym1Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym1Answer3);
			}
			
			if(Acronym1Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym1Answer4);
			}
			
			if(Acronym1Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym1Answer5);
			}
			
			if(Acronym1Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym1Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym1Answer6);
			}
			
			if(Acronym1Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym1Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym1Answer7);
			}
			
			if(Acronym1Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym1Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym1Answer8);
			}
			
			if(Acronym1Answer9.equals(checkuseranswerCA1X79)){
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X7.setText(Acronym1Answer9);
			}else{
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X7.setText(Acronym1Answer9);
			}
			
			if(Acronym1Answer10.equals(checkuseranswerCA1X710)){
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X7.setText(Acronym1Answer10);
			}else{
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X7.setText(Acronym1Answer10);
			}
			
			if(Acronym1Answer11.equals(checkuseranswerCA1X711)){
				textViewAnswer11CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X7.setText(Acronym1Answer11);
			}else{
				textViewAnswer11CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X7.setText(Acronym1Answer11);
			}
			
			if(Acronym1Answer12.equals(checkuseranswerCA1X712)){
				textViewAnswer12CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X7.setText(Acronym1Answer12);
			}else{
				textViewAnswer12CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X7.setText(Acronym1Answer12);
			}
			
			if(Acronym1Answer13.equals(checkuseranswerCA1X713)){
				textViewAnswer13CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X7.setText(Acronym1Answer13);
			}else{
				textViewAnswer13CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X7.setText(Acronym1Answer13);
			}
			
			if(Acronym1Answer14.equals(checkuseranswerCA1X714)){
				textViewAnswer14CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CA1X7.setText(Acronym1Answer14);
			}else{
				textViewAnswer14CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CA1X7.setText(Acronym1Answer14);
			}
			
			if(Acronym1Answer15.equals(checkuseranswerCA1X715)){
				textViewAnswer15CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CA1X7.setText(Acronym1Answer15);
			}else{
				textViewAnswer15CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CA1X7.setText(Acronym1Answer15);
			}
			
			if(Acronym1Answer16.equals(checkuseranswerCA1X716)){
				textViewAnswer16CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer16CA1X7.setText(Acronym1Answer16);
			}else{
				textViewAnswer16CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer16CA1X7.setText(Acronym1Answer16);
			}
			
			if(Acronym1Answer17.equals(checkuseranswerCA1X717)){
				textViewAnswer17CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer17CA1X7.setText(Acronym1Answer17);
			}else{
				textViewAnswer17CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer17CA1X7.setText(Acronym1Answer17);
			}
			
			if(Acronym1Answer18.equals(checkuseranswerCA1X718)){
				textViewAnswer18CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer18CA1X7.setText(Acronym1Answer18);
			}else{
				textViewAnswer18CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer18CA1X7.setText(Acronym1Answer18);
			}
		}
		if(randomInt==2){
			
			
			String Acronym2Answer1="Fit for purpose";
			String Acronym2Answer2="Expertise available in house";
			String Acronym2Answer3="Need flexibility";
			String Acronym2Answer4="Cost of each option";
			String Acronym2Answer5="Expected number of times used";
			String Acronym2Answer6="Desired accuracy";
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
					
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();	String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();	String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();	String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();	String checkuseranswerCA1X710=EditTextCA1X7Answer10.getText().toString();
			
			if(Acronym2Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym2Answer1);
			}
			
			if(Acronym2Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym2Answer2);
			}
			
			if(Acronym2Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym2Answer3);
			}
			
			if(Acronym2Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym2Answer4);
			}
			
			if(Acronym2Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym2Answer5);
			}
			
			if(Acronym2Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym2Answer6);
			}
			
		
			
		}
		if(randomInt==3){
			
			
			String Acronym3Answer1="Goodness of fit is acceptable (check)";
			String Acronym3Answer2="Ascribe parameter values";
			String Acronym3Answer3="Form of model is chosen";
			String Acronym3Answer4="Fit a new model if first choice does not fit well";
			String Acronym3Answer5="Expected cashflows (construct model based on)";
			String Acronym3Answer6="Run the model using selected values of the variables and values that will apply in the future";
			String Acronym3Answer7="Sensitivity test the parameters";
			String Acronym3Answer8="Data (collect, group, modify)";
			String Acronym3Answer9="Identify the parameters and variables";
			String Acronym3Answer10="Purpose of model is specified";
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
			EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);		EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
			EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);		EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);
			EditTextCA1X7Answer14 = (EditText)findViewById(R.id.EditTextCA1X7Answer14);
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
			textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
			textViewAnswer13CA1X7 = (TextView) findViewById(R.id.textViewAnswer13CA1X7);		textViewAnswer14CA1X7 = (TextView) findViewById(R.id.textViewAnswer14CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();		String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();		String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();		String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();		String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();		String checkuseranswerCA1X710=EditTextCA1X7Answer10.getText().toString();
			String checkuseranswerCA1X711=EditTextCA1X7Answer11.getText().toString();		String checkuseranswerCA1X712=EditTextCA1X7Answer12.getText().toString();
			String checkuseranswerCA1X713=EditTextCA1X7Answer13.getText().toString();		String checkuseranswerCA1X714=EditTextCA1X7Answer14.getText().toString();
			
			if(Acronym3Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym3Answer1);
			}
			
			if(Acronym3Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym3Answer2);
			}
			
			if(Acronym3Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym3Answer3);
			}
			
			if(Acronym3Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym3Answer4);
			}
			
			if(Acronym3Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym3Answer5);
			}
			
			if(Acronym3Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym3Answer6);
			}
			
			if(Acronym3Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym3Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym3Answer7);
			}
			
			if(Acronym3Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym3Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym3Answer8);
			}
			
			if(Acronym3Answer9.equals(checkuseranswerCA1X79)){
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X7.setText(Acronym3Answer9);
			}else{
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X7.setText(Acronym3Answer9);
			}
			
			if(Acronym3Answer10.equals(checkuseranswerCA1X710)){
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X7.setText(Acronym3Answer10);
			}else{
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X7.setText(Acronym3Answer10);
			}
			
		}
		if(randomInt==4){
			
			String Acronym4Answer1="Data (collect, group, modify)";
			String Acronym4Answer2="Density function for each stochastic variable suitably chosen";
			String Acronym4Answer3="Correlations between variables specified";
			String Acronym4Answer4="Fit a new model if the first choice does not fit well";
			String Acronym4Answer5="Purpose of model specified";
			String Acronym4Answer6="Summary of the results produced";
			String Acronym4Answer7="Run the model many times using randomly generated values of the stochastic variables";
			String Acronym4Answer8="Expected cashflows (construct model based on)";
			String Acronym4Answer9="Goodness if ift is acceptable (check)";
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);
			EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);
			EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);
			textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);
			textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();	String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();
			String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();
			String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();
			
			if(Acronym4Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym4Answer1);
			}
			
			if(Acronym4Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym4Answer2);
			}
			
			if(Acronym4Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym4Answer3);
			}
			
			if(Acronym4Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym4Answer4);
			}
			
			if(Acronym4Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym4Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym4Answer5);
			}
			
			if(Acronym4Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym4Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym4Answer6);
			}
			
			if(Acronym4Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym4Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym4Answer7);
			}
			
			if(Acronym4Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym4Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym4Answer8);
			}
			
			if(Acronym4Answer9.equals(checkuseranswerCA1X79)){
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X7.setText(Acronym4Answer9);
			}else{
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X7.setText(Acronym4Answer9);
			}
			
		}
		if(randomInt==5){
			
			
			String Acronym5Answer1="Statutory returns";
			String Acronym5Answer2="Investment";
			String Acronym5Answer3="Risk management";
			String Acronym5Answer4="Management information and financial control";
			String Acronym5Answer5="Accounting";
			String Acronym5Answer6="Pricing";
			String Acronym5Answer7="Experience statistics and analyses";
			String Acronym5Answer8="Marketing";
			String Acronym5Answer9="Administration";
			String Acronym5Answer10="Provisioning";
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);
			EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);
			EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);
			EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
			EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7= (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7= (TextView) findViewById(R.id.textViewAnswer10CA1X7);
			textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		
			
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();	String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();	String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();	String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();	String checkuseranswerCA1X710=EditTextCA1X7Answer10.getText().toString();
			String checkuseranswerCA1X711=EditTextCA1X7Answer11.getText().toString();
			
			if(Acronym5Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym5Answer1);
			}
			
			if(Acronym5Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym5Answer2);
			}
			
			if(Acronym5Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym5Answer3);
			}
			
			if(Acronym5Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym5Answer4);
			}
			
			if(Acronym5Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym5Answer5);
			}
			
			if(Acronym5Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym5Answer6);
			}
			
			if(Acronym5Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym5Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym5Answer7);
			}
			
			if(Acronym5Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym5Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym5Answer8);
			}
			
			if(Acronym5Answer9.equals(checkuseranswerCA1X79)){
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X7.setText(Acronym5Answer9);
			}else{
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X7.setText(Acronym5Answer9);
			}
			
			if(Acronym5Answer10.equals(checkuseranswerCA1X710)){
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X7.setText(Acronym5Answer10);
			}else{
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X7.setText(Acronym5Answer10);
			}
			
						
		}
		if(randomInt==6){
			
			
			String Acronym6Answer1="Tables eg actuarial nortality tables";
			String Acronym6Answer2="Reinsurers";
			String Acronym6Answer3="Abroad (data from overseas contracts)";
			String Acronym6Answer4="Industry data";
			String Acronym6Answer5="National statistics";
			String Acronym6Answer6="Experience investigations on the existing accounts";
			String Acronym6Answer7="Regulatory reoprts and company accounts";
			String Acronym6Answer8="Similar contracts";
			
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);
			EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);
			EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);
			EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
			EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);
			EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7= (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7= (TextView) findViewById(R.id.textViewAnswer10CA1X7);
			textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);
			textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
			
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();	String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();	String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();	String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();	String checkuseranswerCA1X710=EditTextCA1X7Answer10.getText().toString();
			String checkuseranswerCA1X711=EditTextCA1X7Answer11.getText().toString();
			String checkuseranswerCA1X712=EditTextCA1X7Answer12.getText().toString();
			
			if(Acronym6Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym6Answer1);
			}
			
			if(Acronym6Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym6Answer2);
			}
			
			if(Acronym6Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym6Answer3);
			}
			
			if(Acronym6Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym6Answer4);
			}
			
			if(Acronym6Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym6Answer5);
			}
			
			if(Acronym6Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym6Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym6Answer6);
			}
			
			if(Acronym6Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym6Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym6Answer7);
			}
			
			if(Acronym6Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym6Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym6Answer8);
			}
			
						
		}
		if(randomInt==7){
			
			String Acronym7Answer1="Detail insufficient";
			String Acronym7Answer2="Risk factors coded in different ways";
			String Acronym7Answer3="Differences in target markets, underwriting, geographical area, sales processes, contract wordings, claim settlement, recording of data";
			String Acronym7Answer4="Out of date";
			String Acronym7Answer5="Not everyone contributes";
			String Acronym7Answer6="Errors";
			String Acronym7Answer7="Quality only as good as thsat of contributors";
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);
			EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);
			EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7 = (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);
			textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);
			textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();
			String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();
			String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();
			
			if(Acronym7Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym7Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym7Answer1);
			}
			
			if(Acronym7Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym7Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym7Answer2);
			}
			
			if(Acronym7Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym7Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym7Answer3);
			}
			
			if(Acronym7Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym7Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym7Answer4);
			}
			
			if(Acronym7Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym7Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym7Answer5);
			}
			
			if(Acronym7Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym7Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym7Answer6);
			}
			
			if(Acronym7Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym7Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym7Answer7);
			}

			
		}
		if(randomInt==8){
			
			String Acronym8Answer1="Member numbers reconciliation";
			String Acronym8Answer2="Average sum asssured or premium consistency with previous investigation";
			String Acronym8Answer3="Date validation";
			String Acronym8Answer4="Contribution and benefit levels consistency with accounts";
			String Acronym8Answer5="Asset income data consistency with accounts";
			String Acronym8Answer6="Premium and benefit reconciliations";
			String Acronym8Answer7="Shareholding start and end consistency";
			String Acronym8Answer8="Investment income consistency";
			String Acronym8Answer9="Movement data against accounts";
			String Acronym8Answer10="Beneficial owner and custodian records reconciliation";
			String Acronym8Answer11="Erroneous data checks";
			String Acronym8Answer12="Deed audit for certain assets";
			String Acronym8Answer13="Spot checks";
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
			EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);		EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
			EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);		EditTextCA1X7Answer14 = (EditText)findViewById(R.id.EditTextCA1X7Answer14);
			EditTextCA1X7Answer15 = (EditText)findViewById(R.id.EditTextCA1X7Answer15);		EditTextCA1X7Answer16 = (EditText)findViewById(R.id.EditTextCA1X7Answer16);
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
			textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
			textViewAnswer13CA1X7 = (TextView) findViewById(R.id.textViewAnswer13CA1X7);		textViewAnswer14CA1X7 = (TextView) findViewById(R.id.textViewAnswer14CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();		String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();		String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();		String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();		String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();		String checkuseranswerCA1X710=EditTextCA1X7Answer10.getText().toString();
			String checkuseranswerCA1X711=EditTextCA1X7Answer11.getText().toString();		String checkuseranswerCA1X712=EditTextCA1X7Answer12.getText().toString();
			String checkuseranswerCA1X713=EditTextCA1X7Answer13.getText().toString();		String checkuseranswerCA1X714=EditTextCA1X7Answer14.getText().toString();
			String checkuseranswerCA1X715=EditTextCA1X7Answer15.getText().toString();		String checkuseranswerCA1X716=EditTextCA1X7Answer16.getText().toString();
			
			if(Acronym8Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym8Answer7);
			}
			
			if(Acronym8Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym8Answer8);
			}
			
			if(Acronym8Answer9.equals(checkuseranswerCA1X79)){
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X7.setText(Acronym8Answer9);
			}else{
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X7.setText(Acronym8Answer9);
			}
			
			if(Acronym8Answer10.equals(checkuseranswerCA1X710)){
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X7.setText(Acronym8Answer10);
			}else{
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X7.setText(Acronym8Answer10);
			}
			
			if(Acronym8Answer11.equals(checkuseranswerCA1X711)){
				textViewAnswer11CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X7.setText(Acronym8Answer11);
			}else{
				textViewAnswer11CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X7.setText(Acronym8Answer11);
			}
			
			if(Acronym8Answer12.equals(checkuseranswerCA1X712)){
				textViewAnswer12CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X7.setText(Acronym8Answer12);
			}else{
				textViewAnswer12CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X7.setText(Acronym8Answer12);
			}
			
			if(Acronym8Answer13.equals(checkuseranswerCA1X713)){
				textViewAnswer13CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X7.setText(Acronym8Answer13);
			}else{
				textViewAnswer13CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X7.setText(Acronym8Answer13);
			}
			
					
		}
		if(randomInt==9){			
			
			String Acronym9Answer1="Consistency between assumptions";
			String Acronym9Answer2="Use to which the model will be put";
			String Acronym9Answer3="Regulatory and legislative requirements";
			String Acronym9Answer4="Significance financially of the assumptions";
			String Acronym9Answer5="Needs of client";
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		
			
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		
			
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();	String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();	
			
			
			if(Acronym9Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym9Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym9Answer1);
			}
			
			if(Acronym9Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym9Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym9Answer2);
			}
			
			if(Acronym9Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym9Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym9Answer3);
			}
			
			if(Acronym9Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym9Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym9Answer4);
			}
			
			if(Acronym9Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym9Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym9Answer5);
			}
			
			
			
			
		}
		if(randomInt==10){
			
			
			String Acronym8Answer1="Homogeneous groups underlying the data (balance may have changed)";
			String Acronym8Answer2="Errors in data";
			String Acronym8Answer3="Abnormal fluctuations";
			String Acronym8Answer4="Recording of data may have changed";
			String Acronym8Answer5="Heterogeneity within the group to whom the assumptions relate";
			String Acronym8Answer6="Experience may have changed over time";
			String Acronym8Answer7="Random fluctuations";
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();		String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();		String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();		String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();		String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();
			
			if(Acronym8Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym8Answer7);
			}
			
						
		}
		if(randomInt==11){
			
			String Acronym8Answer1="Margins for contingencies";
			String Acronym8Answer2="Experience rating to adjust future premiums";
			String Acronym8Answer3="Taxation";
			String Acronym8Answer4="Reinsurance costs";
			String Acronym8Answer5="Investment income";
			String Acronym8Answer6="Cost of capital supporting the product";
			String Acronym8Answer7="Commission";
			String Acronym8Answer8="Options and guarantees costs";
			String Acronym8Answer9="Basis that will be used to set future provisions for the liabilities";
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);
			EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);
			textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();		String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();		String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();		String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();
			String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();
			
			if(Acronym8Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym8Answer7);
			}
			
			if(Acronym8Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym8Answer8);
			}
			
			if(Acronym8Answer9.equals(checkuseranswerCA1X79)){
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X7.setText(Acronym8Answer9);
			}else{
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X7.setText(Acronym8Answer9);
			}

			
		}
		if(randomInt==12){
			
			
			String Acronym8Answer1="Distribution channel";
			String Acronym8Answer2="Underwriting cycle";
			String Acronym8Answer3="Loss leader";
			String Acronym8Answer4="Premium frequency";
			
			
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);	
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();		String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();		String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();	
			
			if(Acronym8Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym8Answer4);
			}

			
		}
		if(randomInt==13){
			
			String Acronym13Answer1="Just-in-time funding";
			String Acronym13Answer2="Lump sum in advance";
			String Acronym13Answer3="Smoothed pay-as-you-go";
			String Acronym13Answer4="Regular contributions";
			String Acronym13Answer5="Terminal funding";
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);
			
			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();
			String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();
			
			if(Acronym13Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym13Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym13Answer1);
			}
			
			if(Acronym13Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym13Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym13Answer2);
			}
			
			if(Acronym13Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym13Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym13Answer3);
			}
			
			if(Acronym13Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym13Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym13Answer4);
			}
			
			if(Acronym13Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym13Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym13Answer5);
			}

			
		}
		if(randomInt==14){
			
			String Acronym14Answer1="Project all cashflows";
			String Acronym14Answer2="Options and guarantees should be allowed for";
			String Acronym14Answer3="Project annually or possibly monthly";
			String Acronym14Answer4="Sensitivity test by varying model points and parameters";
			String Acronym14Answer5="Models points should be used which reflect business expected to be written";
			String Acronym14Answer6="Assumptions should be realistic and as accurate as possible";
			String Acronym14Answer7="Calculate eg NPV, IRR, DPP - check they meet profit objectives";
			String Acronym14Answer8="All relevant assumptions should be included (eg mortality, expenses, withdrawals)";
			String Acronym14Answer9="Discount projected profit flows";
			String Acronym14Answer10="Adequacy of capital should be checked";
			String Acronym14Answer11="Marketablilty and competitiveness of the product should be checked";
			String Acronym14Answer12="Dynamic links between variables built in";
			String Acronym14Answer13="Realistic links between variables built in";
			String Acronym14Answer14="Impact of supervisory reserves and solvency margin on profit";
			String Acronym14Answer15="Vary assumptions, possibly stochastically";
			String Acronym14Answer16="Easy to interpret the output and check for reliability";
			
			EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
			EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
			EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
			EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
			EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
			EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);		EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
			EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);		EditTextCA1X7Answer14 = (EditText)findViewById(R.id.EditTextCA1X7Answer14);
			EditTextCA1X7Answer15 = (EditText)findViewById(R.id.EditTextCA1X7Answer15);		EditTextCA1X7Answer16 = (EditText)findViewById(R.id.EditTextCA1X7Answer16);
			EditTextCA1X7Answer17 = (EditText)findViewById(R.id.EditTextCA1X7Answer17);		EditTextCA1X7Answer18 = (EditText)findViewById(R.id.EditTextCA1X7Answer18);		
			
			
			textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
			textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
			textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
			textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
			textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
			textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
			textViewAnswer13CA1X7 = (TextView) findViewById(R.id.textViewAnswer13CA1X7);		textViewAnswer14CA1X7 = (TextView) findViewById(R.id.textViewAnswer14CA1X7);
			textViewAnswer15CA1X7 = (TextView) findViewById(R.id.textViewAnswer15CA1X7);		textViewAnswer16CA1X7 = (TextView) findViewById(R.id.textViewAnswer16CA1X7);
			textViewAnswer17CA1X7 = (TextView) findViewById(R.id.textViewAnswer17CA1X7);		textViewAnswer18CA1X7 = (TextView) findViewById(R.id.textViewAnswer18CA1X7);

			String checkuseranswerCA1X71=EditTextCA1X7Answer1.getText().toString();	String checkuseranswerCA1X72=EditTextCA1X7Answer2.getText().toString();
			String checkuseranswerCA1X73=EditTextCA1X7Answer3.getText().toString();	String checkuseranswerCA1X74=EditTextCA1X7Answer4.getText().toString();
			String checkuseranswerCA1X75=EditTextCA1X7Answer5.getText().toString();
			String checkuseranswerCA1X76=EditTextCA1X7Answer6.getText().toString();
			String checkuseranswerCA1X77=EditTextCA1X7Answer7.getText().toString();
			String checkuseranswerCA1X78=EditTextCA1X7Answer8.getText().toString();
			String checkuseranswerCA1X79=EditTextCA1X7Answer9.getText().toString();
			String checkuseranswerCA1X710=EditTextCA1X7Answer10.getText().toString();
			String checkuseranswerCA1X711=EditTextCA1X7Answer11.getText().toString();
			String checkuseranswerCA1X712=EditTextCA1X7Answer12.getText().toString();
			String checkuseranswerCA1X713=EditTextCA1X7Answer13.getText().toString();
			String checkuseranswerCA1X714=EditTextCA1X7Answer14.getText().toString();
			String checkuseranswerCA1X715=EditTextCA1X7Answer15.getText().toString();
			String checkuseranswerCA1X716=EditTextCA1X7Answer16.getText().toString();
			
			if(Acronym14Answer1.equals(checkuseranswerCA1X71)){
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CA1X7.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CA1X7.setText(Acronym14Answer1);
			}
			
			if(Acronym14Answer2.equals(checkuseranswerCA1X72)){
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CA1X7.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CA1X7.setText(Acronym14Answer2);
			}
			
			if(Acronym14Answer3.equals(checkuseranswerCA1X73)){
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CA1X7.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CA1X7.setText(Acronym14Answer3);
			}
			
			if(Acronym14Answer4.equals(checkuseranswerCA1X74)){
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CA1X7.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CA1X7.setText(Acronym14Answer4);
			}
			
			if(Acronym14Answer5.equals(checkuseranswerCA1X75)){
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CA1X7.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CA1X7.setText(Acronym14Answer5);
			}
			
			if(Acronym14Answer6.equals(checkuseranswerCA1X76)){
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CA1X7.setText(Acronym14Answer6);
			}else{
				textViewAnswer6CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CA1X7.setText(Acronym14Answer6);
			}
			
			if(Acronym14Answer7.equals(checkuseranswerCA1X77)){
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CA1X7.setText(Acronym14Answer7);
			}else{
				textViewAnswer7CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CA1X7.setText(Acronym14Answer7);
			}
			
			if(Acronym14Answer8.equals(checkuseranswerCA1X78)){
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CA1X7.setText(Acronym14Answer8);
			}else{
				textViewAnswer8CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CA1X7.setText(Acronym14Answer8);
			}
			
			if(Acronym14Answer9.equals(checkuseranswerCA1X79)){
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CA1X7.setText(Acronym14Answer9);
			}else{
				textViewAnswer9CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CA1X7.setText(Acronym14Answer9);
			}
			
			if(Acronym14Answer10.equals(checkuseranswerCA1X710)){
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CA1X7.setText(Acronym14Answer10);
			}else{
				textViewAnswer10CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CA1X7.setText(Acronym14Answer10);
			}
			
			if(Acronym14Answer11.equals(checkuseranswerCA1X711)){
				textViewAnswer11CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CA1X7.setText(Acronym14Answer11);
			}else{
				textViewAnswer11CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CA1X7.setText(Acronym14Answer11);
			}
			
			if(Acronym14Answer12.equals(checkuseranswerCA1X712)){
				textViewAnswer12CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CA1X7.setText(Acronym14Answer12);
			}else{
				textViewAnswer12CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CA1X7.setText(Acronym14Answer12);
			}
			
			if(Acronym14Answer13.equals(checkuseranswerCA1X713)){
				textViewAnswer13CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CA1X7.setText(Acronym14Answer13);
			}else{
				textViewAnswer13CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CA1X7.setText(Acronym14Answer13);
			}
			
			if(Acronym14Answer14.equals(checkuseranswerCA1X714)){
				textViewAnswer14CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CA1X7.setText(Acronym14Answer14);
			}else{
				textViewAnswer14CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CA1X7.setText(Acronym14Answer14);
			}
			
			if(Acronym14Answer15.equals(checkuseranswerCA1X715)){
				textViewAnswer15CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CA1X7.setText(Acronym14Answer15);
			}else{
				textViewAnswer15CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CA1X7.setText(Acronym14Answer15);
			}
			
			if(Acronym14Answer16.equals(checkuseranswerCA1X716)){
				textViewAnswer16CA1X7.setTextColor(Color.parseColor("#006400"));
				textViewAnswer16CA1X7.setText(Acronym14Answer16);
			}else{
				textViewAnswer16CA1X7.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer16CA1X7.setText(Acronym14Answer16);
			}
			
				
		}
		
	}

	//////////////////////DONE///////////////////
	public void onClickGetAcronymCA1X7(View v)
	{
		
		TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);
		TextViewTitleAnswerCA1X7.setText(null);
		
		EditTextTestCA1X7 = (EditText) findViewById(R.id.EditTextTestCA1X7);
		EditTextTestCA1X7.setText(null);
		
		CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
		CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
		CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
		CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);		CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);		CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
		CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);		CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
		CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);		CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
		CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);		CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);
		
		CA1X7Answer1Letter1.setText(null);		CA1X7Answer1Letter2.setText(null);		CA1X7Answer1Letter3.setText(null);		CA1X7Answer1Letter4.setText(null);
		CA1X7Answer1Letter5.setText(null);		CA1X7Answer1Letter6.setText(null);		CA1X7Answer1Letter7.setText(null);		CA1X7Answer1Letter8.setText(null);
		CA1X7Answer1Letter9.setText(null);		CA1X7Answer1Letter10.setText(null);		CA1X7Answer1Letter11.setText(null);		CA1X7Answer1Letter12.setText(null);
		CA1X7Answer1Letter13.setText(null);		CA1X7Answer1Letter13.setText(null);		CA1X7Answer1Letter14.setText(null);		CA1X7Answer1Letter15.setText(null);
		CA1X7Answer1Letter16.setText(null);
		
		
		
		EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
		EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
		EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
		EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
		EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
		EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);		EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
		EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);		EditTextCA1X7Answer14 = (EditText)findViewById(R.id.EditTextCA1X7Answer14);
		EditTextCA1X7Answer15 = (EditText)findViewById(R.id.EditTextCA1X7Answer15);		EditTextCA1X7Answer16 = (EditText)findViewById(R.id.EditTextCA1X7Answer16);
		
		EditTextCA1X7Answer1.setText(null);		EditTextCA1X7Answer2.setText(null);		EditTextCA1X7Answer3.setText(null);		EditTextCA1X7Answer4.setText(null);
		EditTextCA1X7Answer5.setText(null);		EditTextCA1X7Answer6.setText(null);		EditTextCA1X7Answer7.setText(null);		EditTextCA1X7Answer8.setText(null);
		EditTextCA1X7Answer9.setText(null);		EditTextCA1X7Answer10.setText(null);		EditTextCA1X7Answer11.setText(null);		EditTextCA1X7Answer12.setText(null);
		EditTextCA1X7Answer13.setText(null);		EditTextCA1X7Answer14.setText(null);		EditTextCA1X7Answer15.setText(null);
		EditTextCA1X7Answer16.setText(null);
		
		textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
		textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
		textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
		textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
		textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
		textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
		textViewAnswer13CA1X7 = (TextView) findViewById(R.id.textViewAnswer13CA1X7);		textViewAnswer14CA1X7 = (TextView) findViewById(R.id.textViewAnswer14CA1X7);
		textViewAnswer15CA1X7 = (TextView) findViewById(R.id.textViewAnswer15CA1X7);		textViewAnswer16CA1X7 = (TextView) findViewById(R.id.textViewAnswer16CA1X7);
		
		textViewAnswer1CA1X7.setText(null);		textViewAnswer2CA1X7.setText(null);		textViewAnswer3CA1X7.setText(null);		textViewAnswer4CA1X7.setText(null);
		textViewAnswer5CA1X7.setText(null);		textViewAnswer6CA1X7.setText(null);		textViewAnswer7CA1X7.setText(null);		textViewAnswer8CA1X7.setText(null);
		textViewAnswer9CA1X7.setText(null);		textViewAnswer10CA1X7.setText(null);		textViewAnswer11CA1X7.setText(null);		textViewAnswer12CA1X7.setText(null);
		textViewAnswer13CA1X7.setText(null);		textViewAnswer14CA1X7.setText(null);		textViewAnswer15CA1X7.setText(null);		textViewAnswer16CA1X7.setText(null);
		
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(14)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);
		TextViewTitleAnswerCA1X7.setText(null);
		
		EditTextTestCA1X7 = (EditText) findViewById(R.id.EditTextTestCA1X7);
		EditTextTestCA1X7.setText(null);
		
		if(randomInt == 1){

			String Acronym1Acronym ="VARIABLE CRISPS CARD";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym1Acronym);

		}

		if(randomInt == 2){
			
			String Acronym2Acronym ="FENCED";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym2Acronym);
			
			

		}

		if(randomInt == 3){

			String Acronym3Acronym ="GAFFERS DIP";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym3Acronym);
			
			

		}

		if(randomInt == 4){

			String Acronym4Acronym ="DDC FPS REG";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym4Acronym);
			
			
		}

		if(randomInt == 5){

			String Acronym5Acronym ="SIR MAPEMAP";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym5Acronym);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Acronym ="TRAINERS";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym6Acronym);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Acronym ="DR DONEQ";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym7Acronym);
			
			
		}

		if(randomInt == 8){

			String Acronym8Acronym="MADCAPS IMBEDS";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym8Acronym);
			
			
		}

		if(randomInt == 9){

			String Acronym9Acronym ="CURSN";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym9Acronym);
			
			
			
		}

		if(randomInt == 10){

			String Acronym10Acronym ="HEAR HER";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym10Acronym);
			
			
		}

		if(randomInt == 11){

			String Acronym11Acronym ="METRIC COB";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym11Acronym);
			
			
		}

		if(randomInt == 12){

			String Acronym12Acronym ="DULP";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym12Acronym);
			
			
		}

		if(randomInt == 13){

			String Acronym13Acronym ="JLS RT";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym13Acronym);
			
			
		}

		if(randomInt == 14){

			String Acronym14Acronym ="POPS MACADAM DRIVE";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym14Acronym);
			
			
		}
		
	}

	///////////////////DONE////////////////////
	public void onClickTestYourselfAcronymCA1X7(View v)
	{
		
		if (randomInt==1)
		{
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
			CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);
			CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
			CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);
			CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);
			CA1X7Answer1Letter17 = (TextView) findViewById(R.id.CA1X7Answer1Letter17);
			CA1X7Answer1Letter18 = (TextView) findViewById(R.id.CA1X7Answer1Letter18);
			
			CA1X7Answer1Letter1.setText("V");
			CA1X7Answer1Letter2.setText("A");
			CA1X7Answer1Letter3.setText("R");
			CA1X7Answer1Letter4.setText("I");
			CA1X7Answer1Letter5.setText("A");
			CA1X7Answer1Letter6.setText("B");
			CA1X7Answer1Letter7.setText("L");
			CA1X7Answer1Letter8.setText("E");
			CA1X7Answer1Letter9.setText("C");
			CA1X7Answer1Letter10.setText("R");
			CA1X7Answer1Letter11.setText("I");
			CA1X7Answer1Letter12.setText("S");
			CA1X7Answer1Letter13.setText("P");
			CA1X7Answer1Letter14.setText("S");
			CA1X7Answer1Letter15.setText("C");
			CA1X7Answer1Letter16.setText("A");
			CA1X7Answer1Letter17.setText("R");
			CA1X7Answer1Letter18.setText("D");
			
			
			String Acronym="VARIABLE CRISPS CARD";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
		}

		if (randomInt==2)
		{	
					
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);		CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);		CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);

			CA1X7Answer1Letter1.setText("F");
			CA1X7Answer1Letter2.setText("E");
			CA1X7Answer1Letter3.setText("N");
			CA1X7Answer1Letter4.setText("C");
			CA1X7Answer1Letter5.setText("E");
			CA1X7Answer1Letter6.setText("D");
			
			
			String Acronym="FENCED";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			CA1X7Answer1Letter1.setText("G");
			CA1X7Answer1Letter2.setText("A");
			CA1X7Answer1Letter3.setText("F");
			CA1X7Answer1Letter4.setText("F");
			CA1X7Answer1Letter5.setText("E");
			CA1X7Answer1Letter6.setText("R");
			CA1X7Answer1Letter7.setText("S");
			CA1X7Answer1Letter8.setText("D");
			CA1X7Answer1Letter9.setText("I");
			CA1X7Answer1Letter10.setText("P");
			

			String Acronym="GAFFERS DIP";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);

			CA1X7Answer1Letter1.setText("D");
			CA1X7Answer1Letter2.setText("D");
			CA1X7Answer1Letter3.setText("C");
			CA1X7Answer1Letter4.setText("F");
			CA1X7Answer1Letter5.setText("P");
			CA1X7Answer1Letter6.setText("S");
			CA1X7Answer1Letter7.setText("R");
			CA1X7Answer1Letter8.setText("E");
			CA1X7Answer1Letter9.setText("G");
			
			String Acronym="DDC FPS REG";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);

			CA1X7Answer1Letter1.setText("S");
			CA1X7Answer1Letter2.setText("I");
			CA1X7Answer1Letter3.setText("R");
			CA1X7Answer1Letter4.setText("M");
			CA1X7Answer1Letter5.setText("A");
			CA1X7Answer1Letter6.setText("P");
			CA1X7Answer1Letter7.setText("E");
			CA1X7Answer1Letter8.setText("M");
			CA1X7Answer1Letter9.setText("A");
			CA1X7Answer1Letter10.setText("P");
			
			String Acronym="SIR MAPEMAP";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{	
					
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);		CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);		CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);	CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
			
			CA1X7Answer1Letter1.setText("T");
			CA1X7Answer1Letter2.setText("R");
			CA1X7Answer1Letter3.setText("A");
			CA1X7Answer1Letter4.setText("I");
			CA1X7Answer1Letter5.setText("N");
			CA1X7Answer1Letter6.setText("E");
			CA1X7Answer1Letter7.setText("R");
			CA1X7Answer1Letter8.setText("S");
		
			
			String Acronym="TRAINERS";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);
			CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);

			CA1X7Answer1Letter1.setText("D");
			CA1X7Answer1Letter2.setText("R");
			CA1X7Answer1Letter3.setText("D");
			CA1X7Answer1Letter4.setText("O");
			CA1X7Answer1Letter5.setText("N");
			CA1X7Answer1Letter6.setText("E");
			CA1X7Answer1Letter7.setText("Q");
			
			String Acronym="DR DONEQ";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==8){
			
				
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
			CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);
			CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
			CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);
			CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);

			CA1X7Answer1Letter1.setText("M");
			CA1X7Answer1Letter2.setText("A");
			CA1X7Answer1Letter3.setText("D");
			CA1X7Answer1Letter4.setText("C");
			CA1X7Answer1Letter5.setText("A");
			CA1X7Answer1Letter6.setText("P");
			CA1X7Answer1Letter7.setText("S");
			CA1X7Answer1Letter8.setText("I");
			CA1X7Answer1Letter9.setText("M");
			CA1X7Answer1Letter10.setText("B");
			CA1X7Answer1Letter11.setText("E");
			CA1X7Answer1Letter12.setText("D");
			CA1X7Answer1Letter13.setText("S");
			
			
			String Acronym="MADCAPS IMBEDS";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==9){
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		
			

			CA1X7Answer1Letter1.setText("C");
			CA1X7Answer1Letter2.setText("U");
			CA1X7Answer1Letter3.setText("R");
			CA1X7Answer1Letter4.setText("S");
			CA1X7Answer1Letter4.setText("N");
			
			String Acronym="CURSN";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);

			CA1X7Answer1Letter1.setText("H");
			CA1X7Answer1Letter2.setText("E");
			CA1X7Answer1Letter3.setText("A");
			CA1X7Answer1Letter4.setText("R");
			CA1X7Answer1Letter5.setText("H");
			CA1X7Answer1Letter6.setText("E");
			CA1X7Answer1Letter7.setText("R");
			
			
			String Acronym="HEAR HER";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==11){
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);

			CA1X7Answer1Letter1.setText("M");
			CA1X7Answer1Letter2.setText("E");
			CA1X7Answer1Letter3.setText("T");
			CA1X7Answer1Letter4.setText("R");
			CA1X7Answer1Letter5.setText("I");
			CA1X7Answer1Letter6.setText("C");
			CA1X7Answer1Letter7.setText("C");
			CA1X7Answer1Letter8.setText("O");
			CA1X7Answer1Letter9.setText("B");
			
			String Acronym="METRIC COB";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==12){
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);

			CA1X7Answer1Letter1.setText("D");
			CA1X7Answer1Letter2.setText("U");
			CA1X7Answer1Letter3.setText("L");
			CA1X7Answer1Letter4.setText("P");
			
			
			String Acronym="DULP";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==13){
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);
			CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);

			CA1X7Answer1Letter1.setText("J");
			CA1X7Answer1Letter2.setText("L");
			CA1X7Answer1Letter3.setText("S");
			CA1X7Answer1Letter4.setText("R");
			CA1X7Answer1Letter5.setText("T");
			
			String Acronym="JLS RT";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==14){
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
			CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);
			CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
			CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);
			CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);
			
			CA1X7Answer1Letter1.setText("P");
			CA1X7Answer1Letter2.setText("O");
			CA1X7Answer1Letter3.setText("P");
			CA1X7Answer1Letter4.setText("S");
			CA1X7Answer1Letter5.setText("M");
			CA1X7Answer1Letter6.setText("A");
			CA1X7Answer1Letter7.setText("C");
			CA1X7Answer1Letter8.setText("A");
			CA1X7Answer1Letter9.setText("D");
			CA1X7Answer1Letter10.setText("A");
			CA1X7Answer1Letter11.setText("M");
			CA1X7Answer1Letter12.setText("D");
			CA1X7Answer1Letter13.setText("R");
			CA1X7Answer1Letter14.setText("I");
			CA1X7Answer1Letter15.setText("V");
			CA1X7Answer1Letter16.setText("E");
			
			
			String Acronym="POPS MACADAM DRIVE";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==15){
			
			String Acronym8Answer1="Cooling-off period";
			String Acronym8Answer2="Regulation of selling practices - eg commission";
			String Acronym8Answer3="Impose price controls";
			String Acronym8Answer4="Educate consumers";
			String Acronym8Answer5="Disclosure";
			String Acronym8Answer6="Public available restriction of knowledge";
			String Acronym8Answer7="Insider-trading regulation";
			String Acronym8Answer8="Chinese walls";


			
			
			String Acronym14Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym14Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym14Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym14Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym14Answer5SubString = Acronym8Answer5.substring(0, 1);
			String Acronym14Answer6SubString = Acronym8Answer6.substring(0, 1);
			String Acronym14Answer7SubString = Acronym8Answer7.substring(0, 1);
			String Acronym14Answer8SubString = Acronym8Answer8.substring(0, 1);
			
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			
			
			CA1X7Answer1Letter1.setText(Acronym14Answer1SubString);
			CA1X7Answer1Letter2.setText(Acronym14Answer2SubString);
			CA1X7Answer1Letter3.setText(Acronym14Answer3SubString);
			CA1X7Answer1Letter4.setText(Acronym14Answer4SubString);
			CA1X7Answer1Letter5.setText(Acronym14Answer5SubString);
			CA1X7Answer1Letter6.setText(Acronym14Answer6SubString);
			CA1X7Answer1Letter7.setText(Acronym14Answer7SubString);
			CA1X7Answer1Letter8.setText(Acronym14Answer8SubString);
			
			String Acronym="CRIED PIC";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
	}
	
	/////////////////////DONE/////////////////
	public void onClickGetTitleCA1X7(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(14)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);
		TextViewTitleAnswerCA1X7.setText(null);
		
		EditTextTestCA1X7 = (EditText) findViewById(R.id.EditTextTestCA1X7);
		EditTextTestCA1X7.setText(null);
		
		CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
		CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
		CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
		CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);		CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);		CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
		CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);		CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
		CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);		CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
		CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);		CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);
		
		CA1X7Answer1Letter1.setText(null);		CA1X7Answer1Letter2.setText(null);		CA1X7Answer1Letter3.setText(null);
		CA1X7Answer1Letter4.setText(null);		CA1X7Answer1Letter5.setText(null);		CA1X7Answer1Letter6.setText(null);
		CA1X7Answer1Letter7.setText(null);		CA1X7Answer1Letter8.setText(null);		CA1X7Answer1Letter9.setText(null);
		CA1X7Answer1Letter10.setText(null);		CA1X7Answer1Letter11.setText(null);		CA1X7Answer1Letter12.setText(null);
		CA1X7Answer1Letter13.setText(null);		CA1X7Answer1Letter13.setText(null);		CA1X7Answer1Letter14.setText(null);
		CA1X7Answer1Letter15.setText(null);		CA1X7Answer1Letter16.setText(null);
		
		
		
		EditTextCA1X7Answer1 = (EditText)findViewById(R.id.EditTextCA1X7Answer1);		EditTextCA1X7Answer2 = (EditText)findViewById(R.id.EditTextCA1X7Answer2);
		EditTextCA1X7Answer3 = (EditText)findViewById(R.id.EditTextCA1X7Answer3);		EditTextCA1X7Answer4 = (EditText)findViewById(R.id.EditTextCA1X7Answer4);
		EditTextCA1X7Answer5 = (EditText)findViewById(R.id.EditTextCA1X7Answer5);		EditTextCA1X7Answer6 = (EditText)findViewById(R.id.EditTextCA1X7Answer6);
		EditTextCA1X7Answer7 = (EditText)findViewById(R.id.EditTextCA1X7Answer7);		EditTextCA1X7Answer8 = (EditText)findViewById(R.id.EditTextCA1X7Answer8);
		EditTextCA1X7Answer9 = (EditText)findViewById(R.id.EditTextCA1X7Answer9);		EditTextCA1X7Answer10 = (EditText)findViewById(R.id.EditTextCA1X7Answer10);
		EditTextCA1X7Answer11 = (EditText)findViewById(R.id.EditTextCA1X7Answer11);		EditTextCA1X7Answer12 = (EditText)findViewById(R.id.EditTextCA1X7Answer12);
		EditTextCA1X7Answer13 = (EditText)findViewById(R.id.EditTextCA1X7Answer13);		EditTextCA1X7Answer14 = (EditText)findViewById(R.id.EditTextCA1X7Answer14);
		EditTextCA1X7Answer15 = (EditText)findViewById(R.id.EditTextCA1X7Answer15);		EditTextCA1X7Answer16 = (EditText)findViewById(R.id.EditTextCA1X7Answer16);
		
		EditTextCA1X7Answer1.setText(null);		EditTextCA1X7Answer2.setText(null);		EditTextCA1X7Answer3.setText(null);
		EditTextCA1X7Answer4.setText(null);		EditTextCA1X7Answer5.setText(null);		EditTextCA1X7Answer6.setText(null);
		EditTextCA1X7Answer7.setText(null);		EditTextCA1X7Answer8.setText(null);		EditTextCA1X7Answer9.setText(null);
		EditTextCA1X7Answer10.setText(null);		EditTextCA1X7Answer11.setText(null);		EditTextCA1X7Answer12.setText(null);
		EditTextCA1X7Answer13.setText(null);		EditTextCA1X7Answer14.setText(null);		EditTextCA1X7Answer15.setText(null);
		EditTextCA1X7Answer16.setText(null);
		
		textViewAnswer1CA1X7 = (TextView) findViewById(R.id.textViewAnswer1CA1X7);		textViewAnswer2CA1X7= (TextView) findViewById(R.id.textViewAnswer2CA1X7);
		textViewAnswer3CA1X7 = (TextView) findViewById(R.id.textViewAnswer3CA1X7);		textViewAnswer4CA1X7 = (TextView) findViewById(R.id.textViewAnswer4CA1X7);
		textViewAnswer5CA1X7 = (TextView) findViewById(R.id.textViewAnswer5CA1X7);		textViewAnswer6CA1X7 = (TextView) findViewById(R.id.textViewAnswer6CA1X7);
		textViewAnswer7CA1X7 = (TextView) findViewById(R.id.textViewAnswer7CA1X7);		textViewAnswer8CA1X7 = (TextView) findViewById(R.id.textViewAnswer8CA1X7);
		textViewAnswer9CA1X7 = (TextView) findViewById(R.id.textViewAnswer9CA1X7);		textViewAnswer10CA1X7 = (TextView) findViewById(R.id.textViewAnswer10CA1X7);
		textViewAnswer11CA1X7 = (TextView) findViewById(R.id.textViewAnswer11CA1X7);		textViewAnswer12CA1X7 = (TextView) findViewById(R.id.textViewAnswer12CA1X7);
		textViewAnswer13CA1X7 = (TextView) findViewById(R.id.textViewAnswer13CA1X7);		textViewAnswer14CA1X7 = (TextView) findViewById(R.id.textViewAnswer14CA1X7);
		textViewAnswer15CA1X7 = (TextView) findViewById(R.id.textViewAnswer15CA1X7);		textViewAnswer16CA1X7 = (TextView) findViewById(R.id.textViewAnswer16CA1X7);
		
		textViewAnswer1CA1X7.setText(null);		textViewAnswer2CA1X7.setText(null);		textViewAnswer3CA1X7.setText(null);
		textViewAnswer4CA1X7.setText(null);		textViewAnswer5CA1X7.setText(null);		textViewAnswer6CA1X7.setText(null);
		textViewAnswer7CA1X7.setText(null);		textViewAnswer8CA1X7.setText(null);		textViewAnswer9CA1X7.setText(null);
		textViewAnswer10CA1X7.setText(null);		textViewAnswer11CA1X7.setText(null);		textViewAnswer12CA1X7.setText(null);
		textViewAnswer13CA1X7.setText(null);		textViewAnswer14CA1X7.setText(null);		textViewAnswer15CA1X7.setText(null);
		textViewAnswer16CA1X7.setText(null);
		
		
		if(randomInt == 1){

			String Acronym1Title = "Requirements of a good model";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym1Title);
			
			

		}

		if(randomInt == 2){
			
			String Acronym2Title = "Considerations in assessing different models";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym2Title);
			
			
		}

		if(randomInt == 3){

			String Acronym3Title = "Develop a deterministic cashflow model";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym3Title);
			
			

		}

		if(randomInt == 4){

			String Acronym4Title = "Developing a stochastic cashflow model";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym4Title);
			
			
		}

		if(randomInt == 5){

			String Acronym5Title = "Main uses of data";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym5Title);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Title = "Sources of data";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym6Title);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Title ="Problems with industry data";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym7Title);
			
			
		}

		if(randomInt == 8){

			String Acronym8Title = "Checks on data";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym8Title);
			
			
		}

		if(randomInt == 9){

			String Acronym9Title = "Key factors affecting choice of assumptions";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym9Title);
			
			
			
		}

		if(randomInt == 10){

			String Acronym10Title = "Problems with past data when setting assumptions";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym10Title);
			
			
		}

		if(randomInt == 11){

			String Acronym11Title = "Adjustments to premiums/contributions";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym11Title);
			
			
		}

		if(randomInt == 12){

			String Acronym12Title ="factors affecting the price of benefits";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym12Title);
			
			
		}

		if(randomInt == 13){

			String Acronym13Title = "Incidence (timing) of monies paid in (ie contributions)";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym13Title);
			
			
		}

		if(randomInt == 14){

			String Acronym14Title = "Factors of a model to assess profitability";
			
			textViewCA1X7 = (TextView) findViewById(R.id.PullTestStringCA1X7);//take in string
			textViewCA1X7.setText(Acronym14Title);
			
			
		}
		
		
	}

	
	//////////////////////////////DONE//////////////
	public void onClickTestYourselfTitleCA1X7(View v)
	{
		if (randomInt==1)
		{
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
			CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);
			CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
			CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);
			CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);
			CA1X7Answer1Letter17 = (TextView) findViewById(R.id.CA1X7Answer1Letter17);
			CA1X7Answer1Letter18 = (TextView) findViewById(R.id.CA1X7Answer1Letter18);
			
			CA1X7Answer1Letter1.setText("V");
			CA1X7Answer1Letter2.setText("A");
			CA1X7Answer1Letter3.setText("R");
			CA1X7Answer1Letter4.setText("I");
			CA1X7Answer1Letter5.setText("A");
			CA1X7Answer1Letter6.setText("B");
			CA1X7Answer1Letter7.setText("L");
			CA1X7Answer1Letter8.setText("E");
			CA1X7Answer1Letter9.setText("C");
			CA1X7Answer1Letter10.setText("R");
			CA1X7Answer1Letter11.setText("I");
			CA1X7Answer1Letter12.setText("S");
			CA1X7Answer1Letter13.setText("P");
			CA1X7Answer1Letter14.setText("S");
			CA1X7Answer1Letter15.setText("C");
			CA1X7Answer1Letter16.setText("A");
			CA1X7Answer1Letter17.setText("R");
			CA1X7Answer1Letter18.setText("D");
			
			String Acronym="Requirements of a good model";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
			
		}

		if (randomInt==2)
		{
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);		CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);		CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);

			CA1X7Answer1Letter1.setText("F");
			CA1X7Answer1Letter2.setText("E");
			CA1X7Answer1Letter3.setText("N");
			CA1X7Answer1Letter4.setText("C");
			CA1X7Answer1Letter5.setText("E");
			CA1X7Answer1Letter6.setText("D");
		

			
			String Acronym="Considerations in assessing different models";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);		CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);		CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);
			CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);

			CA1X7Answer1Letter1.setText("G");
			CA1X7Answer1Letter2.setText("A");
			CA1X7Answer1Letter3.setText("F");
			CA1X7Answer1Letter4.setText("F");
			CA1X7Answer1Letter5.setText("E");
			CA1X7Answer1Letter6.setText("R");
			CA1X7Answer1Letter7.setText("S");
			CA1X7Answer1Letter8.setText("D");
			CA1X7Answer1Letter9.setText("I");
			CA1X7Answer1Letter10.setText("P");
			

			String Acronym="Develop a deterministic cashflow model";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);

			CA1X7Answer1Letter1.setText("D");
			CA1X7Answer1Letter2.setText("D");
			CA1X7Answer1Letter3.setText("C");
			CA1X7Answer1Letter4.setText("F");
			CA1X7Answer1Letter5.setText("P");
			CA1X7Answer1Letter6.setText("S");
			CA1X7Answer1Letter7.setText("R");
			CA1X7Answer1Letter8.setText("E");
			CA1X7Answer1Letter9.setText("G");
			
			String Acronym="Developing a stochastic cashflow model";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);

			CA1X7Answer1Letter1.setText("S");
			CA1X7Answer1Letter2.setText("I");
			CA1X7Answer1Letter3.setText("R");
			CA1X7Answer1Letter4.setText("M");
			CA1X7Answer1Letter5.setText("A");
			CA1X7Answer1Letter6.setText("P");
			CA1X7Answer1Letter7.setText("E");
			CA1X7Answer1Letter8.setText("M");
			CA1X7Answer1Letter9.setText("A");
			CA1X7Answer1Letter10.setText("P");
			
			String Acronym="Main uses of data";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);		CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);		CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			
			CA1X7Answer1Letter1.setText("T");
			CA1X7Answer1Letter2.setText("R");
			CA1X7Answer1Letter3.setText("A");
			CA1X7Answer1Letter4.setText("I");
			CA1X7Answer1Letter5.setText("N");
			CA1X7Answer1Letter6.setText("E");
			CA1X7Answer1Letter7.setText("R");
			CA1X7Answer1Letter8.setText("S");
			
			
			String Acronym="Sources of data";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==7){
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);
			CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);

			CA1X7Answer1Letter1.setText("D");
			CA1X7Answer1Letter2.setText("R");
			CA1X7Answer1Letter3.setText("D");
			CA1X7Answer1Letter4.setText("O");
			CA1X7Answer1Letter5.setText("N");
			CA1X7Answer1Letter6.setText("E");
			CA1X7Answer1Letter7.setText("Q");
			
			String Acronym="Problems with industry data";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==8){
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
			CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);
			CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
			CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);
			CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);

			CA1X7Answer1Letter1.setText("M");
			CA1X7Answer1Letter2.setText("A");
			CA1X7Answer1Letter3.setText("D");
			CA1X7Answer1Letter4.setText("C");
			CA1X7Answer1Letter5.setText("A");
			CA1X7Answer1Letter6.setText("P");
			CA1X7Answer1Letter7.setText("S");
			CA1X7Answer1Letter8.setText("I");
			CA1X7Answer1Letter9.setText("M");
			CA1X7Answer1Letter10.setText("B");
			CA1X7Answer1Letter11.setText("E");
			CA1X7Answer1Letter12.setText("D");
			CA1X7Answer1Letter13.setText("S");
			
			
			String Acronym="Checks on data";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		
			

			CA1X7Answer1Letter1.setText("C");
			CA1X7Answer1Letter2.setText("U");
			CA1X7Answer1Letter3.setText("R");
			CA1X7Answer1Letter4.setText("S");
			CA1X7Answer1Letter5.setText("N");
			
			String Acronym="Key factors affecting choice of assumptions";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==10){
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);		CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);

			CA1X7Answer1Letter1.setText("H");
			CA1X7Answer1Letter2.setText("E");
			CA1X7Answer1Letter3.setText("A");	
			CA1X7Answer1Letter4.setText("R");
			CA1X7Answer1Letter5.setText("H");	
			CA1X7Answer1Letter6.setText("E");
			CA1X7Answer1Letter7.setText("R");
			
			
			String Acronym="Problems with past data when setting assumptions";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==11){
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);		CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);

			CA1X7Answer1Letter1.setText("M");
			CA1X7Answer1Letter2.setText("E");
			CA1X7Answer1Letter3.setText("T");	
			CA1X7Answer1Letter4.setText("R");
			CA1X7Answer1Letter5.setText("I");	
			CA1X7Answer1Letter6.setText("C");
			CA1X7Answer1Letter7.setText("C");
			CA1X7Answer1Letter8.setText("O");
			CA1X7Answer1Letter9.setText("D");
			
			String Acronym="Adjustments to premiums/contributions";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==12){
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);

			CA1X7Answer1Letter1.setText("D");
			CA1X7Answer1Letter2.setText("U");
			CA1X7Answer1Letter3.setText("L");
			CA1X7Answer1Letter4.setText("P");
			
			
			String Acronym="factors affecting the price of benefits";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==13){
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);
			CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);

			CA1X7Answer1Letter1.setText("J");
			CA1X7Answer1Letter2.setText("L");
			CA1X7Answer1Letter3.setText("S");
			CA1X7Answer1Letter4.setText("R");
			CA1X7Answer1Letter5.setText("T");
			
			String Acronym="Incidence (timing) of monies paid in (ie contributions)";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
		if (randomInt==14){
			
						
			CA1X7Answer1Letter1 = (TextView) findViewById(R.id.CA1X7Answer1Letter1);		CA1X7Answer1Letter2 = (TextView) findViewById(R.id.CA1X7Answer1Letter2);
			CA1X7Answer1Letter3 = (TextView) findViewById(R.id.CA1X7Answer1Letter3);		CA1X7Answer1Letter4 = (TextView) findViewById(R.id.CA1X7Answer1Letter4);
			CA1X7Answer1Letter5 = (TextView) findViewById(R.id.CA1X7Answer1Letter5);
			CA1X7Answer1Letter6 = (TextView) findViewById(R.id.CA1X7Answer1Letter6);
			CA1X7Answer1Letter7 = (TextView) findViewById(R.id.CA1X7Answer1Letter7);
			CA1X7Answer1Letter8 = (TextView) findViewById(R.id.CA1X7Answer1Letter8);
			CA1X7Answer1Letter9 = (TextView) findViewById(R.id.CA1X7Answer1Letter9);
			CA1X7Answer1Letter10 = (TextView) findViewById(R.id.CA1X7Answer1Letter10);
			CA1X7Answer1Letter11 = (TextView) findViewById(R.id.CA1X7Answer1Letter11);
			CA1X7Answer1Letter12 = (TextView) findViewById(R.id.CA1X7Answer1Letter12);
			CA1X7Answer1Letter13 = (TextView) findViewById(R.id.CA1X7Answer1Letter13);
			CA1X7Answer1Letter14 = (TextView) findViewById(R.id.CA1X7Answer1Letter14);
			CA1X7Answer1Letter15 = (TextView) findViewById(R.id.CA1X7Answer1Letter15);
			CA1X7Answer1Letter16 = (TextView) findViewById(R.id.CA1X7Answer1Letter16);
			
			CA1X7Answer1Letter1.setText("P");
			CA1X7Answer1Letter2.setText("O");
			CA1X7Answer1Letter3.setText("P");
			CA1X7Answer1Letter4.setText("S");
			CA1X7Answer1Letter5.setText("M");
			CA1X7Answer1Letter6.setText("A");
			CA1X7Answer1Letter7.setText("C");
			CA1X7Answer1Letter8.setText("A");
			CA1X7Answer1Letter9.setText("D");
			CA1X7Answer1Letter10.setText("A");
			CA1X7Answer1Letter11.setText("M");
			CA1X7Answer1Letter12.setText("D");
			CA1X7Answer1Letter13.setText("R");
			CA1X7Answer1Letter14.setText("I");
			CA1X7Answer1Letter15.setText("V");
			CA1X7Answer1Letter16.setText("E");
			
			String Acronym="Factors of a model to assess profitability";

			EditTextTestCA1X7 = (EditText)findViewById(R.id.EditTextTestCA1X7);
			useranswerCA1X7=EditTextTestCA1X7.getText().toString();
			TextViewTitleAnswerCA1X7 = (TextView) findViewById(R.id.TextViewTitleAnswerCA1X7);

			if(Acronym.equals(useranswerCA1X7)){
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}else{
				TextViewTitleAnswerCA1X7.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCA1X7.setText(Acronym);
			}

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x7, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x7,
					container, false);
			return rootView;
		}
	}

}
