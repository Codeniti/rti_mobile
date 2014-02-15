package com.example.generaterti;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerList extends Activity implements OnItemSelectedListener{

	ListView list;
	Spinner spinner1;
	RelativeLayout rl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sub_brief);
	    spinner1 = (Spinner) findViewById(R.id.spinner1);
	    rl = (RelativeLayout) findViewById(R.id.relativeLayout1);
	    spinner1.setOnItemSelectedListener(this);
	   
	   
	}
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
		generateEditText(arg2);
		
		
	}
	
	private void generateEditText(int a) {
		// TODO Auto-generated method stub
					
		
		switch(a)
		{
		
		
		case 0:
			
			rl.removeAllViews();
			int i=0;
			while(i<10)
			{
			RelativeLayout.LayoutParams lp0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
    		EditText cb0 = new EditText(getApplicationContext());
    		
    		cb0.setId(i);
            cb0.setTextColor(Color.BLACK);
            
            
            if(i==0)
            	cb0.setText("");
            if(i==1)
            	cb0.setText("1. Please let me know the balance in my account excluding interest.");
            if(i==2)
            	cb0.setText("2. Please let me know the current balance in my account including interest.");
            if(i==3)
            	cb0.setText("3. As of reply date; please inform me the Name, Designation, phone number and email address of all Officer(s) who are involved in processing of PF/EPF Form 10 C claims.");
            if(i==4)
            	cb0.setText("4. File number of my PF/EPF claim application ( Form 10 C).");
            if(i==5)
            	cb0.setText("5. Certified Copy of excerpts of the Rules / Regulation / Notification / Order / Circular / Memo / Norms / Guidelines / Direction, prescribing time frame for processing of Form 10 C claims.");
            if(i==6)
            	cb0.setText("6. Name and Designation of the officer to complain, on non disposal of the application within the time frame.");
            if(i==7)
            	cb0.setText("7. Certified copies of all correspondences sent / received for disposal of my application.");
            if(i==8)
            	cb0.setText("8. Claim ID generated against my claim application.");
            if(i==9)
            	cb0.setText("9. Please provide me the details of First Appellate Authority u/s 7(8) of RTI Act, 2005 with detailed postal and email address.");
            
            if(i>0)
                lp0.addRule(RelativeLayout.BELOW,i-1);
            else
            	lp0.addRule(RelativeLayout.BELOW,R.id.spinner1);
            cb0.setLayoutParams(lp0);
            rl.addView(cb0);
            i++;
            
            
			}          
			break;
			
		case 1:
			rl.removeAllViews();
			
			i=0;
			while(i<10)
			{
			RelativeLayout.LayoutParams lp0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
    		EditText cb0 = new EditText(getApplicationContext());
    		
    		cb0.setId(i);
            cb0.setTextColor(Color.BLACK);
            
            
            if(i==0)
            	cb0.setText("");
            if(i==1)
            	cb0.setText("1. Please provide the daily progress made on my complaint.");
            if(i==2)
            	cb0.setText("2. Names and designations of the officials with whom my complaint was 	lying during this period. Please intimate the periods, when it was	lying with which officer and what was the action taken by that official during that period.");
            if(i==3)
            	cb0.setText("3. Certified copies of all correspondences sent / received for disposal of my complaint.");
            if(i==4)
            	cb0.setText("4. According to your Rules / Regulation / Notification / Order / Circular	/ Memo / Norms / Guidelines / Direction / citizens charter, in how	many days should such a matter be dealt with and resolved. Please provide me the certified copy of the relevant document.");
            if(i==5)
            	cb0.setText("5. Provide me the certified copy of conduct service rule / regulation	having provision to take disciplinary action for non adherence to	the timeframe.");
            if(i==6)
            	cb0.setText("6. Provide the certified copy of File Noting related to the complaint.");
            if(i==7)
            	cb0.setText("7. Provide the certified copy of Work Order pertaining to my complaint, if any.");
            if(i==8)
            	cb0.setText("8. Please provide me the details of First Appellate Authority u/s 7(8)of RTI Act, 2005 with detailed postal and email address.");
            
            if(i>0)
                lp0.addRule(RelativeLayout.BELOW,i-1);
            else
            	lp0.addRule(RelativeLayout.BELOW,R.id.spinner1);
            cb0.setLayoutParams(lp0);
            rl.addView(cb0);
            i++;
			
			}
			break;
			
		case 2:
			
			rl.removeAllViews();
			
			i=0;
			while(i<10)
			{
			RelativeLayout.LayoutParams lp0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
    		EditText cb0 = new EditText(getApplicationContext());
    		
    		cb0.setId(i);
            cb0.setTextColor(Color.BLACK);
            
            
            if(i==0)
            	cb0.setText("");
            if(i==1)
            	cb0.setText("1. Please intimate the constituency in which the following address falls: _______________ (YOUR ADDRESS).");
            if(i==2)
            	cb0.setText("2. Please provide the following details in a tabular format for all the works / projects awarded during the period __________to	___________for my constituency out of the MLA Constituency Development	Fund: a) Name of work / project b) Brief Description of work / project	c) Amount sanctioned d) Date of sanction e) Status of Progress	f) Name of agency / contractor g) Date of Initiation h) Date of completion	i) Date of deadline j) Date of Extended deadline k) Certified copy of the	Contracts Document l) Amount paid to the contractor m) Certified copy	of the estimate document n) Copy of sketch o) Certified copy of	documents / letters related to decision of start of  this work / project	p) Name and Designation of Inspection officer.");
            if(i==3)
            	cb0.setText("3. Certified copies of all correspondences sent / received for disposal of my complaint.");
            if(i==4)
            	cb0.setText("3. How much of money for MLA Constituency Development Fund was allotted to him during the current year and how much has been carried over from previous years?");
            if(i==5)
            	cb0.setText("4. Please provide details of First Appellate Authority u/s 7(8) of	RTI Act, 2005 with detailed postal and email address.");
            
            if(i>0)
                lp0.addRule(RelativeLayout.BELOW,i-1);
            else
            	lp0.addRule(RelativeLayout.BELOW,R.id.spinner1);
            cb0.setLayoutParams(lp0);
            rl.addView(cb0);
            i++;
			}
			break;
			
		case 3:
			rl.removeAllViews();
			
		}
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
