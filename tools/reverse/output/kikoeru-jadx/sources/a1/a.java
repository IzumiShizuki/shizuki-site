package a1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends vb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1.c f167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f169c;

    public a(b1.c cVar, int i10, int i11) {
        this.f167a = cVar;
        this.f168b = i10;
        g8.a.p(i10, i11, cVar.a());
        this.f169c = i11 - i10;
    }

    @Override // vb.a
    public final int a() {
        return this.f169c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g8.a.n(i10, this.f169c);
        return this.f167a.get(this.f168b + i10);
    }

    @Override // vb.d, java.util.List
    public final List subList(int i10, int i11) {
        g8.a.p(i10, i11, this.f169c);
        int i12 = this.f168b;
        return new a(this.f167a, i10 + i12, i12 + i11);
    }
}
