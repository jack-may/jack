package com.study.learn;

import com.study.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class learnsList extends Activity {
	public static String stud_num;
	public static String stud_year;
	public static String stud_term;
	
	public TextView numb;
	public TextView years;
	public TextView terms;
	
	public static void stud(String num, String year, String term){
		stud_num = num;
		stud_year = year;
		stud_term = term;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
    	
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    	
        setContentView(R.layout.learns_item);
        
        numb = (TextView) findViewById(R.id.txt_lessons);
        years = (TextView) findViewById(R.id.txt_grade);
        terms = (TextView) findViewById(R.id.txt_credit);
        
        numb
	}
}

