package zg;

import java.util.List;
import x0.d2;
import y0.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26822d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f26819a = i10;
        this.f26820b = obj;
        this.f26821c = obj2;
        this.f26822d = obj3;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f26819a) {
            case 0:
                ug.j jVar = (ug.j) this.f26820b;
                ug.q qVar = (ug.q) this.f26821c;
                ug.a aVar = (ug.a) this.f26822d;
                android.support.v4.media.session.b bVar = jVar.f21808b;
                jc.l.b(bVar);
                return bVar.A(aVar.f21716h.f21872d, qVar.a());
            default:
                x0.a aVar2 = (x0.a) this.f26820b;
                d2 d2Var = (d2) this.f26821c;
                j0 j0Var = (j0) this.f26822d;
                if (aVar2 != null) {
                    d2Var.a(d2Var.c(aVar2) - d2Var.f24284t);
                }
                List listL = lc.b.l(d2Var, null, d2Var.f24284t, null);
                i1.b bVar2 = (i1.b) vb.m.i0(listL);
                Integer num = bVar2 != null ? bVar2.f8637a : null;
                List listH = j0Var.h(num);
                if (num != null && !listH.isEmpty()) {
                    i1.b bVar3 = (i1.b) vb.m.Y(listH);
                    List listV = vb.m.V(listH, 1);
                    bVar3.getClass();
                    listH = vb.m.q0(ud.b.w(new i1.b(null, num)), listV);
                }
                return vb.m.q0(listL, listH);
        }
    }
}
