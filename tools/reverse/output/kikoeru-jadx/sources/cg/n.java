package cg;

import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f4081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k1 k1Var, long j10, long j11, int i10) {
        super(2);
        this.f4081b = k1Var;
        this.f4082c = j10;
        this.f4083d = j11;
        this.f4084e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a.a.n(this.f4081b, this.f4082c, this.f4083d, (x0.o) obj, x0.v.D(this.f4084e | 1));
        return ub.a0.f21526a;
    }
}
