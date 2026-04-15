package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13298a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13299b = 12;

    public static final void a(final w8 w8Var, final String str, final ic.n nVar, final y2.g0 g0Var, final ic.n nVar2, final ic.n nVar3, final ic.n nVar4, final ic.n nVar5, final boolean z10, final boolean z11, final boolean z12, final w.k kVar, final y.d1 d1Var, final q1.l0 l0Var, final x1 x1Var, final ic.n nVar6, x0.o oVar, final int i10, final int i11) {
        int i12;
        ic.n nVar7;
        int i13;
        int i14;
        b3 b3Var;
        boolean z13;
        boolean z14;
        oVar.Y(418608794);
        if ((i10 & 6) == 0) {
            i12 = (oVar.d(w8Var.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= oVar.f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            nVar7 = nVar;
            i12 |= oVar.h(nVar7) ? 256 : 128;
        } else {
            nVar7 = nVar;
        }
        if ((i10 & 3072) == 0) {
            i12 |= oVar.f(g0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= oVar.h(nVar2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i13 = 196608;
            i12 |= oVar.h(nVar3) ? 131072 : 65536;
        } else {
            i13 = 196608;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= oVar.h(nVar4) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= oVar.h(nVar5) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= oVar.g(z10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= oVar.g(z11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i14 = i11 | (oVar.g(z12) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= oVar.f(kVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= oVar.f(d1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= oVar.f(l0Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= oVar.f(x1Var) ? 16384 : 8192;
        }
        if ((i11 & i13) == 0) {
            i14 |= oVar.h(nVar6) ? 131072 : 65536;
        }
        if (oVar.N(i12 & 1, ((i12 & 306783379) == 306783378 && (i14 & 74899) == 74898) ? false : true)) {
            boolean z15 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048);
            Object objK = oVar.K();
            if (z15 || objK == x0.k.f24334a) {
                objK = g0Var.a(new t2.g(str));
                oVar.h0(objK);
            }
            String str2 = ((y2.d0) objK).f25401a.f20320b;
            s3 s3Var = ((Boolean) ud.b.i(kVar, oVar, (i14 >> 3) & 14).getValue()).booleanValue() ? s3.f13595a : str2.length() == 0 ? s3.f13596b : s3.f13597c;
            c8 c8Var = new c8(x1Var, z11, z12, kVar);
            x0.o2 o2Var = e9.f12960b;
            d9 d9Var = (d9) oVar.j(o2Var);
            t2.l0 l0Var2 = d9Var.f12884g;
            t2.l0 l0Var3 = d9Var.f12889l;
            long jB = l0Var2.b();
            long j10 = q1.q.f17575h;
            boolean z16 = (q1.q.c(jB, j10) && !q1.q.c(l0Var3.b(), j10)) || (!q1.q.c(l0Var2.b(), j10) && q1.q.c(l0Var3.b(), j10));
            b3 b3Var2 = b3.f12722b;
            oVar.W(-1443811635);
            long jB2 = ((d9) oVar.j(o2Var)).f12889l.b();
            if (z16) {
                oVar.W(-887928539);
                if (jB2 == 16) {
                    jB2 = ((q1.q) c8Var.g(s3Var, oVar, 0)).f17577a;
                }
                z13 = false;
                oVar.p(false);
                b3Var = b3Var2;
            } else {
                b3Var = b3Var2;
                z13 = false;
                oVar.W(1218284988);
                oVar.p(false);
            }
            long j11 = jB2;
            oVar.p(z13);
            oVar.W(-1443804369);
            long jB3 = ((d9) oVar.j(o2Var)).f12884g.b();
            if (z16) {
                oVar.W(-1026713946);
                if (jB3 == 16) {
                    jB3 = ((q1.q) c8Var.g(s3Var, oVar, 0)).f17577a;
                }
                z14 = false;
                oVar.p(false);
            } else {
                z14 = false;
                oVar.W(798166043);
                oVar.p(false);
            }
            long j12 = jB3;
            oVar.p(z14);
            if (nVar2 != null) {
                z14 = true;
            }
            b3Var.b(s3Var, j11, j12, c8Var, z14, f1.g.f(33336375, new k8(nVar2, nVar3, str2, x1Var, z11, z12, kVar, nVar4, nVar5, l0Var, w8Var, nVar7, z10, d1Var, z16, nVar6), oVar), oVar, 1769472);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.e8
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(i10 | 1);
                    int iD2 = x0.v.D(i11);
                    m8.a(w8Var, str, nVar, g0Var, nVar2, nVar3, nVar4, nVar5, z10, z11, z12, kVar, d1Var, l0Var, x1Var, nVar6, (x0.o) obj, iD, iD2);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void b(final long j10, t2.l0 l0Var, final ic.n nVar, x0.o oVar, final int i10, final int i11) {
        int i12;
        oVar.Y(2064632657);
        int i13 = (oVar.e(j10) ? 4 : 2) | i10;
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 = i13 | 48;
        } else {
            i12 = i13 | (oVar.f(l0Var) ? 32 : 16);
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= oVar.f(null) ? 256 : 128;
        }
        int i15 = i12 | (oVar.h(nVar) ? 2048 : 1024);
        if (oVar.N(i15 & 1, (i15 & 1171) != 1170)) {
            if (i14 != 0) {
                l0Var = null;
            }
            f1.f fVarF = f1.g.f(-650790565, new l8(j10, (Float) null, nVar), oVar);
            if (l0Var != null) {
                oVar.W(-162878945);
                z8.a(l0Var, fVarF, oVar, ((i15 >> 3) & 14) | 48);
            } else {
                oVar.W(-162877309);
                fVarF.q(oVar, 6);
            }
            oVar.p(false);
        } else {
            oVar.Q();
        }
        final t2.l0 l0Var2 = l0Var;
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.f8
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m8.b(j10, l0Var2, nVar, (x0.o) obj, x0.v.D(i10 | 1), i11);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final Object c(g2.u0 u0Var) {
        Object objA = u0Var.A();
        g2.d0 d0Var = objA instanceof g2.d0 ? (g2.d0) objA : null;
        if (d0Var != null) {
            return d0Var.f7165o;
        }
        return null;
    }
}
