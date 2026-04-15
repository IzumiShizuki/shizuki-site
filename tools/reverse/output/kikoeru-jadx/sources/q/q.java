package q;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.a2;
import x0.l2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f17407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f17408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f17409i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.lifecycle.q qVar, yb.c cVar) {
        super(2, cVar);
        this.f17405e = 4;
        this.f17409i = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r2v19, types: [ac.i, ic.n] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f17405e) {
            case 0:
                q qVar = new q((r.q1) this.f17408h, (x0.w0) this.f17409i, cVar, 0);
                qVar.f17407g = obj;
                return qVar;
            case 1:
                return new q((String) this.f17408h, (q9.r0) this.f17409i, cVar, 1);
            case 2:
                return new q((List) this.f17407g, (bg.p) this.f17408h, (q9.o) this.f17409i, cVar, 2);
            case 3:
                q qVar2 = new q((x0.w0) this.f17408h, cVar);
                qVar2.f17407g = obj;
                return qVar2;
            case 4:
                return new q((androidx.lifecycle.q) this.f17409i, cVar);
            case 5:
                return new q((w.k) this.f17407g, (w.j) this.f17408h, (hf.n0) this.f17409i, cVar, 5);
            case 6:
                q qVar3 = new q((s7.d) this.f17408h, (c2) this.f17409i, cVar, 6);
                qVar3.f17407g = obj;
                return qVar3;
            case 7:
                q qVar4 = new q((String) this.f17408h, (n7.w) this.f17409i, cVar, 7);
                qVar4.f17407g = obj;
                return qVar4;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new q((tc.b0) this.f17407g, (s.v0) this.f17408h, (ic.n) this.f17409i, cVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                q qVar5 = new q((u.k) this.f17408h, (ic.n) this.f17409i, cVar, 9);
                qVar5.f17407g = obj;
                return qVar5;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new q((u.k) this.f17407g, (s.v0) this.f17408h, (ic.n) this.f17409i, cVar, 10);
            case 11:
                q qVar6 = new q((u.j0) this.f17408h, (u.n0) this.f17409i, cVar, 11);
                qVar6.f17407g = obj;
                return qVar6;
            case 12:
                q qVar7 = new q((u.j0) this.f17408h, (u.c2) this.f17409i, cVar, 12);
                qVar7.f17407g = obj;
                return qVar7;
            case 13:
                q qVar8 = new q((u.c2) this.f17408h, (ic.n) this.f17409i, cVar, 13);
                qVar8.f17407g = obj;
                return qVar8;
            case 14:
                return new q((ic.o) this.f17407g, (u.i1) this.f17408h, (c2.t) this.f17409i, cVar);
            case 15:
                q qVar9 = new q((hf.d1) this.f17408h, (ac.i) this.f17409i, cVar);
                qVar9.f17407g = obj;
                return qVar9;
            case 16:
                q qVar10 = new q((w.k) this.f17408h, (u0.a) this.f17409i, cVar, 16);
                qVar10.f17407g = obj;
                return qVar10;
            case 17:
                return new q((uh.j) this.f17407g, (x0.w0) this.f17409i, (x0.w0) this.f17408h, cVar);
            case 18:
                return new q((v0.l0) this.f17407g, (s.v0) this.f17408h, (ic.n) this.f17409i, cVar);
            case 19:
                q qVar11 = new q((x0.s1) this.f17408h, (x0.s0) this.f17409i, cVar, 19);
                qVar11.f17407g = obj;
                return qVar11;
            default:
                q qVar12 = new q((yb.h) this.f17408h, (lf.f) this.f17409i, cVar, 20);
                qVar12.f17407g = obj;
                return qVar12;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f17405e) {
            case 0:
                return ((q) o((x0.l1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 2:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 3:
                return ((q) o((bg.p) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 4:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 5:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 6:
                return ((q) o((n7.a0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 7:
                return ((q) o((n7.a0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return ((q) o((u.k1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 11:
                return ((q) o((m0.v) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 12:
                return ((q) o((a2) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 13:
                return ((q) o((u.k1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 14:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 15:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 16:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 17:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 18:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 19:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((q) o((x0.l1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v98, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r15v1, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r15v4, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r2v46, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, ub.h] */
    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        q9.r0 r0Var;
        Object objH;
        x0.w0 w0Var;
        Object objH2;
        rf.c cVar;
        hf.y yVar;
        int i10 = this.f17405e;
        int i11 = 5;
        int i12 = 9;
        int i13 = 0;
        int i14 = 10;
        yb.c cVar2 = null;
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        switch (i10) {
            case 0:
                r.q1 q1Var = (r.q1) this.f17408h;
                int i15 = this.f17406f;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                x0.l1 l1Var = (x0.l1) this.f17407g;
                i7.n nVarB = x0.v.B(new p(q1Var, i13));
                f7.v vVar = new f7.v(l1Var, q1Var, (x0.w0) this.f17409i);
                this.f17406f = 1;
                return nVarB.b(vVar, this) == aVar ? aVar : a0Var;
            case 1:
                int i16 = this.f17406f;
                if (i16 == 0) {
                    ub.a.f(obj);
                    String str = (String) this.f17408h;
                    if (str == null) {
                        return a0Var;
                    }
                    r0Var = (q9.r0) this.f17409i;
                    this.f17407g = r0Var;
                    this.f17406f = 1;
                    pf.e eVar = hf.l0.f8566a;
                    objH = hf.a0.H(pf.d.f17138c, new ba.x0(str, cVar2, 8), this);
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q9.r0 r0Var2 = (q9.r0) this.f17407g;
                    ub.a.f(obj);
                    r0Var = r0Var2;
                    objH = obj;
                }
                r0Var.f18089f.setValue((bg.p) objH);
                return a0Var;
            case 2:
                bg.p pVar = (bg.p) this.f17408h;
                int i17 = this.f17406f;
                if (i17 == 0) {
                    ub.a.f(obj);
                    List list = (List) this.f17407g;
                    ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ef.u.h0((String) it.next(), "rj", "", true));
                    }
                    String str2 = pVar.f2937a;
                    this.f17406f = 1;
                    if (q9.r0.f18084g.o(str2, arrayList, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    ((ub.n) obj).getClass();
                }
                ((q9.o) this.f17409i).w(pVar, true);
                return a0Var;
            case 3:
                bg.p pVar2 = (bg.p) this.f17407g;
                int i18 = this.f17406f;
                if (i18 == 0) {
                    ub.a.f(obj);
                    w0Var = (x0.w0) this.f17408h;
                    String str3 = pVar2.f2937a;
                    this.f17407g = null;
                    this.f17409i = w0Var;
                    this.f17406f = 1;
                    pf.e eVar2 = hf.l0.f8566a;
                    objH2 = hf.a0.H(pf.d.f17138c, new ba.x0(str3, cVar2, i11), this);
                    if (objH2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x0.w0 w0Var2 = (x0.w0) this.f17409i;
                    ub.a.f(obj);
                    w0Var = w0Var2;
                    objH2 = obj;
                }
                Boolean bool = (Boolean) objH2;
                bool.getClass();
                w0Var.setValue(bool);
                return a0Var;
            case 4:
                androidx.lifecycle.q qVar = (androidx.lifecycle.q) this.f17409i;
                int i19 = this.f17406f;
                if (i19 == 0) {
                    ub.a.f(obj);
                    r.w0 w0Var3 = (r.w0) qVar;
                    w0Var3.getClass();
                    ((h1.y) r.t1.f18582a.getValue()).d(w0Var3, r.g1.f18415e, w0Var3.f18609g);
                    cVar = w0Var3.f18612j;
                    this.f17407g = cVar;
                    this.f17408h = qVar;
                    this.f17406f = 1;
                    if (cVar.g(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (androidx.lifecycle.q) this.f17408h;
                    cVar = (rf.c) this.f17407g;
                    ub.a.f(obj);
                }
                try {
                    ((r.w0) qVar).f18606d = qVar.g1();
                    hf.k kVar = ((r.w0) qVar).f18611i;
                    if (kVar != null) {
                        kVar.h(qVar.g1());
                    }
                    ((r.w0) qVar).f18611i = null;
                    cVar.b(null);
                    return a0Var;
                } catch (Throwable th2) {
                    cVar.b(null);
                    throw th2;
                }
            case 5:
                int i20 = this.f17406f;
                if (i20 == 0) {
                    ub.a.f(obj);
                    w.k kVar2 = (w.k) this.f17407g;
                    w.j jVar = (w.j) this.f17408h;
                    this.f17406f = 1;
                    if (kVar2.a(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                hf.n0 n0Var = (hf.n0) this.f17409i;
                if (n0Var == null) {
                    return a0Var;
                }
                n0Var.a();
                return a0Var;
            case 6:
                int i21 = this.f17406f;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                n7.a0 a0Var2 = (n7.a0) this.f17407g;
                lf.w0 w0Var4 = new lf.w0((s7.d) this.f17408h, (c2) this.f17409i, cVar2, 18);
                this.f17406f = 1;
                Object objD = a0Var2.d(n7.z.f15595a, w0Var4, this);
                return objD == aVar ? aVar : objD;
            case 7:
                int i22 = this.f17406f;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                n7.a0 a0Var3 = (n7.a0) this.f17407g;
                String str4 = (String) this.f17408h;
                d9.e eVar3 = new d9.e((n7.w) this.f17409i, i11);
                this.f17406f = 1;
                Object objA = a0Var3.a(str4, eVar3, this);
                return objA == aVar ? aVar : objA;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                int i23 = this.f17406f;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                tc.b0 b0Var = (tc.b0) this.f17407g;
                s.y0 y0Var = (s.y0) b0Var.f20620d;
                m0.v vVar2 = (m0.v) b0Var.f20619c;
                s.v0 v0Var = (s.v0) this.f17408h;
                ?? r15 = (ac.i) this.f17409i;
                this.f17406f = 1;
                y0Var.getClass();
                return hf.a0.k(new s.x0(v0Var, y0Var, r15, vVar2, null), this) == aVar ? aVar : a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.e1 e1Var = ((u.k) this.f17408h).f20972d;
                int i24 = this.f17406f;
                try {
                    if (i24 == 0) {
                        ub.a.f(obj);
                        u.k1 k1Var = (u.k1) this.f17407g;
                        e1Var.setValue(Boolean.TRUE);
                        ic.n nVar = (ic.n) this.f17409i;
                        this.f17406f = 1;
                        if (nVar.q(k1Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i24 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ub.a.f(obj);
                    }
                    return a0Var;
                } finally {
                    e1Var.setValue(Boolean.FALSE);
                }
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                int i25 = this.f17406f;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                u.k kVar3 = (u.k) this.f17407g;
                s.y0 y0Var2 = kVar3.f20971c;
                u.j jVar2 = kVar3.f20970b;
                s.v0 v0Var2 = (s.v0) this.f17408h;
                q qVar2 = new q(kVar3, (ic.n) this.f17409i, cVar2, i12);
                this.f17406f = 1;
                y0Var2.getClass();
                return hf.a0.k(new s.x0(v0Var2, y0Var2, qVar2, jVar2, null), this) == aVar ? aVar : a0Var;
            case 11:
                int i26 = this.f17406f;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                m0.v vVar3 = (m0.v) this.f17407g;
                u.j0 j0Var = (u.j0) this.f17408h;
                r.p1 p1Var = new r.p1(i12, vVar3, (u.n0) this.f17409i);
                this.f17406f = 1;
                return j0Var.q(p1Var, this) == aVar ? aVar : a0Var;
            case 12:
                int i27 = this.f17406f;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                a2 a2Var = (a2) this.f17407g;
                u.j0 j0Var2 = (u.j0) this.f17408h;
                r.p1 p1Var2 = new r.p1(i14, a2Var, (u.c2) this.f17409i);
                this.f17406f = 1;
                return j0Var2.q(p1Var2, this) == aVar ? aVar : a0Var;
            case 13:
                int i28 = this.f17406f;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                u.k1 k1Var2 = (u.k1) this.f17407g;
                u.c2 c2Var = (u.c2) this.f17408h;
                c2Var.f20853j = k1Var2;
                ic.n nVar2 = (ic.n) this.f17409i;
                a2 a2Var2 = c2Var.f20854k;
                this.f17406f = 1;
                return nVar2.q(a2Var2, this) == aVar ? aVar : a0Var;
            case 14:
                int i29 = this.f17406f;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                ?? r0 = (ac.i) this.f17407g;
                u.i1 i1Var = (u.i1) this.f17408h;
                p1.b bVar = new p1.b(((c2.t) this.f17409i).f3324c);
                this.f17406f = 1;
                return r0.g(i1Var, bVar, this) == aVar ? aVar : a0Var;
            case 15:
                int i30 = this.f17406f;
                if (i30 == 0) {
                    ub.a.f(obj);
                    yVar = (hf.y) this.f17407g;
                    hf.d1 d1Var = (hf.d1) this.f17408h;
                    this.f17407g = yVar;
                    this.f17406f = 1;
                    if (d1Var.Y(this) != aVar) {
                    }
                    return aVar;
                }
                if (i30 != 1) {
                    if (i30 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                yVar = (hf.y) this.f17407g;
                ub.a.f(obj);
                ?? r22 = (ac.i) this.f17409i;
                this.f17407g = null;
                this.f17406f = 2;
                if (r22.q(yVar, this) != aVar) {
                    return a0Var;
                }
                return aVar;
            case 16:
                int i31 = this.f17406f;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                hf.y yVar2 = (hf.y) this.f17407g;
                lf.o0 o0Var = ((w.k) this.f17408h).f22978a;
                i7.s0 s0Var = new i7.s0(i14, (u0.a) this.f17409i, yVar2);
                this.f17406f = 1;
                o0Var.getClass();
                lf.o0.m(o0Var, s0Var, this);
                return aVar;
            case 17:
                x0.w0 w0Var5 = (x0.w0) this.f17408h;
                uh.j jVar3 = (uh.j) this.f17407g;
                int i32 = this.f17406f;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                long jH = p1.b.h(((p1.b) ((x0.w0) this.f17409i).getValue()).f16481a, ((p1.b) jVar3.f22011c.b()).f16481a);
                long jB = u3.x0.b((((int) (((f3.l) w0Var5.getValue()).f6666a >> 32)) / 2.0f) + p1.b.e(jH), (((int) (((f3.l) w0Var5.getValue()).f6666a & 4294967295L)) / 2.0f) + p1.b.f(jH));
                uh.y yVar3 = jVar3.f22009a;
                Object obj2 = jVar3.f22010b;
                this.f17406f = 1;
                return yVar3.g(obj2, jB, this) == aVar ? aVar : a0Var;
            case 18:
                v0.l0 l0Var = (v0.l0) this.f17407g;
                x0.e1 e1Var2 = l0Var.f22264i;
                int i33 = this.f17406f;
                if (i33 == 0) {
                    ub.a.f(obj);
                    e1Var2.setValue(Boolean.TRUE);
                    s.y0 y0Var3 = l0Var.f22269n;
                    m0.v vVar4 = l0Var.f22268m;
                    s.v0 v0Var3 = (s.v0) this.f17408h;
                    ?? r152 = (ac.i) this.f17409i;
                    this.f17406f = 1;
                    y0Var3.getClass();
                    if (hf.a0.k(new s.x0(v0Var3, y0Var3, r152, vVar4, null), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                e1Var2.setValue(Boolean.FALSE);
                return a0Var;
            case 19:
                int i34 = this.f17406f;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                hf.y yVar4 = (hf.y) this.f17407g;
                x0.s1 s1Var = (x0.s1) this.f17408h;
                x0.s0 s0Var2 = (x0.s0) this.f17409i;
                this.f17406f = 1;
                s1Var.g(yVar4, s0Var2, this);
                return aVar;
            default:
                lf.f fVar = (lf.f) this.f17409i;
                yb.h hVar = (yb.h) this.f17408h;
                int i35 = this.f17406f;
                if (i35 != 0) {
                    if (i35 != 1 && i35 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                x0.l1 l1Var2 = (x0.l1) this.f17407g;
                if (jc.l.a(hVar, yb.i.f26088a)) {
                    l2 l2Var = new l2(l1Var2, 0);
                    this.f17406f = 1;
                    if (fVar.b(l2Var, this) != aVar) {
                        return a0Var;
                    }
                } else {
                    lf.w0 w0Var6 = new lf.w0(fVar, l1Var2, cVar2, 26);
                    this.f17406f = 2;
                    if (hf.a0.H(hVar, w0Var6, this) != aVar) {
                        return a0Var;
                    }
                }
                return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(hf.d1 d1Var, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f17405e = 15;
        this.f17408h = d1Var;
        this.f17409i = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(ic.o oVar, u.i1 i1Var, c2.t tVar, yb.c cVar) {
        super(2, cVar);
        this.f17405e = 14;
        this.f17407g = (ac.i) oVar;
        this.f17408h = i1Var;
        this.f17409i = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, Object obj3, yb.c cVar, int i10) {
        super(2, cVar);
        this.f17405e = i10;
        this.f17407g = obj;
        this.f17408h = obj2;
        this.f17409i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f17405e = i10;
        this.f17408h = obj;
        this.f17409i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(tc.b0 b0Var, s.v0 v0Var, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f17405e = 8;
        this.f17407g = b0Var;
        this.f17408h = v0Var;
        this.f17409i = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(uh.j jVar, x0.w0 w0Var, x0.w0 w0Var2, yb.c cVar) {
        super(2, cVar);
        this.f17405e = 17;
        this.f17407g = jVar;
        this.f17409i = w0Var;
        this.f17408h = w0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(v0.l0 l0Var, s.v0 v0Var, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f17405e = 18;
        this.f17407g = l0Var;
        this.f17408h = v0Var;
        this.f17409i = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x0.w0 w0Var, yb.c cVar) {
        super(2, cVar);
        this.f17405e = 3;
        this.f17408h = w0Var;
    }
}
