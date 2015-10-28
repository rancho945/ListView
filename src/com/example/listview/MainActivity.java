package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lst1 = (ListView) findViewById(R.id.list1);
		String[] arr1 = {"one","two","three"};
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.item,arr1);
		lst1.setAdapter(adapter1);
		ListView lst2 = (ListView) findViewById(R.id.list2);
		String[] arr2 = {"you","me","she","he"};
		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.check,arr2);
		lst2.setAdapter(adapter2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
