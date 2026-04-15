package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f1356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a0 a0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f1354e = i10;
        this.f1356g = a0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f1354e) {
            case 0:
                return new u(this.f1356g, cVar, 0);
            case 1:
                return new u(this.f1356g, cVar, 1);
            case 2:
                return new u(this.f1356g, cVar, 2);
            case 3:
                return new u(this.f1356g, cVar, 3);
            default:
                return new u(this.f1356g, cVar, 4);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f1354e) {
        }
        return ((u) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f1354e;
        ub.a0 a0Var = ub.a0.f21526a;
        a0 a0Var2 = this.f1356g;
        zb.a aVar = zb.a.f26667a;
        switch (i10) {
            case 0:
                int i11 = this.f1355f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                r.c cVar = a0Var2.f1187p;
                Float f10 = new Float(1.0f);
                this.f1355f = 1;
                return cVar.f(f10, this) == aVar ? aVar : a0Var;
            case 1:
                int i12 = this.f1355f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    r.c cVar2 = a0Var2.f1186o;
                    f3.j jVar = new f3.j(0L);
                    this.f1355f = 1;
                    if (cVar2.f(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                int i13 = a0.f1171t;
                a0Var2.g(0L);
                a0Var2.f(false);
                return a0Var;
            case 2:
                int i14 = this.f1355f;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                r.c cVar3 = a0Var2.f1186o;
                this.f1355f = 1;
                return cVar3.g(this) == aVar ? aVar : a0Var;
            case 3:
                int i15 = this.f1355f;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                r.c cVar4 = a0Var2.f1187p;
                this.f1355f = 1;
                return cVar4.g(this) == aVar ? aVar : a0Var;
            default:
                int i16 = this.f1355f;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                r.c cVar5 = a0Var2.f1187p;
                this.f1355f = 1;
                return cVar5.g(this) == aVar ? aVar : a0Var;
        }
    }
}
