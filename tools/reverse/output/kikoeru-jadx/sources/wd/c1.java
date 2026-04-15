package wd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d1 f23604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e1 f23607h;

    public static c1 g() {
        c1 c1Var = new c1();
        c1Var.f23604e = d1.f23626c;
        c1Var.f23607h = e1.f23653b;
        return c1Var;
    }

    @Override // ce.k
    public final ce.b c() {
        f1 f1VarF = f();
        f1VarF.b();
        return f1VarF;
    }

    public final Object clone() {
        c1 c1VarG = g();
        c1VarG.h(f());
        return c1VarG;
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
            wd.a r0 = wd.f1.f23678l     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.f1 r0 = new wd.f1     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            ce.b r0 = r2.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.f1 r0 = (wd.f1) r0     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.c1.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        h((f1) pVar);
        return this;
    }

    public final f1 f() {
        f1 f1Var = new f1(this);
        int i10 = this.f23601b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        f1Var.f23681c = this.f23602c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        f1Var.f23682d = this.f23603d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        f1Var.f23683e = this.f23604e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        f1Var.f23684f = this.f23605f;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        f1Var.f23685g = this.f23606g;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        f1Var.f23686h = this.f23607h;
        f1Var.f23680b = i11;
        return f1Var;
    }

    public final void h(f1 f1Var) {
        if (f1Var == f1.f23677k) {
            return;
        }
        int i10 = f1Var.f23680b;
        if ((i10 & 1) == 1) {
            int i11 = f1Var.f23681c;
            this.f23601b = 1 | this.f23601b;
            this.f23602c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = f1Var.f23682d;
            this.f23601b = 2 | this.f23601b;
            this.f23603d = i12;
        }
        if ((i10 & 4) == 4) {
            d1 d1Var = f1Var.f23683e;
            d1Var.getClass();
            this.f23601b = 4 | this.f23601b;
            this.f23604e = d1Var;
        }
        int i13 = f1Var.f23680b;
        if ((i13 & 8) == 8) {
            int i14 = f1Var.f23684f;
            this.f23601b = 8 | this.f23601b;
            this.f23605f = i14;
        }
        if ((i13 & 16) == 16) {
            int i15 = f1Var.f23685g;
            this.f23601b = 16 | this.f23601b;
            this.f23606g = i15;
        }
        if ((i13 & 32) == 32) {
            e1 e1Var = f1Var.f23686h;
            e1Var.getClass();
            this.f23601b = 32 | this.f23601b;
            this.f23607h = e1Var;
        }
        this.f3948a = this.f3948a.i(f1Var.f23679a);
    }
}
