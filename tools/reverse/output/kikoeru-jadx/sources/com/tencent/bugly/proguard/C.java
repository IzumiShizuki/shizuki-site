package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Map<String, String> f4841a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f4842b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f4846f;

    public C() {
        this.f4843c = 0;
        this.f4844d = "";
        this.f4845e = 0L;
        this.f4846f = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f4843c, 0);
        String str = this.f4844d;
        if (str != null) {
            c0009l.a(str, 1);
        }
        c0009l.a(this.f4845e, 2);
        Map<String, String> map = this.f4846f;
        if (map != null) {
            c0009l.a((Map) map, 3);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4842b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C c3 = (C) obj;
        return n.a(this.f4843c, c3.f4843c) && n.a(this.f4844d, c3.f4844d) && n.a(this.f4845e, c3.f4845e) && n.a(this.f4846f, c3.f4846f);
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public C(int i10, String str, long j10, Map<String, String> map) {
        this.f4843c = i10;
        this.f4844d = str;
        this.f4845e = j10;
        this.f4846f = map;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f4843c = c0008k.a(this.f4843c, 0, false);
        this.f4844d = c0008k.a(1, false);
        this.f4845e = c0008k.a(this.f4845e, 2, false);
        if (f4841a == null) {
            HashMap map = new HashMap();
            f4841a = map;
            map.put("", "");
        }
        this.f4846f = (Map) c0008k.a(f4841a, 3, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a(this.f4843c, "flag");
        c0006i.a(this.f4844d, "localStrategyId");
        c0006i.a(this.f4845e, "localStrategyTime");
        c0006i.a((Map) this.f4846f, "reserved");
    }
}
