package da;

import bg.a2;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e7.a0 f5704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f5705c;

    public /* synthetic */ i(a2 a2Var, e7.a0 a0Var) {
        this.f5703a = 2;
        this.f5705c = a2Var;
        this.f5704b = a0Var;
    }

    @Override // ic.a
    public final Object b() throws UnsupportedEncodingException {
        switch (this.f5703a) {
            case 0:
                a2 a2Var = this.f5705c;
                e7.a0.b(this.f5704b, "PictureScreen/" + na.w.g(a2Var.I) + "/RJ" + a2Var.f2823f);
                break;
            case 1:
                a2 a2Var2 = this.f5705c;
                e7.a0.b(this.f5704b, "PictureScreen/" + na.w.g(a2Var2.I) + "/" + na.c.l(a2Var2));
                break;
            default:
                la.d0.g(this.f5704b, this.f5705c.f2818a);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ i(e7.a0 a0Var, a2 a2Var, int i10) {
        this.f5703a = i10;
        this.f5704b = a0Var;
        this.f5705c = a2Var;
    }
}
