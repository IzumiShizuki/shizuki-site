package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8369c;

    public c1(int i10, int i11, int i12) {
        this.f8367a = i10;
        this.f8368b = i11;
        this.f8369c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f8367a == c1Var.f8367a && this.f8368b == c1Var.f8368b && this.f8369c == c1Var.f8369c;
    }

    public final int hashCode() {
        return (((this.f8367a * 31) + this.f8368b) * 31) + this.f8369c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8367a);
        sb.append('.');
        sb.append(this.f8368b);
        sb.append('.');
        sb.append(this.f8369c);
        return sb.toString();
    }
}
