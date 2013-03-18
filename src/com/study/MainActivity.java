package com.study;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {

	public TextView learns;
	public TextView shops;
	public TextView teachers;
	public TextView lessons;
	public TextView lives;
	public TextView things;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.activity_main);
        
        learns = (TextView) findViewById(R.id.menu_lea);
        shops = (TextView) findViewById(R.id.menu_s);
        teachers = (TextView) findViewById(R.id.menu_te);
        lessons = (TextView) findViewById(R.id.menu_les);
        lives = (TextView) findViewById(R.id.menu_li);
        things = (TextView) findViewById(R.id.menu_th);
        
        learns.setOnClickListener(new OnClickListener(){
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent learnintent = new Intent(MainActivity.this,learnsActivity.class);
				startActivityForResult(learnintent,0);
			}
        });

        shops.setOnClickListener(new OnClickListener(){
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent shopintent = new Intent(MainActivity.this,shopsActivity.class);
				startActivityForResult(shopintent,1);
				
			}
        });

        teachers.setOnClickListener(new OnClickListener(){
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
        });
        
        lessons.setOnClickListener(new OnClickListener(){
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
        });
        
        lives.setOnClickListener(new OnClickListener(){
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
        });
        
        things.setOnClickListener(new OnClickListener(){
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
        });
    
    }

}
