package q9;

import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f17987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j7.b f17988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f17989d;

    public /* synthetic */ e(hf.y yVar, j7.b bVar, w0 w0Var, int i10) {
        this.f17986a = i10;
        this.f17987b = yVar;
        this.f17988c = bVar;
        this.f17989d = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f17986a) {
            case 0:
                hf.a0.y(this.f17987b, null, null, new k(this.f17988c, this.f17989d, null, 0), 3);
                break;
            default:
                hf.a0.y(this.f17987b, null, null, new k(this.f17988c, this.f17989d, null, 1), 3);
                break;
        }
        return ub.a0.f21526a;
    }
}
