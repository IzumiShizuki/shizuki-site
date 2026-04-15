package v0;

import g2.f1;
import g2.g1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g1 g1Var, int i10, int i11, g1 g1Var2, int i12, int i13) {
        super(1);
        this.f22229b = g1Var;
        this.f22230c = i10;
        this.f22231d = i11;
        this.f22232e = g1Var2;
        this.f22233f = i12;
        this.f22234g = i13;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        f1 f1Var = (f1) obj;
        f1.k(f1Var, this.f22229b, this.f22230c, this.f22231d);
        f1.k(f1Var, this.f22232e, this.f22233f, this.f22234g);
        return ub.a0.f21526a;
    }
}
