package com.study;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class shopsActivity extends Activity{
	
	public TextView lives;
	public TextView students;
	public TextView books;
	public TextView electrictys;
	public TextView accessoriess;
	
	public Animation rotate;
	public Animation alpha;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
        setContentView(R.layout.shops_main);
        
        lives = (TextView) findViewById(R.id.live_things);
        students = (TextView) findViewById(R.id.stud_things);
        books = (TextView) findViewById(R.id.books);
        electrictys = (TextView) findViewById(R.id.el_things);
        accessoriess = (TextView) findViewById(R.id.accessories_things);

        
		rotate = AnimationUtils.loadAnimation(shopsActivity.this, R.anim.rotate);
		alpha = AnimationUtils.loadAnimation(shopsActivity.this, R.anim.alpha);        
		books.setAnimation(rotate);
		lives.setAnimation(alpha);
		students.setAnimation(alpha);
		electrictys.setAnimation(alpha);
		accessoriess.setAnimation(alpha);
		rotate.setAnimationListener(new AnimationListener(){

			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				books.clearAnimation();
				lives.clearAnimation();
				students.clearAnimation();
				electrictys.clearAnimation();
				accessoriess.clearAnimation();
			}

			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}

			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
		});
		
		lives.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
  	    	  // TODO Auto-generated method stub	
  	    	  switch (event.getAction()) { 	  
  	    	        case MotionEvent.ACTION_DOWN:	 
  	    	        	lives.setBackgroundColor(Color.argb(155, 0, 255, 0));
  	    	            break;
  	    	        case MotionEvent.ACTION_UP:
  	    	        	lives.setBackgroundColor(Color.argb(255, 255, 127, 39));
  	    	        	Intent intent = new Intent(shopsActivity.this,shoplives.class);
  	  				startActivityForResult(intent,0);
  	    	            break;
  	    	        default:
  	    	            break;
  	    	  }
  	    	  return true;
  	    }
      });
				
		students.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
    	    	  // TODO Auto-generated method stub	
    	    	  switch (event.getAction()) { 	  
    	    	        case MotionEvent.ACTION_DOWN:	 
    	    	        	students.setBackgroundColor(Color.argb(155, 0, 255, 0));
    	    	            break;
    	    	        case MotionEvent.ACTION_UP:
    	    	        	students.setBackgroundColor(Color.argb(255, 255, 127, 39));
    	    	        	Intent intent =new Intent(shopsActivity.this,shopstudys.class);
    	    				startActivityForResult(intent,1);
    	    	            break;
    	    	        default:
    	    	            break;
    	    	  }
    	    	  return true;
    	    }
        });
		
		books.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
  	    	  // TODO Auto-generated method stub	
  	    	  switch (event.getAction()) { 	  
  	    	        case MotionEvent.ACTION_DOWN:	 
  	    	        	books.setBackgroundColor(Color.argb(155, 0, 255, 0));
  	    	            break;
  	    	        case MotionEvent.ACTION_UP:
  	    	        	books.setBackgroundColor(Color.argb(255, 255, 127, 39));
  	    	        	Intent intent = new Intent(shopsActivity.this,shopbooks.class);
  	    	        	startActivityForResult(intent,2);
  	    	            break;
  	    	        default:
  	    	            break;
  	    	  }
  	    	  return true;
  	    }
      });
				
		
		electrictys.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
  	    	  // TODO Auto-generated method stub	
  	    	  switch (event.getAction()) { 	  
  	    	        case MotionEvent.ACTION_DOWN:	 
  	    	        	electrictys.setBackgroundColor(Color.argb(155, 0, 255, 0));
  	    	            break;
  	    	        case MotionEvent.ACTION_UP:
  	    	        	electrictys.setBackgroundColor(Color.argb(255, 255, 127, 39));
  	    	        	Intent intent = new Intent(shopsActivity.this,shopelectritys.class);
  	    	        	startActivityForResult(intent,3);
  	    	            break;
  	    	        default:
  	    	            break;
  	    	  }
  	    	  return true;
  	    }
      });
				
		accessoriess.setOnTouchListener(new OnTouchListener() {   
    	    public boolean onTouch(View v, MotionEvent event) {
    	    	  // TODO Auto-generated method stub	
    	    	  switch (event.getAction()) { 	  
    	    	        case MotionEvent.ACTION_DOWN:	 
    	    	        	accessoriess.setBackgroundColor(Color.argb(155, 0, 255, 0));
    	    	            break;
    	    	        case MotionEvent.ACTION_UP:
    	    	        	accessoriess.setBackgroundColor(Color.argb(255, 255, 127, 39));
    	    	        	Intent intent = new Intent(shopsActivity.this,shopaccessories.class);
    	    				startActivityForResult(intent,4);
    	    	            break;
    	    	        default:
    	    	            break;
    	    	  }
    	    	  return true;
    	    }
        });
				
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater =  getMenuInflater();
		inflater.inflate(R.menu.shops_menu, menu);
		return true;
	}
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId()==R.id.shop_add){
			
		}
		if(item.getItemId()==R.id.shop_check){
			
		}
		if(item.getItemId()==R.id.shop_re){
				Intent intent = getIntent();
				setResult(1,intent);
				shopsActivity.this.finish();
		}
		return super.onOptionsItemSelected(item);
		
	};
    
}
