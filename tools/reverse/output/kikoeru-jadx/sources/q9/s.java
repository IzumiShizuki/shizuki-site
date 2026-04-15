package q9;

import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f18091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f18092c;

    public /* synthetic */ s(w0 w0Var, ic.k kVar, int i10, int i11) {
        this.f18090a = i11;
        this.f18091b = w0Var;
        this.f18092c = kVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f18090a;
        x0.o oVar = (x0.o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                w.b(this.f18091b, this.f18092c, oVar, x0.v.D(1));
                break;
            case 1:
                w.a(this.f18091b, "", this.f18092c, oVar, x0.v.D(1));
                break;
            default:
                w.b(this.f18091b, this.f18092c, oVar, x0.v.D(1));
                break;
        }
        return ub.a0.f21526a;
    }
}
