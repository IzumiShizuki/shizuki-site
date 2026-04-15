package l0;

import j2.z2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f11430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.q f11433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f11434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z2 z2Var, long j10, boolean z10, j1.q qVar, o oVar) {
        super(2);
        this.f11430b = z2Var;
        this.f11431c = j10;
        this.f11432d = z10;
        this.f11433e = qVar;
        this.f11434f = oVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            x0.v.a(j2.l1.f9877s.a(this.f11430b), f1.g.f(1260045569, new b(this.f11431c, this.f11432d, this.f11433e, this.f11434f), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
