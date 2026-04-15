package b7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r2 implements n3, o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q3 f2057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2059c;

    public /* synthetic */ r2(q3 q3Var, int i10, int i11) {
        this.f2057a = q3Var;
        this.f2058b = i10;
        this.f2059c = i11;
    }

    @Override // b7.n3
    public void b(z3 z3Var, t1 t1Var) {
        q3 q3Var = this.f2057a;
        int iE0 = q3Var.E0(t1Var, z3Var, this.f2058b);
        int iE02 = q3Var.E0(t1Var, z3Var, this.f2059c);
        z3Var.r0();
        ((v4.v) z3Var.f2227a).V1(iE0, iE02);
    }

    @Override // b7.o3
    public void d(z3 z3Var, t1 t1Var, List list) {
        q3 q3Var = this.f2057a;
        z3Var.Z(q3Var.E0(t1Var, z3Var, this.f2058b), q3Var.E0(t1Var, z3Var, this.f2059c), list);
    }
}
