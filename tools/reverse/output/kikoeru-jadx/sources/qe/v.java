package qe;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18227b = vb.r.f22819a;

    public v(boolean z10) {
        this.f18226a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f18226a == vVar.f18226a && jc.l.a(this.f18227b, vVar.f18227b);
    }

    public final int hashCode() {
        return this.f18227b.hashCode() + ((this.f18226a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f18226a + ", poisoningFeatures=" + this.f18227b + ')';
    }
}
