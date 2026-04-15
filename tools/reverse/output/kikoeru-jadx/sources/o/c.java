package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15926b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f15928d;

    public c(e eVar) {
        this.f15928d = eVar;
        this.f15925a = eVar.f16053c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f15927c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f15926b;
        e eVar = this.f15928d;
        return jc.l.a(key, eVar.e(i10)) && jc.l.a(entry.getValue(), eVar.h(this.f15926b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f15927c) {
            return this.f15928d.e(this.f15926b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f15927c) {
            return this.f15928d.h(this.f15926b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15926b < this.f15925a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f15927c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f15926b;
        e eVar = this.f15928d;
        Object objE = eVar.e(i10);
        Object objH = eVar.h(this.f15926b);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15926b++;
        this.f15927c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15927c) {
            throw new IllegalStateException();
        }
        this.f15928d.f(this.f15926b);
        this.f15926b--;
        this.f15925a--;
        this.f15927c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f15927c) {
            return this.f15928d.g(this.f15926b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
