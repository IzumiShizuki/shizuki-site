package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lf.f f9294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ac.i f9295i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(lf.f fVar, ic.o oVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f9291e = i10;
        switch (i10) {
            case 1:
                this.f9294h = fVar;
                this.f9295i = (ac.i) oVar;
                super(2, cVar);
                break;
            default:
                this.f9294h = fVar;
                this.f9295i = (ac.i) oVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ac.i, ic.o] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f9291e) {
            case 0:
                s sVar = new s(this.f9294h, this.f9295i, cVar, 0);
                sVar.f9293g = obj;
                return sVar;
            default:
                s sVar2 = new s(this.f9294h, this.f9295i, cVar, 1);
                sVar2.f9293g = obj;
                return sVar2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f9291e) {
            case 0:
                return ((s) o((lf.g) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((s) o((k2) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ac.i, ic.o] */
    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f9291e) {
            case 0:
                int i10 = this.f9292f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    lf.g gVar = (lf.g) this.f9293g;
                    jc.y yVar = new jc.y();
                    yVar.f10838a = u.f9325a;
                    f7.v vVar = new f7.v(yVar, (ic.o) this.f9295i, gVar);
                    this.f9292f = 1;
                    Object objB = this.f9294h.b(vVar, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objB == aVar) {
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
                int i11 = this.f9292f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    b0.x xVar = new b0.x((ic.o) this.f9295i, new e((k2) this.f9293g), (yb.c) null);
                    this.f9292f = 1;
                    Object objH = lf.p0.h(this.f9294h, xVar, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objH == aVar2) {
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
