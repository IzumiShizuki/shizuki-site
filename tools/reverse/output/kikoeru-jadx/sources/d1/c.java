package d1;

import df.j;
import ic.k;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import jc.l;
import o.i0;
import o.j0;
import o.m0;
import o.n0;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5445d;

    public c(Object obj, Map map) {
        this.f5442a = 0;
        this.f5443b = obj;
        this.f5445d = map;
    }

    public void a() {
        Object objA;
        j jVar = (j) this.f5445d;
        if (this.f5444c == -2) {
            objA = ((ic.a) jVar.f5994b).b();
        } else {
            k kVar = (k) jVar.f5995c;
            Object obj = this.f5443b;
            l.b(obj);
            objA = kVar.a(obj);
        }
        this.f5443b = objA;
        this.f5444c = objA == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5442a) {
            case 0:
                if (this.f5444c < ((Map) this.f5445d).size()) {
                }
                break;
            case 1:
                if (this.f5444c < 0) {
                    a();
                }
                if (this.f5444c == 1) {
                }
                break;
        }
        return ((df.l) this.f5443b).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5442a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f5443b;
                this.f5444c++;
                Object obj2 = ((Map) this.f5445d).get(obj);
                if (obj2 != null) {
                    this.f5443b = ((a) obj2).f5437b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                if (this.f5444c < 0) {
                    a();
                }
                if (this.f5444c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f5443b;
                l.c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f5444c = -1;
                return obj3;
            case 2:
                return ((df.l) this.f5443b).next();
            default:
                return ((df.l) this.f5443b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5442a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i10 = this.f5444c;
                if (i10 != -1) {
                    ((j0) this.f5445d).f15993b.h(i10);
                    this.f5444c = -1;
                    return;
                }
                return;
            default:
                int i11 = this.f5444c;
                if (i11 != -1) {
                    ((n0) this.f5445d).f16026b.m(i11);
                    this.f5444c = -1;
                    return;
                }
                return;
        }
    }

    public c(j jVar) {
        this.f5442a = 1;
        this.f5445d = jVar;
        this.f5444c = -2;
    }

    public c(n0 n0Var) {
        this.f5442a = 3;
        this.f5445d = n0Var;
        this.f5444c = -1;
        this.f5443b = f0.O(new m0(n0Var, this, null));
    }

    public c(j0 j0Var) {
        this.f5442a = 2;
        this.f5445d = j0Var;
        this.f5444c = -1;
        this.f5443b = f0.O(new i0(j0Var, this, null));
    }
}
