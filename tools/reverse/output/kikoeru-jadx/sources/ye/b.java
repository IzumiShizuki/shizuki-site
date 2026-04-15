package ye;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26210c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f26211d;

    public b(c cVar) {
        this.f26211d = cVar;
    }

    public final boolean a() {
        int i10;
        Object[] objArr;
        this.f26208a = 3;
        do {
            i10 = this.f26210c + 1;
            this.f26210c = i10;
            objArr = this.f26211d.f26212a;
            if (i10 >= objArr.length) {
                break;
            }
        } while (objArr[i10] == null);
        if (i10 >= objArr.length) {
            this.f26208a = 2;
        } else {
            Object obj = objArr[i10];
            jc.l.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.f26209b = obj;
            this.f26208a = 1;
        }
        return this.f26208a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f26208a;
        if (i10 == 0) {
            return a();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f26208a;
        if (i10 == 1) {
            this.f26208a = 0;
            return this.f26209b;
        }
        if (i10 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.f26208a = 0;
        return this.f26209b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
