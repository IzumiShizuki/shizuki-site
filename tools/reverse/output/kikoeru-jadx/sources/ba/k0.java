package ba;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0.d f2399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2400b;

    public k0(d0.d dVar, List list) {
        this.f2399a = dVar;
        this.f2400b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f2399a.equals(k0Var.f2399a) && this.f2400b.equals(k0Var.f2400b);
    }

    public final int hashCode() {
        return this.f2400b.hashCode() + (this.f2399a.hashCode() * 31);
    }

    public final String toString() {
        return "PackedPageState(pager=" + this.f2399a + ", item=" + this.f2400b + ")";
    }
}
