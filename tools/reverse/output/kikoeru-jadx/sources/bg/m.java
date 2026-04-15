package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g(with = k.class)
public final class m {
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2926c;

    public m(int i10, int i11, int i12) {
        this.f2924a = i10;
        this.f2925b = i11;
        this.f2926c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2924a == mVar.f2924a && this.f2925b == mVar.f2925b && this.f2926c == mVar.f2926c;
    }

    public final int hashCode() {
        return (((this.f2924a * 31) + this.f2925b) * 31) + this.f2926c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pagination(currentPage=");
        sb.append(this.f2924a);
        sb.append(", pageSize=");
        sb.append(this.f2925b);
        sb.append(", totalCount=");
        return j2.h0.m(sb, this.f2926c, ')');
    }
}
