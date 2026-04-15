package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends q1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m4.h1 f10479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m4.f1 f10480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f10481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f10482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10485s;

    public y(a aVar, boolean z10) {
        super(aVar);
        this.f10478l = z10 && aVar.j();
        this.f10479m = new m4.h1();
        this.f10480n = new m4.f1();
        m4.i1 i1VarH = aVar.h();
        if (i1VarH == null) {
            this.f10481o = new w(new x(aVar.i()), m4.h1.f14252q, w.f10458h);
        } else {
            this.f10481o = new w(i1VarH, null, null);
            this.f10485s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // j5.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(m4.i1 r12) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.y.A(m4.i1):void");
    }

    @Override // j5.q1
    public final void B() {
        if (this.f10478l) {
            return;
        }
        this.f10483q = true;
        y(null, this.f10407k);
    }

    @Override // j5.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final v c(d0 d0Var, n5.f fVar, long j10) {
        v vVar = new v(d0Var, fVar, j10);
        p4.c.i(vVar.f10449d == null);
        a aVar = this.f10407k;
        vVar.f10449d = aVar;
        if (!this.f10484r) {
            this.f10482p = vVar;
            if (!this.f10483q) {
                this.f10483q = true;
                y(null, aVar);
            }
            return vVar;
        }
        Object obj = d0Var.f10245a;
        if (this.f10481o.f10460g != null && obj.equals(w.f10458h)) {
            obj = this.f10481o.f10460g;
        }
        vVar.b(d0Var.a(obj));
        return vVar;
    }

    public final boolean D(long j10) {
        v vVar = this.f10482p;
        int iB = this.f10481o.b(vVar.f10446a.f10245a);
        if (iB == -1) {
            return false;
        }
        w wVar = this.f10481o;
        m4.f1 f1Var = this.f10480n;
        wVar.f(iB, f1Var, false);
        long j11 = f1Var.f14204d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        vVar.f10452g = j10;
        return true;
    }

    @Override // j5.a
    public final boolean a(m4.i0 i0Var) {
        return this.f10407k.a(i0Var);
    }

    @Override // j5.a
    public final void o(b0 b0Var) {
        v vVar = (v) b0Var;
        if (vVar.f10450e != null) {
            a aVar = vVar.f10449d;
            aVar.getClass();
            aVar.o(vVar.f10450e);
        }
        if (b0Var == this.f10482p) {
            this.f10482p = null;
        }
    }

    @Override // j5.k, j5.a
    public final void q() {
        this.f10484r = false;
        this.f10483q = false;
        super.q();
    }

    @Override // j5.q1, j5.a
    public final void t(m4.i0 i0Var) {
        if (this.f10485s) {
            w wVar = this.f10481o;
            this.f10481o = new w(new n1(this.f10481o.f10410e, i0Var), wVar.f10459f, wVar.f10460g);
        } else {
            this.f10481o = new w(new x(i0Var), m4.h1.f14252q, w.f10458h);
        }
        this.f10407k.t(i0Var);
    }

    @Override // j5.q1
    public final d0 z(d0 d0Var) {
        Object obj = d0Var.f10245a;
        Object obj2 = this.f10481o.f10460g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = w.f10458h;
        }
        return d0Var.a(obj);
    }

    @Override // j5.k, j5.a
    public final void k() {
    }
}
