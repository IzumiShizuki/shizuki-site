package androidx.compose.animation;

import f1.f;
import f1.g;
import h1.s;
import h1.z;
import i2.a1;
import i2.h;
import i2.i;
import i2.j;
import ic.k;
import j1.d;
import j1.n;
import j1.p;
import j1.q;
import j2.h0;
import java.util.ListIterator;
import o.k0;
import o.s0;
import q.b0;
import q.c;
import q.m;
import r.j1;
import r.q1;
import r.t1;
import r.w1;
import vb.l;
import x0.e1;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f454b = 0;

    static {
        long j10 = Integer.MIN_VALUE;
        f453a = (j10 & 4294967295L) | (j10 << 32);
    }

    public static final void a(q1 q1Var, q qVar, k kVar, d dVar, k kVar2, f fVar, o oVar, int i10) {
        int i11;
        k kVar3;
        o oVar2;
        androidx.lifecycle.q qVar2;
        m mVar;
        s sVar;
        final m mVar2;
        final j1 j1VarC;
        boolean z10;
        k kVar4 = kVar;
        oVar.Y(-114689412);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(q1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(kVar4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(dVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(kVar2) ? 16384 : 8192;
        }
        f fVar2 = fVar;
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(fVar2) ? 131072 : 65536;
        }
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 14;
            boolean z11 = i12 == 4;
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (z11 || objK == r0Var) {
                objK = new m(q1Var, dVar);
                oVar.h0(objK);
            }
            m mVar3 = (m) objK;
            boolean z12 = i12 == 4;
            Object objK2 = oVar.K();
            if (z12 || objK2 == r0Var) {
                Object[] objArr = {q1Var.f18539a.b1()};
                s sVar2 = new s();
                sVar2.addAll(l.M0(objArr));
                oVar.h0(sVar2);
                objK2 = sVar2;
            }
            s sVar3 = (s) objK2;
            boolean z13 = i12 == 4;
            Object objK3 = oVar.K();
            if (z13 || objK3 == r0Var) {
                long[] jArr = s0.f16040a;
                objK3 = new k0();
                oVar.h0(objK3);
            }
            k0 k0Var = (k0) objK3;
            androidx.lifecycle.q qVar3 = q1Var.f18539a;
            e1 e1Var = q1Var.f18542d;
            if (!sVar3.contains(qVar3.b1())) {
                sVar3.clear();
                sVar3.add(qVar3.b1());
            }
            if (jc.l.a(qVar3.b1(), e1Var.getValue())) {
                if (sVar3.size() != 1 || !jc.l.a(sVar3.get(0), qVar3.b1())) {
                    sVar3.clear();
                    sVar3.add(qVar3.b1());
                }
                if (k0Var.f15999e != 1 || k0Var.c(qVar3.b1())) {
                    k0Var.a();
                }
                mVar3.f17361b = dVar;
            }
            if (jc.l.a(qVar3.b1(), e1Var.getValue()) || sVar3.contains(e1Var.getValue())) {
                qVar2 = qVar3;
            } else {
                ListIterator listIterator = sVar3.listIterator();
                int i13 = 0;
                while (true) {
                    z zVar = (z) listIterator;
                    qVar2 = qVar3;
                    if (!zVar.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (jc.l.a(kVar2.a(zVar.next()), kVar2.a(e1Var.getValue()))) {
                            break;
                        }
                        i13++;
                        qVar3 = qVar2;
                    }
                }
                if (i13 == -1) {
                    sVar3.add(e1Var.getValue());
                } else {
                    sVar3.set(i13, e1Var.getValue());
                }
            }
            if (k0Var.c(e1Var.getValue()) && k0Var.c(qVar2.b1())) {
                oVar.W(919489879);
                oVar.p(false);
                kVar3 = kVar4;
                mVar = mVar3;
            } else {
                oVar.W(916905750);
                k0Var.a();
                int size = sVar3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = sVar3.get(i14);
                    k0Var.m(obj, g.f(885640742, new c(q1Var, obj, kVar4, mVar3, sVar3, fVar2), oVar));
                    i14++;
                    kVar4 = kVar4;
                    fVar2 = fVar;
                }
                kVar3 = kVar4;
                mVar = mVar3;
                oVar.p(false);
            }
            boolean zF = oVar.f(q1Var.f()) | oVar.f(mVar);
            Object objK4 = oVar.K();
            if (zF || objK4 == r0Var) {
                objK4 = (b0) kVar3.a(mVar);
                oVar.h0(objK4);
            }
            b0 b0Var = (b0) objK4;
            q1 q1Var2 = mVar.f17360a;
            boolean zF2 = oVar.f(mVar);
            Object objK5 = oVar.K();
            if (zF2 || objK5 == r0Var) {
                objK5 = v.v(Boolean.FALSE);
                oVar.h0(objK5);
            }
            w0 w0Var = (w0) objK5;
            final w0 w0VarY = v.y(b0Var.f17238d, oVar);
            if (jc.l.a(q1Var2.f18539a.b1(), q1Var2.f18542d.getValue())) {
                w0Var.setValue(Boolean.FALSE);
            } else if (w0VarY.getValue() != null) {
                w0Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
            q qVar4 = n.f9689a;
            if (zBooleanValue) {
                oVar.W(249676467);
                m mVar4 = mVar;
                sVar = sVar3;
                oVar2 = oVar;
                mVar2 = mVar4;
                j1VarC = t1.c(mVar4.f17360a, w1.f18627h, null, oVar2, 0, 2);
                boolean zF3 = oVar2.f(j1VarC);
                Object objK6 = oVar2.K();
                if (zF3 || objK6 == r0Var) {
                    objK6 = gh.g.l(qVar4);
                    oVar2.h0(objK6);
                }
                qVar4 = (q) objK6;
                oVar2.p(false);
            } else {
                sVar = sVar3;
                oVar2 = oVar;
                mVar2 = mVar;
                oVar2.W(249942509);
                oVar2.p(false);
                j1VarC = null;
            }
            q qVarE = qVar.e(qVar4.e(new a1(j1VarC, w0VarY, mVar2) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final j1 f438a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final w0 f439b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final m f440c;

                {
                    this.f438a = j1VarC;
                    this.f439b = w0VarY;
                    this.f440c = mVar2;
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement)) {
                        return false;
                    }
                    AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj2;
                    return jc.l.a(animatedContentTransitionScopeImpl$SizeModifierElement.f438a, this.f438a) && animatedContentTransitionScopeImpl$SizeModifierElement.f439b.equals(this.f439b);
                }

                @Override // i2.a1
                public final p h() {
                    q.l lVar = new q.l();
                    lVar.f17350o = this.f438a;
                    lVar.f17351p = this.f439b;
                    lVar.f17352q = this.f440c;
                    lVar.f17353r = a.f453a;
                    return lVar;
                }

                public final int hashCode() {
                    int iHashCode = this.f440c.hashCode() * 31;
                    j1 j1Var = this.f438a;
                    return this.f439b.hashCode() + ((iHashCode + (j1Var != null ? j1Var.hashCode() : 0)) * 31);
                }

                @Override // i2.a1
                public final void l(p pVar) {
                    q.l lVar = (q.l) pVar;
                    lVar.f17350o = this.f438a;
                    lVar.f17351p = this.f439b;
                    lVar.f17352q = this.f440c;
                }
            }));
            Object objK7 = oVar2.K();
            if (objK7 == r0Var) {
                objK7 = new q.g(mVar2);
                oVar2.h0(objK7);
            }
            q.g gVar = (q.g) objK7;
            int iQ = v.q(oVar2);
            x0.j1 j1VarL = oVar2.l();
            q qVarC = j1.a.c(qVarE, oVar2);
            i2.k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            v.A(j.f8738g, gVar, oVar2);
            v.A(j.f8737f, j1VarL, oVar2);
            h hVar = j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar2);
            oVar2.W(-1490874326);
            int size2 = sVar.size();
            int i15 = 0;
            while (i15 < size2) {
                s sVar4 = sVar;
                Object obj2 = sVar4.get(i15);
                oVar2.U(1908442329, kVar2.a(obj2));
                ic.n nVar = (ic.n) k0Var.g(obj2);
                if (nVar == null) {
                    oVar2.W(-967793488);
                    z10 = false;
                } else {
                    z10 = false;
                    oVar2.W(1908443505);
                    nVar.q(oVar2, 0);
                }
                oVar2.p(z10);
                oVar2.p(z10);
                i15++;
                sVar = sVar4;
            }
            oVar2.p(false);
            oVar2.p(true);
        } else {
            kVar3 = kVar4;
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q.d(q1Var, qVar, kVar3, dVar, kVar2, fVar, i10);
        }
    }
}
