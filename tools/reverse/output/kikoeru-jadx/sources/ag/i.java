package ag;

import java.util.List;
import q.t0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class i {
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f337c;

    public i(int i10, List list, List list2, List list3) {
        if (7 != (i10 & 7)) {
            z0.i(i10, 7, g.f334b);
            throw null;
        }
        this.f335a = list;
        this.f336b = list2;
        this.f337c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jc.l.a(this.f335a, iVar.f335a) && jc.l.a(this.f336b, iVar.f336b) && jc.l.a(this.f337c, iVar.f337c);
    }

    public final int hashCode() {
        return this.f337c.hashCode() + t0.z(this.f335a.hashCode() * 31, 31, this.f336b);
    }

    public final String toString() {
        return "NewTagResult(existingWorkTags=" + this.f335a + ", newTags=" + this.f336b + ", unknownTags=" + this.f337c + ')';
    }
}
