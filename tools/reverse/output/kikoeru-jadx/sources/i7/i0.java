package i7;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i0 f9157g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f9158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f9162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f9163f;

    static {
        List listW = ud.b.w(q2.f9274e);
        a0 a0Var = a0.f9030c;
        a0 a0Var2 = a0.f9029b;
        f9157g = new i0(d0.f9071a, listW, 0, 0, new c0(a0Var, a0Var2, a0Var2), null);
    }

    public i0(d0 d0Var, List list, int i10, int i11, c0 c0Var, c0 c0Var2) {
        this.f9158a = d0Var;
        this.f9159b = list;
        this.f9160c = i10;
        this.f9161d = i11;
        this.f9162e = c0Var;
        this.f9163f = c0Var2;
        if (d0Var != d0.f9073c && i10 < 0) {
            throw new IllegalArgumentException(q.t0.B(i10, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
        }
        if (d0Var != d0.f9072b && i11 < 0) {
            throw new IllegalArgumentException(q.t0.B(i11, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
        }
        if (d0Var == d0.f9071a && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:18:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e5 -> B:26:0x00f0). Please report as a decompilation issue!!! */
    @Override // i7.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ic.n r17, ac.c r18) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.i0.a(ic.n, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:18:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d8 -> B:24:0x00df). Please report as a decompilation issue!!! */
    @Override // i7.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ic.n r18, yb.c r19) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.i0.b(ic.n, yb.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f9158a == i0Var.f9158a && jc.l.a(this.f9159b, i0Var.f9159b) && this.f9160c == i0Var.f9160c && this.f9161d == i0Var.f9161d && jc.l.a(this.f9162e, i0Var.f9162e) && jc.l.a(this.f9163f, i0Var.f9163f);
    }

    public final int hashCode() {
        int iHashCode = (this.f9162e.hashCode() + ((((q.t0.z(this.f9158a.hashCode() * 31, 31, this.f9159b) + this.f9160c) * 31) + this.f9161d) * 31)) * 31;
        c0 c0Var = this.f9163f;
        return iHashCode + (c0Var == null ? 0 : c0Var.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.f9159b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((q2) it.next()).f9276b.size();
        }
        int i10 = this.f9160c;
        String strValueOf = i10 != -1 ? String.valueOf(i10) : "none";
        int i11 = this.f9161d;
        String strValueOf2 = i11 != -1 ? String.valueOf(i11) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.f9158a);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        q2 q2Var = (q2) vb.m.a0(list3);
        Object objI0 = null;
        sb.append((q2Var == null || (list2 = q2Var.f9276b) == null) ? null : vb.m.a0(list2));
        sb.append("\n                    |   last item: ");
        q2 q2Var2 = (q2) vb.m.i0(list3);
        if (q2Var2 != null && (list = q2Var2.f9276b) != null) {
            objI0 = vb.m.i0(list);
        }
        sb.append(objI0);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.f9162e);
        sb.append("\n                    ");
        String string = sb.toString();
        c0 c0Var = this.f9163f;
        if (c0Var != null) {
            string = string + "|   mediatorLoadStates: " + c0Var + '\n';
        }
        return ef.o.a0(string + "|)");
    }
}
