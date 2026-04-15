package vb;

import h1.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22824a;

    public x(ArrayList arrayList) {
        this.f22824a = arrayList;
    }

    @Override // vb.f
    public final int a() {
        return this.f22824a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f22824a.add(m.O(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f22824a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f22824a.get(m.N(i10, this));
    }

    @Override // vb.f
    public final Object i(int i10) {
        return this.f22824a.remove(m.N(i10, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new h0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new h0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f22824a.set(m.N(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new h0(this, i10);
    }
}
