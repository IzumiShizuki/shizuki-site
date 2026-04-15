package com.tencent.bugly.crashreport.crash.h5;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4768a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4769b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4770c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4771d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4772e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4773f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4774g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4775h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4776i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4777j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4778k = 0;

    public Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f4768a;
        if (str != null) {
            linkedHashMap.put("[JS] projectRoot", str);
        }
        String str2 = this.f4769b;
        if (str2 != null) {
            linkedHashMap.put("[JS] context", str2);
        }
        String str3 = this.f4770c;
        if (str3 != null) {
            linkedHashMap.put("[JS] url", str3);
        }
        String str4 = this.f4771d;
        if (str4 != null) {
            linkedHashMap.put("[JS] userAgent", str4);
        }
        String str5 = this.f4776i;
        if (str5 != null) {
            linkedHashMap.put("[JS] file", str5);
        }
        long j10 = this.f4777j;
        if (j10 != 0) {
            linkedHashMap.put("[JS] lineNumber", Long.toString(j10));
        }
        return linkedHashMap;
    }
}
