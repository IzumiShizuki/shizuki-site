package fa;

import a0.g0;
import a0.j0;
import hf.y;
import java.util.List;
import jc.z;
import pc.f0;
import ub.a0;
import x0.n2;
import x0.p1;
import x0.r0;
import x0.w0;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f6958a = new f1.f(new a9.a(22), 386216946, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f6959b = new f1.f(new a(3), -141878165, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f6960c = new f1.f(new a(4), 329602285, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.f f6961d = new f1.f(new a(5), 1823993116, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.f f6962e = new f1.f(new a(6), 574609333, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1.f f6963f = new f1.f(new a9.a(23), 612888172, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f1.f f6964g = new f1.f(new a9.a(24), 340451885, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f1.f f6965h = new f1.f(new a9.a(25), 68015598, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f1.f f6966i = new f1.f(new a9.a(26), -204420689, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f1.f f6967j = new f1.f(new a9.a(27), 1727347307, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f1.f f6968k = new f1.f(new a9.a(28), 1865369442, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f1.f f6969l = new f1.f(new a9.a(29), 1680009627, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f1.f f6970m = new f1.f(new a(0), -1249092882, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f1.f f6971n = new f1.f(new a(1), 1048278767, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f1.f f6972o = new f1.f(new a(2), -1349191763, false);

    public static final void a(w0 w0Var, List list, final ic.k kVar, x0.o oVar, int i10) {
        boolean z10;
        final n2 n2Var;
        jc.l.e(w0Var, "liveTime");
        jc.l.e(list, "_lyricsEntryList");
        jc.l.e(kVar, "itemOnClick");
        oVar.Y(-882184122);
        int i11 = i10 | (oVar.f(w0Var) ? 4 : 2) | (oVar.h(list) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            final g0 g0VarA = j0.a(oVar);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = x0.v.v(Boolean.TRUE);
                oVar.h0(objK2);
            }
            w0 w0Var2 = (w0) objK2;
            final w0 w0VarY = x0.v.y(list, oVar);
            Object objK3 = oVar.K();
            if (objK3 == obj) {
                objK3 = x0.v.o(new c(w0Var, w0VarY, 0));
                oVar.h0(objK3);
            }
            n2 n2Var2 = (n2) objK3;
            w.k kVar2 = g0VarA.f47f;
            Object objK4 = oVar.K();
            if (objK4 == obj) {
                objK4 = x0.v.v(Boolean.FALSE);
                oVar.h0(objK4);
            }
            w0 w0Var3 = (w0) objK4;
            boolean zF = oVar.f(kVar2);
            Object objK5 = oVar.K();
            if (zF || objK5 == obj) {
                objK5 = new w.e(kVar2, w0Var3, null, 0);
                oVar.h0(objK5);
            }
            x0.v.e((ic.n) objK5, kVar2, oVar);
            Object objK6 = oVar.K();
            Class cls = Integer.TYPE;
            if (objK6 == obj) {
                objK6 = Integer.valueOf(((Number) f0.P(gg.c.a(), "lyricsRollbackTime", 3000, z.a(cls)).a()).intValue());
                oVar.h0(objK6);
            }
            int iIntValue = ((Number) objK6).intValue();
            if (((Boolean) w0Var3.getValue()).booleanValue()) {
                oVar.W(-241703850);
                boolean zH = oVar.h(yVar) | oVar.f(w0Var3);
                Object objK7 = oVar.K();
                if (zH || objK7 == obj) {
                    objK7 = new d(iIntValue, yVar, w0Var2, w0Var3);
                    oVar.h0(objK7);
                }
                x0.v.c(a0.f21526a, (ic.k) objK7, oVar);
                z10 = false;
            } else {
                z10 = false;
                oVar.W(-244487588);
            }
            oVar.p(z10);
            Object value = w0Var.getValue();
            boolean zF2 = oVar.f(w0Var3) | oVar.f(g0VarA);
            Object objK8 = oVar.K();
            if (zF2 || objK8 == obj) {
                Object jVar = new e.j(g0VarA, w0Var3, w0Var2, n2Var2, null, 3);
                n2Var = n2Var2;
                oVar.h0(jVar);
                objK8 = jVar;
            } else {
                n2Var = n2Var2;
            }
            x0.v.e((ic.n) objK8, value, oVar);
            Object objK9 = oVar.K();
            if (objK9 == obj) {
                objK9 = (Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "lyricsTextAlignCenter", Boolean.TRUE);
                objK9.getClass();
                oVar.h0(objK9);
            }
            final boolean zBooleanValue = ((Boolean) objK9).booleanValue();
            Object objK10 = oVar.K();
            if (objK10 == obj) {
                objK10 = Integer.valueOf(((Number) f0.P(gg.c.a(), "lyricsTextSize", 20, z.a(cls)).a()).intValue());
                oVar.h0(objK10);
            }
            final int iIntValue2 = ((Number) objK10).intValue();
            Object objK11 = oVar.K();
            if (objK11 == obj) {
                objK11 = Integer.valueOf(((Number) f0.P(gg.c.a(), "lyricsOuterPadding", 30, z.a(cls)).a()).intValue());
                oVar.h0(objK11);
            }
            final int iIntValue3 = ((Number) objK11).intValue();
            Object objK12 = oVar.K();
            if (objK12 == obj) {
                objK12 = Integer.valueOf(((Number) f0.P(gg.c.a(), "lyricsTextSpacing", 20, z.a(cls)).a()).intValue());
                oVar.h0(objK12);
            }
            final int iIntValue4 = ((Number) objK12).intValue();
            y.d.a(androidx.compose.foundation.layout.c.f557c, null, f1.g.f(-1991685584, new ic.o() { // from class: fa.e
                @Override // ic.o
                public final Object g(Object obj2, Object obj3, Object obj4) {
                    y.t tVar = (y.t) obj2;
                    x0.o oVar2 = (x0.o) obj3;
                    int iIntValue5 = ((Integer) obj4).intValue();
                    jc.l.e(tVar, "$this$BoxWithConstraints");
                    if ((iIntValue5 & 6) == 0) {
                        iIntValue5 |= oVar2.f(tVar) ? 4 : 2;
                    }
                    if (oVar2.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                        j1.q qVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.f557c, iIntValue3, 0.0f, 2);
                        Object objK13 = oVar2.K();
                        r0 r0Var = x0.k.f24334a;
                        if (objK13 == r0Var) {
                            objK13 = new d9.i(21);
                            oVar2.h0(objK13);
                        }
                        j1.q qVarA = androidx.compose.ui.graphics.a.a(qVarL, (ic.k) objK13);
                        Object objK14 = oVar2.K();
                        if (objK14 == r0Var) {
                            objK14 = new d9.i(22);
                            oVar2.h0(objK14);
                        }
                        j1.q qVarC = androidx.compose.ui.draw.a.c(qVarA, (ic.k) objK14);
                        f3.c cVar = tVar.f25257a;
                        long j10 = tVar.f25258b;
                        e1 e1VarA = androidx.compose.foundation.layout.a.a(0.0f, (f3.a.c(j10) ? cVar.I(f3.a.g(j10)) : Float.POSITIVE_INFINITY) / 2, 1);
                        final w0 w0Var4 = w0VarY;
                        boolean zF3 = oVar2.f(w0Var4);
                        final ic.k kVar3 = kVar;
                        boolean zF4 = zF3 | oVar2.f(kVar3);
                        Object objK15 = oVar2.K();
                        if (zF4 || objK15 == r0Var) {
                            final boolean z11 = zBooleanValue;
                            final int i12 = iIntValue4;
                            final int i13 = iIntValue2;
                            final n2 n2Var3 = n2Var;
                            ic.k kVar4 = new ic.k() { // from class: fa.f
                                @Override // ic.k
                                public final Object a(Object obj5) {
                                    a0.j jVar2 = (a0.j) obj5;
                                    jc.l.e(jVar2, "$this$LazyColumn");
                                    List list2 = (List) w0Var4.getValue();
                                    jVar2.m(list2.size(), null, new ba.v(1, list2), new f1.f(new g(list2, z11, kVar3, i12, i13, n2Var3), -1091073711, true));
                                    return a0.f21526a;
                                }
                            };
                            oVar2.h0(kVar4);
                            objK15 = kVar4;
                        }
                        a.a.g(0, 504, g0VarA, (ic.k) objK15, null, qVarC, null, null, oVar2, null, e1VarA, false);
                    } else {
                        oVar2.Q();
                    }
                    return a0.f21526a;
                }
            }, oVar), oVar, 3078);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.p(w0Var, list, kVar, i10, 5);
        }
    }
}
