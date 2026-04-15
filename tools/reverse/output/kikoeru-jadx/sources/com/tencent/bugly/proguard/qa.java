package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends AbstractC0010m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static byte[] f5067a = {0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, String> f5068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f5069c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5070d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f5071e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5072f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5073g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5074h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5075i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, String> f5076j = null;

    static {
        HashMap map = new HashMap();
        f5068b = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5069c, 0);
        c0009l.a(this.f5070d, 1);
        byte[] bArr = this.f5071e;
        if (bArr != null) {
            c0009l.a(bArr, 2);
        }
        String str = this.f5072f;
        if (str != null) {
            c0009l.a(str, 3);
        }
        c0009l.a(this.f5073g, 4);
        String str2 = this.f5074h;
        if (str2 != null) {
            c0009l.a(str2, 5);
        }
        String str3 = this.f5075i;
        if (str3 != null) {
            c0009l.a(str3, 6);
        }
        Map<String, String> map = this.f5076j;
        if (map != null) {
            c0009l.a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5069c = c0008k.a(this.f5069c, 0, true);
        this.f5070d = c0008k.a(this.f5070d, 1, true);
        this.f5071e = c0008k.a(f5067a, 2, false);
        this.f5072f = c0008k.a(3, false);
        this.f5073g = c0008k.a(this.f5073g, 4, false);
        this.f5074h = c0008k.a(5, false);
        this.f5075i = c0008k.a(6, false);
        this.f5076j = (Map) c0008k.a(f5068b, 7, false);
    }
}
