package vb;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.b implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f22807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(7, dVar);
        this.f22807d = dVar;
        int iA = dVar.a();
        if (i10 < 0 || i10 > iA) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, iA, ", size: "));
        }
        this.f10815b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10815b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10815b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f10815b - 1;
        this.f10815b = i10;
        return this.f22807d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10815b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
