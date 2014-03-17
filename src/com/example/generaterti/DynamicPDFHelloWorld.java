package com.example.generaterti;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.cete.dynamicpdf.Document;
import com.cete.dynamicpdf.Font;
import com.cete.dynamicpdf.Page;
import com.cete.dynamicpdf.PageOrientation;
import com.cete.dynamicpdf.PageSize;
import com.cete.dynamicpdf.TextAlign;
import com.cete.dynamicpdf.pageelements.Label;



public class DynamicPDFHelloWorld extends Activity implements OnClickListener {
	
	Button send;
	final File externalStorage = Environment.getExternalStorageDirectory();
	private static final String to = "monilhshah@gmail.com";
	protected YourApp appstate;
	private static String FILE = Environment.getExternalStorageDirectory()
			+ "/rtiDraft.pdf";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pdfmain);

		// Create a document and set it's properties
		Document objDocument = new Document();
		objDocument.setCreator("DynamicPDFHelloWorld.java");
		objDocument.setAuthor("Your Name");
		objDocument.setTitle("Hello World");
		send = (Button) findViewById(R.id.bSendit);
		send.setOnClickListener(this);

		// Create a page to add to the document
		Page objPage = new Page(PageSize.LETTER, PageOrientation.PORTRAIT,
				54.0f);
		
		appstate=((YourApp)getApplication());
		String str=appstate.mapData.get("name");
		String str1=appstate.mapData.get("Address");
		String str2=appstate.mapData.get("City");
		String str3=appstate.mapData.get("subject");
		String str4=appstate.mapData.get("1");
		String str5=appstate.mapData.get("2");
		String str6=appstate.mapData.get("3");
		String str7=appstate.mapData.get("4");
		// Create a Label to add to the page
		String strText = "Application for Information under the Right to Information Act,2055\n\n"+ "From\n"+str+"\n\n"+"To\nPublic Information Officer\n"+str1+"\n"+str2+"\n"+"Subject\n"+str3+"\n"+"Description of Information Required\n"+str4+"\n"+str5+"\n"+str6+"\n"+str7+"\n";
		
		Label objLabel = new Label(strText, 0, 0, 504, 100,
				Font.getHelvetica(), 18, TextAlign.CENTER);

		// Add label to page
		objPage.getElements().add(objLabel);

		// Add page to document
		objDocument.getPages().add(objPage);

		try {
			// Outputs the document to file
			objDocument.draw(FILE);
			Toast.makeText(this, "File has been written to :" + FILE,
					Toast.LENGTH_LONG).show();
		} catch (Exception e) {
			Toast.makeText(this,
					"Error, unable to write to file\n" + e.getMessage(),
					Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Uri uri = Uri.fromFile(new File(externalStorage,"rtiDraft.pdf"));            	               
        Toast.makeText(getApplicationContext(),"exists",Toast.LENGTH_LONG).show();
        Intent sendIntent = new Intent(Intent.ACTION_SEND);	     
        sendIntent.setType("download/");	        
        sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {to});	     
        sendIntent.putExtra(Intent.EXTRA_SUBJECT,"mail subject");	        
        sendIntent.putExtra(Intent.EXTRA_STREAM,uri);	             
        sendIntent.putExtra(Intent.EXTRA_TEXT,"Text in email");	       
        startActivity(Intent.createChooser(sendIntent, ""));
	}
}