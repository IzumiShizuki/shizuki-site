package com.tencent.bugly.crashreport;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements CrashReport.WebViewInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f4520a;

    public a(WebView webView) {
        this.f4520a = webView;
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public final void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str) {
        this.f4520a.addJavascriptInterface(h5JavaScriptInterface, str);
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public final CharSequence getContentDescription() {
        return this.f4520a.getContentDescription();
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public final String getUrl() {
        return this.f4520a.getUrl();
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public final void loadUrl(String str) {
        this.f4520a.loadUrl(str);
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public final void setJavaScriptEnabled(boolean z10) {
        WebSettings settings = this.f4520a.getSettings();
        if (settings.getJavaScriptEnabled()) {
            return;
        }
        settings.setJavaScriptEnabled(true);
    }
}
