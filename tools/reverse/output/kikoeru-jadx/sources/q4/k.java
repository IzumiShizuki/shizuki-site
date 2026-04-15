package q4;

import r.a2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17734a;

    @Override // r.a2
    public int D() {
        return this.f17734a;
    }

    @Override // r.a2
    public int I() {
        return 0;
    }

    @Override // r.x1
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // r.x1
    public r.p g(long j10, r.p pVar, r.p pVar2, r.p pVar3) {
        return j10 < ((long) this.f17734a) * 1000000 ? pVar : pVar2;
    }

    @Override // r.x1
    public long n(r.p pVar, r.p pVar2, r.p pVar3) {
        return ((long) D()) * 1000000;
    }

    @Override // r.x1
    public r.p t(r.p pVar, r.p pVar2, r.p pVar3) {
        return pVar3;
    }

    @Override // r.x1
    public r.p H(long j10, r.p pVar, r.p pVar2, r.p pVar3) {
        return pVar3;
    }
}
