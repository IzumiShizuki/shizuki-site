package ha;

import ac.i;
import hf.y;
import ic.n;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f8270f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f8269e = i10;
        this.f8270f = gVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f8269e) {
            case 0:
                return new f(this.f8270f, cVar, 0);
            default:
                return new f(this.f8270f, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f8269e) {
            case 0:
                f fVar = (f) o(yVar, cVar);
                a0 a0Var = a0.f21526a;
                fVar.u(a0Var);
                return a0Var;
            default:
                f fVar2 = (f) o(yVar, cVar);
                a0 a0Var2 = a0.f21526a;
                fVar2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f8269e) {
            case 0:
                ub.a.f(obj);
                this.f8270f.f8275f.setValue(Boolean.FALSE);
                break;
            default:
                ub.a.f(obj);
                this.f8270f.f8275f.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                break;
        }
        return a0.f21526a;
    }
}
