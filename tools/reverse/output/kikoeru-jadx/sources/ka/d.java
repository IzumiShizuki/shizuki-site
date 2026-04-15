package ka;

import m0.z8;
import ub.a0;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f11248b;

    public /* synthetic */ d(g gVar, int i10) {
        this.f11247a = i10;
        this.f11248b = gVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f11247a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final g gVar = this.f11248b;
                    boolean zF = oVar.f(gVar);
                    Object objK = oVar.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new c(gVar, 2);
                        oVar.h0(objK);
                    }
                    final int i10 = 1;
                    android.support.v4.media.session.b.o((ic.a) objK, null, false, null, f1.g.f(2056586054, new ic.o() { // from class: ka.e
                        @Override // ic.o
                        public final Object g(Object obj3, Object obj4, Object obj5) {
                            switch (i10) {
                                case 0:
                                    x0.o oVar2 = (x0.o) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    jc.l.e((k1) obj3, "$this$TextButton");
                                    if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        z8.b(gVar.f11261f, null, q1.q.f17572e, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 384, 0, 131066);
                                    } else {
                                        oVar2.Q();
                                    }
                                    break;
                                case 1:
                                    x0.o oVar3 = (x0.o) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    jc.l.e((k1) obj3, "$this$TextButton");
                                    if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        z8.b(gVar.f11260e, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131070);
                                    } else {
                                        oVar3.Q();
                                    }
                                    break;
                                default:
                                    x0.o oVar4 = (x0.o) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    jc.l.e((k1) obj3, "$this$TextButton");
                                    if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        z8.b(gVar.f11261f, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                                    } else {
                                        oVar4.Q();
                                    }
                                    break;
                            }
                            return a0.f21526a;
                        }
                    }, oVar), oVar, 805306368, 510);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final g gVar2 = this.f11248b;
                    if (gVar2.f11259d != null) {
                        oVar2.W(-1053034221);
                        boolean zF2 = oVar2.f(gVar2);
                        Object objK2 = oVar2.K();
                        if (zF2 || objK2 == x0.k.f24334a) {
                            objK2 = new c(gVar2, 1);
                            oVar2.h0(objK2);
                        }
                        final int i11 = 0;
                        android.support.v4.media.session.b.o((ic.a) objK2, null, false, null, f1.g.f(-183575351, new ic.o() { // from class: ka.e
                            @Override // ic.o
                            public final Object g(Object obj3, Object obj4, Object obj5) {
                                switch (i11) {
                                    case 0:
                                        x0.o oVar22 = (x0.o) obj4;
                                        int iIntValue22 = ((Integer) obj5).intValue();
                                        jc.l.e((k1) obj3, "$this$TextButton");
                                        if (oVar22.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                            z8.b(gVar2.f11261f, null, q1.q.f17572e, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar22, 384, 0, 131066);
                                        } else {
                                            oVar22.Q();
                                        }
                                        break;
                                    case 1:
                                        x0.o oVar3 = (x0.o) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        jc.l.e((k1) obj3, "$this$TextButton");
                                        if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            z8.b(gVar2.f11260e, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131070);
                                        } else {
                                            oVar3.Q();
                                        }
                                        break;
                                    default:
                                        x0.o oVar4 = (x0.o) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        jc.l.e((k1) obj3, "$this$TextButton");
                                        if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            z8.b(gVar2.f11261f, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                                        } else {
                                            oVar4.Q();
                                        }
                                        break;
                                }
                                return a0.f21526a;
                            }
                        }, oVar2), oVar2, 805306368, 510);
                    } else {
                        oVar2.W(-1057351839);
                    }
                    oVar2.p(false);
                } else {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z8.b(this.f11248b.f11256a, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131070);
                } else {
                    oVar3.Q();
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    final g gVar3 = this.f11248b;
                    if (gVar3.f11259d != null) {
                        oVar4.W(-1133302975);
                        boolean zF3 = oVar4.f(gVar3);
                        Object objK3 = oVar4.K();
                        if (zF3 || objK3 == x0.k.f24334a) {
                            objK3 = new c(gVar3, 5);
                            oVar4.h0(objK3);
                        }
                        final int i12 = 2;
                        android.support.v4.media.session.b.o((ic.a) objK3, null, false, null, f1.g.f(-888371466, new ic.o() { // from class: ka.e
                            @Override // ic.o
                            public final Object g(Object obj3, Object obj4, Object obj5) {
                                switch (i12) {
                                    case 0:
                                        x0.o oVar22 = (x0.o) obj4;
                                        int iIntValue22 = ((Integer) obj5).intValue();
                                        jc.l.e((k1) obj3, "$this$TextButton");
                                        if (oVar22.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                            z8.b(gVar3.f11261f, null, q1.q.f17572e, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar22, 384, 0, 131066);
                                        } else {
                                            oVar22.Q();
                                        }
                                        break;
                                    case 1:
                                        x0.o oVar32 = (x0.o) obj4;
                                        int iIntValue32 = ((Integer) obj5).intValue();
                                        jc.l.e((k1) obj3, "$this$TextButton");
                                        if (oVar32.N(iIntValue32 & 1, (iIntValue32 & 17) != 16)) {
                                            z8.b(gVar3.f11260e, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar32, 0, 0, 131070);
                                        } else {
                                            oVar32.Q();
                                        }
                                        break;
                                    default:
                                        x0.o oVar42 = (x0.o) obj4;
                                        int iIntValue42 = ((Integer) obj5).intValue();
                                        jc.l.e((k1) obj3, "$this$TextButton");
                                        if (oVar42.N(iIntValue42 & 1, (iIntValue42 & 17) != 16)) {
                                            z8.b(gVar3.f11261f, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar42, 0, 0, 131070);
                                        } else {
                                            oVar42.Q();
                                        }
                                        break;
                                }
                                return a0.f21526a;
                            }
                        }, oVar4), oVar4, 805306368, 510);
                    } else {
                        oVar4.W(-1134903660);
                    }
                    oVar4.p(false);
                } else {
                    oVar4.Q();
                }
                break;
            case 4:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    z8.b(this.f11248b.f11256a, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar5, 0, 0, 131070);
                } else {
                    oVar5.Q();
                }
                break;
            default:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    g gVar4 = this.f11248b;
                    gVar4.f11264i.g(gVar4, oVar6, 0);
                } else {
                    oVar6.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
