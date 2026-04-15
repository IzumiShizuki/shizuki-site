package k5;

import androidx.media3.exoplayer.offline.u;
import m4.q;
import r5.b0;
import s4.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f11100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u f11101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f11103m;

    public k(s4.h hVar, s4.m mVar, q qVar, int i10, Object obj, e eVar) {
        super(hVar, mVar, 2, qVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f11100j = eVar;
    }

    @Override // n5.l
    public final void i() {
        if (this.f11102l == 0) {
            this.f11100j.b(this.f11101k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            s4.m mVarB = this.f11056b.b(this.f11102l);
            d0 d0Var = this.f11063i;
            r5.k kVar = new r5.k(d0Var, mVarB.f19448f, d0Var.f(mVarB));
            while (!this.f11103m) {
                try {
                    int iG = this.f11100j.f11046a.g(kVar, e.f11045j);
                    boolean z10 = false;
                    p4.c.i(iG != 1);
                    if (iG == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.f11102l = kVar.f18846d - this.f11056b.f19448f;
                    b0 b0Var = this.f11100j.f11053h;
                }
            }
        } finally {
            nh.a.h(this.f11063i);
        }
    }

    @Override // n5.l
    public final void l() {
        this.f11103m = true;
    }
}
