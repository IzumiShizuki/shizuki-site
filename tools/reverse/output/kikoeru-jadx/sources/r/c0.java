package r;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Number f18341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Number f18342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f18343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f18344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h1 f18345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f18349i;

    public c0(e0 e0Var, Number number, Number number2, v1 v1Var, b0 b0Var) {
        this.f18349i = e0Var;
        this.f18341a = number;
        this.f18342b = number2;
        this.f18343c = v1Var;
        this.f18344d = x0.v.v(number);
        this.f18345e = new h1(b0Var, v1Var, this.f18341a, this.f18342b, null);
    }

    @Override // x0.n2
    public final Object getValue() {
        return this.f18344d.getValue();
    }
}
