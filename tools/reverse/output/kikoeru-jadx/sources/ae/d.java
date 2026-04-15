package ae;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(2);
        l.e(str, "name");
        l.e(str2, "desc");
        this.f316e = str;
        this.f317f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f316e, dVar.f316e) && l.a(this.f317f, dVar.f317f);
    }

    public final int hashCode() {
        return this.f317f.hashCode() + (this.f316e.hashCode() * 31);
    }

    @Override // android.support.v4.media.session.b
    public final String u() {
        return this.f316e + ':' + this.f317f;
    }
}
