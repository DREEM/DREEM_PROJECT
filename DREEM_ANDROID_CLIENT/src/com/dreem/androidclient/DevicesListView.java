package com.dreem.androidclient;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class DevicesListView extends ListActivity 
{
    /** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	  super.onCreate(savedInstanceState);
	  
	  setListAdapter(new ArrayAdapter<String>(this,
	          android.R.layout.simple_list_item_1, DEVICES));
	  getListView().setTextFilterEnabled(true);
	 
	}
	static final String[] DEVICES = new String[] {"WASHING MACHINE", "BOILER", "ETC..."};
}	