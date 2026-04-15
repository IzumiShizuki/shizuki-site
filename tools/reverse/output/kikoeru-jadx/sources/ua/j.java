package ua;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Bundle;
import androidx.compose.ui.ZIndexElement;
import b0.s1;
import ce.j0;
import cg.l0;
import hd.q0;
import j1.n;
import j1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jc.z;
import p4.a0;
import p4.r;
import pc.f0;
import q.t0;
import se.x0;
import u.e1;
import ud.s;
import uh.t;
import uh.u;
import uh.y;
import x0.c0;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static void A(r rVar) {
        int i10;
        int i11 = rVar.i(2);
        if (i11 == 0) {
            rVar.t(6);
            return;
        }
        int iW = w(rVar, 5, 8, 16) + 1;
        if (i11 == 1) {
            rVar.t(iW * 7);
            return;
        }
        if (i11 == 2) {
            boolean zH = rVar.h();
            int i12 = zH ? 1 : 5;
            int i13 = zH ? 7 : 5;
            int i14 = zH ? 8 : 6;
            int i15 = 0;
            while (i15 < iW) {
                if (rVar.h()) {
                    rVar.t(7);
                    i10 = 0;
                } else {
                    if (rVar.i(2) == 3 && rVar.i(i13) * i12 != 0) {
                        rVar.s();
                    }
                    i10 = rVar.i(i14) * i12;
                    if (i10 != 0 && i10 != 180) {
                        rVar.s();
                    }
                    rVar.s();
                }
                if (i10 != 0 && i10 != 180 && rVar.h()) {
                    i15++;
                }
                i15++;
            }
        }
    }

    public static final void a(int i10, ic.k kVar, q qVar, ta.c cVar, o oVar) {
        jc.l.e(cVar, "color");
        jc.l.e(kVar, "onColorChanged");
        oVar.Y(-1502617685);
        int i11 = (oVar.f(cVar) ? 256 : 128) | i10;
        if ((46811 & i11) == 9362 && oVar.z()) {
            oVar.Q();
        } else {
            y.d.a(qVar, null, f1.g.b(oVar, -296723327, new g(cVar, i11, kVar)), oVar, 3078);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR == null) {
            return;
        }
        p1VarR.f24421d = new a(qVar, cVar, kVar, i10);
    }

    public static final void b(a0.d dVar, y yVar, Object obj, q qVar, boolean z10, q qVar2, f1.f fVar, o oVar, int i10) {
        int i11;
        q qVarX;
        int i12;
        q qVar3;
        boolean z11;
        q qVarE;
        boolean z12;
        q qVarA;
        q qVar4;
        q qVar5;
        boolean z13;
        q qVarA2;
        jc.l.e(dVar, "<this>");
        jc.l.e(yVar, "state");
        jc.l.e(obj, "key");
        oVar.Y(346306449);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(yVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(obj) ? 256 : 128;
        }
        int i13 = i11 | 27648;
        if ((196608 & i10) == 0) {
            i13 = 93184 | i11;
        }
        if ((1572864 & i10) == 0) {
            i13 |= oVar.h(fVar) ? 1048576 : 524288;
        }
        if ((599187 & i13) == 599186 && oVar.z()) {
            oVar.Q();
            qVar4 = qVar;
            z11 = z10;
            qVar5 = qVar2;
        } else {
            oVar.S();
            int i14 = i10 & 1;
            n nVar = n.f9689a;
            if (i14 == 0 || oVar.x()) {
                qVarX = a0.c.x(dVar);
                i12 = i13 & (-458753);
                qVar3 = nVar;
                z11 = true;
            } else {
                oVar.Q();
                i12 = i13 & (-458753);
                qVar3 = qVar;
                z11 = z10;
                qVarX = qVar2;
            }
            oVar.q();
            oVar.W(-1662944964);
            int i15 = i12 & 112;
            boolean z14 = i15 == 32;
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (z14 || objK == r0Var) {
                objK = new uh.n(yVar, 4);
                oVar.h0(objK);
            }
            oVar.p(false);
            c0 c0VarO = v.o((ic.a) objK);
            c0 c0VarO2 = v.o(new s1(18, obj, yVar));
            if (((Boolean) c0VarO2.getValue()).booleanValue()) {
                oVar.W(-11568592);
                ZIndexElement zIndexElement = new ZIndexElement(1.0f);
                int iOrdinal = ((e1) c0VarO.getValue()).ordinal();
                if (iOrdinal == 0) {
                    oVar.W(-1662937274);
                    oVar.W(-1662936840);
                    boolean z15 = i15 == 32;
                    Object objK2 = oVar.K();
                    if (z15 || objK2 == r0Var) {
                        objK2 = new u(yVar, 0);
                        oVar.h0(objK2);
                    }
                    z13 = false;
                    oVar.p(false);
                    qVarA2 = androidx.compose.ui.graphics.a.a(nVar, (ic.k) objK2);
                    oVar.p(false);
                } else {
                    if (iOrdinal != 1) {
                        oVar.W(-1663429177);
                        oVar.p(false);
                        throw new j0();
                    }
                    oVar.W(-1662932538);
                    oVar.W(-1662932104);
                    boolean z16 = i15 == 32;
                    Object objK3 = oVar.K();
                    if (z16 || objK3 == r0Var) {
                        objK3 = new u(yVar, 1);
                        oVar.h0(objK3);
                    }
                    z13 = false;
                    oVar.p(false);
                    qVarA2 = androidx.compose.ui.graphics.a.a(nVar, (ic.k) objK3);
                    oVar.p(false);
                }
                qVarE = zIndexElement.e(qVarA2);
                oVar.p(z13);
            } else if (obj.equals(yVar.f22087r.getValue())) {
                oVar.W(-11128268);
                ZIndexElement zIndexElement2 = new ZIndexElement(1.0f);
                int iOrdinal2 = ((e1) c0VarO.getValue()).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        oVar.W(-1663429177);
                        oVar.p(false);
                        throw new j0();
                    }
                    oVar.W(-1662917900);
                    oVar.W(-1662917466);
                    boolean z17 = i15 == 32;
                    Object objK4 = oVar.K();
                    if (z17 || objK4 == r0Var) {
                        objK4 = new u(yVar, 3);
                        oVar.h0(objK4);
                    }
                    z12 = false;
                    oVar.p(false);
                    qVarA = androidx.compose.ui.graphics.a.a(nVar, (ic.k) objK4);
                    oVar.p(false);
                } else {
                    oVar.W(-1662923084);
                    oVar.W(-1662922650);
                    boolean z18 = i15 == 32;
                    Object objK5 = oVar.K();
                    if (z18 || objK5 == r0Var) {
                        objK5 = new u(yVar, 2);
                        oVar.h0(objK5);
                    }
                    z12 = false;
                    oVar.p(false);
                    qVarA = androidx.compose.ui.graphics.a.a(nVar, (ic.k) objK5);
                    oVar.p(false);
                }
                qVarE = zIndexElement2.e(qVarA);
                oVar.p(z12);
            } else {
                oVar.W(-10714728);
                oVar.p(false);
                qVarE = qVarX;
            }
            s.a(yVar, obj, qVar3.e(qVarE), z11, ((Boolean) c0VarO2.getValue()).booleanValue(), fVar, oVar, 466046 & (i12 >> 3));
            qVar4 = qVar3;
            qVar5 = qVarX;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new t(dVar, yVar, obj, qVar4, z11, qVar5, fVar, i10);
        }
    }

    public static final void c(int i10, ic.k kVar, q qVar, ta.c cVar, o oVar) {
        int i11;
        oVar.Y(-1668148714);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= oVar.f(cVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.f(kVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= oVar.f(b.f21491a) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && oVar.z()) {
            oVar.Q();
        } else {
            y.d.a(androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.q(androidx.compose.foundation.layout.c.b(qVar, 48, 0.0f, 2), null, 3), 1.0f, true), null, f1.g.b(oVar, 966465132, new i(kVar, i11, v.y(cVar, oVar), cVar)), oVar, 3072);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR == null) {
            return;
        }
        p1VarR.f24421d = new l0(qVar, cVar, kVar, i10, 7);
    }

    public static final void d(yf.t tVar) {
        jc.l.e(tVar, "<this>");
        if ((tVar instanceof yf.t ? tVar : null) != null) {
            return;
        }
        throw new IllegalStateException(t0.F(z.f10839a, tVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final xf.k e(vf.b bVar) {
        jc.l.e(bVar, "<this>");
        xf.k kVar = bVar instanceof xf.k ? (xf.k) bVar : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException(t0.F(z.f10839a, bVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static void f(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(a0.c.I("startIndex: ", i10, i11, " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
    }

    public static void g(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(a0.c.I("fromIndex: ", i10, i11, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static final void h(q0 q0Var, String str, String str2) {
        jc.l.e(q0Var, "<this>");
        jc.l.e(str, "name");
        jc.l.e(str2, "value");
        ArrayList arrayList = q0Var.f8447b;
        arrayList.add(str);
        arrayList.add(ef.n.X0(str2).toString());
    }

    public static final boolean i(p1.c cVar, float f10, float f11) {
        float f12 = cVar.f16483a;
        if (f10 > cVar.f16485c || f12 > f10) {
            return false;
        }
        return f11 <= cVar.f16486d && cVar.f16484b <= f11;
    }

    public static final ve.j j(x0 x0Var) {
        int iOrdinal = x0Var.ordinal();
        if (iOrdinal == 0) {
            return ve.j.f22960d;
        }
        if (iOrdinal == 1) {
            return ve.j.f22958b;
        }
        if (iOrdinal == 2) {
            return ve.j.f22959c;
        }
        throw new j0();
    }

    public static zc.b k(zc.h hVar, be.c cVar) {
        Object next;
        jc.l.e(cVar, "fqName");
        Iterator it = hVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (jc.l.a(((zc.b) next).a(), cVar)) {
                break;
            }
        }
        return (zc.b) next;
    }

    public static final Drawable l(Context context, int i10) {
        Drawable drawableE = l.c.c().e(context, i10);
        if (drawableE != null) {
            return drawableE;
        }
        throw new IllegalStateException(t0.B(i10, "Invalid resource ID: ").toString());
    }

    public static boolean m(zc.h hVar, be.c cVar) {
        jc.l.e(cVar, "fqName");
        return hVar.e(cVar) != null;
    }

    public static final void n(String str) {
        jc.l.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                gh.g.j(16);
                String string = Integer.toString(cCharAt, 16);
                jc.l.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i10);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void o(String str, String str2) {
        jc.l.e(str, "value");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                gh.g.j(16);
                String string = Integer.toString(cCharAt, 16);
                jc.l.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i10);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(wg.e.l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static String p(ye.e eVar, nd.e eVar2) {
        if (eVar.a(eVar2)) {
            return null;
        }
        return eVar.b();
    }

    public static String q(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder sbK = a0.c.K("<", str2, " threw ");
                    sbK.append(e10.getClass().getName());
                    sbK.append(">");
                    string = sbK.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) str, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ug.g r(ug.r r26) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.j.r(ug.r):ug.g");
    }

    public static final void s(String str, Bundle bundle) {
        jc.l.e(str, "key");
        bundle.putString(str, null);
    }

    public static final void t(Bundle bundle, String str, Bundle bundle2) {
        jc.l.e(str, "key");
        jc.l.e(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void u(Bundle bundle, String str, String str2) {
        jc.l.e(str, "key");
        jc.l.e(str2, "value");
        bundle.putString(str, str2);
    }

    public static final void v(Bundle bundle, String str, List list) {
        List list2 = list;
        bundle.putStringArrayList(str, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
    }

    public static int w(r rVar, int i10, int i11, int i12) {
        p4.c.c(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        f0.o(f0.o(i13, i14), 1 << i12);
        if (rVar.b() < i10) {
            return -1;
        }
        int i15 = rVar.i(i10);
        if (i15 == i13) {
            if (rVar.b() < i11) {
                return -1;
            }
            int i16 = rVar.i(i11);
            i15 += i16;
            if (i16 == i14) {
                if (rVar.b() < i12) {
                    return -1;
                }
                return rVar.i(i12) + i15;
            }
        }
        return i15;
    }

    public static w4.k x(Context context, v4.v vVar, boolean z10, String str) {
        MediaMetricsManager mediaMetricsManagerE = a0.e(context.getSystemService("media_metrics"));
        w4.i iVar = mediaMetricsManagerE == null ? null : new w4.i(context, mediaMetricsManagerE.createPlaybackSession());
        if (iVar == null) {
            p4.c.B("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new w4.k(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z10) {
            w4.d dVar = vVar.f22689s;
            dVar.getClass();
            dVar.f23354f.a(iVar);
        }
        return new w4.k(iVar.f23375c.getSessionId(), str);
    }

    public static final String y(yc.e eVar, String str) {
        jc.l.e(eVar, "classDescriptor");
        jc.l.e(str, "jvmDescriptor");
        String str2 = xc.d.f24905a;
        be.b bVarF = xc.d.f(ie.d.g(eVar).f2744a);
        String strE = bVarF != null ? je.b.e(bVarF) : ud.e.l(eVar, ud.h.f21585c);
        jc.l.e(strE, "internalName");
        return strE + '.' + str;
    }

    public static void z(r rVar) {
        rVar.t(3);
        rVar.t(8);
        boolean zH = rVar.h();
        boolean zH2 = rVar.h();
        if (zH) {
            rVar.t(5);
        }
        if (zH2) {
            rVar.t(6);
        }
    }
}
