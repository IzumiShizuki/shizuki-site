package ha;

import androidx.lifecycle.x0;
import ba.u0;
import hf.y;
import i2.h;
import i2.i;
import i2.j;
import ic.k;
import ic.n;
import j1.q;
import j2.h0;
import jc.l;
import jc.z;
import m0.b1;
import m0.c1;
import m0.p3;
import ub.a0;
import x0.j1;
import x0.n2;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import y.i1;
import y.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f8252a = {"SHIFT_JIS", "GBK", "UTF-8", "UTF16LE"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f8253b = new f1.f(new aa.b(22), -1359815624, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f8254c = new f1.f(new fa.a(17), -1987649550, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.f f8255d = new f1.f(new fa.a(18), 1135770378, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.f f8256e = new f1.f(new fa.a(19), -1497406655, false);

    public static final void a(w0 w0Var, String str, k kVar, o oVar, int i10) {
        o oVar2;
        boolean z10;
        l.e(w0Var, "open");
        l.e(str, "enc");
        l.e(kVar, "callback");
        oVar.Y(1672276610);
        int i11 = i10 | (oVar.f(str) ? 32 : 16) | (oVar.h(kVar) ? 256 : 128);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                oVar.W(1466978634);
                Object objK = oVar.K();
                if (objK == x0.k.f24334a) {
                    objK = new aa.f(w0Var, 15);
                    oVar.h0(objK);
                }
                z10 = false;
                a2.c.b((ic.a) objK, f1.g.f(-456081451, new aa.g(w0Var, 3), oVar), null, null, f8254c, f1.g.f(365139281, new a(kVar, w0Var, str), oVar), null, 0L, 0L, null, oVar, 221232, 972);
                oVar2 = oVar;
            } else {
                oVar2 = oVar;
                z10 = false;
                oVar2.W(1466071264);
            }
            oVar2.p(z10);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(w0Var, str, kVar, i10, 1);
        }
    }

    public static final void b(String str, String str2, o oVar, int i10) {
        l.e(str2, "text0");
        oVar.Y(1378593111);
        int i11 = (oVar.f(str) ? 4 : 2) | i10 | (oVar.f(str2) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            yb.c cVar = null;
            g gVar = (g) g8.a.w(x0VarA, z.f10839a.b(g.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = v.v(Boolean.FALSE);
                oVar.h0(objK2);
            }
            w0 w0Var = (w0) objK2;
            Object objK3 = oVar.K();
            if (objK3 == obj) {
                objK3 = v.o(new ba.c(str, gVar, str2, 5));
                oVar.h0(objK3);
            }
            n2 n2Var = (n2) objK3;
            if (str.length() > 0) {
                oVar.W(1190505718);
                boolean zH = oVar.h(gVar) | ((i11 & 14) == 4);
                Object objK4 = oVar.K();
                if (zH || objK4 == obj) {
                    objK4 = new u0(gVar, str, cVar, 7);
                    oVar.h0(objK4);
                }
                v.e((n) objK4, a0.f21526a, oVar);
            } else {
                oVar.W(1188424843);
            }
            oVar.p(false);
            String str3 = (String) gVar.f8272c.getValue();
            boolean zH2 = oVar.h(gVar);
            Object objK5 = oVar.K();
            if (zH2 || objK5 == obj) {
                objK5 = new e7.y(6, gVar);
                oVar.h0(objK5);
            }
            a(w0Var, str3, (k) objK5, oVar, 6);
            android.support.v4.media.session.b.m(null, null, ((b1) oVar.j(c1.f12773a)).a(), 0L, null, 0.0f, f1.g.f(384489619, new c(w0Var, yVar, gVar, n2Var, 0), oVar), oVar, 1572864, 59);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ea.d(str, i10, 2, str2);
        }
    }

    public static final void c(w0 w0Var, ic.a aVar, o oVar, int i10) {
        oVar.Y(-1712335312);
        int i11 = (oVar.h(aVar) ? 32 : 16) | i10;
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            y.v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
            int iQ = v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.n nVar = j1.n.f9689a;
            q qVarC = j1.a.c(nVar, oVar);
            i2.k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            h hVar = j.f8738g;
            v.A(hVar, vVarA, oVar);
            h hVar2 = j.f8737f;
            v.A(hVar2, j1VarL, oVar);
            h hVar3 = j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar3);
            }
            h hVar4 = j.f8735d;
            v.A(hVar4, qVarC, oVar);
            y.e eVar = y.k.f25161f;
            q qVarO = y.d.o(androidx.compose.foundation.layout.c.c(nVar, 1.0f));
            j1.g gVar = j1.c.f9671j;
            y.j1 j1VarA = i1.a(eVar, gVar, oVar, 6);
            int iQ2 = v.q(oVar);
            j1 j1VarL2 = oVar.l();
            q qVarC2 = j1.a.c(qVarO, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(hVar, j1VarA, oVar);
            v.A(hVar2, j1VarL2, oVar);
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ2))) {
                h0.s(iQ2, oVar, iQ2, hVar3);
            }
            v.A(hVar4, qVarC2, oVar);
            ka.b.a(0, oVar);
            y.j1 j1VarA2 = i1.a(y.k.f25156a, gVar, oVar, 0);
            int iQ3 = v.q(oVar);
            j1 j1VarL3 = oVar.l();
            q qVarC3 = j1.a.c(nVar, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(hVar, j1VarA2, oVar);
            v.A(hVar2, j1VarL3, oVar);
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ3))) {
                h0.s(iQ3, oVar, iQ3, hVar3);
            }
            v.A(hVar4, qVarC3, oVar);
            boolean z10 = (i11 & 112) == 32;
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (z10 || objK == r0Var) {
                objK = new ba.j(4, aVar);
                oVar.h0(objK);
            }
            p3.a((ic.a) objK, null, false, f8255d, oVar, 24576, 14);
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new aa.f(w0Var, 17);
                oVar.h0(objK2);
            }
            p3.a((ic.a) objK2, null, false, f8256e, oVar, 24576, 14);
            oVar.p(true);
            oVar.p(true);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.h(w0Var, aVar, i10, 2);
        }
    }
}
