package h7;

import e7.u;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.t;
import o.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8193a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f8195c;

    public j(k kVar) {
        this.f8195c = kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8193a + 1 < ((v0) this.f8195c.f8199d).g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8194b = true;
        v0 v0Var = (v0) this.f8195c.f8199d;
        int i10 = this.f8193a + 1;
        this.f8193a = i10;
        return (u) v0Var.h(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8194b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        v0 v0Var = (v0) this.f8195c.f8199d;
        ((u) v0Var.h(this.f8193a)).f6401c = null;
        int i10 = this.f8193a;
        Object[] objArr = v0Var.f16060c;
        Object obj = objArr[i10];
        Object obj2 = t.f16043c;
        if (obj != obj2) {
            objArr[i10] = obj2;
            v0Var.f16058a = true;
        }
        this.f8193a = i10 - 1;
        this.f8194b = false;
    }
}
