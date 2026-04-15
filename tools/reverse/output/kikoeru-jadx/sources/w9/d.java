package w9;

import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f23454b;

    public /* synthetic */ d(w0 w0Var, int i10) {
        this.f23453a = i10;
        this.f23454b = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f23453a) {
            case 0:
                this.f23454b.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f23454b.setValue(Boolean.TRUE);
                break;
            case 2:
                this.f23454b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f23454b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f23454b.setValue(Boolean.FALSE);
                break;
            default:
                this.f23454b.setValue(Boolean.FALSE);
                break;
        }
        return a0.f21526a;
    }
}
