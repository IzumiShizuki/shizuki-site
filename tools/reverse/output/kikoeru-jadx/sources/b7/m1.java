package b7;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1963a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1967e;

    public /* synthetic */ m1(n nVar, u1 u1Var, boolean z10, t1 t1Var) {
        this.f1965c = nVar;
        this.f1966d = u1Var;
        this.f1964b = z10;
        this.f1967e = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1963a) {
            case 0:
                ((p1) this.f1965c).d((v1) this.f1966d, (m) this.f1967e, this.f1964b);
                break;
            default:
                n nVar = (n) this.f1965c;
                u1 u1Var = (u1) this.f1966d;
                t1 t1Var = (t1) this.f1967e;
                c2 c2Var = ((o2) nVar.f1986d).f2008g;
                z3 z3Var = c2Var.f1693t;
                s3.i(z3Var, u1Var);
                int i10 = z3Var.i();
                if (i10 == 1) {
                    if (z3Var.B0(2)) {
                        z3Var.c();
                    }
                } else if (i10 == 4 && z3Var.B0(4)) {
                    z3Var.v();
                }
                boolean z10 = this.f1964b;
                if (z10 && z3Var.B0(1)) {
                    z3Var.k();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i11 : new int[]{31, 2}) {
                    p4.c.i(!false);
                    sparseBooleanArray.append(i11, true);
                }
                if (z10) {
                    p4.c.i(!false);
                    sparseBooleanArray.append(1, true);
                }
                p4.c.i(!false);
                c2Var.o(t1Var);
                break;
        }
    }

    public /* synthetic */ m1(p1 p1Var, v1 v1Var, m mVar, boolean z10) {
        this.f1965c = p1Var;
        this.f1966d = v1Var;
        this.f1967e = mVar;
        this.f1964b = z10;
    }
}
