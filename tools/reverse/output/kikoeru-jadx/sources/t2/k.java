package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f20355b;

    public k(String str, j0 j0Var) {
        this.f20354a = str;
        this.f20355b = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jc.l.a(this.f20354a, kVar.f20354a) && jc.l.a(this.f20355b, kVar.f20355b);
    }

    public final int hashCode() {
        int iHashCode = this.f20354a.hashCode() * 31;
        j0 j0Var = this.f20355b;
        return (iHashCode + (j0Var != null ? j0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return t0.E(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f20354a, ')');
    }
}
