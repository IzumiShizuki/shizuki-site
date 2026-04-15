package c1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f3237a = m.f3232e.f3236d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3239c;

    public final void a(int i10, int i11, Object[] objArr) {
        this.f3237a = objArr;
        this.f3238b = i10;
        this.f3239c = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3239c < this.f3238b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
