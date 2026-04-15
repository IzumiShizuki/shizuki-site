package q;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements x0, x0.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.a1 f17316b = new x0.a1(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f17317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f17318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.e1 f17319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.e1 f17320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.e1 f17321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.e1 f17322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.e1 f17323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q1.e0 f17324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public jc.m f17325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h1 f17326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.e1 f17327m;

    public h1(g1 g1Var, x xVar, s1 s1Var, l1 l1Var) {
        Boolean bool = Boolean.TRUE;
        this.f17317c = x0.v.v(bool);
        this.f17318d = x0.v.v(g1Var);
        this.f17319e = x0.v.v(xVar);
        this.f17320f = x0.v.v(i1.f17335b);
        this.f17321g = x0.v.v(bool);
        this.f17322h = x0.v.v(s1Var);
        this.f17323i = x0.v.v(l1Var);
        this.f17325k = i0.f17332f;
        this.f17327m = x0.v.v(null);
    }

    @Override // q.x0
    public final void b(i2.l0 l0Var) {
        s1.b bVar;
        t1.b bVar2 = (t1.b) this.f17327m.getValue();
        if (bVar2 != null && this.f17315a && i()) {
            if (g().a() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.");
            }
            p1.c cVarA = g().a();
            ub.a0 a0Var = null;
            p1.b bVar3 = cVarA != null ? new p1.b(cVarA.d()) : null;
            jc.l.b(bVar3);
            long j10 = bVar3.f16481a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            q1.e0 e0Var = this.f17324j;
            if (e0Var != null) {
                s1.b bVar4 = l0Var.f8782a;
                bVar = l0Var.f8782a;
                c7.e1 e1Var = bVar4.f19346b;
                long jD = e1Var.D();
                e1Var.z().f();
                try {
                    ((c7.e1) ((r.y1) e1Var.f3618b).f18634b).z().n(e0Var);
                    ((r.y1) bVar.f19346b.f3618b).i0(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        u3.x0.k(l0Var, bVar2);
                        t0.L(e1Var, jD);
                        a0Var = ub.a0.f21526a;
                    } finally {
                    }
                } catch (Throwable th2) {
                    t0.L(e1Var, jD);
                    throw th2;
                }
            }
            if (a0Var == null) {
                s1.b bVar5 = l0Var.f8782a;
                bVar = l0Var.f8782a;
                ((r.y1) bVar5.f19346b.f3618b).i0(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    u3.x0.k(l0Var, bVar2);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ub.h] */
    @Override // x0.u1
    public final void c() {
        q1 q1Var = g().f17303b;
        g1 g1VarG = g();
        q1 q1Var2 = g1VarG.f17303b;
        h1.s sVar = g1VarG.f17308g;
        sVar.remove(this);
        if (sVar.isEmpty()) {
            g1VarG.f();
            ((h1.y) q1.f17412k.getValue()).b(g1VarG);
        } else {
            a0 a0Var = g1VarG.f17309h;
            b0.d0 d0Var = g1VarG.f17310i;
            if (!q1Var2.f17415c) {
                ((h1.y) q1.f17412k.getValue()).d(g1VarG, a0Var, d0Var);
            }
        }
        q1Var.f17418f.a(q1Var);
        q1Var2.a();
        q1Var.f17421i.remove(this);
        if (sVar.isEmpty()) {
            hf.a0.y(q1Var2.f17413a, null, null, new a9.k(15, g1VarG, null), 3);
        }
        g().g();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ub.h] */
    @Override // x0.u1
    public final void d() {
        q1 q1Var = g().f17303b;
        g1 g1VarG = g();
        g1VarG.f17308g.add(this);
        q1 q1Var2 = g1VarG.f17303b;
        a0 a0Var = g1VarG.f17309h;
        b0.d0 d0Var = g1VarG.f17310i;
        if (!q1Var2.f17415c) {
            ((h1.y) q1.f17412k.getValue()).d(g1VarG, a0Var, d0Var);
        }
        q1Var.f17418f.a(q1Var);
        q1Var2.a();
        h1.s sVar = q1Var.f17421i;
        ListIterator listIterator = sVar.listIterator();
        int i10 = 0;
        while (true) {
            h1.z zVar = (h1.z) listIterator;
            if (!zVar.hasNext()) {
                i10 = -1;
                break;
            }
            x0 x0Var = (x0) zVar.next();
            h1 h1Var = x0Var instanceof h1 ? (h1) x0Var : null;
            if (jc.l.a(h1Var != null ? h1Var.g() : null, g())) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == sVar.size() - 1 || i10 == -1) {
            sVar.add(this);
        } else {
            sVar.add(i10 + 1, this);
        }
        g().g();
    }

    @Override // q.x0
    public final float e() {
        return this.f17316b.e();
    }

    public final x f() {
        return (x) this.f17319e.getValue();
    }

    public final g1 g() {
        return (g1) this.f17318d.getValue();
    }

    public final boolean h() {
        return jc.l.a(g().f17307f, this) || !((Boolean) this.f17321g.getValue()).booleanValue();
    }

    public final boolean i() {
        return h() && g().b() && ((Boolean) this.f17317c.getValue()).booleanValue();
    }

    @Override // x0.u1
    public final void a() {
    }
}
