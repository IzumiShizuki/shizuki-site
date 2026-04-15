package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13982b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f13984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f13985e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13981a = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13983c = 20;

    static {
        float f10 = 2;
        f13982b = f10;
        f13984d = f10;
        f13985e = f10;
    }

    public static final void a(final boolean z10, final ic.k kVar, j1.q qVar, boolean z11, p1 p1Var, x0.o oVar, final int i10, final int i11) {
        final j1.q qVar2;
        final boolean z12;
        final p1 p1Var2;
        j1.q qVar3;
        p1 p1VarN;
        int i12;
        boolean z13;
        ic.a aVar;
        oVar.Y(-2118660998);
        int i13 = (oVar.g(z10) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i13 |= oVar.h(kVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= oVar.f(qVar) ? 256 : 128;
        }
        int i15 = i13 | 93184;
        if (oVar.N(i15 & 1, (74899 & i15) != 74898)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                qVar3 = i14 != 0 ? j1.n.f9689a : qVar;
                p1VarN = gh.g.n(oVar);
                i12 = i15 & (-458753);
                z13 = true;
            } else {
                oVar.Q();
                qVar3 = qVar;
                p1VarN = p1Var;
                i12 = i15 & (-458753);
                z13 = z11;
            }
            oVar.q();
            s2.a aVar2 = z10 ? s2.a.f19356a : s2.a.f19357b;
            if (kVar != null) {
                oVar.W(1809984331);
                boolean z14 = ((i12 & 112) == 32) | ((i12 & 14) == 4);
                Object objK = oVar.K();
                if (z14 || objK == x0.k.f24334a) {
                    objK = new x0(kVar, z10, 0);
                    oVar.h0(objK);
                }
                aVar = (ic.a) objK;
                oVar.p(false);
            } else {
                oVar.W(1810049027);
                oVar.p(false);
                aVar = null;
            }
            ic.a aVar3 = aVar;
            boolean z15 = z13;
            c(aVar2, aVar3, qVar3, z15, p1VarN, oVar, i12 & 524160, 0);
            p1Var2 = p1VarN;
            z12 = z15;
            qVar2 = qVar3;
        } else {
            oVar.Q();
            qVar2 = qVar;
            z12 = z11;
            p1Var2 = p1Var;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.y0
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z0.a(z10, kVar, qVar2, z12, p1Var2, (x0.o) obj, x0.v.D(i10 | 1), i11);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r32, s2.a r33, j1.q r34, m0.p1 r35, x0.o r36, int r37) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.z0.b(boolean, s2.a, j1.q, m0.p1, x0.o, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(s2.a r15, ic.a r16, j1.q r17, boolean r18, m0.p1 r19, x0.o r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.z0.c(s2.a, ic.a, j1.q, boolean, m0.p1, x0.o, int, int):void");
    }
}
