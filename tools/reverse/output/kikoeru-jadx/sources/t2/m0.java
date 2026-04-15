package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20365a;

    public m0(String str) {
        this.f20365a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return jc.l.a(this.f20365a, ((m0) obj).f20365a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20365a.hashCode();
    }

    public final String toString() {
        return t0.E(new StringBuilder("UrlAnnotation(url="), this.f20365a, ')');
    }
}
