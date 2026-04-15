package ka;

import a9.u;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ce.j0;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.a0;
import i7.b0;
import i7.y;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import jc.z;
import m0.b1;
import m0.c1;
import m0.p3;
import pc.f0;
import q.k0;
import q.l0;
import q.q0;
import q.s0;
import q.w1;
import q.y1;
import q1.h0;
import r.u1;
import r.v1;
import r.w;
import ud.s;
import x0.n2;
import x0.o2;
import x0.p1;
import x0.r0;
import x0.v;
import y.o0;
import y.s1;
import y.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f11239a = new f1.f(new fa.a(27), 33278837, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f11240b = new f1.f(new fa.a(28), -830045663, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f11241c = new f1.f(new aa.b(25), -1923783509, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.f f11242d = new f1.f(new aa.b(26), 1172084765, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.f f11243e = new f1.f(new fa.a(29), -1485593997, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p1 f11244f;

    public static final void a(int i10, x0.o oVar) {
        oVar.Y(-671782275);
        if (oVar.N(i10 & 1, i10 != 0)) {
            a0 a0Var = (a0) oVar.j(u.f265c);
            boolean zH = oVar.h(a0Var);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new ca.b(a0Var, 5);
                oVar.h0(objK);
            }
            b((ic.a) objK, oVar, 0);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new fa.a(i10, 25);
        }
    }

    public static final void b(ic.a aVar, x0.o oVar, int i10) {
        ic.a aVar2;
        x0.o oVar2;
        jc.l.e(aVar, "onClick");
        oVar.Y(1768166033);
        int i11 = (oVar.h(aVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            float f10 = 0;
            aVar2 = aVar;
            oVar2 = oVar;
            p3.a(aVar2, androidx.compose.foundation.layout.a.m(j1.n.f9689a, 5, f10, f10, f10), false, f11239a, oVar2, (i11 & 14) | 24624, 12);
        } else {
            aVar2 = aVar;
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(aVar2, i10, 0);
        }
    }

    public static final void c(int i10, x0.o oVar) {
        oVar.Y(-97605347);
        if (oVar.N(i10 & 1, i10 != 0)) {
            f11244f = v.r(oVar);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = f0.P(gg.c.a(), "backgroundEnable", Boolean.FALSE, z.a(Boolean.TYPE));
                oVar.h0(objK);
            }
            hg.b bVar = (hg.b) objK;
            o2 o2Var = c1.f12773a;
            long jA = ((b1) oVar.j(o2Var)).a();
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new ColorDrawable(h0.B(jA));
                oVar.h0(objK2);
            }
            ColorDrawable colorDrawable = (ColorDrawable) objK2;
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = f0.P(gg.c.a(), "defaultBackground", "", z.a(String.class));
                oVar.h0(objK3);
            }
            hg.b bVar2 = (hg.b) objK3;
            Object objK4 = oVar.K();
            Class cls = Float.TYPE;
            if (objK4 == r0Var) {
                objK4 = f0.P(gg.c.a(), "backgroundAlpha", Float.valueOf(0.7f), z.a(cls));
                oVar.h0(objK4);
            }
            hg.b bVar3 = (hg.b) objK4;
            Object objK5 = oVar.K();
            if (objK5 == r0Var) {
                objK5 = f0.P(gg.c.a(), "backgroundBlur", Float.valueOf(3.0f), z.a(cls));
                oVar.h0(objK5);
            }
            hg.b bVar4 = (hg.b) objK5;
            if (((Boolean) bVar.a()).booleanValue()) {
                oVar.W(-67466682);
                FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
                oVar.W(690572791);
                o2 o2Var2 = AndroidCompositionLocals_androidKt.f721b;
                s8.h hVar = new s8.h((Context) oVar.j(o2Var2));
                CharSequence charSequence = (CharSequence) bVar2.a();
                boolean zY0 = ef.n.y0(charSequence);
                Object objValueOf = charSequence;
                if (zY0) {
                    objValueOf = Integer.valueOf(R.mipmap.background);
                }
                hVar.f19591c = objValueOf;
                hVar.f19604p = colorDrawable;
                hVar.f19603o = 0;
                hVar.f19608t = colorDrawable;
                hVar.f19607s = 0;
                hVar.f19606r = colorDrawable;
                hVar.f19605q = 0;
                if (((Number) bVar4.a()).floatValue() < 0.1f) {
                    oVar.W(-1195500658);
                    oVar.p(false);
                } else {
                    oVar.W(-1195499452);
                    hVar.f19595g = s.z(vb.l.M0(new pa.a[]{new pa.a((Context) oVar.j(o2Var2), ((Number) bVar4.a()).floatValue())}));
                    oVar.p(false);
                }
                oVar.p(false);
                i8.n.b(hVar.b(), "background", a9.i.b(), fillElement, null, null, g2.o.f7245a, new q1.k(q1.q.b(((Number) bVar3.a()).floatValue(), ((b1) oVar.j(o2Var)).a()), 9), null, oVar, 12586032, 0, 7536);
                oVar.p(false);
            } else {
                oVar.W(-66405800);
                y.d.d(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f557c, jA, h0.f17515a), oVar);
                oVar.p(false);
            }
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new fa.a(i10, 26);
        }
    }

    public static final void d(j7.b bVar, ic.a aVar, ic.a aVar2, x0.o oVar, int i10, int i11) {
        int i12;
        ic.a aVar3;
        jc.l.e(bVar, "data");
        jc.l.e(aVar2, "onErrorClick");
        oVar.Y(220631376);
        int i13 = (oVar.h(bVar) ? 4 : 2) | i10;
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 = i13 | 48;
        } else {
            i12 = i13 | (oVar.h(aVar) ? 32 : 16);
        }
        int i15 = i12 | (oVar.h(aVar2) ? 256 : 128);
        if (oVar.N(i15 & 1, (i15 & 147) != 146)) {
            aVar3 = i14 != 0 ? null : aVar;
            if (bVar.c() == 0) {
                oVar.W(1529561472);
                b0 b0Var = ((i7.l) bVar.f10595d.getValue()).f9185a;
                if (b0Var instanceof i7.a0) {
                    oVar.W(1529610700);
                    String strG = na.q.g(R.string.no_result);
                    Integer numValueOf = Integer.valueOf(R.mipmap.no_image);
                    j1.q qVarD = androidx.compose.foundation.layout.c.f557c;
                    if (aVar3 != null) {
                        qVarD = androidx.compose.foundation.a.d(qVarD, null, aVar3, 7);
                    }
                    k(strG, numValueOf, qVarD, oVar, 0, 0);
                    oVar.p(false);
                } else if (b0Var instanceof i7.z) {
                    oVar.W(1529999223);
                    k(na.q.g(R.string.loading), Integer.valueOf(R.mipmap.loading), androidx.compose.foundation.layout.c.f557c, oVar, 384, 0);
                    oVar.p(false);
                } else {
                    if (!(b0Var instanceof y)) {
                        oVar.W(1573361346);
                        oVar.p(false);
                        throw new j0();
                    }
                    oVar.W(1530255004);
                    k(na.q.g(R.string.load_failed), Integer.valueOf(R.mipmap.load_error), androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f557c, null, aVar2, 7), oVar, 0, 0);
                    oVar.p(false);
                }
            } else {
                oVar.W(1526625586);
            }
            oVar.p(false);
        } else {
            oVar.Q();
            aVar3 = aVar;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(bVar, aVar3, aVar2, i10, i11);
        }
    }

    public static final void e(final c0.z zVar, final j1.q qVar, int i10, x0.o oVar, final int i11, final int i12) {
        final int i13;
        oVar.Y(-1907400044);
        int i14 = (oVar.f(zVar) ? 4 : 2) | i11 | (oVar.f(qVar) ? 32 : 16);
        int i15 = i12 & 4;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= oVar.d(i10) ? 256 : 128;
        }
        if (oVar.N(i14 & 1, (i14 & 147) != 146)) {
            i13 = i15 != 0 ? 10 : i10;
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            hf.y yVar = (hf.y) objK;
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = v.o(new da.j(zVar, i13));
                oVar.h0(objK2);
            }
            n2 n2Var = (n2) objK2;
            boolean zH = oVar.h(yVar) | ((i14 & 14) == 4);
            Object objK3 = oVar.K();
            if (zH || objK3 == obj) {
                objK3 = new da.l(yVar, zVar, 1);
                oVar.h0(objK3);
            }
            f(n2Var, qVar, (ic.a) objK3, oVar, (i14 & 112) | 6);
        } else {
            oVar.Q();
            i13 = i10;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: ka.f
                @Override // ic.n
                public final Object q(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    b.e(zVar, qVar, i13, (x0.o) obj2, v.D(i11 | 1), i12);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void f(n2 n2Var, j1.q qVar, ic.a aVar, x0.o oVar, int i10) {
        int i11;
        jc.l.e(n2Var, "state");
        jc.l.e(qVar, "modifier");
        jc.l.e(aVar, "onClick");
        oVar.Y(343623);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(n2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(aVar) ? 256 : 128;
        }
        int i12 = 1;
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            boolean zBooleanValue = ((Boolean) n2Var.getValue()).booleanValue();
            u1 u1VarR = r.d.r(TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE, 0, w.f18599b, 2);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new g1.d(16);
                oVar.h0(objK);
            }
            k0 k0Var = new k0((ic.k) objK, 1);
            v1 v1Var = l0.f17354a;
            q0 q0Var = new q0(new y1((s0) null, new w1(k0Var, u1VarR), (q.z) null, (nd.h) null, (LinkedHashMap) null, 61));
            u1 u1VarR2 = r.d.r(TinkerReport.KEY_LOADED_UNKNOWN_EXCEPTION, 0, w.f18600c, 2);
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new g1.d(17);
                oVar.h0(objK2);
            }
            androidx.compose.animation.b.b(zBooleanValue, qVar, q0Var, new q.r0(new y1((s0) null, new w1(new k0((ic.k) objK2, 3), u1VarR2), (q.z) null, (nd.h) null, (LinkedHashMap) null, 61)), null, f1.g.f(-684878561, new ba.g(i12, aVar), oVar), oVar, (i11 & 112) | 196608);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(i10, 2, n2Var, qVar, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(j1.q r27, final v1.b r28, long r29, final java.lang.String r31, ic.n r32, final ic.a r33, x0.o r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b.g(j1.q, v1.b, long, java.lang.String, ic.n, ic.a, x0.o, int, int):void");
    }

    public static final void h(int i10, x0.o oVar) {
        long jC;
        oVar.Y(-1418485498);
        if (oVar.N(i10 & 1, i10 != 0)) {
            j1.q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
            WeakHashMap weakHashMap = s1.f25236u;
            j1.q qVarE = qVarC.e(new y.a0(new z0(o0.f(oVar).f25242f, y.d.f25111g | 16))).e(new ZIndexElement(1.0f));
            o2 o2Var = c1.f12773a;
            if (((b1) oVar.j(o2Var)).j()) {
                oVar.W(-1659918508);
                jC = ((b1) oVar.j(o2Var)).g();
                oVar.p(false);
            } else {
                oVar.W(-1659916684);
                jC = c1.c((b1) oVar.j(o2Var));
                oVar.p(false);
            }
            y.d.d(androidx.compose.foundation.a.b(qVarE, jC, h0.f17515a), oVar);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h(i10, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(f1.f r24, f1.f r25, long r26, long r28, float r30, j1.q r31, x0.o r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b.i(f1.f, f1.f, long, long, float, j1.q, x0.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final j1.q r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, final ka.q r20, final ic.a r21, x0.o r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b.j(j1.q, java.lang.String, java.lang.String, java.lang.String, ka.q, ic.a, x0.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(java.lang.String r25, java.lang.Object r26, j1.q r27, x0.o r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b.k(java.lang.String, java.lang.Object, j1.q, x0.o, int, int):void");
    }
}
