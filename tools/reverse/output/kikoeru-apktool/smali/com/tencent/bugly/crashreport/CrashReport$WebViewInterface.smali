.class public interface abstract Lcom/tencent/bugly/crashreport/CrashReport$WebViewInterface;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/crashreport/CrashReport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "WebViewInterface"
.end annotation


# virtual methods
.method public abstract addJavascriptInterface(Lcom/tencent/bugly/crashreport/crash/h5/H5JavaScriptInterface;Ljava/lang/String;)V
.end method

.method public abstract getContentDescription()Ljava/lang/CharSequence;
.end method

.method public abstract getUrl()Ljava/lang/String;
.end method

.method public abstract loadUrl(Ljava/lang/String;)V
.end method

.method public abstract setJavaScriptEnabled(Z)V
.end method
