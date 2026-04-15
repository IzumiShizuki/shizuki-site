package qa;

import jc.l;
import sa.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f18136b;

    public b(String str, s sVar) {
        this.f18135a = str;
        this.f18136b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f18135a, bVar.f18135a) && l.a(this.f18136b, bVar.f18136b);
    }

    public final int hashCode() {
        return this.f18136b.hashCode() + (this.f18135a.hashCode() * 31);
    }

    public final String toString() {
        return this.f18135a;
    }
}
