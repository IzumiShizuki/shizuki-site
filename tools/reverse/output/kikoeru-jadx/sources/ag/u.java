package ag;

import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class u {
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f358a;

    public u(int i10, boolean z10) {
        if (1 == (i10 & 1)) {
            this.f358a = z10;
        } else {
            z0.i(i10, 1, s.f357b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f358a == ((u) obj).f358a;
    }

    public final int hashCode() {
        boolean z10 = this.f358a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return "VoteResult(success=" + this.f358a + ')';
    }
}
