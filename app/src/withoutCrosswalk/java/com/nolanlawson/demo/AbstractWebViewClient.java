package com.nolanlawson.demo;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * WebView (no Crosswalk) style
 */
public abstract class AbstractWebViewClient extends WebViewClient {


  public AbstractWebViewClient(MyWebView unused) {
    super();
  }

  protected abstract void onPageLoaded(String url, boolean success);

  @Override
  public void onPageFinished(WebView view, String url) {
    super.onPageFinished(view, url);
    onPageLoaded(url, true);
  }

  @Override
  public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
    super.onReceivedError(view, errorCode, description, failingUrl);
    onPageLoaded(failingUrl, false);
  }

}
