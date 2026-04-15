package ge;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.b f7525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7526b;

    public f(be.b bVar, int i10) {
        this.f7525a = bVar;
        this.f7526b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jc.l.a(this.f7525a, fVar.f7525a) && this.f7526b == fVar.f7526b;
    }

    public final int hashCode() {
        return (this.f7525a.hashCode() * 31) + this.f7526b;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f7526b;
            if (i11 >= i10) {
                break;
            }
            sb.append("kotlin/Array<");
            i11++;
        }
        sb.append(this.f7525a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
