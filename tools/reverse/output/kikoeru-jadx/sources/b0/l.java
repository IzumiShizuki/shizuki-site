package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1287b;

    public l(int i10, int i11) {
        this.f1286a = i10;
        this.f1287b = i11;
        if (!(i10 >= 0)) {
            x.a.a("negative start index");
        }
        if (i11 >= i10) {
            return;
        }
        x.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f1286a == lVar.f1286a && this.f1287b == lVar.f1287b;
    }

    public final int hashCode() {
        return (this.f1286a * 31) + this.f1287b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f1286a);
        sb.append(", end=");
        return j2.h0.m(sb, this.f1287b, ')');
    }
}
