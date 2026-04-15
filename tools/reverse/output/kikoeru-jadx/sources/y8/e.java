package y8;

import fa.m;
import g2.v0;
import j1.n;
import j1.q;
import j2.h0;
import m0.b1;
import m0.c1;
import m0.z8;
import t2.l0;
import x0.j1;
import x0.o;
import x0.p1;
import x0.v;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f25905a = 16;

    public static final void a(String str, long j10, o oVar, int i10) {
        long j11;
        long jF;
        int i11;
        o oVar2 = oVar;
        oVar2.Y(912786139);
        int i12 = i10 | (oVar2.f(str) ? 4 : 2) | 16;
        if (oVar2.N(i12 & 1, (i12 & 19) != 18)) {
            oVar2.S();
            if ((i10 & 1) == 0 || oVar2.x()) {
                jF = ((b1) oVar2.j(c1.f12773a)).f();
                i11 = i12 & (-113);
            } else {
                oVar2.Q();
                i11 = i12 & (-113);
                jF = j10;
            }
            oVar2.q();
            q qVarC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.n(n.f9689a, f25905a, 0.0f, 0.0f, 0.0f, 14), 1.0f);
            v0 v0VarD = p.d(j1.c.f9665d, false);
            int iQ = v.q(oVar2);
            j1 j1VarL = oVar2.l();
            q qVarC2 = j1.a.c(qVarC, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            v.A(i2.j.f8738g, v0VarD, oVar2);
            v.A(i2.j.f8737f, j1VarL, oVar2);
            i2.h hVar = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            v.A(i2.j.f8735d, qVarC2, oVar2);
            long j12 = ((l0) oVar2.j(z8.f14018a)).f20362a.f20294b;
            f3.p[] pVarArr = f3.o.f6671b;
            long j13 = 1095216660480L & j12;
            if (j13 == 0) {
                f3.i.a("Cannot perform operation for Unspecified type.");
            }
            z8.b(str, null, jF, lc.b.H(f3.o.c(j12) * 0.85f, j13), null, x2.k.f24564f, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, (i11 & 14) | 196608, 0, 131026);
            oVar2 = oVar2;
            oVar2.p(true);
            j11 = jF;
        } else {
            oVar2.Q();
            j11 = j10;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new m(j11, str, i10, 1);
        }
    }
}
