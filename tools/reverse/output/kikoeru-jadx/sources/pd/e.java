package pd;

import b0.w1;
import i7.p2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f17008b;

    public /* synthetic */ e(f fVar, int i10) {
        this.f17007a = i10;
        this.f17008b = fVar;
    }

    @Override // ic.a
    public final Object b() throws IllegalAccessException, InvocationTargetException {
        switch (this.f17007a) {
            case 0:
                return ed.d.a(g8.a.D(g8.a.y(this.f17008b.f17013b.f6495a))).a();
            case 1:
                f fVar = this.f17008b;
                be.c cVarA = fVar.a();
                ed.e eVar = fVar.f17013b;
                w1 w1Var = fVar.f17012a;
                if (cVarA == null) {
                    return ue.l.c(ue.k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, eVar.toString());
                }
                od.a aVar = (od.a) w1Var.f1395c;
                yc.y yVar = aVar.f16329o;
                yc.e eVarB = xc.e.b(cVarA, yVar.g());
                if (eVarB == null) {
                    ed.o oVar = new ed.o(g8.a.D(g8.a.y(eVar.f6495a)));
                    p2 p2Var = aVar.f16325k;
                    p2Var.getClass();
                    p2 p2Var2 = (p2) p2Var.f9258a;
                    if (p2Var2 == null) {
                        jc.l.k("resolver");
                        throw null;
                    }
                    eVarB = p2Var2.D(oVar);
                    if (eVarB == null) {
                        eVarB = yc.v.f(yVar, new be.b(cVarA.b(), cVarA.f2744a.g()), aVar.f16318d.c().f16375l);
                    }
                }
                return eVarB.E();
            default:
                f fVar2 = this.f17008b;
                ArrayList<sd.a> arrayListB = fVar2.f17013b.b();
                ArrayList arrayList = new ArrayList();
                for (sd.a aVar2 : arrayListB) {
                    be.e eVar2 = ((ed.f) aVar2).f6497a;
                    if (eVar2 == null) {
                        eVar2 = ld.w.f12258b;
                    }
                    ge.g gVarD = fVar2.d(aVar2);
                    ub.k kVar = gVarD != null ? new ub.k(eVar2, gVarD) : null;
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                }
                return vb.w.A(arrayList);
        }
    }
}
