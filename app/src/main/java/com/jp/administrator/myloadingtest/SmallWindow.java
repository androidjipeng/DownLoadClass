package com.jp.administrator.myloadingtest;

import android.content.Context;
import android.view.WindowManager;

/**
 * Created by Administrator on 2015/7/14.
 */
public class SmallWindow {
    Context mContext;
    WindowManager manager;
    public SmallWindow(Context context) {
        this.mContext=context;
    }
    public void addWindow(Context context)
    {
        context=mContext;
        manager= (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams();
        params.width=WindowManager.LayoutParams.WRAP_CONTENT;
        params.height=WindowManager.LayoutParams.WRAP_CONTENT;


    }
}
