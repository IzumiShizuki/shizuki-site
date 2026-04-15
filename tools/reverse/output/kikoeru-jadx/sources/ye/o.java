package ye;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.g f26242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26243b;

    public o(int i10, se.g gVar) {
        this.f26242a = gVar;
        this.f26243b = i10;
    }

    @Override // ye.a
    public final int a() {
        return 1;
    }

    @Override // ye.a
    public final Object get(int i10) {
        if (i10 == this.f26243b) {
            return this.f26242a;
        }
        return null;
    }

    @Override // ye.a
    public final void i(int i10, se.g gVar) {
        throw new IllegalStateException();
    }

    @Override // ye.a, java.lang.Iterable
    public final Iterator iterator() {
        return new bf.i(2, this);
    }
}
