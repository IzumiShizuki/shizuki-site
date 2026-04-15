package t8;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f20562c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh.a f20563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nh.a f20564b;

    static {
        b bVar = b.f20553q;
        f20562c = new h(bVar, bVar);
    }

    public h(nh.a aVar, nh.a aVar2) {
        this.f20563a = aVar;
        this.f20564b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f20563a, hVar.f20563a) && l.a(this.f20564b, hVar.f20564b);
    }

    public final int hashCode() {
        return this.f20564b.hashCode() + (this.f20563a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f20563a + ", height=" + this.f20564b + ')';
    }
}
