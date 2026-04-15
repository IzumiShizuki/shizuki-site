package hd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8445b;

    public q(Map map, String str) {
        jc.l.e(str, "className");
        this.f8444a = str;
        this.f8445b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jc.l.a(this.f8444a, qVar.f8444a) && jc.l.a(this.f8445b, qVar.f8445b);
    }

    public final int hashCode() {
        return this.f8445b.hashCode() + (this.f8444a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        Map map = this.f8445b;
        int size = map.size();
        List listW = vb.r.f22819a;
        if (size != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new ub.k(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new ub.k(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    listW = arrayList;
                } else {
                    listW = ud.b.w(new ub.k(entry.getKey(), entry.getValue()));
                }
            }
        }
        return "@" + this.f8444a + '(' + vb.m.f0(listW, null, null, null, p.f8438a, 31) + ')';
    }
}
