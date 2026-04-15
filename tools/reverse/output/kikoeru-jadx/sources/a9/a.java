package a9;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.a0;
import e7.m0;
import g2.v0;
import hd.q0;
import j2.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.r3;
import n7.b0;
import pc.f0;
import q1.n0;
import u3.x0;
import vb.w;
import w1.g0;
import w1.z;
import x0.j1;
import x0.n2;
import x0.v;
import y.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209a;

    public /* synthetic */ a(int i10) {
        this.f209a = i10;
    }

    private final Object f(Object obj, Object obj2) {
        Bundle bundleC;
        a0 a0Var = (a0) obj2;
        h7.g gVar = a0Var.f6299b;
        LinkedHashMap linkedHashMap = gVar.f8171m;
        vb.j<e7.j> jVar = gVar.f8164f;
        LinkedHashMap linkedHashMap2 = gVar.f8170l;
        ArrayList arrayList = new ArrayList();
        Bundle bundleC2 = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        for (Map.Entry entry : w.B(gVar.f8177s.f6366a).entrySet()) {
            ((m0) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundleC = null;
        } else {
            bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
            ua.j.v(bundleC2, "android-support-nav:controller:navigatorState:names", arrayList);
            ua.j.t(bundleC, "android-support-nav:controller:navigatorState", bundleC2);
        }
        if (!jVar.isEmpty()) {
            if (bundleC == null) {
                bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (e7.j jVar2 : jVar) {
                jc.l.e(jVar2, "entry");
                int i10 = jVar2.f6334b.f6400b.f8187a;
                String str = jVar2.f6338f;
                h7.c cVar = jVar2.f6340h;
                Bundle bundleA = cVar.a();
                Bundle bundleC3 = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
                cVar.f8141h.x(bundleC3);
                Bundle bundleC4 = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
                ua.j.u(bundleC4, "nav-entry-state:id", str);
                bundleC4.putInt("nav-entry-state:destination-id", i10);
                if (bundleA == null) {
                    bundleA = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
                }
                ua.j.t(bundleC4, "nav-entry-state:args", bundleA);
                ua.j.t(bundleC4, "nav-entry-state:saved-state", bundleC3);
                arrayList2.add(bundleC4);
            }
            bundleC.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleC == null) {
                bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                int i12 = i11 + 1;
                iArr[i11] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i11 = i12;
            }
            bundleC.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            ua.j.v(bundleC, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleC == null) {
                bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = (String) entry3.getKey();
                vb.j jVar3 = (vb.j) entry3.getValue();
                arrayList4.add(str3);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator it = jVar3.iterator();
                while (it.hasNext()) {
                    p4.p pVar = ((e7.k) it.next()).f6342a;
                    pVar.getClass();
                    Bundle bundleC5 = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
                    ua.j.u(bundleC5, "nav-entry-state:id", (String) pVar.f16600b);
                    bundleC5.putInt("nav-entry-state:destination-id", pVar.f16599a);
                    Bundle bundleC6 = (Bundle) pVar.f16601c;
                    if (bundleC6 == null) {
                        bundleC6 = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
                    }
                    ua.j.t(bundleC5, "nav-entry-state:args", bundleC6);
                    ua.j.t(bundleC5, "nav-entry-state:saved-state", (Bundle) pVar.f16602d);
                    arrayList5.add(bundleC5);
                }
                String str4 = "android-support-nav:controller:backStackStates:" + str3;
                jc.l.e(str4, "key");
                bundleC.putParcelableArrayList(str4, arrayList5);
            }
            ua.j.v(bundleC, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (a0Var.f6302e) {
            if (bundleC == null) {
                bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
            }
            bundleC.putBoolean("android-support-nav:controller:deepLinkHandled", a0Var.f6302e);
        }
        return bundleC;
    }

    private final Object h(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            r3.b(x0.t(), "Comment", null, 0L, oVar, 48, 12);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }

    private final Object i(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            w1.f fVarB = n7.d.f15450l;
            if (fVarB == null) {
                w1.e eVar = new w1.e("Filled.SkipNext", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = g0.f23208a;
                n0 n0Var = new n0(q1.q.f17569b);
                q0 q0Var = new q0((byte) 0, 6);
                q0Var.u(6.0f, 18.0f);
                q0Var.t(8.5f, -6.0f);
                h0.t(q0Var, 6.0f, 6.0f, 12.0f);
                q0Var.u(16.0f, 6.0f);
                q0Var.z(12.0f);
                q0Var.r(2.0f);
                q0Var.y(6.0f);
                q0Var.r(-2.0f);
                q0Var.l();
                w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                fVarB = eVar.b();
                n7.d.f15450l = fVarB;
            }
            r3.b(fVarB, "MediaNext", androidx.compose.foundation.layout.c.j(j1.n.f9689a, 50), 0L, oVar, 432, 8);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }

    private final Object j(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            r3.b(a2.c.M(), "PlaylistPlay", null, 0L, oVar, 48, 12);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }

    private final Object m(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            w1.f fVarB = x0.f21357o;
            if (fVarB == null) {
                w1.e eVar = new w1.e("Filled.Timer", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = g0.f23208a;
                long j10 = q1.q.f17569b;
                n0 n0Var = new n0(j10);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new w1.n(9.0f, 1.0f));
                arrayList.add(new w1.t(6.0f));
                arrayList.add(new z(2.0f));
                arrayList.add(new w1.t(-6.0f));
                arrayList.add(w1.j.f23242c);
                w1.e.a(eVar, arrayList, 0, n0Var);
                n0 n0Var2 = new n0(j10);
                q0 q0Var = new q0((byte) 0, 6);
                q0Var.u(19.03f, 7.39f);
                q0Var.t(1.42f, -1.42f);
                q0Var.n(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
                q0Var.t(-1.42f, 1.42f);
                q0Var.m(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
                q0Var.n(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                q0Var.n(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
                q0Var.w(9.0f, -4.03f, 9.0f, -9.0f);
                q0Var.m(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
                q0Var.l();
                q0Var.u(13.0f, 14.0f);
                q0Var.r(-2.0f);
                q0Var.y(8.0f);
                q0Var.r(2.0f);
                q0Var.y(14.0f);
                q0Var.l();
                w1.e.a(eVar, q0Var.f8447b, 0, n0Var2);
                fVarB = eVar.b();
                x0.f21357o = fVarB;
            }
            r3.b(fVarB, "Timer", null, 0L, oVar, 48, 12);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f209a;
        j1.n nVar = j1.n.f9689a;
        ub.a0 a0Var = ub.a0.f21526a;
        int i11 = 0;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v0 v0VarD = y.p.d(j1.c.f9662a, false);
                    int iQ = v.q(oVar);
                    j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(nVar, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    v.A(i2.j.f8738g, v0VarD, oVar);
                    v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar, iQ, hVar);
                    }
                    v.A(i2.j.f8735d, qVarC, oVar);
                    ka.b.c(0, oVar);
                    u.a(0, oVar);
                    ka.n.a(y.d.o(nVar), oVar, 0);
                    ka.j.a(0, oVar);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                return a0Var;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ja.d.a(false, oVar2, 48);
                } else {
                    oVar2.Q();
                }
                return a0Var;
            case 2:
                ((Integer) obj2).getClass();
                u.a(v.D(1), (x0.o) obj);
                return a0Var;
            case 3:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                j1.f fVar = j1.c.f9674m;
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    y.v vVarA = y.u.a(y.k.g(3), fVar, oVar3, 6);
                    int iQ2 = v.q(oVar3);
                    j1 j1VarL2 = oVar3.l();
                    j1.n nVar2 = j1.n.f9689a;
                    j1.q qVarC2 = j1.a.c(nVar2, oVar3);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar3.a0();
                    if (oVar3.S) {
                        oVar3.k(iVar2);
                    } else {
                        oVar3.k0();
                    }
                    v.A(i2.j.f8738g, vVarA, oVar3);
                    v.A(i2.j.f8737f, j1VarL2, oVar3);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ2))) {
                        h0.s(iQ2, oVar3, iQ2, hVar2);
                    }
                    v.A(i2.j.f8735d, qVarC2, oVar3);
                    oVar3.W(776557588);
                    int i12 = 0;
                    for (int i13 = 2; i12 < i13; i13 = 2) {
                        float f10 = 10;
                        j1.q qVarJ = androidx.compose.foundation.layout.a.j(nVar2, f10);
                        y.j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9671j, oVar3, i11);
                        int iQ3 = v.q(oVar3);
                        j1 j1VarL3 = oVar3.l();
                        j1.q qVarC3 = j1.a.c(qVarJ, oVar3);
                        i2.k.f8771g0.getClass();
                        i2.i iVar3 = i2.j.f8733b;
                        oVar3.a0();
                        if (oVar3.S) {
                            oVar3.k(iVar3);
                        } else {
                            oVar3.k0();
                        }
                        i2.h hVar3 = i2.j.f8738g;
                        v.A(hVar3, j1VarA, oVar3);
                        i2.h hVar4 = i2.j.f8737f;
                        v.A(hVar4, j1VarL3, oVar3);
                        i2.h hVar5 = i2.j.f8741j;
                        if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ3))) {
                            h0.s(iQ3, oVar3, iQ3, hVar5);
                        }
                        i2.h hVar6 = i2.j.f8735d;
                        v.A(hVar6, qVarC3, oVar3);
                        r3.b(nd.h.i(), null, androidx.compose.foundation.layout.a.n(nVar2, 0.0f, 0.0f, f10, 0.0f, 11), 0L, oVar3, 432, 8);
                        y.v vVarA2 = y.u.a(y.k.f25158c, fVar, oVar3, i11);
                        int iQ4 = v.q(oVar3);
                        j1 j1VarL4 = oVar3.l();
                        j1.q qVarC4 = j1.a.c(nVar2, oVar3);
                        oVar3.a0();
                        if (oVar3.S) {
                            oVar3.k(iVar3);
                        } else {
                            oVar3.k0();
                        }
                        v.A(hVar3, vVarA2, oVar3);
                        v.A(hVar4, j1VarL4, oVar3);
                        if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ4))) {
                            h0.s(iQ4, oVar3, iQ4, hVar5);
                        }
                        v.A(hVar6, qVarC4, oVar3);
                        f0.b(gh.g.k(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.c(nVar2, 0.7f), f10), g0.g.a(f10)), 0L, 0.0f, 0.0f, oVar3, 0, 14);
                        y.d.d(androidx.compose.foundation.layout.c.d(nVar2, (float) 15.3d), oVar3);
                        f0.b(gh.g.k(androidx.compose.foundation.layout.c.d(nVar2, f10), g0.g.a(f10)), 0L, 0.0f, 0.0f, oVar3, 0, 14);
                        oVar3.p(true);
                        oVar3.p(true);
                        i12++;
                        i11 = 0;
                    }
                    oVar3.p(false);
                    oVar3.p(true);
                } else {
                    oVar3.Q();
                }
                return a0Var;
            case 4:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    float f11 = 10;
                    j1.n nVar3 = j1.n.f9689a;
                    j1.q qVarJ2 = androidx.compose.foundation.layout.a.j(nVar3, f11);
                    y.j1 j1VarA2 = i1.a(y.k.f25156a, j1.c.f9671j, oVar4, 0);
                    int iQ5 = v.q(oVar4);
                    j1 j1VarL5 = oVar4.l();
                    j1.q qVarC5 = j1.a.c(qVarJ2, oVar4);
                    i2.k.f8771g0.getClass();
                    i2.i iVar4 = i2.j.f8733b;
                    oVar4.a0();
                    if (oVar4.S) {
                        oVar4.k(iVar4);
                    } else {
                        oVar4.k0();
                    }
                    v.A(i2.j.f8738g, j1VarA2, oVar4);
                    v.A(i2.j.f8737f, j1VarL5, oVar4);
                    i2.h hVar7 = i2.j.f8741j;
                    if (oVar4.S || !jc.l.a(oVar4.K(), Integer.valueOf(iQ5))) {
                        h0.s(iQ5, oVar4, iQ5, hVar7);
                    }
                    v.A(i2.j.f8735d, qVarC5, oVar4);
                    oVar4.W(663558370);
                    int i14 = 0;
                    while (i14 < 2) {
                        j1.q qVarC6 = androidx.compose.foundation.layout.c.c(nVar3, (i14 * 0.5f) + 0.5f);
                        j1.q qVarN = i14 == 0 ? androidx.compose.foundation.layout.a.n(qVarC6, 0.0f, 0.0f, 5, 0.0f, 11) : androidx.compose.foundation.layout.a.n(qVarC6, 5, 0.0f, 0.0f, 0.0f, 14);
                        y.v vVarA3 = y.u.a(y.k.f25158c, j1.c.f9674m, oVar4, 0);
                        int iQ6 = v.q(oVar4);
                        j1 j1VarL6 = oVar4.l();
                        j1.q qVarC7 = j1.a.c(qVarN, oVar4);
                        i2.k.f8771g0.getClass();
                        i2.i iVar5 = i2.j.f8733b;
                        oVar4.a0();
                        if (oVar4.S) {
                            oVar4.k(iVar5);
                        } else {
                            oVar4.k0();
                        }
                        v.A(i2.j.f8738g, vVarA3, oVar4);
                        v.A(i2.j.f8737f, j1VarL6, oVar4);
                        i2.h hVar8 = i2.j.f8741j;
                        if (oVar4.S || !jc.l.a(oVar4.K(), Integer.valueOf(iQ6))) {
                            h0.s(iQ6, oVar4, iQ6, hVar8);
                        }
                        v.A(i2.j.f8735d, qVarC7, oVar4);
                        r3.b(nd.h.i(), null, androidx.compose.foundation.layout.a.n(nVar3, 0.0f, 0.0f, 0.0f, f11, 7), 0L, oVar4, 432, 8);
                        oVar4.W(600483693);
                        for (int i15 = 0; i15 < 3; i15++) {
                            f0.b(gh.g.k(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.c(nVar3, 0.7f), f11), g0.g.a(f11)), 0L, 0.0f, 0.0f, oVar4, 0, 14);
                            if (i15 < 2) {
                                oVar4.W(-152135729);
                                y.d.d(androidx.compose.foundation.layout.c.d(nVar3, 15), oVar4);
                            } else {
                                oVar4.W(-159337587);
                            }
                            oVar4.p(false);
                        }
                        oVar4.p(false);
                        oVar4.p(true);
                        i14++;
                    }
                    oVar4.p(false);
                    oVar4.p(true);
                } else {
                    oVar4.Q();
                }
                return a0Var;
            case 5:
                ((Integer) obj2).getClass();
                aa.a.a(v.D(1), (x0.o) obj);
                return a0Var;
            case 6:
                ((Integer) obj2).getClass();
                aa.a.c(v.D(1), (x0.o) obj);
                return a0Var;
            case 7:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    j1.q qVarJ3 = androidx.compose.foundation.layout.c.j(nVar, 24);
                    w1.f fVarB = nh.a.f15893p;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Rounded.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i16 = g0.f23208a;
                        n0 n0Var = new n0(q1.q.f17569b);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(15.5f, 14.0f);
                        q0Var.r(-0.79f);
                        q0Var.t(-0.28f, -0.27f);
                        q0Var.n(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
                        q0Var.n(-0.47f, -2.78f, -2.79f, -5.0f, -5.59f, -5.34f);
                        q0Var.n(-4.23f, -0.52f, -7.79f, 3.04f, -7.27f, 7.27f);
                        q0Var.n(0.34f, 2.8f, 2.56f, 5.12f, 5.34f, 5.59f);
                        q0Var.n(2.03f, 0.34f, 3.94f, -0.28f, 5.34f, -1.48f);
                        q0Var.t(0.27f, 0.28f);
                        q0Var.z(0.79f);
                        q0Var.t(4.25f, 4.25f);
                        q0Var.n(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
                        q0Var.n(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
                        q0Var.s(15.5f, 14.0f);
                        q0Var.l();
                        q0Var.u(9.5f, 14.0f);
                        q0Var.m(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                        q0Var.v(7.01f, 5.0f, 9.5f, 5.0f);
                        q0Var.v(14.0f, 7.01f, 14.0f, 9.5f);
                        q0Var.v(11.99f, 14.0f, 9.5f, 14.0f);
                        q0Var.l();
                        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        nh.a.f15893p = fVarB;
                    }
                    r3.b(fVarB, "search", qVarJ3, 0L, oVar5, 432, 8);
                } else {
                    oVar5.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j1.q qVarJ4 = androidx.compose.foundation.layout.c.j(nVar, 24);
                    w1.f fVarB2 = b0.f15434r;
                    if (fVarB2 == null) {
                        w1.e eVar2 = new w1.e("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i17 = g0.f23208a;
                        n0 n0Var2 = new n0(q1.q.f17569b);
                        q0 q0VarH = h0.h(18.3f, 5.71f);
                        q0VarH.n(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        q0VarH.s(12.0f, 10.59f);
                        q0VarH.s(7.11f, 5.7f);
                        q0VarH.n(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        q0VarH.n(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        q0VarH.s(10.59f, 12.0f);
                        q0VarH.s(5.7f, 16.89f);
                        q0VarH.n(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        q0VarH.n(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        q0VarH.s(12.0f, 13.41f);
                        q0VarH.t(4.89f, 4.89f);
                        q0VarH.n(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        q0VarH.n(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        q0VarH.s(13.41f, 12.0f);
                        q0VarH.t(4.89f, -4.89f);
                        q0VarH.n(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                        q0VarH.l();
                        w1.e.a(eVar2, q0VarH.f8447b, 0, n0Var2);
                        fVarB2 = eVar2.b();
                        b0.f15434r = fVarB2;
                    }
                    r3.b(fVarB2, "clear", qVarJ4, 0L, oVar6, 432, 8);
                } else {
                    oVar6.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar7 = (x0.o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    j1.q qVarJ5 = androidx.compose.foundation.layout.c.j(nVar, 24);
                    w1.f fVarB3 = n7.d.f15439a;
                    if (fVarB3 == null) {
                        w1.e eVar3 = new w1.e("AutoMirrored.Rounded.Sort", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i18 = g0.f23208a;
                        n0 n0Var3 = new n0(q1.q.f17569b);
                        q0 q0Var2 = new q0((byte) 0, 6);
                        q0Var2.u(4.0f, 18.0f);
                        q0Var2.r(4.0f);
                        q0Var2.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0Var2.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        q0Var2.s(4.0f, 16.0f);
                        q0Var2.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        q0Var2.w(0.45f, 1.0f, 1.0f, 1.0f);
                        q0Var2.l();
                        q0Var2.u(3.0f, 7.0f);
                        q0Var2.n(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        q0Var2.r(16.0f);
                        q0Var2.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0Var2.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        q0Var2.s(4.0f, 6.0f);
                        q0Var2.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        q0Var2.l();
                        q0Var2.u(4.0f, 13.0f);
                        q0Var2.r(10.0f);
                        q0Var2.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0Var2.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        q0Var2.s(4.0f, 11.0f);
                        q0Var2.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        q0Var2.w(0.45f, 1.0f, 1.0f, 1.0f);
                        q0Var2.l();
                        w1.e.a(eVar3, q0Var2.f8447b, 0, n0Var3);
                        fVarB3 = eVar3.b();
                        n7.d.f15439a = fVarB3;
                    }
                    r3.b(fVarB3, "Sort", qVarJ5, 0L, oVar7, 432, 8);
                } else {
                    oVar7.Q();
                }
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                x0.o oVar8 = (x0.o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j1.q qVarJ6 = androidx.compose.foundation.layout.c.j(nVar, 24);
                    w1.f fVarB4 = x0.f21360r;
                    if (fVarB4 == null) {
                        w1.e eVar4 = new w1.e("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i19 = g0.f23208a;
                        n0 n0Var4 = new n0(q1.q.f17569b);
                        q0 q0Var3 = new q0((byte) 0, 6);
                        q0Var3.u(9.0f, 16.17f);
                        q0Var3.s(5.53f, 12.7f);
                        q0Var3.n(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        q0Var3.n(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        q0Var3.t(4.18f, 4.18f);
                        q0Var3.n(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        q0Var3.s(20.29f, 7.71f);
                        q0Var3.n(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        q0Var3.n(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        q0Var3.s(9.0f, 16.17f);
                        q0Var3.l();
                        w1.e.a(eVar4, q0Var3.f8447b, 0, n0Var4);
                        fVarB4 = eVar4.b();
                        x0.f21360r = fVarB4;
                    }
                    r3.b(fVarB4, "Ok", qVarJ6, 0L, oVar8, 432, 8);
                } else {
                    oVar8.Q();
                }
                return a0Var;
            case 11:
                ((Integer) obj2).getClass();
                ba.z.h(v.D(1), (x0.o) obj);
                return a0Var;
            case 12:
                ((Integer) obj2).getClass();
                ba.z.h(v.D(1), (x0.o) obj);
                return a0Var;
            case 13:
                x0.o oVar9 = (x0.o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (oVar9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ka.b.a(0, oVar9);
                } else {
                    oVar9.Q();
                }
                return a0Var;
            case 14:
                x0.o oVar10 = (x0.o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (oVar10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    r3.b(nd.h.j(), "More", null, 0L, oVar10, 48, 12);
                } else {
                    oVar10.Q();
                }
                return a0Var;
            case 15:
                x0.o oVar11 = (x0.o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (oVar11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    r3.b(nd.h.l(), "Play", null, 0L, oVar11, 48, 12);
                } else {
                    oVar11.Q();
                }
                return a0Var;
            case 16:
                x0.o oVar12 = (x0.o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (oVar12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    r3.b(nd.h.g(), "Download", null, 0L, oVar12, 48, 12);
                } else {
                    oVar12.Q();
                }
                return a0Var;
            case 17:
                x0.o oVar13 = (x0.o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (oVar13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    w1.f fVarB5 = nh.a.f15879b;
                    if (fVarB5 == null) {
                        w1.e eVar5 = new w1.e("Filled.CheckBox", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i20 = g0.f23208a;
                        n0 n0Var5 = new n0(q1.q.f17569b);
                        q0 q0Var4 = new q0((byte) 0, 6);
                        q0Var4.u(19.0f, 3.0f);
                        q0Var4.s(5.0f, 3.0f);
                        q0Var4.n(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        q0Var4.z(14.0f);
                        q0Var4.n(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        q0Var4.r(14.0f);
                        q0Var4.n(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        q0Var4.s(21.0f, 5.0f);
                        q0Var4.n(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
                        q0Var4.l();
                        q0Var4.u(10.0f, 17.0f);
                        q0Var4.t(-5.0f, -5.0f);
                        q0Var4.t(1.41f, -1.41f);
                        q0Var4.s(10.0f, 14.17f);
                        q0Var4.t(7.59f, -7.59f);
                        q0Var4.s(19.0f, 8.0f);
                        q0Var4.t(-9.0f, 9.0f);
                        q0Var4.l();
                        w1.e.a(eVar5, q0Var4.f8447b, 0, n0Var5);
                        fVarB5 = eVar5.b();
                        nh.a.f15879b = fVarB5;
                    }
                    r3.b(fVarB5, "CheckBox", null, 0L, oVar13, 48, 12);
                } else {
                    oVar13.Q();
                }
                return a0Var;
            case 18:
                ((Integer) obj2).getClass();
                da.a.b(v.D(1), (x0.o) obj);
                return a0Var;
            case 19:
                x0.o oVar14 = (x0.o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (oVar14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    r3.b(nh.a.s(), "Share", null, 0L, oVar14, 48, 12);
                } else {
                    oVar14.Q();
                }
                return a0Var;
            case 20:
                x0.o oVar15 = (x0.o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (oVar15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    w1.f fVarB6 = n7.d.f15449k;
                    if (fVarB6 == null) {
                        w1.e eVar6 = new w1.e("Filled.Save", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i21 = g0.f23208a;
                        n0 n0Var6 = new n0(q1.q.f17569b);
                        q0 q0Var5 = new q0((byte) 0, 6);
                        q0Var5.u(17.0f, 3.0f);
                        q0Var5.s(5.0f, 3.0f);
                        q0Var5.n(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        q0Var5.z(14.0f);
                        q0Var5.n(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        q0Var5.r(14.0f);
                        q0Var5.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        q0Var5.s(21.0f, 7.0f);
                        q0Var5.t(-4.0f, -4.0f);
                        q0Var5.l();
                        q0Var5.u(12.0f, 19.0f);
                        q0Var5.n(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
                        q0Var5.w(1.34f, -3.0f, 3.0f, -3.0f);
                        q0Var5.w(3.0f, 1.34f, 3.0f, 3.0f);
                        q0Var5.w(-1.34f, 3.0f, -3.0f, 3.0f);
                        q0Var5.l();
                        q0Var5.u(15.0f, 9.0f);
                        q0Var5.s(5.0f, 9.0f);
                        q0Var5.s(5.0f, 5.0f);
                        q0Var5.r(10.0f);
                        q0Var5.z(4.0f);
                        q0Var5.l();
                        w1.e.a(eVar6, q0Var5.f8447b, 0, n0Var6);
                        fVarB6 = eVar6.b();
                        n7.d.f15449k = fVarB6;
                    }
                    r3.b(fVarB6, "Save", null, 0L, oVar15, 48, 12);
                } else {
                    oVar15.Q();
                }
                return a0Var;
            case 21:
                return f(obj, obj2);
            case 22:
                x0.o oVar16 = (x0.o) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (oVar16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    r3.b(nh.b.t(), "add", null, 0L, oVar16, 48, 12);
                } else {
                    oVar16.Q();
                }
                return a0Var;
            case 23:
                x0.o oVar17 = (x0.o) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (oVar17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    w1.f fVarB7 = n7.e.f15469k;
                    if (fVarB7 == null) {
                        w1.e eVar7 = new w1.e("Filled.SkipPrevious", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i22 = g0.f23208a;
                        n0 n0Var7 = new n0(q1.q.f17569b);
                        q0 q0Var6 = new q0((byte) 0, 6);
                        q0Var6.u(6.0f, 6.0f);
                        q0Var6.r(2.0f);
                        q0Var6.z(12.0f);
                        q0Var6.s(6.0f, 18.0f);
                        q0Var6.l();
                        q0Var6.u(9.5f, 12.0f);
                        q0Var6.t(8.5f, 6.0f);
                        q0Var6.s(18.0f, 6.0f);
                        q0Var6.l();
                        w1.e.a(eVar7, q0Var6.f8447b, 0, n0Var7);
                        fVarB7 = eVar7.b();
                        n7.e.f15469k = fVarB7;
                    }
                    r3.b(fVarB7, "MediaPrevious", androidx.compose.foundation.layout.c.j(nVar, 50), 0L, oVar17, 432, 8);
                } else {
                    oVar17.Q();
                }
                return a0Var;
            case 24:
                x0.o oVar18 = (x0.o) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (oVar18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    Object objK = oVar18.K();
                    if (objK == x0.k.f24334a) {
                        objK = v.o(new e.e(2));
                        oVar18.h0(objK);
                    }
                    r3.b((w1.f) ((n2) objK).getValue(), "Stop/Play", androidx.compose.foundation.layout.c.j(nVar, 60), 0L, oVar18, 432, 8);
                } else {
                    oVar18.Q();
                }
                return a0Var;
            case 25:
                return i(obj, obj2);
            case 26:
                return j(obj, obj2);
            case 27:
                return m(obj, obj2);
            case 28:
                return h(obj, obj2);
            default:
                x0.o oVar19 = (x0.o) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (oVar19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ka.b.a(0, oVar19);
                } else {
                    oVar19.Q();
                }
                return a0Var;
        }
    }

    public /* synthetic */ a(int i10, int i11) {
        this.f209a = i11;
    }
}
