package com.cxy.studydemo;

import com.cxy.studydemo.layout.LayoutMainActivity;
import com.cxy.studydemo.view.ViewMainActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class LauncherActivity extends ListActivity {

	String[] Name = new String[]{
		"Layout",
		"View",
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //˵����listActivity���Ѿ������˲����ļ����Ҳ����ļ��к���listview
        //��˲�����setContentView()��
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Name));
    }

    //Ҫ��ʵ��listView��Item����з�����Ҫ��д
    //listActivity��onListItemClick()����
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = null;
		
		switch (position) {
		case 0:
			intent = new Intent(this, LayoutMainActivity.class);
			break;
		case 1:
			intent = new Intent(this, ViewMainActivity.class);
			break;

		}
		startActivity(intent);
	}
    

    

}
