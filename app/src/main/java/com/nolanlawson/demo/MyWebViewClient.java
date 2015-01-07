package com.nolanlawson.demo;

import android.util.Log;

/**
 */
public class MyWebViewClient extends AbstractWebViewClient {

  private final MyWebView myWebView;

  public MyWebViewClient(MyWebView myWebView) {
    super(myWebView);
    this.myWebView = myWebView;
  }

  @Override
  protected void onPageLoaded(String url, boolean success) {
    if (success) {
      myWebView.onPageFinished();
    } else {
      Log.e(MyWebViewClient.class.getSimpleName(), "failed to load url: " + url);
    }
  }
}
