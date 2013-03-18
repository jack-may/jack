package com.study;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class learnsList extends Activity{
	
	public TextView lesson;
	public TextView grade;
	public TextView credit;
	public static String nums;
	public static String dates;
	public static String learns;

	public static void stuy(String stu_num, String date, String learn){
		nums = stu_num;
		dates = date;
		learns = learn;
	}
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
    	
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.learns_item);
        
        lesson  = (TextView) findViewById(R.id.txt_lessons);
        grade = (TextView) findViewById(R.id.txt_grade);
        credit = (TextView) findViewById(R.id.txt_credit);
        
        lesson.setText(nums);
        grade.setText(dates);
        credit.setText(learns);
	}
}
