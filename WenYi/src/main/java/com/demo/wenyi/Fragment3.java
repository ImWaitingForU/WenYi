package com.demo.wenyi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/4/17.
 */
public class Fragment3 extends MyBaseFragment {
	private static View view3 ;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view3 = justOneFragment(inflater, container, view3, R.layout.fragment3);
		return view3;
	}
}
