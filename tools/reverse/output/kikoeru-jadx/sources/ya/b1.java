package ya;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f25950c;

    public b1(c1 c1Var) {
        this.f25950c = c1Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c1 c1Var = this.f25950c;
        ud.s.g(i10, c1Var.f25961g);
        Object[] objArr = c1Var.f25959e;
        int i11 = i10 * 2;
        int i12 = c1Var.f25960f;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // ya.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25950c.f25961g;
    }
}
