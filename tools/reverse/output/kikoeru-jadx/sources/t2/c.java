package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20286d;

    public c(Object obj, int i10, int i11, String str) {
        this.f20283a = obj;
        this.f20284b = i10;
        this.f20285c = i11;
        this.f20286d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jc.l.a(this.f20283a, cVar.f20283a) && this.f20284b == cVar.f20284b && this.f20285c == cVar.f20285c && jc.l.a(this.f20286d, cVar.f20286d);
    }

    public final int hashCode() {
        Object obj = this.f20283a;
        return this.f20286d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f20284b) * 31) + this.f20285c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f20283a);
        sb.append(", start=");
        sb.append(this.f20284b);
        sb.append(", end=");
        sb.append(this.f20285c);
        sb.append(", tag=");
        return t0.E(sb, this.f20286d, ')');
    }

    public /* synthetic */ c(d0 d0Var, int i10, int i11, int i12) {
        this(d0Var, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, "");
    }
}
