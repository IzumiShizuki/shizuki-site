package ub;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21539d;

    static {
        new g(2, 2, 21);
    }

    public g(int i10, int i11, int i12) {
        this.f21536a = i10;
        this.f21537b = i11;
        this.f21538c = i12;
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            this.f21539d = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        jc.l.e(gVar, "other");
        return this.f21539d - gVar.f21539d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f21539d == gVar.f21539d;
    }

    public final int hashCode() {
        return this.f21539d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21536a);
        sb.append('.');
        sb.append(this.f21537b);
        sb.append('.');
        sb.append(this.f21538c);
        return sb.toString();
    }
}
