package k5;

import androidx.media3.exoplayer.offline.u;
import j5.b1;
import m4.q;
import r5.h0;
import s4.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f11107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f11108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11109r;

    public n(s4.h hVar, s4.m mVar, q qVar, int i10, Object obj, long j10, long j11, long j12, int i11, q qVar2) {
        super(hVar, mVar, qVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f11106o = i11;
        this.f11107p = qVar2;
    }

    @Override // k5.l
    public final boolean b() {
        return this.f11109r;
    }

    @Override // n5.l
    public final void i() {
        d0 d0Var = this.f11063i;
        u uVar = this.f11031m;
        p4.c.j(uVar);
        for (b1 b1Var : (b1[]) uVar.f969c) {
            if (b1Var.F != 0) {
                b1Var.F = 0L;
                b1Var.f10234z = true;
            }
        }
        h0 h0VarD1 = uVar.d1(this.f11106o);
        h0VarD1.b(this.f11107p);
        try {
            long jF = d0Var.f(this.f11056b.b(this.f11108q));
            if (jF != -1) {
                jF += this.f11108q;
            }
            r5.k kVar = new r5.k(this.f11063i, this.f11108q, jF);
            for (int iD = 0; iD != -1; iD = h0VarD1.d(kVar, Integer.MAX_VALUE, true)) {
                this.f11108q += (long) iD;
            }
            h0VarD1.a(this.f11061g, 1, (int) this.f11108q, 0, null);
            nh.a.h(d0Var);
            this.f11109r = true;
        } catch (Throwable th2) {
            nh.a.h(d0Var);
            throw th2;
        }
    }

    @Override // n5.l
    public final void l() {
    }
}
