package ya;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a1 f25946e = new a1(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f25947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25948d;

    public a1(int i10, Object[] objArr) {
        this.f25947c = objArr;
        this.f25948d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ud.s.g(i10, this.f25948d);
        Object obj = this.f25947c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ya.i0, ya.d0
    public final int i(int i10, Object[] objArr) {
        Object[] objArr2 = this.f25947c;
        int i11 = this.f25948d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // ya.d0
    public final Object[] j() {
        return this.f25947c;
    }

    @Override // ya.d0
    public final int k() {
        return this.f25948d;
    }

    @Override // ya.d0
    public final int l() {
        return 0;
    }

    @Override // ya.d0
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25948d;
    }
}
