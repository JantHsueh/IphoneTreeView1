package com.way.iphonetreeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

/**
 * Created by xuexuan on 2015/11/3.
 */
public class IphoneTreeView2 extends ExpandableListView {


    public IphoneTreeView2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
//        registerListener();
    }

    public IphoneTreeView2(Context context, AttributeSet attrs) {
        super(context, attrs);
//        registerListener();
    }

    public IphoneTreeView2(Context context) {
        super(context);
//        registerListener();
    }

    /**
     * 用于在列表头显示的 View,mHeaderViewVisible 为 true 才可见
     */
    private View mHeaderView;

    /**
     * 列表头是否可见
     */

    public void setHeaderView(View view) {
        mHeaderView = view;
        AbsListView.LayoutParams lp = new AbsListView.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
//                ViewGroup.LayoutParams.MATCH_PARENT
        );
        view.setLayoutParams(lp);
    }

    @Override
    public void setAdapter(ExpandableListAdapter adapter) {
        super.setAdapter(adapter);
//        mAdapter = (IphoneTreeHeaderAdapter) adapter;
    }


}
