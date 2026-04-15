package h1;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements ListIterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8103e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(i2.s sVar, int i10, int i11) {
        this(sVar, (i11 & 1) != 0 ? 0 : i10, 0, sVar.f8845a.f15971b);
        this.f8099a = 1;
    }

    public void a() {
        if (((AbstractList) ((wb.a) this.f8103e).f23464e).modCount != this.f8102d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8099a) {
            case 0:
                c();
                s sVar = (s) this.f8103e;
                sVar.add(this.f8100b + 1, obj);
                this.f8101c = -1;
                this.f8100b++;
                this.f8102d = t.f(sVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                wb.a aVar = (wb.a) this.f8103e;
                int i10 = this.f8100b;
                this.f8100b = i10 + 1;
                aVar.add(i10, obj);
                this.f8101c = -1;
                this.f8102d = ((AbstractList) aVar).modCount;
                return;
            default:
                b();
                wb.b bVar = (wb.b) this.f8103e;
                int i11 = this.f8100b;
                this.f8100b = i11 + 1;
                bVar.add(i11, obj);
                this.f8101c = -1;
                this.f8102d = ((AbstractList) bVar).modCount;
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((wb.b) this.f8103e)).modCount != this.f8102d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (t.f((s) this.f8103e) != this.f8102d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8099a) {
            case 0:
                return this.f8100b < ((s) this.f8103e).size() - 1;
            case 1:
                return this.f8100b < this.f8102d;
            case 2:
                return this.f8100b < ((wb.a) this.f8103e).f23462c;
            default:
                return this.f8100b < ((wb.b) this.f8103e).f23467b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8099a) {
            case 0:
                if (this.f8100b >= 0) {
                }
                break;
            case 1:
                if (this.f8100b > this.f8101c) {
                }
                break;
            case 2:
                if (this.f8100b > 0) {
                }
                break;
            default:
                if (this.f8100b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8099a) {
            case 0:
                c();
                int i10 = this.f8100b + 1;
                this.f8101c = i10;
                s sVar = (s) this.f8103e;
                t.a(i10, sVar.size());
                Object obj = sVar.get(i10);
                this.f8100b = i10;
                return obj;
            case 1:
                o.g0 g0Var = ((i2.s) this.f8103e).f8845a;
                int i11 = this.f8100b;
                this.f8100b = i11 + 1;
                Object objE = g0Var.e(i11);
                jc.l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (j1.p) objE;
            case 2:
                a();
                int i12 = this.f8100b;
                wb.a aVar = (wb.a) this.f8103e;
                if (i12 >= aVar.f23462c) {
                    throw new NoSuchElementException();
                }
                this.f8100b = i12 + 1;
                this.f8101c = i12;
                return aVar.f23460a[aVar.f23461b + i12];
            default:
                b();
                int i13 = this.f8100b;
                wb.b bVar = (wb.b) this.f8103e;
                if (i13 >= bVar.f23467b) {
                    throw new NoSuchElementException();
                }
                this.f8100b = i13 + 1;
                this.f8101c = i13;
                return bVar.f23466a[i13];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8099a) {
        }
        return this.f8100b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8099a) {
            case 0:
                c();
                int i10 = this.f8100b;
                s sVar = (s) this.f8103e;
                t.a(i10, sVar.size());
                int i11 = this.f8100b;
                this.f8101c = i11;
                this.f8100b--;
                return sVar.get(i11);
            case 1:
                o.g0 g0Var = ((i2.s) this.f8103e).f8845a;
                int i12 = this.f8100b - 1;
                this.f8100b = i12;
                Object objE = g0Var.e(i12);
                jc.l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (j1.p) objE;
            case 2:
                a();
                int i13 = this.f8100b;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.f8100b = i14;
                this.f8101c = i14;
                wb.a aVar = (wb.a) this.f8103e;
                return aVar.f23460a[aVar.f23461b + i14];
            default:
                b();
                int i15 = this.f8100b;
                if (i15 <= 0) {
                    throw new NoSuchElementException();
                }
                int i16 = i15 - 1;
                this.f8100b = i16;
                this.f8101c = i16;
                return ((wb.b) this.f8103e).f23466a[i16];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f8099a) {
            case 0:
                return this.f8100b;
            case 1:
                i10 = this.f8100b - this.f8101c;
                break;
            case 2:
                i10 = this.f8100b;
                break;
            default:
                i10 = this.f8100b;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8099a) {
            case 0:
                c();
                s sVar = (s) this.f8103e;
                sVar.remove(this.f8101c);
                this.f8100b--;
                this.f8101c = -1;
                this.f8102d = t.f(sVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                wb.a aVar = (wb.a) this.f8103e;
                a();
                int i10 = this.f8101c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                aVar.i(i10);
                this.f8100b = this.f8101c;
                this.f8101c = -1;
                this.f8102d = ((AbstractList) aVar).modCount;
                return;
            default:
                wb.b bVar = (wb.b) this.f8103e;
                b();
                int i11 = this.f8101c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.i(i11);
                this.f8100b = this.f8101c;
                this.f8101c = -1;
                this.f8102d = ((AbstractList) bVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8099a) {
            case 0:
                s sVar = (s) this.f8103e;
                c();
                int i10 = this.f8101c;
                if (i10 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                sVar.set(i10, obj);
                this.f8102d = t.f(sVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                int i11 = this.f8101c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((wb.a) this.f8103e).set(i11, obj);
                return;
            default:
                b();
                int i12 = this.f8101c;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((wb.b) this.f8103e).set(i12, obj);
                return;
        }
    }

    public z(wb.b bVar, int i10) {
        this.f8099a = 3;
        this.f8103e = bVar;
        this.f8100b = i10;
        this.f8101c = -1;
        this.f8102d = ((AbstractList) bVar).modCount;
    }

    public z(s sVar, int i10) {
        this.f8099a = 0;
        this.f8103e = sVar;
        this.f8100b = i10 - 1;
        this.f8101c = -1;
        this.f8102d = t.f(sVar);
    }

    public z(i2.s sVar, int i10, int i11, int i12) {
        this.f8099a = 1;
        this.f8103e = sVar;
        this.f8100b = i10;
        this.f8101c = i11;
        this.f8102d = i12;
    }

    public z(wb.a aVar, int i10) {
        this.f8099a = 2;
        this.f8103e = aVar;
        this.f8100b = i10;
        this.f8101c = -1;
        this.f8102d = ((AbstractList) aVar).modCount;
    }
}
