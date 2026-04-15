package v0;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22194d;

    public f(long j10, long j11, long j12, long j13) {
        this.f22191a = j10;
        this.f22192b = j11;
        this.f22193c = j12;
        this.f22194d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return q1.q.c(this.f22191a, fVar.f22191a) && q1.q.c(this.f22192b, fVar.f22192b) && q1.q.c(this.f22193c, fVar.f22193c) && q1.q.c(this.f22194d, fVar.f22194d);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f22194d) + t0.y(t0.y(ub.v.a(this.f22191a) * 31, 31, this.f22192b), 31, this.f22193c);
    }
}
