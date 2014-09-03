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

public class CA1X3 extends ActionBarActivity {
	
	EditText EditTextTestCAX3;			TextView TextViewTitleAnswerCAX3;			TextView textViewCAX3;
	String useranswerCAX3;
	
	EditText EditTextCAX3Answer1;		EditText EditTextCAX3Answer2;		EditText EditTextCAX3Answer3;
	EditText EditTextCAX3Answer4;		EditText EditTextCAX3Answer5;		EditText EditTextCAX3Answer6;
	EditText EditTextCAX3Answer7;		EditText EditTextCAX3Answer8;		EditText EditTextCAX3Answer9;
	EditText EditTextCAX3Answer10;		EditText EditTextCAX3Answer11;		EditText EditTextCAX3Answer12;
	EditText EditTextCAX3Answer13;		EditText EditTextCAX3Answer14;		EditText EditTextCAX3Answer15;		EditText EditTextCAX3Answer16;
    
	
	TextView CAX3Answer1Letter1;		TextView CAX3Answer1Letter2;		TextView CAX3Answer1Letter3;
	TextView CAX3Answer1Letter4;		TextView CAX3Answer1Letter5;		TextView CAX3Answer1Letter6;
	TextView CAX3Answer1Letter7;		TextView CAX3Answer1Letter8;		TextView CAX3Answer1Letter9;
	TextView CAX3Answer1Letter10;		TextView CAX3Answer1Letter11;		TextView CAX3Answer1Letter12;
	TextView CAX3Answer1Letter13;		TextView CAX3Answer1Letter14;		TextView CAX3Answer1Letter15;		TextView CAX3Answer1Letter16;
    
	
	TextView textViewAnswer1CAX3;		TextView textViewAnswer2CAX3;		TextView textViewAnswer3CAX3;		TextView textViewAnswer4CAX3;
	TextView textViewAnswer5CAX3;		TextView textViewAnswer6CAX3;		TextView textViewAnswer7CAX3;		TextView textViewAnswer8CAX3;
	TextView textViewAnswer9CAX3;		TextView textViewAnswer10CAX3;		TextView textViewAnswer11CAX3;		TextView textViewAnswer12CAX3;
	TextView textViewAnswer13CAX3;		TextView textViewAnswer14CAX3;		TextView textViewAnswer15CAX3;		TextView textViewAnswer16CAX3;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x3);
		
		EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
		textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);
		TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);
		
		
		CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
		CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
		CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
		CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);		CAX3Answer1Letter8 = (TextView) findViewById(R.id.CAX3Answer1Letter8);
		CAX3Answer1Letter9 = (TextView) findViewById(R.id.CAX3Answer1Letter9);		CAX3Answer1Letter10 = (TextView) findViewById(R.id.CAX3Answer1Letter10);
		CAX3Answer1Letter11 = (TextView) findViewById(R.id.CAX3Answer1Letter11);		CAX3Answer1Letter12 = (TextView) findViewById(R.id.CAX3Answer1Letter12);
		CAX3Answer1Letter13 = (TextView) findViewById(R.id.CAX3Answer1Letter13);		CAX3Answer1Letter14 = (TextView) findViewById(R.id.CAX3Answer1Letter14);
		CAX3Answer1Letter15 = (TextView) findViewById(R.id.CAX3Answer1Letter15);		CAX3Answer1Letter16 = (TextView) findViewById(R.id.CAX3Answer1Letter16);
		
		
		EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
		EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
		EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);		EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
		EditTextCAX3Answer7 = (EditText)findViewById(R.id.EditTextCAX3Answer7);		EditTextCAX3Answer8 = (EditText)findViewById(R.id.EditTextCAX3Answer8);
		EditTextCAX3Answer9 = (EditText)findViewById(R.id.EditTextCAX3Answer9);		EditTextCAX3Answer10 = (EditText)findViewById(R.id.EditTextCAX3Answer10);
		EditTextCAX3Answer11 = (EditText)findViewById(R.id.EditTextCAX3Answer11);		EditTextCAX3Answer12 = (EditText)findViewById(R.id.EditTextCAX3Answer12);
		EditTextCAX3Answer13 = (EditText)findViewById(R.id.EditTextCAX3Answer13);		EditTextCAX3Answer14 = (EditText)findViewById(R.id.EditTextCAX3Answer14);
		EditTextCAX3Answer15 = (EditText)findViewById(R.id.EditTextCAX3Answer15);		EditTextCAX3Answer16 = (EditText)findViewById(R.id.EditTextCAX3Answer16);
		
		
		textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
		textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
		textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);		textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
		textViewAnswer7CAX3 = (TextView) findViewById(R.id.textViewAnswer7CAX3);		textViewAnswer8CAX3 = (TextView) findViewById(R.id.textViewAnswer8CAX3);
		textViewAnswer9CAX3 = (TextView) findViewById(R.id.textViewAnswer9CAX3);		textViewAnswer10CAX3 = (TextView) findViewById(R.id.textViewAnswer10CAX3);
		textViewAnswer11CAX3 = (TextView) findViewById(R.id.textViewAnswer11CAX3);		textViewAnswer12CAX3 = (TextView) findViewById(R.id.textViewAnswer12CAX3);
		textViewAnswer13CAX3 = (TextView) findViewById(R.id.textViewAnswer13CAX3);		textViewAnswer14CAX3 = (TextView) findViewById(R.id.textViewAnswer14CAX3);
		textViewAnswer15CAX3 = (TextView) findViewById(R.id.textViewAnswer15CAX3);		textViewAnswer16CAX3 = (TextView) findViewById(R.id.textViewAnswer16CAX3);
		


		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	
	///////////////done///////////
	public void onClickCAX3TestAnswers(View v)
	{
		if (randomInt==1)
		{
				
			
			String Acronym1Answer1="Synergies with other projects";
			String Acronym1Answer2="Political constraints";
			String Acronym1Answer3="Upside potential";
			String Acronym1Answer4="Results financial";
			String Acronym1Answer5="Scarce resources"; 
			
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();	String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();	String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym1Answer1);
			}
			
			if(Acronym1Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym1Answer2);
			}
			
			if(Acronym1Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym1Answer3);
			}
			
			if(Acronym1Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym1Answer4);
			}
			
			if(Acronym1Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym1Answer5);
			}
		}
		if(randomInt==2){
			
			
			String Acronym2Answer1="Planning (full)";
			String Acronym2Answer2="Risk analysis (thorough)";
			String Acronym2Answer3="Objectives (clear and reflect customer needs)";
			String Acronym2Answer4="Judge (monitor) development";
			String Acronym2Answer5="Excellent communications between those involved";
			String Acronym2Answer6="Conflict management is positive";
			String Acronym2Answer7="Thorough testing at all stages";
			String Acronym2Answer8="Critical path analysis";
			String Acronym2Answer9="Relationship with external suppliers stable";
			String Acronym3Answer10="Appropriate pace";
			String Acronym3Answer11="Milestone review schedule";
			String Acronym3Answer12="Performance and quality standards (set/measured)";
			String Acronym3Answer13="Supportive environment";
			
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);		EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
			EditTextCAX3Answer7 = (EditText)findViewById(R.id.EditTextCAX3Answer7);		EditTextCAX3Answer8 = (EditText)findViewById(R.id.EditTextCAX3Answer8);
			EditTextCAX3Answer9 = (EditText)findViewById(R.id.EditTextCAX3Answer9);		EditTextCAX3Answer10 = (EditText)findViewById(R.id.EditTextCAX3Answer10);
			EditTextCAX3Answer11 = (EditText)findViewById(R.id.EditTextCAX3Answer11);		EditTextCAX3Answer12 = (EditText)findViewById(R.id.EditTextCAX3Answer12);
			EditTextCAX3Answer13 = (EditText)findViewById(R.id.EditTextCAX3Answer13);		EditTextCAX3Answer13 = (EditText)findViewById(R.id.EditTextCAX3Answer13);
			
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);		textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
			textViewAnswer7CAX3 = (TextView) findViewById(R.id.textViewAnswer7CAX3);		textViewAnswer8CAX3 = (TextView) findViewById(R.id.textViewAnswer8CAX3);
			textViewAnswer9CAX3 = (TextView) findViewById(R.id.textViewAnswer9CAX3);		textViewAnswer10CAX3 = (TextView) findViewById(R.id.textViewAnswer10CAX3);
			textViewAnswer11CAX3 = (TextView) findViewById(R.id.textViewAnswer11CAX3);		textViewAnswer12CAX3 = (TextView) findViewById(R.id.textViewAnswer12CAX3);
			textViewAnswer13CAX3 = (TextView) findViewById(R.id.textViewAnswer13CAX3);
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();		String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();		String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();		String checkuseranswerCAX36=EditTextCAX3Answer6.getText().toString();
			String checkuseranswerCAX37=EditTextCAX3Answer7.getText().toString();		String checkuseranswerCAX38=EditTextCAX3Answer8.getText().toString();
			String checkuseranswerCAX39=EditTextCAX3Answer9.getText().toString();		String checkuseranswerCAX310=EditTextCAX3Answer10.getText().toString();
			String checkuseranswerCAX311=EditTextCAX3Answer11.getText().toString();		String checkuseranswerCAX312=EditTextCAX3Answer12.getText().toString();
			String checkuseranswerCAX313=EditTextCAX3Answer13.getText().toString();
			
			if(Acronym2Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym2Answer1);
			}
			
			if(Acronym2Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym2Answer2);
			}
			
			if(Acronym2Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym2Answer3);
			}
			
			if(Acronym2Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym2Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym2Answer4);
			}
			
			if(Acronym2Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym2Answer5);
			}
			
			if(Acronym2Answer6.equals(checkuseranswerCAX36)){
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX3.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX3.setText(Acronym2Answer6);
			}
			
			if(Acronym2Answer7.equals(checkuseranswerCAX37)){
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX3.setText(Acronym2Answer7);
			}else{
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX3.setText(Acronym2Answer7);
			}
			
			if(Acronym2Answer8.equals(checkuseranswerCAX38)){
				textViewAnswer8CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX3.setText(Acronym2Answer8);
			}else{
				textViewAnswer8CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX3.setText(Acronym2Answer8);
			}
			
			if(Acronym2Answer9.equals(checkuseranswerCAX39)){
				textViewAnswer9CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX3.setText(Acronym2Answer9);
			}else{
				textViewAnswer9CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX3.setText(Acronym2Answer9);
			}
			
			if(Acronym3Answer10.equals(checkuseranswerCAX310)){
				textViewAnswer10CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX3.setText(Acronym3Answer10);
			}else{
				textViewAnswer10CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX3.setText(Acronym3Answer10);
			}
			
			if(Acronym3Answer11.equals(checkuseranswerCAX311)){
				textViewAnswer11CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CAX3.setText(Acronym3Answer11);
			}else{
				textViewAnswer11CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX3.setText(Acronym3Answer11);
			}
			
			if(Acronym3Answer12.equals(checkuseranswerCAX312)){
				textViewAnswer12CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CAX3.setText(Acronym3Answer12);
			}else{
				textViewAnswer12CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX3.setText(Acronym3Answer12);
			}
			
			if(Acronym3Answer13.equals(checkuseranswerCAX313)){
				textViewAnswer13CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CAX3.setText(Acronym3Answer13);
			}else{
				textViewAnswer13CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX3.setText(Acronym3Answer13);
			}
		
			
		}
		if(randomInt==3){
			
			String Acronym3Answer1="Financing policy";
			String Acronym3Answer2="Legal issues";
			String Acronym3Answer3="Objectives";
			String Acronym3Answer4="Work to be completed";
			String Acronym3Answer5="Communications policy";
			String Acronym3Answer6="How objectives are to be met";
			String Acronym3Answer7="Acceptable quality standards";
			String Acronym3Answer8="Risk management policy";
			String Acronym3Answer9="Technical policy";
			String Acronym3Answer10="Insurance/reinsurance needs";
			String Acronym3Answer11="Third party roles";
			String Acronym3Answer12="Expected costs";
			String Acronym3Answer13="Milestones";
			String Acronym3Answer14="Information technology policy";
			String Acronym3Answer15="Sponsor of project role";
			String Acronym3Answer16="Economic and financial objectives";
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);		EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
			EditTextCAX3Answer7 = (EditText)findViewById(R.id.EditTextCAX3Answer7);		EditTextCAX3Answer8 = (EditText)findViewById(R.id.EditTextCAX3Answer8);
			EditTextCAX3Answer9 = (EditText)findViewById(R.id.EditTextCAX3Answer9);		EditTextCAX3Answer10 = (EditText)findViewById(R.id.EditTextCAX3Answer10);
			EditTextCAX3Answer11 = (EditText)findViewById(R.id.EditTextCAX3Answer11);		EditTextCAX3Answer12 = (EditText)findViewById(R.id.EditTextCAX3Answer12);
			EditTextCAX3Answer13 = (EditText)findViewById(R.id.EditTextCAX3Answer13);		EditTextCAX3Answer13 = (EditText)findViewById(R.id.EditTextCAX3Answer13);
			EditTextCAX3Answer14 = (EditText)findViewById(R.id.EditTextCAX3Answer14);
			EditTextCAX3Answer15 = (EditText)findViewById(R.id.EditTextCAX3Answer15);
			EditTextCAX3Answer16 = (EditText)findViewById(R.id.EditTextCAX3Answer16);
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);		textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
			textViewAnswer7CAX3 = (TextView) findViewById(R.id.textViewAnswer7CAX3);		textViewAnswer8CAX3 = (TextView) findViewById(R.id.textViewAnswer8CAX3);
			textViewAnswer9CAX3 = (TextView) findViewById(R.id.textViewAnswer9CAX3);		textViewAnswer10CAX3 = (TextView) findViewById(R.id.textViewAnswer10CAX3);
			textViewAnswer11CAX3 = (TextView) findViewById(R.id.textViewAnswer11CAX3);		textViewAnswer12CAX3 = (TextView) findViewById(R.id.textViewAnswer12CAX3);
			textViewAnswer13CAX3 = (TextView) findViewById(R.id.textViewAnswer13CAX3);		textViewAnswer14CAX3 = (TextView) findViewById(R.id.textViewAnswer14CAX3);
			textViewAnswer15CAX3 = (TextView) findViewById(R.id.textViewAnswer15CAX3);		textViewAnswer16CAX3 = (TextView) findViewById(R.id.textViewAnswer16CAX3);
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();		String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();		String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();		String checkuseranswerCAX36=EditTextCAX3Answer6.getText().toString();
			String checkuseranswerCAX37=EditTextCAX3Answer7.getText().toString();		String checkuseranswerCAX38=EditTextCAX3Answer8.getText().toString();
			String checkuseranswerCAX39=EditTextCAX3Answer9.getText().toString();		String checkuseranswerCAX310=EditTextCAX3Answer10.getText().toString();
			String checkuseranswerCAX311=EditTextCAX3Answer11.getText().toString();		String checkuseranswerCAX312=EditTextCAX3Answer12.getText().toString();
			String checkuseranswerCAX313=EditTextCAX3Answer13.getText().toString();		String checkuseranswerCAX314=EditTextCAX3Answer14.getText().toString();
			String checkuseranswerCAX315=EditTextCAX3Answer15.getText().toString();		String checkuseranswerCAX316=EditTextCAX3Answer16.getText().toString();
			
			if(Acronym3Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym3Answer1);
			}
			
			if(Acronym3Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym3Answer2);
			}
			
			if(Acronym3Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym3Answer3);
			}
			
			if(Acronym3Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym3Answer4);
			}
			
			if(Acronym3Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym3Answer5);
			}
			
			if(Acronym3Answer6.equals(checkuseranswerCAX36)){
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX3.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX3.setText(Acronym3Answer6);
			}
			
			if(Acronym3Answer7.equals(checkuseranswerCAX37)){
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX3.setText(Acronym3Answer7);
			}else{
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX3.setText(Acronym3Answer7);
			}
			
			if(Acronym3Answer8.equals(checkuseranswerCAX38)){
				textViewAnswer8CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX3.setText(Acronym3Answer8);
			}else{
				textViewAnswer8CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX3.setText(Acronym3Answer8);
			}
			
			if(Acronym3Answer9.equals(checkuseranswerCAX39)){
				textViewAnswer9CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX3.setText(Acronym3Answer9);
			}else{
				textViewAnswer9CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX3.setText(Acronym3Answer9);
			}
			
			if(Acronym3Answer10.equals(checkuseranswerCAX310)){
				textViewAnswer10CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX3.setText(Acronym3Answer10);
			}else{
				textViewAnswer10CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX3.setText(Acronym3Answer10);
			}
			
			if(Acronym3Answer11.equals(checkuseranswerCAX311)){
				textViewAnswer11CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CAX3.setText(Acronym3Answer11);
			}else{
				textViewAnswer11CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX3.setText(Acronym3Answer11);
			}
			
			if(Acronym3Answer12.equals(checkuseranswerCAX312)){
				textViewAnswer12CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CAX3.setText(Acronym3Answer12);
			}else{
				textViewAnswer12CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX3.setText(Acronym3Answer12);
			}
			
			if(Acronym3Answer13.equals(checkuseranswerCAX313)){
				textViewAnswer13CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CAX3.setText(Acronym3Answer13);
			}else{
				textViewAnswer13CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX3.setText(Acronym3Answer13);
			}
			
			if(Acronym3Answer14.equals(checkuseranswerCAX314)){
				textViewAnswer14CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CAX3.setText(Acronym3Answer14);
			}else{
				textViewAnswer14CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CAX3.setText(Acronym3Answer14);
			}
			
			if(Acronym3Answer15.equals(checkuseranswerCAX315)){
				textViewAnswer15CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CAX3.setText(Acronym3Answer15);
			}else{
				textViewAnswer15CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CAX3.setText(Acronym3Answer15);
			}
			
			if(Acronym3Answer16.equals(checkuseranswerCAX316)){
				textViewAnswer16CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer16CAX3.setText(Acronym3Answer16);
			}else{
				textViewAnswer16CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer16CAX3.setText(Acronym3Answer16);
			}
			
		}
		if(randomInt==4){
			
			String Acronym4Answer1="Political risks eg polictical developments, oppostion from third parties, disagreements amongst sponsors";
			String Acronym4Answer2="Natural risks eg storm,earthquake, volcanic eruption";
			String Acronym4Answer3="Economic risks eg interest rate or currency movements";
			String Acronym4Answer4="Financial risks eg incorrect cashflow estimates - costs and revenues, problems obtaining finances, refinancing issues, hidden assumotions";
			String Acronym4Answer5="Crime risks - eg fraud";
			String Acronym4Answer6="Project risks eg insufficiently defined objectives, poor design, over-time or over-budget";
			String Acronym4Answer7="Business risks eg competition, loss of key personnel, safety hazards, deterioration, obsolescence, insolvency of a contractor, decommissioning";
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);
			EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
			EditTextCAX3Answer7 = (EditText)findViewById(R.id.EditTextCAX3Answer7);
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);
			textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
			textViewAnswer7CAX3 = (TextView) findViewById(R.id.textViewAnswer7CAX3);
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();	String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();	String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();
			String checkuseranswerCAX36=EditTextCAX3Answer6.getText().toString();
			String checkuseranswerCAX37=EditTextCAX3Answer7.getText().toString();
			
			if(Acronym4Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym4Answer1);
			}
			
			if(Acronym4Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym4Answer2);
			}
			
			if(Acronym4Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym4Answer3);
			}
			
			if(Acronym4Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym4Answer4);
			}
			
			if(Acronym4Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym4Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym4Answer5);
			}
			
			if(Acronym4Answer6.equals(checkuseranswerCAX36)){
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX3.setText(Acronym4Answer6);
			}else{
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX3.setText(Acronym4Answer6);
			}
			
			if(Acronym4Answer7.equals(checkuseranswerCAX37)){
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX3.setText(Acronym4Answer7);
			}else{
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX3.setText(Acronym4Answer7);
			}
			
			
		}
		if(randomInt==5){
			
			String Acronym5Answer1="Financial info (eg ENPV, distribution of NPVs)";
			String Acronym5Answer2="Identification and analysis of key residual risks";
			String Acronym5Answer3="Recommendation";
			String Acronym5Answer4="Mitigation strategy (best)";
			String Acronym5Answer5="Proposed method of financing the project";
			String Acronym5Answer6="Effect on investors";
			String Acronym5Answer7="Non-monetary issues (eg synergies, polictical)";
			
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);
			EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
			EditTextCAX3Answer7 = (EditText)findViewById(R.id.EditTextCAX3Answer7);
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);		textViewAnswer6CAX3= (TextView) findViewById(R.id.textViewAnswer6CAX3);
			textViewAnswer7CAX3 = (TextView) findViewById(R.id.textViewAnswer7CAX3);		textViewAnswer8CAX3 = (TextView) findViewById(R.id.textViewAnswer8CAX3);
			
			
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();	String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();	String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();	String checkuseranswerCAX36=EditTextCAX3Answer6.getText().toString();
			String checkuseranswerCAX37=EditTextCAX3Answer7.getText().toString();
			
			if(Acronym5Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym5Answer1);
			}
			
			if(Acronym5Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym5Answer2);
			}
			
			if(Acronym5Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym5Answer3);
			}
			
			if(Acronym5Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym5Answer4);
			}
			
			if(Acronym5Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym5Answer5);
			}
			
			if(Acronym5Answer6.equals(checkuseranswerCAX36)){
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX3.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX3.setText(Acronym5Answer6);
			}
			
			if(Acronym5Answer7.equals(checkuseranswerCAX37)){
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX3.setText(Acronym5Answer7);
			}else{
				textViewAnswer7CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX3.setText(Acronym5Answer7);
			}
			
						

			
		}
		if(randomInt==6){
			
			String Acronym6Answer1="Desktop analysis";
			String Acronym6Answer2="Risk analysis at a high level";
			String Acronym6Answer3="Risk register";
			String Acronym6Answer4="Upside";
			String Acronym6Answer5="Brainstorming";
			
			
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);
			
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();	String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();	String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();
			
			if(Acronym6Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym6Answer1);
			}
			
			if(Acronym6Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym6Answer2);
			}
			
			if(Acronym6Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym6Answer3);
			}
			
			if(Acronym6Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym6Answer4);
			}
			
			if(Acronym6Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym6Answer5);
			}
			
			
			

			
		}
		if(randomInt==7){
			
			String Acronym7Answer1="Further research";
			String Acronym7Answer2="Avoid";
			String Acronym7Answer3="Transfer";
			String Acronym7Answer4="Share";
			String Acronym7Answer5="Insure";
			String Acronym7Answer6="Reduce";
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);
			EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);
			EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3 = (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);
			textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);
			textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();	String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();
			String checkuseranswerCAX34=EditTextCAX3Answer3.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer3.getText().toString();
			String checkuseranswerCAX36=EditTextCAX3Answer3.getText().toString();
			
			if(Acronym7Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym7Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym7Answer1);
			}
			
			if(Acronym7Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym7Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym7Answer2);
			}
			
			if(Acronym7Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym7Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym7Answer3);
			}
			
			if(Acronym7Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym7Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym7Answer4);
			}
			
			if(Acronym7Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym7Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym7Answer5);
			}
			
			if(Acronym7Answer6.equals(checkuseranswerCAX36)){
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX3.setText(Acronym7Answer6);
			}else{
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX3.setText(Acronym7Answer6);
			}
			
			

			
		}
		if(randomInt==8){
			
			
			String Acronym8Answer1="Overall impact on distribution of NPVs";
			String Acronym8Answer2="Feasibility and costs";
			String Acronym8Answer3="Further mitigation to repsond to secondary risks";
			String Acronym8Answer4="Effect on frequency, severity, correlation";
			String Acronym8Answer5="Resulting secondary risks";
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();		String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();		String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();	
			
			if(Acronym8Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym8Answer5);
			}
			
			
			

			
		}
		if(randomInt==9){	
			
			
			String Acronym9Answer1="Last minute considerations";
			String Acronym9Answer2="Allowance for bias";
			String Acronym9Answer3="Knowledge not in the possession of those who prepared the submission";
			String Acronym9Answer4="Doubts over feasibility";
			String Acronym9Answer5="Hunch";
			String Acronym9Answer6="Overall credibility";
			
			EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
			EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
			EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);		EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
			
			
			
			textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
			textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
			textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);		textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
			
			
			String checkuseranswerCAX31=EditTextCAX3Answer1.getText().toString();	String checkuseranswerCAX32=EditTextCAX3Answer2.getText().toString();
			String checkuseranswerCAX33=EditTextCAX3Answer3.getText().toString();	String checkuseranswerCAX34=EditTextCAX3Answer4.getText().toString();
			String checkuseranswerCAX35=EditTextCAX3Answer5.getText().toString();	String checkuseranswerCAX36=EditTextCAX3Answer6.getText().toString();
			
			
			if(Acronym9Answer1.equals(checkuseranswerCAX31)){
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX3.setText(Acronym9Answer1);
			}else{
				textViewAnswer1CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX3.setText(Acronym9Answer1);
			}
			
			if(Acronym9Answer2.equals(checkuseranswerCAX32)){
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX3.setText(Acronym9Answer2);
			}else{
				textViewAnswer2CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX3.setText(Acronym9Answer2);
			}
			
			if(Acronym9Answer3.equals(checkuseranswerCAX33)){
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX3.setText(Acronym9Answer3);
			}else{
				textViewAnswer3CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX3.setText(Acronym9Answer3);
			}
			
			if(Acronym9Answer4.equals(checkuseranswerCAX34)){
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX3.setText(Acronym9Answer4);
			}else{
				textViewAnswer4CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX3.setText(Acronym9Answer4);
			}
			
			if(Acronym9Answer5.equals(checkuseranswerCAX35)){
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX3.setText(Acronym9Answer5);
			}else{
				textViewAnswer5CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX3.setText(Acronym9Answer5);
			}
			
			if(Acronym9Answer6.equals(checkuseranswerCAX36)){
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX3.setText(Acronym9Answer6);
			}else{
				textViewAnswer6CAX3.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX3.setText(Acronym9Answer6);
			}
			
			
			
			
		}
		

			
		

		
	}

	////////////////done///////////
	public void onClickGetAcronymCAX3(View v)
	{
		
		TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);
		TextViewTitleAnswerCAX3.setText(null);
		
		EditTextTestCAX3 = (EditText) findViewById(R.id.EditTextTestCAX3);
		EditTextTestCAX3.setText(null);
		
		CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
		CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
		CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
		CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);		CAX3Answer1Letter8 = (TextView) findViewById(R.id.CAX3Answer1Letter8);
		CAX3Answer1Letter9 = (TextView) findViewById(R.id.CAX3Answer1Letter9);		CAX3Answer1Letter10 = (TextView) findViewById(R.id.CAX3Answer1Letter10);
		CAX3Answer1Letter11 = (TextView) findViewById(R.id.CAX3Answer1Letter11);		CAX3Answer1Letter12 = (TextView) findViewById(R.id.CAX3Answer1Letter12);
		CAX3Answer1Letter13 = (TextView) findViewById(R.id.CAX3Answer1Letter13);		CAX3Answer1Letter14 = (TextView) findViewById(R.id.CAX3Answer1Letter14);
		CAX3Answer1Letter15 = (TextView) findViewById(R.id.CAX3Answer1Letter15);		CAX3Answer1Letter16 = (TextView) findViewById(R.id.CAX3Answer1Letter16);
		
		CAX3Answer1Letter1.setText(null);		CAX3Answer1Letter2.setText(null);		CAX3Answer1Letter3.setText(null);		CAX3Answer1Letter4.setText(null);
		CAX3Answer1Letter5.setText(null);		CAX3Answer1Letter6.setText(null);		CAX3Answer1Letter7.setText(null);		CAX3Answer1Letter8.setText(null);
		CAX3Answer1Letter9.setText(null);		CAX3Answer1Letter10.setText(null);		CAX3Answer1Letter11.setText(null);		CAX3Answer1Letter12.setText(null);
		CAX3Answer1Letter13.setText(null);		CAX3Answer1Letter13.setText(null);		CAX3Answer1Letter14.setText(null);		CAX3Answer1Letter15.setText(null);
		CAX3Answer1Letter16.setText(null);
		
		
		
		EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
		EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
		EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);		EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
		EditTextCAX3Answer7 = (EditText)findViewById(R.id.EditTextCAX3Answer7);		EditTextCAX3Answer8 = (EditText)findViewById(R.id.EditTextCAX3Answer8);
		EditTextCAX3Answer9 = (EditText)findViewById(R.id.EditTextCAX3Answer9);		EditTextCAX3Answer10 = (EditText)findViewById(R.id.EditTextCAX3Answer10);
		EditTextCAX3Answer11 = (EditText)findViewById(R.id.EditTextCAX3Answer11);		EditTextCAX3Answer12 = (EditText)findViewById(R.id.EditTextCAX3Answer12);
		EditTextCAX3Answer13 = (EditText)findViewById(R.id.EditTextCAX3Answer13);		EditTextCAX3Answer14 = (EditText)findViewById(R.id.EditTextCAX3Answer14);
		EditTextCAX3Answer15 = (EditText)findViewById(R.id.EditTextCAX3Answer15);		EditTextCAX3Answer16 = (EditText)findViewById(R.id.EditTextCAX3Answer16);
		
		EditTextCAX3Answer1.setText(null);		EditTextCAX3Answer2.setText(null);		EditTextCAX3Answer3.setText(null);		EditTextCAX3Answer4.setText(null);
		EditTextCAX3Answer5.setText(null);		EditTextCAX3Answer6.setText(null);		EditTextCAX3Answer7.setText(null);		EditTextCAX3Answer8.setText(null);
		EditTextCAX3Answer9.setText(null);		EditTextCAX3Answer10.setText(null);		EditTextCAX3Answer11.setText(null);		EditTextCAX3Answer12.setText(null);
		EditTextCAX3Answer13.setText(null);		EditTextCAX3Answer14.setText(null);		EditTextCAX3Answer15.setText(null);
		EditTextCAX3Answer16.setText(null);
		
		textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
		textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
		textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);		textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
		textViewAnswer7CAX3 = (TextView) findViewById(R.id.textViewAnswer7CAX3);		textViewAnswer8CAX3 = (TextView) findViewById(R.id.textViewAnswer8CAX3);
		textViewAnswer9CAX3 = (TextView) findViewById(R.id.textViewAnswer9CAX3);		textViewAnswer10CAX3 = (TextView) findViewById(R.id.textViewAnswer10CAX3);
		textViewAnswer11CAX3 = (TextView) findViewById(R.id.textViewAnswer11CAX3);		textViewAnswer12CAX3 = (TextView) findViewById(R.id.textViewAnswer12CAX3);
		textViewAnswer13CAX3 = (TextView) findViewById(R.id.textViewAnswer13CAX3);		textViewAnswer14CAX3 = (TextView) findViewById(R.id.textViewAnswer14CAX3);
		textViewAnswer15CAX3 = (TextView) findViewById(R.id.textViewAnswer15CAX3);		textViewAnswer16CAX3 = (TextView) findViewById(R.id.textViewAnswer16CAX3);
		
		textViewAnswer1CAX3.setText(null);		textViewAnswer2CAX3.setText(null);		textViewAnswer3CAX3.setText(null);		textViewAnswer4CAX3.setText(null);
		textViewAnswer5CAX3.setText(null);		textViewAnswer6CAX3.setText(null);		textViewAnswer7CAX3.setText(null);		textViewAnswer8CAX3.setText(null);
		textViewAnswer9CAX3.setText(null);		textViewAnswer10CAX3.setText(null);		textViewAnswer11CAX3.setText(null);		textViewAnswer12CAX3.setText(null);
		textViewAnswer13CAX3.setText(null);		textViewAnswer14CAX3.setText(null);		textViewAnswer15CAX3.setText(null);		textViewAnswer16CAX3.setText(null);
		
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(9)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);
		TextViewTitleAnswerCAX3.setText("");
		
		EditTextTestCAX3 = (EditText) findViewById(R.id.EditTextTestCAX3);
		EditTextTestCAX3.setText("");
		
		if(randomInt == 1){

			String Acronym1Acronym ="SPURS";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym1Acronym);

		}

		if(randomInt == 2){
			
			String Acronym2Acronym ="PROJECT CRAMPS";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym2Acronym);
			
			

		}

		if(randomInt == 3){

			String Acronym3Acronym ="FLOWCHART ITEMISE";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym3Acronym);
			
			

		}

		if(randomInt == 4){

			String Acronym4Acronym ="PNEFCPB";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym4Acronym);
			
			
		}

		if(randomInt == 5){

			String Acronym5Acronym ="FIRM PEN";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym5Acronym);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Acronym ="DR RUB";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym6Acronym);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Acronym ="FAT SIR";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym7Acronym);
			
			
		}

		if(randomInt == 8){

			String Acronym8Acronym="OFFER";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym8Acronym);
			
			
		}

		if(randomInt == 9){

			String Acronym9Acronym ="LAND HO";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym9Acronym);
				
		}

	}

	////////////////DONE///////////
	public void onClickTestYourselfAcronymCAX3(View v)
	{
		
		if (randomInt==1)
		{
			
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			
			CAX3Answer1Letter1.setText("S");
			CAX3Answer1Letter2.setText("P");
			CAX3Answer1Letter3.setText("U");
			CAX3Answer1Letter4.setText("R");
			CAX3Answer1Letter5.setText("S");
			
			String Acronym="SPURS";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);		CAX3Answer1Letter8 = (TextView) findViewById(R.id.CAX3Answer1Letter8);
			CAX3Answer1Letter9 = (TextView) findViewById(R.id.CAX3Answer1Letter9);		CAX3Answer1Letter10 = (TextView) findViewById(R.id.CAX3Answer1Letter10);
			CAX3Answer1Letter11 = (TextView) findViewById(R.id.CAX3Answer1Letter11);		
			CAX3Answer1Letter12 = (TextView) findViewById(R.id.CAX3Answer1Letter12);		
			CAX3Answer1Letter13 = (TextView) findViewById(R.id.CAX3Answer1Letter13);		

			CAX3Answer1Letter1.setText("P");
			CAX3Answer1Letter2.setText("R");
			CAX3Answer1Letter3.setText("O");
			CAX3Answer1Letter4.setText("J");
			CAX3Answer1Letter5.setText("E");
			CAX3Answer1Letter6.setText("C");
			CAX3Answer1Letter7.setText("T");
			CAX3Answer1Letter8.setText("C");
			CAX3Answer1Letter9.setText("R");
			CAX3Answer1Letter10.setText("A");
			CAX3Answer1Letter11.setText("M");
			CAX3Answer1Letter12.setText("P");
			CAX3Answer1Letter13.setText("S");
			
			String Acronym="PROJECT CRAMPS";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);
			CAX3Answer1Letter8 = (TextView) findViewById(R.id.CAX3Answer1Letter8);		CAX3Answer1Letter9 = (TextView) findViewById(R.id.CAX3Answer1Letter9);
			CAX3Answer1Letter10 = (TextView) findViewById(R.id.CAX3Answer1Letter10);		CAX3Answer1Letter11 = (TextView) findViewById(R.id.CAX3Answer1Letter11);
			CAX3Answer1Letter12 = (TextView) findViewById(R.id.CAX3Answer1Letter12);		CAX3Answer1Letter13 = (TextView) findViewById(R.id.CAX3Answer1Letter13);
			CAX3Answer1Letter14 = (TextView) findViewById(R.id.CAX3Answer1Letter14);
			CAX3Answer1Letter15 = (TextView) findViewById(R.id.CAX3Answer1Letter15);
			CAX3Answer1Letter16 = (TextView) findViewById(R.id.CAX3Answer1Letter16);

			CAX3Answer1Letter1.setText("F");
			CAX3Answer1Letter2.setText("L");
			CAX3Answer1Letter3.setText("O");
			CAX3Answer1Letter4.setText("W");
			CAX3Answer1Letter5.setText("C");
			CAX3Answer1Letter6.setText("H");
			CAX3Answer1Letter7.setText("A");
			CAX3Answer1Letter8.setText("R");
			CAX3Answer1Letter9.setText("T");
			CAX3Answer1Letter10.setText("I");
			CAX3Answer1Letter11.setText("T");
			CAX3Answer1Letter12.setText("E");
			CAX3Answer1Letter13.setText("M");
			CAX3Answer1Letter14.setText("I");
			CAX3Answer1Letter15.setText("S");
			CAX3Answer1Letter16.setText("E");

			

			String Acronym="FLOWCHART ITEMISE";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);

			CAX3Answer1Letter1.setText("P");
			CAX3Answer1Letter2.setText("N");
			CAX3Answer1Letter3.setText("E");
			CAX3Answer1Letter4.setText("F");
			CAX3Answer1Letter5.setText("C");
			CAX3Answer1Letter6.setText("P");
			CAX3Answer1Letter7.setText("B");
			
			String Acronym="PNEFCPB";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);

			CAX3Answer1Letter1.setText("F");
			CAX3Answer1Letter2.setText("I");
			CAX3Answer1Letter3.setText("R");
			CAX3Answer1Letter4.setText("M");
			CAX3Answer1Letter5.setText("P");
			CAX3Answer1Letter6.setText("E");
			CAX3Answer1Letter7.setText("N");
			
			
			String Acronym="FIRM PEN";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
						
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			
			CAX3Answer1Letter1.setText("D");
			CAX3Answer1Letter2.setText("R");
			CAX3Answer1Letter3.setText("R");
			CAX3Answer1Letter4.setText("U");
			CAX3Answer1Letter5.setText("B");
			
			
			String Acronym="DR RUB";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		if (randomInt==7){
			
						
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);
			CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);

			CAX3Answer1Letter1.setText("F");
			CAX3Answer1Letter2.setText("A");
			CAX3Answer1Letter3.setText("T");
			CAX3Answer1Letter4.setText("S");
			CAX3Answer1Letter5.setText("I");
			CAX3Answer1Letter6.setText("R");
			
			String Acronym="FAT SIR";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			

			CAX3Answer1Letter1.setText("O");
			CAX3Answer1Letter2.setText("F");
			CAX3Answer1Letter3.setText("F");
			CAX3Answer1Letter4.setText("E");
			CAX3Answer1Letter5.setText("R");
			
			
			String Acronym="OFFER";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		if (randomInt==9){
			
						
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			

			CAX3Answer1Letter1.setText("L");
			CAX3Answer1Letter2.setText("A");
			CAX3Answer1Letter3.setText("N");
			CAX3Answer1Letter4.setText("D");
			CAX3Answer1Letter5.setText("H");
			CAX3Answer1Letter6.setText("O");
			
			String Acronym="LAND HO";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		
	}
	
	
	///////////////done//////////////
	public void onClickGetTitleCAX3(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(9)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);
		TextViewTitleAnswerCAX3.setText(null);
		
		EditTextTestCAX3 = (EditText) findViewById(R.id.EditTextTestCAX3);
		EditTextTestCAX3.setText(null);
		
		CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
		CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
		CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
		CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);		CAX3Answer1Letter8 = (TextView) findViewById(R.id.CAX3Answer1Letter8);
		CAX3Answer1Letter9 = (TextView) findViewById(R.id.CAX3Answer1Letter9);		CAX3Answer1Letter10 = (TextView) findViewById(R.id.CAX3Answer1Letter10);
		CAX3Answer1Letter11 = (TextView) findViewById(R.id.CAX3Answer1Letter11);		CAX3Answer1Letter12 = (TextView) findViewById(R.id.CAX3Answer1Letter12);
		CAX3Answer1Letter13 = (TextView) findViewById(R.id.CAX3Answer1Letter13);		CAX3Answer1Letter14 = (TextView) findViewById(R.id.CAX3Answer1Letter14);
		CAX3Answer1Letter15 = (TextView) findViewById(R.id.CAX3Answer1Letter15);		CAX3Answer1Letter16 = (TextView) findViewById(R.id.CAX3Answer1Letter16);
		
		CAX3Answer1Letter1.setText(null);		CAX3Answer1Letter2.setText(null);		CAX3Answer1Letter3.setText(null);
		CAX3Answer1Letter4.setText(null);		CAX3Answer1Letter5.setText(null);		CAX3Answer1Letter6.setText(null);
		CAX3Answer1Letter7.setText(null);		CAX3Answer1Letter8.setText(null);		CAX3Answer1Letter9.setText(null);
		CAX3Answer1Letter10.setText(null);		CAX3Answer1Letter11.setText(null);		CAX3Answer1Letter12.setText(null);
		CAX3Answer1Letter13.setText(null);		CAX3Answer1Letter13.setText(null);		CAX3Answer1Letter14.setText(null);
		CAX3Answer1Letter15.setText(null);		CAX3Answer1Letter16.setText(null);
		
		
		
		EditTextCAX3Answer1 = (EditText)findViewById(R.id.EditTextCAX3Answer1);		EditTextCAX3Answer2 = (EditText)findViewById(R.id.EditTextCAX3Answer2);
		EditTextCAX3Answer3 = (EditText)findViewById(R.id.EditTextCAX3Answer3);		EditTextCAX3Answer4 = (EditText)findViewById(R.id.EditTextCAX3Answer4);
		EditTextCAX3Answer5 = (EditText)findViewById(R.id.EditTextCAX3Answer5);		EditTextCAX3Answer6 = (EditText)findViewById(R.id.EditTextCAX3Answer6);
		EditTextCAX3Answer7 = (EditText)findViewById(R.id.EditTextCAX3Answer7);		EditTextCAX3Answer8 = (EditText)findViewById(R.id.EditTextCAX3Answer8);
		EditTextCAX3Answer9 = (EditText)findViewById(R.id.EditTextCAX3Answer9);		EditTextCAX3Answer10 = (EditText)findViewById(R.id.EditTextCAX3Answer10);
		EditTextCAX3Answer11 = (EditText)findViewById(R.id.EditTextCAX3Answer11);		EditTextCAX3Answer12 = (EditText)findViewById(R.id.EditTextCAX3Answer12);
		EditTextCAX3Answer13 = (EditText)findViewById(R.id.EditTextCAX3Answer13);		EditTextCAX3Answer14 = (EditText)findViewById(R.id.EditTextCAX3Answer14);
		EditTextCAX3Answer15 = (EditText)findViewById(R.id.EditTextCAX3Answer15);		EditTextCAX3Answer16 = (EditText)findViewById(R.id.EditTextCAX3Answer16);
		
		EditTextCAX3Answer1.setText(null);		EditTextCAX3Answer2.setText(null);		EditTextCAX3Answer3.setText(null);
		EditTextCAX3Answer4.setText(null);		EditTextCAX3Answer5.setText(null);		EditTextCAX3Answer6.setText(null);
		EditTextCAX3Answer7.setText(null);		EditTextCAX3Answer8.setText(null);		EditTextCAX3Answer9.setText(null);
		EditTextCAX3Answer10.setText(null);		EditTextCAX3Answer11.setText(null);		EditTextCAX3Answer12.setText(null);
		EditTextCAX3Answer13.setText(null);		EditTextCAX3Answer14.setText(null);		EditTextCAX3Answer15.setText(null);
		EditTextCAX3Answer16.setText(null);
		
		textViewAnswer1CAX3 = (TextView) findViewById(R.id.textViewAnswer1CAX3);		textViewAnswer2CAX3= (TextView) findViewById(R.id.textViewAnswer2CAX3);
		textViewAnswer3CAX3 = (TextView) findViewById(R.id.textViewAnswer3CAX3);		textViewAnswer4CAX3 = (TextView) findViewById(R.id.textViewAnswer4CAX3);
		textViewAnswer5CAX3 = (TextView) findViewById(R.id.textViewAnswer5CAX3);		textViewAnswer6CAX3 = (TextView) findViewById(R.id.textViewAnswer6CAX3);
		textViewAnswer7CAX3 = (TextView) findViewById(R.id.textViewAnswer7CAX3);		textViewAnswer8CAX3 = (TextView) findViewById(R.id.textViewAnswer8CAX3);
		textViewAnswer9CAX3 = (TextView) findViewById(R.id.textViewAnswer9CAX3);		textViewAnswer10CAX3 = (TextView) findViewById(R.id.textViewAnswer10CAX3);
		textViewAnswer11CAX3 = (TextView) findViewById(R.id.textViewAnswer11CAX3);		textViewAnswer12CAX3 = (TextView) findViewById(R.id.textViewAnswer12CAX3);
		textViewAnswer13CAX3 = (TextView) findViewById(R.id.textViewAnswer13CAX3);		textViewAnswer14CAX3 = (TextView) findViewById(R.id.textViewAnswer14CAX3);
		textViewAnswer15CAX3 = (TextView) findViewById(R.id.textViewAnswer15CAX3);		textViewAnswer16CAX3 = (TextView) findViewById(R.id.textViewAnswer16CAX3);
		
		textViewAnswer1CAX3.setText(null);		textViewAnswer2CAX3.setText(null);		textViewAnswer3CAX3.setText(null);
		textViewAnswer4CAX3.setText(null);		textViewAnswer5CAX3.setText(null);		textViewAnswer6CAX3.setText(null);
		textViewAnswer7CAX3.setText(null);		textViewAnswer8CAX3.setText(null);		textViewAnswer9CAX3.setText(null);
		textViewAnswer10CAX3.setText(null);		textViewAnswer11CAX3.setText(null);		textViewAnswer12CAX3.setText(null);
		textViewAnswer13CAX3.setText(null);		textViewAnswer14CAX3.setText(null);		textViewAnswer15CAX3.setText(null);
		textViewAnswer16CAX3.setText(null);
		
		
		if(randomInt == 1){

			String Acronym1Title = "Criteria assessed as part of an initial appraisal";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym1Title);
			
			

		}

		if(randomInt == 2){
			
			String Acronym2Title = "Characteristics of well run projects";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym2Title);
			
			
		}

		if(randomInt == 3){

			String Acronym3Title = "What should a written strategy document include";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym3Title);
			
			

		}

		if(randomInt == 4){

			String Acronym4Title = "Identification of causes of risks";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym4Title);
			
			
		}

		if(randomInt == 5){

			String Acronym5Title = "Contents of the investment submission in a capital project appraisal";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym5Title);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Title = "Identifying risks in a capital project appraisal";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym6Title);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Title = "Ways of mitigating risk";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym7Title);
			
			
		}

		if(randomInt == 8){

			String Acronym8Title = "Factors to consider when analysing mitigation options in a capital appraisal";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym8Title);
			
			
		}

		if(randomInt == 9){

			String Acronym9Title = "Other considerations in addition to the investment submission";
			
			textViewCAX3 = (TextView) findViewById(R.id.PullTestStringCAX3);//take in string
			textViewCAX3.setText(Acronym9Title);
			
			
			
		}

		


	}

	
	
	
	public void onClickTestYourselfTitleCAX3(View v)
	{
		if (randomInt==1)
		{
			
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			
			CAX3Answer1Letter1.setText("S");
			CAX3Answer1Letter2.setText("P");
			CAX3Answer1Letter3.setText("U");
			CAX3Answer1Letter4.setText("R");
			CAX3Answer1Letter5.setText("S");
			
			String Acronym="Criteria assessed as part of an initial appraisal";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);		CAX3Answer1Letter8 = (TextView) findViewById(R.id.CAX3Answer1Letter8);
			CAX3Answer1Letter9 = (TextView) findViewById(R.id.CAX3Answer1Letter9);		CAX3Answer1Letter10 = (TextView) findViewById(R.id.CAX3Answer1Letter10);
			CAX3Answer1Letter11 = (TextView) findViewById(R.id.CAX3Answer1Letter11);		
			CAX3Answer1Letter12 = (TextView) findViewById(R.id.CAX3Answer1Letter12);		
			CAX3Answer1Letter13 = (TextView) findViewById(R.id.CAX3Answer1Letter13);		

			CAX3Answer1Letter1.setText("P");
			CAX3Answer1Letter2.setText("R");
			CAX3Answer1Letter3.setText("O");
			CAX3Answer1Letter4.setText("J");
			CAX3Answer1Letter5.setText("E");
			CAX3Answer1Letter6.setText("C");
			CAX3Answer1Letter7.setText("T");
			CAX3Answer1Letter8.setText("C");
			CAX3Answer1Letter9.setText("R");
			CAX3Answer1Letter10.setText("A");
			CAX3Answer1Letter11.setText("M");
			CAX3Answer1Letter12.setText("P");
			CAX3Answer1Letter13.setText("S");
			
			String Acronym="Characteristics of well run projects";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);
			CAX3Answer1Letter8 = (TextView) findViewById(R.id.CAX3Answer1Letter8);		CAX3Answer1Letter9 = (TextView) findViewById(R.id.CAX3Answer1Letter9);
			CAX3Answer1Letter10 = (TextView) findViewById(R.id.CAX3Answer1Letter10);		CAX3Answer1Letter11 = (TextView) findViewById(R.id.CAX3Answer1Letter11);
			CAX3Answer1Letter12 = (TextView) findViewById(R.id.CAX3Answer1Letter12);		CAX3Answer1Letter13 = (TextView) findViewById(R.id.CAX3Answer1Letter13);
			CAX3Answer1Letter14 = (TextView) findViewById(R.id.CAX3Answer1Letter14);
			CAX3Answer1Letter15 = (TextView) findViewById(R.id.CAX3Answer1Letter15);
			CAX3Answer1Letter16 = (TextView) findViewById(R.id.CAX3Answer1Letter16);

			CAX3Answer1Letter1.setText("F");
			CAX3Answer1Letter2.setText("L");
			CAX3Answer1Letter3.setText("O");
			CAX3Answer1Letter4.setText("W");
			CAX3Answer1Letter5.setText("C");
			CAX3Answer1Letter6.setText("H");
			CAX3Answer1Letter7.setText("A");
			CAX3Answer1Letter8.setText("R");
			CAX3Answer1Letter9.setText("T");
			CAX3Answer1Letter10.setText("I");
			CAX3Answer1Letter11.setText("T");
			CAX3Answer1Letter12.setText("E");
			CAX3Answer1Letter13.setText("M");
			CAX3Answer1Letter14.setText("I");
			CAX3Answer1Letter15.setText("S");
			CAX3Answer1Letter16.setText("E");

			

			String Acronym="What should a written strategy document include";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);

			CAX3Answer1Letter1.setText("P");
			CAX3Answer1Letter2.setText("N");
			CAX3Answer1Letter3.setText("E");
			CAX3Answer1Letter4.setText("F");
			CAX3Answer1Letter5.setText("C");
			CAX3Answer1Letter6.setText("P");
			CAX3Answer1Letter7.setText("B");
			
			String Acronym="Identification of causes of risks";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			CAX3Answer1Letter7 = (TextView) findViewById(R.id.CAX3Answer1Letter7);

			CAX3Answer1Letter1.setText("F");
			CAX3Answer1Letter2.setText("I");
			CAX3Answer1Letter3.setText("R");
			CAX3Answer1Letter4.setText("M");
			CAX3Answer1Letter5.setText("P");
			CAX3Answer1Letter6.setText("E");
			CAX3Answer1Letter7.setText("N");
			
			
			String Acronym="Contents of the investment submission in a capital project appraisal";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
						
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			
			CAX3Answer1Letter1.setText("D");
			CAX3Answer1Letter2.setText("R");
			CAX3Answer1Letter3.setText("R");
			CAX3Answer1Letter4.setText("U");
			CAX3Answer1Letter5.setText("B");
			
			
			String Acronym="Identifying risks in a capital project appraisal";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		if (randomInt==7){
			
						
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);
			CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);
			CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);

			CAX3Answer1Letter1.setText("F");
			CAX3Answer1Letter2.setText("A");
			CAX3Answer1Letter3.setText("T");
			CAX3Answer1Letter4.setText("S");
			CAX3Answer1Letter5.setText("I");
			CAX3Answer1Letter6.setText("R");
			
			String Acronym="Ways of mitigating risk";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			
			
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			

			CAX3Answer1Letter1.setText("O");
			CAX3Answer1Letter2.setText("F");
			CAX3Answer1Letter3.setText("F");
			CAX3Answer1Letter4.setText("E");
			CAX3Answer1Letter5.setText("R");
			
			
			String Acronym="Factors to consider when analysing mitigation options in a capital appraisal";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
		if (randomInt==9){
			
						
			CAX3Answer1Letter1 = (TextView) findViewById(R.id.CAX3Answer1Letter1);		CAX3Answer1Letter2 = (TextView) findViewById(R.id.CAX3Answer1Letter2);
			CAX3Answer1Letter3 = (TextView) findViewById(R.id.CAX3Answer1Letter3);		CAX3Answer1Letter4 = (TextView) findViewById(R.id.CAX3Answer1Letter4);
			CAX3Answer1Letter5 = (TextView) findViewById(R.id.CAX3Answer1Letter5);		CAX3Answer1Letter6 = (TextView) findViewById(R.id.CAX3Answer1Letter6);
			

			CAX3Answer1Letter1.setText("L");
			CAX3Answer1Letter2.setText("A");
			CAX3Answer1Letter3.setText("N");
			CAX3Answer1Letter4.setText("D");
			CAX3Answer1Letter5.setText("H");
			CAX3Answer1Letter6.setText("O");
			
			String Acronym="Other considerations in addition to the investment submission";

			EditTextTestCAX3 = (EditText)findViewById(R.id.EditTextTestCAX3);
			useranswerCAX3=EditTextTestCAX3.getText().toString();
			TextViewTitleAnswerCAX3 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX3);

			if(Acronym.equals(useranswerCAX3)){
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX3.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX3.setText(Acronym);
			}

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x3, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x3,
					container, false);
			return rootView;
		}
	}

}
