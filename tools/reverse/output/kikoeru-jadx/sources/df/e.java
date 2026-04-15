package df;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f5979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f5982e;

    public e(h hVar) {
        this.f5978a = 1;
        this.f5982e = hVar;
        this.f5979b = hVar.f5987a.iterator();
        this.f5980c = -1;
    }

    public void a() {
        Object next;
        h hVar = (h) this.f5982e;
        do {
            Iterator it = this.f5979b;
            if (!it.hasNext()) {
                this.f5980c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) hVar.f5989c.a(next)).booleanValue() != hVar.f5988b);
        this.f5981d = next;
        this.f5980c = 1;
    }

    public void b() {
        Iterator it = this.f5979b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((f) this.f5982e).f5985c.a(next)).booleanValue()) {
                this.f5980c = 1;
                this.f5981d = next;
                return;
            }
        }
        this.f5980c = 0;
    }

    public void c() {
        Object next;
        do {
            Iterator it = this.f5979b;
            if (!it.hasNext()) {
                this.f5980c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((f) this.f5982e).f5985c.a(next)).booleanValue());
        this.f5981d = next;
        this.f5980c = 1;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.f5981d;
        if (it2 != null && it2.hasNext()) {
            this.f5980c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f5979b;
            if (!it3.hasNext()) {
                this.f5980c = 2;
                this.f5981d = null;
                return false;
            }
            Object next = it3.next();
            i iVar = (i) this.f5982e;
            it = (Iterator) iVar.f5992c.a(iVar.f5991b.a(next));
        } while (!it.hasNext());
        this.f5981d = it;
        this.f5980c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5978a) {
            case 0:
                if (this.f5980c == -1) {
                    c();
                }
                return this.f5980c == 1 || this.f5979b.hasNext();
            case 1:
                if (this.f5980c == -1) {
                    a();
                }
                return this.f5980c == 1;
            case 2:
                int i10 = this.f5980c;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                return d();
            default:
                if (this.f5980c == -1) {
                    b();
                }
                return this.f5980c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5978a) {
            case 0:
                if (this.f5980c == -1) {
                    c();
                }
                if (this.f5980c != 1) {
                    return this.f5979b.next();
                }
                Object obj = this.f5981d;
                this.f5981d = null;
                this.f5980c = 0;
                return obj;
            case 1:
                if (this.f5980c == -1) {
                    a();
                }
                if (this.f5980c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f5981d;
                this.f5981d = null;
                this.f5980c = -1;
                return obj2;
            case 2:
                int i10 = this.f5980c;
                if (i10 == 2) {
                    throw new NoSuchElementException();
                }
                if (i10 == 0 && !d()) {
                    throw new NoSuchElementException();
                }
                this.f5980c = 0;
                Iterator it = (Iterator) this.f5981d;
                jc.l.b(it);
                return it.next();
            default:
                if (this.f5980c == -1) {
                    b();
                }
                if (this.f5980c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f5981d;
                this.f5981d = null;
                this.f5980c = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5978a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(i iVar) {
        this.f5978a = 2;
        this.f5982e = iVar;
        this.f5979b = iVar.f5990a.iterator();
    }

    public e(f fVar, byte b10) {
        this.f5978a = 3;
        this.f5982e = fVar;
        this.f5979b = fVar.f5984b.iterator();
        this.f5980c = -1;
    }

    public e(f fVar) {
        this.f5978a = 0;
        this.f5982e = fVar;
        this.f5979b = fVar.f5984b.iterator();
        this.f5980c = -1;
    }
}
