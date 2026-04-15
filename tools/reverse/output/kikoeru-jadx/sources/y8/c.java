package y8;

import a9.r;
import j1.n;
import j1.q;
import java.util.ArrayList;
import m0.b1;
import m0.c1;
import m0.d9;
import m0.e9;
import m0.h1;
import m0.j1;
import m0.z8;
import q1.h0;
import t2.l0;
import ub.a0;
import x0.m1;
import x0.n1;
import x0.o;
import x0.o2;
import x0.p1;
import x0.v;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f25899a = new f1.f(new t9.h(29), 1733826592, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o2 f25900b;

    public static final void a(q qVar, long j10, final float f10, final float f11, o oVar, final int i10) {
        oVar.Y(-1135529849);
        int i11 = i10 | 22 | (oVar.c(f10) ? 256 : 128) | (oVar.c(f11) ? 2048 : 1024);
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            oVar.S();
            int i12 = i10 & 1;
            n nVar = n.f9689a;
            if (i12 == 0 || oVar.x()) {
                j10 = q1.q.b(0.12f, ((b1) oVar.j(c1.f12773a)).e());
                qVar = nVar;
            } else {
                oVar.Q();
            }
            oVar.q();
            p.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.c(qVar.e(androidx.compose.foundation.layout.a.n(nVar, f11, 0.0f, f11, 0.0f, 10)), 1.0f), f10), j10, h0.f17515a), oVar, 0);
        } else {
            oVar.Q();
        }
        final q qVar2 = qVar;
        final long j11 = j10;
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(j11, f10, f11, i10) { // from class: y8.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f25902b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f25903c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f25904d;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = v.D(1);
                    c.a(this.f25901a, this.f25902b, this.f25903c, this.f25904d, (o) obj, iD);
                    return a0.f21526a;
                }
            };
        }
    }

    public static final void b(final q qVar, final boolean z10, final boolean z11, final ic.n nVar, final ic.n nVar2, final ic.n nVar3, final long j10, final boolean z12, final f1.f fVar, o oVar, final int i10) {
        int i11;
        float f10;
        int i12;
        float f11;
        f1.f fVar2;
        f1.f fVar3;
        float f12;
        oVar.Y(-167033273);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.g(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(nVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(nVar2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(nVar3) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= oVar.e(j10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= oVar.g(z12) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= oVar.h(fVar) ? 67108864 : 33554432;
        }
        if (oVar.N(i11 & 1, (38347923 & i11) != 38347922)) {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            d9 d9Var = (d9) oVar.j(e9.f12960b);
            l0 l0Var = d9Var.f12884g;
            float f13 = 0.87f;
            if (z10 || !z11) {
                oVar.W(-1605166165);
                long j11 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                f10 = (!((b1) oVar.j(c1.f12773a)).j() ? ((double) h0.r(j11)) < 0.5d : ((double) h0.r(j11)) > 0.5d) ? 0.87f : 1.0f;
                oVar.p(false);
            } else {
                oVar.W(-1605164945);
                long j12 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                if (((b1) oVar.j(c1.f12773a)).j()) {
                    h0.r(j12);
                } else {
                    h0.r(j12);
                }
                oVar.p(false);
                f10 = 0.38f;
            }
            f1.f fVarD = d(l0Var, j10, f10, fVar);
            jc.l.b(fVarD);
            l0 l0Var2 = d9Var.f12887j;
            if (z10 || !z11) {
                i12 = i11;
                oVar.W(-1605158451);
                long j13 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                f11 = (!((b1) oVar.j(c1.f12773a)).j() ? ((double) h0.r(j13)) < 0.5d : ((double) h0.r(j13)) > 0.5d) ? 0.6f : 0.74f;
                oVar.p(false);
            } else {
                oVar.W(-1605157169);
                i12 = i11;
                long j14 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                if (((b1) oVar.j(c1.f12773a)).j()) {
                    h0.r(j14);
                } else {
                    h0.r(j14);
                }
                oVar.p(false);
                f11 = 0.38f;
            }
            f1.f fVarD2 = d(l0Var2, j10, f11, nVar2);
            l0 l0Var3 = d9Var.f12889l;
            if (z10 || !z11) {
                fVar2 = fVarD;
                fVar3 = fVarD2;
                oVar.W(-1605150549);
                long j15 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                if (!((b1) oVar.j(c1.f12773a)).j() ? h0.r(j15) < 0.5d : h0.r(j15) > 0.5d) {
                    f13 = 1.0f;
                }
                oVar.p(false);
                f12 = f13;
            } else {
                oVar.W(-1605149329);
                fVar2 = fVarD;
                fVar3 = fVarD2;
                long j16 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                if (((b1) oVar.j(c1.f12773a)).j()) {
                    h0.r(j16);
                } else {
                    h0.r(j16);
                }
                oVar.p(false);
                f12 = 0.38f;
            }
            int i13 = i12;
            b.f25892a.a(qVar, z12, nVar, fVar3, d(l0Var3, j10, f12, nVar3), fVar2, oVar, (i13 & 14) | 1572864 | ((i13 >> 18) & 112) | ((i13 >> 3) & 896));
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: y8.g
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.b(qVar, z10, z11, nVar, nVar2, nVar3, j10, z12, fVar, (o) obj, v.D(i10 | 1));
                    return a0.f21526a;
                }
            };
        }
    }

    public static final void c(final hg.a aVar, q qVar, float f10, float f11, final ic.k kVar, o oVar, final int i10) {
        jc.l.e(kVar, "content");
        oVar.Y(-598256344);
        int i11 = (oVar.h(aVar) ? 4 : 2) | i10 | 3504;
        if (oVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            f10 = 1;
            f11 = 0;
            boolean zH = oVar.h(aVar);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new gg.b(aVar, 1);
                oVar.h0(objK);
            }
            f25900b = new o2((ic.a) objK);
            i iVar = new i();
            iVar.f25921a = new ArrayList();
            iVar.f25922b = new ArrayList();
            iVar.f25923c = new ArrayList();
            kVar.a(iVar);
            v.a(e().a(aVar), f1.g.f(891288040, new m0.a(iVar, f10, f11), oVar), oVar, 56);
            qVar = n.f9689a;
        } else {
            oVar.Q();
        }
        final q qVar2 = qVar;
        final float f12 = f10;
        final float f13 = f11;
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(qVar2, f12, f13, kVar, i10) { // from class: y8.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f25925b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f25926c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f25927d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ic.k f25928e;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = v.D(24577);
                    c.c(this.f25924a, this.f25925b, this.f25926c, this.f25927d, this.f25928e, (o) obj, iD);
                    return a0.f21526a;
                }
            };
        }
    }

    public static final f1.f d(final l0 l0Var, final long j10, final float f10, final ic.n nVar) {
        if (nVar == null) {
            return null;
        }
        return new f1.f(new ic.n() { // from class: y8.h
            @Override // ic.n
            public final Object q(Object obj, Object obj2) {
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f11 = f10;
                    v.b(new n1[]{h1.f13043a.a(Float.valueOf(f11)), z8.f14018a.a(l0.a(l0Var, q1.q.b(f11, j10), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214))}, f1.g.f(-1823294596, new r(24, nVar), oVar), oVar, 56);
                } else {
                    oVar.Q();
                }
                return a0.f21526a;
            }
        }, -1699928388, true);
    }

    public static final m1 e() {
        o2 o2Var = f25900b;
        if (o2Var != null) {
            return o2Var;
        }
        jc.l.k("LocalPrefsDataStore");
        throw null;
    }
}
