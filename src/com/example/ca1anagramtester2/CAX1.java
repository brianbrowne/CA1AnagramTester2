package com.example.ca1anagramtester2;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
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

public class CAX1 extends ActionBarActivity {
	
	EditText EditTextTestCAX1;			TextView TextViewTitleAnswerCAX1;			TextView textViewCAX1;
	String useranswerCAX1;
	
	EditText EditTextCAX1Answer1;		EditText EditTextCAX1Answer2;		EditText EditTextCAX1Answer3;
	EditText EditTextCAX1Answer4;		EditText EditTextCAX1Answer5;		EditText EditTextCAX1Answer6;
	EditText EditTextCAX1Answer7;		EditText EditTextCAX1Answer8;		EditText EditTextCAX1Answer9;
	EditText EditTextCAX1Answer10;		EditText EditTextCAX1Answer11;		EditText EditTextCAX1Answer12;
	EditText EditTextCAX1Answer13;		EditText EditTextCAX1Answer14;		EditText EditTextCAX1Answer15;		EditText EditTextCAX1Answer16;
    
	
	TextView CAX1Answer1Letter1;		TextView CAX1Answer1Letter2;		TextView CAX1Answer1Letter3;
	TextView CAX1Answer1Letter4;		TextView CAX1Answer1Letter5;		TextView CAX1Answer1Letter6;
	TextView CAX1Answer1Letter7;		TextView CAX1Answer1Letter8;		TextView CAX1Answer1Letter9;
	TextView CAX1Answer1Letter10;		TextView CAX1Answer1Letter11;		TextView CAX1Answer1Letter12;
	TextView CAX1Answer1Letter13;		TextView CAX1Answer1Letter14;		TextView CAX1Answer1Letter15;		TextView CAX1Answer1Letter16;
    
	
	TextView textViewAnswer1CAX1;		TextView textViewAnswer2CAX1;		TextView textViewAnswer3CAX1;		TextView textViewAnswer4CAX1;
	TextView textViewAnswer5CAX1;		TextView textViewAnswer6CAX1;		TextView textViewAnswer7CAX1;		TextView textViewAnswer8CAX1;
	TextView textViewAnswer9CAX1;		TextView textViewAnswer10CAX1;		TextView textViewAnswer11CAX1;		TextView textViewAnswer12CAX1;
	TextView textViewAnswer13CAX1;		TextView textViewAnswer14CAX1;		TextView textViewAnswer15CAX1;		TextView textViewAnswer16CAX1;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cax1);
		
		EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
		textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);
		TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);
		
		
		CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
		CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
		CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
		CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);		CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);		CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
		CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);		CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);
		
		
		EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
		EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
		EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
		EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
		EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
		EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
		EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
		EditTextCAX1Answer15 = (EditText)findViewById(R.id.EditTextCAX1Answer15);		EditTextCAX1Answer16 = (EditText)findViewById(R.id.EditTextCAX1Answer16);
		
		
		textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
		textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
		textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
		textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
		textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
		textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
		textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
		textViewAnswer15CAX1 = (TextView) findViewById(R.id.textViewAnswer15CAX1);		textViewAnswer16CAX1 = (TextView) findViewById(R.id.textViewAnswer16CAX1);
		
		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	public void onClickCAX1TestAnswers(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym1Answer1="The general economic and commercial environment";
			String Acronym1Answer2="Specifying the problem";
			String Acronym1Answer3="Developing the solution";
			String Acronym1Answer4="Monitoring the experience";
			String Acronym1Answer5="Professionalism"; 
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();

			if(Acronym1Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym1Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym1Answer1);
			}
			
			if(Acronym1Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym1Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym1Answer2);
			}
			
			if(Acronym1Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym1Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym1Answer3);
			}
			
			if(Acronym1Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym1Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym1Answer4);
			}
			
			if(Acronym1Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym1Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym1Answer5);
			}
		}
		if(randomInt==2){
			
			
			String Acronym2Answer1="Estimation of the financial impact of uncertain future events";
			String Acronym2Answer2="Allow for the impact of legislation, regulation, taxation, competition";
			String Acronym2Answer3="Recognition of stakeholders requirements and risk profiles";
			String Acronym2Answer4="A long term rather than short term horizon";
			String Acronym2Answer5="Use of assumptions based on appropriate historical experience";
			String Acronym2Answer6="Interpretation of the results of modelling to enable practical strategies to be developed";
			String Acronym2Answer7="Decisions need to be made in the short term in light of likely future outcomes";
			String Acronym2Answer8="Use of models to represent future financial outcomes";
			String Acronym2Answer9="Monitoring and periodically analysing the emerging experience";
			String Acronym2Answer10="Modifying models/strategies in light of this emerging experience";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
					
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();	String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			
			if(Acronym2Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym2Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym2Answer1);
			}
			
			if(Acronym2Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym2Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym2Answer2);
			}
			
			if(Acronym2Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym2Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym2Answer3);
			}
			
			if(Acronym2Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym2Answer1);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym2Answer4);
			}
			
			if(Acronym2Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym2Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym2Answer5);
			}
			
			if(Acronym2Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym2Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym2Answer6);
			}
			
			if(Acronym2Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym2Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym2Answer7);
			}
			
			if(Acronym2Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX1.setText(Acronym2Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(Acronym2Answer8);
			}
			
			if(Acronym2Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX1.setText(Acronym2Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(Acronym2Answer9);
			}
			
			if(Acronym2Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX1.setText(Acronym2Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(Acronym2Answer10);
			}
			
		}
		if(randomInt==3){
			
			
			String Acronym3Answer1="Form judgements about future inflation and interest rates";
			String Acronym3Answer2="Handle assumption in a critical manner";
			String Acronym3Answer3="Models - build, parameterise, test and implement them";
			String Acronym3Answer4="Margins - build them into assumptions and appreciate their impact";
			String Acronym3Answer5="Estimate payments that need to be met using data on future liabilities";
			String Acronym3Answer6="Handle data in a critical manner";
			String Acronym3Answer7="Project and discount future cashflows using assumptions";
			String Acronym3Answer8="Monitor the progress of the accumulation of a fund";
			String Acronym3Answer9="Advise on reinsurance and other risk transfer mechanisms";
			String Acronym3Answer10="Calculate contributions needed over time to meet future liabilities";
			String Acronym3Answer11="Manage the build up of assets to meet future liabilities";
			String Acronym3Answer12="Analyse variation between actual and expected experience";
			String Acronym3Answer13="Contribute to decisions on investment policies to meet future liabilities";
			String Acronym3Answer14="Manage variation of a fund to ensure that future liabilities are met";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
			EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);
			EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
			textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();		String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();		String checkuseranswerCAX112=EditTextCAX1Answer12.getText().toString();
			String checkuseranswerCAX113=EditTextCAX1Answer13.getText().toString();		String checkuseranswerCAX114=EditTextCAX1Answer14.getText().toString();
			
			if(Acronym3Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym3Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym3Answer1);
			}
			
			if(Acronym3Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym3Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym3Answer2);
			}
			
			if(Acronym3Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym3Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym3Answer3);
			}
			
			if(Acronym3Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym3Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym3Answer4);
			}
			
			if(Acronym3Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym3Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym3Answer5);
			}
			
			if(Acronym3Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym3Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym3Answer6);
			}
			
			if(Acronym3Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym3Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym3Answer7);
			}
			
			if(Acronym3Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX1.setText(Acronym3Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(Acronym3Answer8);
			}
			
			if(Acronym3Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX1.setText(Acronym3Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(Acronym3Answer9);
			}
			
			if(Acronym3Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX1.setText(Acronym3Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(Acronym3Answer10);
			}
			
			if(Acronym3Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CAX1.setText(Acronym3Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText(Acronym3Answer11);
			}
			
			if(Acronym3Answer12.equals(checkuseranswerCAX112)){
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CAX1.setText(Acronym3Answer12);
			}else{
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX1.setText(Acronym3Answer12);
			}
			
			if(Acronym3Answer13.equals(checkuseranswerCAX113)){
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CAX1.setText(Acronym3Answer13);
			}else{
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX1.setText(Acronym3Answer13);
			}
			
			if(Acronym3Answer14.equals(checkuseranswerCAX114)){
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CAX1.setText(Acronym3Answer14);
			}else{
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CAX1.setText(Acronym3Answer14);
			}
			
		}
		if(randomInt==4){
			
			
			
			
			
			
			
			
			
			String Acronym4Answer1="Being reliable (detail, quality, timeliness)";
			String Acronym4Answer2="Acting with integrity and detachment from personal circumstances";
			String Acronym4Answer3="Skilled communication";
			String Acronym4Answer4="Taking responsibility for decisions";
			String Acronym4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String Acronym4Answer6="Recognising that others have valid views";
			String Acronym4Answer7="Developing a direct and trusting relationship with the client";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();
			String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();
			
			if(Acronym4Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym4Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym4Answer1);
			}
			
			if(Acronym4Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym4Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym4Answer2);
			}
			
			if(Acronym4Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym4Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym4Answer3);
			}
			
			if(Acronym4Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym4Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym4Answer4);
			}
			
			if(Acronym4Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym4Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym4Answer5);
			}
			
			if(Acronym4Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym4Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym4Answer6);
			}
			
			if(Acronym4Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym4Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym4Answer7);
			}
			
			
		}
		if(randomInt==5){
			
			
			String Acronym5Answer1="Communicate the answer in a way that is understoodby the client";
			String Acronym5Answer2="Establish what are the questions that need answering";
			String Acronym5Answer3="Consider resources and timescales";
			String Acronym5Answer4="Set assumptions";
			String Acronym5Answer5="Decide on a method";
			String Acronym5Answer6="Consider the professional implications of the work being done";
			String Acronym5Answer7="Check the solution and get somebody else to check it";
			String Acronym5Answer8="Ensure he/she is familiar with the context in which he/she is going to operate and the implications of the results";
			String Acronym5Answer9="Arrive at the solution";
			String Acronym5Answer10="Define the task with the client and consider conflicts of interests";
			String Acronym5Answer11="Gather and assess the available information";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);
			EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1= (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1= (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		
			
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();	String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();
			
			if(Acronym5Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym5Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym5Answer1);
			}
			
			if(Acronym5Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym5Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym5Answer2);
			}
			
			if(Acronym5Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym5Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym5Answer3);
			}
			
			if(Acronym5Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym5Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym5Answer4);
			}
			
			if(Acronym5Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym5Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym5Answer5);
			}
			
			if(Acronym5Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym5Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym5Answer6);
			}
			
			if(Acronym5Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym5Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym5Answer7);
			}
			
			if(Acronym5Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX1.setText(Acronym5Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(Acronym5Answer8);
			}
			
			if(Acronym5Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX1.setText(Acronym5Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(Acronym5Answer9);
			}
			
			if(Acronym5Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX1.setText(Acronym5Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(Acronym5Answer10);
			}
			
			if(Acronym5Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CAX1.setText(Acronym5Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText(Acronym5Answer11);
			}
			

			
		}
		if(randomInt==6){
			
			
			String Acronym6Answer1="Banks";
			String Acronym6Answer2="Board of directors";
			String Acronym6Answer3="Creditors of insurance companies";
			String Acronym6Answer4="Trustees of benefit schemes";
			String Acronym6Answer5="Employers";
			String Acronym6Answer6="Auditiors of insurance companies";
			String Acronym6Answer7="Members of benefit/investment schemes and their dependents";
			String Acronym6Answer8="Policyholders/prospective policyholders";
			String Acronym6Answer9="Investment fund managers";
			String Acronym6Answer10="Employees";
			String Acronym6Answer11="Shareholders";
			String Acronym6Answer12="Sponsors of benefit schemes/capital projects";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);
			EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);
			EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1= (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1= (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);
			textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
			
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();	String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();
			String checkuseranswerCAX112=EditTextCAX1Answer12.getText().toString();
			
			if(Acronym6Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym6Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym6Answer1);
			}
			
			if(Acronym6Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym6Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym6Answer2);
			}
			
			if(Acronym6Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym6Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym6Answer3);
			}
			
			if(Acronym6Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym6Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym6Answer4);
			}
			
			if(Acronym6Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym6Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym6Answer5);
			}
			
			if(Acronym6Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym6Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym6Answer6);
			}
			
			if(Acronym6Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym6Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym6Answer7);
			}
			
			if(Acronym6Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX1.setText(Acronym6Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(Acronym6Answer8);
			}
			
			if(Acronym6Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX1.setText(Acronym6Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(Acronym6Answer9);
			}
			
			if(Acronym6Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX1.setText(Acronym6Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(Acronym6Answer10);
			}
			
			if(Acronym6Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CAX1.setText(Acronym6Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText(Acronym6Answer11);
			}
			
			if(Acronym6Answer12.equals(checkuseranswerCAX112)){
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CAX1.setText(Acronym6Answer12);
			}else{
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX1.setText(Acronym6Answer12);
			}
			
			

			
		}
		if(randomInt==7){
			
			
			
			
			
			String Acronym7Answer1="Factual advise - based on research of facts - eg legislation";
			String Acronym7Answer2="Indicative advice - giving an opinion without fully investigating the issues - eg in response to a direct oral question";
			String Acronym7Answer3="Recommendations - researched and modelled forecasts, alternatives weighted, recommendations made consistent with requirements";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);	
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1 = (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();
			
			if(Acronym7Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym7Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym7Answer1);
			}
			
			if(Acronym7Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym7Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym7Answer2);
			}
			
			if(Acronym7Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym7Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym7Answer3);
			}
			
			

			
		}
		if(randomInt==8){
			
			String Acronym8Answer1="Commercial requirements";
			String Acronym8Answer2="Regulation and legislation";
			String Acronym8Answer3="Environmental issues";
			String Acronym8Answer4="Accounting standards";
			String Acronym8Answer5="Tax";
			String Acronym8Answer6="Economic outlook";
			String Acronym8Answer7="Governance - corporate";
			String Acronym8Answer8="Risk managment requirements";
			String Acronym8Answer9="Experience from overseas";
			String Acronym8Answer10="Adequacy of capital";
			String Acronym8Answer11="Trends - demographic";
			String Acronym8Answer12="Lifestyle considerations";
			String Acronym8Answer13="Institutional structure";
			String Acronym8Answer14="Social and cultural trends";
			String Acronym8Answer15="Technology";
			String Acronym8Answer16="State benefits";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
			EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
			EditTextCAX1Answer15 = (EditText)findViewById(R.id.EditTextCAX1Answer15);		EditTextCAX1Answer16 = (EditText)findViewById(R.id.EditTextCAX1Answer16);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
			textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();		String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();		String checkuseranswerCAX112=EditTextCAX1Answer12.getText().toString();
			String checkuseranswerCAX113=EditTextCAX1Answer13.getText().toString();		String checkuseranswerCAX114=EditTextCAX1Answer14.getText().toString();
			String checkuseranswerCAX115=EditTextCAX1Answer15.getText().toString();		String checkuseranswerCAX116=EditTextCAX1Answer16.getText().toString();
			
			if(Acronym8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym8Answer7);
			}
			
			if(Acronym8Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX1.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(Acronym8Answer8);
			}
			
			if(Acronym8Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX1.setText(Acronym8Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(Acronym8Answer9);
			}
			
			if(Acronym8Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer10CAX1.setText(Acronym8Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(Acronym8Answer10);
			}
			
			if(Acronym8Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer11CAX1.setText(Acronym8Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText(Acronym8Answer11);
			}
			
			if(Acronym8Answer12.equals(checkuseranswerCAX112)){
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer12CAX1.setText(Acronym8Answer12);
			}else{
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX1.setText(Acronym8Answer12);
			}
			
			if(Acronym8Answer13.equals(checkuseranswerCAX113)){
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer13CAX1.setText(Acronym8Answer13);
			}else{
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX1.setText(Acronym8Answer13);
			}
			
			if(Acronym8Answer14.equals(checkuseranswerCAX114)){
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer14CAX1.setText(Acronym8Answer14);
			}else{
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CAX1.setText(Acronym8Answer14);
			}
			
			if(Acronym8Answer15.equals(checkuseranswerCAX115)){
				textViewAnswer15CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer15CAX1.setText(Acronym8Answer15);
			}else{
				textViewAnswer15CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer15CAX1.setText(Acronym8Answer15);
			}
			
			if(Acronym8Answer16.equals(checkuseranswerCAX116)){
				textViewAnswer16CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer16CAX1.setText(Acronym8Answer16);
			}else{
				textViewAnswer16CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer16CAX1.setText(Acronym8Answer16);
			}
			

			
		}
		if(randomInt==9){			
			
			String Acronym9Answer1="Give confidence in the financial system";
			String Acronym9Answer2="Reduce financial crime";
			String Acronym9Answer3="Correct inefficiencies in the market and promote efficient and orderly markets";
			String Acronym9Answer4="Protect consumers of financial products";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			
			
			if(Acronym9Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym9Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym9Answer1);
			}
			
			if(Acronym9Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym9Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym9Answer2);
			}
			
			if(Acronym9Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym9Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym9Answer3);
			}
			
			if(Acronym9Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym9Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym9Answer4);
			}
			
			
			
			
		}
		if(randomInt==10){
			
			
			String Acronym8Answer1="Direct costs";
			String Acronym8Answer2="Admin costs";
			String Acronym8Answer3="Complicance costs";
			String Acronym8Answer4="Indirect costs";
			String Acronym8Answer5="Behaviour change in consumers, false sense of security, reduced sense of responsibility for own actions";
			String Acronym8Answer6="Undermining the sense of responsibility amongst advisors and intermediaries";
			String Acronym8Answer7="Reduction in consumer protection mechanisms";
			String Acronym8Answer8="Reduced product innovation";
			String Acronym8Answer9="Reduced competition";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();
			
			if(Acronym8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym8Answer7);
			}
			
			if(Acronym8Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer8CAX1.setText(Acronym8Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(Acronym8Answer8);
			}
			
			if(Acronym8Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer9CAX1.setText(Acronym8Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(Acronym8Answer9);
			}

			
		}
		if(randomInt==11){
			
			String Acronym8Answer1="Setting sanctions";
			String Acronym8Answer2="Enforcing regulations";
			String Acronym8Answer3="Reviewing and influencing government policy";
			String Acronym8Answer4="Vetting and registering firms and individuals";
			String Acronym8Answer5="Investigating breaches";
			String Acronym8Answer6="Checking management and conduct of providers";
			String Acronym8Answer7="Educating consumers and the public";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	
			
			if(Acronym8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}
			
			if(Acronym8Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer6CAX1.setText(Acronym8Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(Acronym8Answer6);
			}
			
			if(Acronym8Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer7CAX1.setText(Acronym8Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(Acronym8Answer7);
			}

			
		}
		if(randomInt==12){
			
			
			String Acronym8Answer1="Capital adequacy of provider";
			String Acronym8Answer2="Integrity, competence of practitioners";
			String Acronym8Answer3="Stock exchange requirements";
			String Acronym8Answer4="Compensation schemes";
			String Acronym8Answer5="Orderly and transparent markets";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);	
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	
			
			if(Acronym8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym8Answer1);
			}
			
			if(Acronym8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym8Answer2);
			}
			
			if(Acronym8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym8Answer3);
			}
			
			if(Acronym8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym8Answer4);
			}
			
			if(Acronym8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym8Answer5);
			}

			
		}
		if(randomInt==13){
			
			
			
			
			
			String Acronym13Answer1="Freedom of action";
			String Acronym13Answer2="Outcome based";
			String Acronym13Answer3="Prescriptive";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();
			
			if(Acronym13Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym13Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym13Answer1);
			}
			
			if(Acronym13Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym13Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym13Answer2);
			}
			
			if(Acronym13Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym13Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym13Answer3);
			}
			

			
		}
		if(randomInt==14){
			
			
			
			
			
			
			
			String Acronym14Answer1="Mixed regime";
			String Acronym14Answer2="Unregulated markets";
			String Acronym14Answer3="Statutory";
			String Acronym14Answer4="Self-regulation";
			String Acronym14Answer5="Voluntary codes of conduct";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();
			
			if(Acronym14Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer1CAX1.setText(Acronym14Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(Acronym14Answer1);
			}
			
			if(Acronym14Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer2CAX1.setText(Acronym14Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(Acronym14Answer2);
			}
			
			if(Acronym14Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer3CAX1.setText(Acronym14Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(Acronym14Answer3);
			}
			
			if(Acronym14Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer4CAX1.setText(Acronym14Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(Acronym14Answer4);
			}
			
			if(Acronym14Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
				textViewAnswer5CAX1.setText(Acronym14Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(Acronym14Answer5);
			}
			
			if(randomInt==15){
				
				
				String Acronym8Answer1="Cooling-off period";
				String Acronym8Answer2="Regulation of selling practices - eg commission";
				String Acronym8Answer3="Impose price controls";
				String Acronym8Answer4="Educate consumers";
				String Acronym8Answer5="Disclosure";
				String Acronym8Answer6="Public available restriction of knowledge";
				String Acronym8Answer7="Insider-trading regulation";
				String Acronym8Answer8="Chinese walls";
				
				
				EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
				EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
				EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
				EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
				
				textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
				textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
				textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
				textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
				
				String checkuseranswerCAX111=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX121=EditTextCAX1Answer2.getText().toString();
				String checkuseranswerCAX131=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX141=EditTextCAX1Answer4.getText().toString();
				String checkuseranswerCAX151=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
				String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
				
				if(Acronym8Answer1.equals(checkuseranswerCAX111)){
					textViewAnswer1CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer1CAX1.setText(Acronym8Answer1);
				}else{
					textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer1CAX1.setText(Acronym8Answer1);
				}
				
				if(Acronym8Answer2.equals(checkuseranswerCAX121)){
					textViewAnswer2CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer2CAX1.setText(Acronym8Answer2);
				}else{
					textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer2CAX1.setText(Acronym8Answer2);
				}
				
				if(Acronym8Answer3.equals(checkuseranswerCAX131)){
					textViewAnswer3CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer3CAX1.setText(Acronym8Answer3);
				}else{
					textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer3CAX1.setText(Acronym8Answer3);
				}
				
				if(Acronym8Answer4.equals(checkuseranswerCAX141)){
					textViewAnswer4CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer4CAX1.setText(Acronym8Answer4);
				}else{
					textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer4CAX1.setText(Acronym8Answer4);
				}
				
				if(Acronym8Answer5.equals(checkuseranswerCAX151)){
					textViewAnswer5CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer5CAX1.setText(Acronym8Answer5);
				}else{
					textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer5CAX1.setText(Acronym8Answer5);
				}
				
				if(Acronym8Answer6.equals(checkuseranswerCAX16)){
					textViewAnswer6CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer6CAX1.setText(Acronym8Answer6);
				}else{
					textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer6CAX1.setText(Acronym8Answer6);
				}
				
				if(Acronym8Answer7.equals(checkuseranswerCAX17)){
					textViewAnswer7CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer7CAX1.setText(Acronym8Answer7);
				}else{
					textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer7CAX1.setText(Acronym8Answer7);
				}
				
				if(Acronym8Answer8.equals(checkuseranswerCAX18)){
					textViewAnswer8CAX1.setTextColor(Color.parseColor("#006400"));
					textViewAnswer8CAX1.setText(Acronym8Answer8);
				}else{
					textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer8CAX1.setText(Acronym8Answer8);
				}
				
			}

			
		}

		
	}

	
	public void onClickGetAcronymCAX1(View v)
	{
		
		TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);
		TextViewTitleAnswerCAX1.setText(null);
		
		EditTextTestCAX1 = (EditText) findViewById(R.id.EditTextTestCAX1);
		EditTextTestCAX1.setText(null);
		
		CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
		CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
		CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
		CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);		CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);		CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
		CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);		CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);
		
		CAX1Answer1Letter1.setText(null);		CAX1Answer1Letter2.setText(null);		CAX1Answer1Letter3.setText(null);		CAX1Answer1Letter4.setText(null);
		CAX1Answer1Letter5.setText(null);		CAX1Answer1Letter6.setText(null);		CAX1Answer1Letter7.setText(null);		CAX1Answer1Letter8.setText(null);
		CAX1Answer1Letter9.setText(null);		CAX1Answer1Letter10.setText(null);		CAX1Answer1Letter11.setText(null);		CAX1Answer1Letter12.setText(null);
		CAX1Answer1Letter13.setText(null);		CAX1Answer1Letter13.setText(null);		CAX1Answer1Letter14.setText(null);		CAX1Answer1Letter15.setText(null);
		CAX1Answer1Letter16.setText(null);
		
		
		
		EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
		EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
		EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
		EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
		EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
		EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
		EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
		EditTextCAX1Answer15 = (EditText)findViewById(R.id.EditTextCAX1Answer15);		EditTextCAX1Answer16 = (EditText)findViewById(R.id.EditTextCAX1Answer16);
		
		EditTextCAX1Answer1.setText(null);		EditTextCAX1Answer2.setText(null);		EditTextCAX1Answer3.setText(null);		EditTextCAX1Answer4.setText(null);
		EditTextCAX1Answer5.setText(null);		EditTextCAX1Answer6.setText(null);		EditTextCAX1Answer7.setText(null);		EditTextCAX1Answer8.setText(null);
		EditTextCAX1Answer9.setText(null);		EditTextCAX1Answer10.setText(null);		EditTextCAX1Answer11.setText(null);		EditTextCAX1Answer12.setText(null);
		EditTextCAX1Answer13.setText(null);		EditTextCAX1Answer14.setText(null);		EditTextCAX1Answer15.setText(null);
		EditTextCAX1Answer16.setText(null);
		
		textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
		textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
		textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
		textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
		textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
		textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
		textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
		textViewAnswer15CAX1 = (TextView) findViewById(R.id.textViewAnswer15CAX1);		textViewAnswer16CAX1 = (TextView) findViewById(R.id.textViewAnswer16CAX1);
		
		textViewAnswer1CAX1.setText(null);		textViewAnswer2CAX1.setText(null);		textViewAnswer3CAX1.setText(null);		textViewAnswer4CAX1.setText(null);
		textViewAnswer5CAX1.setText(null);		textViewAnswer6CAX1.setText(null);		textViewAnswer7CAX1.setText(null);		textViewAnswer8CAX1.setText(null);
		textViewAnswer9CAX1.setText(null);		textViewAnswer10CAX1.setText(null);		textViewAnswer11CAX1.setText(null);		textViewAnswer12CAX1.setText(null);
		textViewAnswer13CAX1.setText(null);		textViewAnswer14CAX1.setText(null);		textViewAnswer15CAX1.setText(null);		textViewAnswer16CAX1.setText(null);
		
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(15)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);
		TextViewTitleAnswerCAX1.setText("");
		
		EditTextTestCAX1 = (EditText) findViewById(R.id.EditTextTestCAX1);
		EditTextTestCAX1.setText("");
		
		if(randomInt == 1){

			String Acronym1Acronym ="TSDMP";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym1Acronym);

		}

		if(randomInt == 2){
			
			String Acronym2Acronym ="FIST AID MMM";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym2Acronym);
			
			

		}

		if(randomInt == 3){

			String Acronym3Acronym ="JAMMED CAR CAVIL";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym3Acronym);
			
			

		}

		if(randomInt == 4){

			String Acronym4Acronym ="BASTARD";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym4Acronym);
			
			
		}

		if(randomInt == 5){

			String Acronym5Acronym ="CERAMIC FAD";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym5Acronym);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Acronym ="BBC TEAM PIESS";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym6Acronym);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Acronym ="FIR" ;
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym7Acronym);
			
			
		}

		if(randomInt == 8){

			String Acronym8Acronym="CREATE GREAT LISTS";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym8Acronym);
			
			
		}

		if(randomInt == 9){

			String Acronym9Acronym ="GRIP" ;
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym9Acronym);
			
			
			
		}

		if(randomInt == 10){

			String Acronym10Acronym ="DAC IBURRR";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym10Acronym);
			
			
		}

		if(randomInt == 11){

			String Acronym11Acronym ="SERVICE";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym11Acronym);
			
			
		}

		if(randomInt == 12){

			String Acronym12Acronym ="CISCO";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym12Acronym);
			
			
		}

		if(randomInt == 13){

			String Acronym13Acronym ="FOP";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym13Acronym);
			
			
		}

		if(randomInt == 14){

			String Acronym14Acronym = "MUSSV";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym14Acronym);
			
			
		}
		
		if (randomInt==15){
			
			String Acronym14Acronym ="CRIED PIC";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym14Acronym);
			
			
		}



	}

	
	public void onClickTestYourselfAcronymCAX1(View v)
	{
		
		if (randomInt==1)
		{
			
			String Acronym1Answer1="The general economic and commercial environment";
			String Acronym1Answer2="Specifying the problem";
			String Acronym1Answer3="Developing the solution";
			String Acronym1Answer4="Monitoring the experience";
			String Acronym1Answer5="Professionalism";
			
			
			
			String Acronym1Answer1SubString = Acronym1Answer1.substring(0, 1); 
			String Acronym1Answer2SubString = Acronym1Answer2.substring(0, 1);
			String Acronym1Answer3SubString = Acronym1Answer3.substring(0, 1);
			String Acronym1Answer4SubString = Acronym1Answer4.substring(0, 1);
			String Acronym1Answer5SubString = Acronym1Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(Acronym1Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym1Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym1Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym1Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym1Answer5SubString);
			
			String Acronym="TSDMP";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			String Acronym2Answer1="Estimation of the financial impact of uncertain future events";
			String Acronym2Answer2="Allow for the impact of legislation, regulation, taxation, competition";
			String Acronym2Answer3="Recognition of stakeholders requirements and risk profiles";
			String Acronym2Answer4="A long term rather than short term horizon";
			String Acronym2Answer5="Use of assumptions based on appropriate historical experience";
			String Acronym2Answer6="Interpretation of the results of modelling to enable practical strategies to be developed";
			String Acronym2Answer7="Decisions need to be made in the short term in light of likely future outcomes";
			String Acronym2Answer8="Use of models to represent future financial outcomes";
			String Acronym2Answer9="Monitoring and periodically analysing the emerging experience";
			String Acronym2Answer10="Modifying models/strategies in light of this emerging experience";

			
			
			String Acronym2Answer1SubString = Acronym2Answer1.substring(0, 1); 
			String Acronym2Answer2SubString = Acronym2Answer2.substring(0, 1);
			String Acronym2Answer3SubString = Acronym2Answer3.substring(0, 1);
			String Acronym2Answer4SubString = Acronym2Answer4.substring(0, 1);
			String Acronym2Answer5SubString = Acronym2Answer5.substring(0, 1);
			String Acronym2Answer6SubString = Acronym2Answer6.substring(0, 1);
			String Acronym2Answer7SubString = Acronym2Answer7.substring(0, 1);
			String Acronym2Answer8SubString = Acronym2Answer8.substring(0, 1);
			String Acronym2Answer9SubString = Acronym2Answer9.substring(0, 1);
			String Acronym2Answer10SubString = Acronym2Answer10.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText("F");
			CAX1Answer1Letter2.setText("I");
			CAX1Answer1Letter3.setText("S");
			CAX1Answer1Letter4.setText("T");
			CAX1Answer1Letter5.setText("A");
			CAX1Answer1Letter6.setText("I");
			CAX1Answer1Letter7.setText("D");
			CAX1Answer1Letter8.setText("M");
			CAX1Answer1Letter9.setText("M");
			CAX1Answer1Letter10.setText("M");
			
			String Acronym="FIST AID MMM";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==3)
		{

			
			String Acronym3Answer1SubString = "J"; 
			String Acronym3Answer2SubString = "A";
			String Acronym3Answer3SubString = "M";
			String Acronym3Answer4SubString = "M";
			String Acronym3Answer5SubString = "E";
			String Acronym3Answer6SubString = "D";
			String Acronym3Answer7SubString = "C";
			String Acronym3Answer8SubString = "A";
			String Acronym3Answer9SubString = "R";
			String Acronym3Answer10SubString = "C";
			String Acronym3Answer11SubString = "A";
			String Acronym3Answer12SubString = "V";
			String Acronym3Answer13SubString = "I";
			String Acronym3Answer14SubString = "L";
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);

			CAX1Answer1Letter1.setText(Acronym3Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym3Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym3Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym3Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym3Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym3Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym3Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym3Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym3Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym3Answer10SubString);
			CAX1Answer1Letter11.setText(Acronym3Answer11SubString);
			CAX1Answer1Letter12.setText(Acronym3Answer12SubString);
			CAX1Answer1Letter13.setText(Acronym3Answer13SubString);
			CAX1Answer1Letter14.setText(Acronym3Answer14SubString);

			

			String Acronym="JAMMED CAR CAVIL";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			String Acronym4Answer1="Being reliable (detail, quality, timeliness)";
			String Acronym4Answer2="Acting with integrity and detachment from personal circumstances";
			String Acronym4Answer3="Skilled communication";
			String Acronym4Answer4="Taking responsibility for decisions";
			String Acronym4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String Acronym4Answer6="Recognising that others have valid views";
			String Acronym4Answer7="Developing a direct and trusting relationship with the client";


			
			
			String Acronym4Answer1SubString = Acronym4Answer1.substring(0, 1); 
			String Acronym4Answer2SubString = Acronym4Answer2.substring(0, 1);
			String Acronym4Answer3SubString = Acronym4Answer3.substring(0, 1);
			String Acronym4Answer4SubString = Acronym4Answer4.substring(0, 1);
			String Acronym4Answer5SubString = Acronym4Answer5.substring(0, 1);
			String Acronym4Answer6SubString = Acronym4Answer6.substring(0, 1);
			String Acronym4Answer7SubString = Acronym4Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(Acronym4Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym4Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym4Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym4Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym4Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym4Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym4Answer7SubString);
			
			String Acronym="BASTARD";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText("C");
			CAX1Answer1Letter2.setText("E");
			CAX1Answer1Letter3.setText("R");
			CAX1Answer1Letter4.setText("A");
			CAX1Answer1Letter5.setText("M");
			CAX1Answer1Letter6.setText("I");
			CAX1Answer1Letter7.setText("C");
			CAX1Answer1Letter8.setText("F");
			CAX1Answer1Letter9.setText("A");
			CAX1Answer1Letter10.setText("D");
			
			String Acronym="CERAMIC FAD";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
			String Acronym6Answer1="Banks";
			String Acronym6Answer2="Board of directors";
			String Acronym6Answer3="Creditors of insurance companies";
			String Acronym6Answer4="Trustees of benefit schemes";
			String Acronym6Answer5="Employers";
			String Acronym6Answer6="Auditiors of insurance companies";
			String Acronym6Answer7="Members of benefit/investment schemes and their dependents";
			String Acronym6Answer8="Policyholders/prospective policyholders";
			String Acronym6Answer9="Investment fund managers";
			String Acronym6Answer10="Employees";
			String Acronym6Answer11="Shareholders";
			String Acronym6Answer12="Sponsors of benefit schemes/capital projects";

			
			
			String Acronym6Answer1SubString = Acronym6Answer1.substring(0, 1); 
			String Acronym6Answer2SubString = Acronym6Answer2.substring(0, 1);
			String Acronym6Answer3SubString = Acronym6Answer3.substring(0, 1);
			String Acronym6Answer4SubString = Acronym6Answer4.substring(0, 1);
			String Acronym6Answer5SubString = Acronym6Answer5.substring(0, 1); 
			String Acronym6Answer6SubString = Acronym6Answer6.substring(0, 1);
			String Acronym6Answer7SubString = Acronym6Answer7.substring(0, 1);
			String Acronym6Answer8SubString = Acronym6Answer8.substring(0, 1);
			String Acronym6Answer9SubString = Acronym6Answer9.substring(0, 1); 
			String Acronym6Answer10SubString = Acronym6Answer10.substring(0, 1);
			String Acronym6Answer11SubString = Acronym6Answer11.substring(0, 1);
			String Acronym6Answer12SubString = Acronym6Answer12.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);	CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
			
			CAX1Answer1Letter1.setText(Acronym6Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym6Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym6Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym6Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym6Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym6Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym6Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym6Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym6Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym6Answer10SubString);
			CAX1Answer1Letter11.setText(Acronym6Answer11SubString);		CAX1Answer1Letter12.setText(Acronym6Answer12SubString);
			
			String Acronym="BBC TEAM PIESS";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			String Acronym7Answer1="Factual advise - based on research of facts - eg legislation";
			String Acronym7Answer2="Indicative advice - giving an opinion without fully investigating the issues - eg in response to a direct oral question";
			String Acronym7Answer3="Recommendations - researched and modelled forecasts, alternatives weighted, recommendations made consistent with requirements";

			
			
			String Acronym7Answer1SubString = Acronym7Answer1.substring(0, 1); 
			String Acronym7Answer2SubString = Acronym7Answer2.substring(0, 1);
			String Acronym7Answer3SubString = Acronym7Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);	

			CAX1Answer1Letter1.setText(Acronym7Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym7Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym7Answer3SubString);
			
			String Acronym="FIR";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			String Acronym8Answer1="Commercial requirements";
			String Acronym8Answer2="Regulation and legislation";
			String Acronym8Answer3="Environmental issues";
			String Acronym8Answer4="Accounting standards";
			String Acronym8Answer5="Tax";
			String Acronym8Answer6="Economic outlook";
			String Acronym8Answer7="Governance - corporate";
			String Acronym8Answer8="Risk managment requirements";
			String Acronym8Answer9="Experience from overseas";
			String Acronym8Answer10="Adequacy of capital";
			String Acronym8Answer11="Trends - demographic";
			String Acronym8Answer12="Lifestyle considerations";
			String Acronym8Answer13="Institutional structure";
			String Acronym8Answer14="Social and cultural trends";
			String Acronym8Answer15="Technology";
			String Acronym8Answer16="State benefits";

			
			
			String Acronym9Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym9Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym9Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym9Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym9Answer5SubString = Acronym8Answer5.substring(0, 1);
			String Acronym9Answer6SubString = Acronym8Answer6.substring(0, 1);
			String Acronym9Answer7SubString = Acronym8Answer7.substring(0, 1);
			String Acronym9Answer8SubString = Acronym8Answer8.substring(0, 1);
			String Acronym9Answer9SubString = Acronym8Answer9.substring(0, 1);
			String Acronym9Answer10SubString = Acronym8Answer10.substring(0, 1);
			String Acronym9Answer11SubString = Acronym8Answer11.substring(0, 1);
			String Acronym9Answer12SubString = Acronym8Answer12.substring(0, 1);
			String Acronym9Answer13SubString = Acronym8Answer13.substring(0, 1);
			String Acronym9Answer14SubString = Acronym8Answer14.substring(0, 1);
			String Acronym9Answer15SubString = Acronym8Answer15.substring(0, 1);
			String Acronym9Answer16SubString = Acronym8Answer16.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
			CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
			CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);
			CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);

			CAX1Answer1Letter1.setText(Acronym9Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym9Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym9Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym9Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym9Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym9Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym9Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym9Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym9Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym9Answer10SubString);
			CAX1Answer1Letter11.setText(Acronym9Answer11SubString);
			CAX1Answer1Letter12.setText(Acronym9Answer12SubString);
			CAX1Answer1Letter13.setText(Acronym9Answer13SubString);
			CAX1Answer1Letter14.setText(Acronym9Answer14SubString);
			CAX1Answer1Letter15.setText(Acronym9Answer15SubString);
			CAX1Answer1Letter16.setText(Acronym9Answer16SubString);
			
			String Acronym="CREATE GREAT LISTS";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			String Acronym9Answer1="Give confidence in the financial system";
			String Acronym9Answer2="Reduce financial crime";
			String Acronym9Answer3="Correct inefficiencies in the market and promote efficient and orderly markets";
			String Acronym9Answer4="Protect consumers of financial products";

			
			
			String Acronym9Answer1SubString = Acronym9Answer1.substring(0, 1); 
			String Acronym9Answer2SubString = Acronym9Answer2.substring(0, 1);
			String Acronym9Answer3SubString = Acronym9Answer3.substring(0, 1);
			String Acronym9Answer4SubString = Acronym9Answer4.substring(0, 1);
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			

			CAX1Answer1Letter1.setText("G");
			CAX1Answer1Letter2.setText("R");
			CAX1Answer1Letter3.setText("I");
			CAX1Answer1Letter4.setText("P");
			
			String Acronym="GRIP";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			String Acronym8Answer1="Direct costs";
			String Acronym8Answer2="Admin costs";
			String Acronym8Answer3="Complicance costs";
			String Acronym8Answer4="Indirect costs";
			String Acronym8Answer5="Behaviour change in consumers, false sense of security, reduced sense of responsibility for own actions";
			String Acronym8Answer6="Undermining the sense of responsibility amongst advisors and intermediaries";
			String Acronym8Answer7="Reduction in consumer protection mechanisms";
			String Acronym8Answer8="Reduced product innovation";
			String Acronym8Answer9="Reduced competition";


			
			
			String Acronym9Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym9Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym9Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym9Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym9Answer5SubString = Acronym8Answer5.substring(0, 1);
			String Acronym9Answer6SubString = Acronym8Answer6.substring(0, 1);
			String Acronym9Answer7SubString = Acronym8Answer7.substring(0, 1);
			String Acronym9Answer8SubString = Acronym8Answer8.substring(0, 1);
			String Acronym9Answer9SubString = Acronym8Answer9.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);

			CAX1Answer1Letter1.setText(Acronym9Answer1SubString);			CAX1Answer1Letter2.setText(Acronym9Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym9Answer3SubString);			CAX1Answer1Letter4.setText(Acronym9Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym9Answer5SubString);			CAX1Answer1Letter6.setText(Acronym9Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym9Answer7SubString);			CAX1Answer1Letter8.setText(Acronym9Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym9Answer9SubString);
			
			String Acronym="DAC IBURRR";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			String Acronym8Answer1="Setting sanctions";
			String Acronym8Answer2="Enforcing regulations";
			String Acronym8Answer3="Reviewing and influencing government policy";
			String Acronym8Answer4="Vetting and registering firms and individuals";
			String Acronym8Answer5="Investigating breaches";
			String Acronym8Answer6="Checking management and conduct of providers";
			String Acronym8Answer7="Educating consumers and the public";


			
			
			String Acronym9Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym9Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym9Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym9Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym9Answer5SubString = Acronym8Answer5.substring(0, 1);
			String Acronym9Answer6SubString = Acronym8Answer6.substring(0, 1);
			String Acronym9Answer7SubString = Acronym8Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(Acronym9Answer1SubString);			CAX1Answer1Letter2.setText(Acronym9Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym9Answer3SubString);			CAX1Answer1Letter4.setText(Acronym9Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym9Answer5SubString);			CAX1Answer1Letter6.setText(Acronym9Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym9Answer7SubString);
			
			String Acronym="SERVICE";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==12){
			
			String Acronym8Answer1="Capital adequacy of provider";
			String Acronym8Answer2="Integrity, competence of practitioners";
			String Acronym8Answer3="Stock exchange requirements";
			String Acronym8Answer4="Compensation schemes";
			String Acronym8Answer5="Orderly and transparent markets";


			
			
			String Acronym12Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym12Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym12Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym12Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym12Answer5SubString = Acronym8Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);

			CAX1Answer1Letter1.setText(Acronym12Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym12Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym12Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym12Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym12Answer5SubString);
			
			String Acronym="CISCO";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==13){
			
			String Acronym13Answer1="Freedom of action";
			String Acronym13Answer2="Outcome based";
			String Acronym13Answer3="Prescriptive";


			
			
			String Acronym13Answer1SubString = Acronym13Answer1.substring(0, 1); 
			String Acronym13Answer2SubString = Acronym13Answer2.substring(0, 1);
			String Acronym13Answer3SubString = Acronym13Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);

			CAX1Answer1Letter1.setText(Acronym13Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym13Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym13Answer3SubString);
			
			String Acronym="FOP";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==14){
			
			String Acronym14Answer1="Mixed regime";
			String Acronym14Answer2="Unregulated markets";
			String Acronym14Answer3="Statutory";
			String Acronym14Answer4="Self-regulation";
			String Acronym14Answer5="Voluntary codes of conduct";
			
			
			String Acronym14Answer1SubString = Acronym14Answer1.substring(0, 1); 
			String Acronym14Answer2SubString = Acronym14Answer2.substring(0, 1);
			String Acronym14Answer3SubString = Acronym14Answer3.substring(0, 1);
			String Acronym14Answer4SubString = Acronym14Answer4.substring(0, 1);
			String Acronym14Answer5SubString = Acronym14Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(Acronym14Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym14Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym14Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym14Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym14Answer5SubString);
			
			String Acronym="MUSSV";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
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
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			
			
			CAX1Answer1Letter1.setText(Acronym14Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym14Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym14Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym14Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym14Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym14Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym14Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym14Answer8SubString);
			
			String Acronym="CRIED PIC";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
	}
	
	public void onClickGetTitleCAX1(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(15)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);
		TextViewTitleAnswerCAX1.setText(null);
		
		EditTextTestCAX1 = (EditText) findViewById(R.id.EditTextTestCAX1);
		EditTextTestCAX1.setText(null);
		
		CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
		CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
		CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
		CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);		CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);		CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
		CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);		CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);
		
		CAX1Answer1Letter1.setText(null);		CAX1Answer1Letter2.setText(null);		CAX1Answer1Letter3.setText(null);
		CAX1Answer1Letter4.setText(null);		CAX1Answer1Letter5.setText(null);		CAX1Answer1Letter6.setText(null);
		CAX1Answer1Letter7.setText(null);		CAX1Answer1Letter8.setText(null);		CAX1Answer1Letter9.setText(null);
		CAX1Answer1Letter10.setText(null);		CAX1Answer1Letter11.setText(null);		CAX1Answer1Letter12.setText(null);
		CAX1Answer1Letter13.setText(null);		CAX1Answer1Letter13.setText(null);		CAX1Answer1Letter14.setText(null);
		CAX1Answer1Letter15.setText(null);		CAX1Answer1Letter16.setText(null);
		
		
		
		EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
		EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
		EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
		EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
		EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
		EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
		EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
		EditTextCAX1Answer15 = (EditText)findViewById(R.id.EditTextCAX1Answer15);		EditTextCAX1Answer16 = (EditText)findViewById(R.id.EditTextCAX1Answer16);
		
		EditTextCAX1Answer1.setText(null);		EditTextCAX1Answer2.setText(null);		EditTextCAX1Answer3.setText(null);
		EditTextCAX1Answer4.setText(null);		EditTextCAX1Answer5.setText(null);		EditTextCAX1Answer6.setText(null);
		EditTextCAX1Answer7.setText(null);		EditTextCAX1Answer8.setText(null);		EditTextCAX1Answer9.setText(null);
		EditTextCAX1Answer10.setText(null);		EditTextCAX1Answer11.setText(null);		EditTextCAX1Answer12.setText(null);
		EditTextCAX1Answer13.setText(null);		EditTextCAX1Answer14.setText(null);		EditTextCAX1Answer15.setText(null);
		EditTextCAX1Answer16.setText(null);
		
		textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
		textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
		textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
		textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
		textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
		textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
		textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
		textViewAnswer15CAX1 = (TextView) findViewById(R.id.textViewAnswer15CAX1);		textViewAnswer16CAX1 = (TextView) findViewById(R.id.textViewAnswer16CAX1);
		
		textViewAnswer1CAX1.setText(null);		textViewAnswer2CAX1.setText(null);		textViewAnswer3CAX1.setText(null);
		textViewAnswer4CAX1.setText(null);		textViewAnswer5CAX1.setText(null);		textViewAnswer6CAX1.setText(null);
		textViewAnswer7CAX1.setText(null);		textViewAnswer8CAX1.setText(null);		textViewAnswer9CAX1.setText(null);
		textViewAnswer10CAX1.setText(null);		textViewAnswer11CAX1.setText(null);		textViewAnswer12CAX1.setText(null);
		textViewAnswer13CAX1.setText(null);		textViewAnswer14CAX1.setText(null);		textViewAnswer15CAX1.setText(null);
		textViewAnswer16CAX1.setText(null);
		
		
		if(randomInt == 1){

			String Acronym1Title = "The Actuarial Control Cycle (ACC)";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym1Title);
			
			

		}

		if(randomInt == 2){
			
			String Acronym2Title = "What makes the ACC actuarial";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym2Title);
			
			
		}

		if(randomInt == 3){

			String Acronym3Title = "What actuaries do?";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym3Title);
			
			

		}

		if(randomInt == 4){

			String Acronym4Title = "How to be a professional";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym4Title);
			
			
		}

		if(randomInt == 5){

			String Acronym5Title = "Carrying out an actuarial task";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym5Title);
			
			
		}

		if(randomInt == 6){
			
			

			String Acronym6Title = "Possible clients actuaries advise";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym6Title);
			
			
		}

		if(randomInt == 7){
			
			

			String Acronym7Title = "Types of advice";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym7Title);
			
			
		}

		if(randomInt == 8){

			String Acronym8Title = "The External Environment";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym8Title);
			
			
		}

		if(randomInt == 9){

			String Acronym9Title = "The aims of regulation";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym9Title);
			
			
			
		}

		if(randomInt == 10){

			String Acronym10Title = "Cost of regulation";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym10Title);
			
			
		}

		if(randomInt == 11){

			String Acronym11Title = "Fuctions of a regulator";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym11Title);
			
			
		}

		if(randomInt == 12){

			String Acronym12Title ="Regulation - Maintaing confidence";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym12Title);
			
			
		}

		if(randomInt == 13){

			String Acronym13Title = "Forms of regulation";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym13Title);
			
			
		}

		if(randomInt == 14){

			String Acronym14Title = "Types of regulatory regime";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym14Title);
			
			
		}
		
		if (randomInt==15){
			
			String Acronym14Title = "Methods of reducing asymmetric information";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(Acronym14Title);
			
			
		}


	}

	
	
	public void onClickTestYourselfTitleCAX1(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym1Answer1="The general economic and commercial environment";
			String Acronym1Answer2="Specifying the problem";
			String Acronym1Answer3="Developing the solution";
			String Acronym1Answer4="Monitoring the experience";
			String Acronym1Answer5="Professionalism";
			
			
			
			String Acronym1Answer1SubString = Acronym1Answer1.substring(0, 1); 
			String Acronym1Answer2SubString = Acronym1Answer2.substring(0, 1);
			String Acronym1Answer3SubString = Acronym1Answer3.substring(0, 1);
			String Acronym1Answer4SubString = Acronym1Answer4.substring(0, 1);
			String Acronym1Answer5SubString = Acronym1Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(Acronym1Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym1Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym1Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym1Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym1Answer5SubString);
			
			String Acronym="The Actuarial Control Cycle (ACC)";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
			
		}

		if (randomInt==2)
		{

			
			
			String Acronym2Answer1SubString =  "F";
			String Acronym2Answer2SubString ="I";
			String Acronym2Answer3SubString ="S";
			String Acronym2Answer4SubString ="T";
			String Acronym2Answer5SubString ="A";
			String Acronym2Answer6SubString ="I";
			String Acronym2Answer7SubString ="D";
			String Acronym2Answer8SubString ="M";
			String Acronym2Answer9SubString ="M";
			String Acronym2Answer10SubString ="M";
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText(Acronym2Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym2Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym2Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym2Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym2Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym2Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym2Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym2Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym2Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym2Answer10SubString);

			
			String Acronym="What makes the ACC actuarial";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			
			String Acronym3Answer1="Form judgements about future inflation and interest rates";
			String Acronym3Answer2="Handle assumption in a critical manner";
			String Acronym3Answer3="Models - build, parameterise, test and implement them";
			String Acronym3Answer4="Margins - build them into assumptions and appreciate their impact";
			String Acronym3Answer5="Estimate payments that need to be met using data on future liabilities";
			String Acronym3Answer6="Handle data in a critical manner";
			String Acronym3Answer7="Project and discount future cashflows using assumptions";
			String Acronym3Answer8="Monitor the progress of the accumulation of a fund";
			String Acronym3Answer9="Advise on reinsurance and other risk transfer mechanisms";
			String Acronym3Answer10="Calculate contributions needed over time to meet future liabilities";
			String Acronym3Answer11="Manage the build up of assets to meet future liabilities";
			String Acronym3Answer12="Analyse variation between actual and expected experience";
			String Acronym3Answer13="Contribute to decisions on investment policies to meet future liabilities";
			String Acronym3Answer14="Manage variation of a fund to ensure that future liabilities are met";

			
			
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
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);

			CAX1Answer1Letter1.setText(Acronym3Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym3Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym3Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym3Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym3Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym3Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym3Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym3Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym3Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym3Answer10SubString);
			CAX1Answer1Letter11.setText(Acronym3Answer11SubString);
			CAX1Answer1Letter12.setText(Acronym3Answer12SubString);
			CAX1Answer1Letter13.setText(Acronym3Answer13SubString);
			CAX1Answer1Letter14.setText(Acronym3Answer14SubString);
			

			String Acronym="What actuaries do?";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			String Acronym4Answer1="Being reliable (detail, quality, timeliness)";
			String Acronym4Answer2="Acting with integrity and detachment from personal circumstances";
			String Acronym4Answer3="Skilled communication";
			String Acronym4Answer4="Taking responsibility for decisions";
			String Acronym4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String Acronym4Answer6="Recognising that others have valid views";
			String Acronym4Answer7="Developing a direct and trusting relationship with the client";


			
			
			String Acronym4Answer1SubString = Acronym4Answer1.substring(0, 1); 
			String Acronym4Answer2SubString = Acronym4Answer2.substring(0, 1);
			String Acronym4Answer3SubString = Acronym4Answer3.substring(0, 1);
			String Acronym4Answer4SubString = Acronym4Answer4.substring(0, 1);
			String Acronym4Answer5SubString = Acronym4Answer5.substring(0, 1);
			String Acronym4Answer6SubString = Acronym4Answer6.substring(0, 1);
			String Acronym4Answer7SubString = Acronym4Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(Acronym4Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym4Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym4Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym4Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym4Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym4Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym4Answer7SubString);
			
			String Acronym="How to be a professional";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			String Acronym5Answer1="Communicate the answer in a way that is understoodby the client";
			String Acronym5Answer2="Establish what are the questions that need answering";
			String Acronym5Answer3="Consider resources and timescales";
			String Acronym5Answer4="Set assumptions";
			String Acronym5Answer5="Decide on a method";
			String Acronym5Answer6="Consider the professional implications of the work being done";
			String Acronym5Answer7="Check the solution and get somebody else to check it";
			String Acronym5Answer8="Ensure he/she is familiar with the context in which he/she is going to operate and the implications of the results";
			String Acronym5Answer9="Arrive at the solution";
			String Acronym5Answer10="Define the task with the client and consider conflicts of interests";

			
			
			String Acronym3Answer1SubString = Acronym5Answer1.substring(0, 1); 
			String Acronym3Answer2SubString = Acronym5Answer2.substring(0, 1);
			String Acronym3Answer3SubString = Acronym5Answer3.substring(0, 1);
			String Acronym3Answer4SubString = Acronym5Answer4.substring(0, 1);
			String Acronym3Answer5SubString = Acronym5Answer5.substring(0, 1);
			String Acronym3Answer6SubString = Acronym5Answer6.substring(0, 1);
			String Acronym3Answer7SubString = Acronym5Answer7.substring(0, 1);
			String Acronym3Answer8SubString = Acronym5Answer8.substring(0, 1);
			String Acronym3Answer9SubString = Acronym5Answer9.substring(0, 1);
			String Acronym3Answer10SubString = Acronym5Answer10.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText(Acronym3Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym3Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym3Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym3Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym3Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym3Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym3Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym3Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym3Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym3Answer10SubString);
			
			String Acronym="Carrying out an actuarial task";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
			String Acronym6Answer1="Banks";
			String Acronym6Answer2="Creditors of insurance companies";
			String Acronym6Answer3="Trustees of benefit schemes";
			String Acronym6Answer4="Employers";
			String Acronym6Answer5="Auditiors of insurance companies";
			String Acronym6Answer6="Members of benefit/investment schemes and their dependents";
			String Acronym6Answer7="Policyholders/prospective policyholders";
			String Acronym6Answer8="Investment fund managers";
			String Acronym6Answer9="Employees";
			String Acronym6Answer10="Shareholders";
			String Acronym6Answer11="Sponsors of benefit schemes/capital projects";

			
			
			String Acronym6Answer1SubString = Acronym6Answer1.substring(0, 1); 
			String Acronym6Answer2SubString = Acronym6Answer2.substring(0, 1);
			String Acronym6Answer3SubString = Acronym6Answer3.substring(0, 1);
			String Acronym6Answer4SubString = Acronym6Answer4.substring(0, 1);
			String Acronym6Answer5SubString = Acronym6Answer5.substring(0, 1); 
			String Acronym6Answer6SubString = Acronym6Answer6.substring(0, 1);
			String Acronym6Answer7SubString = Acronym6Answer7.substring(0, 1);
			String Acronym6Answer8SubString = Acronym6Answer8.substring(0, 1);
			String Acronym6Answer9SubString = Acronym6Answer9.substring(0, 1); 
			String Acronym6Answer10SubString = Acronym6Answer10.substring(0, 1);
			String Acronym6Answer11SubString = Acronym6Answer11.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			
			CAX1Answer1Letter1.setText(Acronym6Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym6Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym6Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym6Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym6Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym6Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym6Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym6Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym6Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym6Answer10SubString);
			CAX1Answer1Letter11.setText(Acronym6Answer11SubString);
			
			String Acronym="Possible clients actuaries advise";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			String Acronym7Answer1="Factual advise - based on research of facts - eg legislation";
			String Acronym7Answer2="Indicative advice - giving an opinion without fully investigating the issues - eg in response to a direct oral question";
			String Acronym7Answer3="Recommendations - researched and modelled forecasts, alternatives weighted, recommendations made consistent with requirements";

			
			
			String Acronym7Answer1SubString = Acronym7Answer1.substring(0, 1); 
			String Acronym7Answer2SubString = Acronym7Answer2.substring(0, 1);
			String Acronym7Answer3SubString = Acronym7Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);	

			CAX1Answer1Letter1.setText(Acronym7Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym7Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym7Answer3SubString);
			
			String Acronym="Types of advice";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			String Acronym8Answer1="Commercial requirements";
			String Acronym8Answer2="Regulation and legislation";
			String Acronym8Answer3="Environmental issues";
			String Acronym8Answer4="Accounting standards";
			String Acronym8Answer5="Tax";
			String Acronym8Answer6="Economic outlook";
			String Acronym8Answer7="Governance - corporate";
			String Acronym8Answer8="Risk managment requirements";
			String Acronym8Answer9="Experience from overseas";
			String Acronym8Answer10="Adequacy of capital";
			String Acronym8Answer11="Trends - demographic";
			String Acronym8Answer12="Lifestyle considerations";
			String Acronym8Answer13="Institutional structure";
			String Acronym8Answer14="Social and cultural trends";
			String Acronym8Answer15="Technology";
			String Acronym8Answer16="State benefits";

			
			
			String Acronym9Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym9Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym9Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym9Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym9Answer5SubString = Acronym8Answer5.substring(0, 1);
			String Acronym9Answer6SubString = Acronym8Answer6.substring(0, 1);
			String Acronym9Answer7SubString = Acronym8Answer7.substring(0, 1);
			String Acronym9Answer8SubString = Acronym8Answer8.substring(0, 1);
			String Acronym9Answer9SubString = Acronym8Answer9.substring(0, 1);
			String Acronym9Answer10SubString = Acronym8Answer10.substring(0, 1);
			String Acronym9Answer11SubString = Acronym8Answer11.substring(0, 1);
			String Acronym9Answer12SubString = Acronym8Answer12.substring(0, 1);
			String Acronym9Answer13SubString = Acronym8Answer13.substring(0, 1);
			String Acronym9Answer14SubString = Acronym8Answer14.substring(0, 1);
			String Acronym9Answer15SubString = Acronym8Answer15.substring(0, 1);
			String Acronym9Answer16SubString = Acronym8Answer16.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
			CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
			CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);
			CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);

			CAX1Answer1Letter1.setText(Acronym9Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym9Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym9Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym9Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym9Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym9Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym9Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym9Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym9Answer9SubString);
			CAX1Answer1Letter10.setText(Acronym9Answer10SubString);
			CAX1Answer1Letter11.setText(Acronym9Answer11SubString);
			CAX1Answer1Letter12.setText(Acronym9Answer12SubString);
			CAX1Answer1Letter13.setText(Acronym9Answer13SubString);
			CAX1Answer1Letter14.setText(Acronym9Answer14SubString);
			CAX1Answer1Letter15.setText(Acronym9Answer15SubString);
			CAX1Answer1Letter16.setText(Acronym9Answer16SubString);
			
			String Acronym="The External Environment";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			String Acronym9Answer1SubString = "G";
			String Acronym9Answer2SubString = "R";
			String Acronym9Answer3SubString = "I";
			String Acronym9Answer4SubString = "P";
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			

			CAX1Answer1Letter1.setText(Acronym9Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym9Answer2SubString);
			CAX1Answer1Letter3.setText("I");
			CAX1Answer1Letter4.setText(Acronym9Answer4SubString);
			
			String Acronym="The aims of regulation";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			String Acronym8Answer1="Direct costs";
			String Acronym8Answer2="Admin costs";
			String Acronym8Answer3="Complicance costs";
			String Acronym8Answer4="Indirect costs";
			String Acronym8Answer5="Behaviour change in consumers, false sense of security, reduced sense of responsibility for own actions";
			String Acronym8Answer6="Undermining the sense of responsibility amongst advisors and intermediaries";
			String Acronym8Answer7="Reduction in consumer protection mechanisms";
			String Acronym8Answer8="Reduced product innovation";
			String Acronym8Answer9="Reduced competition";


			
			
			String Acronym9Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym9Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym9Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym9Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym9Answer5SubString = Acronym8Answer5.substring(0, 1);
			String Acronym9Answer6SubString = Acronym8Answer6.substring(0, 1);
			String Acronym9Answer7SubString = Acronym8Answer7.substring(0, 1);
			String Acronym9Answer8SubString = Acronym8Answer8.substring(0, 1);
			String Acronym9Answer9SubString = Acronym8Answer9.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);

			CAX1Answer1Letter1.setText(Acronym9Answer1SubString);			CAX1Answer1Letter2.setText(Acronym9Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym9Answer3SubString);			CAX1Answer1Letter4.setText(Acronym9Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym9Answer5SubString);			CAX1Answer1Letter6.setText(Acronym9Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym9Answer7SubString);			CAX1Answer1Letter8.setText(Acronym9Answer8SubString);
			CAX1Answer1Letter9.setText(Acronym9Answer9SubString);
			
			String Acronym="Cost of regulation";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			String Acronym8Answer1="Setting sanctions";
			String Acronym8Answer2="Enforcing regulations";
			String Acronym8Answer3="Reviewing and influencing government policy";
			String Acronym8Answer4="Vetting and registering firms and individuals";
			String Acronym8Answer5="Investigating breaches";
			String Acronym8Answer6="Checking management and conduct of providers";
			String Acronym8Answer7="Educating consumers and the public";


			
			
			String Acronym9Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym9Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym9Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym9Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym9Answer5SubString = Acronym8Answer5.substring(0, 1);
			String Acronym9Answer6SubString = Acronym8Answer6.substring(0, 1);
			String Acronym9Answer7SubString = Acronym8Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(Acronym9Answer1SubString);			CAX1Answer1Letter2.setText(Acronym9Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym9Answer3SubString);			CAX1Answer1Letter4.setText(Acronym9Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym9Answer5SubString);			CAX1Answer1Letter6.setText(Acronym9Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym9Answer7SubString);
			
			String Acronym="Fuctions of a regulator";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==12){
			
			String Acronym8Answer1="Capital adequacy of provider";
			String Acronym8Answer2="Integrity, competence of practitioners";
			String Acronym8Answer3="Stock exchange requirements";
			String Acronym8Answer4="Compensation schemes";
			String Acronym8Answer5="Orderly and transparent markets";


			
			
			String Acronym12Answer1SubString = Acronym8Answer1.substring(0, 1); 
			String Acronym12Answer2SubString = Acronym8Answer2.substring(0, 1);
			String Acronym12Answer3SubString = Acronym8Answer3.substring(0, 1);
			String Acronym12Answer4SubString = Acronym8Answer4.substring(0, 1);
			String Acronym12Answer5SubString = Acronym8Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);

			CAX1Answer1Letter1.setText(Acronym12Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym12Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym12Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym12Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym12Answer5SubString);
			
			String Acronym="Regulation - Maintaing confidence";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==13){
			
			String Acronym13Answer1="Freedom of action";
			String Acronym13Answer2="Outcome based";
			String Acronym13Answer3="Prescriptive";


			
			
			String Acronym13Answer1SubString = Acronym13Answer1.substring(0, 1); 
			String Acronym13Answer2SubString = Acronym13Answer2.substring(0, 1);
			String Acronym13Answer3SubString = Acronym13Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);

			CAX1Answer1Letter1.setText(Acronym13Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym13Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym13Answer3SubString);
			
			String Acronym="Forms of regulation";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==14){
			
			String Acronym14Answer1="Mixed regime";
			String Acronym14Answer2="Unregulated markets";
			String Acronym14Answer3="Statutory";
			String Acronym14Answer4="Self-regulation";
			String Acronym14Answer5="Voluntary codes of conduct";


			
			
			String Acronym14Answer1SubString = Acronym14Answer1.substring(0, 1); 
			String Acronym14Answer2SubString = Acronym14Answer2.substring(0, 1);
			String Acronym14Answer3SubString = Acronym14Answer3.substring(0, 1);
			String Acronym14Answer4SubString = Acronym14Answer4.substring(0, 1);
			String Acronym14Answer5SubString = Acronym14Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(Acronym14Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym14Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym14Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym14Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym14Answer5SubString);
			
			String Acronym="Types of regulatory regime";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
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
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			
			CAX1Answer1Letter1.setText(Acronym14Answer1SubString);
			CAX1Answer1Letter2.setText(Acronym14Answer2SubString);
			CAX1Answer1Letter3.setText(Acronym14Answer3SubString);
			CAX1Answer1Letter4.setText(Acronym14Answer4SubString);
			CAX1Answer1Letter5.setText(Acronym14Answer5SubString);
			CAX1Answer1Letter6.setText(Acronym14Answer6SubString);
			CAX1Answer1Letter7.setText(Acronym14Answer7SubString);
			CAX1Answer1Letter8.setText(Acronym14Answer8SubString);
			
			String Acronym="Methods of reducing asymmetric information";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cax1, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_cax1, container,
					false);
			return rootView;
		}
	}

}
