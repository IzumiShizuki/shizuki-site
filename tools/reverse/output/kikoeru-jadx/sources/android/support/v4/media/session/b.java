package android.support.v4.media.session;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.s0;
import b0.c1;
import b0.w1;
import be.e;
import c7.p0;
import cg.l0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import d0.w;
import e7.g;
import e7.n0;
import e7.r;
import e7.x;
import ef.u;
import f3.m;
import f7.i;
import f7.j;
import g2.v0;
import hd.a0;
import hd.b0;
import hd.d0;
import hd.e0;
import hd.f0;
import hd.g0;
import hd.i0;
import hd.j0;
import hd.k0;
import hd.s;
import hd.t;
import hd.v;
import hd.y;
import hd.z;
import ic.n;
import j1.q;
import j2.h0;
import j2.l1;
import j3.p;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jc.l;
import m0.b1;
import m0.k1;
import m0.r1;
import m0.x3;
import m0.y3;
import m0.y5;
import m0.z3;
import m0.z5;
import oc.d;
import q.x1;
import u.e1;
import ub.k;
import w1.f;
import wd.h;
import x0.j1;
import x0.o;
import x0.p1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w1 f434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f436d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f437a;

    public /* synthetic */ b(int i10) {
        this.f437a = i10;
    }

    public static final void B(x xVar, String str, List list, List list2, f1.f fVar) {
        n0 n0Var = xVar.f6410f;
        n0Var.getClass();
        j jVar = new j((i) n0Var.b(g.d(i.class)), str, fVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e7.f fVar2 = (e7.f) it.next();
            jVar.f6405c.put(fVar2.f6323a, fVar2.f6324b);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            l.e(rVar, "navDeepLink");
            jVar.f6406d.add(rVar);
        }
        xVar.f6412h.add(jVar.a());
    }

    public static s0 C(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                l.b(objNewInstance);
                return (s0) objNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    public static final float D(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final String G(yd.f fVar, int i10) {
        l.e(fVar, "<this>");
        String strA = fVar.a(i10);
        return fVar.b(i10) ? h0.x(".", strA) : strA;
    }

    public static final int H(w wVar) {
        return (int) (wVar.f5415e == e1.f20882a ? wVar.c() & 4294967295L : wVar.c() >> 32);
    }

    public static Object I(Context context, Class cls) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return p0.e(context, cls);
        }
        String strF = i10 >= 23 ? p0.f(context, cls) : (String) n3.a.f15251a.get(cls);
        if (strF != null) {
            return context.getSystemService(strF);
        }
        return null;
    }

    public static b8.b J(c1 c1Var, SQLiteDatabase sQLiteDatabase) {
        l.e(c1Var, "refHolder");
        b8.b bVar = (b8.b) c1Var.f1208b;
        if (bVar != null && bVar.f2237a.equals(sQLiteDatabase)) {
            return bVar;
        }
        b8.b bVar2 = new b8.b(sQLiteDatabase);
        c1Var.f1208b = bVar2;
        return bVar2;
    }

    public static w1 K() {
        w1 w1Var;
        w1 w1Var2 = f434b;
        if (w1Var2 != null) {
            return w1Var2;
        }
        Object obj = null;
        try {
            w1Var = new w1(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 5);
        } catch (NoSuchMethodException unused) {
            w1Var = new w1(obj, obj, obj, obj, 5);
        }
        f434b = w1Var;
        return w1Var;
    }

    public static final float L(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int M(float f10, int i10, int i11) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }

    public static final q P(q qVar, String str, boolean z10, n nVar) {
        l.e(qVar, "<this>");
        return j1.a.a(qVar, new eg.f(nVar, str, z10));
    }

    public static e Q(e eVar, String str, String str2, int i10) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z10 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!eVar.f2752b) {
            String strC = eVar.c();
            if (u.k0(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return e.e(str2.concat(ef.n.F0(strC, str)));
                }
                if (!z10) {
                    return eVar;
                }
                String strF0 = ef.n.F0(strC, str);
                if (strF0.length() != 0 && ud.b.v(0, strF0)) {
                    if (strF0.length() != 1 && ud.b.v(1, strF0)) {
                        oc.c it = new d(0, strF0.length() - 1, 1).iterator();
                        while (true) {
                            if (!it.f16312c) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!ud.b.v(((Number) next).intValue(), strF0)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strF0.substring(0, iIntValue);
                            l.d(strSubstring, "substring(...)");
                            String strJ = ud.b.J(strSubstring);
                            String strSubstring2 = strF0.substring(iIntValue);
                            l.d(strSubstring2, "substring(...)");
                            strF0 = strJ.concat(strSubstring2);
                        } else {
                            strF0 = ud.b.J(strF0);
                        }
                    } else if (strF0.length() != 0 && 'A' <= (cCharAt2 = strF0.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strF0.substring(1);
                        l.d(strSubstring3, "substring(...)");
                        strF0 = lowerCase + strSubstring3;
                    }
                }
                if (e.f(strF0)) {
                    return e.e(strF0);
                }
            }
        }
        return null;
    }

    public static final hd.q T(h hVar, yd.f fVar) {
        l.e(hVar, "<this>");
        l.e(fVar, "strings");
        String strG = G(fVar, hVar.f23708c);
        List<wd.f> list = hVar.f23709d;
        l.d(list, "getArgumentList(...)");
        ArrayList arrayList = new ArrayList();
        for (wd.f fVar2 : list) {
            wd.e eVar = fVar2.f23663d;
            l.d(eVar, "getValue(...)");
            k0 k0VarU = U(eVar, fVar);
            k kVar = k0VarU != null ? new k(fVar.getString(fVar2.f23662c), k0VarU) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return new hd.q(vb.w.A(arrayList), strG);
    }

    public static final k0 U(wd.e eVar, yd.f fVar) {
        l.e(eVar, "<this>");
        l.e(fVar, "strings");
        if (yd.d.P.d(eVar.f23644m).booleanValue()) {
            wd.d dVar = eVar.f23634c;
            int i10 = dVar != null ? id.i.f9512a[dVar.ordinal()] : -1;
            if (i10 == 1) {
                return new g0((byte) eVar.f23635d);
            }
            if (i10 == 2) {
                return new j0((short) eVar.f23635d);
            }
            if (i10 == 3) {
                return new hd.h0((int) eVar.f23635d);
            }
            if (i10 == 4) {
                return new i0(eVar.f23635d);
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + eVar.f23634c).toString());
        }
        wd.d dVar2 = eVar.f23634c;
        switch (dVar2 != null ? id.i.f9512a[dVar2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new ce.j0();
            case 1:
                return new v((byte) eVar.f23635d);
            case 2:
                return new e0((short) eVar.f23635d);
            case 3:
                return new a0((int) eVar.f23635d);
            case 4:
                return new d0(eVar.f23635d);
            case 5:
                return new hd.w((char) eVar.f23635d);
            case 6:
                return new z(eVar.f23636e);
            case 7:
                return new hd.x(eVar.f23637f);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new hd.u(eVar.f23635d != 0);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new f0(fVar.getString(eVar.f23638g));
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                String strG = G(fVar, eVar.f23639h);
                int i11 = eVar.f23643l;
                return i11 == 0 ? new b0(strG) : new s(i11, strG);
            case 11:
                return new y(G(fVar, eVar.f23639h), fVar.getString(eVar.f23640i));
            case 12:
                h hVar = eVar.f23641j;
                l.d(hVar, "getAnnotation(...)");
                return new hd.r(T(hVar, fVar));
            case 13:
                List<wd.e> list = eVar.f23642k;
                l.d(list, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList();
                for (wd.e eVar2 : list) {
                    l.b(eVar2);
                    k0 k0VarU = U(eVar2, fVar);
                    if (k0VarU != null) {
                        arrayList.add(k0VarU);
                    }
                }
                return new t(arrayList);
        }
    }

    public static final String V(InputStreamReader inputStreamReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = inputStreamReader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = inputStreamReader.read(cArr);
        }
        String string = stringWriter.toString();
        l.d(string, "toString(...)");
        return string;
    }

    public static void W(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException(h0.n(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            p0.h(activity, strArr, i10);
        }
    }

    public static final long X(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final String Y(byte b10) {
        char[] cArr = mh.b.f15166a;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }

    public static final String Z(int i10) {
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = mh.b.f15166a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        ua.j.f(i11, 8, 8);
        return new String(cArr2, i11, 8 - i11);
    }

    public static final void a(List list, q qVar, f1.f fVar, o oVar, int i10) {
        int i11;
        oVar.Y(872528548);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (oVar.f(qVar) ? 32 : 16);
        if (oVar.N(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = oVar.h(list);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new x3(0, list);
                oVar.h0(objK);
            }
            v0 v0Var = (v0) objK;
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            q qVarC = j1.a.c(qVar, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0Var, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            fVar.q(oVar, 6);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(list, qVar, fVar, i10, 5);
        }
    }

    public static final Class a0(ClassLoader classLoader, String str) {
        l.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final ic.a r32, final j1.q r33, boolean r34, m0.o1 r35, q1.l0 r36, s.o r37, m0.k1 r38, y.d1 r39, ic.o r40, x0.o r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.b(ic.a, j1.q, boolean, m0.o1, q1.l0, s.o, m0.k1, y.d1, ic.o, x0.o, int, int):void");
    }

    public static Bundle b0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final void c(ic.a aVar, j3.q qVar, f1.f fVar, o oVar, int i10) {
        ic.a aVar2;
        int i11;
        oVar.Y(826668973);
        if ((i10 & 6) == 0) {
            aVar2 = aVar;
            i11 = (oVar.h(aVar2) ? 4 : 2) | i10;
        } else {
            aVar2 = aVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(fVar) ? 256 : 128;
        }
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
            f3.c cVar = (f3.c) oVar.j(l1.f9866h);
            m mVar = (m) oVar.j(l1.f9872n);
            x0.n nVarX = x0.v.x(oVar);
            w0 w0VarY = x0.v.y(fVar, oVar);
            Object[] objArr = new Object[0];
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = j3.d.f10122c;
                oVar.h0(objK);
            }
            UUID uuid = (UUID) g1.l.e(objArr, (ic.a) objK, oVar);
            boolean zF = oVar.f(view) | oVar.f(cVar);
            Object objK2 = oVar.K();
            if (zF || objK2 == obj) {
                j3.s sVar = new j3.s(aVar2, qVar, view, mVar, cVar, uuid);
                f1.f fVar2 = new f1.f(new cg.d(11, w0VarY), 346960332, true);
                p pVar = sVar.f10168g;
                pVar.setParentCompositionContext(nVarX);
                pVar.f10151j.setValue(fVar2);
                pVar.f10155n = true;
                if (pVar.f9710d == null && !pVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                pVar.e();
                oVar.h0(sVar);
                objK2 = sVar;
            }
            j3.s sVar2 = (j3.s) objK2;
            boolean zH = oVar.h(sVar2);
            Object objK3 = oVar.K();
            if (zH || objK3 == obj) {
                objK3 = new a9.k(6, sVar2, null);
                oVar.h0(objK3);
            }
            x0.v.e((n) objK3, ub.a0.f21526a, oVar);
            boolean zH2 = oVar.h(sVar2);
            Object objK4 = oVar.K();
            if (zH2 || objK4 == obj) {
                objK4 = new j3.a(sVar2, 0);
                oVar.h0(objK4);
            }
            x0.v.c(sVar2, (ic.k) objK4, oVar);
            boolean zH3 = oVar.h(sVar2) | ((i11 & 14) == 4) | ((i11 & 112) == 32) | oVar.d(mVar.ordinal());
            Object objK5 = oVar.K();
            if (zH3 || objK5 == obj) {
                Object bVar = new j3.b(sVar2, aVar, qVar, mVar, 0);
                oVar.h0(bVar);
                objK5 = bVar;
            }
            x0.v.h((ic.a) objK5, oVar);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new l0(aVar, qVar, fVar, i10, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public static final int c0(a0.t tVar) {
        ?? r0 = tVar.f124k;
        int size = ((Collection) r0).size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((a0.u) r0.get(i11)).f144n;
        }
        return (i10 / r0.size()) + tVar.f130q;
    }

    public static final void d(cg.v vVar, q qVar, o oVar, int i10) {
        oVar.Y(2138128098);
        q qVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), q1.q.f17569b, q1.h0.f17515a);
        if (!vVar.z()) {
            qVarB = y.d.o(qVarB);
        }
        lc.b.a(qVarB.e(qVar), f1.g.b(oVar, 1795385966, new cg.g0(vVar, 0, (byte) 0)), f1.g.b(oVar, 1964529741, new cg.g0(vVar, 1, (byte) 0)), oVar, 432);
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.i0(vVar, qVar, i10, 4);
        }
    }

    public static final long e(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final void f(c0.b0 b0Var, q qVar, c0.z zVar, y.e1 e1Var, float f10, y.f fVar, u.p0 p0Var, boolean z10, s.f fVar2, ic.k kVar, o oVar, int i10) {
        int i11;
        q qVar2;
        u.p0 p0Var2;
        boolean z11;
        s.f fVar3;
        u.p0 p0Var3;
        s.f fVarA;
        int i12;
        boolean z12;
        oVar.Y(-578931208);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(b0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            qVar2 = qVar;
            i11 |= oVar.f(qVar2) ? 32 : 16;
        } else {
            qVar2 = qVar;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(zVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(e1Var) ? 2048 : 1024;
        }
        int i13 = i11 | 24576;
        if ((196608 & i10) == 0) {
            i13 |= oVar.c(f10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= oVar.f(fVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= 4194304;
        }
        int i14 = 100663296 | i13;
        if ((805306368 & i10) == 0) {
            i14 = 369098752 | i13;
        }
        int i15 = oVar.h(kVar) ? 4 : 2;
        if (oVar.N(i14 & 1, ((306783379 & i14) == 306783378 && (i15 & 3) == 2) ? false : true)) {
            oVar.S();
            int i16 = i10 & 1;
            Object obj = x0.k.f24334a;
            if (i16 == 0 || oVar.x()) {
                r.t tVarA = x1.a(oVar);
                boolean zF = oVar.f(tVarA);
                Object objK = oVar.K();
                if (zF || objK == obj) {
                    objK = new u.i(tVarA);
                    oVar.h0(objK);
                }
                p0Var3 = (u.i) objK;
                fVarA = s.c1.a(oVar);
                i12 = i14 & (-1908408321);
                z12 = true;
            } else {
                oVar.Q();
                int i17 = i14 & (-1908408321);
                z12 = z10;
                fVarA = fVar2;
                i12 = i17;
                p0Var3 = p0Var;
            }
            oVar.q();
            float fA = fVar.a();
            int i18 = i12 >> 3;
            int i19 = (i12 & 14) | ((i12 >> 15) & 112) | (i18 & 896);
            u.p0 p0Var4 = p0Var3;
            boolean z13 = ((((i19 & 14) ^ 6) > 4 && oVar.f(b0Var)) || (i19 & 6) == 4) | ((((i19 & 112) ^ 48) > 32 && oVar.f(fVar)) || (i19 & 48) == 32) | ((((i19 & 896) ^ 384) > 256 && oVar.f(e1Var)) || (i19 & 384) == 256);
            Object objK2 = oVar.K();
            if (z13 || objK2 == obj) {
                objK2 = new c0.u(new c0.c(e1Var, b0Var, fVar, 0));
                oVar.h0(objK2);
            }
            int i20 = i12 << 3;
            boolean z14 = z12;
            g8.a.f(zVar, (c0.u) objK2, qVar2, e1Var, p0Var4, z14, fVarA, f10, fA, kVar, oVar, ((i12 >> 6) & 14) | 48 | ((i12 << 6) & 7168) | (57344 & i20) | (i20 & 458752) | (29360128 & i18) | ((i12 << 12) & 1879048192), (i15 << 3) & 112);
            fVar3 = fVarA;
            z11 = z14;
            p0Var2 = p0Var4;
        } else {
            oVar.Q();
            p0Var2 = p0Var;
            z11 = z10;
            fVar3 = fVar2;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c0.b(b0Var, qVar, zVar, e1Var, f10, fVar, p0Var2, z11, fVar3, kVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(j1.q r16, ic.n r17, ic.n r18, boolean r19, ic.n r20, ic.n r21, f1.f r22, x0.o r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.g(j1.q, ic.n, ic.n, boolean, ic.n, ic.n, f1.f, x0.o, int, int):void");
    }

    public static final void h(final float f10, q qVar, final n nVar, o oVar, final int i10, final int i11) {
        int i12;
        oVar.Y(953221030);
        if ((i10 & 6) == 0) {
            i12 = (oVar.c(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= oVar.h(nVar) ? 256 : 128;
        }
        if (oVar.N(i12 & 1, (i12 & 147) != 146)) {
            if (i13 != 0) {
                qVar = j1.n.f9689a;
            }
            boolean z10 = (i12 & 14) == 4;
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new y3(f10);
                oVar.h0(objK);
            }
            v0 v0Var = (v0) objK;
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            q qVarC = j1.a.c(qVar, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            int i14 = ((((i12 & 112) | ((i12 >> 6) & 14)) << 6) & 896) | 6;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0Var, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            nVar.q(oVar, Integer.valueOf((i14 >> 6) & 14));
            oVar.p(true);
        } else {
            oVar.Q();
        }
        final q qVar2 = qVar;
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new n() { // from class: m0.w3
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    android.support.v4.media.session.b.h(f10, qVar2, nVar, (x0.o) obj, x0.v.D(i10 | 1), i11);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void i(b0.i0 i0Var, o oVar, int i10) {
        oVar.Y(-2073166313);
        if ((((oVar.h(i0Var) ? 4 : 2) | i10) & 11) == 2 && oVar.z()) {
            oVar.Q();
        } else {
            w0 w0VarY = x0.v.y(i0Var, oVar);
            w0 w0VarY2 = x0.v.y(oVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), oVar);
            Object value = w0VarY2.getValue();
            oVar.X(-738839926);
            boolean zF = oVar.f(w0VarY2) | oVar.f(w0VarY);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                objK = new eg.c(w0VarY2, w0VarY, 0);
                oVar.h0(objK);
            }
            oVar.p(false);
            x0.v.c(value, (ic.k) objK, oVar);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.d(i10, 1, i0Var);
        }
    }

    public static final void j(int i10, int i11, b0.i0 i0Var, o oVar, int i12) {
        oVar.Y(-1477045257);
        if (((i12 | 54 | (oVar.h(i0Var) ? 256 : 128)) & 731) == 146 && oVar.z()) {
            oVar.Q();
        } else {
            Context context = (Context) oVar.j(AndroidCompositionLocals_androidKt.f721b);
            oVar.X(-1391265657);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            Object obj2 = objK;
            if (objK == obj) {
                eg.a aVar = new eg.a();
                aVar.f6581a = -1L;
                oVar.h0(aVar);
                obj2 = aVar;
            }
            eg.a aVar2 = (eg.a) obj2;
            oVar.p(false);
            oVar.X(-1391265584);
            boolean zF = oVar.f(context);
            Object objK2 = oVar.K();
            if (zF || objK2 == obj) {
                objK2 = new eg.e(context, aVar2, i0Var);
                oVar.h0(objK2);
            }
            Object obj3 = (eg.e) objK2;
            oVar.p(false);
            oVar.X(-1391265284);
            boolean zF2 = oVar.f(obj3);
            Object objK3 = oVar.K();
            if (zF2 || objK3 == obj) {
                objK3 = new a0.f0(10, obj3);
                oVar.h0(objK3);
            }
            oVar.p(false);
            x0.v.c(ub.a0.f21526a, (ic.k) objK3, oVar);
            i10 = 3;
            i11 = TinkerReport.KEY_LOADED_MISMATCH_DEX;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new eg.d(i10, i11, i0Var, i12);
        }
    }

    public static final void k(final boolean z10, final n nVar, o oVar, final int i10) {
        int i11;
        oVar.Y(-642000585);
        if ((i10 & 6) == 0) {
            i11 = (oVar.g(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(nVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            w0 w0VarY = x0.v.y(nVar, oVar);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                Object yVar = new x0.y(x0.v.m(oVar));
                oVar.h0(yVar);
                objK = yVar;
            }
            hf.y yVar2 = ((x0.y) objK).f24523a;
            Object objK2 = oVar.K();
            Object obj2 = objK2;
            if (objK2 == obj) {
                n nVar2 = (n) w0VarY.getValue();
                e.k kVar = new e.k(z10);
                kVar.f6034d = yVar2;
                kVar.f6035e = nVar2;
                oVar.h0(kVar);
                obj2 = kVar;
            }
            e.k kVar2 = (e.k) obj2;
            boolean zF = oVar.f((n) w0VarY.getValue()) | oVar.f(yVar2);
            Object objK3 = oVar.K();
            if (zF || objK3 == obj) {
                kVar2.f6035e = (n) w0VarY.getValue();
                kVar2.f6034d = yVar2;
                oVar.h0(ub.a0.f21526a);
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            boolean zH = ((i11 & 14) == 4) | oVar.h(kVar2);
            Object objK4 = oVar.K();
            if (zH || objK4 == obj) {
                objK4 = new cg.t(kVar2, z10, null, 1);
                oVar.h0(objK4);
            }
            x0.v.e((n) objK4, boolValueOf, oVar);
            d.l0 l0VarA = e.g.a(oVar);
            if (l0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object objA = l0VarA.a();
            Object obj3 = (androidx.lifecycle.x) oVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH2 = oVar.h(objA) | oVar.h(obj3) | oVar.h(kVar2);
            Object objK5 = oVar.K();
            if (zH2 || objK5 == obj) {
                objK5 = new ba.i(objA, obj3, kVar2, 2);
                oVar.h0(objK5);
            }
            x0.v.d(obj3, objA, (ic.k) objK5, oVar);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new n() { // from class: e.l
                @Override // ic.n
                public final Object q(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iD = x0.v.D(i10 | 1);
                    android.support.v4.media.session.b.k(z10, nVar, (o) obj4, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void l(boolean z10, n nVar, o oVar, int i10) {
        oVar.Y(1818896922);
        int i11 = (oVar.g(z10) ? 4 : 2) | i10 | (oVar.h(nVar) ? 32 : 16);
        if ((i11 & 19) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            k(z10, nVar, oVar, i11 & 126);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new da.s0(z10, nVar, i10, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(j1.q r26, q1.l0 r27, long r28, long r30, s.o r32, float r33, f1.f r34, x0.o r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.m(j1.q, q1.l0, long, long, s.o, float, f1.f, x0.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final ic.a r21, final j1.q r22, boolean r23, final q1.l0 r24, final long r25, final long r27, s.o r29, final float r30, final w.k r31, final f1.f r32, x0.o r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.n(ic.a, j1.q, boolean, q1.l0, long, long, s.o, float, w.k, f1.f, x0.o, int, int):void");
    }

    public static final void o(ic.a aVar, q qVar, boolean z10, k1 k1Var, ic.o oVar, o oVar2, int i10, int i11) {
        if ((i11 & 2) != 0) {
            qVar = j1.n.f9689a;
        }
        q qVar2 = qVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        g0.f fVar = ((y5) oVar2.j(z5.f13997a)).f13961a;
        if ((i11 & 128) != 0) {
            k1Var = m0.s0.b(0L, oVar2, 7);
        }
        b(aVar, qVar2, z11, null, fVar, null, k1Var, m0.s0.f13586e, oVar, oVar2, i10 & 2147483646, 0);
    }

    public static final void p(q qVar, n nVar, o oVar, int i10) {
        int i11;
        oVar.Y(1090521195);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(nVar) ? 32 : 16;
        }
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = j3.e.f10126b;
                oVar.h0(objK);
            }
            v0 v0Var = (v0) objK;
            long j10 = oVar.T;
            int i12 = (int) ((j10 >>> 32) ^ j10);
            j1 j1VarL = oVar.l();
            q qVarC = j1.a.c(qVar, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            int i13 = (((((i11 << 3) & 112) | (((i11 >> 3) & 14) | 384)) << 6) & 896) | 6;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0Var, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(i12))) {
                h0.s(i12, oVar, i12, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            nVar.q(oVar, Integer.valueOf((i13 >> 6) & 14));
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.l0(qVar, nVar, i10, 5);
        }
    }

    public static final q q(q qVar, q1.l0 l0Var, long j10, s.o oVar, float f10) {
        return gh.g.k(androidx.compose.foundation.a.b(lc.b.U(qVar, f10, l0Var, false, 24).e(oVar != null ? new BorderModifierNodeElement(oVar.f19235a, oVar.f19236b, l0Var) : j1.n.f9689a), j10, l0Var), l0Var);
    }

    public static final long r(long j10, r1 r1Var, float f10, o oVar) {
        if (!q1.q.c(j10, ((b1) oVar.j(m0.c1.f12773a)).i()) || r1Var == null) {
            oVar.W(-1124526507);
            oVar.p(false);
            return j10;
        }
        oVar.W(-1124594614);
        long jA = r1Var.a(j10, f10, oVar, 0);
        oVar.p(false);
        return jA;
    }

    public static final f1.f s(t2.l0 l0Var, float f10, n nVar) {
        if (nVar == null) {
            return null;
        }
        return new f1.f(new z3(f10, l0Var, new e3.i(e3.f.f6071c, 17), nVar), -1000595778, true);
    }

    public static final boolean t(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        l.e(bArr, "a");
        l.e(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void y(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static int z(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new m3.k(context).a() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public abstract List A(String str, List list);

    public abstract cb.d E(cb.p pVar);

    public abstract cb.o F(cb.p pVar);

    public abstract void N(Throwable th2);

    public abstract void O(w1 w1Var);

    public abstract void R(cb.o oVar, cb.o oVar2);

    public abstract void S(cb.o oVar, Thread thread);

    public String toString() {
        switch (this.f437a) {
            case 2:
                return u();
            default:
                return super.toString();
        }
    }

    public abstract String u();

    public abstract boolean v(cb.p pVar, cb.d dVar, cb.d dVar2);

    public abstract boolean w(cb.p pVar, Object obj, Object obj2);

    public abstract boolean x(cb.p pVar, cb.o oVar, cb.o oVar2);
}
