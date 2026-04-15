package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21544b;

    public k(Object obj, Object obj2) {
        this.f21543a = obj;
        this.f21544b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jc.l.a(this.f21543a, kVar.f21543a) && jc.l.a(this.f21544b, kVar.f21544b);
    }

    public final int hashCode() {
        Object obj = this.f21543a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f21544b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f21543a + ", " + this.f21544b + ')';
    }
}
