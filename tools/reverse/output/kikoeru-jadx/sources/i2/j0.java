package i2;

import j2.z2;
import java.util.List;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements x0.i, q1, k {
    public static final e0 R = new e0("Undefined intrinsics block and it is required");
    public static final d0 S = new d0();
    public static final androidx.media3.exoplayer.offline.i T = new androidx.media3.exoplayer.offline.i(4);
    public z2 A;
    public x0.x B;
    public h0 C;
    public h0 D;
    public boolean E;
    public final d1 F;
    public final n0 G;
    public g2.p0 H;
    public g1 I;
    public boolean J;
    public j1.q K;
    public j1.q L;
    public i3.d M;
    public c2.a0 N;
    public boolean O;
    public int P;
    public boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f8749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f8751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z0.e f8752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j0 f8754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p1 f8755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i3.q f8756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q2.k f8760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8761t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0.e f8762u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8763v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g2.v0 f8764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.media3.exoplayer.offline.u f8765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f3.c f8766y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f3.m f8767z;

    public j0(int i10) {
        this(q2.m.f17634a.addAndGet(1), (i10 & 1) == 0);
    }

    public static boolean R(j0 j0Var) {
        z0 z0Var = j0Var.G.f8805p;
        return j0Var.Q(z0Var.f8912j ? new f3.a(z0Var.f7183d) : null);
    }

    public static void W(j0 j0Var, boolean z10, int i10) {
        j0 j0VarV;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (j0Var.f8749h == null) {
            f2.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        p1 p1Var = j0Var.f8755n;
        if (p1Var == null || j0Var.f8758q || j0Var.f8742a) {
            return;
        }
        ((j2.v) p1Var).D(j0Var, true, z10, z11);
        if (z12) {
            v0 v0Var = j0Var.G.f8806q;
            jc.l.b(v0Var);
            n0 n0Var = v0Var.f8861f;
            j0 j0VarV2 = n0Var.f8790a.v();
            h0 h0Var = n0Var.f8790a.C;
            if (j0VarV2 == null || h0Var == h0.f8722c) {
                return;
            }
            while (j0VarV2.C == h0Var && (j0VarV = j0VarV2.v()) != null) {
                j0VarV2 = j0VarV;
            }
            int iOrdinal = h0Var.ordinal();
            if (iOrdinal == 0) {
                if (j0VarV2.f8749h != null) {
                    W(j0VarV2, z10, 6);
                    return;
                } else {
                    Y(j0VarV2, z10, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (j0VarV2.f8749h != null) {
                j0VarV2.V(z10);
            } else {
                j0VarV2.X(z10);
            }
        }
    }

    public static void Y(j0 j0Var, boolean z10, int i10) {
        p1 p1Var;
        j0 j0VarV;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (j0Var.f8758q || j0Var.f8742a || (p1Var = j0Var.f8755n) == null) {
            return;
        }
        ((j2.v) p1Var).D(j0Var, false, z10, z11);
        if (z12) {
            n0 n0Var = j0Var.G.f8805p.f8908f;
            j0 j0VarV2 = n0Var.f8790a.v();
            h0 h0Var = n0Var.f8790a.C;
            if (j0VarV2 == null || h0Var == h0.f8722c) {
                return;
            }
            while (j0VarV2.C == h0Var && (j0VarV = j0VarV2.v()) != null) {
                j0VarV2 = j0VarV;
            }
            int iOrdinal = h0Var.ordinal();
            if (iOrdinal == 0) {
                Y(j0VarV2, z10, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                j0VarV2.X(z10);
            }
        }
    }

    public static void Z(j0 j0Var) {
        n0 n0Var = j0Var.G;
        if (i0.f8728a[n0Var.f8793d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + n0Var.f8793d);
        }
        if (n0Var.f8794e) {
            W(j0Var, true, 6);
            return;
        }
        if (n0Var.f8795f) {
            j0Var.V(true);
        }
        if (j0Var.r()) {
            Y(j0Var, true, 6);
        } else if (j0Var.p()) {
            j0Var.X(true);
        }
    }

    private final String j(j0 j0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(j0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        j0 j0Var2 = j0Var.f8754m;
        sb.append(j0Var2 != null ? j0Var2.g(0) : null);
        return sb.toString();
    }

    public final void A(long j10, s sVar, int i10, boolean z10) {
        d1 d1Var = this.F;
        g1 g1Var = d1Var.f8665d;
        q1.i0 i0Var = g1.M;
        d1Var.f8665d.R0(g1.P, g1Var.J0(j10), sVar, i10, z10);
    }

    public final void B(int i10, j0 j0Var) {
        if (j0Var.f8754m != null && j0Var.f8755n != null) {
            f2.a.b(j(j0Var));
        }
        j0Var.f8754m = this;
        androidx.media3.exoplayer.offline.u uVar = this.f8751j;
        ((z0.e) uVar.f968b).a(i10, j0Var);
        ((b0.d0) uVar.f969c).b();
        P();
        if (j0Var.f8742a) {
            this.f8750i++;
        }
        H();
        p1 p1Var = this.f8755n;
        if (p1Var != null) {
            j0Var.d(p1Var);
        }
        if (j0Var.G.f8801l > 0) {
            n0 n0Var = this.G;
            n0Var.d(n0Var.f8801l + 1);
        }
        if (j0Var.P > 0) {
            e0(this.P + 1);
        }
    }

    public final void C() {
        if (this.J) {
            d1 d1Var = this.F;
            g1 g1Var = d1Var.f8664c;
            g1 g1Var2 = d1Var.f8665d.f8704s;
            this.I = null;
            while (true) {
                if (jc.l.a(g1Var, g1Var2)) {
                    break;
                }
                if ((g1Var != null ? g1Var.K : null) != null) {
                    this.I = g1Var;
                    break;
                }
                g1Var = g1Var != null ? g1Var.f8704s : null;
            }
        }
        g1 g1Var3 = this.I;
        if (g1Var3 != null && g1Var3.K == null) {
            throw j2.h0.g("layer was not set");
        }
        if (g1Var3 != null) {
            g1Var3.T0();
            return;
        }
        j0 j0VarV = v();
        if (j0VarV != null) {
            j0VarV.C();
        }
    }

    public final void D() {
        d1 d1Var = this.F;
        g1 g1Var = d1Var.f8665d;
        u uVar = d1Var.f8664c;
        while (g1Var != uVar) {
            jc.l.c(g1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            c0 c0Var = (c0) g1Var;
            o1 o1Var = c0Var.K;
            if (o1Var != null) {
                o1Var.invalidate();
            }
            g1Var = c0Var.f8703r;
        }
        o1 o1Var2 = d1Var.f8664c.K;
        if (o1Var2 != null) {
            o1Var2.invalidate();
        }
    }

    public final void E() {
        if (this.f8742a) {
            j0 j0VarV = v();
            if (j0VarV != null) {
                j0VarV.E();
                return;
            }
            return;
        }
        if (this.f8749h != null) {
            W(this, false, 7);
        } else {
            Y(this, false, 7);
        }
    }

    public final void F() {
        if (f3.j.b(this.f8744c, 9223372034707292159L)) {
            return;
        }
        this.f8744c = 9223372034707292159L;
        z0.e eVarZ = z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j0) objArr[i11]).F();
        }
    }

    public final void G() {
        if (this.f8761t) {
            return;
        }
        if (this.F.f8663b.f9695f != null || this.L != null) {
            this.f8759r = true;
            return;
        }
        q2.k kVar = this.f8760s;
        this.f8761t = true;
        jc.y yVar = new jc.y();
        yVar.f10838a = new q2.k();
        r1 snapshotObserver = ((j2.v) m0.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f8840d, new b0.s1(5, this, yVar));
        this.f8761t = false;
        this.f8760s = (q2.k) yVar.f10838a;
        this.f8759r = false;
        j2.v vVar = (j2.v) m0.a(this);
        vVar.getSemanticsOwner().b(this, kVar);
        vVar.F();
    }

    public final void H() {
        j0 j0Var;
        if (this.f8750i > 0) {
            this.f8753l = true;
        }
        if (!this.f8742a || (j0Var = this.f8754m) == null) {
            return;
        }
        j0Var.H();
    }

    public final boolean I() {
        return this.f8755n != null;
    }

    public final boolean J() {
        return this.G.f8805p.f8922t;
    }

    public final Boolean K() {
        v0 v0Var = this.G.f8806q;
        if (v0Var != null) {
            return Boolean.valueOf(v0Var.F());
        }
        return null;
    }

    public final void L() {
        j0 j0VarV;
        if (this.C == h0.f8722c) {
            f();
        }
        v0 v0Var = this.G.f8806q;
        jc.l.b(v0Var);
        try {
            v0Var.f8862g = true;
            if (!v0Var.f8867l) {
                f2.a.b("replace() called on item that was not placed");
            }
            v0Var.f8880y = false;
            boolean zF = v0Var.F();
            v0Var.r0(v0Var.f8870o, v0Var.f8871p, v0Var.f8872q);
            if (zF && !v0Var.f8880y && (j0VarV = v0Var.f8861f.f8790a.v()) != null) {
                j0VarV.V(false);
            }
            v0Var.f8862g = false;
        } catch (Throwable th2) {
            v0Var.f8862g = false;
            throw th2;
        }
    }

    public final void M(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            androidx.media3.exoplayer.offline.u uVar = this.f8751j;
            z0.e eVar = (z0.e) uVar.f968b;
            b0.d0 d0Var = (b0.d0) uVar.f969c;
            Object objK = eVar.k(i14);
            d0Var.b();
            ((z0.e) uVar.f968b).a(i15, (j0) objK);
            d0Var.b();
        }
        P();
        H();
        E();
    }

    public final void N(j0 j0Var) {
        if (j0Var.G.f8801l > 0) {
            this.G.d(r0.f8801l - 1);
        }
        if (this.f8755n != null) {
            j0Var.h();
        }
        j0Var.f8754m = null;
        if (j0Var.P > 0) {
            e0(this.P - 1);
        }
        j0Var.F.f8665d.f8704s = null;
        if (j0Var.f8742a) {
            this.f8750i--;
            z0.e eVar = (z0.e) j0Var.f8751j.f968b;
            Object[] objArr = eVar.f26372a;
            int i10 = eVar.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((j0) objArr[i11]).F.f8665d.f8704s = null;
            }
        }
        H();
        P();
    }

    public final void O() {
        this.f8747f = true;
        z0.e eVarZ = z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j0) objArr[i11]).F();
        }
    }

    public final void P() {
        if (!this.f8742a) {
            this.f8763v = true;
            return;
        }
        j0 j0VarV = v();
        if (j0VarV != null) {
            j0VarV.P();
        }
    }

    public final boolean Q(f3.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.C == h0.f8722c) {
            e();
        }
        return this.G.f8805p.v0(aVar.f6651a);
    }

    public final void S() {
        androidx.media3.exoplayer.offline.u uVar = this.f8751j;
        z0.e eVar = (z0.e) uVar.f968b;
        z0.e eVar2 = (z0.e) uVar.f968b;
        int i10 = eVar.f26374c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                eVar2.g();
                ((b0.d0) uVar.f969c).b();
                return;
            }
            N((j0) eVar2.f26372a[i10]);
        }
    }

    public final void T(int i10, int i11) {
        if (i11 < 0) {
            f2.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            androidx.media3.exoplayer.offline.u uVar = this.f8751j;
            N((j0) ((z0.e) uVar.f968b).f26372a[i12]);
            Object objK = ((z0.e) uVar.f968b).k(i12);
            ((b0.d0) uVar.f969c).b();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final void U() {
        j0 j0VarV;
        if (this.C == h0.f8722c) {
            f();
        }
        z0 z0Var = this.G.f8805p;
        n0 n0Var = z0Var.f8908f;
        try {
            z0Var.f8909g = true;
            if (!z0Var.f8913k) {
                f2.a.b("replace called on unplaced item");
            }
            boolean z10 = z0Var.f8922t;
            z0Var.t0(z0Var.f8916n, z0Var.f8919q, z0Var.f8917o, z0Var.f8918p);
            if (z10 && !z0Var.G && (j0VarV = n0Var.f8790a.v()) != null) {
                j0VarV.X(false);
            }
        } finally {
        }
    }

    public final void V(boolean z10) {
        p1 p1Var;
        if (this.f8742a || (p1Var = this.f8755n) == null) {
            return;
        }
        ((j2.v) p1Var).E(this, true, z10);
    }

    public final void X(boolean z10) {
        p1 p1Var;
        if (this.f8742a || (p1Var = this.f8755n) == null) {
            return;
        }
        ((j2.v) p1Var).E(this, false, z10);
    }

    @Override // x0.i
    public final void a() {
        i3.q qVar = this.f8756o;
        if (qVar != null) {
            qVar.a();
        }
        g2.p0 p0Var = this.H;
        if (p0Var != null) {
            p0Var.a();
        }
        d1 d1Var = this.F;
        g1 g1Var = d1Var.f8664c.f8703r;
        for (g1 g1Var2 = d1Var.f8665d; !jc.l.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f8703r) {
            g1Var2.Z0();
        }
    }

    public final void a0() {
        z0.e eVarZ = z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var = (j0) objArr[i11];
            h0 h0Var = j0Var.D;
            j0Var.C = h0Var;
            if (h0Var != h0.f8722c) {
                j0Var.a0();
            }
        }
    }

    @Override // x0.i
    public final void b() {
        k1.b bVar;
        i3.q qVar = this.f8756o;
        if (qVar != null) {
            qVar.b();
        }
        g2.p0 p0Var = this.H;
        if (p0Var != null) {
            p0Var.e(true);
        }
        this.Q = true;
        j1.p pVar = this.F.f8666e;
        for (j1.p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.f9694e) {
            if (pVar2.f9703n) {
                pVar2.w0();
            }
        }
        for (j1.p pVar3 = pVar; pVar3 != null; pVar3 = pVar3.f9694e) {
            if (pVar3.f9703n) {
                pVar3.y0();
            }
        }
        while (pVar != null) {
            if (pVar.f9703n) {
                pVar.q0();
            }
            pVar = pVar.f9694e;
        }
        if (I()) {
            this.f8760s = null;
            this.f8759r = false;
        }
        p1 p1Var = this.f8755n;
        if (p1Var != null) {
            j2.v vVar = (j2.v) p1Var;
            vVar.getRectManager().j(this);
            if (j2.v.e() && (bVar = vVar.F) != null && bVar.f10990h.e(this.f8743b)) {
                bVar.f10983a.C(bVar.f10985c, this.f8743b, false);
            }
        }
    }

    public final void b0(Throwable th2) throws Throwable {
        x0.x xVar = this.B;
        o2 o2Var = i1.d.f8640a;
        f1.k kVar = (f1.k) xVar;
        kVar.getClass();
        i1.c cVar = (i1.c) x0.v.w(kVar, o2Var);
        if (cVar == null) {
            throw th2;
        }
        pc.f0.V(th2, new a9.d(12, cVar, this));
        throw th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [i2.g1, j1.p] */
    public final void c(j1.q qVar) {
        boolean z10;
        c1 c1Var;
        z0.e eVar;
        d1 d1Var;
        boolean z11;
        z0.e eVar2;
        d1 d1Var2;
        boolean z12;
        ?? r72;
        z0.e eVar3;
        z0.e eVar4;
        z0.e eVar5;
        z0.e eVar6;
        char c3;
        z0.e eVar7;
        e1 e1Var;
        d1 d1Var3 = this.F;
        boolean zD = d1Var3.d(16);
        j1.p pVar = d1Var3.f8666e;
        boolean zD2 = d1Var3.d(1024);
        this.K = qVar;
        u uVar = d1Var3.f8664c;
        j0 j0Var = d1Var3.f8662a;
        j1.p pVar2 = d1Var3.f8667f;
        c1 c1Var2 = d1Var3.f8663b;
        if (pVar2 == c1Var2) {
            f2.a.b("padChain called on already padded chain");
        }
        j1.p pVar3 = d1Var3.f8667f;
        pVar3.f9694e = c1Var2;
        c1Var2.f9695f = pVar3;
        z0.e eVar8 = d1Var3.f8668g;
        int i10 = eVar8 != null ? eVar8.f26374c : 0;
        z0.e eVar9 = d1Var3.f8669h;
        if (eVar9 == null) {
            eVar9 = new z0.e(new j1.o[16]);
        }
        z0.e eVar10 = d1Var3.f8670i;
        eVar10.b(qVar);
        e1 e1Var2 = null;
        while (true) {
            int i11 = eVar10.f26374c;
            if (i11 == 0) {
                break;
            }
            j1.q qVar2 = (j1.q) eVar10.k(i11 - 1);
            if (qVar2 instanceof j1.j) {
                j1.j jVar = (j1.j) qVar2;
                eVar10.b(jVar.f9685b);
                eVar10.b(jVar.f9684a);
            } else if (qVar2 instanceof j1.o) {
                eVar9.b(qVar2);
            } else {
                if (e1Var2 == null) {
                    e1Var = new e1(0, eVar9);
                    e1Var2 = e1Var;
                } else {
                    e1Var = e1Var2;
                }
                qVar2.k(e1Var);
            }
        }
        int i12 = eVar9.f26374c;
        if (i12 == i10) {
            j1.p pVar4 = c1Var2.f9695f;
            int i13 = 0;
            z0.e eVar11 = eVar8;
            while (pVar4 != null && i13 < i10) {
                if (eVar11 == null) {
                    throw j2.h0.g("expected prior modifier list to be non-empty");
                }
                j1.o oVar = (j1.o) eVar11.f26372a[i13];
                j1.o oVar2 = (j1.o) eVar9.f26372a[i13];
                if (jc.l.a(oVar, oVar2)) {
                    eVar7 = eVar11;
                    c3 = 2;
                } else {
                    z0.e eVar12 = eVar11;
                    if (oVar.getClass() == oVar2.getClass()) {
                        c3 = 1;
                        eVar7 = eVar12;
                    } else {
                        c3 = 0;
                        eVar7 = eVar12;
                    }
                }
                if (c3 == 0) {
                    pVar4 = pVar4.f9694e;
                    eVar6 = eVar7;
                    break;
                } else {
                    if (c3 == 1) {
                        d1.h(oVar, oVar2, pVar4);
                    }
                    pVar4 = pVar4.f9695f;
                    i13++;
                    eVar11 = eVar7;
                }
            }
            eVar6 = eVar11;
            if (i13 >= i10) {
                d1Var3 = d1Var3;
                eVar2 = eVar6;
                z11 = false;
                d1Var2 = d1Var3;
                c1Var = c1Var2;
                eVar = eVar9;
                z12 = false;
                eVar3 = eVar2;
                r72 = z11;
            } else {
                if (eVar6 == null) {
                    throw j2.h0.g("expected prior modifier list to be non-empty");
                }
                if (pVar4 == null) {
                    throw j2.h0.g("structuralUpdate requires a non-null tail");
                }
                boolean z13 = j0Var.L != null;
                j1.p pVar5 = pVar4;
                d1 d1Var4 = d1Var3;
                eVar = eVar9;
                z0.e eVar13 = eVar6;
                z10 = false;
                d1Var4.f(i13, eVar13, eVar, pVar5, !z13);
                c1Var = c1Var2;
                d1Var = d1Var4;
                eVar5 = eVar13;
                z12 = true;
                d1Var2 = d1Var;
                eVar3 = eVar5;
                r72 = z10;
            }
        } else {
            z10 = false;
            z10 = false;
            z11 = false;
            j1.q qVar3 = j0Var.L;
            if (qVar3 != null && i10 == 0) {
                j1.p pVarB = c1Var2;
                for (int i14 = 0; i14 < eVar9.f26374c; i14++) {
                    pVarB = d1.b((j1.o) eVar9.f26372a[i14], pVarB);
                }
                int i15 = 0;
                for (j1.p pVar6 = pVar.f9694e; pVar6 != null && pVar6 != c1Var2; pVar6 = pVar6.f9694e) {
                    i15 |= pVar6.f9692c;
                    pVar6.f9693d = i15;
                }
                d1Var = d1Var3;
                c1Var = c1Var2;
                eVar = eVar9;
                eVar5 = eVar8;
            } else if (i12 != 0) {
                if (eVar8 == null) {
                    eVar8 = new z0.e(new j1.o[16]);
                }
                d1 d1Var5 = d1Var3;
                c1Var = c1Var2;
                eVar = eVar9;
                d1Var5.f(0, eVar8, eVar, c1Var, !(qVar3 != null));
                d1Var = d1Var5;
                eVar5 = eVar8;
            } else {
                if (eVar8 == null) {
                    throw j2.h0.g("expected prior modifier list to be non-empty");
                }
                j1.p pVar7 = c1Var2.f9695f;
                for (int i16 = 0; pVar7 != null && i16 < eVar8.f26374c; i16++) {
                    pVar7 = d1.c(pVar7).f9695f;
                }
                j0 j0VarV = j0Var.v();
                uVar.f8704s = j0VarV != null ? j0VarV.F.f8664c : null;
                d1Var3.f8665d = uVar;
                eVar2 = eVar8;
                d1Var2 = d1Var3;
                c1Var = c1Var2;
                eVar = eVar9;
                z12 = false;
                eVar3 = eVar2;
                r72 = z11;
            }
            z12 = true;
            d1Var2 = d1Var;
            eVar3 = eVar5;
            r72 = z10;
        }
        d1Var2.f8668g = eVar;
        if (eVar3 != null) {
            eVar3.g();
            eVar4 = eVar3;
        } else {
            eVar4 = r72;
        }
        d1Var2.f8669h = eVar4;
        j1.p pVar8 = c1Var.f9695f;
        if (pVar8 != null) {
            pVar = pVar8;
        }
        pVar.f9694e = r72;
        c1Var.f9695f = r72;
        c1Var.f9693d = -1;
        c1Var.f9697h = r72;
        if (pVar == c1Var) {
            f2.a.b("trimChain did not update the head");
        }
        d1Var2.f8667f = pVar;
        if (z12) {
            d1Var2.g();
        }
        boolean zD3 = d1Var2.d(16);
        boolean zD4 = d1Var2.d(1024);
        this.G.j();
        if (this.f8749h == null && d1Var2.d(512)) {
            f0(this);
        }
        if (zD == zD3 && zD2 == zD4) {
            return;
        }
        r2.b rectManager = ((j2.v) m0.a(this)).getRectManager();
        rectManager.getClass();
        if (I()) {
            ah.j jVar2 = rectManager.f18730a;
            int i17 = this.f8743b & 67108863;
            long[] jArr = (long[]) jVar2.f391c;
            int i18 = jVar2.f390b;
            for (int i19 = 0; i19 < jArr.length - 2 && i19 < i18; i19 += 3) {
                int i20 = i19 + 2;
                long j10 = jArr[i20];
                if ((((int) j10) & 67108863) == i17) {
                    jArr[i20] = ((zD3 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j10) | ((zD4 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final void c0(x0.x xVar) {
        this.B = xVar;
        o2 o2Var = j2.l1.f9866h;
        f1.k kVar = (f1.k) xVar;
        kVar.getClass();
        d0((f3.c) x0.v.w(kVar, o2Var));
        f3.m mVar = (f3.m) x0.v.w(kVar, j2.l1.f9872n);
        f3.m mVar2 = this.f8767z;
        d1 d1Var = this.F;
        if (mVar2 != mVar) {
            this.f8767z = mVar;
            E();
            j0 j0VarV = v();
            if (j0VarV != null) {
                j0VarV.C();
            }
            D();
            for (j1.p pVar = d1Var.f8667f; pVar != null; pVar = pVar.f9695f) {
                pVar.u0();
            }
        }
        i0((z2) x0.v.w(kVar, j2.l1.f9877s));
        j1.p pVar2 = d1Var.f8667f;
        if ((pVar2.f9693d & 32768) != 0) {
            while (pVar2 != null) {
                if ((pVar2.f9692c & 32768) != 0) {
                    ?? F = pVar2;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof l) {
                            j1.p pVar3 = ((j1.p) ((l) F)).f9690a;
                            if (pVar3.f9703n) {
                                h1.c(pVar3);
                            } else {
                                pVar3.f9699j = true;
                            }
                        } else if ((F.f9692c & 32768) != 0 && (F instanceof n)) {
                            j1.p pVar4 = ((n) F).f8789p;
                            int i10 = 0;
                            F = F;
                            eVar = eVar;
                            while (pVar4 != null) {
                                if ((pVar4.f9692c & 32768) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        F = pVar4;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new z0.e(new j1.p[16]);
                                        }
                                        if (F != 0) {
                                            eVar.b(F);
                                            F = 0;
                                        }
                                        eVar.b(pVar4);
                                    }
                                }
                                pVar4 = pVar4.f9695f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        F = f.f(eVar);
                    }
                }
                if ((pVar2.f9693d & 32768) == 0) {
                    return;
                } else {
                    pVar2 = pVar2.f9695f;
                }
            }
        }
    }

    public final void d(p1 p1Var) {
        j0 j0Var;
        k1.b bVar;
        q2.k kVarX;
        if (this.f8755n != null) {
            f2.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        j0 j0Var2 = this.f8754m;
        if (j0Var2 != null && !jc.l.a(j0Var2.f8755n, p1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(p1Var);
            sb.append(") than the parent's owner(");
            j0 j0VarV = v();
            sb.append(j0VarV != null ? j0VarV.f8755n : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            j0 j0Var3 = this.f8754m;
            sb.append(j0Var3 != null ? j0Var3.g(0) : null);
            f2.a.b(sb.toString());
        }
        j0 j0VarV2 = v();
        n0 n0Var = this.G;
        if (j0VarV2 == null) {
            n0Var.f8805p.f8922t = true;
            v0 v0Var = n0Var.f8806q;
            if (v0Var != null) {
                v0Var.f8873r = s0.f8848a;
            }
        }
        d1 d1Var = this.F;
        d1Var.f8665d.f8704s = j0VarV2 != null ? j0VarV2.F.f8664c : null;
        this.f8755n = p1Var;
        this.f8757p = (j0VarV2 != null ? j0VarV2.f8757p : -1) + 1;
        j1.q qVar = this.L;
        if (qVar != null) {
            c(qVar);
        }
        this.L = null;
        j2.v vVar = (j2.v) p1Var;
        vVar.getLayoutNodes().h(this.f8743b, this);
        if (this.f8748g) {
            f0(this);
        } else {
            j0 j0Var4 = this.f8754m;
            if (j0Var4 == null || (j0Var = j0Var4.f8749h) == null) {
                j0Var = this.f8749h;
            }
            f0(j0Var);
            if (this.f8749h == null && d1Var.d(512)) {
                f0(this);
            }
        }
        if (!this.Q) {
            for (j1.p pVar = d1Var.f8667f; pVar != null; pVar = pVar.f9695f) {
                pVar.p0();
            }
        }
        z0.e eVar = (z0.e) this.f8751j.f968b;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j0) objArr[i11]).d(p1Var);
        }
        if (!this.Q) {
            d1Var.e();
        }
        E();
        if (j0VarV2 != null) {
            j0VarV2.E();
        }
        i3.d dVar = this.M;
        if (dVar != null) {
            dVar.a(p1Var);
        }
        n0Var.j();
        if (!this.Q && d1Var.d(8)) {
            G();
        }
        vVar.getClass();
        if (!j2.v.e() || (bVar = vVar.F) == null || (kVarX = x()) == null || !kVarX.f17630a.b(q2.t.f17686q)) {
            return;
        }
        bVar.f10990h.a(this.f8743b);
        bVar.f10983a.C(bVar.f10985c, this.f8743b, true);
    }

    public final void d0(f3.c cVar) {
        if (jc.l.a(this.f8766y, cVar)) {
            return;
        }
        this.f8766y = cVar;
        E();
        j0 j0VarV = v();
        if (j0VarV != null) {
            j0VarV.C();
        }
        D();
        for (j1.p pVar = this.F.f8667f; pVar != null; pVar = pVar.f9695f) {
            pVar.s0();
        }
    }

    public final void e() {
        this.D = this.C;
        this.C = h0.f8722c;
        z0.e eVarZ = z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var = (j0) objArr[i11];
            if (j0Var.C != h0.f8722c) {
                j0Var.e();
            }
        }
    }

    public final void e0(int i10) {
        j0 j0VarV;
        j0 j0VarV2;
        int i11 = this.P;
        if (i11 != i10) {
            if (i10 > 0 && i11 == 0 && (j0VarV2 = v()) != null) {
                j0VarV2.e0(j0VarV2.P + 1);
            }
            if (i10 == 0 && this.P > 0 && (j0VarV = v()) != null) {
                j0VarV.e0(j0VarV.P - 1);
            }
            this.P = i10;
        }
    }

    public final void f() {
        this.D = this.C;
        this.C = h0.f8722c;
        z0.e eVarZ = z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var = (j0) objArr[i11];
            if (j0Var.C == h0.f8721b) {
                j0Var.f();
            }
        }
    }

    public final void f0(j0 j0Var) {
        if (jc.l.a(j0Var, this.f8749h)) {
            return;
        }
        this.f8749h = j0Var;
        n0 n0Var = this.G;
        if (j0Var != null) {
            if (n0Var.f8806q == null) {
                n0Var.f8806q = new v0(n0Var);
            }
            d1 d1Var = this.F;
            g1 g1Var = d1Var.f8664c.f8703r;
            for (g1 g1Var2 = d1Var.f8665d; !jc.l.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f8703r) {
                g1Var2.H0();
            }
        } else {
            n0Var.f8806q = null;
            n0Var.f8795f = false;
            n0Var.f8794e = false;
        }
        E();
    }

    public final String g(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        z0.e eVarZ = z();
        Object[] objArr = eVarZ.f26372a;
        int i12 = eVarZ.f26374c;
        for (int i13 = 0; i13 < i12; i13++) {
            sb.append(((j0) objArr[i13]).g(i10 + 1));
        }
        String string = sb.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void g0(g2.v0 v0Var) {
        if (jc.l.a(this.f8764w, v0Var)) {
            return;
        }
        this.f8764w = v0Var;
        androidx.media3.exoplayer.offline.u uVar = this.f8765x;
        if (uVar != null) {
            ((x0.e1) uVar.f969c).setValue(v0Var);
        }
        E();
    }

    public final void h() {
        k1.b bVar;
        k0 k0Var;
        p1 p1Var = this.f8755n;
        if (p1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            j0 j0VarV = v();
            sb.append(j0VarV != null ? j0VarV.g(0) : null);
            f2.a.c(sb.toString());
            throw new ce.j0();
        }
        j0 j0VarV2 = v();
        n0 n0Var = this.G;
        if (j0VarV2 != null) {
            j0VarV2.C();
            j0VarV2.E();
            z0 z0Var = n0Var.f8805p;
            h0 h0Var = h0.f8722c;
            z0Var.f8914l = h0Var;
            v0 v0Var = n0Var.f8806q;
            if (v0Var != null) {
                v0Var.f8865j = h0Var;
            }
        }
        k0 k0Var2 = n0Var.f8805p.f8927y;
        k0Var2.f8773b = true;
        k0Var2.f8774c = false;
        k0Var2.f8776e = false;
        k0Var2.f8775d = false;
        k0Var2.f8777f = false;
        k0Var2.f8778g = false;
        k0Var2.f8779h = null;
        v0 v0Var2 = n0Var.f8806q;
        if (v0Var2 != null && (k0Var = v0Var2.f8874s) != null) {
            k0Var.f8773b = true;
            k0Var.f8774c = false;
            k0Var.f8776e = false;
            k0Var.f8775d = false;
            k0Var.f8777f = false;
            k0Var.f8778g = false;
            k0Var.f8779h = null;
        }
        d1 d1Var = this.F;
        j1.p pVar = d1Var.f8666e;
        g1 g1Var = d1Var.f8664c.f8703r;
        for (g1 g1Var2 = d1Var.f8665d; !jc.l.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f8703r) {
            g1Var2.e1();
        }
        c2.a0 a0Var = this.N;
        if (a0Var != null) {
            a0Var.a(p1Var);
        }
        for (j1.p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.f9694e) {
            if (pVar2.f9703n) {
                pVar2.y0();
            }
        }
        this.f8758q = true;
        z0.e eVar = (z0.e) this.f8751j.f968b;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j0) objArr[i11]).h();
        }
        this.f8758q = false;
        while (pVar != null) {
            if (pVar.f9703n) {
                pVar.q0();
            }
            pVar = pVar.f9694e;
        }
        j2.v vVar = (j2.v) p1Var;
        vVar.getLayoutNodes().g(this.f8743b);
        x0 x0Var = vVar.P;
        c7.e1 e1Var = x0Var.f8898b;
        ((b0.c1) e1Var.f3618b).C(this);
        ((b0.c1) e1Var.f3619c).C(this);
        ((b0.c1) e1Var.f3620d).C(this);
        ((z0.e) x0Var.f8901e.f968b).j(this);
        vVar.G = true;
        vVar.getRectManager().j(this);
        if (j2.v.e() && (bVar = vVar.F) != null && bVar.f10990h.e(this.f8743b)) {
            bVar.f10983a.C(bVar.f10985c, this.f8743b, false);
        }
        this.f8755n = null;
        this.f8744c = 9223372034707292159L;
        f0(null);
        this.f8757p = 0;
        z0 z0Var2 = n0Var.f8805p;
        z0Var2.f8911i = Integer.MAX_VALUE;
        z0Var2.f8910h = Integer.MAX_VALUE;
        z0Var2.f8922t = false;
        v0 v0Var3 = n0Var.f8806q;
        if (v0Var3 != null) {
            v0Var3.f8864i = Integer.MAX_VALUE;
            v0Var3.f8863h = Integer.MAX_VALUE;
            v0Var3.f8873r = s0.f8850c;
        }
        if (d1Var.d(8)) {
            q2.k kVar = this.f8760s;
            this.f8760s = null;
            this.f8759r = false;
            vVar.getSemanticsOwner().b(this, kVar);
            vVar.F();
        }
    }

    public final void h0(j1.q qVar) {
        if (this.f8742a && this.K != j1.n.f9689a) {
            f2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.Q) {
            f2.a.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.L = qVar;
            return;
        }
        c(qVar);
        if (this.f8759r) {
            G();
        }
    }

    public final void i(q1.o oVar, t1.b bVar) throws Throwable {
        try {
            this.F.f8665d.F0(oVar, bVar);
        } catch (Throwable th2) {
            b0(th2);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void i0(z2 z2Var) {
        if (jc.l.a(this.A, z2Var)) {
            return;
        }
        this.A = z2Var;
        j1.p pVar = this.F.f8667f;
        if ((pVar.f9693d & 16) != 0) {
            while (pVar != null) {
                if ((pVar.f9692c & 16) != 0) {
                    ?? F = pVar;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof u1) {
                            ((u1) F).h0();
                        } else if ((F.f9692c & 16) != 0 && (F instanceof n)) {
                            j1.p pVar2 = ((n) F).f8789p;
                            int i10 = 0;
                            F = F;
                            eVar = eVar;
                            while (pVar2 != null) {
                                if ((pVar2.f9692c & 16) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        F = pVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new z0.e(new j1.p[16]);
                                        }
                                        if (F != 0) {
                                            eVar.b(F);
                                            F = 0;
                                        }
                                        eVar.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f9695f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        F = f.f(eVar);
                    }
                }
                if ((pVar.f9693d & 16) == 0) {
                    return;
                } else {
                    pVar = pVar.f9695f;
                }
            }
        }
    }

    public final void j0() {
        if (this.f8750i <= 0 || !this.f8753l) {
            return;
        }
        this.f8753l = false;
        z0.e eVar = this.f8752k;
        if (eVar == null) {
            eVar = new z0.e(new j0[16]);
            this.f8752k = eVar;
        }
        eVar.g();
        z0.e eVar2 = (z0.e) this.f8751j.f968b;
        Object[] objArr = eVar2.f26372a;
        int i10 = eVar2.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var = (j0) objArr[i11];
            if (j0Var.f8742a) {
                eVar.d(eVar.f26374c, j0Var.z());
            } else {
                eVar.b(j0Var);
            }
        }
        n0 n0Var = this.G;
        n0Var.f8805p.A = true;
        v0 v0Var = n0Var.f8806q;
        if (v0Var != null) {
            v0Var.f8876u = true;
        }
    }

    public final void k() {
        if (this.f8749h != null) {
            W(this, false, 5);
        } else {
            Y(this, false, 5);
        }
        z0 z0Var = this.G.f8805p;
        f3.a aVar = z0Var.f8912j ? new f3.a(z0Var.f7183d) : null;
        if (aVar != null) {
            p1 p1Var = this.f8755n;
            if (p1Var != null) {
                ((j2.v) p1Var).z(this, aVar.f6651a);
                return;
            }
            return;
        }
        p1 p1Var2 = this.f8755n;
        if (p1Var2 != null) {
            ((j2.v) p1Var2).y(true);
        }
    }

    public final List l() {
        v0 v0Var = this.G.f8806q;
        jc.l.b(v0Var);
        z0.e eVar = v0Var.f8875t;
        n0 n0Var = v0Var.f8861f;
        n0Var.f8790a.n();
        if (!v0Var.f8876u) {
            return eVar.f();
        }
        j0 j0Var = n0Var.f8790a;
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            if (eVar.f26374c <= i11) {
                v0 v0Var2 = j0Var2.G.f8806q;
                jc.l.b(v0Var2);
                eVar.b(v0Var2);
            } else {
                v0 v0Var3 = j0Var2.G.f8806q;
                jc.l.b(v0Var3);
                Object[] objArr2 = eVar.f26372a;
                Object obj = objArr2[i11];
                objArr2[i11] = v0Var3;
            }
        }
        eVar.l(((z0.b) j0Var.n()).f26366a.f26374c, eVar.f26374c);
        v0Var.f8876u = false;
        return eVar.f();
    }

    public final List m() {
        return this.G.f8805p.l0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((z0.e) this.f8751j.f968b).f();
    }

    public final boolean p() {
        return this.G.f8805p.f8925w;
    }

    @Override // i2.q1
    public final boolean q() {
        return I();
    }

    public final boolean r() {
        return this.G.f8805p.f8924v;
    }

    public final h0 s() {
        return this.G.f8805p.f8914l;
    }

    public final h0 t() {
        h0 h0Var;
        v0 v0Var = this.G.f8806q;
        return (v0Var == null || (h0Var = v0Var.f8865j) == null) ? h0.f8722c : h0Var;
    }

    public final String toString() {
        return j2.l0.G(this) + " children: " + ((z0.b) n()).f26366a.f26374c + " measurePolicy: " + this.f8764w + " deactivated: " + this.Q;
    }

    public final androidx.media3.exoplayer.offline.u u() {
        androidx.media3.exoplayer.offline.u uVar = this.f8765x;
        if (uVar != null) {
            return uVar;
        }
        androidx.media3.exoplayer.offline.u uVar2 = new androidx.media3.exoplayer.offline.u(this, this.f8764w);
        this.f8765x = uVar2;
        return uVar2;
    }

    public final j0 v() {
        j0 j0Var = this.f8754m;
        while (j0Var != null && j0Var.f8742a) {
            j0Var = j0Var.f8754m;
        }
        return j0Var;
    }

    public final int w() {
        return this.G.f8805p.f8911i;
    }

    public final q2.k x() {
        if (I() && !this.Q && this.F.d(8)) {
            return this.f8760s;
        }
        return null;
    }

    public final z0.e y() {
        boolean z10 = this.f8763v;
        z0.e eVar = this.f8762u;
        if (z10) {
            eVar.g();
            eVar.d(eVar.f26374c, z());
            vb.l.L0(eVar.f26372a, T, 0, eVar.f26374c);
            this.f8763v = false;
        }
        return eVar;
    }

    public final z0.e z() {
        j0();
        if (this.f8750i == 0) {
            return (z0.e) this.f8751j.f968b;
        }
        z0.e eVar = this.f8752k;
        jc.l.b(eVar);
        return eVar;
    }

    public j0(int i10, boolean z10) {
        this.f8742a = z10;
        this.f8743b = i10;
        this.f8744c = 9223372034707292159L;
        this.f8745d = 0L;
        this.f8746e = 9223372034707292159L;
        this.f8747f = true;
        this.f8751j = new androidx.media3.exoplayer.offline.u(22, new z0.e(new j0[16]), new b0.d0(13, this));
        this.f8762u = new z0.e(new j0[16]);
        this.f8763v = true;
        this.f8764w = R;
        this.f8766y = m0.f8785a;
        this.f8767z = f3.m.f6667a;
        this.A = S;
        x0.x.o0.getClass();
        this.B = x0.w.f24516b;
        h0 h0Var = h0.f8722c;
        this.C = h0Var;
        this.D = h0Var;
        this.F = new d1(this);
        this.G = new n0(this);
        this.J = true;
        this.K = j1.n.f9689a;
    }
}
