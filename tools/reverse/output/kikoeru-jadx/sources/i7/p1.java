package i7;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9257d;

    public p1(ArrayList arrayList, int i10, int i11) {
        this.f9255b = arrayList;
        this.f9256c = i10;
        this.f9257d = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f9255b.equals(p1Var.f9255b) && this.f9256c == p1Var.f9256c && this.f9257d == p1Var.f9257d;
    }

    public final int hashCode() {
        return this.f9255b.hashCode() + this.f9256c + this.f9257d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        ArrayList arrayList = this.f9255b;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(vb.m.a0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(vb.m.i0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f9256c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f9257d);
        sb.append("\n                    |)\n                    |");
        return ef.o.a0(sb.toString());
    }
}
