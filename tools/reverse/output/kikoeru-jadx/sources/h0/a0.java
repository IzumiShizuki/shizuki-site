package h0;

import j2.u2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f7570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1.r f7571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.r f7575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(u0 u0Var, o1.r rVar, boolean z10, boolean z11, l0.l1 l1Var, y2.r rVar2) {
        super(1);
        this.f7570b = u0Var;
        this.f7571c = rVar;
        this.f7572d = z10;
        this.f7573e = z11;
        this.f7574f = l1Var;
        this.f7575g = rVar2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        u2 u2Var;
        long j10 = ((p1.b) obj).f16481a;
        u0 u0Var = this.f7570b;
        if (!u0Var.b()) {
            o1.r.b(this.f7571c);
        } else if (!this.f7572d && (u2Var = u0Var.f7859c) != null) {
            ((j2.n1) u2Var).b();
        }
        if (u0Var.b() && this.f7573e) {
            if (u0Var.a() != i0.f7680b) {
                r1 r1VarD = u0Var.d();
                if (r1VarD != null) {
                    v2.e eVar = u0Var.f7860d;
                    x xVar = u0Var.f7878v;
                    int i10 = this.f7575g.i(r1VarD.b(j10, true));
                    xVar.a(y2.y.a((y2.y) eVar.f22364b, null, t2.c0.b(i10, i10), 5));
                    if (u0Var.f7857a.f7589a.f20320b.length() > 0) {
                        u0Var.f7867k.setValue(i0.f7681c);
                    }
                }
            } else {
                this.f7574f.e(new p1.b(j10));
            }
        }
        return ub.a0.f21526a;
    }
}
