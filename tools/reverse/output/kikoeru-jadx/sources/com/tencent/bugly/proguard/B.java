package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static C0016y f4820a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static C0015x f4821b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static C0015x f4822c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Map<String, String> f4823d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f4824e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0016y f4829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0015x f4830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f4831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0015x f4834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map<String, String> f4836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f4837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4840u;

    public B() {
        this.f4825f = "";
        this.f4826g = "";
        this.f4827h = 0L;
        this.f4828i = 0;
        this.f4829j = null;
        this.f4830k = null;
        this.f4831l = (byte) 0;
        this.f4832m = 0;
        this.f4833n = 0L;
        this.f4834o = null;
        this.f4835p = "";
        this.f4836q = null;
        this.f4837r = "";
        this.f4838s = 0;
        this.f4839t = 0L;
        this.f4840u = 0;
    }

    public C0015x a() {
        return this.f4830k;
    }

    public long b() {
        return this.f4827h;
    }

    public Map<String, String> c() {
        return this.f4836q;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4824e) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        B b10 = (B) obj;
        return n.a(this.f4825f, b10.f4825f) && n.a(this.f4826g, b10.f4826g) && n.a(this.f4827h, b10.f4827h) && n.a(this.f4828i, b10.f4828i) && n.a(this.f4829j, b10.f4829j) && n.a(this.f4830k, b10.f4830k) && n.a(this.f4831l, b10.f4831l) && n.a(this.f4832m, b10.f4832m) && n.a(this.f4833n, b10.f4833n) && n.a(this.f4834o, b10.f4834o) && n.a(this.f4835p, b10.f4835p) && n.a(this.f4836q, b10.f4836q) && n.a(this.f4837r, b10.f4837r) && n.a(this.f4838s, b10.f4838s) && n.a(this.f4839t, b10.f4839t) && n.a(this.f4840u, b10.f4840u);
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f4825f, 0);
        c0009l.a(this.f4826g, 1);
        c0009l.a(this.f4827h, 2);
        c0009l.a(this.f4828i, 3);
        c0009l.a((AbstractC0010m) this.f4829j, 4);
        c0009l.a((AbstractC0010m) this.f4830k, 5);
        c0009l.a(this.f4831l, 6);
        c0009l.a(this.f4832m, 7);
        c0009l.a(this.f4833n, 8);
        C0015x c0015x = this.f4834o;
        if (c0015x != null) {
            c0009l.a((AbstractC0010m) c0015x, 9);
        }
        String str = this.f4835p;
        if (str != null) {
            c0009l.a(str, 10);
        }
        Map<String, String> map = this.f4836q;
        if (map != null) {
            c0009l.a((Map) map, 11);
        }
        String str2 = this.f4837r;
        if (str2 != null) {
            c0009l.a(str2, 12);
        }
        c0009l.a(this.f4838s, 13);
        c0009l.a(this.f4839t, 14);
        c0009l.a(this.f4840u, 15);
    }

    public B(String str, String str2, long j10, int i10, C0016y c0016y, C0015x c0015x, byte b10, int i11, long j11, C0015x c0015x2, String str3, Map<String, String> map, String str4, int i12, long j12, int i13) {
        this.f4825f = str;
        this.f4826g = str2;
        this.f4827h = j10;
        this.f4828i = i10;
        this.f4829j = c0016y;
        this.f4830k = c0015x;
        this.f4831l = b10;
        this.f4832m = i11;
        this.f4833n = j11;
        this.f4834o = c0015x2;
        this.f4835p = str3;
        this.f4836q = map;
        this.f4837r = str4;
        this.f4838s = i12;
        this.f4839t = j12;
        this.f4840u = i13;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f4825f = c0008k.a(0, true);
        this.f4826g = c0008k.a(1, true);
        this.f4827h = c0008k.a(this.f4827h, 2, true);
        this.f4828i = c0008k.a(this.f4828i, 3, true);
        if (f4820a == null) {
            f4820a = new C0016y();
        }
        this.f4829j = (C0016y) c0008k.a((AbstractC0010m) f4820a, 4, true);
        if (f4821b == null) {
            f4821b = new C0015x();
        }
        this.f4830k = (C0015x) c0008k.a((AbstractC0010m) f4821b, 5, true);
        this.f4831l = c0008k.a(this.f4831l, 6, true);
        this.f4832m = c0008k.a(this.f4832m, 7, false);
        this.f4833n = c0008k.a(this.f4833n, 8, false);
        if (f4822c == null) {
            f4822c = new C0015x();
        }
        this.f4834o = (C0015x) c0008k.a((AbstractC0010m) f4822c, 9, false);
        this.f4835p = c0008k.a(10, false);
        if (f4823d == null) {
            HashMap map = new HashMap();
            f4823d = map;
            map.put("", "");
        }
        this.f4836q = (Map) c0008k.a(f4823d, 11, false);
        this.f4837r = c0008k.a(12, false);
        this.f4838s = c0008k.a(this.f4838s, 13, false);
        this.f4839t = c0008k.a(this.f4839t, 14, false);
        this.f4840u = c0008k.a(this.f4840u, 15, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a(this.f4825f, "title");
        c0006i.a(this.f4826g, "newFeature");
        c0006i.a(this.f4827h, "publishTime");
        c0006i.a(this.f4828i, "publishType");
        c0006i.a((AbstractC0010m) this.f4829j, "appBasicInfo");
        c0006i.a((AbstractC0010m) this.f4830k, "apkBaseInfo");
        c0006i.a(this.f4831l, "updateStrategy");
        c0006i.a(this.f4832m, "popTimes");
        c0006i.a(this.f4833n, "popInterval");
        c0006i.a((AbstractC0010m) this.f4834o, "diffApkInfo");
        c0006i.a(this.f4835p, "netType");
        c0006i.a((Map) this.f4836q, "reserved");
        c0006i.a(this.f4837r, "strategyId");
        c0006i.a(this.f4838s, "status");
        c0006i.a(this.f4839t, "updateTime");
        c0006i.a(this.f4840u, "updateType");
    }
}
