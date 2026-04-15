package b7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.i0 f2108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2110c;

    public u1(int i10, long j10, List list) {
        this.f2108a = ya.i0.q(list);
        this.f2109b = i10;
        this.f2110c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (this.f2108a.equals(u1Var.f2108a)) {
            Integer numValueOf = Integer.valueOf(this.f2109b);
            Integer numValueOf2 = Integer.valueOf(u1Var.f2109b);
            int i10 = p4.c0.f16548a;
            if (numValueOf.equals(numValueOf2) && Long.valueOf(this.f2110c).equals(Long.valueOf(u1Var.f2110c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return gh.g.y(this.f2110c) + (((this.f2108a.hashCode() * 31) + this.f2109b) * 31);
    }
}
