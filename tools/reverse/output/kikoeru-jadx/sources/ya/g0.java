package ya;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends o1 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f25984c;

    public g0(i0 i0Var, int i10) {
        int size = i0Var.size();
        ud.s.i(i10, size);
        this.f25982a = size;
        this.f25983b = i10;
        this.f25984c = i0Var;
    }

    public final Object a(int i10) {
        return this.f25984c.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f25983b < this.f25982a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25983b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25983b;
        this.f25983b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25983b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25983b - 1;
        this.f25983b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25983b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
