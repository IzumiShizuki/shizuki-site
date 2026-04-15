package df;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f6005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f6006b;

    public q(r rVar) {
        this.f6006b = rVar;
        this.f6005a = rVar.f6007a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6005a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f6006b.f6008b.a(this.f6005a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
