package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class pa extends AbstractC0010m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static byte[] f5038a = {0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, String> f5039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5040c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5041d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5042e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5043f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5044g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5045h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5046i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f5047j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5048k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5049l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map<String, String> f5050m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f5051n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5052o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f5053p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f5054q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f5055r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5056s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f5057t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f5058u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f5059v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f5060w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f5061x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f5062y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f5063z = "";

    static {
        HashMap map = new HashMap();
        f5039b = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5040c, 0);
        c0009l.a(this.f5041d, 1);
        c0009l.a(this.f5042e, 2);
        c0009l.a(this.f5043f, 3);
        String str = this.f5044g;
        if (str != null) {
            c0009l.a(str, 4);
        }
        c0009l.a(this.f5045h, 5);
        c0009l.a(this.f5046i, 6);
        c0009l.a(this.f5047j, 7);
        String str2 = this.f5048k;
        if (str2 != null) {
            c0009l.a(str2, 8);
        }
        String str3 = this.f5049l;
        if (str3 != null) {
            c0009l.a(str3, 9);
        }
        Map<String, String> map = this.f5050m;
        if (map != null) {
            c0009l.a((Map) map, 10);
        }
        String str4 = this.f5051n;
        if (str4 != null) {
            c0009l.a(str4, 11);
        }
        c0009l.a(this.f5052o, 12);
        String str5 = this.f5053p;
        if (str5 != null) {
            c0009l.a(str5, 13);
        }
        String str6 = this.f5054q;
        if (str6 != null) {
            c0009l.a(str6, 14);
        }
        String str7 = this.f5055r;
        if (str7 != null) {
            c0009l.a(str7, 15);
        }
        c0009l.a(this.f5056s, 16);
        String str8 = this.f5057t;
        if (str8 != null) {
            c0009l.a(str8, 17);
        }
        String str9 = this.f5058u;
        if (str9 != null) {
            c0009l.a(str9, 18);
        }
        String str10 = this.f5059v;
        if (str10 != null) {
            c0009l.a(str10, 19);
        }
        String str11 = this.f5060w;
        if (str11 != null) {
            c0009l.a(str11, 20);
        }
        String str12 = this.f5061x;
        if (str12 != null) {
            c0009l.a(str12, 21);
        }
        String str13 = this.f5062y;
        if (str13 != null) {
            c0009l.a(str13, 22);
        }
        String str14 = this.f5063z;
        if (str14 != null) {
            c0009l.a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5040c = c0008k.a(this.f5040c, 0, true);
        this.f5041d = c0008k.a(1, true);
        this.f5042e = c0008k.a(2, true);
        this.f5043f = c0008k.a(3, true);
        this.f5044g = c0008k.a(4, false);
        this.f5045h = c0008k.a(5, true);
        this.f5046i = c0008k.a(this.f5046i, 6, true);
        this.f5047j = c0008k.a(f5038a, 7, true);
        this.f5048k = c0008k.a(8, false);
        this.f5049l = c0008k.a(9, false);
        this.f5050m = (Map) c0008k.a(f5039b, 10, false);
        this.f5051n = c0008k.a(11, false);
        this.f5052o = c0008k.a(this.f5052o, 12, false);
        this.f5053p = c0008k.a(13, false);
        this.f5054q = c0008k.a(14, false);
        this.f5055r = c0008k.a(15, false);
        this.f5056s = c0008k.a(this.f5056s, 16, false);
        this.f5057t = c0008k.a(17, false);
        this.f5058u = c0008k.a(18, false);
        this.f5059v = c0008k.a(19, false);
        this.f5060w = c0008k.a(20, false);
        this.f5061x = c0008k.a(21, false);
        this.f5062y = c0008k.a(22, false);
        this.f5063z = c0008k.a(23, false);
    }
}
