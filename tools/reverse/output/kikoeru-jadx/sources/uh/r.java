package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f22044g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(y yVar, yb.c cVar, int i10) {
        super(1, cVar);
        this.f22042e = i10;
        this.f22044g = yVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f22042e) {
            case 0:
                return new r(this.f22044g, cVar, 0).u(ub.a0.f21526a);
            default:
                return new r(this.f22044g, cVar, 1).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f22042e) {
            case 0:
                int i10 = this.f22043f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f22043f = 1;
                    Object objA = y.a(this.f22044g, a0.f21948a, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                int i11 = this.f22043f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f22043f = 1;
                    Object objA2 = y.a(this.f22044g, a0.f21949b, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objA2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }
}
