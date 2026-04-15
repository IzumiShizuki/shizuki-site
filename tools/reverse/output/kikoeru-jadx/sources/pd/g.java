package pd;

import java.util.ArrayList;
import yc.q0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f17020b;

    public /* synthetic */ g(i iVar, int i10) {
        this.f17019a = i10;
        this.f17020b = iVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f17019a) {
            case 0:
                i iVar = this.f17020b;
                if (ie.d.f(iVar) == null) {
                    return null;
                }
                ((od.a) iVar.f17024g.f1395c).f16337w.getClass();
                return null;
            case 1:
                i iVar2 = this.f17020b;
                ed.o oVar = iVar2.f17025h;
                ArrayList<ed.c0> typeParameters = oVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(vb.n.K(typeParameters, 10));
                for (ed.c0 c0Var : typeParameters) {
                    q0 q0VarA = ((od.e) iVar2.f17027j.f1396d).a(c0Var);
                    if (q0VarA == null) {
                        throw new AssertionError("Parameter " + c0Var + " surely belongs to class " + oVar + ", so it must be resolved");
                    }
                    arrayList.add(q0VarA);
                }
                return arrayList;
            default:
                return yc.v.c(this.f17020b);
        }
    }
}
