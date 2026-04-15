package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20374a;

    public n0(String str) {
        this.f20374a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return jc.l.a(this.f20374a, ((n0) obj).f20374a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20374a.hashCode();
    }

    public final String toString() {
        return t0.E(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f20374a, ')');
    }
}
