package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f2169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2170c;

    public /* synthetic */ w3(x3 x3Var, int i10, int i11) {
        this.f2168a = i11;
        this.f2169b = x3Var;
        this.f2170c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2168a) {
            case 0:
                z3 z3Var = this.f2169b.f2186g;
                if (z3Var.B0(25) || z3Var.B0(33)) {
                    boolean zB0 = z3Var.B0(33);
                    int i10 = this.f2170c;
                    if (!zB0) {
                        z3Var.k0(i10);
                    } else {
                        z3Var.l0(i10, 1);
                    }
                }
                break;
            default:
                z3 z3Var2 = this.f2169b.f2186g;
                if (z3Var2.B0(26) || z3Var2.B0(34)) {
                    int i11 = this.f2170c;
                    if (i11 == -100) {
                        if (!z3Var2.B0(34)) {
                            z3Var2.j0(true);
                        } else {
                            z3Var2.i0(1, true);
                        }
                    } else if (i11 == -1) {
                        if (!z3Var2.B0(34)) {
                            z3Var2.h();
                        } else {
                            z3Var2.j(1);
                        }
                    } else if (i11 == 1) {
                        if (!z3Var2.B0(34)) {
                            z3Var2.R();
                        } else {
                            z3Var2.S(1);
                        }
                    } else if (i11 == 100) {
                        if (!z3Var2.B0(34)) {
                            z3Var2.j0(false);
                        } else {
                            z3Var2.i0(1, false);
                        }
                    } else if (i11 != 101) {
                        q.t0.J(i11, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                    } else if (!z3Var2.B0(34)) {
                        z3Var2.j0(!z3Var2.U());
                    } else {
                        z3Var2.i0(1, !z3Var2.U());
                    }
                }
                break;
        }
    }
}
