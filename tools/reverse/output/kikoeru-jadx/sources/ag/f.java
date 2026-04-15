package ag;

import java.util.List;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class f {
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f332b;

    public f(int i10, long j10, List list) {
        if (3 != (i10 & 3)) {
            z0.i(i10, 3, d.f330b);
            throw null;
        }
        this.f331a = j10;
        this.f332b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f331a == fVar.f331a && jc.l.a(this.f332b, fVar.f332b);
    }

    public final int hashCode() {
        long j10 = this.f331a;
        return this.f332b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        return "NewTagRequest(workID=" + this.f331a + ", tagIDs=" + this.f332b + ')';
    }

    public f(long j10, List list) {
        this.f331a = j10;
        this.f332b = list;
    }
}
