package h0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.g f7589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2.l0 f7590b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7593e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f3.c f7595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x2.d f7596h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ch.l f7598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f3.m f7599k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7591c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7592d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7594f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f7597i = vb.r.f22819a;

    public b1(t2.g gVar, t2.l0 l0Var, boolean z10, f3.c cVar, x2.d dVar, int i10) {
        this.f7589a = gVar;
        this.f7590b = l0Var;
        this.f7593e = z10;
        this.f7595g = cVar;
        this.f7596h = dVar;
    }

    public final void a(f3.m mVar) {
        ch.l lVar = this.f7598j;
        if (lVar == null || mVar != this.f7599k || lVar.c()) {
            this.f7599k = mVar;
            lVar = new ch.l(this.f7589a, t2.c0.h(this.f7590b, mVar), this.f7597i, this.f7595g, this.f7596h);
        }
        this.f7598j = lVar;
    }
}
