package b0;

import i2.d2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.y f1362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(jc.y yVar, int i10) {
        super(1);
        this.f1361b = i10;
        this.f1362c = yVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f1361b;
        boolean z10 = true;
        jc.y yVar = this.f1362c;
        switch (i10) {
            case 0:
                d2 d2Var = (d2) obj;
                jc.l.c(d2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                z0 z0Var = ((a2) d2Var).f1192o;
                List listA = (List) yVar.f10838a;
                if (listA != null) {
                    listA.add(z0Var);
                } else {
                    listA = ud.b.A(z0Var);
                }
                yVar.f10838a = listA;
                break;
            case 1:
                i2.m mVar = (d2) obj;
                if (((j1.p) mVar).f9690a.f9703n) {
                    yVar.f10838a = mVar;
                    z10 = false;
                }
                break;
            case 2:
                c2.g gVar = (c2.g) obj;
                Object obj2 = yVar.f10838a;
                if (obj2 == null && gVar.f3268q) {
                    yVar.f10838a = gVar;
                } else if (obj2 != null) {
                    gVar.getClass();
                }
                break;
            default:
                yVar.f10838a = (o1.v) obj;
                break;
        }
        return Boolean.TRUE;
    }
}
