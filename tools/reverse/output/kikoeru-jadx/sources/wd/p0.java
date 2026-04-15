package wd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f23892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f23893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23894e;

    public static p0 g() {
        p0 p0Var = new p0();
        p0Var.f23892c = q0.f23904d;
        p0Var.f23893d = t0.f23947t;
        return p0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        r0 r0VarF = f();
        if (r0VarF.b()) {
            return r0VarF;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        p0 p0VarG = g();
        p0VarG.h(f());
        return p0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r3, ce.i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            wd.a r1 = wd.r0.f23914i     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.r0 r1 = new wd.r0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.r0 r4 = (wd.r0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.p0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        h((r0) pVar);
        return this;
    }

    public final r0 f() {
        r0 r0Var = new r0(this);
        int i10 = this.f23891b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        r0Var.f23917c = this.f23892c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        r0Var.f23918d = this.f23893d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        r0Var.f23919e = this.f23894e;
        r0Var.f23916b = i11;
        return r0Var;
    }

    public final void h(r0 r0Var) {
        t0 t0Var;
        if (r0Var == r0.f23913h) {
            return;
        }
        if ((r0Var.f23916b & 1) == 1) {
            q0 q0Var = r0Var.f23917c;
            q0Var.getClass();
            this.f23891b = 1 | this.f23891b;
            this.f23892c = q0Var;
        }
        if ((r0Var.f23916b & 2) == 2) {
            t0 t0Var2 = r0Var.f23918d;
            if ((this.f23891b & 2) != 2 || (t0Var = this.f23893d) == t0.f23947t) {
                this.f23893d = t0Var2;
            } else {
                s0 s0VarR = t0.r(t0Var);
                s0VarR.i(t0Var2);
                this.f23893d = s0VarR.g();
            }
            this.f23891b |= 2;
        }
        if ((r0Var.f23916b & 4) == 4) {
            int i10 = r0Var.f23919e;
            this.f23891b = 4 | this.f23891b;
            this.f23894e = i10;
        }
        this.f3948a = this.f3948a.i(r0Var.f23915a);
    }
}
