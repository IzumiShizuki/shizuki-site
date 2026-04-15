package ug;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f21806c = new j(vb.m.K0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f21807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.b f21808b;

    public j(Set set, android.support.v4.media.session.b bVar) {
        this.f21807a = set;
        this.f21808b = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jc.l.a(jVar.f21807a, this.f21807a) && jc.l.a(jVar.f21808b, this.f21808b);
    }

    public final int hashCode() {
        int iHashCode = (this.f21807a.hashCode() + 1517) * 41;
        android.support.v4.media.session.b bVar = this.f21808b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
