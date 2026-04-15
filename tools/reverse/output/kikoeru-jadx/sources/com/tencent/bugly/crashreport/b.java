package com.tencent.bugly.crashreport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    boolean appendLogToNative(String str, String str2, String str3);

    String getLogFromNative();

    boolean setNativeIsAppForeground(boolean z10);
}
