package j0;

import android.os.CancellationSignal;
import h0.u0;
import hf.r1;
import l0.l1;
import t2.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9608b;

    public /* synthetic */ j(int i10, Object obj) {
        this.f9607a = i10;
        this.f9608b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f9607a) {
            case 0:
                l1 l1Var = (l1) this.f9608b;
                if (l1Var != null) {
                    u0 u0Var = l1Var.f11528d;
                    if (u0Var != null) {
                        u0Var.e(k0.f20356b);
                    }
                    u0 u0Var2 = l1Var.f11528d;
                    if (u0Var2 != null) {
                        u0Var2.f(k0.f20356b);
                        break;
                    }
                }
                break;
            default:
                ((r1) this.f9608b).g(null);
                break;
        }
    }
}
