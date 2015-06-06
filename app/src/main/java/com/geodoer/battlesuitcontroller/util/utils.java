package com.geodoer.battlesuitcontroller.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.geodoer.battlesuitcontroller.R;

/**
 * Created by iamcx_000 on 2015/6/6.
 */
public class utils {

    public static void switchFragment(FragmentActivity fragmentActivity, Fragment newFragment) {
        switchFragment(fragmentActivity,null,newFragment);
    }

    public static void switchFragment(AppCompatActivity appCompatActivity, Fragment newFragment) {
        switchFragment(null,appCompatActivity,newFragment);
    }

    private static void switchFragment(FragmentActivity fragmentActivity,
                                       AppCompatActivity appCompatActivity,
                                       Fragment newFragment){
        FragmentManager fragmentManager = null;

        if(fragmentActivity!=null)
            fragmentManager = fragmentActivity.getSupportFragmentManager();

        if(appCompatActivity!=null)
            fragmentManager = appCompatActivity.getSupportFragmentManager();

        if (fragmentManager != null) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, newFragment).commit();
        }
    }
}
