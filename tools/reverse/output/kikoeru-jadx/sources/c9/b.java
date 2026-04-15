package c9;

import j2.h0;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3774c;

    public b(int i10, String str, String str2) {
        l.e(str, "type");
        l.e(str2, "value");
        this.f3772a = i10;
        this.f3773b = str;
        this.f3774c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3772a == bVar.f3772a && l.a(this.f3773b, bVar.f3773b) && l.a(this.f3774c, bVar.f3774c);
    }

    public final int hashCode() {
        return this.f3774c.hashCode() + h0.e(this.f3772a * 31, 31, this.f3773b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlacklistBean(id=");
        sb.append(this.f3772a);
        sb.append(", type=");
        sb.append(this.f3773b);
        sb.append(", value=");
        return h0.n(sb, this.f3774c, ")");
    }
}
