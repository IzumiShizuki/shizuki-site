package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static C0016y f5161a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, String> f5162b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f5163c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f5166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0016y f5168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<String, String> f5171k;

    public z() {
        this.f5164d = "";
        this.f5165e = 0L;
        this.f5166f = (byte) 0;
        this.f5167g = 0L;
        this.f5168h = null;
        this.f5169i = "";
        this.f5170j = 0;
        this.f5171k = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5164d, 0);
        c0009l.a(this.f5165e, 1);
        c0009l.a(this.f5166f, 2);
        c0009l.a(this.f5167g, 3);
        C0016y c0016y = this.f5168h;
        if (c0016y != null) {
            c0009l.a((AbstractC0010m) c0016y, 4);
        }
        String str = this.f5169i;
        if (str != null) {
            c0009l.a(str, 5);
        }
        c0009l.a(this.f5170j, 6);
        Map<String, String> map = this.f5171k;
        if (map != null) {
            c0009l.a((Map) map, 7);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f5163c) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        z zVar = (z) obj;
        return n.a(this.f5164d, zVar.f5164d) && n.a(this.f5165e, zVar.f5165e) && n.a(this.f5166f, zVar.f5166f) && n.a(this.f5167g, zVar.f5167g) && n.a(this.f5168h, zVar.f5168h) && n.a(this.f5169i, zVar.f5169i) && n.a(this.f5170j, zVar.f5170j) && n.a(this.f5171k, zVar.f5171k);
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public z(String str, long j10, byte b10, long j11, C0016y c0016y, String str2, int i10, Map<String, String> map) {
        this.f5164d = str;
        this.f5165e = j10;
        this.f5166f = b10;
        this.f5167g = j11;
        this.f5168h = c0016y;
        this.f5169i = str2;
        this.f5170j = i10;
        this.f5171k = map;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5164d = c0008k.a(0, true);
        this.f5165e = c0008k.a(this.f5165e, 1, true);
        this.f5166f = c0008k.a(this.f5166f, 2, true);
        this.f5167g = c0008k.a(this.f5167g, 3, false);
        if (f5161a == null) {
            f5161a = new C0016y();
        }
        this.f5168h = (C0016y) c0008k.a((AbstractC0010m) f5161a, 4, false);
        this.f5169i = c0008k.a(5, false);
        this.f5170j = c0008k.a(this.f5170j, 6, false);
        if (f5162b == null) {
            HashMap map = new HashMap();
            f5162b = map;
            map.put("", "");
        }
        this.f5171k = (Map) c0008k.a(f5162b, 7, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a(this.f5164d, "eventType");
        c0006i.a(this.f5165e, "eventTime");
        c0006i.a(this.f5166f, "eventResult");
        c0006i.a(this.f5167g, "eventElapse");
        c0006i.a((AbstractC0010m) this.f5168h, "destAppInfo");
        c0006i.a(this.f5169i, "strategyId");
        c0006i.a(this.f5170j, "updateType");
        c0006i.a((Map) this.f5171k, "reserved");
    }
}
