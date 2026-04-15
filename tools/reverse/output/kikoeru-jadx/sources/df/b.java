package df;

import java.util.Iterator;
import vb.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5973a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f5974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5975c;

    public b(Iterator it) {
        jc.l.e(it, "iterator");
        this.f5974b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f5973a) {
            case 0:
                break;
            default:
                return this.f5974b.hasNext();
        }
        while (true) {
            int i10 = this.f5975c;
            it = this.f5974b;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f5975c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f5973a) {
            case 0:
                break;
            default:
                int i10 = this.f5975c;
                this.f5975c = i10 + 1;
                if (i10 >= 0) {
                    return new u(i10, this.f5974b.next());
                }
                ud.b.H();
                throw null;
        }
        while (true) {
            int i11 = this.f5975c;
            it = this.f5974b;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f5975c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5973a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f5974b = cVar.f5976a.iterator();
        this.f5975c = cVar.f5977b;
    }
}
