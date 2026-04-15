package ba;

import java.util.List;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends jc.m implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f2495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(List list, Object obj, Object obj2, int i10) {
        super(4);
        this.f2494b = i10;
        this.f2495c = list;
        this.f2496d = obj;
        this.f2497e = obj2;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f2494b) {
            case 0:
                a0.d dVar = (a0.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                x0.o oVar = (x0.o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                x0.w0 w0Var = (x0.w0) this.f2496d;
                if ((iIntValue2 & 6) == 0) {
                    i10 = (oVar.f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= oVar.d(iIntValue) ? 32 : 16;
                }
                if (oVar.N(i10 & 1, (i10 & 147) != 146)) {
                    String str = (String) this.f2495c.get(iIntValue);
                    oVar.W(-1827604460);
                    boolean zF = oVar.f(str) | oVar.f(w0Var);
                    Object objK = oVar.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new u(str, w0Var, (n2) this.f2497e, 0);
                        oVar.h0(objK);
                    }
                    z.a(str, null, (ic.a) objK, oVar, 0, 2);
                    oVar.p(false);
                } else {
                    oVar.Q();
                }
                break;
            default:
                a0.d dVar2 = (a0.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x0.o oVar2 = (x0.o) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                hf.y yVar = (hf.y) this.f2496d;
                z9.r rVar = (z9.r) this.f2497e;
                if ((iIntValue4 & 6) == 0) {
                    i11 = (oVar2.f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= oVar2.d(iIntValue3) ? 32 : 16;
                }
                if (oVar2.N(i11 & 1, (i11 & 147) != 146)) {
                    long jLongValue = ((Number) this.f2495c.get(iIntValue3)).longValue();
                    oVar2.W(-1432607654);
                    boolean zH = oVar2.h(yVar) | oVar2.h(rVar) | oVar2.e(jLongValue);
                    Object objK2 = oVar2.K();
                    if (zH || objK2 == x0.k.f24334a) {
                        objK2 = new z9.j(yVar, rVar, jLongValue);
                        oVar2.h0(objK2);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK2, null, false, null, f1.g.f(-1092908752, new t0.e(jLongValue, rVar, 1), oVar2), oVar2, 805306368, 510);
                    oVar2.p(false);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
