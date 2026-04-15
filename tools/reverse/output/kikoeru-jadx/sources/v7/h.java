package v7;

import ef.o;
import ef.u;
import java.util.ArrayList;
import java.util.List;
import jc.l;
import q.t0;
import ub.a0;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f22783d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public h(String str, boolean z10, List list, List list2) {
        l.e(str, "name");
        this.f22780a = str;
        this.f22781b = z10;
        this.f22782c = list;
        this.f22783d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add("ASC");
            }
        }
        this.f22783d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str = hVar.f22780a;
            if (this.f22781b == hVar.f22781b && this.f22782c.equals(hVar.f22782c) && l.a(this.f22783d, hVar.f22783d)) {
                String str2 = this.f22780a;
                return u.k0(str2, "index_", false) ? u.k0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22780a;
        return this.f22783d.hashCode() + t0.z((((u.k0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f22781b ? 1 : 0)) * 31, 31, this.f22782c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f22780a);
        sb.append("',\n            |   unique = '");
        sb.append(this.f22781b);
        sb.append("',\n            |   columns = {");
        o.Y(m.f0(this.f22782c, ",", null, null, null, 62));
        o.Y("},");
        a0 a0Var = a0.f21526a;
        sb.append(a0Var);
        sb.append("\n            |   orders = {");
        o.Y(m.f0(this.f22783d, ",", null, null, null, 62));
        o.Y(" }");
        sb.append(a0Var);
        sb.append("\n            |}\n        ");
        return o.Y(o.a0(sb.toString()));
    }
}
