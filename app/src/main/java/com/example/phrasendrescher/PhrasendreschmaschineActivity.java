package com.example.phrasendrescher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PhrasendreschmaschineActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
    }
    
    public void onButtonClick(View view) {
    	
    	if (view.getId() == R.id.btn_selbst_dreschen) {
    		startActivity(new Intent(this, SelbstDreschenActivity.class));
    	}
    	else {
    		startActivity(new Intent(this, DreschenLassenActivity.class));    		
    	}
    	
    }
}
