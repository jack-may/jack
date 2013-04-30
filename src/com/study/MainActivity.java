package com.study;

import com.study.learn.learnsActivity;
import com.study.lesson.lessonsActivity;
import com.study.live.livesActivity;
import com.study.shop.shopsActivity;
import com.study.teacher.teachersActivity;
import com.study.thing.thingsActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
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
        
        learns.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
    	    	  // TODO Auto-generated method stub	
    	    	  switch (event.getAction()) { 	  
    	    	        case MotionEvent.ACTION_DOWN:	 
    	    	        	learns.setTextColor(Color.argb(155, 0, 255, 0));
    	    	            break;
    	    	        case MotionEvent.ACTION_UP:
    	    	        	learns.setTextColor(Color.argb(255, 255, 255, 255));
    	    				Intent learnintent = new Intent(MainActivity.this,learnsActivity.class);
    	    				startActivityForResult(learnintent,0);
    	    	            break;
    	    	        default:
    	    	            break;
    	    	  }
    	    	  return true;
    	    }
        });
        
        
        shops.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
    	    	  // TODO Auto-generated method stub	
    	    	  switch (event.getAction()) { 	  
    	    	        case MotionEvent.ACTION_DOWN:	 
    	    	        	shops.setTextColor(Color.argb(155, 0, 255, 0));
    	    	            break;
    	    	        case MotionEvent.ACTION_UP:
    	    	        	shops.setTextColor(Color.argb(255, 255, 255, 255));
    	    	        	Intent shopintent = new Intent(MainActivity.this,shopsActivity.class);
    	    				startActivityForResult(shopintent,1);
    	    	            break;
    	    	        default:
    	    	            break;
    	    	  }
    	    	  return true;
    	    }
        });

        teachers.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
  	    	  // TODO Auto-generated method stub	
  	    	  switch (event.getAction()) { 	  
  	    	        case MotionEvent.ACTION_DOWN:	 
  	    	        	teachers.setTextColor(Color.argb(155, 0, 255, 0));
  	    	            break;
  	    	        case MotionEvent.ACTION_UP:
  	    	        	teachers.setTextColor(Color.argb(255, 255, 255, 255));
  	    	        	Intent teacherintent = new Intent(MainActivity.this,teachersActivity.class);
  	    	        	startActivityForResult(teacherintent,2);
  	    	            break;
  	    	        default:
  	    	            break;
  	    	  }
  	    	  return true;
  	    }
      });
        
        lessons.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
  	    	  // TODO Auto-generated method stub	
  	    	  switch (event.getAction()) { 	  
  	    	        case MotionEvent.ACTION_DOWN:	 
  	    	        	lessons.setTextColor(Color.argb(155, 0, 255, 0));
  	    	            break;
  	    	        case MotionEvent.ACTION_UP:
  	    	        	lessons.setTextColor(Color.argb(255, 255, 255, 255));
  	    	        	Intent lessonsintent = new Intent(MainActivity.this,lessonsActivity.class);
  	    	        	startActivityForResult(lessonsintent,3);
  	    	            break;
  	    	        default:
  	    	            break;
  	    	  }
  	    	  return true;
  	    }
      });
        
        lives.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
  	    	  // TODO Auto-generated method stub	
  	    	  switch (event.getAction()) { 	  
  	    	        case MotionEvent.ACTION_DOWN:	 
  	    	        	lives.setTextColor(Color.argb(155, 0, 255, 0));
  	    	            break;
  	    	        case MotionEvent.ACTION_UP:
  	    	        	lives.setTextColor(Color.argb(255, 255, 255, 255));
  	    	        	Intent liveintent = new Intent(MainActivity.this,livesActivity.class);
  	    				startActivityForResult(liveintent,4);
  	    	            break;
  	    	        default:
  	    	            break;
  	    	  }
  	    	  return true;
  	    }
      });
        
        things.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
  	    	  // TODO Auto-generated method stub	
  	    	  switch (event.getAction()) { 	  
  	    	        case MotionEvent.ACTION_DOWN:	 
  	    	        	things.setTextColor(Color.argb(155, 0, 255, 0));
  	    	            break;
  	    	        case MotionEvent.ACTION_UP:
  	    	        	things.setTextColor(Color.argb(255, 255, 255, 255));
  	    	        	Intent thingintent = new Intent(MainActivity.this,thingsActivity.class);
  	    				startActivityForResult(thingintent,5);
  	    	            break;
  	    	        default:
  	    	            break;
  	    	  }
  	    	  return true;
  	    }
      });
    
    }

}
