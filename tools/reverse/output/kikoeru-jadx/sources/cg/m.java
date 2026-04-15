package cg;

import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f4072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f4074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w.k f4075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f4076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f4077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4078h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k1 k1Var, long j10, float f10, w.k kVar, b0 b0Var, y yVar, int i10) {
        super(2);
        this.f4072b = k1Var;
        this.f4073c = j10;
        this.f4074d = f10;
        this.f4075e = kVar;
        this.f4076f = b0Var;
        this.f4077g = yVar;
        this.f4078h = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a.a.m(this.f4072b, this.f4073c, this.f4074d, this.f4075e, this.f4076f, this.f4077g, (x0.o) obj, x0.v.D(this.f4078h | 1));
        return ub.a0.f21526a;
    }
}
