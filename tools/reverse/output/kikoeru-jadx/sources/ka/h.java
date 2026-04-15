package ka;

import bg.a2;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hd.q0;
import j2.h0;
import java.util.ArrayList;
import m0.d9;
import m0.e9;
import m0.g5;
import m0.r3;
import m0.z8;
import n7.b0;
import q1.n0;
import u3.x0;
import ub.a0;
import w1.g0;
import w1.u;
import w1.z;
import x0.j1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11265a;

    public /* synthetic */ h(int i10) {
        this.f11265a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f11265a;
        j1.n nVar = j1.n.f9689a;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    oVar.W(313266110);
                    oVar.p(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                j.a(v.D(1), (x0.o) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                b.h(v.D(1), (x0.o) obj);
                break;
            case 3:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    w1.f fVarB = n7.e.f15468j;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.Schedule", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = g0.f23208a;
                        long j10 = q1.q.f17569b;
                        n0 n0Var = new n0(j10);
                        q0 q0VarH = h0.h(11.99f, 2.0f);
                        q0VarH.m(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        q0VarH.w(4.47f, 10.0f, 9.99f, 10.0f);
                        q0VarH.m(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                        q0VarH.v(17.52f, 2.0f, 11.99f, 2.0f);
                        q0VarH.l();
                        q0VarH.u(12.0f, 20.0f);
                        q0VarH.n(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                        q0VarH.w(3.58f, -8.0f, 8.0f, -8.0f);
                        q0VarH.w(8.0f, 3.58f, 8.0f, 8.0f);
                        q0VarH.w(-3.58f, 8.0f, -8.0f, 8.0f);
                        q0VarH.l();
                        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
                        n0 n0Var2 = new n0(j10);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new w1.n(12.5f, 7.0f));
                        arrayList.add(new w1.l(11.0f));
                        arrayList.add(new z(6.0f));
                        arrayList.add(new u(5.25f, 3.15f));
                        arrayList.add(new u(0.75f, -1.23f));
                        arrayList.add(new u(-4.5f, -2.67f));
                        arrayList.add(w1.j.f23242c);
                        w1.e.a(eVar, arrayList, 0, n0Var2);
                        fVarB = eVar.b();
                        n7.e.f15468j = fVarB;
                    }
                    r3.b(fVarB, null, androidx.compose.foundation.layout.c.j(nVar, 15), 0L, oVar2, 432, 8);
                }
                break;
            case 4:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    w1.f fVarB2 = x0.f21346d;
                    if (fVarB2 == null) {
                        w1.e eVar2 = new w1.e("Filled.AttachMoney", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = g0.f23208a;
                        n0 n0Var3 = new n0(q1.q.f17569b);
                        q0 q0VarH2 = h0.h(11.8f, 10.9f);
                        q0VarH2.n(-2.27f, -0.59f, -3.0f, -1.2f, -3.0f, -2.15f);
                        q0VarH2.n(0.0f, -1.09f, 1.01f, -1.85f, 2.7f, -1.85f);
                        q0VarH2.n(1.78f, 0.0f, 2.44f, 0.85f, 2.5f, 2.1f);
                        q0VarH2.r(2.21f);
                        q0VarH2.n(-0.07f, -1.72f, -1.12f, -3.3f, -3.21f, -3.81f);
                        q0VarH2.y(3.0f);
                        q0VarH2.r(-3.0f);
                        q0VarH2.z(2.16f);
                        q0VarH2.n(-1.94f, 0.42f, -3.5f, 1.68f, -3.5f, 3.61f);
                        q0VarH2.n(0.0f, 2.31f, 1.91f, 3.46f, 4.7f, 4.13f);
                        q0VarH2.n(2.5f, 0.6f, 3.0f, 1.48f, 3.0f, 2.41f);
                        q0VarH2.n(0.0f, 0.69f, -0.49f, 1.79f, -2.7f, 1.79f);
                        q0VarH2.n(-2.06f, 0.0f, -2.87f, -0.92f, -2.98f, -2.1f);
                        q0VarH2.r(-2.2f);
                        q0VarH2.n(0.12f, 2.19f, 1.76f, 3.42f, 3.68f, 3.83f);
                        q0VarH2.y(21.0f);
                        q0VarH2.r(3.0f);
                        q0VarH2.z(-2.15f);
                        q0VarH2.n(1.95f, -0.37f, 3.5f, -1.5f, 3.5f, -3.55f);
                        q0VarH2.n(0.0f, -2.84f, -2.43f, -3.81f, -4.7f, -4.4f);
                        q0VarH2.l();
                        w1.e.a(eVar2, q0VarH2.f8447b, 0, n0Var3);
                        fVarB2 = eVar2.b();
                        x0.f21346d = fVarB2;
                    }
                    r3.b(fVarB2, null, androidx.compose.foundation.layout.c.j(nVar, 15), 0L, oVar3, 432, 8);
                }
                break;
            case 5:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    r3.b(nd.h.g(), null, androidx.compose.foundation.layout.c.j(nVar, 15), 0L, oVar4, 432, 8);
                }
                break;
            case 6:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    r3.b(x0.t(), null, androidx.compose.foundation.layout.c.j(nVar, 15), 0L, oVar5, 432, 8);
                }
                break;
            case 7:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar6.Q();
                } else {
                    r3.b(nh.b.t(), null, androidx.compose.foundation.layout.c.j(nVar, 15), 0L, oVar6, 432, 8);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar7 = (x0.o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    oVar7.Q();
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar8 = (x0.o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    oVar8.Q();
                } else {
                    z8.b(na.q.g(R.string.search_placeholder), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar8, 0, 0, 131070);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                x0.o oVar9 = (x0.o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!oVar9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    oVar9.Q();
                } else {
                    r3.b(x0.s(), "Search", null, 0L, oVar9, 48, 12);
                }
                break;
            case 11:
                jc.l.e((a2) obj, "<unused var>");
                jc.l.e((String) obj2, "<unused var>");
                break;
            case 12:
                c0.f fVar = (c0.f) obj;
                ic.k kVar = (ic.k) obj2;
                jc.l.e(fVar, "<this>");
                jc.l.e(kVar, "it");
                kVar.a(fVar);
                break;
            case 13:
                break;
            case 14:
                ((Integer) obj2).getClass();
                lc.b.f(v.D(1), (x0.o) obj);
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                x0.o oVar10 = (x0.o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!oVar10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    oVar10.Q();
                } else {
                    j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 20);
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9675n, oVar10, 48);
                    int iQ = v.q(oVar10);
                    j1 j1VarL = oVar10.l();
                    j1.q qVarC = j1.a.c(qVarJ, oVar10);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar10.a0();
                    if (oVar10.S) {
                        oVar10.k(iVar);
                    } else {
                        oVar10.k0();
                    }
                    v.A(i2.j.f8738g, vVarA, oVar10);
                    v.A(i2.j.f8737f, j1VarL, oVar10);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar10.S || !jc.l.a(oVar10.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar10, iQ, hVar);
                    }
                    v.A(i2.j.f8735d, qVarC, oVar10);
                    z8.b(n7.e.E(R.string.loading_login, oVar10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar10.j(e9.f12960b)).f12884g, oVar10, 0, 0, 65534);
                    g5.a(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.a.j(nVar, 35), 50), 0L, 0.0f, 0L, 0, oVar10, 6, 30);
                    z8.b(n7.e.E(R.string.try_connecting, oVar10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar10, 0, 0, 131070);
                    oVar10.p(true);
                }
                break;
            case 25:
                x0.o oVar11 = (x0.o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!oVar11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    oVar11.Q();
                } else {
                    z8.b(n7.e.E(R.string.server, oVar11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar11, 0, 0, 131070);
                }
                break;
            case 26:
                x0.o oVar12 = (x0.o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!oVar12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    oVar12.Q();
                } else {
                    r3.b(b0.p(), n7.e.E(R.string.server, oVar12), null, 0L, oVar12, 0, 12);
                }
                break;
            case 27:
                x0.o oVar13 = (x0.o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!oVar13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    oVar13.Q();
                } else {
                    z8.b(n7.e.E(R.string.username, oVar13), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar13, 0, 0, 131070);
                }
                break;
            case 28:
                x0.o oVar14 = (x0.o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!oVar14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    oVar14.Q();
                } else {
                    w1.f fVarB3 = b0.f15424h;
                    if (fVarB3 == null) {
                        w1.e eVar3 = new w1.e("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = g0.f23208a;
                        n0 n0Var4 = new n0(q1.q.f17569b);
                        q0 q0VarH3 = h0.h(12.0f, 12.0f);
                        q0VarH3.n(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
                        q0VarH3.w(-1.79f, -4.0f, -4.0f, -4.0f);
                        q0VarH3.w(-4.0f, 1.79f, -4.0f, 4.0f);
                        q0VarH3.w(1.79f, 4.0f, 4.0f, 4.0f);
                        q0VarH3.l();
                        q0VarH3.u(12.0f, 14.0f);
                        q0VarH3.n(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
                        q0VarH3.z(2.0f);
                        q0VarH3.r(16.0f);
                        q0VarH3.z(-2.0f);
                        q0VarH3.n(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
                        q0VarH3.l();
                        w1.e.a(eVar3, q0VarH3.f8447b, 0, n0Var4);
                        fVarB3 = eVar3.b();
                        b0.f15424h = fVarB3;
                    }
                    r3.b(fVarB3, n7.e.E(R.string.username, oVar14), null, 0L, oVar14, 0, 12);
                }
                break;
            default:
                x0.o oVar15 = (x0.o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!oVar15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    oVar15.Q();
                } else {
                    z8.b(n7.e.E(R.string.password, oVar15), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar15, 0, 0, 131070);
                }
                break;
        }
        return a0Var;
    }

    public /* synthetic */ h(int i10, int i11) {
        this.f11265a = i11;
    }

    public /* synthetic */ h(g gVar) {
        this.f11265a = 0;
    }
}
