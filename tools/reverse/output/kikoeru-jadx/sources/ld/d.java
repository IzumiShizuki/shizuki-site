package ld;

import bd.s0;
import bd.y0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f12195b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f12196c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f12197d = new d(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f12198e = new d(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f12199f = new d(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f12200g = new d(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f12201h = new d(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12202a;

    public /* synthetic */ d(int i10) {
        this.f12202a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yc.c cVarB;
        String strK;
        boolean z10 = false;
        switch (this.f12202a) {
            case 0:
                yc.c cVar = (yc.c) obj;
                int i10 = e.f12203l;
                jc.l.e(cVar, "it");
                return Boolean.valueOf(vb.m.S(f0.f12219f, ua.l.K(cVar)));
            case 1:
                yc.c cVar2 = (yc.c) obj;
                int i11 = e.f12203l;
                jc.l.e(cVar2, "it");
                if ((cVar2 instanceof yc.t) && vb.m.S(f0.f12219f, ua.l.K(cVar2))) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                yc.c cVar3 = (yc.c) obj;
                jc.l.e(cVar3, "it");
                return Boolean.valueOf(pc.f0.H(cVar3));
            case 3:
                return ((y0) obj).b();
            case 4:
                yc.c cVar4 = (yc.c) obj;
                jc.l.e(cVar4, "it");
                return Boolean.valueOf(pc.f0.H(ie.d.k(cVar4)));
            case 5:
                yc.c cVar5 = (yc.c) obj;
                jc.l.e(cVar5, "it");
                int i12 = c.f12190l;
                s0 s0Var = (s0) cVar5;
                if (vc.i.z(s0Var) && ie.d.b(s0Var, new bd.a(8, s0Var)) != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                yc.c cVar6 = (yc.c) obj;
                jc.l.e(cVar6, "it");
                if (vc.i.z(cVar6)) {
                    int i13 = e.f12203l;
                    c0 c0Var = null;
                    if (f0.f12218e.contains(cVar6.getName()) && (cVarB = ie.d.b(cVar6, f12196c)) != null && (strK = ua.l.K(cVarB)) != null) {
                        c0Var = f0.f12215b.contains(strK) ? c0.f12191a : ((e0) vb.w.r(strK, f0.f12217d)) == e0.f12204b ? c0.f12193c : c0.f12192b;
                    }
                    if (c0Var != null) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
