package w9;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.h;
import i2.i;
import i2.j;
import ic.k;
import ic.n;
import j1.q;
import j2.h0;
import jc.l;
import q.t0;
import r.y1;
import sa.g;
import sa.m;
import sa.p;
import sa.s;
import ub.a0;
import x0.j1;
import x0.o;
import x0.r0;
import x0.v;
import x0.w0;
import y.i1;
import y.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f23449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f23450d;

    public /* synthetic */ b(long j10, w0 w0Var, k kVar) {
        this.f23447a = 1;
        this.f23448b = j10;
        this.f23449c = w0Var;
        this.f23450d = kVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        h hVar;
        h hVar2;
        a0 a0Var;
        r0 r0Var;
        char c3;
        int i10;
        int i11;
        float f10;
        g gVar;
        g gVar2;
        int i12 = this.f23447a;
        a0 a0Var2 = a0.f21526a;
        switch (i12) {
            case 0:
                ((Integer) obj2).getClass();
                e.a(this.f23449c, this.f23448b, this.f23450d, (o) obj, v.D(391));
                break;
            case 1:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    y.v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                    int iQ = v.q(oVar);
                    j1 j1VarL = oVar.l();
                    j1.n nVar = j1.n.f9689a;
                    q qVarC = j1.a.c(nVar, oVar);
                    i2.k.f8771g0.getClass();
                    i iVar = j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    h hVar3 = j.f8738g;
                    v.A(hVar3, vVarA, oVar);
                    h hVar4 = j.f8737f;
                    v.A(hVar4, j1VarL, oVar);
                    h hVar5 = j.f8741j;
                    if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar, iQ, hVar5);
                    }
                    h hVar6 = j.f8735d;
                    v.A(hVar6, qVarC, oVar);
                    Object objK = oVar.K();
                    r0 r0Var2 = x0.k.f24334a;
                    if (objK == r0Var2) {
                        int i13 = ta.c.f20596e;
                        y1 y1Var = g.f19696f;
                        r0Var = r0Var2;
                        long j10 = this.f23448b;
                        float fH = q1.q.h(j10);
                        float fG = q1.q.g(j10);
                        float fE = q1.q.e(j10);
                        float fD = q1.q.d(j10);
                        sa.o oVar2 = (sa.o) y1Var.f18634b;
                        oVar2.getClass();
                        g gVar3 = new g(fH, fG, fE, fD, oVar2);
                        sa.o oVar3 = sa.o.f19726a;
                        sa.i iVar2 = sa.o.f19728c;
                        if (l.a(oVar2, oVar3)) {
                            hVar2 = hVar6;
                            a0Var = a0Var2;
                            gVar = gVar3;
                            f10 = fD;
                        } else {
                            if (l.a(oVar2, oVar3)) {
                                c3 = 4;
                                if (oVar3.equals(m.f19715b)) {
                                    gVar2 = new g(iVar2.a(fH), iVar2.a(fG), iVar2.a(fE), fD, oVar3);
                                }
                                hVar2 = hVar6;
                                a0Var = a0Var2;
                                gVar = gVar2;
                                f10 = fD;
                            } else {
                                c3 = 4;
                            }
                            if (l.a(oVar2, m.f19715b) && oVar3.equals(oVar3)) {
                                gVar2 = new g(iVar2.b(fH), iVar2.b(fG), iVar2.b(fE), fD, oVar3);
                                hVar2 = hVar6;
                                a0Var = a0Var2;
                                gVar = gVar2;
                                f10 = fD;
                            } else {
                                sa.j jVarG = oVar2.G();
                                a0Var = a0Var2;
                                float[] fArrF = oVar2.f();
                                l.e(fArrF, "rowMajor");
                                float fA = jVarG.a(fH);
                                float fA2 = jVarG.a(fG);
                                float fA3 = jVarG.a(fE);
                                float fW = t0.w(fArrF, 2, 0, fA3, t0.w(fArrF, 1, 0, fA2, nh.a.i(0, 0, fArrF) * fA));
                                float fW2 = t0.w(fArrF, 2, 1, fA3, t0.w(fArrF, 1, 1, fA2, nh.a.i(0, 1, fArrF) * fA));
                                float fW3 = t0.w(fArrF, 2, 2, fA3, t0.w(fArrF, 1, 2, fA2, nh.a.i(0, 2, fArrF) * fA));
                                sa.q qVarC2 = nh.b.c(oVar2.z());
                                qVarC2.getClass();
                                qa.b bVar = qVarC2.f19736a;
                                p pVar = new p(fW, fW2, fW3, fD, qVarC2);
                                sa.q qVarC3 = nh.b.c(sa.o.f19727b);
                                l.e(qVarC3, "space");
                                float[] fArr = ra.a.f18984a;
                                float[] fArr2 = ra.a.f18985b;
                                qa.b bVar2 = qVarC3.f19736a;
                                if (l.a(bVar2, bVar)) {
                                    hVar2 = hVar6;
                                    i10 = 0;
                                    i11 = 1;
                                } else {
                                    s sVar = bVar.f18136b;
                                    l.e(fArr2, "lmsToXyz");
                                    s sVar2 = bVar2.f18136b;
                                    float f11 = sVar.f19739a;
                                    float f12 = sVar.f19741c;
                                    hVar2 = hVar6;
                                    float[] fArrQ = nh.b.q((f11 * f12) / sVar.f19740b, f12, sVar.a(), fArr);
                                    float f13 = sVar2.f19739a;
                                    float f14 = sVar2.f19741c;
                                    float[] fArrQ2 = nh.b.q((f13 * f14) / sVar2.f19740b, f14, sVar2.a(), fArr);
                                    float[] fArrR = nh.b.r(fArrQ2[0] / fArrQ[0], fArrQ2[1] / fArrQ[1], fArrQ2[2] / fArrQ[2], fArr2);
                                    float fS = nh.b.s(0, 0, fArrR, fArr);
                                    float fS2 = nh.b.s(1, 0, fArrR, fArr);
                                    float fS3 = nh.b.s(2, 0, fArrR, fArr);
                                    float fS4 = nh.b.s(0, 1, fArrR, fArr);
                                    float fS5 = nh.b.s(1, 1, fArrR, fArr);
                                    float fS6 = nh.b.s(2, 1, fArrR, fArr);
                                    float fS7 = nh.b.s(0, 2, fArrR, fArr);
                                    float fS8 = nh.b.s(1, 2, fArrR, fArr);
                                    float fS9 = nh.b.s(2, 2, fArrR, fArr);
                                    float[] fArr3 = new float[9];
                                    fArr3[0] = fS;
                                    fArr3[1] = fS2;
                                    fArr3[2] = fS3;
                                    fArr3[3] = fS4;
                                    fArr3[c3] = fS5;
                                    fArr3[5] = fS6;
                                    fArr3[6] = fS7;
                                    fArr3[7] = fS8;
                                    fArr3[8] = fS9;
                                    i10 = 0;
                                    i11 = 1;
                                    pVar = new p(t0.w(fArr3, 2, 0, fW3, t0.w(fArr3, 1, 0, fW2, nh.a.i(0, 0, fArr3) * fW)), t0.w(fArr3, 2, 1, fW3, t0.w(fArr3, 1, 1, fW2, nh.a.i(0, 1, fArr3) * fW)), t0.w(fArr3, 2, 2, fW3, t0.w(fArr3, 1, 2, fW2, nh.a.i(0, 2, fArr3) * fW)), fD, qVarC3);
                                }
                                p pVar2 = pVar;
                                float[] fArr4 = sa.o.f19730e;
                                l.e(fArr4, "rowMajor");
                                float fI = nh.a.i(i10, i10, fArr4);
                                float f15 = pVar2.f19731a;
                                float f16 = pVar2.f19732b;
                                float fW4 = t0.w(fArr4, i11, i10, f16, fI * f15);
                                float f17 = pVar2.f19733c;
                                g gVar4 = new g(iVar2.b(t0.w(fArr4, 2, i10, f17, fW4)), iVar2.b(t0.w(fArr4, 2, i11, f17, t0.w(fArr4, i11, i11, f16, nh.a.i(i10, i11, fArr4) * f15))), iVar2.b(t0.w(fArr4, 2, 2, f17, t0.w(fArr4, i11, 2, f16, f15 * nh.a.i(i10, 2, fArr4)))), fD, oVar3);
                                f10 = fD;
                                gVar = gVar4;
                            }
                        }
                        double d10 = gVar.f19697a;
                        double d11 = gVar.f19698b;
                        double d12 = gVar.f19699c;
                        hVar = hVar4;
                        double dMin = Math.min(d10, Math.min(d11, d12));
                        double dMax = Math.max(d10, Math.max(d11, d12));
                        double d13 = dMax - dMin;
                        float f18 = (float) (((((d13 < 1.0E-7d ? Double.NaN : d10 == dMax ? (d11 - d12) / d13 : d11 == dMax ? ((d12 - d10) / d13) + ((double) 2) : d12 == dMax ? ((d10 - d11) / d13) + ((double) 4) : 0.0d) * ((double) 60)) % 360.0d) + 360.0d) % 360.0d);
                        float f19 = (float) (dMax != 0.0d ? d13 / dMax : 0.0d);
                        float f20 = (float) dMax;
                        if (Float.isNaN(f18)) {
                            f18 = 0.0f;
                        }
                        objK = v.v(new ta.c(f18, f19, f20, f10));
                        oVar.h0(objK);
                    } else {
                        hVar = hVar4;
                        hVar2 = hVar6;
                        a0Var = a0Var2;
                        r0Var = r0Var2;
                    }
                    w0 w0Var = (w0) objK;
                    q qVarJ = androidx.compose.foundation.layout.c.j(nVar, TinkerReport.KEY_LOADED_SUCC_COST_500_LESS);
                    ta.c cVar = (ta.c) w0Var.getValue();
                    Object objK2 = oVar.K();
                    r0 r0Var3 = r0Var;
                    if (objK2 == r0Var3) {
                        objK2 = new c(w0Var, 0);
                        oVar.h0(objK2);
                    }
                    int i14 = ta.c.f20596e;
                    ua.j.a(27702, (k) objK2, qVarJ, cVar, oVar);
                    q qVarC4 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    y.j1 j1VarA = i1.a(y.k.f25157b, j1.c.f9671j, oVar, 6);
                    int iQ2 = v.q(oVar);
                    j1 j1VarL2 = oVar.l();
                    q qVarC5 = j1.a.c(qVarC4, oVar);
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    v.A(hVar3, j1VarA, oVar);
                    v.A(hVar, j1VarL2, oVar);
                    if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ2))) {
                        h0.s(iQ2, oVar, iQ2, hVar5);
                    }
                    v.A(hVar2, qVarC5, oVar);
                    w0 w0Var2 = this.f23449c;
                    boolean zF = oVar.f(w0Var2);
                    Object objK3 = oVar.K();
                    if (zF || objK3 == r0Var3) {
                        objK3 = new d(w0Var2, 0);
                        oVar.h0(objK3);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK3, null, false, null, e.f23455a, oVar, 805306368, 510);
                    boolean zF2 = oVar.f(w0Var2);
                    k kVar = this.f23450d;
                    boolean zF3 = zF2 | oVar.f(kVar);
                    Object objK4 = oVar.K();
                    if (zF3 || objK4 == r0Var3) {
                        objK4 = new ba.c((Object) w0Var2, (Object) kVar, (Object) w0Var, 26);
                        oVar.h0(objK4);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK4, null, false, null, e.f23456b, oVar, 805306368, 510);
                    oVar.p(true);
                    oVar.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e.a(this.f23449c, this.f23448b, this.f23450d, (o) obj, v.D(391));
                break;
        }
        return a0Var2;
    }

    public /* synthetic */ b(w0 w0Var, long j10, k kVar, int i10, int i11) {
        this.f23447a = i11;
        this.f23449c = w0Var;
        this.f23448b = j10;
        this.f23450d = kVar;
    }
}
