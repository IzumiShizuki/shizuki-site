package j3;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f10136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f10137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f10138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f f10139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x xVar, ic.a aVar, y yVar, f1.f fVar, int i10, int i11) {
        super(2);
        this.f10136b = xVar;
        this.f10137c = aVar;
        this.f10138d = yVar;
        this.f10139e = fVar;
        this.f10140f = i10;
        this.f10141g = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j.a(this.f10136b, this.f10137c, this.f10138d, this.f10139e, (x0.o) obj, x0.v.D(this.f10140f | 1), this.f10141g);
        return a0.f21526a;
    }
}
