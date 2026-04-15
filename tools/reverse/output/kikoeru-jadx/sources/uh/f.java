package uh;

import b0.o0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f21981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f21982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic.n f21983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ic.k f21984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f21985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hf.y f21986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0 f21987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ic.a f21988m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, ic.n nVar, ic.k kVar, w0 w0Var, hf.y yVar, w0 w0Var2, ic.a aVar, yb.c cVar) {
        super(2, cVar);
        this.f21982g = z10;
        this.f21983h = nVar;
        this.f21984i = kVar;
        this.f21985j = w0Var;
        this.f21986k = yVar;
        this.f21987l = w0Var2;
        this.f21988m = aVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        f fVar = new f(this.f21982g, this.f21983h, this.f21984i, this.f21985j, this.f21986k, this.f21987l, this.f21988m, cVar);
        fVar.f21981f = obj;
        return fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((f) o((c2.x) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f21980e;
        if (i10 == 0) {
            ub.a.f(obj);
            c2.x xVar = (c2.x) this.f21981f;
            if (this.f21982g) {
                ic.k kVar = this.f21984i;
                w0 w0Var = this.f21985j;
                hf.y yVar = this.f21986k;
                w0 w0Var2 = this.f21987l;
                o0 o0Var = new o0(kVar, w0Var, yVar, w0Var2, 7);
                ic.a aVar = this.f21988m;
                e eVar = new e(aVar, w0Var2, yVar, w0Var, 0);
                e eVar2 = new e(aVar, w0Var2, yVar, w0Var, 1);
                this.f21980e = 1;
                Object objF = u.e0.f(xVar, o0Var, eVar, eVar2, this.f21983h, this);
                zb.a aVar2 = zb.a.f26667a;
                if (objF == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return ub.a0.f21526a;
    }
}
