package k5;

import androidx.media3.exoplayer.offline.u;
import j5.b1;
import m4.o0;
import m4.q;
import p4.s;
import r5.h0;
import s4.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f11095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f11096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f11098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11099t;

    public j(s4.h hVar, s4.m mVar, q qVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(hVar, mVar, qVar, i10, obj, j10, j11, j12, j13, j14);
        this.f11094o = i11;
        this.f11095p = j15;
        this.f11096q = eVar;
    }

    @Override // k5.l
    public final long a() {
        return this.f11104j + ((long) this.f11094o);
    }

    @Override // k5.l
    public final boolean b() {
        return this.f11099t;
    }

    @Override // n5.l
    public final void i() {
        u uVar = this.f11031m;
        p4.c.j(uVar);
        if (this.f11097r == 0) {
            long j10 = this.f11095p;
            for (b1 b1Var : (b1[]) uVar.f969c) {
                if (b1Var.F != j10) {
                    b1Var.F = j10;
                    b1Var.f10234z = true;
                }
            }
            e eVar = this.f11096q;
            long j11 = this.f11029k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f11095p;
            long j13 = this.f11030l;
            eVar.b(uVar, j12, j13 != -9223372036854775807L ? j13 - this.f11095p : -9223372036854775807L);
        }
        try {
            s4.m mVarB = this.f11056b.b(this.f11097r);
            d0 d0Var = this.f11063i;
            r5.k kVar = new r5.k(d0Var, mVarB.f19448f, d0Var.f(mVarB));
            while (!this.f11098s) {
                try {
                    int iG = this.f11096q.f11046a.g(kVar, e.f11045j);
                    p4.c.i(iG != 1);
                    if (!(iG == 0)) {
                        break;
                    }
                } finally {
                    this.f11097r = kVar.f18846d - this.f11056b.f19448f;
                }
            }
            q qVar = this.f11058d;
            String str = qVar.f14543m;
            int i10 = qVar.K;
            int i11 = qVar.L;
            if (o0.m(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                h0 h0VarD1 = uVar.d1(4);
                int i12 = i10 * i11;
                long j14 = (this.f11062h - this.f11061g) / ((long) i12);
                for (int i13 = 1; i13 < i12; i13++) {
                    h0VarD1.e(0, new s());
                    h0VarD1.a(((long) i13) * j14, 0, 0, 0, null);
                }
            }
            nh.a.h(this.f11063i);
            this.f11099t = !this.f11098s;
        } catch (Throwable th2) {
            nh.a.h(this.f11063i);
            throw th2;
        }
    }

    @Override // n5.l
    public final void l() {
        this.f11098s = true;
    }
}
