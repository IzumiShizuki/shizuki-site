package androidx.compose.animation;

import cg.d0;
import f1.f;
import i2.h;
import i2.i;
import i2.j;
import ic.k;
import ic.n;
import j1.q;
import j2.h0;
import jc.l;
import q.d;
import q.e;
import q.f0;
import q.g0;
import q.i0;
import q.j0;
import q.l0;
import q.q0;
import q.r;
import q.r0;
import q.s;
import q.t;
import q.y1;
import r.j1;
import r.q1;
import r.t1;
import r.v1;
import r.w1;
import ub.a0;
import x0.e1;
import x0.k2;
import x0.o;
import x0.p1;
import x0.v;
import x0.w0;
import yb.c;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(q1 q1Var, k kVar, q qVar, q0 q0Var, r0 r0Var, n nVar, f fVar, o oVar, int i10) {
        int i11;
        e1 e1Var;
        q0 q0Var2;
        r0 r0Var2;
        q1 q1Var2;
        j1 j1Var;
        j1 j1Var2;
        j1 j1Var3;
        boolean z10;
        boolean z11;
        j1 j1VarC;
        q0 q0Var3;
        r0 r0Var3;
        boolean z12;
        boolean z13;
        o oVar2 = oVar;
        oVar2.Y(-891967166);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.f(q1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.h(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.f(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar2.f(q0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar2.f(r0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar2.h(nVar) ? 131072 : 65536;
        }
        int i12 = i11 | 1572864;
        if ((12582912 & i10) == 0) {
            i12 |= oVar2.h(fVar) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (oVar2.N(i13 & 1, (4793491 & i13) != 4793490)) {
            e1 e1Var2 = q1Var.f18542d;
            androidx.lifecycle.q qVar2 = q1Var.f18539a;
            if (((Boolean) kVar.a(e1Var2.getValue())).booleanValue() || ((Boolean) kVar.a(qVar2.b1())).booleanValue() || q1Var.g() || q1Var.d()) {
                oVar2.W(1788522886);
                int i14 = i13 & 14;
                int i15 = i14 | 48;
                int i16 = i15 & 14;
                boolean z14 = ((i16 ^ 6) > 4 && oVar2.f(q1Var)) || (i15 & 6) == 4;
                Object objK = oVar2.K();
                x0.r0 r0Var4 = x0.k.f24334a;
                if (z14 || objK == r0Var4) {
                    objK = qVar2.b1();
                    oVar2.h0(objK);
                }
                if (q1Var.g()) {
                    objK = qVar2.b1();
                }
                oVar2.W(-466616829);
                f0 f0VarE = e(q1Var, kVar, objK, oVar2);
                oVar2.p(false);
                Object value = q1Var.f18542d.getValue();
                oVar2.W(-466616829);
                f0 f0VarE2 = e(q1Var, kVar, value, oVar2);
                oVar2.p(false);
                q1 q1VarB = t1.b(q1Var, f0VarE, f0VarE2, "EnterExitTransition", oVar, i16 | 3072);
                oVar2 = oVar;
                w0 w0VarY = v.y(nVar, oVar2);
                androidx.lifecycle.q qVar3 = q1VarB.f18539a;
                androidx.lifecycle.q qVar4 = q1VarB.f18539a;
                e1 e1Var3 = q1VarB.f18542d;
                Object objQ = nVar.q(qVar3.b1(), e1Var3.getValue());
                boolean zF = oVar2.f(q1VarB) | oVar2.f(w0VarY);
                Object objK2 = oVar2.K();
                c cVar = null;
                if (zF || objK2 == r0Var4) {
                    e1Var = e1Var3;
                    objK2 = new q.q(q1VarB, w0VarY, cVar, 0);
                    oVar2.h0(objK2);
                } else {
                    e1Var = e1Var3;
                }
                n nVar2 = (n) objK2;
                Object objK3 = oVar2.K();
                if (objK3 == r0Var4) {
                    objK3 = v.v(objQ);
                    oVar2.h0(objK3);
                }
                w0 w0Var = (w0) objK3;
                boolean zH = oVar2.h(nVar2);
                Object objK4 = oVar2.K();
                if (zH || objK4 == r0Var4) {
                    objK4 = new k2(nVar2, w0Var, null, 0);
                    oVar2.h0(objK4);
                }
                v.e((n) objK4, a0.f21526a, oVar2);
                Object objB1 = qVar4.b1();
                f0 f0Var = f0.f17292c;
                if (objB1 == f0Var && e1Var.getValue() == f0Var && ((Boolean) w0Var.getValue()).booleanValue()) {
                    oVar2.W(1790688794);
                    oVar2.p(false);
                    z13 = false;
                } else {
                    oVar2.W(1789551931);
                    boolean z15 = i14 == 4;
                    Object objK5 = oVar2.K();
                    if (z15 || objK5 == r0Var4) {
                        objK5 = new q.v(q1VarB);
                        oVar2.h0(objK5);
                    }
                    q.v vVar = (q.v) objK5;
                    v1 v1Var = l0.f17354a;
                    i0 i0Var = i0.f17329c;
                    boolean zF2 = oVar2.f(q1VarB);
                    Object objK6 = oVar2.K();
                    if (zF2 || objK6 == r0Var4) {
                        objK6 = v.v(q0Var);
                        oVar2.h0(objK6);
                    }
                    w0 w0Var2 = (w0) objK6;
                    Object objB12 = qVar4.b1();
                    Object value2 = e1Var.getValue();
                    f0 f0Var2 = f0.f17291b;
                    if (objB12 == value2 && qVar4.b1() == f0Var2) {
                        if (q1VarB.g()) {
                            w0Var2.setValue(q0Var);
                        } else {
                            w0Var2.setValue(q0.f17410b);
                        }
                    } else if (e1Var.getValue() == f0Var2) {
                        w0Var2.setValue(((q0) w0Var2.getValue()).a(q0Var));
                    }
                    q0 q0Var4 = (q0) w0Var2.getValue();
                    boolean zF3 = oVar2.f(q1VarB);
                    Object objK7 = oVar2.K();
                    if (zF3 || objK7 == r0Var4) {
                        objK7 = v.v(r0Var);
                        oVar2.h0(objK7);
                    }
                    w0 w0Var3 = (w0) objK7;
                    if (qVar4.b1() == e1Var.getValue() && qVar4.b1() == f0Var2) {
                        if (q1VarB.g()) {
                            w0Var3.setValue(r0Var);
                        } else {
                            w0Var3.setValue(r0.f17434b);
                        }
                    } else if (e1Var.getValue() != f0Var2) {
                        w0Var3.setValue(((r0) w0Var3.getValue()).a(r0Var));
                    }
                    r0 r0Var5 = (r0) w0Var3.getValue();
                    y1 y1Var = q0Var4.f17411a;
                    boolean z16 = (y1Var.f17480b == null && r0Var5.f17436a.f17480b == null) ? false : true;
                    boolean z17 = (y1Var.f17481c == null && r0Var5.f17436a.f17481c == null) ? false : true;
                    if (z16) {
                        oVar2.W(-821159459);
                        v1 v1Var2 = w1.f18626g;
                        Object objK8 = oVar2.K();
                        if (objK8 == r0Var4) {
                            objK8 = "Built-in slide";
                            oVar2.h0("Built-in slide");
                        }
                        q0Var2 = q0Var4;
                        q1Var2 = q1VarB;
                        r0Var2 = r0Var5;
                        j1 j1VarC2 = t1.c(q1Var2, v1Var2, (String) objK8, oVar2, 384, 0);
                        oVar2.p(false);
                        j1Var = j1VarC2;
                    } else {
                        q0Var2 = q0Var4;
                        r0Var2 = r0Var5;
                        q1Var2 = q1VarB;
                        oVar2.W(-821053656);
                        oVar2.p(false);
                        j1Var = null;
                    }
                    if (z17) {
                        oVar2.W(-820961865);
                        v1 v1Var3 = w1.f18627h;
                        Object objK9 = oVar2.K();
                        if (objK9 == r0Var4) {
                            objK9 = "Built-in shrink/expand";
                            oVar2.h0("Built-in shrink/expand");
                        }
                        j1 j1VarC3 = t1.c(q1Var2, v1Var3, (String) objK9, oVar2, 384, 0);
                        oVar2.p(false);
                        j1Var2 = j1VarC3;
                    } else {
                        oVar2.W(-820851041);
                        oVar2.p(false);
                        j1Var2 = null;
                    }
                    if (z17) {
                        oVar2.W(-820777446);
                        v1 v1Var4 = w1.f18626g;
                        Object objK10 = oVar2.K();
                        if (objK10 == r0Var4) {
                            objK10 = "Built-in InterruptionHandlingOffset";
                            oVar2.h0("Built-in InterruptionHandlingOffset");
                        }
                        j1 j1VarC4 = t1.c(q1Var2, v1Var4, (String) objK10, oVar2, 384, 0);
                        oVar2.p(false);
                        j1Var3 = j1VarC4;
                    } else {
                        oVar2.W(-820608001);
                        oVar2.p(false);
                        j1Var3 = null;
                    }
                    boolean z18 = !z17;
                    if ((q0Var2.f17411a.f17479a == null && r0Var2.f17436a.f17479a == null) ? false : true) {
                        oVar2.W(-675026101);
                        v1 v1Var5 = w1.f18620a;
                        Object objK11 = oVar2.K();
                        if (objK11 == r0Var4) {
                            objK11 = "Built-in alpha";
                            oVar2.h0("Built-in alpha");
                        }
                        z10 = z18;
                        j1VarC = t1.c(q1Var2, v1Var5, (String) objK11, oVar2, 384, 0);
                        z11 = false;
                        oVar2.p(false);
                    } else {
                        z10 = z18;
                        z11 = false;
                        oVar2.W(-674857617);
                        oVar2.p(false);
                        j1VarC = null;
                    }
                    oVar2.W(-674621521);
                    oVar2.p(z11);
                    oVar2.W(-674372529);
                    oVar2.p(z11);
                    boolean zH2 = oVar2.h(j1VarC) | oVar2.f(q0Var2) | oVar2.f(r0Var2) | oVar2.h(null) | oVar2.f(q1Var2) | oVar2.h(null);
                    Object objK12 = oVar2.K();
                    if (zH2 || objK12 == r0Var4) {
                        q0Var3 = q0Var2;
                        r0Var3 = r0Var2;
                        objK12 = new g0(j1VarC, null, q1Var2, q0Var3, r0Var3, null);
                        oVar2.h0(objK12);
                    } else {
                        q0Var3 = q0Var2;
                        r0Var3 = r0Var2;
                    }
                    g0 g0Var = (g0) objK12;
                    boolean zG = oVar2.g(z10) | oVar2.f(i0Var);
                    Object objK13 = oVar2.K();
                    if (zG || objK13 == r0Var4) {
                        z12 = false;
                        objK13 = new j0(z10, i0Var, 0);
                        oVar2.h0(objK13);
                    } else {
                        z12 = false;
                    }
                    j1.n nVar3 = j1.n.f9689a;
                    q qVarE = androidx.compose.ui.graphics.a.a(nVar3, (k) objK13).e(new EnterExitTransitionElement(q1Var2, j1Var2, j1Var3, j1Var, q0Var3, r0Var3, i0Var, g0Var));
                    oVar2.W(1581779440);
                    oVar2.p(z12);
                    q qVarE2 = qVar.e(qVarE.e(nVar3));
                    Object objK14 = oVar2.K();
                    if (objK14 == r0Var4) {
                        objK14 = new q.n(vVar);
                        oVar2.h0(objK14);
                    }
                    q.n nVar4 = (q.n) objK14;
                    int iQ = v.q(oVar2);
                    x0.j1 j1VarL = oVar2.l();
                    q qVarC = j1.a.c(qVarE2, oVar2);
                    i2.k.f8771g0.getClass();
                    i iVar = j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    v.A(j.f8738g, nVar4, oVar2);
                    v.A(j.f8737f, j1VarL, oVar2);
                    h hVar = j.f8741j;
                    if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar2, iQ, hVar);
                    }
                    v.A(j.f8735d, qVarC, oVar2);
                    fVar.g(vVar, oVar2, Integer.valueOf((i13 >> 18) & 112));
                    oVar2.p(true);
                    z13 = false;
                    oVar2.p(false);
                }
                oVar2.p(z13);
            } else {
                oVar2.W(1790694746);
                oVar2.p(false);
            }
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q.o(q1Var, kVar, qVar, q0Var, r0Var, nVar, fVar, i10);
        }
    }

    public static final void b(boolean z10, q qVar, q0 q0Var, r0 r0Var, String str, f fVar, o oVar, int i10) {
        int i11;
        String str2;
        oVar.Y(2088733774);
        if ((i10 & 6) == 0) {
            i11 = (oVar.g(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(q0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(r0Var) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((196608 & i10) == 0) {
            i12 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if (oVar.N(i12 & 1, (74899 & i12) != 74898)) {
            int i13 = i12;
            int i14 = i13 << 3;
            d(t1.f(Boolean.valueOf(z10), "AnimatedVisibility", oVar, (i12 & 14) | ((i12 >> 9) & 112), 0), r.f17423c, qVar, q0Var, r0Var, fVar, oVar, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i13 & 458752));
            str2 = "AnimatedVisibility";
        } else {
            oVar.Q();
            str2 = str;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new s(z10, qVar, q0Var, r0Var, str2, fVar, i10);
        }
    }

    public static final void c(boolean z10, q qVar, q0 q0Var, r0 r0Var, String str, f fVar, o oVar, int i10, int i11) {
        q qVar2;
        q0 q0Var2;
        r0 r0VarA;
        String str2;
        oVar.Y(1766503102);
        int i12 = (oVar.g(z10) ? 32 : 16) | i10;
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= oVar.f(qVar) ? 256 : 128;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= oVar.f(q0Var) ? 2048 : 1024;
        }
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= oVar.f(r0Var) ? 16384 : 8192;
        }
        int i16 = i12 | 196608;
        if (oVar.N(i16 & 1, (599185 & i16) != 599184)) {
            if (i13 != 0) {
                qVar = j1.n.f9689a;
            }
            if (i14 != 0) {
                q0Var = l0.b(null, 3).a(l0.a(null, 15));
            }
            r0VarA = i15 != 0 ? l0.c(null, 3).a(l0.d(null, 15)) : r0Var;
            q0Var2 = q0Var;
            qVar2 = qVar;
            d(t1.f(Boolean.valueOf(z10), "AnimatedVisibility", oVar, ((i16 >> 3) & 14) | 48, 0), r.f17424d, qVar2, q0Var2, r0VarA, fVar, oVar, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | 196608);
            str2 = "AnimatedVisibility";
        } else {
            oVar.Q();
            qVar2 = qVar;
            q0Var2 = q0Var;
            r0VarA = r0Var;
            str2 = str;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new t(z10, qVar2, q0Var2, r0VarA, str2, fVar, i10, i11);
        }
    }

    public static final void d(q1 q1Var, k kVar, q qVar, q0 q0Var, r0 r0Var, f fVar, o oVar, int i10) {
        int i11;
        q0 q0Var2;
        r0 r0Var2;
        f fVar2;
        oVar.Y(429978603);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(q1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            q0Var2 = q0Var;
            i11 |= oVar.f(q0Var2) ? 2048 : 1024;
        } else {
            q0Var2 = q0Var;
        }
        if ((i10 & 24576) == 0) {
            r0Var2 = r0Var;
            i11 |= oVar.f(r0Var2) ? 16384 : 8192;
        } else {
            r0Var2 = r0Var;
        }
        if ((i10 & 196608) == 0) {
            fVar2 = fVar;
            i11 |= oVar.h(fVar2) ? 131072 : 65536;
        } else {
            fVar2 = fVar;
        }
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new d0(kVar, q1Var);
                oVar.h0(objK);
            }
            a(q1Var, kVar, androidx.compose.ui.layout.a.b(qVar, (ic.o) objK), q0Var2, r0Var2, e.f17273d, fVar2, oVar, 196608 | i13 | i12 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128));
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new d(q1Var, kVar, qVar, q0Var, r0Var, fVar, i10);
        }
    }

    public static final f0 e(q1 q1Var, k kVar, Object obj, o oVar) {
        oVar.U(-902032957, q1Var);
        boolean zG = q1Var.g();
        androidx.lifecycle.q qVar = q1Var.f18539a;
        f0 f0Var = f0.f17290a;
        f0 f0Var2 = f0.f17292c;
        f0 f0Var3 = f0.f17291b;
        if (zG) {
            oVar.W(2101770115);
            oVar.p(false);
            if (((Boolean) kVar.a(obj)).booleanValue()) {
                f0Var = f0Var3;
            } else if (((Boolean) kVar.a(qVar.b1())).booleanValue()) {
                f0Var = f0Var2;
            }
        } else {
            oVar.W(2102044248);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = v.v(Boolean.FALSE);
                oVar.h0(objK);
            }
            w0 w0Var = (w0) objK;
            if (((Boolean) kVar.a(qVar.b1())).booleanValue()) {
                w0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) kVar.a(obj)).booleanValue()) {
                f0Var = f0Var3;
            } else if (((Boolean) w0Var.getValue()).booleanValue()) {
                f0Var = f0Var2;
            }
            oVar.p(false);
        }
        oVar.p(false);
        return f0Var;
    }
}
