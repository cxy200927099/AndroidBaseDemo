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

        //说明：listActivity中已经包含了布局文件，且布局文件中含有listview
        //因此不必再setContentView()了
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Name));
    }

    //要想实现listView的Item点击有反馈需要重写
    //listActivity的onListItemClick()函数
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
