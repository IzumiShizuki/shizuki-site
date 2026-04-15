package y2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25433b;

    public x(int i10, int i11) {
        this.f25432a = i10;
        this.f25433b = i11;
    }

    @Override // y2.g
    public final void a(l6.d dVar) {
        int iK = nh.b.k(this.f25432a, 0, ((ce.g) dVar.f11740f).n());
        int iK2 = nh.b.k(this.f25433b, 0, ((ce.g) dVar.f11740f).n());
        if (iK < iK2) {
            dVar.f(iK, iK2);
        } else {
            dVar.f(iK2, iK);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f25432a == xVar.f25432a && this.f25433b == xVar.f25433b;
    }

    public final int hashCode() {
        return (this.f25432a * 31) + this.f25433b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f25432a);
        sb.append(", end=");
        return h0.m(sb, this.f25433b, ')');
    }
}
