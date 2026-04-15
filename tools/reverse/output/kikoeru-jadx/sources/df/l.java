package df;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterator, yb.c, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f5998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yb.c f5999d;

    public final RuntimeException a() {
        int i10 = this.f5996a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f5996a);
    }

    public final void b(Object obj, yb.c cVar) {
        this.f5997b = obj;
        this.f5996a = 3;
        this.f5999d = cVar;
        jc.l.e(cVar, "frame");
    }

    @Override // yb.c
    public final void h(Object obj) {
        ub.a.f(obj);
        this.f5996a = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f5996a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f5998c;
                jc.l.b(it);
                if (it.hasNext()) {
                    this.f5996a = 2;
                    return true;
                }
                this.f5998c = null;
            }
            this.f5996a = 5;
            yb.c cVar = this.f5999d;
            jc.l.b(cVar);
            this.f5999d = null;
            cVar.h(a0.f21526a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f5996a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f5996a = 1;
            Iterator it = this.f5998c;
            jc.l.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw a();
        }
        this.f5996a = 0;
        Object obj = this.f5997b;
        this.f5997b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // yb.c
    public final yb.h s() {
        return yb.i.f26088a;
    }
}
