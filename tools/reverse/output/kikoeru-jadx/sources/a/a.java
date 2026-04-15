package a;

import a2.c;
import a3.e;
import a9.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.g0;
import b0.l0;
import b0.r1;
import bg.a2;
import bg.e1;
import bg.o1;
import cg.c0;
import cg.j;
import e.b;
import e.h;
import g2.n1;
import g2.v0;
import g5.n;
import g5.u;
import g5.y;
import h1.s;
import h1.z;
import hd.q0;
import i2.i;
import i7.p2;
import ic.k;
import j2.z1;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import le.l;
import le.o;
import m0.d1;
import m0.f3;
import m0.g1;
import m0.g3;
import m0.u6;
import m0.x;
import m4.o0;
import m4.p;
import m4.q;
import n7.b0;
import na.w;
import oc.d;
import q.t0;
import q1.h0;
import q1.n0;
import q2.t;
import u3.x0;
import ub.a0;
import v0.k0;
import vb.m;
import w1.f;
import x0.d0;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import x0.y1;
import xf.r;
import y.i1;
import y.j1;
import y.k1;
import y.l1;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f2c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r9 = (int) r8
            r8 = r9 | 1
            int[] r9 = ab.e.f299a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "mode was UNNECESSARY, but rounding was necessary"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.A(long, long, java.math.RoundingMode):long");
    }

    public static int B(boolean z10) {
        List supportedPerformancePoints;
        try {
            p pVar = new p();
            pVar.f14488m = o0.p("video/avc");
            q qVar = new q(pVar);
            String str = qVar.f14544n;
            if (str != null) {
                List listE = y.e(str, z10, false);
                String strB = y.b(qVar);
                Iterable iterableE = strB == null ? a1.f25946e : y.e(strB, z10, false);
                f0 f0VarP = i0.p();
                f0VarP.c(listE);
                f0VarP.c(iterableE);
                a1 a1VarF = f0VarP.f();
                for (int i10 = 0; i10 < a1VarF.f25948d; i10++) {
                    if (((n) a1VarF.get(i10)).f7388d != null && ((n) a1VarF.get(i10)).f7388d.getVideoCapabilities() != null && (supportedPerformancePoints = ((n) a1VarF.get(i10)).f7388d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        g0.l();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointF = g0.f();
                        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                            if (g0.h(supportedPerformancePoints.get(i11)).covers(performancePointF)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (u unused) {
        }
        return 0;
    }

    public static boolean C(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = false;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
                if (cursorQuery.getCount() > 0) {
                    z10 = true;
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            cursorQuery = cursorQuery;
            x(cursorQuery);
            return z10;
        } catch (Throwable th2) {
            x(cursorQuery);
            throw th2;
        }
    }

    public static long D(long j10, long j11) {
        c.A(j10, "a");
        c.A(j11, "b");
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static /* synthetic */ Collection E(le.q qVar, le.f fVar, int i10) {
        if ((i10 & 1) != 0) {
            fVar = le.f.f12310m;
        }
        o.f12336a.getClass();
        return qVar.e(fVar, l.f12329b);
    }

    public static final long F(p2 p2Var) {
        DragEvent dragEvent = (DragEvent) p2Var.f9258a;
        float x3 = dragEvent.getX();
        float y5 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x3)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L);
    }

    public static boolean H() {
        if (Build.VERSION.SDK_INT >= 29) {
            return e8.a.a();
        }
        try {
            if (f1b == null) {
                f0a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1b.invoke(null, Long.valueOf(f0a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final int I(d dVar) {
        mc.a aVar = mc.d.f15096a;
        int i10 = dVar.f16307a;
        if (dVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + dVar);
        }
        int i11 = dVar.f16308b;
        if (i11 < Integer.MAX_VALUE) {
            return mc.d.f15096a.c(i10, i11 + 1);
        }
        if (i10 <= Integer.MIN_VALUE) {
            return mc.d.f15096a.b();
        }
        return mc.d.f15096a.c(i10 - 1, i11) + 1;
    }

    public static String K(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th2;
        Exception exc;
        ContentResolver contentResolver = context.getContentResolver();
        String string = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                        string = cursorQuery.getString(0);
                    }
                } catch (Exception e10) {
                    exc = e10;
                    Log.w("DocumentFile", "Failed query: " + exc);
                }
            } catch (Throwable th3) {
                th2 = th3;
                x(cursorQuery);
                throw th2;
            }
        } catch (Exception e11) {
            exc = e11;
            cursorQuery = null;
        } catch (Throwable th4) {
            cursorQuery = null;
            th2 = th4;
            x(cursorQuery);
            throw th2;
        }
        x(cursorQuery);
        return string;
    }

    public static final h L(a aVar, k kVar, x0.o oVar, int i10) {
        v.y(aVar, oVar);
        Object objY = v.y(kVar, oVar);
        Object[] objArr = new Object[0];
        Object objK = oVar.K();
        Object obj = x0.k.f24334a;
        if (objK == obj) {
            objK = new g(29);
            oVar.h0(objK);
        }
        Object obj2 = (String) g1.l.d(objArr, null, (ic.a) objK, oVar, 3072, 6);
        g.d dVar = (g.d) oVar.j(e.f.f6023a);
        if (dVar == null) {
            oVar.W(1213380307);
            Object baseContext = (Context) oVar.j(AndroidCompositionLocals_androidKt.f721b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof g.d) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            dVar = (g.d) baseContext;
        } else {
            oVar.W(1213379439);
        }
        oVar.p(false);
        if (dVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        Object obj3 = ((d.n) dVar).f5244h;
        Object objK2 = oVar.K();
        if (objK2 == obj) {
            objK2 = new e.a();
            oVar.h0(objK2);
        }
        e.a aVar2 = (e.a) objK2;
        Object objK3 = oVar.K();
        if (objK3 == obj) {
            objK3 = new h(aVar2);
            oVar.h0(objK3);
        }
        h hVar = (h) objK3;
        boolean zH = oVar.h(aVar2) | oVar.h(obj3) | oVar.f(obj2) | oVar.h(aVar) | oVar.f(objY);
        Object objK4 = oVar.K();
        if (zH || objK4 == obj) {
            Object bVar = new b(aVar2, obj3, obj2, aVar, objY, 0);
            oVar.h0(bVar);
            objK4 = bVar;
        }
        k kVar2 = (k) objK4;
        boolean zF = oVar.f(obj3) | oVar.f(obj2) | oVar.f(aVar);
        Object objK5 = oVar.K();
        if (zF || objK5 == obj) {
            objK5 = new d0(kVar2);
            oVar.h0(objK5);
        }
        return hVar;
    }

    public static void M(o4.a aVar) {
        aVar.f16181k = -3.4028235E38f;
        aVar.f16180j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f16171a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f16171a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f16171a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final float N(long j10, float f10, f3.c cVar) {
        float fC;
        long jB = f3.o.b(j10);
        if (f3.p.a(jB, 4294967296L)) {
            if (cVar.M() <= 1.05d) {
                return cVar.i0(j10);
            }
            fC = f3.o.c(j10) / f3.o.c(cVar.E(f10));
        } else {
            if (!f3.p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = f3.o.c(j10);
        }
        return fC * f10;
    }

    public static float O(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    public static long P(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j13 = j10 * j11;
            if (j10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }

    public static final void Q(q2.o oVar, v3.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f22380a;
        Object objG = oVar.k().f17630a.g(t.f17675f);
        if (objG == null) {
            objG = null;
        }
        q2.b bVar = (q2.b) objG;
        if (bVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f17588a, bVar.f17589b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = oVar.k().f17630a.g(t.f17674e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = q2.o.j(4, oVar);
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                q2.o oVar2 = (q2.o) listJ.get(i10);
                if (oVar2.k().f17630a.c(t.H)) {
                    arrayList.add(oVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zU = u(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zU ? 1 : arrayList.size(), zU ? arrayList.size() : 1, false, 0));
    }

    public static final void R(q2.o oVar, v3.d dVar) {
        Object objG = oVar.k().f17630a.g(t.f17676g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        q2.o oVarL = oVar.l();
        if (oVarL == null) {
            return;
        }
        Object objG2 = oVarL.k().f17630a.g(t.f17674e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = oVarL.k().f17630a.g(t.f17675f);
            q2.b bVar = (q2.b) (objG3 != null ? objG3 : null);
            if (bVar == null || (bVar.f17588a >= 0 && bVar.f17589b >= 0)) {
                if (oVar.k().f17630a.c(t.H)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = q2.o.j(4, oVarL);
                    int size = listJ.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        q2.o oVar2 = (q2.o) listJ.get(i11);
                        if (oVar2.k().f17630a.c(t.H)) {
                            arrayList.add(oVar2);
                            if (oVar2.f17638c.w() < oVar.f17638c.w()) {
                                i10++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zU = u(arrayList);
                    int i12 = zU ? 0 : i10;
                    int i13 = zU ? i10 : 0;
                    Object objG4 = oVar.k().f17630a.g(t.H);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    dVar.f22380a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i12, 1, i13, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static final void S(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            spannable.setSpan(new ForegroundColorSpan(h0.B(j10)), i10, i11, 33);
        }
    }

    public static final void T(Spannable spannable, long j10, f3.c cVar, int i10, int i11) {
        long jB = f3.o.b(j10);
        if (f3.p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(lc.b.R(cVar.i0(j10)), false), i10, i11, 33);
        } else if (f3.p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(f3.o.c(j10)), i10, i11, 33);
        }
    }

    public static final void U(Spannable spannable, a3.c cVar, int i10, int i11) {
        LocaleSpan localeSpan;
        if (cVar != null) {
            List list = cVar.f196a;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(vb.n.K(cVar, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a3.b) it.next()).f194a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = a3.a.f(a3.a.e((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? e.f198a.r().a() : cVar.a()).f194a);
            }
            spannable.setSpan(localeSpan, i10, i11, 33);
        }
    }

    public static final jd.c V(Collection collection, jd.d dVar) {
        Iterator it = collection.iterator();
        jd.c cVar = null;
        while (it.hasNext()) {
            jd.c cVar2 = (jd.c) it.next();
            if (jc.l.a(cVar2.b(), dVar)) {
                if (cVar != null) {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + dVar);
                }
                cVar = cVar2;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + dVar);
    }

    public static final be.c W(be.c cVar, be.c cVar2) {
        jc.l.e(cVar, "<this>");
        be.d dVar = cVar.f2744a;
        jc.l.e(cVar2, "prefix");
        be.d dVar2 = cVar2.f2744a;
        if (!cVar.equals(cVar2) && !dVar2.c()) {
            String str = dVar.f2747a;
            String str2 = dVar2.f2747a;
            if (!ef.u.k0(str, str2, false) || str.charAt(str2.length()) != '.') {
                return cVar;
            }
        }
        if (dVar2.c()) {
            return cVar;
        }
        if (cVar.equals(cVar2)) {
            return be.c.f2743c;
        }
        String strSubstring = dVar.f2747a.substring(dVar2.f2747a.length() + 1);
        jc.l.d(strSubstring, "substring(...)");
        return new be.c(strSubstring);
    }

    public static final c9.d X(a2 a2Var, int i10) {
        jc.l.e(a2Var, "<this>");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = a2Var.f2823f;
        String str = a2Var.f2835r;
        List list = a2Var.f2838u;
        r rVar = w.f15765a;
        rVar.getClass();
        String strB = rVar.b(new wf.d(e1.Companion.serializer(), 0), list);
        String strB2 = rVar.b(new wf.d(o1.Companion.serializer(), 0), a2Var.f2841x);
        String strB3 = rVar.b(bg.c.Companion.serializer(), a2Var.f2818a);
        String str2 = a2Var.I;
        String str3 = a2Var.f2839v;
        boolean z10 = a2Var.f2822e;
        return new c9.d(i10, jCurrentTimeMillis, j10, na.c.l(a2Var), str, strB, strB2, strB3, a2Var.f2828k, z10, str2, str3, rVar.b(a2.Companion.serializer(), a2Var));
    }

    public static final void a(k1 k1Var, cg.f0 f0Var, x0.o oVar, int i10) {
        int i11;
        cg.f0 f0Var2;
        x0.o oVar2;
        jc.l.e(k1Var, "<this>");
        oVar.Y(926424680);
        if ((i10 & 112) == 0) {
            i11 = (oVar.h(f0Var) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 81) == 16 && oVar.z()) {
            oVar.Q();
            f0Var2 = f0Var;
            oVar2 = oVar;
        } else {
            f1.f fVar = j.f4050a;
            f0Var2 = f0Var;
            oVar2 = oVar;
            vb.w.a(f0Var2, null, false, null, null, oVar2, ((i11 >> 3) & 14) | 196608);
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new l0(k1Var, f0Var2, i10, 2);
        }
    }

    public static final void b(y.e1 e1Var, f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(883317355);
        if ((((oVar.f(e1Var) ? 4 : 2) | i10) & 91) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            j1.q qVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), m3.l.y(ud.b.x(new q1.q(q1.q.f17574g), new q1.q(q1.q.f17569b)))), e1Var), 40);
            j1.g gVar = j1.c.f9672k;
            y.o0 o0Var = y.k.f25156a;
            y.g gVar2 = new y.g(4, true, new y.j(j1.c.f9675n, 0));
            oVar.X(693286680);
            j1 j1VarA = i1.a(gVar2, gVar, oVar, 54);
            oVar.X(-1323940314);
            int iQ = v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            i2.k.f8771g0.getClass();
            i iVar = i2.j.f8733b;
            f1.f fVarK = n1.k(qVarD);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(i2.j.f8738g, j1VarA, oVar);
            v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            fVarK.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            fVar.g(l1.f25167a, oVar, 54);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.i0(e1Var, fVar, i10, 3);
        }
    }

    public static f3.d c() {
        return new f3.d(1.0f, 1.0f);
    }

    public static final void d(f7.q qVar, x0.o oVar, int i10) {
        s sVar;
        oVar.Y(294589392);
        if ((((oVar.h(qVar) ? 4 : 2) | i10) & 3) == 2 && oVar.z()) {
            oVar.Q();
        } else {
            g1.e eVarF = g1.l.f(oVar);
            w0 w0VarL = v.l(qVar.b().f6357e, oVar);
            Object obj = (Collection) ((List) w0VarL.getValue());
            boolean zBooleanValue = ((Boolean) oVar.j(z1.f10107a)).booleanValue();
            boolean zF = oVar.f(obj);
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            Object obj3 = objK;
            if (zF || objK == obj2) {
                s sVar2 = new s();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    e7.j jVar = (e7.j) obj4;
                    if (zBooleanValue || jVar.f6340h.f8143j.f826d.compareTo(androidx.lifecycle.p.f797d) >= 0) {
                        arrayList.add(obj4);
                    }
                }
                sVar2.addAll(arrayList);
                oVar.h0(sVar2);
                obj3 = sVar2;
            }
            s sVar3 = (s) obj3;
            k(sVar3, (List) w0VarL.getValue(), oVar, 0);
            w0 w0VarL2 = v.l(qVar.b().f6358f, oVar);
            Object objK2 = oVar.K();
            if (objK2 == obj2) {
                objK2 = new s();
                oVar.h0(objK2);
            }
            s sVar4 = (s) objK2;
            oVar.W(-367418626);
            ListIterator listIterator = sVar3.listIterator();
            while (true) {
                z zVar = (z) listIterator;
                if (!zVar.hasNext()) {
                    break;
                }
                e7.j jVar2 = (e7.j) zVar.next();
                e7.u uVar = jVar2.f6334b;
                jc.l.c(uVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                f7.p pVar = (f7.p) uVar;
                boolean zH = oVar.h(qVar) | oVar.h(jVar2);
                Object objK3 = oVar.K();
                if (zH || objK3 == obj2) {
                    objK3 = new a9.d(11, qVar, jVar2);
                    oVar.h0(objK3);
                }
                android.support.v4.media.session.b.c((ic.a) objK3, pVar.f6787f, f1.g.f(1129586364, new f7.n(jVar2, qVar, eVarF, sVar4, pVar, 0), oVar), oVar, 384);
            }
            oVar.p(false);
            Set set = (Set) w0VarL2.getValue();
            boolean zF2 = oVar.f(w0VarL2) | oVar.h(qVar);
            Object objK4 = oVar.K();
            if (zF2 || objK4 == obj2) {
                sVar = sVar4;
                Object oVar2 = new f7.o(w0VarL2, qVar, sVar, null, 0);
                oVar.h0(oVar2);
                objK4 = oVar2;
            } else {
                sVar = sVar4;
            }
            v.f(set, sVar, (ic.n) objK4, oVar);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.r(i10, 4, qVar);
        }
    }

    public static final void e(j1.q qVar, x0.o oVar, int i10) {
        Object obj = g1.f13013a;
        oVar.Y(1354335728);
        int i11 = (i10 & 6) == 0 ? ((i10 & 8) == 0 ? oVar.f(null) : oVar.h(null) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(obj) ? 256 : 128;
        }
        int i12 = 1;
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            Object objK = oVar.K();
            Object obj2 = objK;
            if (objK == x0.k.f24334a) {
                g3 g3Var = new g3();
                g3Var.f13015a = new Object();
                g3Var.f13016b = new ArrayList();
                oVar.h0(g3Var);
                obj2 = g3Var;
            }
            g3 g3Var2 = (g3) obj2;
            int i13 = 7;
            String strN = c.N(7, oVar);
            Object obj3 = g3Var2.f13015a;
            ArrayList arrayList = g3Var2.f13016b;
            if (jc.l.a(null, obj3)) {
                oVar.W(95900978);
                oVar.p(false);
            } else {
                oVar.W(141556995);
                g3Var2.f13015a = null;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((f3) arrayList.get(i14)).getClass();
                    arrayList2.add(null);
                }
                ArrayList arrayListH0 = m.H0(arrayList2);
                if (!arrayListH0.contains(null)) {
                    arrayListH0.add(null);
                }
                arrayList.clear();
                ArrayList arrayListA = h3.a.a(arrayListH0);
                int size2 = arrayListA.size();
                int i15 = 0;
                while (i15 < size2) {
                    if (arrayListA.get(i15) != null) {
                        throw new ClassCastException();
                    }
                    arrayList.add(new f3(f1.g.f(-1032415134, new m0.h0(arrayListH0, g3Var2, strN, i12), oVar)));
                    i15++;
                    i12 = 1;
                }
                oVar.p(false);
            }
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVar, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            v.A(i2.j.f8738g, v0VarD, oVar);
            v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            v.A(i2.j.f8735d, qVarC, oVar);
            g3Var2.f13017c = v.r(oVar);
            oVar.W(-1757732554);
            int size3 = arrayList.size();
            for (int i16 = 0; i16 < size3; i16++) {
                f3 f3Var = (f3) arrayList.get(i16);
                f3Var.getClass();
                f1.f fVar = f3Var.f12975a;
                oVar.U(-1515535286, null);
                f1.f fVar2 = g1.f13013a;
                fVar.g(f1.g.f(2017516783, new d1(i13), oVar), oVar, 6);
                oVar.p(false);
            }
            oVar.p(false);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ca.a(qVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(k1 k1Var, boolean z10, c0 c0Var, x0.o oVar, int i10) {
        int i11;
        f fVarB;
        boolean z11;
        jc.l.e(k1Var, "<this>");
        oVar.Y(552379615);
        if ((i10 & 112) == 0) {
            i11 = (oVar.g(z10) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.h(c0Var) ? 256 : 128;
        }
        if ((i11 & 721) == 144 && oVar.z()) {
            oVar.Q();
        } else {
            if (z10) {
                fVarB = b0.f15421e;
                if (fVarB == null) {
                    w1.e eVar = new w1.e("Filled.FullscreenExit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = w1.g0.f23208a;
                    n0 n0Var = new n0(q1.q.f17569b);
                    q0 q0Var = new q0((byte) 0, 6);
                    q0Var.u(5.0f, 16.0f);
                    q0Var.r(3.0f);
                    q0Var.z(3.0f);
                    q0Var.r(2.0f);
                    q0Var.z(-5.0f);
                    q0Var.s(5.0f, 14.0f);
                    q0Var.z(2.0f);
                    q0Var.l();
                    q0Var.u(8.0f, 8.0f);
                    q0Var.s(5.0f, 8.0f);
                    q0Var.z(2.0f);
                    q0Var.r(5.0f);
                    q0Var.s(10.0f, 5.0f);
                    j2.h0.t(q0Var, 8.0f, 5.0f, 3.0f);
                    q0Var.u(14.0f, 19.0f);
                    q0Var.r(2.0f);
                    q0Var.z(-3.0f);
                    q0Var.r(3.0f);
                    q0Var.z(-2.0f);
                    q0Var.r(-5.0f);
                    q0Var.z(5.0f);
                    q0Var.l();
                    q0Var.u(16.0f, 8.0f);
                    q0Var.s(16.0f, 5.0f);
                    q0Var.r(-2.0f);
                    q0Var.z(5.0f);
                    q0Var.r(5.0f);
                    q0Var.s(19.0f, 8.0f);
                    q0Var.r(-3.0f);
                    q0Var.l();
                    w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                    fVarB = eVar.b();
                    b0.f15421e = fVarB;
                }
            } else {
                f fVarB2 = nd.h.f15791e;
                if (fVarB2 == null) {
                    w1.e eVar2 = new w1.e("Filled.Fullscreen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i13 = w1.g0.f23208a;
                    n0 n0Var2 = new n0(q1.q.f17569b);
                    q0 q0Var2 = new q0((byte) 0, 6);
                    q0Var2.u(7.0f, 14.0f);
                    q0Var2.s(5.0f, 14.0f);
                    q0Var2.z(5.0f);
                    q0Var2.r(5.0f);
                    q0Var2.z(-2.0f);
                    q0Var2.s(7.0f, 17.0f);
                    q0Var2.z(-3.0f);
                    q0Var2.l();
                    q0Var2.u(5.0f, 10.0f);
                    q0Var2.r(2.0f);
                    q0Var2.s(7.0f, 7.0f);
                    q0Var2.r(3.0f);
                    q0Var2.s(10.0f, 5.0f);
                    j2.h0.t(q0Var2, 5.0f, 5.0f, 5.0f);
                    q0Var2.u(17.0f, 17.0f);
                    q0Var2.r(-3.0f);
                    q0Var2.z(2.0f);
                    q0Var2.r(5.0f);
                    q0Var2.z(-5.0f);
                    q0Var2.r(-2.0f);
                    q0Var2.z(3.0f);
                    q0Var2.l();
                    q0Var2.u(14.0f, 5.0f);
                    q0Var2.z(2.0f);
                    q0Var2.r(3.0f);
                    q0Var2.z(3.0f);
                    q0Var2.r(2.0f);
                    q0Var2.s(19.0f, 5.0f);
                    q0Var2.r(-5.0f);
                    q0Var2.l();
                    w1.e.a(eVar2, q0Var2.f8447b, 0, n0Var2);
                    fVarB2 = eVar2.b();
                    nd.h.f15791e = fVarB2;
                }
                fVarB = fVarB2;
            }
            f fVar = fVarB;
            j1.q qVarK = gh.g.k(j1.n.f9689a, g0.g.f7122a);
            oVar.X(843176682);
            boolean z12 = ((i11 & 896) == 256) | ((i11 & 112) == 32);
            Object objK = oVar.K();
            if (z12 || objK == x0.k.f24334a) {
                z11 = false;
                objK = new cg.k(c0Var, z10, 0 == true ? 1 : 0);
                oVar.h0(objK);
            } else {
                z11 = false;
            }
            oVar.p(z11);
            v0.j.b(fVar, null, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(qVarK, null, (ic.a) objK, 7), 4), q1.q.f17571d, oVar, 3120, 0);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l(k1Var, z10, c0Var, i10, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(int r23, int r24, a0.g0 r25, ic.k r26, j1.f r27, j1.q r28, s.f r29, u.p0 r30, x0.o r31, y.h r32, y.d1 r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.g(int, int, a0.g0, ic.k, j1.f, j1.q, s.f, u.p0, x0.o, y.h, y.d1, boolean):void");
    }

    public static final void h(ic.a aVar, x0.o oVar, int i10) {
        oVar.Y(1063434120);
        int i11 = (oVar.h(aVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
            boolean zH = oVar.h(view) | ((i11 & 14) == 4);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new ba.q0(10, view, aVar);
                oVar.h0(objK);
            }
            v.c(view, (k) objK, oVar);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ka.a(aVar, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0335 A[PHI: r7
      0x0335: PHI (r7v33 v.k) = (r7v23 v.k), (r7v34 v.k) binds: [B:230:0x0333, B:226:0x032c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0353 A[PHI: r12
      0x0353: PHI (r12v24 boolean) = (r12v30 boolean), (r12v25 boolean) binds: [B:240:0x0351, B:236:0x034b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x047a  */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(j1.q r41, d0.d r42, y.d1 r43, v.f r44, boolean r45, s.f r46, float r47, d0.k r48, b2.a r49, j1.g r50, v.k r51, f1.f r52, x0.o r53, int r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.i(j1.q, d0.d, y.d1, v.f, boolean, s.f, float, d0.k, b2.a, j1.g, v.k, f1.f, x0.o, int, int):void");
    }

    public static final void j(k1 k1Var, boolean z10, cg.b0 b0Var, x0.o oVar, int i10) {
        int i11;
        f fVarL;
        jc.l.e(k1Var, "<this>");
        oVar.Y(-264118054);
        if ((i10 & 112) == 0) {
            i11 = (oVar.g(z10) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.h(b0Var) ? 256 : 128;
        }
        if ((i11 & 721) == 144 && oVar.z()) {
            oVar.Q();
        } else {
            if (z10) {
                fVarL = x0.f21353k;
                if (fVarL == null) {
                    w1.e eVar = new w1.e("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = w1.g0.f23208a;
                    n0 n0Var = new n0(q1.q.f17569b);
                    q0 q0Var = new q0((byte) 0, 6);
                    q0Var.u(6.0f, 19.0f);
                    q0Var.r(4.0f);
                    q0Var.s(10.0f, 5.0f);
                    j2.h0.t(q0Var, 6.0f, 5.0f, 14.0f);
                    q0Var.u(14.0f, 5.0f);
                    q0Var.z(14.0f);
                    q0Var.r(4.0f);
                    q0Var.s(18.0f, 5.0f);
                    q0Var.r(-4.0f);
                    q0Var.l();
                    w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                    fVarL = eVar.b();
                    x0.f21353k = fVarL;
                }
            } else {
                fVarL = nd.h.l();
            }
            j1.q qVarK = gh.g.k(j1.n.f9689a, g0.g.f7122a);
            oVar.X(-146231793);
            int i13 = 1;
            boolean z11 = ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objK = oVar.K();
            if (z11 || objK == x0.k.f24334a) {
                objK = new cg.k(b0Var, z10, i13);
                oVar.h0(objK);
            }
            oVar.p(false);
            v0.j.b(fVarL, null, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(qVarK, null, (ic.a) objK, 7), 4), q1.q.f17571d, oVar, 3120, 0);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l(k1Var, z10, b0Var, i10, 1);
        }
    }

    public static final void k(final List list, Collection collection, x0.o oVar, int i10) {
        oVar.Y(1537894851);
        if ((((oVar.h(list) ? 4 : 2) | i10 | (oVar.h(collection) ? 32 : 16)) & 19) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            final boolean zBooleanValue = ((Boolean) oVar.j(z1.f10107a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final e7.j jVar = (e7.j) it.next();
                androidx.lifecycle.z zVar = jVar.f6340h.f8143j;
                boolean zG = oVar.g(zBooleanValue) | oVar.h(list) | oVar.h(jVar);
                Object objK = oVar.K();
                if (zG || objK == x0.k.f24334a) {
                    objK = new k() { // from class: f7.k
                        @Override // ic.k
                        public final Object a(Object obj) {
                            final e7.j jVar2 = jVar;
                            final List list2 = list;
                            final boolean z10 = zBooleanValue;
                            androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: f7.l
                                @Override // androidx.lifecycle.v
                                public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar2) {
                                    boolean z11 = z10;
                                    List list3 = list2;
                                    e7.j jVar3 = jVar2;
                                    if (z11 && !list3.contains(jVar3)) {
                                        list3.add(jVar3);
                                    }
                                    if (oVar2 == androidx.lifecycle.o.ON_START && !list3.contains(jVar3)) {
                                        list3.add(jVar3);
                                    }
                                    if (oVar2 == androidx.lifecycle.o.ON_STOP) {
                                        list3.remove(jVar3);
                                    }
                                }
                            };
                            jVar2.f6340h.f8143j.W0(vVar);
                            return new b0.p1(2, jVar2, vVar);
                        }
                    };
                    oVar.h0(objK);
                }
                v.c(zVar, (k) objK, oVar);
            }
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.h0(list, collection, i10, 4);
        }
    }

    public static final void l(u6 u6Var, j1.q qVar, ic.o oVar, x0.o oVar2, int i10) {
        int i11;
        j1.q qVar2;
        oVar2.Y(1351125615);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.f(u6Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 432;
        if (oVar2.N(i12 & 1, (i12 & 147) != 146)) {
            oVar = g1.f13013a;
            if (u6Var.f13705a.getValue() != null) {
                throw new ClassCastException();
            }
            j2.f fVar = (j2.f) oVar2.j(j2.l1.f9859a);
            yb.c cVar = null;
            boolean zH = oVar2.h(null) | oVar2.h(fVar);
            Object objK = oVar2.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new a9.k(12, fVar, cVar);
                oVar2.h0(objK);
            }
            v.e((ic.n) objK, null, oVar2);
            if (u6Var.f13705a.getValue() != null) {
                throw new ClassCastException();
            }
            int i13 = i12 & 1008;
            j1.n nVar = j1.n.f9689a;
            e(nVar, oVar2, i13);
            qVar2 = nVar;
        } else {
            oVar2.Q();
            qVar2 = qVar;
        }
        ic.o oVar3 = oVar;
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(i10, 7, u6Var, qVar2, oVar3);
        }
    }

    public static final void m(k1 k1Var, long j10, float f10, w.k kVar, cg.b0 b0Var, cg.y yVar, x0.o oVar, int i10) {
        int i11;
        w.k kVar2;
        jc.l.e(k1Var, "<this>");
        oVar.Y(-370778213);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(k1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= oVar.e(j10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.c(f10) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i10 & 57344) == 0) {
            i12 |= oVar.h(b0Var) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i12 |= oVar.h(yVar) ? 131072 : 65536;
        }
        if ((374491 & i12) == 74898 && oVar.z()) {
            oVar.Q();
            kVar2 = kVar;
        } else {
            oVar.X(-316781762);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = t0.I(oVar);
            }
            w.k kVar3 = (w.k) objK;
            oVar.p(false);
            j1.q qVarA = k1Var.a(androidx.compose.foundation.a.b(j1.n.f9689a, q1.q.f17572e, h0.f17515a), 1.0f);
            float f11 = j10;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            oc.a aVar = new oc.a(0.0f, f11);
            oVar.X(-316781494);
            boolean z10 = (i12 & 57344) == 16384;
            Object objK2 = oVar.K();
            if (z10 || objK2 == r0Var) {
                objK2 = new a0.f0(8, b0Var);
                oVar.h0(objK2);
            }
            oVar.p(false);
            k0.b(f10, (k) objK2, qVarA, false, aVar, yVar, null, kVar3, oVar, ((i12 >> 6) & 14) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024));
            kVar2 = kVar3;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.m(k1Var, j10, f10, kVar2, b0Var, yVar, i10);
        }
    }

    public static final void n(k1 k1Var, long j10, long j11, x0.o oVar, int i10) {
        int i11;
        long j12;
        jc.l.e(k1Var, "$this$TimeText");
        oVar.Y(1380237996);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(k1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            j12 = j10;
            i11 |= oVar.e(j12) ? 32 : 16;
        } else {
            j12 = j10;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.e(j11) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && oVar.z()) {
            oVar.Q();
        } else {
            v0.n0.a(gh.g.S(j12), k1Var.b(androidx.compose.foundation.layout.a.k(j1.n.f9689a, 4, 0)), j11, 0L, 0L, null, 0L, 0, false, 0, 0, null, oVar, i11 & 896, 131064);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.n(k1Var, j10, j11, i10);
        }
    }

    public static final void o(f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(-374117408);
        int i11 = 1;
        if ((i10 & 11) == 2 && oVar.z()) {
            oVar.Q();
        } else {
            j1.q qVarA = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), m3.l.y(ud.b.x(new q1.q(q1.q.f17569b), new q1.q(q1.q.f17574g))));
            j1.g gVar = j1.c.f9672k;
            y.o0 o0Var = y.k.f25156a;
            y.g gVar2 = new y.g(4, true, new y.j(j1.c.f9674m, 0));
            oVar.X(693286680);
            j1 j1VarA = i1.a(gVar2, gVar, oVar, 54);
            oVar.X(-1323940314);
            int iQ = v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            i2.k.f8771g0.getClass();
            i iVar = i2.j.f8733b;
            f1.f fVarK = n1.k(qVarA);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(i2.j.f8738g, j1VarA, oVar);
            v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            fVarK.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            fVar.g(l1.f25167a, oVar, 54);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new r1(fVar, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(ic.a r4, ic.n r5, ac.c r6) {
        /*
            boolean r0 = r6 instanceof m0.p
            if (r0 == 0) goto L13
            r0 = r6
            m0.p r0 = (m0.p) r0
            int r1 = r0.f13430e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13430e = r1
            goto L18
        L13:
            m0.p r0 = new m0.p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13429d
            int r1 = r0.f13430e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r6)     // Catch: m0.l -> L43
            goto L43
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            ub.a.f(r6)
            b0.x r6 = new b0.x     // Catch: m0.l -> L43
            r1 = 0
            r3 = 19
            r6.<init>(r4, r5, r1, r3)     // Catch: m0.l -> L43
            r0.f13430e = r2     // Catch: m0.l -> L43
            java.lang.Object r4 = hf.a0.k(r6, r0)     // Catch: m0.l -> L43
            zb.a r5 = zb.a.f26667a
            if (r4 != r5) goto L43
            return r5
        L43:
            ub.a0 r4 = ub.a0.f21526a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.p(ic.a, ic.n, ac.c):java.lang.Object");
    }

    public static j1.q q(j1.q qVar, x xVar, u.e1 e1Var, boolean z10, boolean z11, int i10) {
        return u.l0.a(qVar, xVar.f13850f, e1Var, z10, null, xVar.f13856l.getValue() != null, new m0.n(0, xVar, null), (i10 & 8) != 0 ? false : z11);
    }

    public static final Object r(x xVar, Object obj, float f10, ac.c cVar) {
        Object objA = xVar.a(obj, s.v0.f19292a, new m0.o(xVar, f10, null), cVar);
        return objA == zb.a.f26667a ? objA : a0.f21526a;
    }

    public static void s(Appendable appendable, Object obj, k kVar) {
        jc.l.e(appendable, "<this>");
        if (kVar != null) {
            appendable.append((CharSequence) kVar.a(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static void t(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final boolean u(ArrayList arrayList) {
        List list;
        long j10;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = vb.r.f22819a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iR = ud.b.r(arrayList);
                int i10 = 0;
                while (i10 < iR) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    q2.o oVar = (q2.o) obj2;
                    q2.o oVar2 = (q2.o) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (oVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (oVar.g().b() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (oVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (oVar.g().b() & 4294967295L)));
                    arrayList2.add(new p1.b((((long) Float.floatToRawIntBits(fAbs)) << 32) | (((long) Float.floatToRawIntBits(fAbs2)) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j10 = ((p1.b) m.Y(list)).f16481a;
            } else {
                if (list.isEmpty()) {
                    h3.a.d("Empty collection can't be reduced.");
                }
                Object objY = m.Y(list);
                int iR2 = ud.b.r(list);
                if (1 <= iR2) {
                    int i11 = 1;
                    while (true) {
                        objY = new p1.b(p1.b.i(((p1.b) objY).f16481a, ((p1.b) list.get(i11)).f16481a));
                        if (i11 == iR2) {
                            break;
                        }
                        i11++;
                    }
                }
                j10 = ((p1.b) objY).f16481a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j10)) >= Float.intBitsToFloat((int) (j10 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static long v(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j10 ^ j11) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        StringBuilder sb = new StringBuilder("overflow: checkedAdd(");
        sb.append(j10);
        sb.append(", ");
        throw new ArithmeticException(a0.c.H(j11, ")", sb));
    }

    public static final void w(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                ub.a.a(th2, th3);
            }
        }
    }

    public static void x(Cursor cursor) {
        if (cursor != null) {
            try {
                a0.c.M(cursor);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static final boolean y(p1.c cVar, float f10, float f11) {
        float f12 = cVar.f16483a;
        if (f10 > cVar.f16485c || f12 > f10) {
            return false;
        }
        return f11 <= cVar.f16486d && cVar.f16484b <= f11;
    }

    public abstract Object J(Intent intent, int i10);

    public abstract Intent z(Context context, Object obj);

    public void G(Context context, Object obj) {
    }
}
