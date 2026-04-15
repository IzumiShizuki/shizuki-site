package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class C0003d extends d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected HashMap<String, byte[]> f4948f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, Object> f4949g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    C0008k f4950h = new C0008k();

    private void c(String str, Object obj) {
        this.f4949g.put(str, obj);
    }

    public void a(String str) {
        this.f4954d = str;
    }

    public <T> T b(String str, T t10) {
        HashMap<String, byte[]> map = this.f4948f;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f4949g.containsKey(str)) {
                return (T) this.f4949g.get(str);
            }
            try {
                T t11 = (T) a(this.f4948f.get(str), t10);
                if (t11 == null) {
                    return t11;
                }
                c(str, t11);
                return t11;
            } catch (Exception e10) {
                throw new C0002b(e10);
            }
        }
        if (!this.f4951a.containsKey(str)) {
            return null;
        }
        if (this.f4949g.containsKey(str)) {
            return (T) this.f4949g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f4951a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f4950h.a(value);
            this.f4950h.a(this.f4954d);
            T t12 = (T) this.f4950h.a((Object) t10, 0, true);
            c(str, t12);
            return t12;
        } catch (Exception e11) {
            throw new C0002b(e11);
        }
    }

    public void a() {
        this.f4948f = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.d0
    public <T> void a(String str, T t10) {
        if (this.f4948f == null) {
            super.a(str, t10);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t10 != null) {
            if (!(t10 instanceof Set)) {
                C0009l c0009l = new C0009l();
                c0009l.a(this.f4954d);
                c0009l.a(t10, 0);
                this.f4948f.put(str, n.a(c0009l.a()));
                return;
            }
            throw new IllegalArgumentException("can not support Set");
        }
        throw new IllegalArgumentException("put value can not is null");
    }

    private Object a(byte[] bArr, Object obj) {
        this.f4950h.a(bArr);
        this.f4950h.a(this.f4954d);
        return this.f4950h.a(obj, 0, true);
    }
}
