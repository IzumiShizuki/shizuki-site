package bf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ye.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2806b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2807c;

    public /* synthetic */ i(int i10, Object obj) {
        this.f2805a = i10;
        this.f2807c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2805a) {
        }
        return this.f2806b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2805a) {
            case 0:
                if (!this.f2806b) {
                    throw new NoSuchElementException();
                }
                this.f2806b = false;
                return this.f2807c;
            case 1:
                if (!this.f2806b) {
                    throw new NoSuchElementException();
                }
                this.f2806b = false;
                return this.f2807c;
            default:
                if (!this.f2806b) {
                    throw new NoSuchElementException();
                }
                this.f2806b = false;
                return ((o) this.f2807c).f26242a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2805a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
