package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class ta extends AbstractC0010m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Map<String, String> f5121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5122b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f5123c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5124d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5125e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5126f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, String> f5127g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5128h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5129i = true;

    static {
        HashMap map = new HashMap();
        f5121a = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5122b, 0);
        c0009l.a(this.f5123c, 1);
        String str = this.f5124d;
        if (str != null) {
            c0009l.a(str, 2);
        }
        String str2 = this.f5125e;
        if (str2 != null) {
            c0009l.a(str2, 3);
        }
        String str3 = this.f5126f;
        if (str3 != null) {
            c0009l.a(str3, 4);
        }
        Map<String, String> map = this.f5127g;
        if (map != null) {
            c0009l.a((Map) map, 5);
        }
        String str4 = this.f5128h;
        if (str4 != null) {
            c0009l.a(str4, 6);
        }
        c0009l.a(this.f5129i, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5122b = c0008k.a(this.f5122b, 0, true);
        this.f5123c = c0008k.a(this.f5123c, 1, true);
        this.f5124d = c0008k.a(2, false);
        this.f5125e = c0008k.a(3, false);
        this.f5126f = c0008k.a(4, false);
        this.f5127g = (Map) c0008k.a(f5121a, 5, false);
        this.f5128h = c0008k.a(6, false);
        this.f5129i = c0008k.a(this.f5129i, 7, false);
    }
}
