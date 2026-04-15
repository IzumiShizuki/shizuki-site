package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f17303b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h1 f17307f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f17304c = x0.v.v(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f17305d = x0.v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.e1 f17306e = x0.v.v(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.s f17308g = new h1.s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f17309h = new a0(2, this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0.d0 f17310i = new b0.d0(25, this);

    public g1(Object obj, q1 q1Var) {
        this.f17302a = obj;
        this.f17303b = q1Var;
    }

    public final p1.c a() {
        return (p1.c) this.f17306e.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f17305d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ic.a, jc.m] */
    public final p1.c c() {
        p1.c cVarF;
        h1 h1Var = this.f17307f;
        if (h1Var != null) {
            Object objB = h1Var.f17325k.b();
            if (objB == null) {
                throw new IllegalArgumentException("Error: lookahead coordinates is null.");
            }
            g2.c0 c0Var = (g2.c0) objB;
            g2.c0 c0Var2 = h1Var.g().f17303b.f17420h;
            if (c0Var2 == null) {
                throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            }
            long jO = c0Var2.o(c0Var, 0L);
            Object objB2 = h1Var.f17325k.b();
            if (objB2 == null) {
                throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + h1Var.g().f17302a + '.').toString());
            }
            cVarF = n7.b0.f(jO, gh.g.R(((g2.c0) objB2).k()));
        } else {
            cVarF = null;
        }
        x0.e1 e1Var = this.f17304c;
        e1Var.setValue(cVarF);
        return (p1.c) e1Var.getValue();
    }

    public final boolean d() {
        h1.s sVar = this.f17308g;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((h1) sVar.get(i10)).f().b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        h1.s sVar = this.f17308g;
        int size = sVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            r.q1 q1Var = ((h1) sVar.get(i10)).f().f17472b;
            while (true) {
                r.q1 q1Var2 = q1Var.f18540b;
                if (q1Var2 == null) {
                    break;
                }
                q1Var = q1Var2;
            }
            if (jc.l.a(q1Var.f18539a.b1(), q1Var.f18542d.getValue())) {
                i10++;
            } else if (b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ub.h] */
    public final void f() {
        boolean zD = d();
        h1.s sVar = this.f17308g;
        int size = sVar.size();
        x0.e1 e1Var = this.f17305d;
        q1 q1Var = this.f17303b;
        if (size > 1 && zD) {
            e1Var.setValue(Boolean.TRUE);
        } else if (!q1Var.g() || !zD) {
            e1Var.setValue(Boolean.FALSE);
        }
        if (sVar.isEmpty() || q1Var.f17415c) {
            return;
        }
        ((h1.y) q1.f17412k.getValue()).d(this, this.f17309h, this.f17310i);
    }

    public final void g() {
        h1.s sVar = this.f17308g;
        int size = sVar.size() - 1;
        h1 h1Var = null;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                h1 h1Var2 = (h1) sVar.get(size);
                if (h1Var2.f().b()) {
                    h1Var = h1Var2;
                }
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        if (jc.l.a(h1Var, this.f17307f)) {
            return;
        }
        this.f17307f = h1Var;
        this.f17304c.setValue(null);
    }
}
