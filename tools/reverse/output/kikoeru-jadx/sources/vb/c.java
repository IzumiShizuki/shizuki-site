package vb;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22810c;

    public c(d dVar, int i10, int i11) {
        this.f22808a = dVar;
        this.f22809b = i10;
        ua.j.g(i10, i11, dVar.a());
        this.f22810c = i11 - i10;
    }

    @Override // vb.a
    public final int a() {
        return this.f22810c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f22810c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        return this.f22808a.get(this.f22809b + i10);
    }

    @Override // vb.d, java.util.List
    public final List subList(int i10, int i11) {
        ua.j.g(i10, i11, this.f22810c);
        int i12 = this.f22809b;
        return new c(this.f22808a, i10 + i12, i12 + i11);
    }
}
