package ya;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient k0 f25967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient e1 f25968e;

    public d1(k0 k0Var, e1 e1Var) {
        this.f25967d = k0Var;
        this.f25968e = e1Var;
    }

    @Override // ya.m0, ya.d0
    public final i0 a() {
        return this.f25968e;
    }

    @Override // ya.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25967d.get(obj) != null;
    }

    @Override // ya.d0
    public final int i(int i10, Object[] objArr) {
        return this.f25968e.i(i10, objArr);
    }

    @Override // ya.d0
    public final boolean m() {
        return true;
    }

    @Override // ya.d0
    /* JADX INFO: renamed from: n */
    public final o1 iterator() {
        return this.f25968e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25967d.size();
    }
}
