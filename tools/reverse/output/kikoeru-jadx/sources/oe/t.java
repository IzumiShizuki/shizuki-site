package oe;

import bd.f0;
import bd.j0;
import bd.y0;
import java.util.ArrayList;
import java.util.List;
import u3.x0;
import wd.b1;
import wd.h1;
import wd.t0;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.w f16424b;

    public t(k kVar) {
        this.f16423a = kVar;
        i iVar = kVar.f16390a;
        this.f16424b = new m0.w(iVar.f16365b, iVar.f16375l);
    }

    public final w a(yc.k kVar) {
        if (kVar instanceof yc.d0) {
            be.c cVar = ((j0) ((yc.d0) kVar)).f2596e;
            k kVar2 = this.f16423a;
            return new v(cVar, kVar2.f16391b, kVar2.f16393d, kVar2.f16396g);
        }
        if (kVar instanceof qe.h) {
            return ((qe.h) kVar).f18186u;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, ce.m mVar, int i10) {
        t tVar = this;
        k kVar = tVar.f16423a;
        yc.k kVar2 = kVar.f16392c;
        jc.l.c(kVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        yc.b bVar = (yc.b) kVar2;
        yc.k kVarY = bVar.y();
        jc.l.d(kVarY, "getContainingDeclaration(...)");
        w wVarA = tVar.a(kVarY);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ud.b.H();
                throw null;
            }
            t0 t0Var = (t0) obj;
            b1 b1Var = (b1) vb.m.b0(i11, list2);
            bd.a0 a0VarE = ee.m.e(bVar, kVar.f16397h.s(t0Var), null, (wVarA == null || !yd.d.f26173c.d((b1Var == null || (b1Var.f23576c & 1) != 1) ? 0 : b1Var.f23577d).booleanValue()) ? zc.g.f26696a : new qe.u(kVar.f16390a.f16364a, new s(tVar, wVarA, mVar, i10, i11, b1Var, 1)), i11);
            if (a0VarE != null) {
                arrayList.add(a0VarE);
            }
            tVar = this;
            i11 = i12;
        }
        return arrayList;
    }

    public final zc.h c(ce.m mVar, int i10, int i11) {
        return !yd.d.f26173c.d(i10).booleanValue() ? zc.g.f26696a : new qe.u(this.f16423a.f16390a.f16364a, new q(this, mVar, i11, 0));
    }

    public final zc.h d(wd.j0 j0Var, boolean z10) {
        return !yd.d.f26173c.d(j0Var.f23779d).booleanValue() ? zc.g.f26696a : new qe.u(this.f16423a.f16390a.f16364a, new r(this, z10, j0Var));
    }

    public final qe.c e(wd.n nVar, boolean z10) {
        k kVar = this.f16423a;
        yc.k kVar2 = kVar.f16392c;
        jc.l.c(kVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        yc.e eVar = (yc.e) kVar2;
        qe.c cVar = new qe.c(eVar, null, c(nVar, nVar.f23863d, 1), z10, 1, nVar, kVar.f16391b, kVar.f16393d, kVar.f16394e, kVar.f16396g, null);
        t tVar = kVar.a(cVar, vb.r.f22819a, kVar.f16391b, kVar.f16393d, kVar.f16394e, kVar.f16395f).f16398i;
        List list = nVar.f23864e;
        jc.l.d(list, "getValueParameterList(...)");
        cVar.R1(tVar.h(list, nVar, 1), n7.b0.h((h1) yd.d.f26174d.d(nVar.f23863d)));
        cVar.N1(eVar.E());
        cVar.f2728r = eVar.c0();
        cVar.f2732v = !yd.d.f26185o.d(nVar.f23863d).booleanValue();
        return cVar;
    }

    public final qe.r f(wd.b0 b0Var) {
        int i10;
        se.w wVarS;
        k kVar = this.f16423a;
        yd.f fVar = kVar.f16391b;
        f0 f0Var = kVar.f16393d;
        jc.l.e(b0Var, "proto");
        if ((b0Var.f23551c & 1) == 1) {
            i10 = b0Var.f23552d;
        } else {
            int i11 = b0Var.f23553e;
            i10 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i10;
        zc.h hVarC = c(b0Var, i12, 1);
        int i13 = b0Var.f23551c;
        zc.h aVar = ((i13 & 32) == 32 || (i13 & 64) == 64) ? new qe.a(kVar.f16390a.f16364a, new q(this, b0Var, 1, 1)) : zc.g.f26696a;
        qe.r rVar = new qe.r(kVar.f16392c, null, hVarC, x0.r(fVar, b0Var.f23554f), n7.b0.s((wd.c0) yd.d.f26186p.d(i12)), b0Var, kVar.f16391b, f0Var, ie.d.g(kVar.f16392c).a(x0.r(fVar, b0Var.f23554f)).equals(z.f16438a) ? yd.i.f26206b : kVar.f16394e, kVar.f16396g, null);
        List list = b0Var.f23557i;
        jc.l.d(list, "getTypeParameterList(...)");
        k kVarA = kVar.a(rVar, list, kVar.f16391b, kVar.f16393d, kVar.f16394e, kVar.f16395f);
        t tVar = kVarA.f16398i;
        id.h hVar = kVarA.f16397h;
        t0 t0VarQ = ud.e.Q(b0Var, f0Var);
        bd.a0 a0VarK = (t0VarQ == null || (wVarS = hVar.s(t0VarQ)) == null) ? null : ee.m.k(rVar, wVarS, aVar);
        yc.k kVar2 = kVar.f16392c;
        yc.e eVar = kVar2 instanceof yc.e ? (yc.e) kVar2 : null;
        bd.a0 a0VarT0 = eVar != null ? eVar.T0() : null;
        List listO = ud.e.o(b0Var, f0Var);
        List list2 = b0Var.f23563o;
        jc.l.d(list2, "getContextParameterList(...)");
        ArrayList arrayListB = tVar.b(listO, list2, b0Var, 1);
        List listF = hVar.f();
        List list3 = b0Var.f23564p;
        jc.l.d(list3, "getValueParameterList(...)");
        rVar.R1(a0VarK, a0VarT0, arrayListB, listF, tVar.h(list3, b0Var, 1), hVar.s(ud.e.U(b0Var, f0Var)), j.e((wd.d0) yd.d.f26175e.d(i12)), n7.b0.h((h1) yd.d.f26174d.d(i12)), vb.s.f22820a);
        rVar.f2723m = yd.d.f26187q.d(i12).booleanValue();
        rVar.f2724n = yd.d.f26188r.d(i12).booleanValue();
        rVar.f2725o = yd.d.f26191u.d(i12).booleanValue();
        rVar.f2726p = yd.d.f26189s.d(i12).booleanValue();
        rVar.f2727q = yd.d.f26190t.d(i12).booleanValue();
        rVar.f2731u = yd.d.f26192v.d(i12).booleanValue();
        rVar.f2728r = yd.d.f26193w.d(i12).booleanValue();
        rVar.f2732v = !yd.d.f26194x.d(i12).booleanValue();
        kVar.f16390a.f16376m.getClass();
        return rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Type inference failed for: r6v10, types: [yc.e] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qe.q g(wd.j0 r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.t.g(wd.j0, boolean):qe.q");
    }

    public final List h(List list, ce.m mVar, int i10) {
        int i11;
        se.w wVar;
        zc.h uVar;
        t tVar = this;
        k kVar = tVar.f16423a;
        f0 f0Var = kVar.f16393d;
        id.h hVar = kVar.f16397h;
        yc.k kVar2 = kVar.f16392c;
        jc.l.c(kVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        yc.b bVar = (yc.b) kVar2;
        yc.k kVarY = bVar.y();
        jc.l.d(kVarY, "getContainingDeclaration(...)");
        w wVarA = tVar.a(kVarY);
        List list2 = list;
        ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                ud.b.H();
                throw null;
            }
            b1 b1Var = (b1) obj;
            int i14 = (b1Var.f23576c & 1) == 1 ? b1Var.f23577d : 0;
            if (wVarA == null || !yd.d.f26173c.d(i14).booleanValue()) {
                i11 = i12;
                wVar = null;
                uVar = zc.g.f26696a;
            } else {
                i11 = i12;
                wVar = null;
                uVar = new qe.u(kVar.f16390a.f16364a, new s(tVar, wVarA, mVar, i10, i11, b1Var, 0));
            }
            be.e eVarR = x0.r(kVar.f16391b, b1Var.f23578e);
            se.w wVarS = hVar.s(ud.e.f0(b1Var, f0Var));
            boolean zBooleanValue = yd.d.H.d(i14).booleanValue();
            boolean zBooleanValue2 = yd.d.I.d(i14).booleanValue();
            boolean zBooleanValue3 = yd.d.J.d(i14).booleanValue();
            t0 t0VarI0 = ud.e.i0(b1Var, f0Var);
            se.w wVarS2 = t0VarI0 != null ? hVar.s(t0VarI0) : wVar;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new y0(bVar, null, i11, uVar, eVarR, wVarS, zBooleanValue, zBooleanValue2, zBooleanValue3, wVarS2, m0.p0));
            arrayList = arrayList2;
            i12 = i13;
            tVar = this;
        }
        return vb.m.G0(arrayList);
    }
}
