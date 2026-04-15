package ya;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f26019d;

    public m1(Object obj) {
        obj.getClass();
        this.f26019d = obj;
    }

    @Override // ya.m0, ya.d0
    public final i0 a() {
        return i0.u(this.f26019d);
    }

    @Override // ya.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f26019d.equals(obj);
    }

    @Override // ya.m0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f26019d.hashCode();
    }

    @Override // ya.d0
    public final int i(int i10, Object[] objArr) {
        objArr[i10] = this.f26019d;
        return i10 + 1;
    }

    @Override // ya.d0
    public final boolean m() {
        return false;
    }

    @Override // ya.d0
    /* JADX INFO: renamed from: n */
    public final o1 iterator() {
        return new p0(this.f26019d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f26019d.toString() + ']';
    }
}
