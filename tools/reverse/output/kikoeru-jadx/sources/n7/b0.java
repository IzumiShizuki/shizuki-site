package n7;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.view.Display;
import androidx.compose.foundation.ScrollingLayoutElement;
import b0.p0;
import g2.v0;
import hd.q0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import m0.l3;
import o.s0;
import q1.n0;
import r.q1;
import r.t1;
import s.o0;
import s.o1;
import wd.h1;
import wf.x0;
import x0.e1;
import x0.j1;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w1.f f15417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w1.f f15418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static w1.f f15419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w1.f f15420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w1.f f15421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static w1.f f15422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static w1.f f15423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static w1.f f15424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static w1.f f15425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static w1.f f15426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static w1.f f15427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static w1.f f15428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static w1.f f15429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Method f15430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f15431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Method f15432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f15433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static w1.f f15434r;

    public static final be.b A(String str) {
        boolean zK0 = ef.u.k0(str, ".", false);
        if (zK0) {
            str = str.substring(1);
            jc.l.d(str, "substring(...)");
        }
        return new be.b(new be.c(ef.u.i0(ef.n.U0('/', str, ""), '/', '.')), new be.c(ef.n.Q0('/', str, str)), zK0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B(o6.d r12, o6.k r13, p4.g r14) {
        /*
            long r0 = r13.f16268a
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            r5 = 0
            goto L27
        Le:
            int r5 = r12.a(r0)
            r6 = -1
            if (r5 != r6) goto L19
            int r5 = r12.g()
        L19:
            if (r5 <= 0) goto L27
            int r6 = r5 + (-1)
            long r6 = r12.e(r6)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L27
            int r5 = r5 + (-1)
        L27:
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L51
            int r3 = r12.g()
            if (r5 >= r3) goto L51
            java.util.List r11 = r12.f(r0)
            long r3 = r12.e(r5)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.f16268a
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 >= 0) goto L51
            o6.a r6 = new o6.a
            long r9 = r3 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r3 = 1
            goto L52
        L51:
            r3 = 0
        L52:
            r4 = r5
        L53:
            int r6 = r12.g()
            if (r4 >= r6) goto L5f
            t(r12, r4, r14)
            int r4 = r4 + 1
            goto L53
        L5f:
            boolean r13 = r13.f16269b
            if (r13 == 0) goto L87
            if (r3 == 0) goto L67
            int r5 = r5 + (-1)
        L67:
            if (r2 >= r5) goto L6f
            t(r12, r2, r14)
            int r2 = r2 + 1
            goto L67
        L6f:
            if (r3 == 0) goto L87
            o6.a r6 = new o6.a
            java.util.List r11 = r12.f(r0)
            long r7 = r12.e(r5)
            long r12 = r12.e(r5)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.b0.B(o6.d, o6.k, p4.g):void");
    }

    public static final void a(t.l lVar, ic.a aVar, j1.q qVar, ic.k kVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(645832757);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(aVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= oVar.h(kVar) ? 2048 : 1024;
        }
        if (oVar.N(i12 & 1, (i12 & 1171) != 1170)) {
            t.k kVar2 = (t.k) lVar.f20087a.getValue();
            if (!(kVar2 instanceof t.j)) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    p1VarR.f24421d = new cg.l0(lVar, aVar, kVar, i10);
                    return;
                }
                return;
            }
            boolean zF = oVar.f(kVar2);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                objK = new t.f(android.support.v4.media.session.b.X(((t.j) kVar2).f20086a));
                oVar.h0(objK);
            }
            t.m.c((t.f) objK, aVar, kVar, oVar, i12 & 8176);
            qVar = j1.n.f9689a;
        } else {
            oVar.Q();
        }
        j1.q qVar2 = qVar;
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            p1VarR2.f24421d = new l0.a0(lVar, aVar, qVar2, kVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(t.l r17, ic.a r18, ic.k r19, j1.q r20, boolean r21, ic.a r22, f1.f r23, x0.o r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.b0.b(t.l, ic.a, ic.k, j1.q, boolean, ic.a, f1.f, x0.o, int, int):void");
    }

    public static final void c(Object obj, j1.q qVar, r.x xVar, String str, f1.f fVar, x0.o oVar, int i10, int i11) {
        int i12;
        j1.q qVar2;
        r.x xVar2;
        oVar.Y(-310686752);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? oVar.f(obj) : oVar.h(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i12 | 48;
        int i14 = i11 & 4;
        if (i14 != 0) {
            i13 = i12 | 432;
        } else if ((i10 & 384) == 0) {
            i13 |= oVar.h(xVar) ? 256 : 128;
        }
        int i15 = i13 | 3072;
        if ((i10 & 24576) == 0) {
            i15 |= oVar.h(fVar) ? 16384 : 8192;
        }
        if (oVar.N(i15 & 1, (i15 & 9363) != 9362)) {
            if (i14 != 0) {
                xVar = r.d.r(0, 0, null, 7);
            }
            r.x xVar3 = xVar;
            str = "Crossfade";
            j1.n nVar = j1.n.f9689a;
            d(t1.f(obj, "Crossfade", oVar, (i15 & 14) | ((i15 >> 6) & 112), 0), nVar, xVar3, null, fVar, oVar, i15 & 58352);
            xVar2 = xVar3;
            qVar2 = nVar;
        } else {
            oVar.Q();
            qVar2 = qVar;
            xVar2 = xVar;
        }
        String str2 = str;
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q.c0(obj, qVar2, xVar2, str2, fVar, i10, i11);
        }
    }

    public static final void d(q1 q1Var, j1.q qVar, r.x xVar, ic.k kVar, f1.f fVar, x0.o oVar, int i10) {
        Object obj;
        ic.k kVar2;
        q1 q1Var2 = q1Var;
        androidx.lifecycle.q qVar2 = q1Var2.f18539a;
        oVar.Y(679005231);
        int i11 = (i10 & 6) == 0 ? (oVar.f(q1Var2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            obj = xVar;
            i11 |= oVar.h(obj) ? 256 : 128;
        } else {
            obj = xVar;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= oVar.h(fVar) ? 16384 : 8192;
        }
        int i13 = 0;
        if (oVar.N(i12 & 1, (i12 & 9363) != 9362)) {
            q.r rVar = q.r.f17426f;
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            Object obj3 = objK;
            if (objK == obj2) {
                h1.s sVar = new h1.s();
                sVar.add(qVar2.b1());
                oVar.h0(sVar);
                obj3 = sVar;
            }
            h1.s sVar2 = (h1.s) obj3;
            Object objK2 = oVar.K();
            if (objK2 == obj2) {
                long[] jArr = s0.f16040a;
                objK2 = new o.k0();
                oVar.h0(objK2);
            }
            o.k0 k0Var = (o.k0) objK2;
            e1 e1Var = q1Var2.f18542d;
            if (jc.l.a(qVar2.b1(), e1Var.getValue())) {
                oVar.W(860925177);
                if (sVar2.size() == 1 && jc.l.a(sVar2.get(0), e1Var.getValue())) {
                    oVar.W(861249809);
                    oVar.p(false);
                } else {
                    oVar.W(861059531);
                    boolean z10 = (i12 & 14) == 4;
                    Object objK3 = oVar.K();
                    if (z10 || objK3 == obj2) {
                        objK3 = new q.d0(q1Var2, i13);
                        oVar.h0(objK3);
                    }
                    vb.m.s0(sVar2, (ic.k) objK3);
                    k0Var.a();
                    oVar.p(false);
                }
                oVar.p(false);
            } else {
                oVar.W(861255761);
                oVar.p(false);
            }
            if (k0Var.b(e1Var.getValue())) {
                oVar.W(862059281);
                oVar.p(false);
            } else {
                oVar.W(861316428);
                ListIterator listIterator = sVar2.listIterator();
                int i14 = 0;
                while (true) {
                    h1.z zVar = (h1.z) listIterator;
                    if (!zVar.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (jc.l.a(zVar.next(), e1Var.getValue())) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 == -1) {
                    sVar2.add(e1Var.getValue());
                } else {
                    sVar2.set(i14, e1Var.getValue());
                }
                k0Var.a();
                int size = sVar2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj4 = sVar2.get(i15);
                    k0Var.m(obj4, f1.g.f(-1426421288, new p0(q1Var2, obj, obj4, fVar, 2), oVar));
                    i15++;
                    q1Var2 = q1Var;
                    obj = xVar;
                }
                oVar.p(false);
            }
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVar, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            oVar.W(-187474512);
            int size2 = sVar2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Object obj5 = sVar2.get(i16);
                oVar.U(-1081865889, obj5);
                ic.n nVar = (ic.n) k0Var.g(obj5);
                if (nVar == null) {
                    oVar.W(821932266);
                } else {
                    oVar.W(-1081864713);
                    nVar.q(oVar, 0);
                }
                oVar.p(false);
                oVar.p(false);
            }
            oVar.p(false);
            oVar.p(true);
            kVar2 = rVar;
        } else {
            oVar.Q();
            kVar2 = kVar;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q.e0(q1Var, qVar, xVar, kVar2, fVar, i10);
        }
    }

    public static final p1.c e(long j10, long j11) {
        return new p1.c(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public static final p1.c f(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new p1.c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final ld.o h(h1 h1Var) {
        switch (h1Var == null ? -1 : oe.y.f16437b[h1Var.ordinal()]) {
            case 1:
                ld.o oVar = yc.o.f26128d;
                jc.l.d(oVar, "INTERNAL");
                return oVar;
            case 2:
                ld.o oVar2 = yc.o.f26125a;
                jc.l.d(oVar2, "PRIVATE");
                return oVar2;
            case 3:
                ld.o oVar3 = yc.o.f26126b;
                jc.l.d(oVar3, "PRIVATE_TO_THIS");
                return oVar3;
            case 4:
                ld.o oVar4 = yc.o.f26127c;
                jc.l.d(oVar4, "PROTECTED");
                return oVar4;
            case 5:
                ld.o oVar5 = yc.o.f26129e;
                jc.l.d(oVar5, "PUBLIC");
                return oVar5;
            case 6:
                ld.o oVar6 = yc.o.f26130f;
                jc.l.d(oVar6, "LOCAL");
                return oVar6;
            default:
                ld.o oVar7 = yc.o.f26125a;
                jc.l.d(oVar7, "PRIVATE");
                return oVar7;
        }
    }

    public static boolean i(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Object j(q qVar, String str, ac.c cVar) {
        Object objA = qVar.a(str, new l3(11), cVar);
        return objA == zb.a.f26667a ? objA : ub.a0.f21526a;
    }

    public static final Rect k(int i10, int i11, TextPaint textPaint, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i10 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    jc.b bVarA = jc.k.a(metricAffectingSpanArr);
                    while (bVarA.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) bVarA.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i10, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i10, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i10, i11, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i10, i11, rect3);
        return rect3;
    }

    public static final w1.f l() {
        w1.f fVar = f15418b;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Dataset", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(19.0f, 3.0f);
        q0Var.q(5.0f);
        q0Var.m(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        q0Var.z(14.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(14.0f);
        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0Var.y(5.0f);
        q0Var.m(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        q0Var.l();
        q0Var.u(11.0f, 17.0f);
        q0Var.q(7.0f);
        q0Var.z(-4.0f);
        q0Var.r(4.0f);
        q0Var.y(17.0f);
        q0Var.l();
        q0Var.u(11.0f, 11.0f);
        q0Var.q(7.0f);
        q0Var.y(7.0f);
        q0Var.r(4.0f);
        q0Var.y(11.0f);
        q0Var.l();
        q0Var.u(17.0f, 17.0f);
        q0Var.r(-4.0f);
        q0Var.z(-4.0f);
        q0Var.r(4.0f);
        q0Var.y(17.0f);
        q0Var.l();
        q0Var.u(17.0f, 11.0f);
        q0Var.r(-4.0f);
        q0Var.y(7.0f);
        q0Var.r(4.0f);
        q0Var.y(11.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15418b = fVarB;
        return fVarB;
    }

    public static final w1.f m() {
        w1.f fVar = f15420d;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(12.0f, 21.35f);
        q0Var.t(-1.45f, -1.32f);
        q0Var.m(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        q0Var.m(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        q0Var.n(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        q0Var.m(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        q0Var.m(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        q0Var.n(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        q0Var.s(12.0f, 21.35f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15420d = fVarB;
        return fVarB;
    }

    public static int n(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c7.p0.c(drawable);
        }
        if (!f15433q) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f15432p = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f15433q = true;
        }
        Method method = f15432p;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e11) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
            f15432p = null;
            return 0;
        }
    }

    public static final sf.a o(sf.a aVar) {
        jc.l.e(aVar, "<this>");
        return aVar.a().n() ? aVar : new x0(aVar);
    }

    public static final w1.f p() {
        w1.f fVar = f15427k;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Storage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(2.0f, 20.0f);
        q0Var.r(20.0f);
        q0Var.z(-4.0f);
        j2.h0.t(q0Var, 2.0f, 16.0f, 4.0f);
        q0Var.u(4.0f, 17.0f);
        q0Var.r(2.0f);
        q0Var.z(2.0f);
        j2.h0.t(q0Var, 4.0f, 19.0f, -2.0f);
        q0Var.u(2.0f, 4.0f);
        q0Var.z(4.0f);
        q0Var.r(20.0f);
        q0Var.s(22.0f, 4.0f);
        q0Var.s(2.0f, 4.0f);
        q0Var.l();
        q0Var.u(6.0f, 7.0f);
        q0Var.s(4.0f, 7.0f);
        q0Var.s(4.0f, 5.0f);
        q0Var.r(2.0f);
        q0Var.z(2.0f);
        q0Var.l();
        q0Var.u(2.0f, 14.0f);
        q0Var.r(20.0f);
        q0Var.z(-4.0f);
        j2.h0.t(q0Var, 2.0f, 10.0f, 4.0f);
        q0Var.u(4.0f, 11.0f);
        q0Var.r(2.0f);
        q0Var.z(2.0f);
        j2.h0.t(q0Var, 4.0f, 13.0f, -2.0f);
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15427k = fVarB;
        return fVarB;
    }

    public static final w1.f q() {
        w1.f fVar = f15428l;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Translate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(12.87f, 15.07f);
        q0Var.t(-2.54f, -2.51f);
        q0Var.t(0.03f, -0.03f);
        q0Var.n(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
        q0Var.s(17.0f, 6.0f);
        q0Var.s(17.0f, 4.0f);
        q0Var.r(-7.0f);
        q0Var.s(10.0f, 2.0f);
        q0Var.s(8.0f, 2.0f);
        q0Var.z(2.0f);
        q0Var.s(1.0f, 4.0f);
        q0Var.z(1.99f);
        q0Var.r(11.17f);
        q0Var.m(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
        q0Var.m(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f);
        q0Var.r(-2.0f);
        q0Var.n(0.73f, 1.63f, 1.73f, 3.17f, 2.98f, 4.56f);
        q0Var.t(-5.09f, 5.02f);
        q0Var.s(4.0f, 19.0f);
        q0Var.t(5.0f, -5.0f);
        q0Var.t(3.11f, 3.11f);
        q0Var.t(0.76f, -2.04f);
        q0Var.l();
        q0Var.u(18.5f, 10.0f);
        q0Var.r(-2.0f);
        q0Var.s(12.0f, 22.0f);
        q0Var.r(2.0f);
        q0Var.t(1.12f, -3.0f);
        q0Var.r(4.75f);
        q0Var.s(21.0f, 22.0f);
        q0Var.r(2.0f);
        q0Var.t(-4.5f, -12.0f);
        q0Var.l();
        q0Var.u(15.88f, 17.0f);
        q0Var.t(1.62f, -4.33f);
        q0Var.s(19.12f, 17.0f);
        q0Var.r(-3.24f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15428l = fVarB;
        return fVarB;
    }

    public static final Object r(re.m mVar, pc.u uVar) {
        jc.l.e(mVar, "<this>");
        jc.l.e(uVar, "p");
        return mVar.b();
    }

    public static final int s(wd.c0 c0Var) {
        int i10 = c0Var == null ? -1 : oe.y.f16436a[c0Var.ordinal()];
        if (i10 != 1) {
            int i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                    }
                }
            }
            return i11;
        }
        return 1;
    }

    public static void t(o6.d dVar, int i10, p4.g gVar) {
        long jE = dVar.e(i10);
        List listF = dVar.f(jE);
        if (listF.isEmpty()) {
            return;
        }
        if (i10 == dVar.g() - 1) {
            throw new IllegalStateException();
        }
        long jE2 = dVar.e(i10 + 1) - dVar.e(i10);
        if (jE2 > 0) {
            gVar.accept(new o6.a(jE, jE2, listF));
        }
    }

    public static final void u(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            i10++;
            arrayList.add(String.valueOf(cCharAt));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        jc.l.e(strArr2, "names");
        ArrayList arrayListR0 = vb.m.r0(vb.l.c0(strArr2), "alpha");
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayListR0, 10));
        Iterator it = arrayListR0.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m3.l((String) it.next()));
        }
    }

    public static final o1 v(x0.o oVar) {
        int i10 = 0;
        Object[] objArr = new Object[0];
        androidx.media3.exoplayer.offline.u uVar = o1.f19240i;
        boolean zD = oVar.d(0);
        Object objK = oVar.K();
        if (zD || objK == x0.k.f24334a) {
            objK = new o0(i10, 2);
            oVar.h0(objK);
        }
        return (o1) g1.l.d(objArr, uVar, (ic.a) objK, oVar, 0, 4);
    }

    public static u6.g w(u6.g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (u6.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                u6.g gVar2 = new u6.g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((u6.g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((u6.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((u6.g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    public static j1.q x(j1.q qVar, o1 o1Var, boolean z10) {
        return androidx.compose.foundation.a.j(qVar, o1Var, z10 ? u.e1.f20882a : u.e1.f20883b, true, null, o1Var.f19243c, true, null, null).e(new ScrollingLayoutElement(o1Var, z10));
    }

    public static boolean y(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c7.p0.n(drawable, i10);
        }
        if (!f15431o) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f15430n = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f15431o = true;
        }
        Method method = f15430n;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f15430n = null;
            }
        }
        return false;
    }

    public static void z(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }
}
