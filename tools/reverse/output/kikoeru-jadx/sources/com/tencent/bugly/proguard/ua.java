package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static ArrayList<ta> f5130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, String> f5131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f5132c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5133d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5134e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<ta> f5135f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, String> f5136g = null;

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5132c, 0);
        String str = this.f5133d;
        if (str != null) {
            c0009l.a(str, 1);
        }
        String str2 = this.f5134e;
        if (str2 != null) {
            c0009l.a(str2, 2);
        }
        ArrayList<ta> arrayList = this.f5135f;
        if (arrayList != null) {
            c0009l.a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f5136g;
        if (map != null) {
            c0009l.a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5132c = c0008k.a(this.f5132c, 0, true);
        this.f5133d = c0008k.a(1, false);
        this.f5134e = c0008k.a(2, false);
        if (f5130a == null) {
            f5130a = new ArrayList<>();
            f5130a.add(new ta());
        }
        this.f5135f = (ArrayList) c0008k.a(f5130a, 3, false);
        if (f5131b == null) {
            HashMap map = new HashMap();
            f5131b = map;
            map.put("", "");
        }
        this.f5136g = (Map) c0008k.a(f5131b, 4, false);
    }
}
