package androidx.lifecycle;

import android.view.View;
import c7.e1;
import m4.h1;
import m4.i1;
import m4.y0;
import r.q1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements y0, me.d, zc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f801a;

    public q(zc.h hVar) {
        if (hVar != null) {
            this.f801a = hVar;
        } else {
            V0(0);
            throw null;
        }
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void V0(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static q Y0(m7.s sVar, int i10) {
        if (i10 == 0) {
            return new m7.l(sVar, 0);
        }
        if (i10 == 1) {
            return new m7.l(sVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void A1();

    @Override // m4.y0
    public boolean B0(int i10) {
        v4.v vVar = (v4.v) this;
        vVar.m2();
        return vVar.J.a(i10);
    }

    public abstract void W0(w wVar);

    public abstract void X0(e1 e1Var);

    public long Z0() {
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        if (i1VarJ.p()) {
            return -9223372036854775807L;
        }
        return p4.c0.c0(i1VarJ.m(vVar.G(), (h1) this.f801a, 0L).f14274m);
    }

    public abstract p a1();

    @Override // me.d
    public se.w b() {
        se.w wVar = (se.w) this.f801a;
        if (wVar != null) {
            return wVar;
        }
        U0(1);
        throw null;
    }

    public abstract Object b1();

    public abstract int c1(View view);

    public abstract int d1(View view);

    public abstract int e1();

    public abstract int f1();

    public abstract Object g1();

    @Override // zc.a
    public zc.h getAnnotations() {
        zc.h hVar = (zc.h) this.f801a;
        if (hVar != null) {
            return hVar;
        }
        V0(1);
        throw null;
    }

    public abstract int h1();

    public boolean i1() {
        int iE;
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        if (i1VarJ.p()) {
            iE = -1;
        } else {
            int iG = vVar.G();
            vVar.m2();
            int i10 = vVar.D;
            if (i10 == 1) {
                i10 = 0;
            }
            vVar.m2();
            iE = i1VarJ.e(iG, i10, vVar.E);
        }
        return iE != -1;
    }

    public boolean j1() {
        int iK;
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        if (i1VarJ.p()) {
            iK = -1;
        } else {
            int iG = vVar.G();
            vVar.m2();
            int i10 = vVar.D;
            if (i10 == 1) {
                i10 = 0;
            }
            vVar.m2();
            iK = i1VarJ.k(iG, i10, vVar.E);
        }
        return iK != -1;
    }

    @Override // m4.y0
    public void k() {
        ((v4.v) this).c2(true);
    }

    public void k1() {
        ((v4.v) this).m2();
    }

    public boolean l1() {
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        return !i1VarJ.p() && i1VarJ.m(vVar.G(), (h1) this.f801a, 0L).f14270i;
    }

    public boolean m1() {
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        return !i1VarJ.p() && i1VarJ.m(vVar.G(), (h1) this.f801a, 0L).a();
    }

    public boolean n1() {
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        return !i1VarJ.p() && i1VarJ.m(vVar.G(), (h1) this.f801a, 0L).f14269h;
    }

    public boolean o1() {
        v4.v vVar = (v4.v) this;
        return vVar.i() == 3 && vVar.r() && vVar.H() == 0;
    }

    public void p1() {
        ((v4.v) this).c2(false);
    }

    public abstract void q1(w wVar);

    public abstract void r1(int i10, boolean z10, long j10);

    public void s1(int i10, long j10) {
        r1(((v4.v) this).G(), false, j10);
    }

    @Override // m4.y0
    public void t(m4.i0 i0Var, long j10) {
        ((v4.v) this).K(0, j10, ya.i0.u(i0Var));
    }

    public void t1() {
        int iE;
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        if (i1VarJ.p()) {
            iE = -1;
        } else {
            int iG = vVar.G();
            vVar.m2();
            int i10 = vVar.D;
            if (i10 == 1) {
                i10 = 0;
            }
            vVar.m2();
            iE = i1VarJ.e(iG, i10, vVar.E);
        }
        if (iE == -1) {
            k1();
        } else if (iE == vVar.G()) {
            r1(vVar.G(), true, -9223372036854775807L);
        } else {
            r1(iE, false, -9223372036854775807L);
        }
    }

    public void u1(int i10, long j10) {
        v4.v vVar = (v4.v) this;
        long jM = vVar.M() + j10;
        long jM1 = vVar.M1();
        if (jM1 != -9223372036854775807L) {
            jM = Math.min(jM, jM1);
        }
        s1(i10, Math.max(jM, 0L));
    }

    @Override // m4.y0
    public void v() {
        r1(((v4.v) this).G(), false, -9223372036854775807L);
    }

    public void v1() {
        w1(6);
    }

    public void w1(int i10) {
        int iK;
        v4.v vVar = (v4.v) this;
        i1 i1VarJ = vVar.J();
        if (i1VarJ.p()) {
            iK = -1;
        } else {
            int iG = vVar.G();
            vVar.m2();
            int i11 = vVar.D;
            if (i11 == 1) {
                i11 = 0;
            }
            vVar.m2();
            iK = i1VarJ.k(iG, i11, vVar.E);
        }
        if (iK == -1) {
            k1();
        } else if (iK == vVar.G()) {
            r1(vVar.G(), true, -9223372036854775807L);
        } else {
            r1(iK, false, -9223372036854775807L);
        }
    }

    public abstract void x1(Object obj);

    public void y1(float f10) {
        v4.v vVar = (v4.v) this;
        vVar.d2(new m4.s0(f10, vVar.O1().f14582b));
    }

    @Override // m4.y0
    public void z(m4.i0 i0Var) {
        ((v4.v) this).A0(ya.i0.u(i0Var));
    }

    public abstract void z1(q1 q1Var);

    public q(se.w wVar) {
        if (wVar != null) {
            this.f801a = wVar;
        } else {
            U0(0);
            throw null;
        }
    }

    public q(r5.h0 h0Var) {
        this.f801a = h0Var;
    }

    public q(int i10) {
        switch (i10) {
            case 2:
                this.f801a = new h1();
                break;
            case 5:
                this.f801a = x0.v.v(Boolean.FALSE);
                break;
            default:
                this.f801a = new v0();
                break;
        }
    }
}
