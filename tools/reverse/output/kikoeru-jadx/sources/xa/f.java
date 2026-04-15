package xa;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24880a;

    public f(List list) {
        this.f24880a = list;
    }

    @Override // xa.e
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f24880a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((e) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f24880a.equals(((f) obj).f24880a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24880a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f24880a) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
