package l0;

import android.view.ActionMode;
import h0.s1;
import h0.t1;
import i7.p2;
import j2.v2;
import j2.w2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f11525a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0.u0 f11528d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jc.m f11531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j2.g1 f11532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public hf.y f11533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v2 f11534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1.a f11535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o1.r f11536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.e1 f11537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x0.e1 f11538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f11540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f11541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0.e1 f11542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x0.e1 f11543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y2.y f11545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e1 f11546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h1 f11547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p2 f11548x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y2.r f11526b = t1.f7847a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ic.k f11527c = n0.f11577f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.e1 f11529e = x0.v.v(new y2.y(0, (String) null, 7));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y2.g0 f11530f = y2.f0.f25407a;

    public l1(s1 s1Var) {
        this.f11525a = s1Var;
        Boolean bool = Boolean.TRUE;
        this.f11537m = x0.v.v(bool);
        this.f11538n = x0.v.v(bool);
        this.f11539o = 0L;
        this.f11541q = 0L;
        this.f11542r = x0.v.v(null);
        this.f11543s = x0.v.v(null);
        this.f11544t = -1;
        this.f11545u = new y2.y(0L, (String) null, 7);
        this.f11547w = new h1(this, 1);
        this.f11548x = new p2(this);
    }

    public static final long a(l1 l1Var, y2.y yVar, long j10, boolean z10, boolean z11, s sVar, boolean z12) {
        h0.r1 r1VarD;
        long j11;
        long j12;
        r rVar;
        y1.a aVar;
        int i10;
        h0.u0 u0Var = l1Var.f11528d;
        if (u0Var == null || (r1VarD = u0Var.d()) == null) {
            return t2.k0.f20356b;
        }
        y2.r rVar2 = l1Var.f11526b;
        long j13 = yVar.f25435b;
        t2.g gVar = yVar.f25434a;
        int i11 = t2.k0.f20357c;
        long jB = t2.c0.b(rVar2.p((int) (j13 >> 32)), l1Var.f11526b.p((int) (j13 & 4294967295L)));
        int iB = r1VarD.b(j10, false);
        int i12 = (z11 || z10) ? iB : (int) (jB >> 32);
        int i13 = (!z11 || z10) ? iB : (int) (jB & 4294967295L);
        e1 e1Var = l1Var.f11546v;
        int i14 = (z10 || e1Var == null || (i10 = l1Var.f11544t) == -1) ? -1 : i10;
        t2.i0 i0Var = r1VarD.f7827a;
        if (z10) {
            j12 = j13;
            j11 = 4294967295L;
            rVar = null;
        } else {
            j11 = 4294967295L;
            int i15 = (int) (jB >> 32);
            j12 = j13;
            q qVar = new q(u0.u(i0Var, i15), i15, 1L);
            int i16 = (int) (jB & 4294967295L);
            rVar = new r(qVar, new q(u0.u(i0Var, i16), i16, 1L), t2.k0.f(jB));
        }
        e1 e1Var2 = new e1(z11, 1, 1, rVar, new p(1L, 1, i12, i13, i14, i0Var));
        if (!e1Var2.i(e1Var)) {
            return j12;
        }
        l1Var.f11546v = e1Var2;
        l1Var.f11544t = iB;
        r rVarA = sVar.a(e1Var2);
        long jB2 = t2.c0.b(l1Var.f11526b.i(rVarA.f11602a.f11597b), l1Var.f11526b.i(rVarA.f11603b.f11597b));
        long j14 = j12;
        if (t2.k0.a(jB2, j14)) {
            return j14;
        }
        boolean z13 = t2.k0.f(jB2) != t2.k0.f(j14) && t2.k0.a(t2.c0.b((int) (jB2 & j11), (int) (jB2 >> 32)), j14);
        boolean z14 = t2.k0.b(jB2) && t2.k0.b(j14);
        if (z12 && gVar.f20320b.length() > 0 && !z13 && !z14 && (aVar = l1Var.f11535k) != null) {
            aVar.a(9);
        }
        l1Var.f11527c.a(c(gVar, jB2));
        if (!z12) {
            l1Var.q(!t2.k0.b(jB2));
        }
        h0.u0 u0Var2 = l1Var.f11528d;
        if (u0Var2 != null) {
            u0Var2.f7873q.setValue(Boolean.valueOf(z12));
        }
        h0.u0 u0Var3 = l1Var.f11528d;
        if (u0Var3 != null) {
            u0Var3.f7869m.setValue(Boolean.valueOf(!t2.k0.b(jB2) && u0.w(l1Var, true)));
        }
        h0.u0 u0Var4 = l1Var.f11528d;
        if (u0Var4 != null) {
            u0Var4.f7870n.setValue(Boolean.valueOf(!t2.k0.b(jB2) && u0.w(l1Var, false)));
        }
        h0.u0 u0Var5 = l1Var.f11528d;
        if (u0Var5 == null) {
            return jB2;
        }
        u0Var5.f7871o.setValue(Boolean.valueOf(t2.k0.b(jB2) && u0.w(l1Var, true)));
        return jB2;
    }

    public static y2.y c(t2.g gVar, long j10) {
        return new y2.y(gVar, j10, (t2.k0) null);
    }

    public final hf.r1 b(boolean z10) {
        hf.y yVar = this.f11533i;
        if (yVar == null) {
            return null;
        }
        return hf.a0.y(yVar, null, hf.z.f8619d, new g1(this, z10, (yb.c) null), 1);
    }

    public final void d() {
        hf.y yVar = this.f11533i;
        if (yVar != null) {
            hf.a0.y(yVar, null, hf.z.f8619d, new i1(this, null, 0), 1);
        }
    }

    public final void e(p1.b bVar) {
        if (!t2.k0.b(k().f25435b)) {
            h0.u0 u0Var = this.f11528d;
            h0.r1 r1VarD = u0Var != null ? u0Var.d() : null;
            int iD = (bVar == null || r1VarD == null) ? t2.k0.d(k().f25435b) : this.f11526b.i(r1VarD.b(bVar.f16481a, true));
            this.f11527c.a(y2.y.a(k(), null, t2.c0.b(iD, iD), 5));
        }
        o((bVar == null || k().f25434a.f20320b.length() <= 0) ? h0.i0.f7679a : h0.i0.f7681c);
        q(false);
    }

    public final void f(boolean z10) {
        o1.r rVar;
        h0.u0 u0Var = this.f11528d;
        if (u0Var != null && !u0Var.b() && (rVar = this.f11536l) != null) {
            o1.r.b(rVar);
        }
        this.f11545u = k();
        q(z10);
        o(h0.i0.f7680b);
    }

    public final p1.b g() {
        return (p1.b) this.f11543s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f11537m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.f11538n.getValue()).booleanValue();
    }

    public final long j(boolean z10) {
        h0.r1 r1VarD;
        long j10;
        h0.u0 u0Var = this.f11528d;
        if (u0Var == null || (r1VarD = u0Var.d()) == null) {
            return 9205357640488583168L;
        }
        t2.i0 i0Var = r1VarD.f7827a;
        h0.u0 u0Var2 = this.f11528d;
        t2.g gVar = u0Var2 != null ? u0Var2.f7857a.f7589a : null;
        if (gVar == null) {
            return 9205357640488583168L;
        }
        if (!jc.l.a(gVar.f20320b, i0Var.f20344a.f20326a.f20320b)) {
            return 9205357640488583168L;
        }
        y2.y yVarK = k();
        if (z10) {
            long j11 = yVarK.f25435b;
            int i10 = t2.k0.f20357c;
            j10 = j11 >> 32;
        } else {
            long j12 = yVarK.f25435b;
            int i11 = t2.k0.f20357c;
            j10 = j12 & 4294967295L;
        }
        return u0.t(i0Var, this.f11526b.p((int) j10), z10, t2.k0.f(k().f25435b));
    }

    public final y2.y k() {
        return (y2.y) this.f11529e.getValue();
    }

    public final void l() {
        v2 v2Var = this.f11534j;
        if ((v2Var != null ? ((j2.r0) v2Var).f9975d : null) != w2.f10088a || v2Var == null) {
            return;
        }
        j2.r0 r0Var = (j2.r0) v2Var;
        r0Var.f9975d = w2.f10089b;
        ActionMode actionMode = r0Var.f9973b;
        if (actionMode != null) {
            actionMode.finish();
        }
        r0Var.f9973b = null;
    }

    public final void m() {
        hf.y yVar = this.f11533i;
        if (yVar != null) {
            hf.a0.y(yVar, null, hf.z.f8619d, new i1(this, null, 1), 1);
        }
    }

    public final void n() {
        y2.y yVarC = c(k().f25434a, t2.c0.b(0, k().f25434a.f20320b.length()));
        this.f11527c.a(yVarC);
        this.f11545u = y2.y.a(this.f11545u, null, yVarC.f25435b, 5);
        f(true);
    }

    public final void o(h0.i0 i0Var) {
        h0.u0 u0Var = this.f11528d;
        if (u0Var != null) {
            if (u0Var.a() == i0Var) {
                u0Var = null;
            }
            if (u0Var != null) {
                u0Var.f7867k.setValue(i0Var);
            }
        }
    }

    public final void p() {
        hf.y yVar = this.f11533i;
        if (yVar != null) {
            hf.a0.y(yVar, null, hf.z.f8619d, new b0.x(16, this, (yb.c) null), 1);
        }
    }

    public final void q(boolean z10) {
        h0.u0 u0Var = this.f11528d;
        if (u0Var != null) {
            u0Var.f7868l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            p();
        } else {
            l();
        }
    }
}
