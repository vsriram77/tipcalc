package com.yahoo.learn.tipr;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	this.setTitle("Tip Calculator");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }    

    public void onCalculateTip(View view) {
    	EditText wbill = (EditText) findViewById(R.id.txtBill);
        TextView wtip = (TextView) findViewById(R.id.lblTipValue);

    	double val = 0;
    	try {
    		val = Double.valueOf(wbill.getText().toString());
    	} catch (NumberFormatException exp) {
    		return;
    	}
    	switch (view.getId()) {
    	case R.id.btn10PerTip:
        	wtip.setText(String.format("$%3.2f", val*0.1));
        	break;
     	case R.id.btn15PerTip:
        	wtip.setText(String.format("$%3.2f", val*0.15));
        	break;
     	case R.id.btn20PerTip:
        	wtip.setText(String.format("$%3.2f", val*0.2));
        	break;        	
    	} 
    }
    

}
