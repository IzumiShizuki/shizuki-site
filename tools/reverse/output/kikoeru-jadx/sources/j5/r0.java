package j5;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f10409b;

    public r0(t0 t0Var, int i10) {
        this.f10409b = t0Var;
        this.f10408a = i10;
    }

    @Override // j5.c1
    public final boolean a() {
        t0 t0Var = this.f10409b;
        return !t0Var.G() && t0Var.f10438u[this.f10408a].x(t0Var.O);
    }

    @Override // j5.c1
    public final void b() throws IOException {
        int i10 = this.f10408a;
        t0 t0Var = this.f10409b;
        t0Var.f10438u[i10].z();
        n5.o oVar = t0Var.f10430m;
        int iU = t0Var.f10421d.u(t0Var.E);
        IOException iOException = oVar.f15374c;
        if (iOException != null) {
            throw iOException;
        }
        n5.k kVar = oVar.f15373b;
        if (kVar != null) {
            if (iU == Integer.MIN_VALUE) {
                iU = kVar.f15359a;
            }
            IOException iOException2 = kVar.f15363e;
            if (iOException2 != null && kVar.f15364f > iU) {
                throw iOException2;
            }
        }
    }

    @Override // j5.c1
    public final int j(long j10) throws Throwable {
        t0 t0Var = this.f10409b;
        if (t0Var.G()) {
            return 0;
        }
        int i10 = this.f10408a;
        t0Var.B(i10);
        b1 b1Var = t0Var.f10438u[i10];
        int iV = b1Var.v(j10, t0Var.O);
        b1Var.H(iV);
        if (iV == 0) {
            t0Var.C(i10);
        }
        return iV;
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        t0 t0Var = this.f10409b;
        if (t0Var.G()) {
            return -3;
        }
        int i11 = this.f10408a;
        t0Var.B(i11);
        int iC = t0Var.f10438u[i11].C(eVar, fVar, i10, t0Var.O);
        if (iC == -3) {
            t0Var.C(i11);
        }
        return iC;
    }
}
