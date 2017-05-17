package com.example.th3;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText txtten;
	 TextView txtchon;
	 Button btn;
	 ListView lv;
	 ArrayList<String>arrList=null;
	 ArrayAdapter<String> adapter=null;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 
	 txtten=(EditText) findViewById(R.id.txtTen);
	 txtchon=(TextView) findViewById(R.id.txtselection);
	 
	 lv=(ListView) findViewById(R.id.lvperson);
	 
	 arrList=new ArrayList<String>();
	
	 adapter=new ArrayAdapter<String>
	 (this,
	 android.R.layout.simple_list_item_1,
	 arrList);
	 
	 lv.setAdapter(adapter);
	 
	 btn=(Button) findViewById(R.id.btnNhap);
	 
	 btn.setOnClickListener(new View.OnClickListener() {
	 public void onClick(View arg0) {
	 arrList.add(txtten.getText()+"");
	 adapter.notifyDataSetChanged();
	 }
	 });
	
	 lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	 @Override
	public void onItemClick(AdapterView<?> arg0, android.view.View arg1,int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
	 });
	 
	 lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
	 @Override
	public boolean onItemLongClick(AdapterView<?> arg0, android.view.View arg1,int arg2, long arg3) {
		// TODO Auto-generated method stub
		return false;
	}
	 });
	 }
	}
