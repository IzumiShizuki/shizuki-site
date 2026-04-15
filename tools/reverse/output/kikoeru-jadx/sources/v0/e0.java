package v0;

import androidx.compose.foundation.layout.FillElement;
import m0.m1;
import x0.p1;
import x0.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f22190a = new e0();

    public static a0 c(x0.o oVar) {
        oVar.X(1376295968);
        a aVar = (a) oVar.j(c.f22176a);
        a0 a0Var = aVar.L;
        if (a0Var == null) {
            long jA = c.a(aVar, w0.h.f23051g);
            long jA2 = c.a(aVar, 26);
            long jB = q1.q.b(0.38f, c.a(aVar, w0.h.f23054j));
            long jA3 = c.a(aVar, w0.h.f23053i);
            long jB2 = q1.q.b(0.38f, c.a(aVar, w0.h.f23056l));
            long jL = q1.h0.l(q1.q.b(0.38f, c.a(aVar, 18)), aVar.f22144p);
            long jB3 = q1.q.b(0.38f, c.a(aVar, 18));
            int i10 = w0.h.f23055k;
            a0 a0Var2 = new a0(jA, jA2, jB, jA3, jB2, jL, jB3, q1.q.b(0.38f, c.a(aVar, i10)), q1.q.b(0.12f, c.a(aVar, w0.h.f23050f)), q1.q.b(0.38f, c.a(aVar, i10)));
            aVar.L = a0Var2;
            a0Var = a0Var2;
        }
        oVar.p(false);
        return a0Var;
    }

    public final void a(w.k kVar, j1.q qVar, a0 a0Var, boolean z10, long j10, x0.o oVar, int i10) {
        long j11;
        j1.q qVar2;
        j1.q qVar3;
        oVar.Y(-290277409);
        int i11 = i10 | (oVar.f(kVar) ? 4 : 2) | 48 | (oVar.f(a0Var) ? 256 : 128) | (oVar.g(z10) ? 2048 : 1024) | 24576;
        if ((74899 & i11) == 74898 && oVar.z()) {
            oVar.Q();
            qVar3 = qVar;
            j11 = j10;
        } else {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                j11 = k0.f22247a;
                qVar2 = j1.n.f9689a;
            } else {
                oVar.Q();
                qVar2 = qVar;
                j11 = j10;
            }
            oVar.q();
            oVar.X(-1142853216);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new h1.s();
                oVar.h0(objK);
            }
            h1.s sVar = (h1.s) objK;
            oVar.p(false);
            oVar.X(-1142853127);
            boolean z11 = (i11 & 14) == 4;
            Object objK2 = oVar.K();
            if (z11 || objK2 == r0Var) {
                objK2 = new m1(kVar, sVar, null, 3);
                oVar.h0(objK2);
            }
            oVar.p(false);
            x0.v.e((ic.n) objK2, kVar, oVar);
            float f10 = !sVar.isEmpty() ? k0.f22249c : k0.f22248b;
            q1.l0 l0VarA = z.a(w0.h.f23052h, oVar);
            FillElement fillElement = androidx.compose.foundation.layout.c.f555a;
            j1.q qVarH = androidx.compose.foundation.a.h(androidx.compose.foundation.f.a(androidx.compose.foundation.layout.c.k(qVar2, f3.h.b(j11), f3.h.a(j11)), kVar, u0.j.a(w0.h.f23048d / 2, oVar)), kVar);
            if (!z10) {
                f10 = 0;
            }
            y.d.d(androidx.compose.foundation.a.b(lc.b.U(qVarH, f10, l0VarA, false, 24), z10 ? a0Var.f22155a : a0Var.f22160f, l0VarA), oVar);
            qVar3 = qVar2;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c0(this, kVar, qVar3, a0Var, z10, j11, i10);
        }
    }

    public final void b(l0 l0Var, j1.q qVar, a0 a0Var, boolean z10, x0.o oVar, int i10) {
        int i11;
        j1.q qVar2;
        j1.q qVar3;
        j1.q qVar4;
        oVar.Y(593554206);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(l0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i10 & 384) == 0) {
            i12 |= oVar.f(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= oVar.g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= oVar.f(this) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && oVar.z()) {
            oVar.Q();
            qVar4 = qVar;
        } else {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                qVar2 = j1.n.f9689a;
            } else {
                oVar.Q();
                qVar2 = qVar;
            }
            oVar.q();
            long j10 = z10 ? a0Var.f22158d : a0Var.f22163i;
            long j11 = z10 ? a0Var.f22156b : a0Var.f22161g;
            long j12 = z10 ? a0Var.f22159e : a0Var.f22164j;
            long j13 = z10 ? a0Var.f22157c : a0Var.f22162h;
            int i13 = i12;
            j1.q qVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.c(qVar2, 1.0f), k0.f22251e);
            oVar.X(-1134217104);
            boolean zE = ((i13 & 14) == 4) | oVar.e(j10) | oVar.e(j11) | oVar.e(j12) | oVar.e(j13);
            Object objK = oVar.K();
            if (zE || objK == x0.k.f24334a) {
                qVar3 = qVar2;
                d0 d0Var = new d0(l0Var, j10, j11, j12, j13);
                oVar.h0(d0Var);
                objK = d0Var;
            } else {
                qVar3 = qVar2;
            }
            oVar.p(false);
            nh.b.a(0, (ic.k) objK, qVarD, oVar);
            qVar4 = qVar3;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new g(this, l0Var, qVar4, a0Var, z10, i10);
        }
    }
}
