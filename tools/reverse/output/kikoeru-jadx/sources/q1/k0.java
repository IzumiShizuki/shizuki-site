package q1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f17544d = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17547c;

    public k0(long j10, long j11, float f10) {
        this.f17545a = j10;
        this.f17546b = j11;
        this.f17547c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return q.c(this.f17545a, k0Var.f17545a) && p1.b.c(this.f17546b, k0Var.f17546b) && this.f17547c == k0Var.f17547c;
    }

    public final int hashCode() {
        int i10 = q.f17576i;
        return Float.floatToIntBits(this.f17547c) + ((p1.b.g(this.f17546b) + (ub.v.a(this.f17545a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        t0.K(this.f17545a, ", offset=", sb);
        sb.append((Object) p1.b.k(this.f17546b));
        sb.append(", blurRadius=");
        return j2.h0.l(sb, this.f17547c, ')');
    }

    public /* synthetic */ k0() {
        this(h0.e(4278190080L), 0L, 0.0f);
    }
}
