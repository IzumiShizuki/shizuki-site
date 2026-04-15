package t2;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20312d;

    public e(Object obj, int i10, int i11, String str) {
        this.f20309a = obj;
        this.f20310b = i10;
        this.f20311c = i11;
        this.f20312d = str;
        if (i10 <= i11) {
            return;
        }
        z2.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jc.l.a(this.f20309a, eVar.f20309a) && this.f20310b == eVar.f20310b && this.f20311c == eVar.f20311c && jc.l.a(this.f20312d, eVar.f20312d);
    }

    public final int hashCode() {
        Object obj = this.f20309a;
        return this.f20312d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f20310b) * 31) + this.f20311c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f20309a);
        sb.append(", start=");
        sb.append(this.f20310b);
        sb.append(", end=");
        sb.append(this.f20311c);
        sb.append(", tag=");
        return t0.E(sb, this.f20312d, ')');
    }

    public e(int i10, int i11, Object obj) {
        this(obj, i10, i11, "");
    }
}
