package com.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class teachersActivity extends Activity{
	
	public EditText search_n;
	public Button search_b_n;
	public Spinner search_dep;
	public Button search_b_ok;
	public Button search_b_re;
	
	@Override
	public  void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.teachers_main);
        
        search_n = (EditText) findViewById(R.id.teacher_search_name);
        search_b_n = (Button) findViewById(R.id.teacher_searchbutton_name);
        search_dep = (Spinner) findViewById(R.id.search_department);
        search_b_ok = (Button) findViewById(R.id.department_ok_button);
        search_b_re = (Button) findViewById(R.id.department_re_button);
        
        search_b_re.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = getIntent();
				setResult(3,intent);
				teachersActivity.this.finish();
			}
		});
        
	}
}
