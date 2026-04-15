package m0;

import com.cnl.kikoeru.R;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z2 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13988a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13991d;

    public /* synthetic */ z2(b3 b3Var, boolean z10, ic.a aVar, int i10) {
        this.f13990c = b3Var;
        this.f13989b = z10;
        this.f13991d = aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ub.a0 a0Var;
        String strB;
        ka.g gVar;
        x0.r0 r0Var;
        boolean z10;
        int i10 = this.f13988a;
        ub.a0 a0Var2 = ub.a0.f21526a;
        Object obj3 = this.f13991d;
        boolean z11 = this.f13989b;
        Object obj4 = this.f13990c;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                ((b3) obj4).a(z11, (ic.a) obj3, (x0.o) obj, x0.v.D(1));
                break;
            default:
                na.u uVar = (na.u) obj4;
                ka.g gVar2 = (ka.g) obj3;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    j1.n nVar = j1.n.f9689a;
                    float f10 = 0;
                    float f11 = 10;
                    j1.q qVarM = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.c.c(nVar, 1.0f), f10, 20, f10, f11);
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                    int iQ = x0.v.q(oVar);
                    x0.j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(qVarM, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    i2.h hVar = i2.j.f8738g;
                    x0.v.A(hVar, vVarA, oVar);
                    i2.h hVar2 = i2.j.f8737f;
                    x0.v.A(hVar2, j1VarL, oVar);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar3);
                    }
                    i2.h hVar4 = i2.j.f8735d;
                    x0.v.A(hVar4, qVarC, oVar);
                    Object objK = oVar.K();
                    x0.r0 r0Var2 = x0.k.f24334a;
                    if (objK == r0Var2) {
                        objK = Integer.valueOf(((na.f) vb.m.Y(uVar.f15757o)).f15688h);
                        oVar.h0(objK);
                    }
                    int iIntValue2 = ((Number) objK).intValue();
                    String strG = na.q.g(R.string.app_name);
                    String str = uVar.f15750h;
                    xf.r rVar = na.w.f15765a;
                    if (iIntValue2 < 0) {
                        a0Var = a0Var2;
                        strB = q.t0.B(iIntValue2, "negative! ");
                    } else {
                        a0Var = a0Var2;
                        if (iIntValue2 < 1024) {
                            strB = iIntValue2 + "B";
                        } else if (iIntValue2 < 1048576) {
                            strB = String.format("%.2fKB", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue2 / 1024)}, 1));
                        } else if (iIntValue2 < 1073741824) {
                            float f12 = iIntValue2;
                            float f13 = 1024;
                            strB = String.format("%.2fMB", Arrays.copyOf(new Object[]{Float.valueOf((f12 / f13) / f13)}, 1));
                        } else {
                            float f14 = 1024;
                            strB = String.format("%.2fGB", Arrays.copyOf(new Object[]{Float.valueOf(((iIntValue2 / f14) / f14) / f14)}, 1));
                        }
                    }
                    String str2 = strG + " " + str + "(" + strB + ")";
                    x0.o2 o2Var = e9.f12960b;
                    float f15 = 24;
                    z8.b(str2, androidx.compose.foundation.layout.a.l(nVar, f15, 0.0f, 2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar.j(o2Var)).f12882e, oVar, 48, 0, 65532);
                    z8.b(uVar.f15760r, androidx.compose.foundation.layout.a.m(nVar, f15, 16, f15, f10), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar.j(o2Var)).f12887j, oVar, 48, 0, 65532);
                    float f16 = 14;
                    j1.q qVarM2 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.c.c(nVar, 1.0f), f16, f11, f16, f10);
                    y.j1 j1VarA = y.i1.a(y.k.f25157b, j1.c.f9671j, oVar, 6);
                    int iQ2 = x0.v.q(oVar);
                    x0.j1 j1VarL2 = oVar.l();
                    j1.q qVarC2 = j1.a.c(qVarM2, oVar);
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(hVar, j1VarA, oVar);
                    x0.v.A(hVar2, j1VarL2, oVar);
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar, iQ2, hVar3);
                    }
                    x0.v.A(hVar4, qVarC2, oVar);
                    if (z11) {
                        oVar.W(1732956184);
                        gVar = gVar2;
                        boolean zF = oVar.f(gVar);
                        Object objK2 = oVar.K();
                        if (zF) {
                            r0Var = r0Var2;
                        } else {
                            r0Var = r0Var2;
                            if (objK2 == r0Var) {
                            }
                            android.support.v4.media.session.b.o((ic.a) objK2, null, false, null, na.c.f15678a, oVar, 805306368, 510);
                            z10 = false;
                        }
                        objK2 = new ka.c(gVar, 6);
                        oVar.h0(objK2);
                        android.support.v4.media.session.b.o((ic.a) objK2, null, false, null, na.c.f15678a, oVar, 805306368, 510);
                        z10 = false;
                    } else {
                        gVar = gVar2;
                        r0Var = r0Var2;
                        z10 = false;
                        oVar.W(1729023989);
                    }
                    oVar.p(z10);
                    boolean zH = oVar.h(uVar) | oVar.f(gVar);
                    Object objK3 = oVar.K();
                    if (zH || objK3 == r0Var) {
                        objK3 = new a9.d(22, uVar, gVar);
                        oVar.h0(objK3);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK3, null, false, null, na.c.f15679b, oVar, 805306368, 510);
                    oVar.p(true);
                    oVar.p(true);
                }
                break;
        }
        return a0Var2;
    }

    public /* synthetic */ z2(na.u uVar, boolean z10, ka.g gVar) {
        this.f13990c = uVar;
        this.f13989b = z10;
        this.f13991d = gVar;
    }
}
