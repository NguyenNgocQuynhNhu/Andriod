package com.example.baitap13;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String arr[]={"Teo","Ty","Bin","Bo"};
        
        ListView lv=(ListView) findViewById(R.id.lvperson);
        
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
        (this, android.R.layout.simple_list_item_1, arr);

        lv.setAdapter(adapter);
        @SuppressWarnings("unused")
		final TextView txt=(TextView) findViewById(R.id.txtselection);

        lv.setOnItemClickListener(
        new AdapterView.OnItemClickListener() {
        	@Override
			public void onItemClick(AdapterView<?> arg0,
					android.view.View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				
			}
        			 });
        	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
