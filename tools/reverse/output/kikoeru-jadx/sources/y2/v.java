package y2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25429b;

    public v(int i10, int i11) {
        this.f25428a = i10;
        this.f25429b = i11;
    }

    @Override // y2.g
    public final void a(l6.d dVar) {
        boolean z10 = dVar.f11738d != -1;
        ce.g gVar = (ce.g) dVar.f11740f;
        if (z10) {
            dVar.f11738d = -1;
            dVar.f11739e = -1;
        }
        int iK = nh.b.k(this.f25428a, 0, gVar.n());
        int iK2 = nh.b.k(this.f25429b, 0, gVar.n());
        if (iK != iK2) {
            if (iK < iK2) {
                dVar.e(iK, iK2);
            } else {
                dVar.e(iK2, iK);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f25428a == vVar.f25428a && this.f25429b == vVar.f25429b;
    }

    public final int hashCode() {
        return (this.f25428a * 31) + this.f25429b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f25428a);
        sb.append(", end=");
        return h0.m(sb, this.f25429b, ')');
    }
}
