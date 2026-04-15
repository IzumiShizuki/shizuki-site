package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class na extends AbstractC0010m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Map<String, String> f5009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static la f5010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ka f5011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static ArrayList<ka> f5012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static ArrayList<ka> f5013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList<ma> f5014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Map<String, String> f5015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static Map<String, String> f5016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5017i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5018j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5019k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5020l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5021m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f5022n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f5023o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map<String, String> f5024p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f5025q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public la f5026r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5027s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f5028t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f5029u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ka f5030v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<ka> f5031w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<ka> f5032x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList<ma> f5033y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map<String, String> f5034z = null;
    public Map<String, String> A = null;
    public String B = "";
    public boolean C = true;

    static {
        HashMap map = new HashMap();
        f5009a = map;
        map.put("", "");
        f5010b = new la();
        f5011c = new ka();
        f5012d = new ArrayList<>();
        f5012d.add(new ka());
        f5013e = new ArrayList<>();
        f5013e.add(new ka());
        f5014f = new ArrayList<>();
        f5014f.add(new ma());
        HashMap map2 = new HashMap();
        f5015g = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        f5016h = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5017i, 0);
        c0009l.a(this.f5018j, 1);
        c0009l.a(this.f5019k, 2);
        String str = this.f5020l;
        if (str != null) {
            c0009l.a(str, 3);
        }
        String str2 = this.f5021m;
        if (str2 != null) {
            c0009l.a(str2, 4);
        }
        String str3 = this.f5022n;
        if (str3 != null) {
            c0009l.a(str3, 5);
        }
        String str4 = this.f5023o;
        if (str4 != null) {
            c0009l.a(str4, 6);
        }
        Map<String, String> map = this.f5024p;
        if (map != null) {
            c0009l.a((Map) map, 7);
        }
        String str5 = this.f5025q;
        if (str5 != null) {
            c0009l.a(str5, 8);
        }
        la laVar = this.f5026r;
        if (laVar != null) {
            c0009l.a((AbstractC0010m) laVar, 9);
        }
        c0009l.a(this.f5027s, 10);
        String str6 = this.f5028t;
        if (str6 != null) {
            c0009l.a(str6, 11);
        }
        String str7 = this.f5029u;
        if (str7 != null) {
            c0009l.a(str7, 12);
        }
        ka kaVar = this.f5030v;
        if (kaVar != null) {
            c0009l.a((AbstractC0010m) kaVar, 13);
        }
        ArrayList<ka> arrayList = this.f5031w;
        if (arrayList != null) {
            c0009l.a((Collection) arrayList, 14);
        }
        ArrayList<ka> arrayList2 = this.f5032x;
        if (arrayList2 != null) {
            c0009l.a((Collection) arrayList2, 15);
        }
        ArrayList<ma> arrayList3 = this.f5033y;
        if (arrayList3 != null) {
            c0009l.a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f5034z;
        if (map2 != null) {
            c0009l.a((Map) map2, 17);
        }
        Map<String, String> map3 = this.A;
        if (map3 != null) {
            c0009l.a((Map) map3, 18);
        }
        String str8 = this.B;
        if (str8 != null) {
            c0009l.a(str8, 19);
        }
        c0009l.a(this.C, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5017i = c0008k.a(0, true);
        this.f5018j = c0008k.a(this.f5018j, 1, true);
        this.f5019k = c0008k.a(2, true);
        this.f5020l = c0008k.a(3, false);
        this.f5021m = c0008k.a(4, false);
        this.f5022n = c0008k.a(5, false);
        this.f5023o = c0008k.a(6, false);
        this.f5024p = (Map) c0008k.a(f5009a, 7, false);
        this.f5025q = c0008k.a(8, false);
        this.f5026r = (la) c0008k.a((AbstractC0010m) f5010b, 9, false);
        this.f5027s = c0008k.a(this.f5027s, 10, false);
        this.f5028t = c0008k.a(11, false);
        this.f5029u = c0008k.a(12, false);
        this.f5030v = (ka) c0008k.a((AbstractC0010m) f5011c, 13, false);
        this.f5031w = (ArrayList) c0008k.a(f5012d, 14, false);
        this.f5032x = (ArrayList) c0008k.a(f5013e, 15, false);
        this.f5033y = (ArrayList) c0008k.a(f5014f, 16, false);
        this.f5034z = (Map) c0008k.a(f5015g, 17, false);
        this.A = (Map) c0008k.a(f5016h, 18, false);
        this.B = c0008k.a(19, false);
        this.C = c0008k.a(this.C, 20, false);
    }
}
