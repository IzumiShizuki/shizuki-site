package i8;

import android.os.Trace;
import coil.compose.ContentPainterElement;
import d0.i0;
import j2.h0;
import j2.z1;
import q.t0;
import ub.a0;
import x0.j1;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f9442a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f9443b = new u();

    public static final void a(final o oVar, final String str, final j1.q qVar, final ic.k kVar, final ic.k kVar2, final j1.d dVar, final g2.p pVar, final float f10, final q1.k kVar3, final int i10, final boolean z10, x0.o oVar2, final int i11, final int i12) {
        int i13;
        ic.k kVar4;
        ic.k kVar5;
        int i14;
        int i15;
        int i16;
        t8.i iVar;
        int i17;
        boolean z11;
        oVar2.Y(-421592773);
        if ((i11 & 14) == 0) {
            i13 = (oVar2.f(oVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 |= oVar2.f(str) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= oVar2.f(qVar) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            kVar4 = kVar;
            i13 |= oVar2.h(kVar4) ? 2048 : 1024;
        } else {
            kVar4 = kVar;
        }
        if ((i11 & 57344) == 0) {
            kVar5 = kVar2;
            i13 |= oVar2.h(kVar5) ? 16384 : 8192;
        } else {
            kVar5 = kVar2;
        }
        if ((i11 & 458752) == 0) {
            i13 |= oVar2.f(dVar) ? 131072 : 65536;
        }
        if ((i11 & 3670016) == 0) {
            i13 |= oVar2.f(pVar) ? 1048576 : 524288;
        }
        if ((i11 & 29360128) == 0) {
            i13 |= oVar2.c(f10) ? 8388608 : 4194304;
        }
        if ((i11 & 234881024) == 0) {
            i14 = 458752;
            i13 |= oVar2.f(kVar3) ? 67108864 : 33554432;
        } else {
            i14 = 458752;
        }
        if ((i11 & 1879048192) == 0) {
            i13 |= oVar2.d(i10) ? 536870912 : 268435456;
        }
        if ((i12 & 14) == 0) {
            i15 = 3670016;
            i16 = i12 | (oVar2.g(z10) ? 4 : 2);
        } else {
            i15 = 3670016;
            i16 = i12;
        }
        if ((i13 & 1533916891) == 306783378 && (i16 & 11) == 2 && oVar2.z()) {
            oVar2.Q();
        } else {
            s8.i iVar2 = oVar.f9444a;
            t8.e eVar = w.f9470b;
            oVar2.X(1677680258);
            if (iVar2.E.f19578a != null) {
                oVar2.p(false);
                i17 = i13;
            } else {
                oVar2.X(408306591);
                boolean zA = jc.l.a(pVar, g2.o.f7249e);
                Object obj = x0.k.f24334a;
                if (zA) {
                    iVar = w.f9470b;
                    i17 = i13;
                    z11 = false;
                } else {
                    oVar2.X(408309406);
                    Object objK = oVar2.K();
                    if (objK == obj) {
                        objK = new r();
                        oVar2.h0(objK);
                    }
                    iVar = (r) objK;
                    i17 = i13;
                    z11 = false;
                    oVar2.p(false);
                }
                oVar2.p(z11);
                oVar2.X(-227230258);
                oVar2.X(408312509);
                boolean zF = oVar2.f(iVar2) | oVar2.f(iVar);
                Object objK2 = oVar2.K();
                if (zF || objK2 == obj) {
                    s8.h hVarA = s8.i.a(iVar2);
                    hVarA.f19609u = iVar;
                    hVarA.f19611w = null;
                    hVarA.f19612x = null;
                    hVarA.f19613y = null;
                    objK2 = hVarA.b();
                    oVar2.h0(objK2);
                }
                iVar2 = (s8.i) objK2;
                oVar2.p(false);
                oVar2.p(false);
                oVar2.p(false);
            }
            int i18 = i17 >> 6;
            int i19 = i18 & 57344;
            s8.i iVar3 = iVar2;
            l lVarD = d(iVar3, oVar.f9446c, kVar4, kVar5, pVar, i10, oVar2, 0);
            t8.i iVar4 = iVar3.f19635v;
            c(iVar4 instanceof r ? qVar.e((j1.q) iVar4) : qVar, lVarD, str, dVar, pVar, f10, kVar3, z10, oVar2, ((i17 << 3) & 896) | (i18 & 7168) | i19 | (i18 & i14) | (i18 & i15) | ((i16 << 21) & 29360128));
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: i8.a
                @Override // ic.n
                public final Object q(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    n.a(oVar, str, qVar, kVar, kVar2, dVar, pVar, f10, kVar3, i10, z10, (x0.o) obj2, x0.v.D(i11 | 1), x0.v.D(i12));
                    return a0.f21526a;
                }
            };
        }
    }

    public static final void b(s8.i iVar, String str, h8.h hVar, j1.q qVar, ic.k kVar, j1.d dVar, g2.p pVar, q1.k kVar2, u uVar, x0.o oVar, int i10, int i11, int i12) {
        oVar.X(2032051394);
        ic.k kVar3 = (i12 & 16) != 0 ? l.f9426u : kVar;
        j1.d dVar2 = (i12 & 64) != 0 ? j1.c.f9666e : dVar;
        g2.p pVar2 = (i12 & 128) != 0 ? g2.o.f7246b : pVar;
        q1.k kVar4 = (i12 & 512) != 0 ? null : kVar2;
        int i13 = i10 >> 3;
        a(new o(iVar, (i12 & 4096) != 0 ? f9443b : uVar, hVar), str, qVar, kVar3, null, dVar2, pVar2, 1.0f, kVar4, 1, true, oVar, (i10 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024) | ((i11 << 27) & 1879048192), (i11 >> 3) & 14);
        oVar.p(false);
    }

    public static final void c(final j1.q qVar, final l lVar, final String str, final j1.d dVar, final g2.p pVar, final float f10, final q1.k kVar, final boolean z10, x0.o oVar, final int i10) {
        int i11;
        oVar.Y(777774312);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= oVar.f(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.f(str) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= oVar.f(dVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= oVar.f(pVar) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= oVar.c(f10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= oVar.f(kVar) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= oVar.g(z10) ? 8388608 : 4194304;
        }
        if ((i11 & 23967451) == 4793490 && oVar.z()) {
            oVar.Q();
        } else {
            t8.e eVar = w.f9470b;
            j1.q qVarA = str != null ? q2.m.a(qVar, false, new a9.j(6, str)) : qVar;
            if (z10) {
                qVarA = gh.g.l(qVarA);
            }
            j1.q qVarE = qVarA.e(new ContentPainterElement(lVar, dVar, pVar, f10, kVar));
            oVar.X(544976794);
            int iQ = x0.v.q(oVar);
            j1.q qVarC = j1.a.c(qVarE, oVar);
            j1 j1VarL = oVar.l();
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.X(1405779621);
            oVar.a0();
            int i12 = 1;
            if (oVar.S) {
                oVar.k(new i0(i12, iVar));
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, c.f9413a, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: i8.b
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    n.c(qVar, lVar, str, dVar, pVar, f10, kVar, z10, (x0.o) obj, x0.v.D(i10 | 1));
                    return a0.f21526a;
                }
            };
        }
    }

    public static final l d(s8.i iVar, h8.h hVar, ic.k kVar, ic.k kVar2, g2.p pVar, int i10, x0.o oVar, int i11) {
        oVar.X(1645646697);
        oVar.X(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            s8.i iVarA = w.a(iVar, oVar);
            f(iVarA);
            oVar.X(1094691773);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new l(iVarA, hVar);
                oVar.h0(objK);
            }
            l lVar = (l) objK;
            oVar.p(false);
            lVar.f9434m = kVar;
            lVar.f9435n = kVar2;
            lVar.f9436o = pVar;
            lVar.f9437p = i10;
            lVar.f9438q = ((Boolean) oVar.j(z1.f10107a)).booleanValue();
            lVar.f9441t.setValue(hVar);
            lVar.f9440s.setValue(iVarA);
            lVar.d();
            oVar.p(false);
            Trace.endSection();
            oVar.p(false);
            return lVar;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static void e(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + t0.D("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    public static final void f(s8.i iVar) {
        Object obj = iVar.f19615b;
        if (obj instanceof s8.h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof q1.f) {
            e("ImageBitmap");
            throw null;
        }
        if (obj instanceof w1.f) {
            e("ImageVector");
            throw null;
        }
        if (obj instanceof v1.b) {
            e("Painter");
            throw null;
        }
        if (iVar.f19616c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
