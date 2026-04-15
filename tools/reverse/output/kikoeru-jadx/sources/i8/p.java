package i8;

import g2.f1;
import g2.g1;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f9448b;

    public /* synthetic */ p(g1 g1Var, int i10) {
        this.f9447a = i10;
        this.f9448b = g1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        f1 f1Var = (f1) obj;
        switch (this.f9447a) {
            case 0:
                f1Var.h(this.f9448b, 0, 0, 0.0f);
                break;
            default:
                f1.k(f1Var, this.f9448b, 0, 0);
                break;
        }
        return a0.f21526a;
    }
}
