package q9;

import com.cnl.kikoeru.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import m0.a5;
import m0.d9;
import m0.e9;
import m0.l3;
import m0.z8;
import x0.j1;
import x0.w0;
import y.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f18080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f18081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f18082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.k f18083e;

    public /* synthetic */ r(w0 w0Var, w0 w0Var2, w0 w0Var3, ic.k kVar, int i10) {
        this.f18079a = i10;
        this.f18080b = w0Var;
        this.f18081c = w0Var2;
        this.f18082d = w0Var3;
        this.f18083e = kVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f18079a;
        j1.n nVar = j1.n.f9689a;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    android.support.v4.media.session.b.m(gh.g.k(androidx.compose.foundation.layout.a.l(nVar, 20, 0.0f, 2), g0.g.a(5)), null, 0L, 0L, null, 0.0f, f1.g.f(-547020287, new r(this.f18080b, this.f18081c, this.f18082d, this.f18083e, 1), oVar), oVar, 1572864, 62);
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    j1.q qVarJ = androidx.compose.foundation.layout.a.j(nVar, 10);
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
                    int iQ = x0.v.q(oVar2);
                    j1 j1VarL = oVar2.l();
                    j1.q qVarC = j1.a.c(qVarJ, oVar2);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    i2.h hVar = i2.j.f8738g;
                    x0.v.A(hVar, vVarA, oVar2);
                    i2.h hVar2 = i2.j.f8737f;
                    x0.v.A(hVar2, j1VarL, oVar2);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar2, iQ, hVar3);
                    }
                    i2.h hVar4 = i2.j.f8735d;
                    x0.v.A(hVar4, qVarC, oVar2);
                    Object objK = oVar2.K();
                    x0.r0 r0Var = x0.k.f24334a;
                    if (objK == r0Var) {
                        objK = new o1.r();
                        oVar2.h0(objK);
                    }
                    o1.r rVar = (o1.r) objK;
                    w0 w0Var = this.f18080b;
                    String str = (String) w0Var.getValue();
                    j1.q qVarF = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.c.c(androidx.compose.ui.focus.a.b(nVar, rVar), 1.0f), 0.0f, 500, 1);
                    Object objK2 = oVar2.K();
                    final w0 w0Var2 = this.f18081c;
                    if (objK2 == r0Var) {
                        objK2 = new y2.g0() { // from class: q9.v
                            @Override // y2.g0
                            public final y2.d0 a(t2.g gVar) {
                                List listW;
                                jc.l.e(gVar, "it");
                                String str2 = gVar.f20320b;
                                t2.d dVar = new t2.d();
                                ef.l lVar = w.f18120a;
                                lVar.getClass();
                                jc.l.e(str2, "input");
                                if (str2.length() < 0) {
                                    throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str2.length());
                                }
                                df.r rVarE0 = df.m.e0(new df.j(new a9.d(10, lVar, str2), ef.k.f6575i), new l3(17));
                                lVar.getClass();
                                jc.l.e(str2, "input");
                                Matcher matcher = lVar.f6576a.matcher(str2);
                                if (matcher.find()) {
                                    ArrayList arrayList = new ArrayList(10);
                                    int iEnd = 0;
                                    do {
                                        arrayList.add(str2.subSequence(iEnd, matcher.start()).toString());
                                        iEnd = matcher.end();
                                    } while (matcher.find());
                                    arrayList.add(str2.subSequence(iEnd, str2.length()).toString());
                                    listW = arrayList;
                                } else {
                                    listW = ud.b.w(str2.toString());
                                }
                                List listX = ud.b.x(new t2.d0(ja.a.f10792i, 0L, (x2.k) null, (x2.i) null, (x2.j) null, (x2.n) null, (String) null, 0L, (e3.a) null, (e3.p) null, (a3.c) null, 0L, (e3.l) null, (q1.k0) null, 65534), new t2.d0(ja.a.f10790g, 0L, (x2.k) null, (x2.i) null, (x2.j) null, (x2.n) null, (String) null, 0L, (e3.a) null, (e3.p) null, (a3.c) null, 0L, (e3.l) null, (q1.k0) null, 65534), new t2.d0(ja.a.f10791h, 0L, (x2.k) null, (x2.i) null, (x2.j) null, (x2.n) null, (String) null, 0L, (e3.a) null, (e3.p) null, (a3.c) null, 0L, (e3.l) null, (q1.k0) null, 65534), new t2.d0(ja.a.f10784a, 0L, (x2.k) null, (x2.i) null, (x2.j) null, (x2.n) null, (String) null, 0L, (e3.a) null, (e3.p) null, (a3.c) null, 0L, (e3.l) null, (q1.k0) null, 65534), new t2.d0(ja.a.f10789f, 0L, (x2.k) null, (x2.i) null, (x2.j) null, (x2.n) null, (String) null, 0L, (e3.a) null, (e3.p) null, (a3.c) null, 0L, (e3.l) null, (q1.k0) null, 65534));
                                String str3 = (String) listW.get(0);
                                StringBuilder sb = dVar.f20290a;
                                sb.append(str3);
                                Iterator it = rVarE0.f6007a.iterator();
                                int i11 = 0;
                                while (it.hasNext()) {
                                    Object objA = rVarE0.f6008b.a(it.next());
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        ud.b.H();
                                        throw null;
                                    }
                                    String str4 = (String) objA;
                                    t2.c cVar = new t2.c((t2.d0) listX.get(i11 % listX.size()), sb.length(), 0, 12);
                                    ArrayList arrayList2 = dVar.f20291b;
                                    arrayList2.add(cVar);
                                    dVar.f20292c.add(cVar);
                                    int size = arrayList2.size() - 1;
                                    try {
                                        sb.append(str4);
                                        dVar.b(size);
                                        sb.append((String) listW.get(i12));
                                        i11 = i12;
                                    } catch (Throwable th2) {
                                        dVar.b(size);
                                        throw th2;
                                    }
                                }
                                w0Var2.setValue(df.m.g0(rVarE0));
                                return new y2.d0(dVar.c(), y2.q.f25419a);
                            }
                        };
                        oVar2.h0(objK2);
                    }
                    y2.g0 g0Var = (y2.g0) objK2;
                    Object objK3 = oVar2.K();
                    if (objK3 == r0Var) {
                        objK3 = new aa.d(w0Var, 27);
                        oVar2.h0(objK3);
                    }
                    a5.a(str, (ic.k) objK3, qVarF, false, false, null, a.f17941n, a.f17942o, null, null, false, g0Var, null, null, false, 0, 20, null, null, oVar2, 14155824, 1572912, 980792);
                    Object objK4 = oVar2.K();
                    if (objK4 == r0Var) {
                        objK4 = new a9.k(16, rVar, null);
                        oVar2.h0(objK4);
                    }
                    x0.v.e((ic.n) objK4, a0Var, oVar2);
                    j1.q qVarC2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    y.e eVar = y.k.f25161f;
                    j1.g gVar = j1.c.f9671j;
                    y.j1 j1VarA = i1.a(eVar, gVar, oVar2, 6);
                    int iQ2 = x0.v.q(oVar2);
                    j1 j1VarL2 = oVar2.l();
                    j1.q qVarC3 = j1.a.c(qVarC2, oVar2);
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(hVar, j1VarA, oVar2);
                    x0.v.A(hVar2, j1VarL2, oVar2);
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar2, iQ2, hVar3);
                    }
                    x0.v.A(hVar4, qVarC3, oVar2);
                    z8.b(na.q.h(R.string.detected_rjs, Integer.valueOf(((List) w0Var2.getValue()).size())), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar2.j(e9.f12960b)).f12889l, oVar2, 0, 0, 65534);
                    y.j1 j1VarA2 = i1.a(y.k.f25156a, gVar, oVar2, 0);
                    int iQ3 = x0.v.q(oVar2);
                    j1 j1VarL3 = oVar2.l();
                    j1.q qVarC4 = j1.a.c(nVar, oVar2);
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(hVar, j1VarA2, oVar2);
                    x0.v.A(hVar2, j1VarL3, oVar2);
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ3))) {
                        j2.h0.s(iQ3, oVar2, iQ3, hVar3);
                    }
                    x0.v.A(hVar4, qVarC4, oVar2);
                    w0 w0Var3 = this.f18082d;
                    boolean zF = oVar2.f(w0Var3);
                    Object objK5 = oVar2.K();
                    if (zF || objK5 == r0Var) {
                        objK5 = new ma.c(w0Var3, 12);
                        oVar2.h0(objK5);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK5, null, false, null, a.f17943p, oVar2, 805306368, 510);
                    boolean zF2 = oVar2.f(w0Var3);
                    ic.k kVar = this.f18083e;
                    boolean zF3 = zF2 | oVar2.f(kVar);
                    Object objK6 = oVar2.K();
                    if (zF3 || objK6 == r0Var) {
                        objK6 = new ba.e(w0Var3, kVar, w0Var2, w0Var);
                        oVar2.h0(objK6);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK6, null, false, null, a.f17944q, oVar2, 805306368, 510);
                    oVar2.p(true);
                    oVar2.p(true);
                    oVar2.p(true);
                }
                break;
        }
        return a0Var;
    }
}
