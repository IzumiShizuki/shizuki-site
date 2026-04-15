package cg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ic.k kVar, boolean z10, int i10) {
        super(0);
        this.f4054b = i10;
        this.f4056d = kVar;
        this.f4055c = z10;
    }

    @Override // ic.a
    public final Object b() {
        lf.h0 h0VarI;
        switch (this.f4054b) {
            case 0:
                ((c0) this.f4056d).a(Boolean.valueOf(!this.f4055c));
                return ub.a0.f21526a;
            case 1:
                ((b0) this.f4056d).a(Boolean.valueOf(!this.f4055c));
                return ub.a0.f21526a;
            case 2:
                ((ic.k) this.f4056d).a(Boolean.valueOf(!this.f4055c));
                return ub.a0.f21526a;
            default:
                boolean z10 = this.f4055c;
                ub.a0 a0Var = ub.a0.f21526a;
                if (z10 && (h0VarI = ((j0.c) this.f4056d).i()) != null) {
                    ((lf.o0) h0VarI).j(a0Var);
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z10, j0.c cVar) {
        super(0);
        this.f4054b = 3;
        this.f4055c = z10;
        this.f4056d = cVar;
    }
}
