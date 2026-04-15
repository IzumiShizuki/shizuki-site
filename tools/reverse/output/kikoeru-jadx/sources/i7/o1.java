package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9243d;

    public o1(int i10, int i11, int i12) {
        this.f9241b = i10;
        this.f9242c = i11;
        this.f9243d = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f9241b == o1Var.f9241b && this.f9242c == o1Var.f9242c && this.f9243d == o1Var.f9243d;
    }

    public final int hashCode() {
        return this.f9241b + this.f9242c + this.f9243d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i10 = this.f9241b;
        sb.append(i10);
        sb.append(" items (\n                    |   dropCount: ");
        sb.append(i10);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f9242c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f9243d);
        sb.append("\n                    |)\n                    |");
        return ef.o.a0(sb.toString());
    }
}
