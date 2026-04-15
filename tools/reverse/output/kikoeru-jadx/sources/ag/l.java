package ag;

import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class l {
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f341b;

    public l(String str) {
        jc.l.e(str, "id");
        this.f340a = str;
        this.f341b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return jc.l.a(this.f340a, lVar.f340a) && this.f341b == lVar.f341b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f340a.hashCode() * 31;
        boolean z10 = this.f341b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "PlaylistBean(id=" + this.f340a + ", liked=" + this.f341b + ')';
    }

    public l(String str, boolean z10, int i10) {
        if (1 != (i10 & 1)) {
            z0.i(i10, 1, j.f339b);
            throw null;
        }
        this.f340a = str;
        if ((i10 & 2) == 0) {
            this.f341b = false;
        } else {
            this.f341b = z10;
        }
    }
}
