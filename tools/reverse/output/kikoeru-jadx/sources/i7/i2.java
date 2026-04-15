package i7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f9167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f9168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9169d;

    public i2(List list, Integer num, j1 j1Var, int i10) {
        this.f9166a = list;
        this.f9167b = num;
        this.f9168c = j1Var;
        this.f9169d = i10;
    }

    public final f2 a(int i10) {
        List list = this.f9166a;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((f2) it.next()).f9097a.isEmpty()) {
                int size = i10 - this.f9169d;
                int i11 = 0;
                while (i11 < ud.b.r(list) && size > ud.b.r(((f2) list.get(i11)).f9097a)) {
                    size -= ((f2) list.get(i11)).f9097a.size();
                    i11++;
                }
                return size < 0 ? (f2) vb.m.Y(list) : (f2) list.get(i11);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return jc.l.a(this.f9166a, i2Var.f9166a) && jc.l.a(this.f9167b, i2Var.f9167b) && jc.l.a(this.f9168c, i2Var.f9168c) && this.f9169d == i2Var.f9169d;
    }

    public final int hashCode() {
        int iHashCode = this.f9166a.hashCode();
        Integer num = this.f9167b;
        return this.f9168c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0) + this.f9169d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.f9166a);
        sb.append(", anchorPosition=");
        sb.append(this.f9167b);
        sb.append(", config=");
        sb.append(this.f9168c);
        sb.append(", leadingPlaceholderCount=");
        return j2.h0.m(sb, this.f9169d, ')');
    }
}
