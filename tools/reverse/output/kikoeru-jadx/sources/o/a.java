package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15915e;

    public a(int i10) {
        this.f15911a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15912b < this.f15911a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15912b;
        switch (this.f15914d) {
            case 0:
                objE = ((e) this.f15915e).e(i10);
                break;
            case 1:
                objE = ((e) this.f15915e).h(i10);
                break;
            default:
                objE = ((f) this.f15915e).f15951b[i10];
                break;
        }
        this.f15912b++;
        this.f15913c = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15913c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f15912b - 1;
        this.f15912b = i10;
        switch (this.f15914d) {
            case 0:
                ((e) this.f15915e).f(i10);
                break;
            case 1:
                ((e) this.f15915e).f(i10);
                break;
            default:
                ((f) this.f15915e).a(i10);
                break;
        }
        this.f15911a--;
        this.f15913c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f15952c);
        this.f15914d = 2;
        this.f15915e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i10) {
        this(eVar.f16053c);
        this.f15914d = i10;
        switch (i10) {
            case 1:
                this.f15915e = eVar;
                this(eVar.f16053c);
                break;
            default:
                this.f15915e = eVar;
                break;
        }
    }
}
