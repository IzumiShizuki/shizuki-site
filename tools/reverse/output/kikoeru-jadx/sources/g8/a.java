package g8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u0;
import androidx.media3.exoplayer.offline.u;
import androidx.versionedparcelable.ParcelImpl;
import b0.i0;
import bd.s0;
import bf.g;
import cb.v;
import cg.c0;
import cg.g0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.a0;
import e7.m0;
import e7.y;
import f7.r;
import hd.a1;
import hd.c1;
import hd.d1;
import hd.e1;
import hd.n0;
import hd.o0;
import hd.r0;
import hd.v0;
import hd.w0;
import hd.x0;
import hd.z0;
import id.h;
import j1.q;
import j2.h0;
import j3.p;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import jc.e;
import jc.l;
import jc.z;
import ld.f0;
import le.n;
import le.o;
import lh.b0;
import lh.s;
import m0.b1;
import m0.y5;
import m0.z5;
import ua.j;
import vb.m;
import vb.w;
import vc.i;
import w1.f;
import wd.d0;
import wd.f1;
import wd.h1;
import wd.q0;
import wd.t0;
import wd.y0;
import x0.j1;
import x0.k;
import x0.m1;
import x0.p1;
import yc.j0;
import yc.k0;
import yc.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f7442a;

    public static final int A(int i10) {
        return yd.d.b(yd.d.f26173c.d(i10).booleanValue(), (h1) yd.d.f26174d.d(i10), (d0) yd.d.f26175e.d(i10));
    }

    public static Object B(Future future) {
        Object obj;
        boolean z10 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(j.q("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Set C() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final Class D(pc.c cVar) {
        l.e(cVar, "<this>");
        Class clsB = ((e) cVar).b();
        l.c(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class E(pc.c cVar) {
        l.e(cVar, "<this>");
        Class clsB = ((e) cVar).b();
        if (!clsB.isPrimitive()) {
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class F(pc.c cVar) {
        l.e(cVar, "<this>");
        Class clsB = ((e) cVar).b();
        if (clsB.isPrimitive()) {
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String G(t tVar) {
        be.e eVar;
        yc.c cVarI = i.z(tVar) ? I(tVar) : null;
        if (cVarI != null) {
            yc.c cVarK = ie.d.k(cVarI);
            if (cVarK instanceof k0) {
                i.z(cVarK);
                yc.c cVarB = ie.d.b(ie.d.k(cVarK), ld.d.f12197d);
                if (cVarB != null && (eVar = (be.e) ld.f.f12210a.get(ie.d.g(cVarB))) != null) {
                    return eVar.b();
                }
            } else if (cVarK instanceof s0) {
                int i10 = ld.c.f12190l;
                LinkedHashMap linkedHashMap = f0.f12222i;
                String strK = ua.l.K((s0) cVarK);
                be.e eVar2 = strK == null ? null : (be.e) linkedHashMap.get(strK);
                if (eVar2 != null) {
                    return eVar2.b();
                }
            }
        }
        return null;
    }

    public static final pc.c H(Class cls) {
        l.e(cls, "<this>");
        return z.f10839a.b(cls);
    }

    public static final yc.c I(yc.c cVar) {
        l.e(cVar, "<this>");
        if (!f0.f12223j.contains(cVar.getName()) && !ld.f.f12213d.contains(ie.d.k(cVar).getName())) {
            return null;
        }
        if ((cVar instanceof k0) || (cVar instanceof j0)) {
            return ie.d.b(cVar, ld.d.f12199f);
        }
        if (cVar instanceof s0) {
            return ie.d.b(cVar, ld.d.f12200g);
        }
        return null;
    }

    public static final yc.c J(yc.c cVar) {
        l.e(cVar, "<this>");
        yc.c cVarI = I(cVar);
        if (cVarI != null) {
            return cVarI;
        }
        int i10 = ld.e.f12203l;
        be.e name = cVar.getName();
        l.d(name, "getName(...)");
        if (ld.e.b(name)) {
            return ie.d.b(cVar, ld.d.f12201h);
        }
        return null;
    }

    public static Intent K(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strL = L(context, componentName);
        if (strL == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strL);
        return L(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String L(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10 >= 29 ? 269222528 : i10 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final float M(Context context) {
        Object systemService = context.getSystemService("audio");
        l.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
    }

    public static d N(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).f1071a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final float O(Activity activity) {
        Window window = activity.getWindow();
        l.d(window, "getWindow(...)");
        float f10 = window.getAttributes().screenBrightness;
        if (f10 != -1.0f) {
            return f10;
        }
        l.e(window.getContext(), "$context_receiver_0");
        return Settings.System.getInt(r2.getContentResolver(), "screen_brightness", 125) / 255.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        return !vc.i.z(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean P(yc.e r13, yc.c r14) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.a.P(yc.e, yc.c):boolean");
    }

    public static v Q(Object obj) {
        return obj == null ? v.f3880b : new v(obj);
    }

    public static int R(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final g S(ArrayList arrayList) {
        g gVar = new g();
        for (Object obj : arrayList) {
            o oVar = (o) obj;
            if (oVar != null && oVar != n.f12335b) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    public static final void T(Object obj, String str) {
        if (String.valueOf(obj).length() <= 4000) {
            Log.e(str, String.valueOf(obj));
            return;
        }
        int i10 = 0;
        int iX = gh.g.x(0, String.valueOf(obj).length() - 1, 4000);
        if (iX < 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 4000;
            if (i11 < String.valueOf(obj).length()) {
                String strSubstring = String.valueOf(obj).substring(i10, i11);
                l.d(strSubstring, "substring(...)");
                Log.e(str, strSubstring);
            } else {
                String strSubstring2 = String.valueOf(obj).substring(i10, String.valueOf(obj).length());
                l.d(strSubstring2, "substring(...)");
                Log.e(str, strSubstring2);
            }
            if (i10 == iX) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final ch.l U(int i10, h hVar) {
        ub.d dVar;
        ch.l lVar;
        e1 e1Var;
        d1 d1Var;
        ch.l lVar2 = new ch.l(4);
        yd.f fVar = (yd.f) hVar.f9505b;
        yd.i iVar = (yd.i) hVar.f9507d;
        l.e(fVar, "nameResolver");
        f1 f1Var = (f1) m.b0(i10, iVar.f26207a);
        yd.h hVar2 = yd.h.f26202d;
        if (f1Var == null) {
            lVar = null;
        } else {
            Integer numValueOf = (f1Var.f23680b & 1) == 1 ? Integer.valueOf(f1Var.f23681c) : null;
            Integer numValueOf2 = (f1Var.f23680b & 2) == 2 ? Integer.valueOf(f1Var.f23682d) : null;
            yd.h hVar3 = numValueOf2 != null ? new yd.h(numValueOf2.intValue() & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, (numValueOf2.intValue() >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, (numValueOf2.intValue() >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) : numValueOf != null ? new yd.h(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : hVar2;
            wd.d1 d1Var2 = f1Var.f23683e;
            l.b(d1Var2);
            int iOrdinal = d1Var2.ordinal();
            if (iOrdinal == 0) {
                dVar = ub.d.f21532a;
            } else if (iOrdinal == 1) {
                dVar = ub.d.f21533b;
            } else {
                if (iOrdinal != 2) {
                    throw new ce.j0();
                }
                dVar = ub.d.f21534c;
            }
            ub.d dVar2 = dVar;
            Integer numValueOf3 = (f1Var.f23680b & 8) == 8 ? Integer.valueOf(f1Var.f23684f) : null;
            String string = (f1Var.f23680b & 16) == 16 ? fVar.getString(f1Var.f23685g) : null;
            wd.e1 e1Var2 = f1Var.f23686h;
            l.d(e1Var2, "getVersionKind(...)");
            lVar = new ch.l(hVar3, e1Var2, dVar2, numValueOf3, string);
        }
        if (lVar == null) {
            throw new ff.e(1, "No VersionRequirement with the given id in the table");
        }
        wd.e1 e1Var3 = lVar != null ? (wd.e1) lVar.f4202c : null;
        int i11 = e1Var3 == null ? -1 : id.j.f9513a[e1Var3.ordinal()];
        if (i11 == -1) {
            e1Var = e1.f8381d;
        } else if (i11 == 1) {
            e1Var = e1.f8378a;
        } else if (i11 == 2) {
            e1Var = e1.f8379b;
        } else {
            if (i11 != 3) {
                throw new ce.j0();
            }
            e1Var = e1.f8380c;
        }
        ub.d dVar3 = lVar != null ? (ub.d) lVar.f4204e : null;
        int i12 = dVar3 == null ? -1 : id.j.f9514b[dVar3.ordinal()];
        if (i12 == -1) {
            d1Var = d1.f8374c;
        } else if (i12 == 1) {
            d1Var = d1.f8372a;
        } else if (i12 != 2) {
            if (i12 != 3) {
                throw new ce.j0();
            }
            d1Var = d1.f8374c;
        } else {
            d1Var = d1.f8373b;
        }
        lVar2.f4201b = e1Var;
        lVar2.f4202c = d1Var;
        lVar2.f4204e = lVar != null ? (Integer) lVar.f4205f : null;
        lVar2.f4203d = lVar != null ? (String) lVar.f4203d : null;
        if (lVar != null) {
            hVar2 = (yd.h) lVar.f4201b;
        }
        lVar2.f4205f = new c1(hVar2.f26203a, hVar2.f26204b, hVar2.f26205c);
        return lVar2;
    }

    public static final void V(gd.a aVar, gd.b bVar, yc.d0 d0Var, be.e eVar) {
        l.e(aVar, "<this>");
        l.e(bVar, "from");
        l.e(d0Var, "scopeOwner");
        l.e(eVar, "name");
        String str = ((bd.j0) d0Var).f2596e.f2744a.f2747a;
        l.d(eVar.b(), "asString(...)");
        l.e(str, "packageFqName");
    }

    public static final a0 W(m0[] m0VarArr, x0.o oVar) {
        Context context = (Context) oVar.j(AndroidCompositionLocals_androidKt.f721b);
        Object[] objArrCopyOf = Arrays.copyOf(m0VarArr, m0VarArr.length);
        u uVar = new u(16, new a9.a(21), new y(3, context));
        boolean zH = oVar.h(context);
        Object objK = oVar.K();
        if (zH || objK == k.f24334a) {
            objK = new r(context, 0);
            oVar.h0(objK);
        }
        a0 a0Var = (a0) g1.l.d(objArrCopyOf, uVar, (ic.a) objK, oVar, 0, 4);
        for (m0 m0Var : m0VarArr) {
            a0Var.f6299b.f8177s.a(m0Var);
        }
        return a0Var;
    }

    public static final f3.k X(p1.c cVar) {
        return new f3.k(Math.round(cVar.f16483a), Math.round(cVar.f16484b), Math.round(cVar.f16485c), Math.round(cVar.f16486d));
    }

    public static int Y(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static final s Z(InputStream inputStream) {
        l.e(inputStream, "<this>");
        return new s(inputStream, new lh.j0());
    }

    public static final void a(q qVar, g0.f fVar, long j10, float f10, f1.f fVar2, x0.o oVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            qVar = j1.n.f9689a;
        }
        q qVar2 = qVar;
        if ((i11 & 2) != 0) {
            fVar = ((y5) oVar.j(z5.f13997a)).f13962b;
        }
        g0.f fVar3 = fVar;
        if ((i11 & 4) != 0) {
            j10 = ((b1) oVar.j(m0.c1.f12773a)).i();
        }
        long j11 = j10;
        android.support.v4.media.session.b.m(qVar2, fVar3, j11, m0.c1.b(j11, oVar), null, (i11 & 32) != 0 ? 1 : f10, fVar2, oVar, i10 & 4194302, 0);
    }

    public static int[] a0(Collection collection) {
        if (collection instanceof bb.b) {
            bb.b bVar = (bb.b) collection;
            return Arrays.copyOfRange(bVar.f2535a, bVar.f2536b, bVar.f2537c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void b(ic.a aVar, q qVar, long j10, long j11, float f10, f1.f fVar, x0.o oVar) {
        android.support.v4.media.session.b.n(aVar, qVar, true, ((y5) oVar.j(z5.f13997a)).f13962b, j10, j11, null, f10, null, fVar, oVar, 817913856, 0);
    }

    public static final r0 b0(wd.z zVar, h hVar) {
        r0 r0Var = new r0();
        int i10 = zVar.f24058c;
        if ((zVar.f24057b & 4) == 4) {
            wd.y yVar = zVar.f24060e;
            if (yVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iOrdinal = yVar.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                throw new ce.j0();
            }
        }
        bd.f0 f0Var = (bd.f0) hVar.f9506c;
        int i11 = zVar.f24057b;
        t0 t0VarB = (i11 & 8) == 8 ? zVar.f24061f : (i11 & 16) == 16 ? f0Var.b(zVar.f24062g) : null;
        if (t0VarB != null) {
            d0(t0VarB, hVar);
        }
        List<wd.z> list = zVar.f24063h;
        l.d(list, "getAndArgumentList(...)");
        for (wd.z zVar2 : list) {
            l.b(zVar2);
            r0Var.f8449a.add(b0(zVar2, hVar));
        }
        List<wd.z> list2 = zVar.f24064i;
        l.d(list2, "getOrArgumentList(...)");
        for (wd.z zVar3 : list2) {
            l.b(zVar3);
            r0Var.f8450b.add(b0(zVar3, hVar));
        }
        return r0Var;
    }

    public static kf.f c(int i10, int i11, kf.a aVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        int i12 = i11 & 2;
        kf.a aVar2 = kf.a.f11336a;
        if (i12 != 0) {
            aVar = aVar2;
        }
        if (i10 == -2) {
            if (aVar != aVar2) {
                return new kf.q(1, aVar);
            }
            kf.j.f11377i0.getClass();
            return new kf.f(kf.i.f11376b);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == aVar2 ? new kf.f(i10) : new kf.q(i10, aVar) : new kf.f(Integer.MAX_VALUE) : aVar == aVar2 ? new kf.f(0) : new kf.q(1, aVar);
        }
        if (aVar == aVar2) {
            return new kf.q(1, kf.a.f11337b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final v0 c0(wd.j0 j0Var, h hVar) {
        ArrayList arrayList;
        l.e(j0Var, "<this>");
        v0 v0Var = new v0(j0Var.f23779d, (j0Var.f23778c & 256) == 256 ? j0Var.f23792q : A(j0Var.f23779d), (j0Var.f23778c & 512) == 512 ? j0Var.f23793r : A(j0Var.f23779d), ((yd.f) hVar.f9505b).getString(j0Var.f23781f));
        List list = j0Var.f23784i;
        l.d(list, "getTypeParameterList(...)");
        h hVarU = hVar.u(list);
        bd.f0 f0Var = (bd.f0) hVarU.f9506c;
        List<y0> list2 = j0Var.f23784i;
        l.d(list2, "getTypeParameterList(...)");
        for (y0 y0Var : list2) {
            l.b(y0Var);
            v0Var.f8475d.add(e0(y0Var, hVarU));
        }
        t0 t0VarR = ud.e.R(j0Var, f0Var);
        if (t0VarR != null) {
            d0(t0VarR, hVarU);
        }
        List list3 = j0Var.f23790o;
        l.d(list3, "getContextParameterList(...)");
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = v0Var.f8477f;
            if (!zHasNext) {
                break;
            }
            wd.b1 b1Var = (wd.b1) it.next();
            l.b(b1Var);
            arrayList.add(f0(b1Var, hVarU));
        }
        if (j0Var.f23790o.isEmpty()) {
            List list4 = j0Var.f23787l;
            l.d(list4, "getContextReceiverTypeList(...)");
            if (!list4.isEmpty()) {
                Iterator it2 = ud.e.p(j0Var, f0Var).iterator();
                while (it2.hasNext()) {
                    d0((t0) it2.next(), hVarU);
                    arrayList.add(new a1(0, "_"));
                }
            }
        }
        if ((j0Var.f23778c & 128) == 128) {
            wd.b1 b1Var2 = j0Var.f23791p;
            l.d(b1Var2, "getSetterValueParameter(...)");
            f0(b1Var2, hVarU);
        }
        d0(ud.e.V(j0Var, f0Var), hVarU);
        List<Integer> list5 = j0Var.f23794s;
        l.d(list5, "getVersionRequirementList(...)");
        for (Integer num : list5) {
            l.b(num);
            v0Var.f8478g.add(U(num.intValue(), hVarU));
        }
        Iterator it3 = ((List) hVarU.f9510g).iterator();
        while (it3.hasNext()) {
            ((kd.d) ((jd.k) it3.next())).getClass();
            yd.f fVar = (yd.f) hVarU.f9505b;
            jd.d dVar = kd.e.f11330a;
            l.e(dVar, "type");
            List<wd.h> list6 = j0Var.f23796u;
            l.d(list6, "getAnnotationList(...)");
            for (wd.h hVar2 : list6) {
                l.b(hVar2);
                v0Var.f8479h.add(android.support.v4.media.session.b.T(hVar2, fVar));
            }
            List<wd.h> list7 = j0Var.f23797v;
            l.d(list7, "getGetterAnnotationList(...)");
            ArrayList arrayList2 = v0Var.f8473b.f8485b;
            for (wd.h hVar3 : list7) {
                l.b(hVar3);
                arrayList2.add(android.support.v4.media.session.b.T(hVar3, fVar));
            }
            w0 w0Var = v0Var.f8474c;
            if (w0Var != null) {
                List<wd.h> list8 = j0Var.f23798w;
                l.d(list8, "getSetterAnnotationList(...)");
                ArrayList arrayList3 = w0Var.f8485b;
                for (wd.h hVar4 : list8) {
                    l.b(hVar4);
                    arrayList3.add(android.support.v4.media.session.b.T(hVar4, fVar));
                }
            }
            List<wd.h> list9 = j0Var.f23799x;
            l.d(list9, "getExtensionReceiverAnnotationList(...)");
            for (wd.h hVar5 : list9) {
                l.b(hVar5);
                v0Var.f8476e.add(android.support.v4.media.session.b.T(hVar5, fVar));
            }
            List<wd.h> list10 = j0Var.f23800y;
            l.d(list10, "getBackingFieldAnnotationList(...)");
            for (wd.h hVar6 : list10) {
                l.b(hVar6);
                v0Var.f8480i.add(android.support.v4.media.session.b.T(hVar6, fVar));
            }
            List<wd.h> list11 = j0Var.f23801z;
            l.d(list11, "getDelegateFieldAnnotationList(...)");
            for (wd.h hVar7 : list11) {
                l.b(hVar7);
                v0Var.f8481j.add(android.support.v4.media.session.b.T(hVar7, fVar));
            }
            ce.i iVar = ae.g.f324a;
            ae.d dVarB = ae.g.b(j0Var, fVar, f0Var, true);
            ce.o oVar = zd.j.f26806d;
            l.d(oVar, "propertySignature");
            zd.d dVar2 = (zd.d) w.m(j0Var, oVar);
            zd.c cVar = null;
            zd.c cVar2 = (dVar2 == null || !dVar2.i()) ? null : dVar2.f26761e;
            zd.c cVar3 = (dVar2 == null || (dVar2.f26758b & 8) != 8) ? null : dVar2.f26762f;
            Object objK = j0Var.k(zd.j.f26807e);
            l.d(objK, "getExtension(...)");
            ((Number) objK).intValue();
            if (dVarB != null) {
                String str = dVarB.f316e;
                String str2 = dVarB.f317f;
                l.e(str, "name");
                l.e(str2, "descriptor");
            }
            if (cVar2 != null) {
                fVar.getString(cVar2.f26751c);
                fVar.getString(cVar2.f26752d);
            }
            if (cVar3 != null) {
                fVar.getString(cVar3.f26751c);
                fVar.getString(cVar3.f26752d);
            }
            zd.c cVar4 = (dVar2 == null || (dVar2.f26758b & 2) != 2) ? null : dVar2.f26760d;
            if (cVar4 != null) {
                fVar.getString(cVar4.f26751c);
                fVar.getString(cVar4.f26752d);
            }
            if (dVar2 != null && (dVar2.f26758b & 16) == 16) {
                cVar = dVar2.f26763g;
            }
            if (cVar != null) {
                fVar.getString(cVar.f26751c);
                fVar.getString(cVar.f26752d);
            }
        }
        return v0Var;
    }

    public static final void d(cg.v vVar, x0.o oVar, int i10) {
        l.e(vVar, "vm");
        oVar.Y(-712480343);
        Object objJ = oVar.j(AndroidCompositionLocals_androidKt.f721b);
        l.c(objJ, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) objJ;
        int i11 = wa.b.f23459a;
        oVar.X(-715745933);
        oVar.X(1009281237);
        m1 m1Var = AndroidCompositionLocals_androidKt.f725f;
        ViewParent parent = ((View) oVar.j(m1Var)).getParent();
        yb.c cVar = null;
        j3.r rVar = parent instanceof j3.r ? (j3.r) parent : null;
        Window window = rVar != null ? ((p) rVar).f10150i : null;
        if (window == null) {
            Context context = ((View) oVar.j(m1Var)).getContext();
            l.d(context, "LocalView.current.context");
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        window = null;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        l.d(context, "baseContext");
                    }
                } else {
                    window = ((Activity) context).getWindow();
                    break;
                }
            }
        }
        oVar.p(false);
        View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
        oVar.X(511388516);
        boolean zF = oVar.f(view) | oVar.f(window);
        Object objK = oVar.K();
        if (zF || objK == k.f24334a) {
            objK = new wa.a(view, window);
            oVar.h0(objK);
        }
        oVar.p(false);
        wa.a aVar = (wa.a) objK;
        oVar.p(false);
        int i12 = 1;
        x0.v.c(ub.a0.f21526a, new c0(vVar, activity, i12), oVar);
        x0.v.e(new androidx.lifecycle.r(vVar, aVar, cVar, 3), (ub.k) vVar.f4118g.getValue(), oVar);
        android.support.v4.media.session.b.j(0, 0, new i0(5, vVar, activity), oVar, 0);
        android.support.v4.media.session.b.i(new i0(6, aVar, vVar), oVar, 0);
        a2.c.d(vVar.z(), new cg.f0(vVar, activity, i12), oVar, 0);
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new g0(vVar, i10);
        }
    }

    public static final x0 d0(t0 t0Var, h hVar) {
        gh.g o0Var;
        bd.f0 f0Var = (bd.f0) hVar.f9506c;
        yd.f fVar = (yd.f) hVar.f9505b;
        x0 x0Var = new x0((t0Var.f23952e ? 1 : 0) + (t0Var.f23964q << 1));
        if (t0Var.p()) {
            o0Var = new hd.m0(android.support.v4.media.session.b.G(fVar, t0Var.f23956i));
        } else {
            int i10 = t0Var.f23950c;
            if ((i10 & 128) == 128) {
                o0Var = new n0(android.support.v4.media.session.b.G(fVar, t0Var.f23959l));
            } else if ((i10 & 32) == 32) {
                o0Var = new o0(t0Var.f23957j);
            } else {
                if ((i10 & 64) != 64) {
                    throw new ff.e(1, "No classifier (class, type alias or type parameter) recorded for Type");
                }
                Integer numG = hVar.g(t0Var.f23958k);
                if (numG == null) {
                    throw new ff.e(1, "No type parameter id for ".concat(fVar.getString(t0Var.f23958k)));
                }
                o0Var = new o0(numG.intValue());
            }
        }
        x0Var.f8488b = o0Var;
        Iterator it = t0Var.f23951d.iterator();
        while (true) {
            hd.t0 t0Var2 = null;
            hd.b1 b1Var = null;
            if (!it.hasNext()) {
                t0 t0VarA = ud.e.a(t0Var, f0Var);
                x0Var.f8490d = t0VarA != null ? d0(t0VarA, hVar) : null;
                t0 t0VarI = ud.e.I(t0Var, f0Var);
                x0Var.f8491e = t0VarI != null ? d0(t0VarI, hVar) : null;
                t0 t0VarV = ud.e.v(t0Var, f0Var);
                if (t0VarV != null) {
                    x0 x0VarD0 = d0(t0VarV, hVar);
                    String string = (t0Var.f23950c & 2) == 2 ? fVar.getString(t0Var.f23953f) : null;
                    hd.t0 t0Var3 = new hd.t0();
                    t0Var3.f8459a = x0VarD0;
                    t0Var3.f8460b = string;
                    t0Var2 = t0Var3;
                }
                x0Var.f8492f = t0Var2;
                Iterator it2 = ((List) hVar.f9510g).iterator();
                while (it2.hasNext()) {
                    ((kd.d) ((jd.k) it2.next())).getClass();
                    jd.d dVar = kd.f.f11331c;
                    l.e(dVar, "type");
                    kd.f fVar2 = (kd.f) ((jd.g) a.a.V(x0Var.f8493g, dVar));
                    Object objK = t0Var.k(zd.j.f26809g);
                    l.d(objK, "getExtension(...)");
                    fVar2.f11332a = ((Boolean) objK).booleanValue();
                    for (wd.h hVar2 : (List) t0Var.k(zd.j.f26808f)) {
                        ArrayList arrayList = fVar2.f11333b;
                        l.b(hVar2);
                        arrayList.add(android.support.v4.media.session.b.T(hVar2, fVar));
                    }
                }
                return x0Var;
            }
            wd.r0 r0Var = (wd.r0) it.next();
            q0 q0Var = r0Var.f23917c;
            if (q0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iOrdinal = q0Var.ordinal();
            if (iOrdinal == 0) {
                b1Var = hd.b1.f8363b;
            } else if (iOrdinal == 1) {
                b1Var = hd.b1.f8364c;
            } else if (iOrdinal == 2) {
                b1Var = hd.b1.f8362a;
            } else if (iOrdinal != 3) {
                throw new ce.j0();
            }
            ArrayList arrayList2 = x0Var.f8489c;
            if (b1Var != null) {
                t0 t0VarE0 = ud.e.e0(r0Var, f0Var);
                if (t0VarE0 == null) {
                    throw new ff.e(1, "No type argument for non-STAR projection in Type");
                }
                arrayList2.add(new z0(b1Var, d0(t0VarE0, hVar)));
            } else {
                arrayList2.add(z0.f8501c);
            }
        }
    }

    public static final long e(int i10) {
        long j10 = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        int i11 = a2.a.f187r;
        return j10;
    }

    public static final r0 e0(y0 y0Var, h hVar) {
        hd.b1 b1Var;
        yd.f fVar = (yd.f) hVar.f9505b;
        wd.x0 x0Var = y0Var.f24048g;
        if (x0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iOrdinal = x0Var.ordinal();
        if (iOrdinal == 0) {
            b1Var = hd.b1.f8363b;
        } else if (iOrdinal == 1) {
            b1Var = hd.b1.f8364c;
        } else {
            if (iOrdinal != 2) {
                throw new ce.j0();
            }
            b1Var = hd.b1.f8362a;
        }
        boolean z10 = y0Var.f24047f;
        r0 r0Var = new r0(z10 ? 1 : 0, fVar.getString(y0Var.f24046e), b1Var);
        Iterator it = ud.e.h0(y0Var, (bd.f0) hVar.f9506c).iterator();
        while (it.hasNext()) {
            r0Var.f8449a.add(d0((t0) it.next(), hVar));
        }
        Iterator it2 = ((List) hVar.f9510g).iterator();
        while (it2.hasNext()) {
            ((kd.d) ((jd.k) it2.next())).getClass();
            jd.d dVar = kd.g.f11334b;
            l.e(dVar, "type");
            kd.g gVar = (kd.g) ((jd.h) a.a.V(r0Var.f8450b, dVar));
            for (wd.h hVar2 : (List) y0Var.k(zd.j.f26810h)) {
                ArrayList arrayList = gVar.f11335a;
                l.b(hVar2);
                arrayList.add(android.support.v4.media.session.b.T(hVar2, fVar));
            }
        }
        return r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(c0.z r35, c0.u r36, j1.q r37, y.e1 r38, u.p0 r39, boolean r40, s.f r41, float r42, float r43, ic.k r44, x0.o r45, int r46, int r47) {
        /*
            Method dump skipped, instruction units count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.a.f(c0.z, c0.u, j1.q, y.e1, u.p0, boolean, s.f, float, float, ic.k, x0.o, int, int):void");
    }

    public static final a1 f0(wd.b1 b1Var, h hVar) {
        int i10 = b1Var.f23577d;
        int i11 = b1Var.f23578e;
        yd.f fVar = (yd.f) hVar.f9505b;
        a1 a1Var = new a1(i10, fVar.getString(i11));
        bd.f0 f0Var = (bd.f0) hVar.f9506c;
        d0(ud.e.f0(b1Var, f0Var), hVar);
        t0 t0VarI0 = ud.e.i0(b1Var, f0Var);
        if (t0VarI0 != null) {
            d0(t0VarI0, hVar);
        }
        if ((b1Var.f23576c & 64) == 64) {
            wd.e eVar = b1Var.f23584k;
            l.d(eVar, "getAnnotationParameterDefaultValue(...)");
            android.support.v4.media.session.b.U(eVar, fVar);
        }
        Iterator it = ((List) hVar.f9510g).iterator();
        while (it.hasNext()) {
            ((kd.d) ((jd.k) it.next())).getClass();
            List<wd.h> list = b1Var.f23583j;
            l.d(list, "getAnnotationList(...)");
            for (wd.h hVar2 : list) {
                l.b(hVar2);
                a1Var.f8359b.add(android.support.v4.media.session.b.T(hVar2, fVar));
            }
        }
        return a1Var;
    }

    public static final void g(String str, String str2, x0.o oVar, int i10) {
        x0.o oVar2 = oVar;
        oVar2.Y(-1303282554);
        int i11 = (oVar2.f(str) ? 4 : 2) | i10 | (oVar2.f(str2) ? 32 : 16);
        if (oVar2.N(i11 & 1, (i11 & 19) != 18)) {
            c0.z zVarL = lc.b.L(oVar2);
            j1.n nVar = j1.n.f9689a;
            q qVarN = y.d.n(nVar);
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar2);
            j1 j1VarL = oVar2.l();
            q qVarC = j1.a.c(qVarN, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, v0VarD, oVar2);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar2);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC, oVar2);
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
            int iQ2 = x0.v.q(oVar2);
            j1 j1VarL2 = oVar2.l();
            q qVarC2 = j1.a.c(fillElement, oVar2);
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(hVar, vVarA, oVar2);
            x0.v.A(hVar2, j1VarL2, oVar2);
            if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                h0.s(iQ2, oVar2, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC2, oVar2);
            float f10 = 0;
            y.e1 e1Var = new y.e1(f10, f10, f10, f10);
            if (1.0f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            ba.z.f(e1Var, zVarL, null, null, new LayoutWeightElement(1.0f, true), oVar, 6, 12);
            oVar2 = oVar;
            a2.c.k(null, oVar2, 0, 1);
            oVar2.p(true);
            ka.b.e(zVarL, androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.b.f554a.a(nVar, j1.c.f9670i), 20, 70), 0, oVar2, 0, 4);
            ba.z.e(na.w.e(str), str2 != null ? na.w.e(str2) : null, oVar2, 0, 0);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ea.d(str, i10, 1, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer g0(java.lang.String r20) {
        /*
            r0 = r20
            r0.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
        Lb:
            r0 = 0
            r16 = 0
            goto L87
        L10:
            r1 = 0
            char r3 = r0.charAt(r1)
            r4 = 45
            if (r3 != r4) goto L1a
            r1 = 1
        L1a:
            int r3 = r0.length()
            if (r1 != r3) goto L21
            goto Lb
        L21:
            int r3 = r1 + 1
            char r4 = r0.charAt(r1)
            r5 = -1
            r6 = 128(0x80, float:1.8E-43)
            if (r4 >= r6) goto L31
            byte[] r7 = bb.c.f2538a
            r4 = r7[r4]
            goto L34
        L31:
            byte[] r4 = bb.c.f2538a
            r4 = -1
        L34:
            if (r4 < 0) goto L60
            r7 = 10
            if (r4 < r7) goto L3b
            goto L60
        L3b:
            int r4 = -r4
            long r8 = (long) r4
            long r10 = (long) r7
            r12 = -9223372036854775808
            long r14 = r12 / r10
        L42:
            int r4 = r0.length()
            if (r3 >= r4) goto L74
            int r4 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 >= r6) goto L55
            byte[] r16 = bb.c.f2538a
            r3 = r16[r3]
            goto L58
        L55:
            byte[] r3 = bb.c.f2538a
            r3 = -1
        L58:
            if (r3 < 0) goto L60
            if (r3 >= r7) goto L60
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 >= 0) goto L63
        L60:
            r16 = 0
            goto L6e
        L63:
            long r8 = r8 * r10
            r16 = 0
            long r2 = (long) r3
            long r17 = r2 + r12
            int r19 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r19 >= 0) goto L71
        L6e:
            r0 = r16
            goto L87
        L71:
            long r8 = r8 - r2
            r3 = r4
            goto L42
        L74:
            r16 = 0
            if (r1 == 0) goto L7d
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            goto L87
        L7d:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L82
            goto L6e
        L82:
            long r0 = -r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L87:
            if (r0 == 0) goto La0
            long r1 = r0.longValue()
            int r3 = r0.intValue()
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L97
            goto La0
        L97:
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        La0:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.a.g0(java.lang.String):java.lang.Integer");
    }

    public static final Float h(Object obj, Map map) {
        Object next;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (l.a(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final q i(q qVar, float f10) {
        return f10 == 1.0f ? qVar : androidx.compose.ui.graphics.a.c(qVar, f10, 0.0f, null, 520187);
    }

    public static List j(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new bb.b(iArr, 0, iArr.length);
    }

    public static final lh.a0 k(lh.f0 f0Var) {
        l.e(f0Var, "<this>");
        return new lh.a0(f0Var);
    }

    public static final b0 l(lh.h0 h0Var) {
        l.e(h0Var, "<this>");
        return new b0(h0Var);
    }

    public static final float m(long j10, float f10, long j11, long j12) {
        long jL = q1.h0.l(q1.q.b(f10, j10), j12);
        float fR = q1.h0.r(q1.h0.l(j11, jL)) + 0.05f;
        float fR2 = q1.h0.r(jL) + 0.05f;
        return Math.max(fR, fR2) / Math.min(fR, fR2);
    }

    public static final void n(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
    }

    public static final void o(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
    }

    public static final void p(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(a0.c.I("fromIndex: ", i10, i11, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static int q(long j10) {
        int i10 = (int) j10;
        ud.s.f(j10, "Out of range: %s", ((long) i10) == j10);
        return i10;
    }

    public static final Collection r(Collection collection, Collection collection2) {
        l.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dd.c s(java.lang.Class r14) throws java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.a.s(java.lang.Class):dd.c");
    }

    public static final long t(float f10, int i10, long j10, boolean z10) {
        int iH = ((z10 || i10 == 2 || i10 == 4 || i10 == 5) && f3.a.d(j10)) ? f3.a.h(j10) : Integer.MAX_VALUE;
        if (f3.a.j(j10) != iH) {
            iH = nh.b.k(h0.q0.m(f10), f3.a.j(j10), iH);
        }
        return pc.f0.x(0, iH, 0, f3.a.g(j10));
    }

    public static final ed.e u(Annotation[] annotationArr, be.c cVar) {
        Annotation annotation;
        l.e(annotationArr, "<this>");
        l.e(cVar, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (l.a(ed.d.a(D(y(annotation))).a(), cVar)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new ed.e(annotation);
        }
        return null;
    }

    public static int v(byte[] bArr) {
        boolean z10 = bArr.length >= 4;
        int length = bArr.length;
        if (z10) {
            return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        throw new IllegalArgumentException(j.q("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static final androidx.lifecycle.s0 w(androidx.lifecycle.x0 x0Var, pc.c cVar, u0 u0Var, i4.b bVar) {
        androidx.lifecycle.v0 v0VarB;
        if (u0Var != null) {
            androidx.lifecycle.w0 w0VarD = x0Var.d();
            l.e(w0VarD, "store");
            l.e(bVar, "extras");
            v0VarB = new androidx.lifecycle.v0(w0VarD, u0Var, bVar);
        } else if (x0Var instanceof androidx.lifecycle.k) {
            androidx.lifecycle.w0 w0VarD2 = x0Var.d();
            u0 u0VarB = ((androidx.lifecycle.k) x0Var).b();
            l.e(w0VarD2, "store");
            l.e(u0VarB, "factory");
            l.e(bVar, "extras");
            v0VarB = new androidx.lifecycle.v0(w0VarD2, u0VarB, bVar);
        } else {
            v0VarB = pe.d.B(x0Var, null, 6);
        }
        return v0VarB.a(cVar);
    }

    public static final d0.j x(b0.q0 q0Var, int i10, long j10, d0.t tVar, long j11, u.e1 e1Var, j1.f fVar, j1.g gVar, f3.m mVar, boolean z10, int i11) {
        return new d0.j(i10, i11, q0Var.b(i10, j10), j11, tVar.b(i10), e1Var, fVar, gVar, mVar, z10);
    }

    public static final pc.c y(Annotation annotation) {
        l.e(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        l.d(clsAnnotationType, "annotationType(...)");
        return H(clsAnnotationType);
    }

    public static final ArrayList z(Annotation[] annotationArr) {
        l.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new ed.e(annotation));
        }
        return arrayList;
    }
}
