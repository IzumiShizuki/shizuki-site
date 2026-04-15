package j9;

import ba.x0;
import bg.s0;
import hf.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, Object obj, yb.c cVar) {
        super(1, cVar);
        this.f10744e = i10;
        this.f10746g = obj;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f10744e) {
            case 0:
                return new s(0, (s0) this.f10746g, cVar).u(ub.a0.f21526a);
            default:
                return new s(1, (String) this.f10746g, cVar).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        int i10 = this.f10744e;
        yb.c cVar = null;
        Object obj2 = this.f10746g;
        zb.a aVar = zb.a.f26667a;
        switch (i10) {
            case 0:
                int i11 = this.f10745f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                pf.e eVar = l0.f8566a;
                pf.d dVar = pf.d.f17138c;
                a9.k kVar = new a9.k(7, (s0) obj2, cVar);
                this.f10745f = 1;
                Object objH = hf.a0.H(dVar, kVar, this);
                return objH == aVar ? aVar : objH;
            default:
                int i12 = this.f10745f;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                pf.e eVar2 = l0.f8566a;
                pf.d dVar2 = pf.d.f17138c;
                x0 x0Var = new x0((String) obj2, cVar, 3);
                this.f10745f = 1;
                Object objH2 = hf.a0.H(dVar2, x0Var, this);
                return objH2 == aVar ? aVar : objH2;
        }
    }
}
