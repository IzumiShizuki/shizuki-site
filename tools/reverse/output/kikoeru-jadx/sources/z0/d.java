package z0;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ListIterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26371b;

    public d(int i10, List list) {
        this.f26370a = list;
        this.f26371b = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f26370a.add(this.f26371b, obj);
        this.f26371b++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f26371b < this.f26370a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26371b > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f26371b;
        this.f26371b = i10 + 1;
        return this.f26370a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26371b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f26371b - 1;
        this.f26371b = i10;
        return this.f26370a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26371b - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f26371b - 1;
        this.f26371b = i10;
        this.f26370a.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f26370a.set(this.f26371b, obj);
    }
}
