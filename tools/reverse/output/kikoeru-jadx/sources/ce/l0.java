package ce;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f3952a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3952a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f3952a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
