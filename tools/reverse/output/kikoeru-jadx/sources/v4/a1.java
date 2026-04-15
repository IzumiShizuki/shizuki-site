package v4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f22395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22396d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22397e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22398f = false;

    public a1(e eVar, e eVar2, int i10) {
        this.f22393a = eVar;
        this.f22394b = i10;
        this.f22395c = eVar2;
    }

    public static void b(e eVar) {
        int i10 = eVar.f22457h;
        if (i10 == 2) {
            p4.c.i(i10 == 2);
            eVar.f22457h = 1;
            eVar.s();
        }
    }

    public static boolean h(e eVar) {
        return eVar.f22457h != 0;
    }

    public static void m(e eVar, long j10) {
        eVar.f22463n = true;
        if (eVar instanceof l5.d) {
            l5.d dVar = (l5.d) eVar;
            p4.c.i(dVar.f22463n);
            dVar.J = j10;
        }
    }

    public final void a(e eVar, k kVar) {
        p4.c.i(this.f22393a == eVar || this.f22395c == eVar);
        if (h(eVar)) {
            if (eVar == kVar.f22561c) {
                kVar.f22562d = null;
                kVar.f22561c = null;
                kVar.f22563e = true;
            }
            b(eVar);
            p4.c.i(eVar.f22457h == 1);
            eVar.f22452c.n();
            eVar.f22457h = 0;
            eVar.f22458i = null;
            eVar.f22459j = null;
            eVar.f22463n = false;
            eVar.m();
        }
    }

    public final int c() {
        boolean zH = h(this.f22393a);
        e eVar = this.f22395c;
        return (zH ? 1 : 0) + ((eVar == null || !h(eVar)) ? 0 : 1);
    }

    public final e d(h0 h0Var) {
        j5.c1 c1Var;
        if (h0Var != null && (c1Var = h0Var.f22506c[this.f22394b]) != null) {
            e eVar = this.f22393a;
            if (eVar.f22458i == c1Var) {
                return eVar;
            }
            e eVar2 = this.f22395c;
            if (eVar2 != null && eVar2.f22458i == c1Var) {
                return eVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(v4.h0 r8, v4.e r9) {
        /*
            r7 = this;
            r0 = 1
            if (r9 != 0) goto L4
            goto L49
        L4:
            j5.c1[] r1 = r8.f22506c
            int r2 = r7.f22394b
            r1 = r1[r2]
            j5.c1 r3 = r9.f22458i
            if (r3 == 0) goto L49
            if (r3 != r1) goto L3a
            if (r1 == 0) goto L49
            boolean r1 = r9.j()
            if (r1 != 0) goto L49
            v4.h0 r1 = r8.f22516m
            v4.i0 r3 = r8.f22510g
            boolean r3 = r3.f22528g
            if (r3 == 0) goto L3a
            if (r1 == 0) goto L3a
            boolean r3 = r1.f22508e
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof l5.d
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof h5.b
            if (r3 != 0) goto L39
            long r3 = r9.f22462m
            long r5 = r1.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L3a
            goto L49
        L39:
            return r0
        L3a:
            v4.h0 r8 = r8.f22516m
            if (r8 == 0) goto L47
            j5.c1[] r8 = r8.f22506c
            r8 = r8[r2]
            j5.c1 r9 = r9.f22458i
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.a1.e(v4.h0, v4.e):boolean");
    }

    public final boolean f() {
        int i10 = this.f22396d;
        return i10 == 2 || i10 == 4 || i10 == 3;
    }

    public final boolean g() {
        int i10 = this.f22396d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return h(this.f22393a);
        }
        e eVar = this.f22395c;
        eVar.getClass();
        return eVar.f22457h != 0;
    }

    public final boolean i(int i10) {
        int i11 = this.f22396d;
        int i12 = this.f22394b;
        return ((i11 == 2 || i11 == 4) && i10 == i12) || (i11 == 3 && i10 != i12);
    }

    public final void j(boolean z10) {
        if (z10) {
            if (this.f22397e) {
                e eVar = this.f22393a;
                p4.c.i(eVar.f22457h == 0);
                eVar.f22452c.n();
                eVar.q();
                this.f22397e = false;
                return;
            }
            return;
        }
        if (this.f22398f) {
            e eVar2 = this.f22395c;
            eVar2.getClass();
            p4.c.i(eVar2.f22457h == 0);
            eVar2.f22452c.n();
            eVar2.q();
            this.f22398f = false;
        }
    }

    public final int k(e eVar, h0 h0Var, m5.u uVar, k kVar) {
        e eVar2;
        int i10;
        if (eVar == null || eVar.f22457h == 0 || (eVar == (eVar2 = this.f22393a) && ((i10 = this.f22396d) == 2 || i10 == 4))) {
            return 1;
        }
        if (eVar == this.f22395c && this.f22396d == 3) {
            return 1;
        }
        j5.c1 c1Var = eVar.f22458i;
        j5.c1[] c1VarArr = h0Var.f22506c;
        int i11 = this.f22394b;
        boolean z10 = c1Var != c1VarArr[i11];
        boolean zB = uVar.b(i11);
        if (!zB || z10) {
            if (!eVar.f22463n) {
                m5.r rVar = uVar.f14763c[i11];
                int length = rVar != null ? rVar.length() : 0;
                m4.q[] qVarArr = new m4.q[length];
                for (int i12 = 0; i12 < length; i12++) {
                    rVar.getClass();
                    qVarArr[i12] = rVar.g(i12);
                }
                j5.c1 c1Var2 = h0Var.f22506c[i11];
                c1Var2.getClass();
                eVar.w(qVarArr, c1Var2, h0Var.e(), h0Var.f22519p, h0Var.f22510g.f22522a);
                return 3;
            }
            if (!eVar.k()) {
                return 0;
            }
            a(eVar, kVar);
            if (!zB || f()) {
                j(eVar == eVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void l() {
        if (!h(this.f22393a)) {
            j(true);
        }
        e eVar = this.f22395c;
        if (eVar == null || eVar.f22457h != 0) {
            return;
        }
        j(false);
    }

    public final void n() {
        int i10;
        e eVar = this.f22393a;
        int i11 = eVar.f22457h;
        if (i11 == 1 && this.f22396d != 4) {
            p4.c.i(i11 == 1);
            eVar.f22457h = 2;
            eVar.r();
            return;
        }
        e eVar2 = this.f22395c;
        if (eVar2 == null || (i10 = eVar2.f22457h) != 1 || this.f22396d == 3) {
            return;
        }
        p4.c.i(i10 == 1);
        eVar2.f22457h = 2;
        eVar2.r();
    }
}
