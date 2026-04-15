package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f20360b;

    public l(String str, j0 j0Var) {
        this.f20359a = str;
        this.f20360b = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return jc.l.a(this.f20359a, lVar.f20359a) && jc.l.a(this.f20360b, lVar.f20360b);
    }

    public final int hashCode() {
        int iHashCode = this.f20359a.hashCode() * 31;
        j0 j0Var = this.f20360b;
        return (iHashCode + (j0Var != null ? j0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return t0.E(new StringBuilder("LinkAnnotation.Url(url="), this.f20359a, ')');
    }
}
