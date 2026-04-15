package w4;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b5.r;
import b7.b1;
import b7.x2;
import com.tencent.bugly.CrashModule;
import j5.d0;
import j5.j0;
import j5.u;
import j5.z;
import java.io.IOException;
import java.util.List;
import m4.d1;
import m4.f1;
import m4.h1;
import m4.i0;
import m4.i1;
import m4.l0;
import m4.n0;
import m4.o1;
import m4.q1;
import m4.r0;
import m4.s0;
import m4.u0;
import m4.u1;
import m4.v0;
import m4.w0;
import m4.x0;
import m4.y0;
import p4.c0;
import p4.n;
import p4.v;
import v4.m;
import ya.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements w0, j0, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f23349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f23350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f23351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f23352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f23353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f23354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f23355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23356h;

    public d(v vVar) {
        vVar.getClass();
        this.f23349a = vVar;
        this.f23354f = new n(c0.v(), vVar, new b(4));
        f1 f1Var = new f1();
        this.f23350b = f1Var;
        this.f23351c = new h1();
        this.f23352d = new b1(f1Var);
        this.f23353e = new SparseArray();
    }

    @Override // b5.r
    public final void A(int i10, d0 d0Var) {
        a0(Y(i10, d0Var), 1027, new c(4));
    }

    @Override // m4.w0
    public final void B(int i10, boolean z10) {
        a0(V(), 30, new b(18));
    }

    @Override // m4.w0
    public final void C(long j10) {
        a0(V(), 16, new c(7));
    }

    @Override // m4.w0
    public final void D(i0 i0Var, int i10) {
        a0(V(), 1, new c(19));
    }

    @Override // m4.w0
    public final void E(long j10) {
        a0(V(), 17, new c(10));
    }

    @Override // m4.w0
    public final void F(u1 u1Var) {
        a aVarZ = Z();
        a0(aVarZ, 25, new v4.r(aVarZ, u1Var));
    }

    @Override // j5.j0
    public final void G(int i10, d0 d0Var, u uVar, z zVar) {
        a0(Y(i10, d0Var), 1001, new b(26));
    }

    @Override // j5.j0
    public final void H(int i10, d0 d0Var, u uVar, z zVar) {
        a0(Y(i10, d0Var), 1002, new b(21));
    }

    @Override // m4.w0
    public final void J(boolean z10) {
        a0(Z(), 23, new c(15));
    }

    @Override // m4.w0
    public final void K(List list) {
        a0(V(), 27, new b(3));
    }

    @Override // m4.w0
    public final void L(int i10, boolean z10) {
        a0(V(), -1, new d1(23));
    }

    @Override // m4.w0
    public final void N(long j10) {
        a0(V(), 18, new c(9));
    }

    @Override // m4.w0
    public final void O(r0 r0Var) {
        d0 d0Var;
        a0((!(r0Var instanceof m) || (d0Var = ((m) r0Var).f22573o) == null) ? V() : W(d0Var), 10, new d1(29));
    }

    @Override // m4.w0
    public final void P(int i10, int i11) {
        a0(Z(), 24, new b(9));
    }

    @Override // m4.w0
    public final void Q(n0 n0Var) {
        a0(V(), 28, new d1(24));
    }

    @Override // m4.w0
    public final void R(m4.d dVar) {
        a0(Z(), 20, new b(15));
    }

    @Override // m4.w0
    public final void S(o1 o1Var) {
        a0(V(), 19, new b(12));
    }

    @Override // j5.j0
    public final void T(int i10, d0 d0Var, z zVar) {
        a0(Y(i10, d0Var), 1005, new c(3));
    }

    @Override // m4.w0
    public final void U(boolean z10) {
        a0(V(), 7, new d1(25));
    }

    public final a V() {
        return W((d0) this.f23352d.f1652d);
    }

    public final a W(d0 d0Var) {
        this.f23355g.getClass();
        i1 i1Var = d0Var == null ? null : (i1) ((k0) this.f23352d.f1651c).get(d0Var);
        if (d0Var != null && i1Var != null) {
            return X(i1Var, i1Var.g(d0Var.f10245a, this.f23350b).f14203c, d0Var);
        }
        int iG = this.f23355g.G();
        i1 i1VarJ = this.f23355g.J();
        if (iG >= i1VarJ.o()) {
            i1VarJ = i1.f14291a;
        }
        return X(i1VarJ, iG, null);
    }

    public final a X(i1 i1Var, int i10, d0 d0Var) {
        d0 d0Var2 = i1Var.p() ? null : d0Var;
        this.f23349a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = i1Var.equals(this.f23355g.J()) && i10 == this.f23355g.G();
        long jC0 = 0;
        if (d0Var2 == null || !d0Var2.b()) {
            if (z10) {
                jC0 = this.f23355g.C();
            } else if (!i1Var.p()) {
                jC0 = c0.c0(i1Var.m(i10, this.f23351c, 0L).f14273l);
            }
        } else if (z10 && this.f23355g.F() == d0Var2.f10246b && this.f23355g.x() == d0Var2.f10247c) {
            jC0 = this.f23355g.M();
        }
        return new a(jElapsedRealtime, i1Var, i10, d0Var2, jC0, this.f23355g.J(), this.f23355g.G(), (d0) this.f23352d.f1652d, this.f23355g.M(), this.f23355g.q());
    }

    public final a Y(int i10, d0 d0Var) {
        this.f23355g.getClass();
        if (d0Var != null) {
            return ((i1) ((k0) this.f23352d.f1651c).get(d0Var)) != null ? W(d0Var) : X(i1.f14291a, i10, d0Var);
        }
        i1 i1VarJ = this.f23355g.J();
        if (i10 >= i1VarJ.o()) {
            i1VarJ = i1.f14291a;
        }
        return X(i1VarJ, i10, null);
    }

    public final a Z() {
        return W((d0) this.f23352d.f1655g);
    }

    @Override // b5.r
    public final void a(int i10, d0 d0Var) {
        a0(Y(i10, d0Var), 1023, new c(13));
    }

    public final void a0(a aVar, int i10, p4.k kVar) {
        this.f23353e.put(i10, aVar);
        this.f23354f.e(i10, kVar);
    }

    @Override // m4.w0
    public final void b(int i10) {
        a0(V(), 6, new d1(27));
    }

    public final void b0(v4.v vVar, Looper looper) {
        p4.c.i(this.f23355g == null || ((ya.i0) this.f23352d.f1653e).isEmpty());
        vVar.getClass();
        this.f23355g = vVar;
        this.f23349a.a(looper, null);
        n nVar = this.f23354f;
        this.f23354f = new n(nVar.f16591d, looper, nVar.f16588a, new b7.i0(16, this, vVar), nVar.f16596i);
    }

    @Override // m4.w0
    public final void d(int i10) {
        a0(V(), 8, new c(2));
    }

    @Override // m4.w0
    public final void f(l0 l0Var) {
        a0(V(), 15, new b(28));
    }

    @Override // m4.w0
    public final void g(x0 x0Var, x0 x0Var2, int i10) {
        if (i10 == 1) {
            this.f23356h = false;
        }
        y0 y0Var = this.f23355g;
        y0Var.getClass();
        b1 b1Var = this.f23352d;
        b1Var.f1652d = b1.u(y0Var, (ya.i0) b1Var.f1653e, (d0) b1Var.f1654f, (f1) b1Var.f1650b);
        a aVarV = V();
        a0(aVarV, 11, new x2(aVarV, i10, x0Var, x0Var2));
    }

    @Override // m4.w0
    public final void h(l0 l0Var) {
        a0(V(), 14, new b(19));
    }

    @Override // m4.w0
    public final void i(r0 r0Var) {
        d0 d0Var;
        a aVarV = (!(r0Var instanceof m) || (d0Var = ((m) r0Var).f22573o) == null) ? V() : W(d0Var);
        a0(aVarV, 10, new b7.j0(aVarV, r0Var));
    }

    @Override // m4.w0
    public final void j(q1 q1Var) {
        a0(V(), 2, new b(2));
    }

    @Override // j5.j0
    public final void k(int i10, d0 d0Var, u uVar, z zVar, int i11) {
        a0(Y(i10, d0Var), 1000, new b(11));
    }

    @Override // m4.w0
    public final void l(boolean z10) {
        a0(V(), 3, new b(29));
    }

    @Override // m4.w0
    public final void m(i1 i1Var, int i10) {
        y0 y0Var = this.f23355g;
        y0Var.getClass();
        b1 b1Var = this.f23352d;
        b1Var.f1652d = b1.u(y0Var, (ya.i0) b1Var.f1653e, (d0) b1Var.f1654f, (f1) b1Var.f1650b);
        b1Var.L(y0Var.J());
        a0(V(), 0, new c(18));
    }

    @Override // m4.w0
    public final void n(int i10, boolean z10) {
        a0(V(), 5, new b(0));
    }

    @Override // m4.w0
    public final void o(s0 s0Var) {
        a0(V(), 12, new d1(22));
    }

    @Override // m4.w0
    public final void p(float f10) {
        a0(Z(), 22, new b(14));
    }

    @Override // j5.j0
    public final void q(int i10, d0 d0Var, u uVar, z zVar, IOException iOException, boolean z10) {
        a aVarY = Y(i10, d0Var);
        a0(aVarY, 1003, new androidx.media3.exoplayer.offline.g(aVarY, uVar, zVar, iOException, z10));
    }

    @Override // m4.w0
    public final void r(int i10) {
        a0(V(), 4, new b(5));
    }

    @Override // m4.w0
    public final void s(o4.c cVar) {
        a0(V(), 27, new b(10));
    }

    @Override // m4.w0
    public final void t(boolean z10) {
        a0(V(), 9, new c(6));
    }

    @Override // m4.w0
    public final void u(m4.k kVar) {
        a0(V(), 29, new b(24));
    }

    @Override // b5.r
    public final void v(int i10, d0 d0Var) {
        a0(Y(i10, d0Var), 1025, new c(12));
    }

    @Override // b5.r
    public final void w(int i10, d0 d0Var, int i11) {
        a0(Y(i10, d0Var), 1022, new b(23));
    }

    @Override // b5.r
    public final void x(int i10, d0 d0Var, Exception exc) {
        a0(Y(i10, d0Var), 1024, new b(25));
    }

    @Override // m4.w0
    public final void y(u0 u0Var) {
        a0(V(), 13, new c(17));
    }

    @Override // j5.j0
    public final void z(int i10, d0 d0Var, z zVar) {
        a aVarY = Y(i10, d0Var);
        a0(aVarY, CrashModule.MODULE_ID, new b7.i0(17, aVarY, zVar));
    }

    @Override // m4.w0
    public final void I() {
    }

    @Override // m4.w0
    public final void M(v0 v0Var) {
    }

    @Override // m4.w0
    public final void c(boolean z10) {
    }

    @Override // m4.w0
    public final void e(int i10) {
    }
}
