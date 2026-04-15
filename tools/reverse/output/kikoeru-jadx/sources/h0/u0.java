package h0;

import j2.u2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public final x0.e1 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1 f7857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.p1 f7858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2 f7859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2.e f7860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y2.c0 f7861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.e1 f7862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.e1 f7863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g2.c0 f7864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.e1 f7865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t2.g f7866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0.e1 f7867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.e1 f7868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.e1 f7869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x0.e1 f7870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x0.e1 f7871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0.e1 f7873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f7874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x0.e1 f7875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x0.e1 f7876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ic.k f7877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x f7878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f7879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p4.p f7880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f7881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x0.e1 f7882z;

    public u0(b1 b1Var, x0.p1 p1Var, u2 u2Var) {
        this.f7857a = b1Var;
        this.f7858b = p1Var;
        this.f7859c = u2Var;
        v2.e eVar = new v2.e(14, false);
        t2.g gVar = t2.h.f20325a;
        long j10 = t2.k0.f20356b;
        y2.y yVar = new y2.y(gVar, j10, (t2.k0) null);
        eVar.f22364b = yVar;
        eVar.f22365c = new l6.d(gVar, yVar.f25435b);
        this.f7860d = eVar;
        Boolean bool = Boolean.FALSE;
        this.f7862f = x0.v.v(bool);
        this.f7863g = x0.v.v(new f3.f(0));
        this.f7865i = x0.v.v(null);
        this.f7867k = x0.v.v(i0.f7679a);
        this.f7868l = x0.v.v(bool);
        this.f7869m = x0.v.v(bool);
        this.f7870n = x0.v.v(bool);
        this.f7871o = x0.v.v(bool);
        this.f7872p = true;
        this.f7873q = x0.v.v(Boolean.TRUE);
        this.f7874r = new r0(u2Var);
        this.f7875s = x0.v.v(bool);
        this.f7876t = x0.v.v(bool);
        this.f7877u = h.f7637h;
        this.f7878v = new x(this, 3);
        this.f7879w = new x(this, 2);
        this.f7880x = q1.h0.h();
        this.f7881y = q1.q.f17575h;
        this.f7882z = x0.v.v(new t2.k0(j10));
        this.A = x0.v.v(new t2.k0(j10));
    }

    public final i0 a() {
        return (i0) this.f7867k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f7862f.getValue()).booleanValue();
    }

    public final g2.c0 c() {
        g2.c0 c0Var = this.f7864h;
        if (c0Var == null || !c0Var.h()) {
            return null;
        }
        return c0Var;
    }

    public final r1 d() {
        return (r1) this.f7865i.getValue();
    }

    public final void e(long j10) {
        this.A.setValue(new t2.k0(j10));
    }

    public final void f(long j10) {
        this.f7882z.setValue(new t2.k0(j10));
    }
}
