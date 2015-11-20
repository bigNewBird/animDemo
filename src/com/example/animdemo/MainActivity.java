package com.example.animdemo;

import com.sdf.jazzylistviewdemo.widget.jazzylistview.JazzyHelper;
import com.sdf.jazzylistviewdemo.widget.jazzylistview.JazzyListView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MainActivity extends Activity {
	private JazzyListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv = (JazzyListView) findViewById(R.id.lv);
		lv.setAdapter(new MyAdapter());
		lv.setTransitionEffect(JazzyHelper.FAN);
	}

	class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 20;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return arg0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view = View.inflate(getApplicationContext(),
					R.layout.list_item, null);
			return view;
		}
	}

}
