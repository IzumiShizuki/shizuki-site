package ud;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21602a;

    public t(String str) {
        this.f21602a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && jc.l.a(this.f21602a, ((t) obj).f21602a);
    }

    public final int hashCode() {
        return this.f21602a.hashCode();
    }

    public final String toString() {
        return t0.E(new StringBuilder("MemberSignature(signature="), this.f21602a, ')');
    }
}
