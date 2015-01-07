package com.nolanlawson.demo;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 */
public class MyWebView extends AbstractWebView {

  public MyWebView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public void onPageFinished() {
    setBackgroundColor(Color.TRANSPARENT);
    setLayerType(View.LAYER_TYPE_SOFTWARE, null);
  }
}
