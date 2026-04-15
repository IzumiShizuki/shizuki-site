package zc;

import java.util.Iterator;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {
    @Override // zc.h
    public final b e(be.c cVar) {
        jc.l.e(cVar, "fqName");
        return null;
    }

    @Override // zc.h
    public final /* bridge */ boolean f(be.c cVar) {
        return ua.j.m(this, cVar);
    }

    @Override // zc.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return q.f22818a;
    }

    public final String toString() {
        return "EMPTY";
    }
}
