package a0;

import u.p0;
import y.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f9c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f10d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f11e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f12f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s.f f14h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j1.f f15i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y.h f16j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ic.k f17k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f19m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j1.q qVar, g0 g0Var, d1 d1Var, p0 p0Var, boolean z10, s.f fVar, j1.f fVar2, y.h hVar, ic.k kVar, int i10, int i11) {
        super(2);
        this.f9c = qVar;
        this.f10d = g0Var;
        this.f11e = d1Var;
        this.f12f = p0Var;
        this.f13g = z10;
        this.f14h = fVar;
        this.f15i = fVar2;
        this.f16j = hVar;
        this.f17k = kVar;
        this.f18l = i10;
        this.f19m = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f8b) {
            case 0:
                ((Number) obj2).intValue();
                a.a.g(x0.v.D(this.f18l | 1), this.f19m, this.f10d, this.f17k, this.f15i, this.f9c, this.f14h, this.f12f, (x0.o) obj, this.f16j, this.f11e, this.f13g);
                break;
            default:
                ((Number) obj2).intValue();
                a2.c.h(x0.v.D(this.f18l | 1), x0.v.D(this.f19m), this.f10d, this.f17k, this.f15i, this.f9c, this.f14h, this.f12f, (x0.o) obj, this.f16j, this.f11e, this.f13g);
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j1.q qVar, g0 g0Var, d1 d1Var, y.h hVar, j1.f fVar, p0 p0Var, boolean z10, s.f fVar2, ic.k kVar, int i10, int i11) {
        super(2);
        this.f9c = qVar;
        this.f10d = g0Var;
        this.f11e = d1Var;
        this.f16j = hVar;
        this.f15i = fVar;
        this.f12f = p0Var;
        this.f13g = z10;
        this.f14h = fVar2;
        this.f17k = kVar;
        this.f18l = i10;
        this.f19m = i11;
    }
}
