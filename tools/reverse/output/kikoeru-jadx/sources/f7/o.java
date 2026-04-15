package f7;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import b7.b1;
import bg.a2;
import bg.d2;
import bg.o1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.a0;
import h0.c1;
import j2.n1;
import j2.u2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p4.c0;
import pc.f0;
import ug.d0;
import x0.e1;
import x0.w0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6786h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c2.x xVar, c1 c1Var, yb.c cVar) {
        super(2, cVar);
        this.f6783e = 4;
        this.f6785g = xVar;
        this.f6786h = c1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f6783e) {
            case 0:
                return new o((w0) this.f6784f, (q) this.f6785g, (h1.s) this.f6786h, cVar, 0);
            case 1:
                return new o((c9.c) this.f6784f, (AtomicInteger) this.f6785g, (AtomicInteger) this.f6786h, cVar, 1);
            case 2:
                return new o((c9.d) this.f6784f, (AtomicInteger) this.f6785g, (AtomicInteger) this.f6786h, cVar, 2);
            case 3:
                return new o((String) this.f6784f, (String) this.f6785g, (String) this.f6786h, cVar, 3);
            case 4:
                o oVar = new o((c2.x) this.f6785g, (c1) this.f6786h, cVar);
                oVar.f6784f = obj;
                return oVar;
            case 5:
                return new o((ia.b) this.f6784f, (Context) this.f6785g, (String) this.f6786h, cVar, 5);
            case 6:
                return new o((List) this.f6784f, this.f6785g, (j9.f) this.f6786h, cVar, 6);
            case 7:
                return new o((List) this.f6784f, (bg.z) this.f6785g, (ArrayList) this.f6786h, cVar, 7);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new o((List) this.f6784f, (bg.z) this.f6785g, (String) this.f6786h, cVar, 8);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                o oVar2 = new o((w0) this.f6784f, (w0) this.f6786h, cVar);
                oVar2.f6785g = obj;
                return oVar2;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new o((w0) this.f6784f, (o1.r) this.f6785g, (u2) this.f6786h, cVar, 10);
            default:
                return new o((hf.y) this.f6785g, (a0) this.f6786h, (w0) this.f6784f, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f6783e) {
            case 0:
                o oVar = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var = ub.a0.f21526a;
                oVar.u(a0Var);
                return a0Var;
            case 1:
                o oVar2 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var2 = ub.a0.f21526a;
                oVar2.u(a0Var2);
                return a0Var2;
            case 2:
                o oVar3 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var3 = ub.a0.f21526a;
                oVar3.u(a0Var3);
                return a0Var3;
            case 3:
                o oVar4 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var4 = ub.a0.f21526a;
                oVar4.u(a0Var4);
                return a0Var4;
            case 4:
                return ((o) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 5:
                o oVar5 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var5 = ub.a0.f21526a;
                oVar5.u(a0Var5);
                return a0Var5;
            case 6:
                o oVar6 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var6 = ub.a0.f21526a;
                oVar6.u(a0Var6);
                return a0Var6;
            case 7:
                o oVar7 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var7 = ub.a0.f21526a;
                oVar7.u(a0Var7);
                return a0Var7;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                o oVar8 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var8 = ub.a0.f21526a;
                oVar8.u(a0Var8);
                return a0Var8;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return ((o) o((a2) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                o oVar9 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var9 = ub.a0.f21526a;
                oVar9.u(a0Var9);
                return a0Var9;
            default:
                o oVar10 = (o) o((hf.y) obj, (yb.c) obj2);
                ub.a0 a0Var10 = ub.a0.f21526a;
                oVar10.u(a0Var10);
                return a0Var10;
        }
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.List] */
    @Override // ac.a
    public final Object u(Object obj) {
        h1.z zVar;
        Object objB;
        a2 a2Var;
        d0 d0VarF;
        String strN;
        int i10 = this.f6783e;
        int i11 = 2;
        boolean z10 = true;
        z10 = true;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f6786h;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                Set<e7.j> set = (Set) ((w0) this.f6784f).getValue();
                q qVar = (q) this.f6785g;
                h1.s sVar = (h1.s) obj2;
                for (e7.j jVar : set) {
                    if (!((List) qVar.b().f6357e.f12434a.getValue()).contains(jVar) && !sVar.contains(jVar)) {
                        qVar.b().c(jVar);
                    }
                }
                return a0Var;
            case 1:
                ub.a.f(obj);
                String str = ag.z.f369a;
                String strF = a9.i.f();
                c9.c cVar = (c9.c) this.f6784f;
                Object objI = ag.z.i(cVar.f3777c, strF, false);
                AtomicInteger atomicInteger = (AtomicInteger) this.f6785g;
                if (!(objI instanceof ub.m)) {
                    a9.i.c().s().b(f0.T((a2) objI, cVar.f3775a));
                    atomicInteger.incrementAndGet();
                }
                AtomicInteger atomicInteger2 = (AtomicInteger) obj2;
                if (ub.n.a(objI) != null) {
                    atomicInteger2.incrementAndGet();
                }
                return a0Var;
            case 2:
                ub.a.f(obj);
                String str2 = ag.z.f369a;
                String strF2 = a9.i.f();
                c9.d dVar = (c9.d) this.f6784f;
                Object objI2 = ag.z.i(dVar.f3790c, strF2, false);
                AtomicInteger atomicInteger3 = (AtomicInteger) this.f6785g;
                if (!(objI2 instanceof ub.m)) {
                    a9.i.c().t().a(a.a.X((a2) objI2, dVar.f3788a));
                    atomicInteger3.incrementAndGet();
                }
                AtomicInteger atomicInteger4 = (AtomicInteger) obj2;
                if (ub.n.a(objI2) != null) {
                    atomicInteger4.incrementAndGet();
                }
                return a0Var;
            case 3:
                ub.a.f(obj);
                ((d9.g) a9.i.c().f4312q.getValue()).a(new c9.a(0, (String) this.f6784f, (String) this.f6785g, (String) obj2, a9.i.f(), System.currentTimeMillis()));
                return a0Var;
            case 4:
                ub.a.f(obj);
                hf.y yVar = (hf.y) this.f6784f;
                c2.x xVar = (c2.x) this.f6785g;
                c1 c1Var = (c1) obj2;
                yb.c cVar2 = null;
                h0.d0 d0Var = new h0.d0(xVar, c1Var, cVar2, z10 ? 1 : 0);
                hf.z zVar2 = hf.z.f8619d;
                hf.a0.y(yVar, null, zVar2, d0Var, 1);
                return hf.a0.y(yVar, null, zVar2, new h0.d0(xVar, c1Var, cVar2, i11), 1);
            case 5:
                ub.a.f(obj);
                ia.b bVar = (ia.b) this.f6784f;
                Context context = (Context) this.f6785g;
                String str3 = (String) obj2;
                bVar.getClass();
                jc.l.e(context, "ctx");
                e1 e1Var = bVar.f9495b;
                if (((ExoPlayer) e1Var.getValue()) == null) {
                    v4.n nVar = new v4.n(context);
                    j5.q qVar2 = new j5.q(a9.i.a());
                    i9.e eVar = new i9.e();
                    qVar2.f10386b = eVar;
                    d0.y yVar2 = qVar2.f10385a;
                    if (eVar != ((s4.g) yVar2.f5434e)) {
                        yVar2.f5434e = eVar;
                        ((HashMap) yVar2.f5432c).clear();
                        ((HashMap) yVar2.f5433d).clear();
                    }
                    p4.c.i(!nVar.f22598t);
                    nVar.f22582d = new j5.o(2, qVar2);
                    p4.c.i(!nVar.f22598t);
                    nVar.f22598t = true;
                    int i12 = c0.f16548a;
                    v4.v vVar = new v4.v(nVar);
                    vVar.A0(i0.u(m4.i0.b(str3)));
                    vVar.c();
                    vVar.k();
                    e1Var.setValue(vVar);
                }
                return a0Var;
            case 6:
                ub.a.f(obj);
                List list = (List) this.f6784f;
                ?? r22 = this.f6785g;
                vb.m.P(list, (Iterable) r22);
                if (r22.isEmpty()) {
                    list.add((j9.f) obj2);
                }
                return a0Var;
            case 7:
                ub.a.f(obj);
                ((List) this.f6784f).add(new j9.f(99, ((bg.z) this.f6785g).f2996d, null, j9.d0.f10675b, null, (ArrayList) obj2, null, 368));
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ub.a.f(obj);
                ((List) this.f6784f).add(new j9.f(99, ((bg.z) this.f6785g).f2996d, (String) obj2, j9.d0.f10675b, null, null, null, 496));
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                a2 a2Var2 = (a2) this.f6785g;
                ub.a.f(obj);
                if (((Boolean) ((w0) this.f6784f).getValue()).booleanValue()) {
                    wb.b bVarL = ud.b.l();
                    bVarL.add(a2Var2.f2839v);
                    bVarL.add(a2Var2.f2827j);
                    List list2 = a2Var2.f2841x;
                    ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((o1) it.next()).f2936c);
                    }
                    bVarL.addAll(arrayList);
                    List list3 = a2Var2.f2838u;
                    ArrayList arrayList2 = new ArrayList(vb.n.K(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((bg.e1) it2.next()).f2869c);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (obj3 != null) {
                            arrayList3.add(obj3);
                        }
                    }
                    bVarL.addAll(arrayList3);
                    wb.b bVarG = ud.b.g(bVarL);
                    w0 w0Var = (w0) obj2;
                    if (bVarG == null || !bVarG.isEmpty()) {
                        ListIterator listIterator = bVarG.listIterator(0);
                        do {
                            zVar = (h1.z) listIterator;
                            if (!zVar.hasNext()) {
                                z10 = false;
                            }
                        } while (!ef.n.n0((String) zVar.next(), (String) w0Var.getValue(), true));
                    } else {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ub.a.f(obj);
                if (((Boolean) ((w0) this.f6784f).getValue()).booleanValue()) {
                    o1.r.b((o1.r) this.f6785g);
                    u2 u2Var = (u2) obj2;
                    if (u2Var != null) {
                        ((n1) u2Var).b();
                    }
                }
                return a0Var;
            default:
                ub.a.f(obj);
                String str4 = ag.z.f369a;
                String strF3 = a9.i.f();
                jc.l.e(strF3, "token");
                ch.l lVarD = a0.c.D(ag.z.f369a.concat("/api/works?order=betterRandom"));
                lVarD.w("authorization", "Bearer ".concat(strF3));
                lVarD.p(ug.g.f21779n);
                try {
                    d0VarF = ag.z.f370b.a(new b1(lVarD)).f();
                    try {
                        ug.f0 f0Var = d0VarF.f21762g;
                        jc.l.b(f0Var);
                        strN = f0Var.n();
                    } finally {
                    }
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = ag.z.f371c;
                objB = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(d2.class)));
                d0VarF.close();
                hf.y yVar3 = (hf.y) this.f6785g;
                a0 a0Var2 = (a0) obj2;
                yb.c cVar3 = null;
                if (!(objB instanceof ub.m) && (a2Var = (a2) vb.m.b0(0, ((d2) objB).f2862b)) != null) {
                    hf.a0.y(yVar3, null, null, new b9.b(a0Var2, a2Var.f2823f, cVar3, 3), 3);
                }
                w0 w0Var2 = (w0) this.f6784f;
                List list4 = r9.f.f18977a;
                w0Var2.setValue(null);
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hf.y yVar, a0 a0Var, w0 w0Var, yb.c cVar) {
        super(2, cVar);
        this.f6783e = 11;
        this.f6785g = yVar;
        this.f6786h = a0Var;
        this.f6784f = w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, yb.c cVar, int i10) {
        super(2, cVar);
        this.f6783e = i10;
        this.f6784f = obj;
        this.f6785g = obj2;
        this.f6786h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w0 w0Var, w0 w0Var2, yb.c cVar) {
        super(2, cVar);
        this.f6783e = 9;
        this.f6784f = w0Var;
        this.f6786h = w0Var2;
    }
}
