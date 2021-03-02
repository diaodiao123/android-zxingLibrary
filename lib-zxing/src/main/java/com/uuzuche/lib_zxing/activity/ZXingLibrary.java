package com.uuzuche.lib_zxing.activity;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

import com.uuzuche.lib_zxing.DisplayUtil;
import com.uuzuche.lib_zxing.camera.CameraManager;
import com.uuzuche.lib_zxing.view.ViewfinderView;

/**
 * Created by aaron on 16/9/7.
 */

public class ZXingLibrary {

    public static void initDisplayOpinion(Context context) {
        if (context == null) {
            return;
        }
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        DisplayUtil.density = dm.density;
        DisplayUtil.densityDPI = dm.densityDpi;
        DisplayUtil.screenWidthPx = dm.widthPixels;
        DisplayUtil.screenhightPx = dm.heightPixels;
        DisplayUtil.screenWidthDip = DisplayUtil.px2dip(context, dm.widthPixels);
        DisplayUtil.screenHightDip = DisplayUtil.px2dip(context, dm.heightPixels);
    }

    /**
     * 占屏幕宽的多少
     * @param width
     * @param height
     */
    public static void setScanWidthAndHeight(Double width,Double height){
        ViewfinderView.mWidth=width;
        ViewfinderView.mHeight=height;
    }

}
