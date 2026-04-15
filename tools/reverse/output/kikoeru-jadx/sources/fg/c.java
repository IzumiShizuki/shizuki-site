package fg;

import jc.l;
import x0.e0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f7088b;

    public /* synthetic */ c(w0 w0Var, int i10) {
        this.f7087a = i10;
        this.f7088b = w0Var;
    }

    @Override // x0.e0
    public final void a() {
        int i10 = this.f7087a;
        w0 w0Var = this.f7088b;
        switch (i10) {
            case 0:
                b bVar = b.f7085b;
                l.e(w0Var, "hash");
                b.f7086c.remove(w0Var);
                break;
            default:
                w0Var.setValue(Boolean.FALSE);
                break;
        }
    }
}
