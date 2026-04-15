package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.x;
import b0.m0;
import f3.m;
import g1.g;
import g1.i;
import i2.a1;
import i2.h;
import i2.j;
import i2.j0;
import i3.c;
import ic.k;
import j1.p;
import j1.q;
import j2.h0;
import j2.l1;
import jc.l;
import o1.v;
import w7.e;
import x0.j1;
import x0.n;
import x0.o;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(int i10, k kVar, q qVar, o oVar) {
        int i11;
        e eVar;
        x xVar;
        m mVar;
        Object obj = c.f8936f;
        oVar.Y(-180024211);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= oVar.h(obj) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= oVar.h(obj) ? 16384 : 8192;
        }
        if (oVar.N(i12 & 1, (i12 & 9363) != 9362)) {
            long j10 = oVar.T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            q qVarE = qVar.e(FocusGroupPropertiesElement.f730a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new a1() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj2) {
                    return obj2 == this;
                }

                @Override // i2.a1
                public final p h() {
                    return new v(0, null, 7);
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // i2.a1
                public final /* bridge */ /* synthetic */ void l(p pVar) {
                }
            };
            q qVarC = j1.a.c(qVarE.e(focusTargetNode$FocusTargetElement).e(FocusTargetPropertiesElement.f731a).e(focusTargetNode$FocusTargetElement), oVar);
            f3.c cVar = (f3.c) oVar.j(l1.f9866h);
            m mVar2 = (m) oVar.j(l1.f9872n);
            j1 j1VarL = oVar.l();
            x xVar2 = (x) oVar.j(g4.a.f7345a);
            e eVar2 = (e) oVar.j(x7.a.f24831a);
            oVar.W(1314800527);
            int i14 = i12 & 14;
            long j11 = oVar.T;
            int i15 = (int) (j11 ^ (j11 >>> 32));
            Context context = (Context) oVar.j(AndroidCompositionLocals_androidKt.f721b);
            n nVarX = x0.v.x(oVar);
            g gVar = (g) oVar.j(i.f7146a);
            View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
            boolean zH = oVar.h(context) | ((((i14 & 14) ^ 6) > 4 && oVar.f(kVar)) || (i14 & 6) == 4) | oVar.h(nVarX) | oVar.h(gVar) | oVar.d(i15) | oVar.h(view);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                eVar = eVar2;
                xVar = xVar2;
                mVar = mVar2;
                Object mVar3 = new i3.m(context, kVar, nVarX, gVar, i15, view);
                oVar.h0(mVar3);
                objK = mVar3;
            } else {
                mVar = mVar2;
                eVar = eVar2;
                xVar = xVar2;
            }
            ic.a aVar = (ic.a) objK;
            oVar.R(null, 125, null, 1);
            oVar.f24392r = true;
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            i2.k.f8771g0.getClass();
            x0.v.A(j.f8737f, j1VarL, oVar);
            x0.v.A(i3.k.f8978e, qVarC, oVar);
            x0.v.A(i3.k.f8979f, cVar, oVar);
            x0.v.A(i3.k.f8980g, xVar, oVar);
            x0.v.A(i3.k.f8981h, eVar, oVar);
            x0.v.A(i3.k.f8982i, mVar, oVar);
            h hVar = j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(i13))) {
                h0.s(i13, oVar, i13, hVar);
            }
            x0.v.A(i3.k.f8976c, obj, oVar);
            x0.v.A(i3.k.f8977d, obj, oVar);
            oVar.p(true);
            oVar.p(false);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new i3.l(kVar, qVar, i10);
        }
    }

    public static final void b(k kVar, q qVar, k kVar2, o oVar, int i10, int i11) {
        k kVar3;
        c cVar = c.f8936f;
        oVar.Y(-1783766393);
        int i12 = (oVar.h(kVar) ? 4 : 2) | i10;
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= oVar.f(qVar) ? 32 : 16;
        }
        int i14 = i12 | 384;
        if (oVar.N(i14 & 1, (i14 & 147) != 146)) {
            if (i13 != 0) {
                qVar = j1.n.f9689a;
            }
            a((i14 & 14) | 3072 | (i14 & 112) | 24576, kVar, qVar, oVar);
            kVar3 = cVar;
        } else {
            oVar.Q();
            kVar3 = kVar2;
        }
        q qVar2 = qVar;
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new m0(kVar, qVar2, kVar3, i10, i11);
        }
    }

    public static final i3.q c(j0 j0Var) {
        i3.q qVar = j0Var.f8756o;
        if (qVar != null) {
            return qVar;
        }
        throw h0.g("Required value was null.");
    }
}
