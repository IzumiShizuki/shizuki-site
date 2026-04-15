package ba;

import android.net.Uri;
import android.os.Build;
import android.view.View;
import b0.p1;
import bg.a2;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.j;
import i7.p2;
import j1.n;
import j1.q;
import j2.h0;
import j2.n1;
import j2.u2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jc.l;
import m0.i5;
import m0.j4;
import m0.p3;
import m0.r4;
import m0.s4;
import m0.t4;
import m0.v2;
import m0.z8;
import pc.f0;
import ub.a0;
import x0.n2;
import x0.o;
import x0.q1;
import x0.t1;
import x0.v;
import y.i1;
import y.j1;
import y.k;
import y.r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2459c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.f2457a = i10;
        this.f2458b = obj;
        this.f2459c = obj2;
    }

    private final Object f(Object obj) {
        t1 t1Var = (t1) this.f2458b;
        Throwable th2 = (Throwable) this.f2459c;
        Throwable th3 = (Throwable) obj;
        synchronized (t1Var.f24468b) {
            if (th2 == null) {
                th2 = null;
            } else if (th3 != null) {
                try {
                    if (th3 instanceof CancellationException) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        ub.a.a(th2, th3);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            t1Var.f24470d = th2;
            lf.b1 b1Var = t1Var.f24486t;
            q1 q1Var = q1.f24427a;
            b1Var.getClass();
            b1Var.m(null, q1Var);
        }
        return ub.a0.f21526a;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        androidx.lifecycle.q qVarF;
        int i10 = 6;
        int i11 = 2;
        int i12 = 3;
        final int i13 = 1;
        final int i14 = 0;
        switch (this.f2457a) {
            case 0:
                hf.y yVar = (hf.y) this.f2458b;
                z0 z0Var = (z0) this.f2459c;
                String str = (String) obj;
                jc.l.e(str, "keyword");
                hf.a0.y(yVar, null, null, new u0(str, z0Var, (yb.c) null), 3);
                return ub.a0.f21526a;
            case 1:
                d9.s sVar = (d9.s) this.f2458b;
                List list = (List) this.f2459c;
                z7.a aVar = (z7.a) obj;
                jc.l.e(aVar, "_connection");
                d9.c cVar = sVar.f5599b;
                List list2 = list;
                if (list2 != null) {
                    z7.c cVarD0 = aVar.d0("INSERT OR ABORT INTO `LyricBean` (`id`,`rj`,`sourceId`,`nameBin`,`nameEnc`,`lyricBin`,`lyricEnc`,`duration`,`documentUri`,`zipInnerPath`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)");
                    try {
                        for (Object obj2 : list2) {
                            if (obj2 != null) {
                                cVar.e(cVarD0, obj2);
                                cVarD0.Z();
                                cVarD0.reset();
                            }
                            break;
                        }
                        gh.g.m(cVarD0, null);
                    } finally {
                    }
                }
                return ub.a0.f21526a;
            case 2:
                final d9.x xVar = (d9.x) this.f2458b;
                String str2 = (String) this.f2459c;
                jc.l.e((z7.a) obj, "<unused var>");
                jc.l.e(str2, "content");
                n7.v vVar = xVar.f5614a;
                c9.h hVar = (c9.h) ua.l.W(vVar, true, false, new a9.j(i11, str2));
                if (hVar != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i15 = hVar.f3822a;
                    String str3 = hVar.f3824c;
                    jc.l.e(str3, "content");
                    final c9.h hVar2 = new c9.h(jCurrentTimeMillis, str3, i15);
                    ua.l.W(vVar, false, true, new ic.k() { // from class: d9.w
                        @Override // ic.k
                        public final Object a(Object obj3) {
                            z7.a aVar2 = (z7.a) obj3;
                            switch (i14) {
                                case 0:
                                    jc.l.e(aVar2, "_connection");
                                    xVar.f5616c.u(aVar2, hVar2);
                                    break;
                                default:
                                    jc.l.e(aVar2, "_connection");
                                    xVar.f5615b.w(aVar2, hVar2);
                                    break;
                            }
                            return a0.f21526a;
                        }
                    });
                } else {
                    final c9.h hVar3 = new c9.h(System.currentTimeMillis(), str2, 0);
                    ua.l.W(vVar, false, true, new ic.k() { // from class: d9.w
                        @Override // ic.k
                        public final Object a(Object obj3) {
                            z7.a aVar2 = (z7.a) obj3;
                            switch (i13) {
                                case 0:
                                    jc.l.e(aVar2, "_connection");
                                    xVar.f5616c.u(aVar2, hVar3);
                                    break;
                                default:
                                    jc.l.e(aVar2, "_connection");
                                    xVar.f5615b.w(aVar2, hVar3);
                                    break;
                            }
                            return a0.f21526a;
                        }
                    });
                }
                return ub.a0.f21526a;
            case 3:
                e7.u uVar = (e7.u) this.f2458b;
                h7.g gVar = ((e7.a0) this.f2459c).f6299b;
                e7.e0 e0Var = (e7.e0) obj;
                jc.l.e(e0Var, "$this$navOptions");
                e7.c0 c0Var = e0Var.f6318a;
                c0Var.f6308b = 0;
                c0Var.f6309c = 0;
                if (uVar instanceof e7.w) {
                    int i16 = e7.u.f6398e;
                    Iterator it = e7.g.b(uVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            e7.u uVar2 = (e7.u) it.next();
                            e7.u uVarF = gVar.f();
                            if (jc.l.a(uVar2, uVarF != null ? uVarF.f6401c : null)) {
                            }
                        } else {
                            int i17 = e7.w.f6408g;
                            e0Var.f6321d = ((e7.u) df.m.d0(df.m.b0(gVar.g(), new d9.i(17)))).f6400b.f8187a;
                            e0Var.f6322e = true;
                        }
                    }
                }
                return ub.a0.f21526a;
            case 4:
                return new p1(i12, (n2) this.f2458b, (f7.i) this.f2459c);
            case 5:
                e7.a0 a0Var = (e7.a0) this.f2458b;
                androidx.lifecycle.x xVar2 = (androidx.lifecycle.x) this.f2459c;
                a0Var.getClass();
                jc.l.e(xVar2, "owner");
                h7.g gVar2 = a0Var.f6299b;
                eg.b bVar = gVar2.f8176r;
                if (!xVar2.equals(gVar2.f8172n)) {
                    androidx.lifecycle.x xVar3 = gVar2.f8172n;
                    if (xVar3 != null && (qVarF = xVar3.f()) != null) {
                        qVarF.q1(bVar);
                    }
                    gVar2.f8172n = xVar2;
                    xVar2.f().W0(bVar);
                }
                return new f7.z();
            case 6:
                x0.w0 w0Var = (x0.w0) this.f2458b;
                hg.b bVar2 = (hg.b) this.f2459c;
                jc.l.e((x0.f0) obj, "$this$DisposableEffect");
                fg.b bVar3 = fg.b.f7085b;
                fg.b.c(bVar2.b(), new aa.d(w0Var, i10), w0Var, bVar2.f8628c);
                return new fg.c(w0Var, 0);
            case 7:
                ((jf.d) this.f2458b).f10869c.removeCallbacks((b5.h) this.f2459c);
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ic.n nVar = (ic.n) this.f2458b;
                x0.w0 w0Var2 = (x0.w0) this.f2459c;
                String str4 = (String) obj;
                jc.l.e(str4, "it");
                nVar.q((a2) w0Var2.getValue(), str4);
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                o1.i iVar = (o1.i) this.f2458b;
                u2 u2Var = (u2) this.f2459c;
                jc.l.e((h0.r0) obj, "$this$KeyboardActions");
                j2.h0.c(iVar);
                if (u2Var != null) {
                    ((n1) u2Var).a();
                }
                return ub.a0.f21526a;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new b0.h0(13, new t4((View) this.f2458b, (ic.a) this.f2459c));
            case 11:
                ArrayList arrayList = (ArrayList) this.f2458b;
                int[] iArr = (int[]) this.f2459c;
                g2.f1 f1Var = (g2.f1) obj;
                int size = arrayList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    g2.f1.k(f1Var, (g2.g1) arrayList.get(i18), 0, iArr[i18]);
                }
                return ub.a0.f21526a;
            case 12:
                p2 p2Var = (p2) this.f2459c;
                hf.y yVar2 = (hf.y) this.f2458b;
                q2.k kVar = (q2.k) obj;
                m0.x xVar4 = (m0.x) p2Var.f9258a;
                if (xVar4.f13851g.getValue() != r4.f13548a) {
                    q2.v.b(kVar, new j4(p2Var, yVar2, i11));
                    Object value = xVar4.f13851g.getValue();
                    r4 r4Var = r4.f13550c;
                    if (value == r4Var) {
                        kVar.l(q2.j.f17622s, new q2.a(null, new j4(p2Var, yVar2, i12)));
                    } else if (xVar4.d().f12652a.containsKey(r4Var)) {
                        kVar.l(q2.j.f17623t, new q2.a(null, new j4(p2Var, yVar2, i14)));
                    }
                }
                return ub.a0.f21526a;
            case 13:
                n2 n2Var = (n2) this.f2458b;
                n2 n2Var2 = (n2) this.f2459c;
                s1.d dVar = (s1.d) obj;
                float fQ = dVar.Q(i5.f13099e);
                float f10 = fQ / 2;
                q.t0.j(dVar, ((q1.q) n2Var.getValue()).f17577a, dVar.Q(i5.f13097c) - f10, 0L, new s1.h(fQ, 0.0f, 0, 0, 30), 108);
                if (Float.compare(((f3.f) n2Var2.getValue()).f6657a, 0) > 0) {
                    q.t0.j(dVar, ((q1.q) n2Var.getValue()).f17577a, dVar.Q(((f3.f) n2Var2.getValue()).f6657a) - f10, 0L, s1.g.f19351a, 108);
                }
                return ub.a0.f21526a;
            case 14:
                ((s4) this.f2458b).f13599a.setValue(new y.c0((y.e0) this.f2459c, (r1) obj));
                return ub.a0.f21526a;
            case 15:
                n9.e eVar = (n9.e) this.f2458b;
                a2 a2Var = (a2) this.f2459c;
                jc.l.e((Uri) obj, "it");
                eVar.w(a2Var.f2823f);
                return ub.a0.f21526a;
            case 16:
                e7.a0 a0Var2 = (e7.a0) this.f2458b;
                ic.o oVar = (ic.o) this.f2459c;
                jc.l.e((x0.f0) obj, "$this$DisposableEffect");
                na.k kVar2 = new na.k(oVar);
                a0Var2.getClass();
                h7.g gVar3 = a0Var2.f6299b;
                gVar3.getClass();
                gVar3.f8174p.add(kVar2);
                vb.j jVar = gVar3.f8164f;
                if (!jVar.isEmpty()) {
                    e7.j jVar2 = (e7.j) jVar.last();
                    e7.a0 a0Var3 = gVar3.f8159a;
                    e7.u uVar3 = jVar2.f6334b;
                    jVar2.f6340h.a();
                    kVar2.a(a0Var3, uVar3);
                }
                return new p1(i10, a0Var2, kVar2);
            case 17:
                e7.a0 a0Var4 = (e7.a0) this.f2458b;
                e7.a0 a0Var5 = (e7.a0) this.f2459c;
                a0.j jVar3 = (a0.j) obj;
                jc.l.e(jVar3, "$this$LazyColumn");
                jVar3.l(r9.b.A);
                for (r9.c cVar2 : r9.f.f18977a) {
                    jVar3.l(new f1.f(new la.d(cVar2.f18966c, cVar2.f18965b, a0Var4, cVar2.f18964a, 3), -1265505681, true));
                }
                jVar3.l(r9.b.B);
                jVar3.l(r9.b.D);
                jVar3.l(r9.b.E);
                List list3 = r9.f.f18978b;
                jVar3.m(list3.size(), null, new v(3, list3), new f1.f(new fa.s(i11, list3, a0Var4), -632812321, true));
                jVar3.l(r9.b.F);
                if (Build.VERSION.SDK_INT >= 23) {
                    jVar3.l(r9.b.G);
                }
                jVar3.l(new f1.f(new a9.q(a0Var5, i13), 2037047383, true));
                return ub.a0.f21526a;
            case 18:
                s0.i iVar2 = (s0.i) this.f2458b;
                iVar2.f19331m = (v2) this.f2459c;
                iVar2.j();
                return new s0.d();
            case 19:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2458b;
                final t9.g gVar4 = (t9.g) this.f2459c;
                a0.j jVar4 = (a0.j) obj;
                jc.l.e(jVar4, "$this$LazyColumn");
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    t9.a aVar2 = (t9.a) entry.getKey();
                    final j7.b bVar4 = (j7.b) entry.getValue();
                    String str5 = (String) ((Map) t9.e.f20581a.getValue()).get(aVar2);
                    if (str5 != null) {
                        int i19 = 4;
                        if (bVar4.c() != 0) {
                            f1.f fVar = new f1.f(new a9.o(i19, str5), 345221914, true);
                            ah.j jVar5 = jVar4.f68c;
                            o.x xVar5 = jVar4.f69d;
                            if (xVar5 == null) {
                                xVar5 = new o.x();
                                jVar4.f69d = xVar5;
                            }
                            xVar5.a(jVar5.f390b);
                            jVar4.l(new f1.f(new a0.i(fVar, jVar5.f390b), 1491981087, true));
                        }
                        a0.c.C(jVar4, bVar4.c(), null, new f1.f(new na.j(new f1.f(new ic.q() { // from class: t9.d
                            @Override // ic.q
                            public final Object k(a0.d dVar2, Integer num, Object obj3, o oVar2, Integer num2) {
                                int i20;
                                boolean z10;
                                int iIntValue = num.intValue();
                                c9.b bVar5 = (c9.b) obj3;
                                int iIntValue2 = num2.intValue();
                                if ((iIntValue2 & 48) == 0) {
                                    i20 = (oVar2.d(iIntValue) ? 32 : 16) | iIntValue2;
                                } else {
                                    i20 = iIntValue2;
                                }
                                if ((iIntValue2 & 384) == 0) {
                                    i20 |= oVar2.f(bVar5) ? 256 : 128;
                                }
                                if (!oVar2.N(i20 & 1, (i20 & 1169) != 1168)) {
                                    oVar2.Q();
                                } else if (bVar5 == null) {
                                    oVar2.W(1197811242);
                                    oVar2.p(false);
                                } else {
                                    oVar2.W(1197811243);
                                    q qVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.c(n.f9689a, 1.0f), 25, 0.0f, 2);
                                    j1 j1VarA = i1.a(k.f25161f, j1.c.f9672k, oVar2, 54);
                                    int iQ = v.q(oVar2);
                                    x0.j1 j1VarL = oVar2.l();
                                    q qVarC = j1.a.c(qVarL, oVar2);
                                    i2.k.f8771g0.getClass();
                                    i2.i iVar3 = j.f8733b;
                                    oVar2.a0();
                                    if (oVar2.S) {
                                        oVar2.k(iVar3);
                                    } else {
                                        oVar2.k0();
                                    }
                                    v.A(j.f8738g, j1VarA, oVar2);
                                    v.A(j.f8737f, j1VarL, oVar2);
                                    i2.h hVar4 = j.f8741j;
                                    if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                                        h0.s(iQ, oVar2, iQ, hVar4);
                                    }
                                    v.A(j.f8735d, qVarC, oVar2);
                                    z8.b(bVar5.f3774c, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                                    o oVar3 = oVar2;
                                    g gVar5 = gVar4;
                                    boolean zH = oVar3.h(gVar5) | oVar3.f(bVar5);
                                    Object objK = oVar3.K();
                                    if (zH || objK == x0.k.f24334a) {
                                        objK = new a9.d(26, gVar5, bVar5);
                                        oVar3.h0(objK);
                                    }
                                    p3.a((ic.a) objK, null, false, i.f20586a, oVar3, 24576, 14);
                                    oVar3.p(true);
                                    if (iIntValue != bVar4.c() - 1) {
                                        oVar3.W(1770594992);
                                        f0.b(null, 0L, 0.0f, 0.0f, oVar2, 0, 15);
                                        oVar3 = oVar2;
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                        oVar3.W(1765449457);
                                    }
                                    oVar3.p(z10);
                                    oVar3.p(z10);
                                }
                                return a0.f21526a;
                            }
                        }, 43291193, true), bVar4, i14), 896994514, true), 4);
                    }
                }
                return ub.a0.f21526a;
            case 20:
                x0.u uVar4 = (x0.u) this.f2458b;
                o.l0 l0Var = (o.l0) this.f2459c;
                uVar4.z(obj);
                if (l0Var != null) {
                    l0Var.a(obj);
                }
                return ub.a0.f21526a;
            case 21:
                return f(obj);
            default:
                xg.g gVar5 = (xg.g) this.f2458b;
                b5.d0 d0Var = (b5.d0) this.f2459c;
                jc.l.e((IOException) obj, "it");
                synchronized (gVar5) {
                    d0Var.h();
                }
                return ub.a0.f21526a;
        }
    }

    public /* synthetic */ q0(p2 p2Var, hf.y yVar) {
        this.f2457a = 12;
        this.f2459c = p2Var;
        this.f2458b = yVar;
    }
}
