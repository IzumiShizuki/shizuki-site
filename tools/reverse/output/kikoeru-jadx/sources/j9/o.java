package j9;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f10732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10733g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(List list, ArrayList arrayList, yb.c cVar, int i10) {
        super(2, cVar);
        this.f10731e = i10;
        this.f10732f = list;
        this.f10733g = arrayList;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f10731e) {
            case 0:
                return new o(this.f10732f, this.f10733g, cVar, 0);
            default:
                return new o(this.f10732f, this.f10733g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f10731e) {
            case 0:
                o oVar = (o) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                oVar.u(a0Var);
                return a0Var;
            default:
                o oVar2 = (o) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                oVar2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f10731e) {
            case 0:
                ub.a.f(obj);
                vb.m.P(this.f10732f, this.f10733g);
                break;
            default:
                ub.a.f(obj);
                vb.m.P(this.f10732f, this.f10733g);
                break;
        }
        return ub.a0.f21526a;
    }
}
