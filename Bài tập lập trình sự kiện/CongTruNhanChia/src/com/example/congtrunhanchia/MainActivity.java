package com.example.congtrunhanchia;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{

	EditText edita, editb;
	Button btnCong, btnTru, btnNhan, btnChia;
	TextView txtkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    	edita = (EditText)findViewById(R.id.textView1);
    	editb = (EditText)findViewById(R.id.textView2);
    	txtkq = (TextView)findViewById(R.id.txtKQ);
    	btnCong = (Button)findViewById(R.id.btnCong);
    	btnTru = (Button)findViewById(R.id.btnTru);
    	btnNhan = (Button)findViewById(R.id.btnNhan);
    	btnChia = (Button)findViewById(R.id.btnChia);
    	
    	btnCong.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String chuoi1 = edita.getText().toString();
				int a = Integer.parseInt(chuoi1);
				
				String chuoi2 = editb.getText().toString();
				int b = Integer.parseInt(chuoi2);
				
				int tong = a + b;
				txtkq.setText(String.valueOf(tong));
			}});
    	btnTru.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String chuoi1 = edita.getText().toString();
				int a = Integer.parseInt(chuoi1);
				
				String chuoi2 = editb.getText().toString();
				int b = Integer.parseInt(chuoi2);
				
				int hieu = a - b;
				txtkq.setText(String.valueOf(hieu));
			}});
    	
    	btnNhan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				String chuoi1 = edita.getText().toString();
				int a = Integer.parseInt(chuoi1);
				
				String chuoi2 = editb.getText().toString();
				int b = Integer.parseInt(chuoi2);
				
				int tich = a * b;
				txtkq.setText(String.valueOf(tich));
			}});

			btnChia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String chuoi1 = edita.getText().toString();
				int a = Integer.parseInt(chuoi1);
				
				String chuoi2 = editb.getText().toString();
				int b = Integer.parseInt(chuoi2);
				
				int thuong = a / b;
				txtkq.setText(String.valueOf(thuong));
			}});
    	}
   


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
