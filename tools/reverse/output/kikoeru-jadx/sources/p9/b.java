package p9;

import a9.r;
import ba.d0;
import ba.h0;
import bg.p0;
import f1.g;
import ic.k;
import ic.o;
import j1.n;
import java.util.List;
import jc.l;
import m0.b1;
import m0.c1;
import m0.i5;
import m0.r0;
import m0.z8;
import ub.a0;
import x0.o2;
import x0.v;
import x0.w0;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16940a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.f f16941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16943d;

    public /* synthetic */ b(p0 p0Var, String str, fg.f fVar) {
        this.f16942c = p0Var;
        this.f16943d = str;
        this.f16941b = fVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        boolean z10;
        switch (this.f16940a) {
            case 0:
                List list = (List) this.f16942c;
                k kVar = (k) this.f16943d;
                k1 k1Var = (k1) obj;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                l.e(k1Var, "$this$BottomNavigation");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.f(k1Var) ? 4 : 2;
                }
                int i10 = iIntValue;
                if (oVar.N(i10 & 1, (i10 & 19) != 18)) {
                    int i11 = 0;
                    for (Object obj4 : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            ud.b.H();
                            throw null;
                        }
                        f fVar = (f) obj4;
                        fg.f fVar2 = this.f16941b;
                        boolean z11 = ((Number) fVar2.getValue()).intValue() == i11;
                        o2 o2Var = c1.f12773a;
                        long jF = ((b1) oVar.j(o2Var)).f();
                        long jE = ((b1) oVar.j(o2Var)).e();
                        boolean zF = oVar.f(fVar2) | oVar.d(i11) | oVar.f(kVar);
                        Object objK = oVar.K();
                        if (zF || objK == x0.k.f24334a) {
                            objK = new d0(fVar2, i11, kVar, 2);
                            oVar.h0(objK);
                        }
                        r0.c(k1Var, z11, (ic.a) objK, g.f(-628257595, new f1.b(fVar2, i11, fVar), oVar), null, false, g.f(1346891042, new r(16, fVar), oVar), false, jF, jE, oVar, (i10 & 14) | 1575936);
                        i11 = i12;
                    }
                } else {
                    oVar.Q();
                }
                return a0.f21526a;
            case 1:
                p0 p0Var = (p0) this.f16942c;
                String str = (String) this.f16943d;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i5.a(((p0) this.f16941b.getValue()) == p0Var, androidx.compose.foundation.layout.a.n(n.f9689a, 0.0f, 0.0f, 5, 0.0f, 11), false, null, oVar2, 432, 56);
                    z8.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                } else {
                    oVar2.Q();
                }
                return a0.f21526a;
            default:
                fg.f fVar3 = (fg.f) this.f16942c;
                e7.a0 a0Var = (e7.a0) this.f16943d;
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objK2 = oVar3.K();
                    x0.r0 r0Var = x0.k.f24334a;
                    if (objK2 == r0Var) {
                        objK2 = v.v(Boolean.FALSE);
                        oVar3.h0(objK2);
                    }
                    w0 w0Var = (w0) objK2;
                    Object objK3 = oVar3.K();
                    if (objK3 == r0Var) {
                        objK3 = new i9.f(10);
                        oVar3.h0(objK3);
                    }
                    android.support.v4.media.session.b.g(androidx.compose.foundation.a.d(n.f9689a, null, (ic.a) objK3, 7), s9.d.f19673b, g.f(1633174399, new s9.c(this.f16941b, 0), oVar3), false, null, g.f(335491202, new aa.g(w0Var, 19), oVar3), g.f(-1528725629, new s9.c(fVar3, 1), oVar3), oVar3, 1769904, 24);
                    if (((Boolean) w0Var.getValue()).booleanValue()) {
                        oVar3.W(-897774024);
                        Object objK4 = oVar3.K();
                        if (objK4 == r0Var) {
                            objK4 = new ma.c(w0Var, 24);
                            oVar3.h0(objK4);
                        }
                        z10 = false;
                        a2.c.b((ic.a) objK4, g.f(-551254990, new h0(22, a0Var, w0Var), oVar3), null, g.f(1644968304, new aa.g(w0Var, 17), oVar3), s9.d.f19677f, s9.d.f19678g, null, 0L, 0L, null, oVar3, 224310, 964);
                        oVar3 = oVar3;
                    } else {
                        z10 = false;
                        oVar3.W(-901446749);
                    }
                    oVar3.p(z10);
                } else {
                    oVar3.Q();
                }
                return a0.f21526a;
        }
    }

    public /* synthetic */ b(fg.f fVar, fg.f fVar2, e7.a0 a0Var) {
        this.f16941b = fVar;
        this.f16942c = fVar2;
        this.f16943d = a0Var;
    }

    public /* synthetic */ b(List list, fg.f fVar, k kVar) {
        this.f16942c = list;
        this.f16941b = fVar;
        this.f16943d = kVar;
    }
}
