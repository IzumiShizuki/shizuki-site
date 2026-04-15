package x0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24327a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f24328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24331e;

    public j0(a2 a2Var, int i10, int i11) {
        this.f24328b = a2Var;
        this.f24329c = i11;
        this.f24330d = i10;
        this.f24331e = a2Var.f24243h;
        if (a2Var.f24242g) {
            c2.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24327a) {
            case 0:
                return this.f24330d < this.f24329c;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24327a) {
            case 0:
                a2 a2Var = this.f24328b;
                int i10 = a2Var.f24243h;
                int i11 = this.f24331e;
                if (i10 != i11) {
                    c2.f();
                }
                int i12 = this.f24330d;
                this.f24330d = c2.a(a2Var.f24236a, i12) + i12;
                return new b2(a2Var, i12, i11);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24327a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j0(a2 a2Var, int i10, k0 k0Var, v vVar) {
        this.f24328b = a2Var;
        this.f24329c = i10;
        this.f24330d = a2Var.f24243h;
    }
}
