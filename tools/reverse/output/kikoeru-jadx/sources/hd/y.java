package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8495b;

    public y(String str, String str2) {
        jc.l.e(str, "enumClassName");
        jc.l.e(str2, "enumEntryName");
        this.f8494a = str;
        this.f8495b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return jc.l.a(this.f8494a, yVar.f8494a) && jc.l.a(this.f8495b, yVar.f8495b);
    }

    public final int hashCode() {
        return this.f8495b.hashCode() + (this.f8494a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.f8494a);
        sb.append('.');
        return q.t0.E(sb, this.f8495b, ')');
    }
}
