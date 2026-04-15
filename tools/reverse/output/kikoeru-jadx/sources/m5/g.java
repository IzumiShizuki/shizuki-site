package m5;

import m4.j1;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14699f;

    public g(int i10, j1 j1Var, int i11, j jVar, int i12) {
        int i13;
        super(i10, j1Var, i11);
        this.f14698e = t0.v(i12, jVar.p0) ? 1 : 0;
        m4.q qVar = this.f14726d;
        int i14 = qVar.f14551u;
        int i15 = -1;
        if (i14 != -1 && (i13 = qVar.f14552v) != -1) {
            i15 = i14 * i13;
        }
        this.f14699f = i15;
    }

    @Override // m5.n
    public final int a() {
        return this.f14698e;
    }

    @Override // m5.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14699f, ((g) obj).f14699f);
    }
}
