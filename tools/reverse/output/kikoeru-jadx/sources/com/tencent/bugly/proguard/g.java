package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0010m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static byte[] f4974a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, String> f4975b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f4976c = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f4983j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map<String, String> f4985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map<String, String> f4986m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f4977d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f4978e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4979f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4980g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4981h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4982i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4984k = 0;

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f4977d, 1);
        c0009l.a(this.f4978e, 2);
        c0009l.a(this.f4979f, 3);
        c0009l.a(this.f4980g, 4);
        c0009l.a(this.f4981h, 5);
        c0009l.a(this.f4982i, 6);
        c0009l.a(this.f4983j, 7);
        c0009l.a(this.f4984k, 8);
        c0009l.a((Map) this.f4985l, 9);
        c0009l.a((Map) this.f4986m, 10);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4976c) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        g gVar = (g) obj;
        return n.a(1, (int) gVar.f4977d) && n.a(1, (int) gVar.f4978e) && n.a(1, gVar.f4979f) && n.a(1, gVar.f4980g) && n.a((Object) 1, (Object) gVar.f4981h) && n.a((Object) 1, (Object) gVar.f4982i) && n.a((Object) 1, (Object) gVar.f4983j) && n.a(1, gVar.f4984k) && n.a((Object) 1, (Object) gVar.f4985l) && n.a((Object) 1, (Object) gVar.f4986m);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        try {
            this.f4977d = c0008k.a(this.f4977d, 1, true);
            this.f4978e = c0008k.a(this.f4978e, 2, true);
            this.f4979f = c0008k.a(this.f4979f, 3, true);
            this.f4980g = c0008k.a(this.f4980g, 4, true);
            this.f4981h = c0008k.a(5, true);
            this.f4982i = c0008k.a(6, true);
            if (f4974a == null) {
                f4974a = new byte[]{0};
            }
            this.f4983j = c0008k.a(f4974a, 7, true);
            this.f4984k = c0008k.a(this.f4984k, 8, true);
            if (f4975b == null) {
                HashMap map = new HashMap();
                f4975b = map;
                map.put("", "");
            }
            this.f4985l = (Map) c0008k.a(f4975b, 9, true);
            if (f4975b == null) {
                HashMap map2 = new HashMap();
                f4975b = map2;
                map2.put("", "");
            }
            this.f4986m = (Map) c0008k.a(f4975b, 10, true);
        } catch (Exception e10) {
            e10.printStackTrace();
            System.out.println("RequestPacket decode error " + f.a(this.f4983j));
            throw new RuntimeException(e10);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a(this.f4977d, "iVersion");
        c0006i.a(this.f4978e, "cPacketType");
        c0006i.a(this.f4979f, "iMessageType");
        c0006i.a(this.f4980g, "iRequestId");
        c0006i.a(this.f4981h, "sServantName");
        c0006i.a(this.f4982i, "sFuncName");
        c0006i.a(this.f4983j, "sBuffer");
        c0006i.a(this.f4984k, "iTimeout");
        c0006i.a((Map) this.f4985l, "context");
        c0006i.a((Map) this.f4986m, "status");
    }
}
