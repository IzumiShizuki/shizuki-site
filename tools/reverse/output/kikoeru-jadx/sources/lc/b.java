package lc;

import a0.c;
import a0.f0;
import ah.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.HandwritingGesture;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.lifecycle.x0;
import ba.q0;
import ba.r;
import c0.a0;
import c0.z;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.d0;
import e7.m0;
import e7.n0;
import ef.u;
import f3.n;
import f3.p;
import g2.n1;
import i1.i;
import i2.h;
import j1.q;
import j2.h0;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import jc.l;
import k1.d;
import la.i0;
import m0.b1;
import m0.c1;
import m0.x1;
import o.e0;
import o.g0;
import o.o0;
import o.t;
import o.v0;
import p4.c0;
import q.u1;
import q1.l0;
import q1.w;
import r.q1;
import r.t1;
import t2.g;
import t2.k0;
import ud.s;
import ug.y;
import vb.m;
import w1.f;
import x0.a1;
import x0.d2;
import x0.e1;
import x0.j1;
import x0.k;
import x0.n2;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import x0.y1;
import x0.z1;
import y2.e;
import y2.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f12169a;

    public static long A(double d10) {
        if (!D(d10)) {
            throw new IllegalArgumentException("not a normal value");
        }
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static final long B(double d10) {
        return H((float) d10, 4294967296L);
    }

    public static final long C(int i10) {
        return H(i10, 4294967296L);
    }

    public static boolean D(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static Object E(Parcelable parcelable) {
        int i10 = c0.f16548a;
        if (i10 >= 21 && i10 < 23) {
            if (parcelable instanceof MediaBrowserCompat$MediaItem) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f394b;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f395a, mediaDescriptionCompat.f396b, mediaDescriptionCompat.f397c, mediaDescriptionCompat.f398d, mediaDescriptionCompat.f399e, mediaDescriptionCompat.f400f, mediaDescriptionCompat.f401g, mediaDescriptionCompat.f402h), mediaBrowserCompat$MediaItem.f393a);
            }
            if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f395a, mediaDescriptionCompat2.f396b, mediaDescriptionCompat2.f397c, mediaDescriptionCompat2.f398d, mediaDescriptionCompat2.f399e, mediaDescriptionCompat2.f400f, mediaDescriptionCompat2.f401g, mediaDescriptionCompat2.f402h);
            }
        }
        return parcelable;
    }

    public static final w0 F(hg.b bVar, o oVar) {
        l.e(bVar, "<this>");
        oVar.W(-869955703);
        oVar.W(1849434622);
        Object objK = oVar.K();
        r0 r0Var = k.f24334a;
        if (objK == r0Var) {
            objK = v.v(bVar.a());
            oVar.h0(objK);
        }
        w0 w0Var = (w0) objK;
        oVar.p(false);
        oVar.W(-1633490746);
        boolean zH = oVar.h(bVar);
        Object objK2 = oVar.K();
        if (zH || objK2 == r0Var) {
            objK2 = new q0(6, w0Var, bVar);
            oVar.h0(objK2);
        }
        oVar.p(false);
        v.c(bVar, (ic.k) objK2, oVar);
        oVar.p(false);
        return w0Var;
    }

    public static final fg.f G(String str, Object obj, hg.a aVar, boolean z10, pc.v vVar) {
        l.e(aVar, "okkv");
        l.e(vVar, "type");
        return new fg.f(str, obj, aVar, z10, vVar);
    }

    public static final long H(float f10, long j10) {
        long jFloatToRawIntBits = j10 | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
        p[] pVarArr = f3.o.f6671b;
        return jFloatToRawIntBits;
    }

    public static j I(String str) throws ProtocolException {
        int i10;
        String strSubstring;
        l.e(str, "statusLine");
        boolean zK0 = u.k0(str, "HTTP/1.", false);
        y yVar = y.f21934c;
        y yVar2 = y.f21935d;
        if (zK0) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                yVar = yVar2;
            }
        } else if (u.k0(str, "ICY ", false)) {
            i10 = 4;
        } else {
            if (!u.k0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 12;
            yVar = yVar2;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i10, i11);
        l.d(strSubstring2, "substring(...)");
        Integer numL0 = u.l0(strSubstring2);
        if (numL0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numL0.intValue();
        if (str.length() <= i11) {
            strSubstring = "";
        } else {
            if (str.charAt(i11) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i10 + 4);
            l.d(strSubstring, "substring(...)");
        }
        return new j(yVar, iIntValue, strSubstring, 0);
    }

    public static void J(long j10, g gVar, boolean z10, f0 f0Var) {
        if (z10) {
            int i10 = k0.f20357c;
            int iCharCount = (int) (j10 >> 32);
            int iCharCount2 = (int) (j10 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(gVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < gVar.f20320b.length() ? Character.codePointAt(gVar, iCharCount2) : 10;
            if (pc.f0.N(iCodePointBefore) && (pc.f0.M(iCodePointAt) || pc.f0.K(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(gVar, iCharCount);
                    }
                } while (pc.f0.N(iCodePointBefore));
                j10 = t2.c0.b(iCharCount, iCharCount2);
            } else if (pc.f0.N(iCodePointAt) && (pc.f0.M(iCodePointBefore) || pc.f0.K(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == gVar.f20320b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(gVar, iCharCount2);
                    }
                } while (pc.f0.N(iCodePointAt));
                j10 = t2.c0.b(iCharCount, iCharCount2);
            }
        }
        int i11 = (int) (4294967295L & j10);
        f0Var.a(new j0.k(new y2.g[]{new x(i11, i11), new e(k0.c(j10), 0)}));
    }

    public static final void K(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            f2.a.a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] fArr7 = fArr5[i18];
            float[] fArr8 = fArr4[i18];
            l.e(fArr8, "<this>");
            l.e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr9 = fArr5[i19];
                float fR = r(fArr7, fArr9);
                for (int i20 = 0; i20 < i10; i20++) {
                    fArr7[i20] = fArr7[i20] - (fArr9[i20] * fR);
                }
            }
            float fSqrt = (float) Math.sqrt(r(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                fArr7[i21] = fArr7[i21] * f10;
            }
            float[] fArr10 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr10[i22] = i22 < i18 ? 0.0f : r(fArr7, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fR2 = r(fArr5[i23], fArr2);
            float[] fArr11 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fR2 -= fArr11[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fR2 / fArr11[i23];
        }
    }

    public static final z L(o oVar) {
        Object[] objArr = new Object[0];
        androidx.media3.exoplayer.offline.u uVar = z.f3179x;
        boolean zD = oVar.d(0) | oVar.d(0);
        Object objK = oVar.K();
        if (zD || objK == k.f24334a) {
            objK = new a0(0);
            oVar.h0(objK);
        }
        return (z) g1.l.d(objArr, uVar, (ic.a) objK, oVar, 0, 4);
    }

    public static final String M(be.e eVar) {
        l.e(eVar, "<this>");
        String strB = eVar.b();
        l.d(strB, "asString(...)");
        if (!de.o.f5958a.contains(strB)) {
            int i10 = 0;
            while (true) {
                if (i10 < strB.length()) {
                    char cCharAt = strB.charAt(i10);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i10++;
                } else if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                    String strB2 = eVar.b();
                    l.d(strB2, "asString(...)");
                    return strB2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String strB3 = eVar.b();
        l.d(strB3, "asString(...)");
        sb.append("`".concat(strB3));
        sb.append('`');
        return sb.toString();
    }

    public static final String N(String str, String str2, ic.a aVar, ic.a aVar2, ic.k kVar) {
        l.e(str, "lowerRendered");
        l.e(str2, "upperRendered");
        l.e(kVar, "escape");
        String str3 = (String) aVar.b();
        String strP = P(str, h0.j(str3, "Mutable"), str2, str3, h0.j(str3, "(Mutable)"));
        if (strP != null) {
            return strP;
        }
        String strP2 = P(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strP2 != null) {
            return strP2;
        }
        String str4 = (String) aVar2.b();
        StringBuilder sbP = h0.p(str4);
        sbP.append((String) kVar.a("Array<"));
        String string = sbP.toString();
        StringBuilder sbP2 = h0.p(str4);
        sbP2.append((String) kVar.a("Array<out "));
        String string2 = sbP2.toString();
        StringBuilder sbP3 = h0.p(str4);
        sbP3.append((String) kVar.a("Array<(out) "));
        String strP3 = P(str, string, str2, string2, sbP3.toString());
        if (strP3 != null) {
            return strP3;
        }
        return null;
    }

    public static final String O(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            be.e eVar = (be.e) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(M(eVar));
        }
        return sb.toString();
    }

    public static final String P(String str, String str2, String str3, String str4, String str5) {
        l.e(str, "lowerRendered");
        l.e(str2, "lowerPrefix");
        l.e(str3, "upperRendered");
        l.e(str4, "upperPrefix");
        l.e(str5, "foldedPrefix");
        if (!u.k0(str, str2, false) || !u.k0(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        l.d(strSubstring, "substring(...)");
        String strSubstring2 = str3.substring(str4.length());
        l.d(strSubstring2, "substring(...)");
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!Z(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static int Q(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    public static int R(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long S(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static q U(q qVar, float f10, l0 l0Var, boolean z10, int i10) {
        if ((i10 & 4) != 0) {
            z10 = Float.compare(f10, (float) 0) > 0;
        }
        boolean z11 = z10;
        long j10 = w.f17581a;
        return (Float.compare(f10, (float) 0) > 0 || z11) ? qVar.e(new ShadowGraphicsLayerElement(f10, l0Var, z11, j10, j10)) : qVar;
    }

    public static long V(String str) {
        int i10;
        int length = str.length();
        l.e(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(c.I("endIndex < beginIndex: ", length, 0, " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbO = h0.o(length, "endIndex > string.length: ", " > ");
            sbO.append(str.length());
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i11 = i12;
                    } else {
                        j10 += (long) 4;
                        i11 += 2;
                    }
                }
                j10 += (long) i10;
            }
            i11++;
        }
        return j10;
    }

    public static String W(int i10) {
        return i10 == 1 ? "Clip" : i10 == 2 ? "Ellipsis" : i10 == 5 ? "MiddleEllipsis" : i10 == 3 ? "Visible" : i10 == 4 ? "StartEllipsis" : "Invalid";
    }

    public static be.b X(be.c cVar) {
        l.e(cVar, "topLevelFqName");
        return new be.b(cVar.b(), cVar.f2744a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i1.a, i1.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList Y(z1 z1Var, int i10, Integer num) {
        ?? iVar = new i(z1Var);
        int iQ = z1Var.q(i10);
        x0.a aVarA = z1Var.a(i10);
        while (i10 >= 0) {
            iVar.d(z1Var.f24529a.m(i10), num);
            if (iQ >= 0) {
                x0.a aVar = aVarA;
                aVarA = z1Var.a(iQ);
                i10 = iQ;
                iQ = z1Var.q(iQ);
                num = aVar;
            } else {
                i10 = iQ;
                num = aVarA;
            }
        }
        return iVar.f8636a;
    }

    public static final boolean Z(String str, String str2) {
        l.e(str, "lower");
        l.e(str2, "upper");
        if (str.equals(u.h0(str2, "?", "", false))) {
            return true;
        }
        if (u.c0(str2, "?", false) && l.a(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return l.a(sb.toString(), str2);
    }

    public static final void a(q qVar, f1.f fVar, f1.f fVar2, o oVar, int i10) {
        oVar.Y(162937223);
        if ((((oVar.f(qVar) ? 4 : 2) | i10) & 731) == 146 && oVar.z()) {
            oVar.Q();
        } else {
            oVar.X(-1323940314);
            int iQ = v.q(oVar);
            j1 j1VarL = oVar.l();
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            f1.f fVarK = n1.k(qVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(i2.j.f8738g, cg.a.f3994a, oVar);
            v.A(i2.j.f8737f, j1VarL, oVar);
            h hVar = i2.j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            fVarK.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            fVar.q(oVar, 6);
            fVar2.q(oVar, 6);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c0.c(qVar, fVar, fVar2, i10, 1);
        }
    }

    public static final d b(String str) {
        return new d(ud.e.X(str));
    }

    public static final f3.e c(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        g3.a aVarA = g3.b.a(f10);
        if (aVarA == null) {
            aVarA = new n(f10);
        }
        return new f3.e(f11, f10, aVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final e7.a0 a0Var, final e7.w wVar, final q qVar, final j1.d dVar, final ic.k kVar, final ic.k kVar2, final ic.k kVar3, final ic.k kVar4, o oVar, final int i10) {
        ic.k kVar5;
        f7.i iVar;
        w0 w0Var;
        n0 n0Var;
        o oVar2;
        f7.i iVar2;
        g1.e eVar;
        int i11;
        e0 e0Var;
        ic.k kVar6;
        q1 q1Var;
        r.w0 w0Var2;
        e7.j jVar;
        f7.i iVar3;
        w0 w0Var3;
        Object obj;
        r.w0 w0Var4;
        Activity activity;
        oVar.Y(-1964664536);
        int i12 = (i10 & 6) == 0 ? (oVar.h(a0Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i12 |= oVar.h(wVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= oVar.f(dVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= oVar.h(kVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            kVar5 = kVar2;
            i12 |= oVar.h(kVar5) ? 131072 : 65536;
        } else {
            kVar5 = kVar2;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= oVar.h(kVar3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= oVar.h(kVar4) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= oVar.h(null) ? 67108864 : 33554432;
        }
        if ((i12 & 38347923) == 38347922 && oVar.z()) {
            oVar.Q();
            oVar2 = oVar;
        } else {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            androidx.lifecycle.x xVar = (androidx.lifecycle.x) oVar.j(g4.a.f7345a);
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            androidx.lifecycle.w0 w0VarD = x0VarA.d();
            a0Var.getClass();
            h7.g gVar = a0Var.f6299b;
            l.e(w0VarD, "viewModelStore");
            gVar.getClass();
            vb.j<e7.j> jVar2 = gVar.f8164f;
            n0 n0Var2 = gVar.f8177s;
            int i13 = i12;
            if (!l.a(gVar.f8173o, e7.g.c(w0VarD))) {
                if (!jVar2.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                gVar.f8173o = e7.g.c(w0VarD);
            }
            l.e(wVar, "graph");
            LinkedHashMap linkedHashMap = gVar.f8178t;
            h7.k kVar7 = wVar.f6409f;
            if (!jVar2.isEmpty() && gVar.h() == androidx.lifecycle.p.f794a) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (l.a(gVar.f8161c, wVar)) {
                iVar = null;
                int iG = ((v0) kVar7.f8199d).g();
                for (int i14 = 0; i14 < iG; i14++) {
                    e7.u uVar = (e7.u) ((v0) kVar7.f8199d).h(i14);
                    e7.w wVar2 = gVar.f8161c;
                    l.b(wVar2);
                    int iE = ((v0) wVar2.f6409f.f8199d).e(i14);
                    e7.w wVar3 = gVar.f8161c;
                    l.b(wVar3);
                    v0 v0Var = (v0) wVar3.f6409f.f8199d;
                    if (v0Var.f16058a) {
                        t.a(v0Var);
                    }
                    int iA = p.a.a(v0Var.f16059b, v0Var.f16061d, iE);
                    if (iA >= 0) {
                        Object[] objArr = v0Var.f16060c;
                        Object obj2 = objArr[iA];
                        objArr[iA] = uVar;
                    }
                }
                for (e7.j jVar3 : jVar2) {
                    int i15 = e7.u.f6398e;
                    ef.i iVarQ = m.Q(df.m.g0(e7.g.b(jVar3.f6334b)));
                    e7.u uVarR = gVar.f8161c;
                    l.b(uVarR);
                    Iterator it = iVarQ.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((h1.h0) it).f8015b;
                        if (listIterator.hasPrevious()) {
                            e7.u uVar2 = (e7.u) listIterator.previous();
                            if (!l.a(uVar2, gVar.f8161c) || !l.a(uVarR, wVar)) {
                                if (uVarR instanceof e7.w) {
                                    uVarR = ((e7.w) uVarR).f6409f.r(uVar2.f6400b.f8187a);
                                    l.b(uVarR);
                                }
                            }
                        }
                    }
                    l.e(uVarR, "<set-?>");
                    jVar3.f6334b = uVarR;
                }
            } else {
                e7.w wVar4 = gVar.f8161c;
                if (wVar4 != null) {
                    for (Integer num : new ArrayList(gVar.f8170l.keySet())) {
                        l.b(num);
                        int iIntValue = num.intValue();
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((e7.l) it2.next()).f6356d = true;
                        }
                        e7.e0 e0Var2 = new e7.e0();
                        e0Var2.f6320c = true;
                        boolean z10 = e0Var2.f6319b;
                        boolean z11 = e0Var2.f6320c;
                        int i16 = e0Var2.f6321d;
                        boolean z12 = e0Var2.f6322e;
                        e7.c0 c0Var = e0Var2.f6318a;
                        boolean zP = gVar.p(iIntValue, null, new d0(z10, z11, i16, false, z12, c0Var.f6308b, c0Var.f6309c));
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((e7.l) it3.next()).f6356d = false;
                            it3 = it3;
                            zP = zP;
                        }
                        if (zP) {
                            gVar.l(true, iIntValue, false);
                        }
                    }
                    gVar.l(true, wVar4.f6400b.f8187a, false);
                }
                gVar.f8161c = wVar;
                e7.a0 a0Var2 = gVar.f8159a;
                c4.n nVar = a0Var2.f6300c;
                Bundle bundle = gVar.f8162d;
                if (bundle != null && bundle.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        s.s("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    for (String str : stringArrayList) {
                        n0Var2.b(str);
                        if (bundle.containsKey(str)) {
                            ud.n.p(str, bundle);
                        }
                    }
                }
                Bundle[] bundleArr = gVar.f8163e;
                if (bundleArr != null) {
                    int length = bundleArr.length;
                    int i17 = 0;
                    while (i17 < length) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle2 = bundleArr2[i17];
                        l.e(bundle2, "state");
                        bundle2.setClassLoader(e7.k.class.getClassLoader());
                        String string = bundle2.getString("nav-entry-state:id");
                        if (string == null) {
                            s.s("nav-entry-state:id");
                            throw null;
                        }
                        int iN = ud.n.n("nav-entry-state:destination-id", bundle2);
                        Bundle bundleP = ud.n.p("nav-entry-state:args", bundle2);
                        Bundle bundleP2 = ud.n.p("nav-entry-state:saved-state", bundle2);
                        e7.u uVarC = gVar.c(iN, null);
                        if (uVarC == null) {
                            int i18 = e7.u.f6398e;
                            StringBuilder sbK = c.K("Restoring the Navigation back stack failed: destination ", e7.g.a(nVar, iN), " cannot be found from the current destination ");
                            sbK.append(gVar.f());
                            throw new IllegalStateException(sbK.toString());
                        }
                        androidx.lifecycle.p pVarH = gVar.h();
                        e7.m mVar = gVar.f8173o;
                        l.e(nVar, "context");
                        l.e(pVarH, "hostLifecycleState");
                        Context context = nVar.f3388a;
                        bundleP.setClassLoader(context != null ? context.getClassLoader() : null);
                        e7.j jVar4 = new e7.j(nVar, uVarC, bundleP, pVarH, mVar, string, bundleP2);
                        m0 m0VarB = n0Var2.b(uVarC.f6399a);
                        Object obj3 = linkedHashMap.get(m0VarB);
                        Object obj4 = obj3;
                        if (obj3 == null) {
                            e7.l lVar = new e7.l(a0Var2, m0VarB);
                            linkedHashMap.put(m0VarB, lVar);
                            obj4 = lVar;
                        }
                        jVar2.addLast(jVar4);
                        ((e7.l) obj4).a(jVar4);
                        e7.w wVar5 = jVar4.f6334b.f6401c;
                        if (wVar5 != null) {
                            gVar.j(jVar4, gVar.e(wVar5.f6400b.f8187a));
                        }
                        i17++;
                        bundleArr = bundleArr2;
                    }
                    gVar.f8160b.b();
                    gVar.f8163e = null;
                }
                Collection collectionValues = vb.w.B(n0Var2.f6366a).values();
                ArrayList<m0> arrayList = new ArrayList();
                for (Object obj5 : collectionValues) {
                    if (!((m0) obj5).f6363b) {
                        arrayList.add(obj5);
                    }
                }
                for (m0 m0Var : arrayList) {
                    Object lVar2 = linkedHashMap.get(m0Var);
                    if (lVar2 == null) {
                        l.e(m0Var, "navigator");
                        lVar2 = new e7.l(a0Var2, m0Var);
                        linkedHashMap.put(m0Var, lVar2);
                    }
                    m0Var.getClass();
                    m0Var.f6362a = (e7.l) lVar2;
                    m0Var.f6363b = true;
                }
                if (gVar.f8161c == null || !jVar2.isEmpty()) {
                    iVar = null;
                    gVar.b();
                } else if (a0Var2.f6302e || (activity = a0Var2.f6301d) == null || !a0Var2.a(activity.getIntent())) {
                    e7.w wVar6 = gVar.f8161c;
                    l.b(wVar6);
                    iVar = null;
                    gVar.k(wVar6, null, null);
                } else {
                    iVar = null;
                }
            }
            m0 m0VarB2 = n0Var2.b("composable");
            final f7.i iVar4 = m0VarB2 instanceof f7.i ? (f7.i) m0VarB2 : iVar;
            if (iVar4 == null) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    final int i19 = 2;
                    final ic.k kVar8 = kVar5;
                    p1VarR.f24421d = new ic.n() { // from class: f7.t
                        @Override // ic.n
                        public final Object q(Object obj6, Object obj7) {
                            switch (i19) {
                                case 0:
                                    ((Integer) obj7).getClass();
                                    lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar8, kVar3, kVar4, (x0.o) obj6, x0.v.D(i10 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj7).getClass();
                                    lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar8, kVar3, kVar4, (x0.o) obj6, x0.v.D(i10 | 1));
                                    break;
                                default:
                                    ((Integer) obj7).getClass();
                                    lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar8, kVar3, kVar4, (x0.o) obj6, x0.v.D(i10 | 1));
                                    break;
                            }
                            return ub.a0.f21526a;
                        }
                    };
                    return;
                }
                return;
            }
            w0 w0VarL = v.l(iVar4.b().f6357e, oVar);
            Object objK = oVar.K();
            r0 r0Var = k.f24334a;
            Object obj6 = objK;
            if (objK == r0Var) {
                a1 a1Var = new a1(0.0f);
                oVar.h0(a1Var);
                obj6 = a1Var;
            }
            a1 a1Var2 = (a1) obj6;
            Object objK2 = oVar.K();
            Object obj7 = objK2;
            if (objK2 == r0Var) {
                e1 e1VarV = v.v(Boolean.FALSE);
                oVar.h0(e1VarV);
                obj7 = e1VarV;
            }
            final w0 w0Var5 = (w0) obj7;
            boolean z13 = ((List) w0VarL.getValue()).size() > 1;
            boolean zF = oVar.f(w0VarL) | oVar.h(iVar4);
            Object objK3 = oVar.K();
            if (zF || objK3 == r0Var) {
                objK3 = new f7.w(iVar4, w0VarL, a1Var2, w0Var5, (yb.c) null);
                w0Var = w0VarL;
                oVar.h0(objK3);
            } else {
                w0Var = w0VarL;
            }
            android.support.v4.media.session.b.l(z13, (ic.n) objK3, oVar, 0);
            boolean zH = oVar.h(a0Var) | oVar.h(xVar);
            Object objK4 = oVar.K();
            Object obj8 = objK4;
            if (zH || objK4 == r0Var) {
                q0 q0Var = new q0(5, a0Var, xVar);
                oVar.h0(q0Var);
                obj8 = q0Var;
            }
            v.c(xVar, (ic.k) obj8, oVar);
            g1.e eVarF = g1.l.f(oVar);
            w0 w0VarL2 = v.l(gVar.f8167i, oVar);
            Object objK5 = oVar.K();
            Object obj9 = objK5;
            if (objK5 == r0Var) {
                x0.c0 c0VarO = v.o(new r(w0VarL2, 2));
                oVar.h0(c0VarO);
                obj9 = c0VarO;
            }
            n2 n2Var = (n2) obj9;
            e7.j jVar5 = (e7.j) m.i0((List) n2Var.getValue());
            Object objK6 = oVar.K();
            Object obj10 = objK6;
            if (objK6 == r0Var) {
                int i20 = o0.f16028a;
                e0 e0Var3 = new e0(6);
                oVar.h0(e0Var3);
                obj10 = e0Var3;
            }
            e0 e0Var4 = (e0) obj10;
            if (jVar5 != null) {
                oVar.W(-1797250687);
                boolean zH2 = oVar.h(iVar4) | ((((i13 & 3670016) ^ 1572864) > 1048576 && oVar.f(kVar3)) || (i13 & 1572864) == 1048576) | ((i13 & 57344) == 16384);
                Object objK7 = oVar.K();
                if (zH2 || objK7 == r0Var) {
                    final int i21 = 0;
                    n0Var = n0Var2;
                    eVar = eVarF;
                    i11 = i13;
                    e0Var = e0Var4;
                    ic.k kVar9 = new ic.k() { // from class: f7.u
                        @Override // ic.k
                        public final Object a(Object obj11) {
                            int i22 = i21;
                            w0 w0Var6 = w0Var5;
                            ic.k kVar10 = kVar;
                            ic.k kVar11 = kVar3;
                            i iVar5 = iVar4;
                            q.m mVar2 = (q.m) obj11;
                            switch (i22) {
                                case 0:
                                    e7.u uVar3 = ((e7.j) mVar2.c()).f6334b;
                                    jc.l.c(uVar3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar = (h) uVar3;
                                    if (((Boolean) iVar5.f6764c.getValue()).booleanValue() || ((Boolean) w0Var6.getValue()).booleanValue()) {
                                        int i23 = e7.u.f6398e;
                                        for (e7.u uVar4 : e7.g.b(hVar)) {
                                        }
                                        return (q.q0) kVar11.a(mVar2);
                                    }
                                    int i24 = e7.u.f6398e;
                                    for (e7.u uVar5 : e7.g.b(hVar)) {
                                    }
                                    return (q.q0) kVar10.a(mVar2);
                                default:
                                    e7.u uVar6 = ((e7.j) mVar2.a()).f6334b;
                                    jc.l.c(uVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar2 = (h) uVar6;
                                    if (((Boolean) iVar5.f6764c.getValue()).booleanValue() || ((Boolean) w0Var6.getValue()).booleanValue()) {
                                        int i25 = e7.u.f6398e;
                                        for (e7.u uVar7 : e7.g.b(hVar2)) {
                                        }
                                        return (q.r0) kVar11.a(mVar2);
                                    }
                                    int i26 = e7.u.f6398e;
                                    for (e7.u uVar8 : e7.g.b(hVar2)) {
                                    }
                                    return (q.r0) kVar10.a(mVar2);
                            }
                        }
                    };
                    oVar.h0(kVar9);
                    objK7 = kVar9;
                } else {
                    n0Var = n0Var2;
                    eVar = eVarF;
                    i11 = i13;
                    e0Var = e0Var4;
                }
                ic.k kVar10 = (ic.k) objK7;
                boolean zH3 = oVar.h(iVar4) | ((((29360128 & i11) ^ 12582912) > 8388608 && oVar.f(kVar4)) || (i11 & 12582912) == 8388608) | ((458752 & i11) == 131072);
                Object objK8 = oVar.K();
                if (zH3 || objK8 == r0Var) {
                    final int i22 = 1;
                    kVar6 = kVar10;
                    ic.k kVar11 = new ic.k() { // from class: f7.u
                        @Override // ic.k
                        public final Object a(Object obj11) {
                            int i222 = i22;
                            w0 w0Var6 = w0Var5;
                            ic.k kVar102 = kVar2;
                            ic.k kVar112 = kVar4;
                            i iVar5 = iVar4;
                            q.m mVar2 = (q.m) obj11;
                            switch (i222) {
                                case 0:
                                    e7.u uVar3 = ((e7.j) mVar2.c()).f6334b;
                                    jc.l.c(uVar3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar = (h) uVar3;
                                    if (((Boolean) iVar5.f6764c.getValue()).booleanValue() || ((Boolean) w0Var6.getValue()).booleanValue()) {
                                        int i23 = e7.u.f6398e;
                                        for (e7.u uVar4 : e7.g.b(hVar)) {
                                        }
                                        return (q.q0) kVar112.a(mVar2);
                                    }
                                    int i24 = e7.u.f6398e;
                                    for (e7.u uVar5 : e7.g.b(hVar)) {
                                    }
                                    return (q.q0) kVar102.a(mVar2);
                                default:
                                    e7.u uVar6 = ((e7.j) mVar2.a()).f6334b;
                                    jc.l.c(uVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar2 = (h) uVar6;
                                    if (((Boolean) iVar5.f6764c.getValue()).booleanValue() || ((Boolean) w0Var6.getValue()).booleanValue()) {
                                        int i25 = e7.u.f6398e;
                                        for (e7.u uVar7 : e7.g.b(hVar2)) {
                                        }
                                        return (q.r0) kVar112.a(mVar2);
                                    }
                                    int i26 = e7.u.f6398e;
                                    for (e7.u uVar8 : e7.g.b(hVar2)) {
                                    }
                                    return (q.r0) kVar102.a(mVar2);
                            }
                        }
                    };
                    oVar.h0(kVar11);
                    objK8 = kVar11;
                } else {
                    kVar6 = kVar10;
                }
                ic.k kVar12 = (ic.k) objK8;
                boolean z14 = (234881024 & i11) == 67108864;
                Object objK9 = oVar.K();
                Object obj11 = objK9;
                if (z14 || objK9 == r0Var) {
                    d9.i iVar5 = new d9.i(20);
                    oVar.h0(iVar5);
                    obj11 = iVar5;
                }
                ic.k kVar13 = (ic.k) obj11;
                Boolean bool = Boolean.TRUE;
                boolean zH4 = oVar.h(iVar4);
                Object objK10 = oVar.K();
                Object obj12 = objK10;
                if (zH4 || objK10 == r0Var) {
                    q0 q0Var2 = new q0(4, n2Var, iVar4);
                    oVar.h0(q0Var2);
                    obj12 = q0Var2;
                }
                v.c(bool, (ic.k) obj12, oVar);
                Object objK11 = oVar.K();
                Object obj13 = objK11;
                if (objK11 == r0Var) {
                    r.w0 w0Var6 = new r.w0(jVar5);
                    oVar.h0(w0Var6);
                    obj13 = w0Var6;
                }
                r.w0 w0Var7 = (r.w0) obj13;
                q1 q1VarE = t1.e(w0Var7, "entry", oVar, 56, 0);
                if (((Boolean) w0Var5.getValue()).booleanValue()) {
                    oVar.W(-1795016672);
                    Float fValueOf = Float.valueOf(a1Var2.e());
                    boolean zF2 = oVar.f(w0Var) | oVar.h(w0Var7);
                    Object objK12 = oVar.K();
                    if (zF2 || objK12 == r0Var) {
                        iVar2 = null;
                        objK12 = new b0.x(w0Var7, w0Var, a1Var2, false ? 1 : 0, 5);
                        w0Var4 = w0Var7;
                        oVar.h0(objK12);
                    } else {
                        w0Var4 = w0Var7;
                        iVar2 = null;
                    }
                    v.e((ic.n) objK12, fValueOf, oVar);
                    oVar.p(false);
                    q1Var = q1VarE;
                    w0Var2 = w0Var4;
                    jVar = jVar5;
                } else {
                    iVar2 = null;
                    boolean z15 = false;
                    oVar.W(-1794598265);
                    boolean zH5 = oVar.h(w0Var7) | oVar.h(jVar5) | oVar.f(q1VarE);
                    Object objK13 = oVar.K();
                    if (zH5 || objK13 == r0Var) {
                        q1Var = q1VarE;
                        w0Var2 = w0Var7;
                        objK13 = new e.j((Object) w0Var2, (Object) jVar5, (Object) q1Var, (yb.c) (z15 ? 1 : 0), 2);
                        jVar = jVar5;
                        oVar.h0(objK13);
                    } else {
                        q1Var = q1VarE;
                        w0Var2 = w0Var7;
                        jVar = jVar5;
                    }
                    v.e((ic.n) objK13, jVar, oVar);
                    oVar.p(false);
                }
                boolean zH6 = oVar.h(e0Var) | oVar.h(iVar4) | oVar.f(kVar6) | oVar.f(kVar12) | oVar.f(kVar13);
                Object objK14 = oVar.K();
                if (zH6 || objK14 == r0Var) {
                    f7.i iVar6 = iVar4;
                    objK14 = new ba.a(e0Var, iVar6, kVar6, kVar12, kVar13, n2Var, w0Var5);
                    iVar3 = iVar6;
                    w0Var3 = w0Var5;
                    oVar.h0(objK14);
                } else {
                    iVar3 = iVar4;
                    w0Var3 = w0Var5;
                }
                ic.k kVar14 = (ic.k) objK14;
                Object objK15 = oVar.K();
                Object obj14 = objK15;
                if (objK15 == r0Var) {
                    d9.i iVar7 = new d9.i(19);
                    oVar.h0(iVar7);
                    obj14 = iVar7;
                }
                e7.j jVar6 = jVar;
                q1 q1Var2 = q1Var;
                androidx.compose.animation.a.a(q1Var2, qVar, kVar14, dVar, (ic.k) obj14, f1.g.f(820763100, new i0(w0Var2, jVar6, eVar, w0Var3, n2Var, 2), oVar), oVar, ((i11 >> 3) & 112) | 221184 | (i11 & 7168));
                oVar2 = oVar;
                Object objB1 = q1Var2.f18539a.b1();
                Object value = q1Var2.f18542d.getValue();
                boolean zF3 = oVar2.f(q1Var2) | oVar2.h(a0Var) | oVar2.h(jVar6) | oVar2.h(iVar3) | oVar2.h(e0Var);
                Object objK16 = oVar2.K();
                if (zF3 || objK16 == r0Var) {
                    obj = value;
                    f7.y yVar = new f7.y(q1Var2, a0Var, jVar6, e0Var, n2Var, iVar3, null);
                    oVar2.h0(yVar);
                    objK16 = yVar;
                } else {
                    obj = value;
                }
                v.f(objB1, obj, (ic.n) objK16, oVar2);
                oVar2.p(false);
            } else {
                n0Var = n0Var2;
                oVar2 = oVar;
                iVar2 = iVar;
                oVar2.W(-1789446406);
                oVar2.p(false);
            }
            m0 m0VarB3 = n0Var.b("dialog");
            f7.q qVar2 = m0VarB3 instanceof f7.q ? (f7.q) m0VarB3 : iVar2;
            if (qVar2 == 0) {
                p1 p1VarR2 = oVar2.r();
                if (p1VarR2 != null) {
                    final int i23 = 0;
                    p1VarR2.f24421d = new ic.n() { // from class: f7.t
                        @Override // ic.n
                        public final Object q(Object obj62, Object obj72) {
                            switch (i23) {
                                case 0:
                                    ((Integer) obj72).getClass();
                                    lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar2, kVar3, kVar4, (x0.o) obj62, x0.v.D(i10 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj72).getClass();
                                    lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar2, kVar3, kVar4, (x0.o) obj62, x0.v.D(i10 | 1));
                                    break;
                                default:
                                    ((Integer) obj72).getClass();
                                    lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar2, kVar3, kVar4, (x0.o) obj62, x0.v.D(i10 | 1));
                                    break;
                            }
                            return ub.a0.f21526a;
                        }
                    };
                    return;
                }
                return;
            }
            a.a.d(qVar2, oVar2, 0);
        }
        p1 p1VarR3 = oVar2.r();
        if (p1VarR3 != null) {
            final int i24 = 1;
            p1VarR3.f24421d = new ic.n() { // from class: f7.t
                @Override // ic.n
                public final Object q(Object obj62, Object obj72) {
                    switch (i24) {
                        case 0:
                            ((Integer) obj72).getClass();
                            lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar2, kVar3, kVar4, (x0.o) obj62, x0.v.D(i10 | 1));
                            break;
                        case 1:
                            ((Integer) obj72).getClass();
                            lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar2, kVar3, kVar4, (x0.o) obj62, x0.v.D(i10 | 1));
                            break;
                        default:
                            ((Integer) obj72).getClass();
                            lc.b.d(a0Var, wVar, qVar, dVar, kVar, kVar2, kVar3, kVar4, (x0.o) obj62, x0.v.D(i10 | 1));
                            break;
                    }
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void e(final e7.a0 a0Var, final String str, q qVar, j1.d dVar, final ic.k kVar, final ic.k kVar2, final ic.k kVar3, final ic.k kVar4, ic.k kVar5, o oVar, final int i10, final int i11) {
        q qVar2;
        int i12;
        j1.d dVar2;
        q qVar3;
        ic.k kVar6;
        final j1.d dVar3;
        final q qVar4;
        oVar.Y(1840250294);
        int i13 = i10 | (oVar.h(a0Var) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i13 |= oVar.f(str) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 = i13 | 384;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            i12 = i13 | (oVar.f(qVar2) ? 256 : 128);
        }
        int i15 = i12 | 805334016;
        if ((306783379 & i15) == 306783378 && oVar.z()) {
            oVar.Q();
            kVar6 = kVar5;
            qVar4 = qVar2;
            dVar3 = dVar;
        } else {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                if (i14 != 0) {
                    qVar2 = j1.n.f9689a;
                }
                q qVar5 = qVar2;
                dVar2 = j1.c.f9662a;
                qVar3 = qVar5;
            } else {
                oVar.Q();
                qVar3 = qVar2;
                dVar2 = dVar;
            }
            oVar.q();
            boolean z10 = (i15 & 112) == 32;
            Object objK = oVar.K();
            if (z10 || objK == k.f24334a) {
                e7.x xVar = new e7.x(a0Var.f6299b.f8177s, str);
                kVar6 = kVar5;
                kVar6.a(xVar);
                objK = xVar.c();
                oVar.h0(objK);
            } else {
                kVar6 = kVar5;
            }
            j1.d dVar4 = dVar2;
            d(a0Var, (e7.w) objK, qVar3, dVar4, kVar, kVar2, kVar3, kVar4, oVar, (i15 & 8078) | 115040256);
            dVar3 = dVar4;
            qVar4 = qVar3;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            final ic.k kVar7 = kVar6;
            p1VarR.f24421d = new ic.n() { // from class: f7.s
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lc.b.e(a0Var, str, qVar4, dVar3, kVar, kVar2, kVar3, kVar4, kVar7, (x0.o) obj, x0.v.D(i10 | 1), i11);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void f(int i10, o oVar) {
        f1.f fVar = a9.b.f210a;
        oVar.Y(-1677843913);
        int i11 = (oVar.h(fVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            fVar.q(oVar, Integer.valueOf(i11 & 14));
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ka.h(i10, 14);
        }
    }

    public static final w0 g(boolean z10, boolean z11, w.k kVar, x1 x1Var, float f10, float f11, o oVar, int i10) {
        o oVar2;
        n2 n2VarY;
        n2 n2VarY2;
        w0 w0VarI = ud.b.i(kVar, oVar, (i10 >> 6) & 14);
        x1Var.getClass();
        oVar.W(998675979);
        long j10 = !z10 ? x1Var.f13869h : z11 ? x1Var.f13868g : ((Boolean) ud.b.i(kVar, oVar, ((i10 & 8190) >> 6) & 14).getValue()).booleanValue() ? x1Var.f13866e : x1Var.f13867f;
        if (z10) {
            oVar.W(318144948);
            oVar2 = oVar;
            n2VarY = u1.a(j10, r.d.r(TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE, 0, null, 6), oVar2, 48, 12);
            oVar2.p(false);
        } else {
            oVar2 = oVar;
            oVar2.W(318247806);
            n2VarY = v.y(new q1.q(j10), oVar2);
            oVar2.p(false);
        }
        oVar2.p(false);
        if (!((Boolean) w0VarI.getValue()).booleanValue()) {
            f10 = f11;
        }
        if (z10) {
            oVar2.W(1361102414);
            n2VarY2 = r.e.a(f10, r.d.r(TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE, 0, null, 6), oVar2, 48);
            oVar2.p(false);
        } else {
            oVar2.W(1361206636);
            n2VarY2 = v.y(new f3.f(f11), oVar2);
            oVar2.p(false);
        }
        return v.y(new s.o(((f3.f) n2VarY2.getValue()).f6657a, new q1.n0(((q1.q) n2VarY.getValue()).f17577a)), oVar2);
    }

    public static final be.c h(be.c cVar, String str) {
        return cVar.a(be.e.e(str));
    }

    public static final boolean i(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (l.g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final void j(d2.e eVar, c2.t tVar) {
        d2.d dVar = eVar.f5463b;
        d2.d dVar2 = eVar.f5462a;
        boolean zA = c2.s.a(tVar);
        long j10 = tVar.f3323b;
        long j11 = 0;
        if (zA) {
            d2.a[] aVarArr = dVar2.f5457d;
            vb.l.p0(0, aVarArr.length, aVarArr);
            dVar2.f5458e = 0;
            d2.a[] aVarArr2 = dVar.f5457d;
            vb.l.p0(0, aVarArr2.length, aVarArr2);
            dVar.f5458e = 0;
            eVar.f5464c = 0L;
        }
        if (!c2.s.c(tVar)) {
            List list = tVar.f3332k;
            if (list == null) {
                list = vb.r.f22819a;
            }
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                c2.c cVar = (c2.c) list.get(i10);
                long j12 = cVar.f3247a;
                long jI = p1.b.i(cVar.f3249c, j11);
                dVar2.a(Float.intBitsToFloat((int) (jI >> 32)), j12);
                dVar.a(Float.intBitsToFloat((int) (jI & 4294967295L)), j12);
                i10++;
                j11 = 0;
            }
            long jI2 = p1.b.i(tVar.f3333l, 0L);
            dVar2.a(Float.intBitsToFloat((int) (jI2 >> 32)), j10);
            dVar.a(Float.intBitsToFloat((int) (jI2 & 4294967295L)), j10);
        }
        if (c2.s.c(tVar) && j10 - eVar.f5464c > 40) {
            d2.a[] aVarArr3 = dVar2.f5457d;
            vb.l.p0(0, aVarArr3.length, aVarArr3);
            dVar2.f5458e = 0;
            d2.a[] aVarArr4 = dVar.f5457d;
            vb.l.p0(0, aVarArr4.length, aVarArr4);
            dVar.f5458e = 0;
            eVar.f5464c = 0L;
        }
        eVar.f5464c = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [i1.a, i1.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [x0.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List l(d2 d2Var, Integer num, int i10, Integer num2) {
        int iD;
        g0 g0Var;
        if (d2Var.f24287w || d2Var.p() == 0) {
            return vb.r.f22819a;
        }
        ?? iVar = new i(d2Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = d2Var.f24286v;
            if (iD < 0) {
                iD = d2Var.D(d2Var.f24266b, i10);
            }
        }
        if (num == 0) {
            int iM = d2Var.f24273i - d2Var.M(d2Var.f24266b, d2Var.r(i10));
            o.y yVar = d2Var.f24283s;
            num = Integer.valueOf(iM + ((yVar == null || (g0Var = (g0) yVar.b(i10)) == null) ? 0 : g0Var.f15971b));
        }
        while (i10 >= 0) {
            iVar.d(d2Var.N(i10), num);
            num = d2Var.b(i10);
            if (iD >= 0) {
                int i11 = iD;
                iD = d2Var.D(d2Var.f24266b, iD);
                i10 = i11;
            } else {
                i10 = iD;
            }
        }
        return iVar.f8636a;
    }

    public static final void m(int i10, String str) {
        if (str.charAt(i10) == '-') {
            return;
        }
        StringBuilder sbO = h0.o(i10, "Expected '-' (hyphen) at index ", ", but was '");
        sbO.append(str.charAt(i10));
        sbO.append('\'');
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    public static float n(float f10, float f11, o oVar) {
        long j10 = ((q1.q) oVar.j(m0.j1.f13125a)).f17577a;
        return (!((b1) oVar.j(c1.f12773a)).j() ? ((double) q1.h0.r(j10)) < 0.5d : ((double) q1.h0.r(j10)) > 0.5d) ? f11 : f10;
    }

    public static Parcelable o(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcelable parcelable2 = (Parcelable) E(parcelable);
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable2.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) E((Parcelable) creator.createFromParcel(parcelObtain));
        } finally {
            parcelObtain.recycle();
        }
    }

    public static le.o p(String str, Iterable iterable) {
        le.n nVar;
        l.e(str, "debugName");
        bf.g gVar = new bf.g();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            nVar = le.n.f12335b;
            if (!zHasNext) {
                break;
            }
            le.o oVar = (le.o) it.next();
            if (oVar != nVar) {
                if (oVar instanceof le.a) {
                    le.o[] oVarArr = ((le.a) oVar).f12294c;
                    l.e(oVarArr, "elements");
                    gVar.addAll(vb.l.c0(oVarArr));
                } else {
                    gVar.add(oVar);
                }
            }
        }
        int i10 = gVar.f2801a;
        return i10 != 0 ? i10 != 1 ? new le.a(str, (le.o[]) gVar.toArray(new le.o[0])) : (le.o) gVar.get(0) : nVar;
    }

    public static eg.g q(m5.r rVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new eg.g(1, 0, length, i10);
    }

    public static final float r(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static int s(HandwritingGesture handwritingGesture, f0 f0Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        f0Var.a(new y2.a(1, fallbackText));
        return 5;
    }

    public static final Integer t(z1 z1Var, x0.r rVar, int i10, int i11) {
        Integer numT;
        int[] iArr = z1Var.f24530b;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int i12 = iArr[(i10 * 5) + 3] + i10;
            if (z1Var.j(i10) && z1Var.i(i10) == 206 && l.a(z1Var.p(iArr, i10), x0.p.f24412e)) {
                Object objH = z1Var.h(i10, 0);
                x0.m mVar = objH instanceof x0.m ? (x0.m) objH : null;
                if (mVar != null && mVar.f24350a.equals(rVar)) {
                    return Integer.valueOf(i10);
                }
            }
            if (z1Var.d(i10) && (numT = t(z1Var, rVar, i10 + 1, i12)) != null) {
                return Integer.valueOf(numT.intValue());
            }
            i10 = i12;
        }
    }

    public static final void u(long j10, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = ef.c.f6551a[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 += 2;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static be.b v(String str, boolean z10) {
        String strH0;
        l.e(str, "string");
        int iV0 = ef.n.v0(str, '`', 0, 6);
        if (iV0 == -1) {
            iV0 = str.length();
        }
        int iB0 = ef.n.B0(str, iV0, 4, "/");
        String str2 = "";
        if (iB0 == -1) {
            strH0 = u.h0(str, "`", "", false);
        } else {
            String strSubstring = str.substring(0, iB0);
            l.d(strSubstring, "substring(...)");
            String strI0 = u.i0(strSubstring, '/', '.');
            String strSubstring2 = str.substring(iB0 + 1);
            l.d(strSubstring2, "substring(...)");
            strH0 = u.h0(strSubstring2, "`", "", false);
            str2 = strI0;
        }
        return new be.b(new be.c(str2), new be.c(strH0), z10);
    }

    public static final String[] w(k1.n nVar) {
        l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((d) nVar).f10992b.toArray(new String[0]);
    }

    public static float x(o oVar) {
        return n(1.0f, 0.87f, oVar);
    }

    public static final long y(byte[] bArr, int i10) {
        return (((long) bArr[i10 + 7]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    public static final f z() {
        f fVar = f12169a;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("AutoMirrored.Filled.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = w1.g0.f23208a;
        q1.n0 n0Var = new q1.n0(q1.q.f17569b);
        hd.q0 q0Var = new hd.q0((byte) 0, 6);
        q0Var.u(19.0f, 19.0f);
        q0Var.q(5.0f);
        q0Var.y(5.0f);
        q0Var.r(7.0f);
        q0Var.y(3.0f);
        q0Var.q(5.0f);
        q0Var.n(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q0Var.z(14.0f);
        q0Var.n(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        q0Var.r(14.0f);
        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0Var.z(-7.0f);
        q0Var.r(-2.0f);
        q0Var.z(7.0f);
        q0Var.l();
        q0Var.u(14.0f, 3.0f);
        q0Var.z(2.0f);
        q0Var.r(3.59f);
        q0Var.t(-9.83f, 9.83f);
        q0Var.t(1.41f, 1.41f);
        q0Var.s(19.0f, 6.41f);
        q0Var.y(10.0f);
        q0Var.r(2.0f);
        q0Var.y(3.0f);
        q0Var.r(-7.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f12169a = fVarB;
        return fVarB;
    }

    public abstract void T(d.m0 m0Var, d.m0 m0Var2, Window window, View view, boolean z10, boolean z11);

    public void k(Window window) {
    }
}
