package bf;

import c1.n;
import c1.p;
import java.util.Iterator;
import java.util.Map;
import w1.f0;
import w1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2803a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f2804b;

    public h(Object[] objArr) {
        jc.l.e(objArr, "array");
        this.f2804b = jc.k.a(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2803a) {
            case 0:
                return ((jc.b) this.f2804b).hasNext();
            case 1:
                return ((c1.f) this.f2804b).f3213c;
            default:
                return this.f2804b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2803a) {
            case 0:
                return ((jc.b) this.f2804b).next();
            case 1:
                return (Map.Entry) ((c1.f) this.f2804b).next();
            default:
                return (h0) this.f2804b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2803a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                ((c1.f) this.f2804b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(c1.e eVar) {
        n[] nVarArr = new n[8];
        for (int i10 = 0; i10 < 8; i10++) {
            nVarArr[i10] = new p(this);
        }
        this.f2804b = new c1.f(eVar, nVarArr);
    }

    public h(f0 f0Var) {
        this.f2804b = f0Var.f23204j.iterator();
    }
}
