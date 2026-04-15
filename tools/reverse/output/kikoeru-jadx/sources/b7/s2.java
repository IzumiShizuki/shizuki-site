package b7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s2 implements n3, o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3 f2066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2067c;

    public /* synthetic */ s2(q3 q3Var, int i10, int i11) {
        this.f2065a = i11;
        this.f2066b = q3Var;
        this.f2067c = i10;
    }

    @Override // b7.n3
    public void b(z3 z3Var, t1 t1Var) {
        switch (this.f2065a) {
            case 0:
                z3Var.d0(this.f2066b.E0(t1Var, z3Var, this.f2067c));
                break;
            default:
                z3Var.Y(this.f2066b.E0(t1Var, z3Var, this.f2067c));
                break;
        }
    }

    @Override // b7.o3
    public void d(z3 z3Var, t1 t1Var, List list) {
        switch (this.f2065a) {
            case 1:
                z3Var.a(this.f2066b.E0(t1Var, z3Var, this.f2067c), list);
                break;
            case 2:
                q3 q3Var = this.f2066b;
                q3Var.getClass();
                int size = list.size();
                int i10 = this.f2067c;
                if (size != 1) {
                    z3Var.Z(q3Var.E0(t1Var, z3Var, i10), q3Var.E0(t1Var, z3Var, i10 + 1), list);
                } else {
                    int iE0 = q3Var.E0(t1Var, z3Var, i10);
                    m4.i0 i0Var = (m4.i0) list.get(0);
                    z3Var.r0();
                    ((v4.v) ((androidx.lifecycle.q) z3Var.f2227a)).Z1(iE0, iE0 + 1, ya.i0.u(i0Var));
                }
                break;
            default:
                z3Var.a(this.f2066b.E0(t1Var, z3Var, this.f2067c), list);
                break;
        }
    }
}
