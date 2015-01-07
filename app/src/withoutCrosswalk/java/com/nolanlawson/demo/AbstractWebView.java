package com.nolanlawson.demo;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * WebView (no Crosswalk) style
 */
public abstract class AbstractWebView extends WebView {

  public AbstractWebView(Context context, AttributeSet attrs) {
    super(context, attrs);

    WebSettings settings = getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDatabaseEnabled(true);
    settings.setAllowFileAccess(true);
    settings.setDomStorageEnabled(true);
    settings.setDefaultTextEncodingName("utf-8");

    if(Build.VERSION.SDK_INT >= 14) {
      settings.setAllowUniversalAccessFromFileURLs(true);
    }

    //Pipe javascript console messages through to logcat
    setWebChromeClient(new WebChromeClient() {
      @Override
      public boolean onConsoleMessage(ConsoleMessage cm) {
        Log.d("Console", cm.message());
        return true;
      }
    });
  }

  public void loadUrl(String url) {
    super.loadUrl(url);
  }

  public void setClient(MyWebViewClient client) {
    super.setWebViewClient(client);
  }

}