package t;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.i0;
import h0.q0;
import j1.n;
import j3.x;
import j3.y;
import l0.a0;
import n7.b0;
import q1.h0;
import q1.q;
import t2.l0;
import x0.j1;
import x0.o;
import x0.p1;
import y.i1;
import y.o0;
import y.u;
import y.v;
import y.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f20088a = new y(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f20089b;

    static {
        long j10 = q.f17571d;
        long j11 = q.f17569b;
        f20089b = new c(j10, j11, j11, q.b(0.38f, j11), q.b(0.38f, j11));
    }

    public static final void a(c cVar, f1.f fVar, o oVar, int i10) {
        oVar.Y(-921259293);
        int i11 = (oVar.f(cVar) ? 4 : 2) | i10;
        n nVar = n.f9689a;
        int i12 = i11 | (oVar.f(nVar) ? 32 : 16);
        if (oVar.N(i12 & 1, (i12 & 147) != 146)) {
            j1.q qVarX = b0.x(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(lc.b.U(nVar, h.f20075d, g0.g.a(h.f20076e), false, 28), cVar.f20061a, h0.f17515a)), 0.0f, h.f20080i, 1), b0.v(oVar), true);
            v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarX, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, vVarA, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            fVar.g(w.f25274a, oVar, 54);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new i0(cVar, fVar, i10, 15);
        }
    }

    public static final void b(String str, c cVar, ic.a aVar, o oVar, int i10) {
        int i11;
        oVar.Y(791018367);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.g(true) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(cVar) ? 256 : 128;
        }
        int i12 = i10 & 3072;
        n nVar = n.f9689a;
        if (i12 == 0) {
            i11 |= oVar.f(nVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(aVar) ? 131072 : 65536;
        }
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            j1.g gVar = h.f20077f;
            o0 o0Var = y.k.f25156a;
            float f10 = h.f20079h;
            y.g gVarG = y.k.g(f10);
            boolean z10 = ((i11 & 112) == 32) | ((458752 & i11) == 131072);
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new r2.a(aVar);
                oVar.h0(objK);
            }
            j1.q qVarC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.d(nVar, str, (ic.a) objK, 4), 1.0f);
            float f11 = h.f20072a;
            float f12 = h.f20073b;
            float f13 = h.f20074c;
            j1.q qVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.l(qVarC, f11, f13, f12, f13), f10, 0.0f, 2);
            y.j1 j1VarA = i1.a(gVarG, gVar, oVar, 54);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarL, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar2 = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar2);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, j1VarA, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC2, oVar);
            oVar.W(554788141);
            oVar.p(false);
            l0 l0Var = new l0(cVar.f20062b, h.f20081j, h.f20082k, h.f20084m, h.f20078g, h.f20083l, 16613240);
            if (1.0f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            q0.a(str, new LayoutWeightElement(1.0f, true), l0Var, 0, false, 1, 0, null, oVar, (i11 & 14) | 1572864, 952);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l0(str, cVar, aVar, i10);
        }
    }

    public static final void c(x xVar, ic.a aVar, ic.k kVar, o oVar, int i10) {
        int i11;
        oVar.Y(712057293);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(xVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(n.f9689a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(kVar) ? 2048 : 1024;
        }
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            Context context = (Context) oVar.j(AndroidCompositionLocals_androidKt.f721b);
            boolean zF = oVar.f((Configuration) oVar.j(AndroidCompositionLocals_androidKt.f720a)) | oVar.f(context);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                c cVar = f20089b;
                long jC = cVar.f20061a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iB = h0.B(jC);
                int color = typedArrayObtainStyledAttributes.getColor(0, iB);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iB) {
                    jC = h0.c(color);
                }
                long j10 = jC;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jC2 = cVar.f20062b;
                int iB2 = h0.B(jC2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iB2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iB2) {
                    jC2 = h0.c(numValueOf.intValue());
                }
                long j11 = jC2;
                long jC3 = cVar.f20064d;
                int iB3 = h0.B(jC3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iB3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iB3) {
                    jC3 = h0.c(numValueOf2.intValue());
                }
                long j12 = jC3;
                Object cVar2 = new c(j10, j11, j11, j12, j12);
                oVar.h0(cVar2);
                objK = cVar2;
            }
            d(xVar, aVar, (c) objK, kVar, oVar, (i11 & 1022) | ((i11 << 3) & 57344));
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l0(xVar, aVar, kVar, i10);
        }
    }

    public static final void d(x xVar, ic.a aVar, c cVar, ic.k kVar, o oVar, int i10) {
        int i11;
        ic.a aVar2;
        o oVar2;
        x xVar2;
        oVar.Y(1447189339);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(xVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(n.f9689a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(cVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(kVar) ? 16384 : 8192;
        }
        if (oVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            aVar2 = aVar;
            oVar2 = oVar;
            j3.j.a(xVar, aVar2, f20088a, f1.g.f(795909757, new i0(kVar, cVar), oVar), oVar2, (i11 & 14) | 3456 | (i11 & 112), 0);
            xVar2 = xVar;
        } else {
            aVar2 = aVar;
            oVar2 = oVar;
            xVar2 = xVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a0(xVar2, aVar2, cVar, kVar, i10);
        }
    }
}
