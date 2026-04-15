package ya;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f25973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25975e;

    public e1(int i10, int i11, Object[] objArr) {
        this.f25973c = objArr;
        this.f25974d = i10;
        this.f25975e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ud.s.g(i10, this.f25975e);
        Object obj = this.f25973c[(i10 * 2) + this.f25974d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ya.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25975e;
    }
}
