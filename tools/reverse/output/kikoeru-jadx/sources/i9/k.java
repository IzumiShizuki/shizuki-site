package i9;

import ba.h0;
import m0.z8;
import ub.a0;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9484b;

    public /* synthetic */ k(int i10, String str) {
        this.f9483a = i10;
        this.f9484b = str;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f9483a) {
            case 0:
                ka.g gVar = (ka.g) obj;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e(gVar, "it");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.f(gVar) ? 4 : 2;
                }
                if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    android.support.v4.media.session.b.m(androidx.compose.foundation.layout.a.j(j1.n.f9689a, 15), g0.g.a(5), 0L, 0L, null, 0.0f, f1.g.f(-1926805147, new h0(7, this.f9484b, gVar), oVar), oVar, 1572870, 60);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z8.b(this.f9484b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                } else {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$TextButton");
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z8.b(this.f9484b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131070);
                } else {
                    oVar3.Q();
                }
                break;
            default:
                x0.o oVar4 = (x0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                jc.l.e((y8.i) obj, "$this$prefsItem");
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    y8.e.a(this.f9484b, 0L, oVar4, 0);
                } else {
                    oVar4.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
