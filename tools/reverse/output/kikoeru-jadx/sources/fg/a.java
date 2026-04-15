package fg;

import ic.k;
import j2.h0;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg.a f7081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f7084d;

    public a(hg.a aVar, k kVar, Object obj, String str) {
        l.e(aVar, "okkv");
        l.e(str, "key");
        l.e(obj, "hash");
        this.f7081a = aVar;
        this.f7082b = str;
        this.f7083c = obj;
        this.f7084d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f7081a, aVar.f7081a) && l.a(this.f7082b, aVar.f7082b) && l.a(this.f7083c, aVar.f7083c) && l.a(this.f7084d, aVar.f7084d);
    }

    public final int hashCode() {
        return this.f7084d.hashCode() + ((this.f7083c.hashCode() + h0.e(this.f7081a.hashCode() * 31, 31, this.f7082b)) * 31);
    }

    public final String toString() {
        return "OkkvObserveBean(okkv=" + this.f7081a + ", key=" + this.f7082b + ", hash=" + this.f7083c + ", action=" + this.f7084d + ")";
    }
}
