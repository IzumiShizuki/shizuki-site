package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9223e;

    public n1(int i10, int i11, int i12, int i13) {
        this.f9220b = i10;
        this.f9221c = i11;
        this.f9222d = i12;
        this.f9223e = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f9220b == n1Var.f9220b && this.f9221c == n1Var.f9221c && this.f9222d == n1Var.f9222d && this.f9223e == n1Var.f9223e;
    }

    public final int hashCode() {
        return this.f9220b + this.f9221c + this.f9222d + this.f9223e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i10 = this.f9221c;
        sb.append(i10);
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.f9220b);
        sb.append("\n                    |   dropCount: ");
        sb.append(i10);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f9222d);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f9223e);
        sb.append("\n                    |)\n                    |");
        return ef.o.a0(sb.toString());
    }
}
