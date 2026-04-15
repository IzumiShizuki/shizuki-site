package ce;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends AbstractList implements RandomAccess, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f3954a;

    public m0(t tVar) {
        this.f3954a = tVar;
    }

    @Override // ce.u
    public final void c(w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // ce.u
    public final List d() {
        return Collections.unmodifiableList(this.f3954a.f3985a);
    }

    @Override // ce.u
    public final e g(int i10) {
        return this.f3954a.g(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f3954a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        l0 l0Var = new l0();
        l0Var.f3952a = this.f3954a.iterator();
        return l0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        k0 k0Var = new k0();
        k0Var.f3949a = this.f3954a.listIterator(i10);
        return k0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3954a.size();
    }

    @Override // ce.u
    public final m0 h() {
        return this;
    }
}
