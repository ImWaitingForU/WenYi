package com.demo.wenyi;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/4/17.
 */
public class Fragment1 extends MyBaseFragment {

	// 将本Fragment的View设置成static,以达到按回退键后销毁fragment，再次进入app，显示上一次退出时fragment状态的效果
	// 但这个方法只能保存UI界面的状态，不可真正保存数据
	private static View view1;
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view1 = justOneFragment(inflater, container, view1, R.layout.fragment1);
		return view1;
	}

}
