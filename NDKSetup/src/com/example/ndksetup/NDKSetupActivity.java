package com.example.ndksetup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

public class NDKSetupActivity extends Activity {

	EditText inputText;
	Button ok;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        printLog("Hello!!!");
        
        int x=fibonacci(10);
        System.out.println(x);
		
        
        inputText=(EditText)findViewById(R.id.input);
        ok=(Button)findViewById(R.id.ok);
        
        ok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Toast.makeText(getApplicationContext(),"Square is : "+JNIwithHeaderFile.squared(Integer.parseInt(inputText.getText().toString()))+"",Toast.LENGTH_SHORT).show();
				
			}
		});
        
        
   
    }


    static {
        try {
        	System.loadLibrary("ndksetup");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private native void printLog(String logThis);
	
    private native int fibonacci(int value);
}
