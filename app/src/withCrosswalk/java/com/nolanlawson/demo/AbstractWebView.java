package com.nolanlawson.demo;

import android.content.Context;
import android.util.AttributeSet;

import org.xwalk.core.XWalkView;

/**
 * Crosswalk style
 */
public abstract class AbstractWebView extends XWalkView {

  public AbstractWebView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public void loadUrl(String url) {
    super.load(url, null);
  }

  public void setClient(MyWebViewClient client) {
    super.setUIClient(client);
  }

}