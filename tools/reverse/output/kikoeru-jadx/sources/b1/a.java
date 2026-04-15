package b1;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1420b;

    public a(int i10, int i11) {
        this.f1419a = i10;
        this.f1420b = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1419a < this.f1420b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1419a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1419a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1419a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
