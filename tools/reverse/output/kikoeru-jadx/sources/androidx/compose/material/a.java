package androidx.compose.material;

import a2.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import d9.u;
import j1.n;
import j1.q;
import m0.i2;
import m0.r2;
import nh.b;
import q2.m;
import r.e;
import r.u1;
import r.v;
import x0.k;
import x0.o;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f667a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f668b = 125;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f669c = 640;

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final f1.f r23, j1.q r24, final i7.p2 r25, boolean r26, final g0.f r27, float r28, long r29, long r31, long r33, x0.o r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.a(f1.f, j1.q, i7.p2, boolean, g0.f, float, long, long, long, x0.o, int):void");
    }

    public static final void b(final long j10, ic.a aVar, final boolean z10, o oVar, final int i10) {
        int i11;
        Object obj;
        Object obj2;
        q qVarA;
        final ic.a aVar2 = aVar;
        oVar.Y(-526532668);
        if ((i10 & 6) == 0) {
            i11 = (oVar.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.g(z10) ? 256 : 128;
        }
        int i12 = i11;
        if (!oVar.N(i12 & 1, (i12 & 147) != 146)) {
            oVar.Q();
        } else if (j10 != 16) {
            oVar.W(-714009568);
            Object objB = e.b(z10 ? 1.0f : 0.0f, new u1(0, (v) null, 7), oVar);
            String strN = c.N(2, oVar);
            Object obj3 = k.f24334a;
            if (z10) {
                oVar.W(-713791669);
                int i13 = i12 & 112;
                boolean z11 = i13 == 32;
                Object objK = oVar.K();
                if (z11 || objK == obj3) {
                    objK = new r2(2, aVar2);
                    oVar.h0(objK);
                }
                PointerInputEventHandler pointerInputEventHandler = (PointerInputEventHandler) objK;
                obj = objB;
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(aVar, null, null, pointerInputEventHandler, 6);
                aVar2 = aVar;
                boolean zF = oVar.f(strN) | (i13 == 32);
                Object objK2 = oVar.K();
                obj2 = obj3;
                if (zF || objK2 == obj2) {
                    objK2 = new i2(strN, aVar2, 2);
                    oVar.h0(objK2);
                }
                qVarA = m.a(suspendPointerInputElement, true, (ic.k) objK2);
                oVar.p(false);
            } else {
                obj = objB;
                obj2 = obj3;
                oVar.W(-713427946);
                oVar.p(false);
                qVarA = n.f9689a;
            }
            q qVarE = androidx.compose.foundation.layout.c.f557c.e(qVarA);
            boolean zF2 = oVar.f(obj) | ((i12 & 14) == 4);
            Object objK3 = oVar.K();
            if (zF2 || objK3 == obj2) {
                objK3 = new u(j10, obj, 3);
                oVar.h0(objK3);
            }
            b.a(0, (ic.k) objK3, qVarE, oVar);
            oVar.p(false);
        } else {
            oVar.W(-713242690);
            oVar.p(false);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.l4
                @Override // ic.n
                public final Object q(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    androidx.compose.material.a.b(j10, aVar2, z10, (x0.o) obj4, x0.v.D(i10 | 1));
                    return ub.a0.f21526a;
                }
            };
        }
    }
}
