package s8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import vb.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, kc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f19656b = new n(s.f22820a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19657a;

    public n(Map map) {
        this.f19657a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return jc.l.a(this.f19657a, ((n) obj).f19657a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19657a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f19657a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new ub.k(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f19657a + ')';
    }
}
