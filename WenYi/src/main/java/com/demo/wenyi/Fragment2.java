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
public class Fragment2 extends MyBaseFragment{
    private static View view2 ;
    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState) {
        view2 = justOneFragment (inflater,container,view2,R.layout.fragment2);
        return view2;
    }
}
