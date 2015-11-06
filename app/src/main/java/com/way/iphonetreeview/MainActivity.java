package com.way.iphonetreeview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.tencent.bugly.crashreport.CrashReport;

@SuppressLint("UseSparseArrays")
//public class MainActivity extends ExpandableListActivity {
public class MainActivity extends Activity {
	private LayoutInflater mInflater;
	private IphoneTreeView iphoneTreeView;
//	private IphoneTreeView2 iphoneTreeView;
//	 ExpandableListActivity listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CrashReport.initCrashReport(this.getApplicationContext(), "900010916", false);
		setContentView(R.layout.activity_main);

		initView();
//		initView1();
	}

	private void initView1() {

		mInflater = LayoutInflater.from(this);
//	   listView.setListAdapter(new IphoneTreeViewAdapter(this, listView));
//	   setListAdapter(new IphoneTreeViewAdapter(this, this));
	}



	private void initView() {
		// TODO Auto-generated method stub
		mInflater = LayoutInflater.from(this);
		iphoneTreeView = (IphoneTreeView) findViewById(R.id.iphone_tree_view);
		iphoneTreeView.setHeaderView(getLayoutInflater().inflate(R.layout.iphonetreeview_list_head_view, iphoneTreeView, false));
		iphoneTreeView.setGroupIndicator(null);
		iphoneTreeView.setAdapter(new IphoneTreeViewAdapter(this,iphoneTreeView));
	}




}
