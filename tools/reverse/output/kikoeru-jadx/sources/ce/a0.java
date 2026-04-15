package ce;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f3894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3895c;

    public a0(b0 b0Var) {
        z zVar = new z(b0Var);
        this.f3893a = zVar;
        this.f3894b = new v(zVar.next());
        this.f3895c = b0Var.f3897b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3895c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3894b.hasNext()) {
            this.f3894b = new v(this.f3893a.next());
        }
        this.f3895c--;
        return Byte.valueOf(this.f3894b.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
