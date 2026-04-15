package r;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f18311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jc.u f18312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f18314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f18316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f18317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ic.k f18318l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Object obj, h1 h1Var, long j10, ic.k kVar, yb.c cVar2) {
        super(1, cVar2);
        this.f18314h = cVar;
        this.f18315i = obj;
        this.f18316j = h1Var;
        this.f18317k = j10;
        this.f18318l = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long j10 = this.f18317k;
        ic.k kVar = this.f18318l;
        return new a(this.f18314h, this.f18315i, this.f18316j, j10, kVar, (yb.c) obj).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        k kVar;
        jc.u uVar;
        h1 h1Var = this.f18316j;
        c cVar = this.f18314h;
        k kVar2 = cVar.f18333c;
        int i10 = this.f18313g;
        try {
            if (i10 == 0) {
                ub.a.f(obj);
                kVar2.f18469c = (p) cVar.f18331a.f18596a.a(this.f18315i);
                cVar.f18335e.setValue(h1Var.f18440c);
                cVar.f18334d.setValue(Boolean.TRUE);
                k kVar3 = new k(kVar2.f18467a, kVar2.f18468b.getValue(), d.k(kVar2.f18469c), kVar2.f18470d, Long.MIN_VALUE, kVar2.f18472f);
                jc.u uVar2 = new jc.u();
                long j10 = this.f18317k;
                b0.o0 o0Var = new b0.o0(cVar, kVar3, this.f18318l, uVar2, 2);
                this.f18311e = kVar3;
                this.f18312f = uVar2;
                this.f18313g = 1;
                Object objD = d.d(kVar3, h1Var, j10, o0Var, this);
                zb.a aVar = zb.a.f26667a;
                if (objD == aVar) {
                    return aVar;
                }
                kVar = kVar3;
                uVar = uVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = this.f18312f;
                kVar = this.f18311e;
                ub.a.f(obj);
            }
            g gVar = uVar.f10834a ? g.f18408a : g.f18409b;
            c.b(cVar);
            return new h(kVar, gVar);
        } catch (CancellationException e10) {
            c.b(cVar);
            throw e10;
        }
    }
}
