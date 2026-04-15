package a9;

import android.database.sqlite.SQLiteQuery;
import c7.e1;
import m0.b1;
import m0.c1;
import m0.z8;
import ub.a0;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f250b;

    public /* synthetic */ o(int i10, Object obj) {
        this.f249a = i10;
        this.f250b = obj;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f249a) {
            case 0:
                f1.f fVar = (f1.f) this.f250b;
                q.h hVar = (q.h) obj;
                e7.j jVar = (e7.j) obj2;
                x0.o oVar = (x0.o) obj3;
                ((Integer) obj4).getClass();
                jc.l.e(hVar, "$this$composable");
                jc.l.e(jVar, "it");
                v.a(u.f264b.a(hVar), f1.g.f(785129464, new p(fVar, hVar, jVar, 0), oVar), oVar, 56);
                break;
            case 1:
                b3.c cVar = (b3.c) this.f250b;
                x2.p pVarB = ((x2.e) cVar.f1477e).b((x2.n) obj, (x2.k) obj2, ((x2.i) obj3).f24558a, ((x2.j) obj4).f24559a);
                if (!(pVarB instanceof x2.p)) {
                    e1 e1Var = new e1(pVarB, cVar.f1482j);
                    cVar.f1482j = e1Var;
                    Object obj5 = e1Var.f3620d;
                    jc.l.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                } else {
                    Object obj6 = pVarB.f24575a;
                    jc.l.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                }
                break;
            case 2:
                a8.d dVar = (a8.d) this.f250b;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                jc.l.b(sQLiteQuery);
                dVar.d(new b8.h(sQLiteQuery));
                break;
            case 3:
                r9.c cVar2 = (r9.c) this.f250b;
                ((Integer) obj4).intValue();
                jc.l.e((q.h) obj, "$this$composable");
                jc.l.e((e7.j) obj2, "it");
                cVar2.f18971h.g(cVar2, (x0.o) obj3, 0);
                break;
            default:
                String str = (String) this.f250b;
                ((Integer) obj2).getClass();
                x0.o oVar2 = (x0.o) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                jc.l.e((a0.d) obj, "$this$stickyHeader");
                if (oVar2.N(iIntValue & 1, (iIntValue & 129) != 128)) {
                    z8.b(str, androidx.compose.foundation.layout.a.j(j1.n.f9689a, 5), ((b1) oVar2.j(c1.f12773a)).f(), lc.b.C(20), null, x2.k.f24565g, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 199728, 0, 131024);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
