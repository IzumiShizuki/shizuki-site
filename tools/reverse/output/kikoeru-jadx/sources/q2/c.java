package q2;

import i2.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j1.p implements y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ic.k f17592q;

    public c(boolean z10, boolean z11, ic.k kVar) {
        this.f17590o = z10;
        this.f17591p = z11;
        this.f17592q = kVar;
    }

    @Override // i2.y1
    public final boolean A() {
        return this.f17591p;
    }

    @Override // i2.y1
    public final void L(k kVar) {
        this.f17592q.a(kVar);
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.y1
    public final boolean k0() {
        return this.f17590o;
    }
}
