package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class C0004e extends C0003d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static HashMap<String, byte[]> f4962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static HashMap<String, HashMap<String, byte[]>> f4963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected g f4964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4965l;

    public C0004e() {
        g gVar = new g();
        this.f4964k = gVar;
        this.f4965l = 0;
        gVar.f4977d = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C0003d, com.tencent.bugly.proguard.d0
    public <T> void a(String str, T t10) {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.a(str, t10);
    }

    public byte[] b() {
        g gVar = this.f4964k;
        if (gVar.f4977d != 2) {
            if (gVar.f4981h == null) {
                gVar.f4981h = "";
            }
            if (gVar.f4982i == null) {
                gVar.f4982i = "";
            }
        } else {
            if (gVar.f4981h.equals("")) {
                throw new IllegalArgumentException("servantName can not is null");
            }
            if (this.f4964k.f4982i.equals("")) {
                throw new IllegalArgumentException("funcName can not is null");
            }
        }
        C0009l c0009l = new C0009l(0);
        c0009l.a(this.f4954d);
        if (this.f4964k.f4977d == 2) {
            c0009l.a((Map) this.f4951a, 0);
        } else {
            c0009l.a((Map) this.f4948f, 0);
        }
        this.f4964k.f4983j = n.a(c0009l.a());
        C0009l c0009l2 = new C0009l(0);
        c0009l2.a(this.f4954d);
        a(c0009l2);
        byte[] bArrA = n.a(c0009l2.a());
        int length = bArrA.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrA).flip();
        return byteBufferAllocate.array();
    }

    public void c(String str) {
        this.f4964k.f4981h = str;
    }

    @Override // com.tencent.bugly.proguard.C0003d
    public void a() {
        super.a();
        this.f4964k.f4977d = (short) 3;
    }

    public void a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C0008k c0008k = new C0008k(bArr, 4);
                c0008k.a(this.f4954d);
                a(c0008k);
                g gVar = this.f4964k;
                if (gVar.f4977d == 3) {
                    C0008k c0008k2 = new C0008k(gVar.f4983j);
                    c0008k2.a(this.f4954d);
                    if (f4962i == null) {
                        HashMap<String, byte[]> map = new HashMap<>();
                        f4962i = map;
                        map.put("", new byte[0]);
                    }
                    this.f4948f = c0008k2.a((Map) f4962i, 0, false);
                    return;
                }
                C0008k c0008k3 = new C0008k(gVar.f4983j);
                c0008k3.a(this.f4954d);
                if (f4963j == null) {
                    f4963j = new HashMap<>();
                    HashMap<String, byte[]> map2 = new HashMap<>();
                    map2.put("", new byte[0]);
                    f4963j.put("", map2);
                }
                this.f4951a = c0008k3.a((Map) f4963j, 0, false);
                this.f4952b = new HashMap<>();
                return;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }

    public void b(String str) {
        this.f4964k.f4982i = str;
    }

    public void a(int i10) {
        this.f4964k.f4980g = i10;
    }

    public void a(C0009l c0009l) {
        this.f4964k.a(c0009l);
    }

    public void a(C0008k c0008k) {
        this.f4964k.a(c0008k);
    }
}
