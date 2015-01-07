package com.nolanlawson.demo;

import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;

/**
 * Crosswalk style
 */
public abstract class AbstractWebViewClient extends XWalkUIClient {

  public AbstractWebViewClient(MyWebView webView) {
    super(webView);
  }

  protected abstract void onPageLoaded(String url, boolean success);

  @Override
  public void onPageLoadStopped(XWalkView view, String url, LoadStatus status) {
    super.onPageLoadStopped(view, url, status);
    onPageLoaded(url, status == LoadStatus.FINISHED);
  }

}
