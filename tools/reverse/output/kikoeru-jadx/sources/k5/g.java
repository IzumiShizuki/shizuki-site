package k5;

import j5.b1;
import j5.c1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f11064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f11065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f11068e;

    public g(i iVar, i iVar2, b1 b1Var, int i10) {
        this.f11068e = iVar;
        this.f11064a = iVar2;
        this.f11065b = b1Var;
        this.f11066c = i10;
    }

    @Override // j5.c1
    public final boolean a() {
        i iVar = this.f11068e;
        return !iVar.z() && this.f11065b.x(iVar.f11093y);
    }

    public final void c() {
        if (this.f11067d) {
            return;
        }
        i iVar = this.f11068e;
        ah.j jVar = iVar.f11075g;
        int[] iArr = iVar.f11070b;
        int i10 = this.f11066c;
        jVar.j(iArr[i10], iVar.f11071c[i10], 0, null, iVar.f11088t);
        this.f11067d = true;
    }

    @Override // j5.c1
    public final int j(long j10) throws Throwable {
        i iVar = this.f11068e;
        if (iVar.z()) {
            return 0;
        }
        boolean z10 = iVar.f11093y;
        b1 b1Var = this.f11065b;
        int iV = b1Var.v(j10, z10);
        a aVar = iVar.f11090v;
        if (aVar != null) {
            iV = Math.min(iV, aVar.c(this.f11066c + 1) - b1Var.t());
        }
        b1Var.H(iV);
        if (iV > 0) {
            c();
        }
        return iV;
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        i iVar = this.f11068e;
        if (iVar.z()) {
            return -3;
        }
        a aVar = iVar.f11090v;
        b1 b1Var = this.f11065b;
        if (aVar != null && aVar.c(this.f11066c + 1) <= b1Var.t()) {
            return -3;
        }
        c();
        return b1Var.C(eVar, fVar, i10, iVar.f11093y);
    }

    @Override // j5.c1
    public final void b() {
    }
}
