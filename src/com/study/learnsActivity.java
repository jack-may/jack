package com.study;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class learnsActivity extends Activity {
	
	public Button ok;
	public EditText num;
	public Button re;
	public TextView textview;
	public TextView spintext1;
	public TextView spintext2;
	public ArrayAdapter<String> adapter1;
	public ArrayAdapter<String> adapter2;
	public Spinner spin1;
	public Spinner spin2;
	public ListView listview;
	public SimpleAdapter adapter3; 
	
	public int year;
	public int numb;
    public String numb0;
    public String numb1;
    public String numb2;
    public String numb3;
    public String numb4;
    public String numb5;
    public String numb6;
    
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        
	    	super.onCreate(savedInstanceState);
	    	
	    	requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    	
	        setContentView(R.layout.learn_main);
	        
	        ok = (Button) findViewById(R.id.ok_button);
	        num = (EditText) findViewById(R.id.numb);
	        re = (Button) findViewById(R.id.re_button);
	        textview = (TextView) findViewById(R.id.textview1);
	        spintext1 = (TextView) findViewById(R.id.textview2);
	        spintext2 = (TextView) findViewById(R.id.textview3);
	        spin1 = (Spinner) findViewById(R.id.spinner1);
	        spin2 = (Spinner) findViewById(R.id.spinner2);
	        textview.setText("请输入你的学号：");
	        Calendar c = Calendar.getInstance();
	        year = c.get(Calendar.YEAR); 
	        numb = year;
	        numb0 = String.valueOf(numb-6);
	        numb1 = String.valueOf(numb-5);
	        numb2 = String.valueOf(numb-4);
	        numb3 = String.valueOf(numb-3);
	        numb4 = String.valueOf(numb-2);
	        numb5 = String.valueOf(numb-1);
	        numb6 = String.valueOf(numb);
	        final String[] m = {numb0,numb1,numb2,numb3,numb4,numb5,numb6};
	        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,m);  	          
	        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
	        spin1.setAdapter(adapter1);  
	        spin1.setOnItemSelectedListener(new OnItemSelectedListener(){

				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
				 spintext1.setText("请选择日期：");
				}

				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub
					
				}
	        	
	        }); 
	         
	        final String[] n = {"上学期","下学期"};
	        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,n);  	          
	        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
	        spin2.setAdapter(adapter2);  
	        spin2.setOnItemSelectedListener(new OnItemSelectedListener(){

				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
				 spintext2.setText("请选择学期：");
				}

				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub
					
				}
	        	
	        });

	        ok.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					// TODO Auto-generated method stub
				Intent intent = new Intent(learnsActivity.this,learnsList.class);
				startActivityForResult(intent,0);
				learnsList.stuy(num.getText().toString(), spin1.getSelectedItem().toString(), spin2.getSelectedItem().toString());
				}
	        });
	        
	        re.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = getIntent();
					setResult(0,intent);
					learnsActivity.this.finish();
				}
	        	
	        });
	        
	  }
}
