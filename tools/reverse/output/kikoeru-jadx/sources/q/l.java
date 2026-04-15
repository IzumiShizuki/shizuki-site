package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends y0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r.j1 f17350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x0.w0 f17351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m f17352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17353r;

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        long j11;
        g2.g1 g1VarV = u0Var.v(j10);
        if (x0Var.O()) {
            j11 = (((long) g1VarV.f7180a) << 32) | (((long) g1VarV.f7181b) & 4294967295L);
        } else {
            r.j1 j1Var = this.f17350o;
            if (j1Var == null) {
                j11 = (((long) g1VarV.f7180a) << 32) | (((long) g1VarV.f7181b) & 4294967295L);
                this.f17353r = j11;
            } else {
                long j12 = (((long) g1VarV.f7181b) & 4294967295L) | (((long) g1VarV.f7180a) << 32);
                r.i1 i1VarA = j1Var.a(new k(this, j12, 0), new k(this, j12, 1));
                this.f17352q.getClass();
                j11 = ((f3.l) i1VarA.getValue()).f6666a;
                this.f17353r = ((f3.l) i1VarA.getValue()).f6666a;
            }
        }
        return x0Var.b0((int) (j11 >> 32), (int) (4294967295L & j11), vb.s.f22820a, new j(this, g1VarV, j11));
    }

    @Override // j1.p
    public final void v0() {
        this.f17353r = androidx.compose.animation.a.f453a;
    }
}
