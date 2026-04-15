package da;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f5791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5794e;

    public /* synthetic */ s(hf.y yVar, long j10, Object obj, Object obj2, int i10) {
        this.f5790a = i10;
        this.f5791b = yVar;
        this.f5792c = j10;
        this.f5793d = obj;
        this.f5794e = obj2;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5790a) {
            case 0:
                m0 m0Var = (m0) this.f5793d;
                ((fg.f) this.f5794e).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                hf.a0.y(this.f5791b, null, null, new m(m0Var, this.f5792c, null, 3), 3);
                m0Var.c0(false);
                break;
            case 1:
                hf.a0.y(this.f5791b, null, null, new b9.a(this.f5792c, (bg.p) this.f5793d, (b1) this.f5794e, (yb.c) null, 4), 3);
                break;
            case 2:
                hf.a0.y(this.f5791b, null, null, new b9.a(this.f5792c, (n2) this.f5793d, (x0.w0) this.f5794e, (yb.c) null, 3), 3);
                break;
            default:
                hf.a0.y(this.f5791b, null, null, new b9.a((b1) this.f5793d, this.f5792c, (x0.w0) this.f5794e, (yb.c) null, 5), 3);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ s(hf.y yVar, m0 m0Var, fg.f fVar, long j10) {
        this.f5790a = 0;
        this.f5791b = yVar;
        this.f5793d = m0Var;
        this.f5794e = fVar;
        this.f5792c = j10;
    }

    public /* synthetic */ s(hf.y yVar, b1 b1Var, long j10, x0.w0 w0Var) {
        this.f5790a = 3;
        this.f5791b = yVar;
        this.f5793d = b1Var;
        this.f5792c = j10;
        this.f5794e = w0Var;
    }
}
