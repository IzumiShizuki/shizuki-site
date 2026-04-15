package wd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f23830e;

    public static k0 g() {
        k0 k0Var = new k0();
        k0Var.f23828c = -1;
        k0Var.f23830e = l0.f23840c;
        return k0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        m0 m0VarF = f();
        if (m0VarF.b()) {
            return m0VarF;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        k0 k0VarG = g();
        k0VarG.h(f());
        return k0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r2, ce.i r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            wd.a r0 = wd.m0.f23851i     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.m0 r0 = new wd.m0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            ce.b r0 = r2.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.m0 r0 = (wd.m0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.k0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        h((m0) pVar);
        return this;
    }

    public final m0 f() {
        m0 m0Var = new m0(this);
        int i10 = this.f23827b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        m0Var.f23854c = this.f23828c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        m0Var.f23855d = this.f23829d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        m0Var.f23856e = this.f23830e;
        m0Var.f23853b = i11;
        return m0Var;
    }

    public final void h(m0 m0Var) {
        if (m0Var == m0.f23850h) {
            return;
        }
        int i10 = m0Var.f23853b;
        if ((i10 & 1) == 1) {
            int i11 = m0Var.f23854c;
            this.f23827b = 1 | this.f23827b;
            this.f23828c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = m0Var.f23855d;
            this.f23827b = 2 | this.f23827b;
            this.f23829d = i12;
        }
        if ((i10 & 4) == 4) {
            l0 l0Var = m0Var.f23856e;
            l0Var.getClass();
            this.f23827b = 4 | this.f23827b;
            this.f23830e = l0Var;
        }
        this.f3948a = this.f3948a.i(m0Var.f23852a);
    }
}
