package w9;

import ic.k;
import jc.l;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f23452b;

    public /* synthetic */ c(w0 w0Var, int i10) {
        this.f23451a = i10;
        this.f23452b = w0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f23451a) {
            case 0:
                ta.c cVar = (ta.c) obj;
                l.e(cVar, "it");
                this.f23452b.setValue(cVar);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f23452b.setValue(bool);
                break;
            case 2:
                Float f10 = (Float) obj;
                f10.floatValue();
                this.f23452b.setValue(f10);
                break;
            default:
                Float f11 = (Float) obj;
                f11.floatValue();
                this.f23452b.setValue(f11);
                break;
        }
        return a0.f21526a;
    }
}
