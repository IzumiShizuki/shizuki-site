package x0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f24254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24256c;

    public b2(a2 a2Var, int i10, int i11) {
        this.f24254a = a2Var;
        this.f24255b = i10;
        this.f24256c = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        a2 a2Var = this.f24254a;
        if (a2Var.f24243h != this.f24256c) {
            c2.f();
        }
        int i10 = this.f24255b;
        a2Var.m(i10);
        return new j0(a2Var, i10 + 1, c2.a(a2Var.f24236a, i10) + i10);
    }
}
