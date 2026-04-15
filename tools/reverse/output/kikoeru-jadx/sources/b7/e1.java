package b7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements h1, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1752c;

    public /* synthetic */ e1(int i10, int i11, Object obj) {
        this.f1750a = i11;
        this.f1752c = obj;
        this.f1751b = i10;
    }

    @Override // p4.k
    public void a(Object obj) {
        switch (this.f1750a) {
            case 2:
                ((m4.w0) obj).m(((v4.u0) this.f1752c).f22652a, this.f1751b);
                break;
            default:
                ((m4.w0) obj).D((m4.i0) this.f1752c, this.f1751b);
                break;
        }
    }

    @Override // b7.h1
    public void c(final t0 t0Var) {
        switch (this.f1750a) {
            case 0:
                ya.i0 i0Var = (ya.i0) this.f1752c;
                if (t0Var.T()) {
                    ya.a1 a1Var = t0Var.f2085q;
                    ya.a1 a1Var2 = t0Var.f2086r;
                    t0Var.f2084p = ya.i0.q(i0Var);
                    ya.a1 a1VarN = t0.n(i0Var, t0Var.f2083o, t0Var.f2087s, t0Var.f2090v, t0Var.C);
                    t0Var.f2085q = a1VarN;
                    t0Var.f2086r = t0.m(a1VarN, t0Var.f2083o, t0Var.C, t0Var.f2087s, t0Var.f2090v);
                    final boolean z10 = !t0Var.f2085q.equals(a1Var);
                    final boolean z11 = !t0Var.f2086r.equals(a1Var2);
                    d0 d0Var = t0Var.f2069a;
                    final int i10 = 0;
                    final int i11 = this.f1751b;
                    d0Var.b(new p4.g(t0Var, z11, z10, i11, i10) { // from class: b7.o0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f2000a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ t0 f2001b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f2002c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ int f2003d;

                        {
                            this.f2000a = i10;
                            this.f2002c = z10;
                            this.f2003d = i11;
                        }

                        @Override // p4.g
                        public final void accept(Object obj) {
                            b0 b0Var = (b0) obj;
                            switch (this.f2000a) {
                                case 0:
                                    t0 t0Var2 = this.f2001b;
                                    cb.v vVarX = b0Var.x(t0Var2.f2069a, t0Var2.f2086r);
                                    if (this.f2002c) {
                                        b0Var.w();
                                    }
                                    vVarX.a(new b5.n(t0Var2, vVarX, this.f2003d, 1), cb.r.f3875a);
                                    break;
                                default:
                                    t0 t0Var3 = this.f2001b;
                                    cb.v vVarX2 = b0Var.x(t0Var3.f2069a, t0Var3.f2086r);
                                    if (this.f2002c) {
                                        b0Var.w();
                                    }
                                    vVarX2.a(new b5.n(t0Var3, vVarX2, this.f2003d, 1), cb.r.f3875a);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                List list = (List) this.f1752c;
                if (t0Var.T()) {
                    ya.a1 a1Var3 = t0Var.f2085q;
                    ya.a1 a1Var4 = t0Var.f2086r;
                    t0Var.f2083o = ya.i0.q(list);
                    ya.a1 a1VarN2 = t0.n(t0Var.f2084p, list, t0Var.f2087s, t0Var.f2090v, t0Var.C);
                    t0Var.f2085q = a1VarN2;
                    t0Var.f2086r = t0.m(a1VarN2, list, t0Var.C, t0Var.f2087s, t0Var.f2090v);
                    final boolean z12 = !t0Var.f2085q.equals(a1Var3);
                    final boolean z13 = !t0Var.f2086r.equals(a1Var4);
                    d0 d0Var2 = t0Var.f2069a;
                    final int i12 = 1;
                    final int i13 = this.f1751b;
                    d0Var2.b(new p4.g(t0Var, z13, z12, i13, i12) { // from class: b7.o0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f2000a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ t0 f2001b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f2002c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ int f2003d;

                        {
                            this.f2000a = i12;
                            this.f2002c = z12;
                            this.f2003d = i13;
                        }

                        @Override // p4.g
                        public final void accept(Object obj) {
                            b0 b0Var = (b0) obj;
                            switch (this.f2000a) {
                                case 0:
                                    t0 t0Var2 = this.f2001b;
                                    cb.v vVarX = b0Var.x(t0Var2.f2069a, t0Var2.f2086r);
                                    if (this.f2002c) {
                                        b0Var.w();
                                    }
                                    vVarX.a(new b5.n(t0Var2, vVarX, this.f2003d, 1), cb.r.f3875a);
                                    break;
                                default:
                                    t0 t0Var3 = this.f2001b;
                                    cb.v vVarX2 = b0Var.x(t0Var3.f2069a, t0Var3.f2086r);
                                    if (this.f2002c) {
                                        b0Var.w();
                                    }
                                    vVarX2.a(new b5.n(t0Var3, vVarX2, this.f2003d, 1), cb.r.f3875a);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e1(int i10, ya.a1 a1Var, int i11) {
        this.f1750a = i11;
        this.f1751b = i10;
        this.f1752c = a1Var;
    }
}
