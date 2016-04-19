package com.demo.wenyi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/4/19.
 *
 * 自定义基础Fragment,主要实现Fragment视图状态保存
 */
public class MyBaseFragment extends Fragment {

	/*
	 * 保证每次只有一个Fragment实例,子Fragment在onCreateView里加上这个方法
	 * 
	 * @param inflater 布局填充器
	 * 
	 * @param container 父布局
	 * 
	 * @param viewLayoutId 本fragment对应的布局文件
	 */
	protected View justOneFragment(LayoutInflater inflater,
			ViewGroup container,View view, int viewLayoutId) {
		// 防止fragment重复创建,保存退出fragment时的UI状态
		if (view == null) {
			view = inflater.inflate(viewLayoutId, container, false);
		}

		ViewGroup parent = (ViewGroup) view.getParent();

		// 如果view已经被加到Activity中，则从中移除
		if (parent != null) {
			parent.removeView(view);
		}

		return view;
	}

}
