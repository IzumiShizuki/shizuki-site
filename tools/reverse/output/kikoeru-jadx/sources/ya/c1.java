package ya;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient k0 f25958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f25959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f25960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f25961g;

    public c1(k0 k0Var, Object[] objArr, int i10, int i11) {
        this.f25958d = k0Var;
        this.f25959e = objArr;
        this.f25960f = i10;
        this.f25961g = i11;
    }

    @Override // ya.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f25958d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // ya.d0
    public final int i(int i10, Object[] objArr) {
        return a().i(i10, objArr);
    }

    @Override // ya.d0
    public final boolean m() {
        return true;
    }

    @Override // ya.d0
    /* JADX INFO: renamed from: n */
    public final o1 iterator() {
        return a().listIterator(0);
    }

    @Override // ya.m0
    public final i0 r() {
        return new b1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25961g;
    }
}
