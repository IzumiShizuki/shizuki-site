package i7;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends g2 implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9101e;

    static {
        new f2(vb.r.f22819a, null, null, 0, 0);
    }

    public f2(List list, Object obj, Object obj2, int i10, int i11) {
        jc.l.e(list, "data");
        this.f9097a = list;
        this.f9098b = obj;
        this.f9099c = obj2;
        this.f9100d = i10;
        this.f9101e = i11;
        if (i10 != Integer.MIN_VALUE && i10 < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i11 != Integer.MIN_VALUE && i11 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return jc.l.a(this.f9097a, f2Var.f9097a) && jc.l.a(this.f9098b, f2Var.f9098b) && jc.l.a(this.f9099c, f2Var.f9099c) && this.f9100d == f2Var.f9100d && this.f9101e == f2Var.f9101e;
    }

    public final int hashCode() {
        int iHashCode = this.f9097a.hashCode() * 31;
        Object obj = this.f9098b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f9099c;
        return ((((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9100d) * 31) + this.f9101e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9097a.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.f9097a;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(vb.m.a0(list));
        sb.append("\n                    |   last Item: ");
        sb.append(vb.m.i0(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.f9099c);
        sb.append("\n                    |   prevKey: ");
        sb.append(this.f9098b);
        sb.append("\n                    |   itemsBefore: ");
        sb.append(this.f9100d);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.f9101e);
        sb.append("\n                    |) ");
        return ef.o.a0(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(List list, Integer num, Integer num2) {
        this(list, num, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
        jc.l.e(list, "data");
    }
}
