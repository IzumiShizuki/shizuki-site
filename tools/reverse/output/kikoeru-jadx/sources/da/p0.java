package da;

import com.cnl.kikoeru.R;
import m0.j1;
import m0.z2;
import m0.z8;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5776c;

    public /* synthetic */ p0(na.u uVar, boolean z10) {
        this.f5774a = 2;
        this.f5776c = uVar;
        this.f5775b = z10;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        t2.l0 l0VarA;
        switch (this.f5774a) {
            case 0:
                ic.a aVar = (ic.a) this.f5776c;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e((a0.d) obj, "$this$item");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    w1.f fVarM = n7.b0.m();
                    String strG = na.q.g(R.string.my_favorite);
                    boolean zF = oVar.f(aVar);
                    Object objK = oVar.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new ba.j(2, aVar);
                        oVar.h0(objK);
                    }
                    a.e(fVarM, strG, null, this.f5775b, 0, (ic.a) objK, null, oVar, 0, 84);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                String str = (String) this.f5776c;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$LongClickChip");
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z10 = this.f5775b;
                    if (z10) {
                        oVar2.W(-1295218155);
                        l0VarA = t2.l0.a((t2.l0) oVar2.j(z8.f14018a), q1.q.b(0.6f, ((q1.q) oVar2.j(j1.f13125a)).f17577a), 0L, null, new x2.i(1), null, 0L, null, null, 0L, null, null, 16773110);
                    } else {
                        oVar2.W(-180329332);
                        l0VarA = (t2.l0) oVar2.j(z8.f14018a);
                    }
                    oVar2.p(false);
                    z8.b(str.concat(z10 ? "?" : ""), null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, l0VarA, oVar2, 0, 3120, 55294);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                na.u uVar = (na.u) this.f5776c;
                ka.g gVar = (ka.g) obj;
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                jc.l.e(gVar, "it");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= oVar3.f(gVar) ? 4 : 2;
                }
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    android.support.v4.media.session.b.m(null, null, 0L, 0L, null, 0.0f, f1.g.f(730352627, new z2(uVar, this.f5775b, gVar), oVar3), oVar3, 1572864, 63);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ p0(boolean z10, Object obj, int i10) {
        this.f5774a = i10;
        this.f5775b = z10;
        this.f5776c = obj;
    }
}
