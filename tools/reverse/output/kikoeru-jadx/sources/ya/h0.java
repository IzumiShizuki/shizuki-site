package ya;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f25992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f25994e;

    public h0(i0 i0Var, int i10, int i11) {
        this.f25994e = i0Var;
        this.f25992c = i10;
        this.f25993d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ud.s.g(i10, this.f25993d);
        return this.f25994e.get(i10 + this.f25992c);
    }

    @Override // ya.i0, ya.d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // ya.d0
    public final Object[] j() {
        return this.f25994e.j();
    }

    @Override // ya.d0
    public final int k() {
        return this.f25994e.l() + this.f25992c + this.f25993d;
    }

    @Override // ya.d0
    public final int l() {
        return this.f25994e.l() + this.f25992c;
    }

    @Override // ya.i0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ya.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25993d;
    }

    @Override // ya.i0, java.util.List
    /* JADX INFO: renamed from: x */
    public final i0 subList(int i10, int i11) {
        ud.s.j(i10, i11, this.f25993d);
        int i12 = this.f25992c;
        return this.f25994e.subList(i10 + i12, i11 + i12);
    }

    @Override // ya.i0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
