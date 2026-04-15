package ed;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 implements sd.d {
    @Override // sd.b
    public e a(be.c cVar) {
        Object next;
        jc.l.e(cVar, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (jc.l.a(d.a(g8.a.D(g8.a.y(((e) next).f6495a))).a(), cVar)) {
                break;
            }
        }
        return (e) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && jc.l.a(b(), ((b0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
