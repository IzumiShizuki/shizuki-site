package i7;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9206e;

    public m1(int i10, int i11, int i12, ArrayList arrayList) {
        this.f9203b = i10;
        this.f9204c = arrayList;
        this.f9205d = i11;
        this.f9206e = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f9203b == m1Var.f9203b && this.f9204c.equals(m1Var.f9204c) && this.f9205d == m1Var.f9205d && this.f9206e == m1Var.f9206e;
    }

    public final int hashCode() {
        return this.f9204c.hashCode() + this.f9203b + this.f9205d + this.f9206e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        ArrayList arrayList = this.f9204c;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.f9203b);
        sb.append("\n                    |   first item: ");
        sb.append(vb.m.a0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(vb.m.i0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f9205d);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f9206e);
        sb.append("\n                    |)\n                    |");
        return ef.o.a0(sb.toString());
    }
}
