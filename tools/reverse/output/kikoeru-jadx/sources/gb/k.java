package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f7482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f7483b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f7485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7486e;

    public k(n nVar, int i10) {
        this.f7486e = i10;
        this.f7485d = nVar;
        this.f7482a = nVar.f7504f.f7492d;
        this.f7484c = nVar.f7503e;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.f7482a;
        n nVar = this.f7485d;
        if (mVar == nVar.f7504f) {
            throw new NoSuchElementException();
        }
        if (nVar.f7503e != this.f7484c) {
            throw new ConcurrentModificationException();
        }
        this.f7482a = mVar.f7492d;
        this.f7483b = mVar;
        return mVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7482a != this.f7485d.f7504f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f7486e) {
            case 1:
                return b().f7494f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        m mVar = this.f7483b;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        n nVar = this.f7485d;
        nVar.c(mVar, true);
        this.f7483b = null;
        this.f7484c = nVar.f7503e;
    }
}
