package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends y0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r.q1 f17391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r.j1 f17392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r.j1 f17393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r.j1 f17394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q0 f17395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r0 f17396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ic.a f17397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g0 f17398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f17399w = w.f17467a;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j1.d f17400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0 f17401y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o0 f17402z;

    public p0(r.q1 q1Var, r.j1 j1Var, r.j1 j1Var2, r.j1 j1Var3, q0 q0Var, r0 r0Var, ic.a aVar, g0 g0Var) {
        this.f17391o = q1Var;
        this.f17392p = j1Var;
        this.f17393q = j1Var2;
        this.f17394r = j1Var3;
        this.f17395s = q0Var;
        this.f17396t = r0Var;
        this.f17397u = aVar;
        this.f17398v = g0Var;
        f3.b.b(0, 0, 15);
        this.f17401y = new o0(this, 0);
        this.f17402z = new o0(this, 1);
    }

    public final j1.d B0() {
        j1.d dVar;
        j1.d dVar2;
        if (this.f17391o.f().b(f0.f17290a, f0.f17291b)) {
            z zVar = this.f17395s.f17411a.f17481c;
            if (zVar != null && (dVar2 = zVar.f17484a) != null) {
                return dVar2;
            }
            z zVar2 = this.f17396t.f17436a.f17481c;
            if (zVar2 != null) {
                return zVar2.f17484a;
            }
            return null;
        }
        z zVar3 = this.f17396t.f17436a.f17481c;
        if (zVar3 != null && (dVar = zVar3.f17484a) != null) {
            return dVar;
        }
        z zVar4 = this.f17395s.f17411a.f17481c;
        if (zVar4 != null) {
            return zVar4.f17484a;
        }
        return null;
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        long j11;
        if (this.f17391o.f18539a.b1() == this.f17391o.f18542d.getValue()) {
            this.f17400x = null;
        } else if (this.f17400x == null) {
            j1.d dVarB0 = B0();
            if (dVarB0 == null) {
                dVarB0 = j1.c.f9662a;
            }
            this.f17400x = dVarB0;
        }
        boolean zO = x0Var.O();
        vb.s sVar = vb.s.f22820a;
        if (zO) {
            g2.g1 g1VarV = u0Var.v(j10);
            long j12 = (((long) g1VarV.f7180a) << 32) | (((long) g1VarV.f7181b) & 4294967295L);
            this.f17399w = j12;
            return x0Var.b0((int) (j12 >> 32), (int) (4294967295L & j12), sVar, new b0.p(g1VarV, 9));
        }
        if (!((Boolean) this.f17397u.b()).booleanValue()) {
            g2.g1 g1VarV2 = u0Var.v(j10);
            return x0Var.b0(g1VarV2.f7180a, g1VarV2.f7181b, sVar, new b0.p(g1VarV2, 10));
        }
        g0 g0Var = this.f17398v;
        r.j1 j1Var = g0Var.f17296a;
        r.j1 j1Var2 = g0Var.f17297b;
        r.q1 q1Var = g0Var.f17298c;
        q0 q0Var = g0Var.f17299d;
        r0 r0Var = g0Var.f17300e;
        r.j1 j1Var3 = g0Var.f17301f;
        r.i1 i1VarA = j1Var != null ? j1Var.a(new h0(q0Var, r0Var, 0), new h0(q0Var, r0Var, 1)) : null;
        r.i1 i1VarA2 = j1Var2 != null ? j1Var2.a(new h0(q0Var, r0Var, 2), new h0(q0Var, r0Var, 3)) : null;
        if (q1Var.f18539a.b1() == f0.f17290a) {
            y1 y1Var = r0Var.f17436a;
        } else {
            y1 y1Var2 = r0Var.f17436a;
        }
        cg.b bVar = new cg.b(i1VarA, i1VarA2, j1Var3 != null ? j1Var3.a(r.f17429i, new cg.b(i1VarA, q0Var, r0Var, 15)) : null, 14);
        g2.g1 g1VarV3 = u0Var.v(j10);
        long j13 = (((long) g1VarV3.f7181b) & 4294967295L) | (((long) g1VarV3.f7180a) << 32);
        long j14 = !f3.l.b(this.f17399w, w.f17467a) ? this.f17399w : j13;
        r.j1 j1Var4 = this.f17392p;
        i1VarA = j1Var4 != null ? j1Var4.a(this.f17401y, new n0(this, j14, 0)) : null;
        if (i1VarA != null) {
            j13 = ((f3.l) i1VarA.getValue()).f6666a;
        }
        long jD = f3.b.d(j10, j13);
        r.j1 j1Var5 = this.f17393q;
        long jA = 0;
        long j15 = j1Var5 != null ? ((f3.j) j1Var5.a(r.f17430j, new n0(this, j14, 1)).getValue()).f6660a : 0L;
        r.j1 j1Var6 = this.f17394r;
        long j16 = j1Var6 != null ? ((f3.j) j1Var6.a(this.f17402z, new n0(this, j14, 2)).getValue()).f6660a : 0L;
        j1.d dVar = this.f17400x;
        if (dVar != null) {
            long j17 = j14;
            j11 = j16;
            jA = dVar.a(j17, jD, f3.m.f6667a);
        } else {
            j11 = j16;
        }
        return x0Var.b0((int) (jD >> 32), (int) (jD & 4294967295L), sVar, new m0(g1VarV3, f3.j.d(jA, j11), j15, bVar, 0));
    }

    @Override // j1.p
    public final void r0() {
        this.f17399w = w.f17467a;
    }
}
