package m8;

import j8.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f14972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8.f f14974c;

    public m(n nVar, String str, j8.f fVar) {
        this.f14972a = nVar;
        this.f14973b = str;
        this.f14974c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return jc.l.a(this.f14972a, mVar.f14972a) && jc.l.a(this.f14973b, mVar.f14973b) && this.f14974c == mVar.f14974c;
    }

    public final int hashCode() {
        int iHashCode = this.f14972a.hashCode() * 31;
        String str = this.f14973b;
        return this.f14974c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
