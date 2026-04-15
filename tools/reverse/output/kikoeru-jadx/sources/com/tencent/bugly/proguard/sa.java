package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class sa extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static ra f5106a = new ra();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, String> f5107b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f5108c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5109d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5110e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5111f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5112g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5113h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ra f5114i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, String> f5115j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5116k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5117l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5118m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5119n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5120o = 0;

    static {
        HashMap map = new HashMap();
        f5107b = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5109d, 0);
        c0009l.a(this.f5110e, 1);
        c0009l.a(this.f5111f, 2);
        String str = this.f5112g;
        if (str != null) {
            c0009l.a(str, 3);
        }
        String str2 = this.f5113h;
        if (str2 != null) {
            c0009l.a(str2, 4);
        }
        ra raVar = this.f5114i;
        if (raVar != null) {
            c0009l.a((AbstractC0010m) raVar, 5);
        }
        Map<String, String> map = this.f5115j;
        if (map != null) {
            c0009l.a((Map) map, 6);
        }
        c0009l.a(this.f5116k, 7);
        String str3 = this.f5117l;
        if (str3 != null) {
            c0009l.a(str3, 8);
        }
        String str4 = this.f5118m;
        if (str4 != null) {
            c0009l.a(str4, 9);
        }
        c0009l.a(this.f5119n, 10);
        c0009l.a(this.f5120o, 11);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f5108c) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        sa saVar = (sa) obj;
        return n.a(this.f5109d, saVar.f5109d) && n.a(this.f5110e, saVar.f5110e) && n.a(this.f5111f, saVar.f5111f) && n.a(this.f5112g, saVar.f5112g) && n.a(this.f5113h, saVar.f5113h) && n.a(this.f5114i, saVar.f5114i) && n.a(this.f5115j, saVar.f5115j) && n.a(this.f5116k, saVar.f5116k) && n.a(this.f5117l, saVar.f5117l) && n.a(this.f5118m, saVar.f5118m) && n.a(this.f5119n, saVar.f5119n) && n.a(this.f5120o, saVar.f5120o);
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
    public void a(C0008k c0008k) {
        this.f5109d = c0008k.a(this.f5109d, 0, true);
        this.f5110e = c0008k.a(this.f5110e, 1, true);
        this.f5111f = c0008k.a(this.f5111f, 2, true);
        this.f5112g = c0008k.a(3, false);
        this.f5113h = c0008k.a(4, false);
        this.f5114i = (ra) c0008k.a((AbstractC0010m) f5106a, 5, false);
        this.f5115j = (Map) c0008k.a(f5107b, 6, false);
        this.f5116k = c0008k.a(this.f5116k, 7, false);
        this.f5117l = c0008k.a(8, false);
        this.f5118m = c0008k.a(9, false);
        this.f5119n = c0008k.a(this.f5119n, 10, false);
        this.f5120o = c0008k.a(this.f5120o, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a(this.f5109d, "enable");
        c0006i.a(this.f5110e, "enableUserInfo");
        c0006i.a(this.f5111f, "enableQuery");
        c0006i.a(this.f5112g, "url");
        c0006i.a(this.f5113h, "expUrl");
        c0006i.a((AbstractC0010m) this.f5114i, "security");
        c0006i.a((Map) this.f5115j, "valueMap");
        c0006i.a(this.f5116k, "strategylastUpdateTime");
        c0006i.a(this.f5117l, "httpsUrl");
        c0006i.a(this.f5118m, "httpsExpUrl");
        c0006i.a(this.f5119n, "eventRecordCount");
        c0006i.a(this.f5120o, "eventTimeInterval");
    }
}
