package bf;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f2800c;

    public f(g gVar) {
        this.f2800c = gVar;
        this.f2799b = ((AbstractList) gVar).modCount;
    }

    public final void a() {
        g gVar = this.f2800c;
        int i10 = ((AbstractList) gVar).modCount;
        int i11 = this.f2799b;
        if (i10 == i11) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) gVar).modCount + "; expected: " + i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f2798a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2798a) {
            throw new NoSuchElementException();
        }
        this.f2798a = true;
        a();
        return this.f2800c.f2802b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f2800c.clear();
    }
}
