package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12528a;

    public y0(long j10) {
        this.f12528a = j10;
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
    }

    @Override // lf.t0
    public final f a(mf.u uVar) {
        x0 x0Var = new x0(this, null);
        int i10 = a0.f12352a;
        mf.j jVar = new mf.j(x0Var, uVar, yb.i.f26088a, -2, kf.a.f11336a);
        int i11 = 2;
        return p0.k(new s(jVar, new i7.a(i11, null, i11), 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            return this.f12528a == ((y0) obj).f12528a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f12528a;
        return (((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) 9223372034707292160L);
    }

    public final String toString() {
        wb.b bVar = new wb.b(2);
        long j10 = this.f12528a;
        if (j10 > 0) {
            bVar.add("stopTimeout=" + j10 + "ms");
        }
        return q.t0.E(new StringBuilder("SharingStarted.WhileSubscribed("), vb.m.f0(ud.b.g(bVar), null, null, null, null, 63), ')');
    }
}
