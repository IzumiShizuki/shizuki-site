package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class s {
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2961b;

    public s(int i10, m mVar, List list) {
        if (3 != (i10 & 3)) {
            wf.z0.i(i10, 3, q.f2955b);
            throw null;
        }
        this.f2960a = mVar;
        this.f2961b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return jc.l.a(this.f2960a, sVar.f2960a) && jc.l.a(this.f2961b, sVar.f2961b);
    }

    public final int hashCode() {
        return this.f2961b.hashCode() + (this.f2960a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayLists(pagination=" + this.f2960a + ", playlists=" + this.f2961b + ')';
    }
}
