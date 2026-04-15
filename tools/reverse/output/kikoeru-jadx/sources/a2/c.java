package a2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.x;
import b5.f0;
import ba.s;
import bd.y0;
import bf.g;
import bg.a2;
import c2.e0;
import c4.t;
import c4.u;
import cg.a0;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import d.j0;
import d.l0;
import d0.z;
import da.s0;
import g2.v0;
import hd.f1;
import hd.g1;
import hd.h1;
import hd.q0;
import i2.j;
import i2.v1;
import i7.j1;
import j2.h0;
import j2.l1;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.l;
import le.o;
import m0.d3;
import m0.f4;
import m0.f9;
import m0.i2;
import m0.r2;
import m0.x0;
import n7.b0;
import o1.r;
import p4.c0;
import pd.i;
import q.x1;
import q1.n0;
import q1.q;
import r.f2;
import r.z0;
import s.c1;
import s4.d0;
import s4.h;
import s4.y;
import se.w;
import t2.k0;
import ud.p;
import vb.m;
import vc.k;
import vc.n;
import w1.f;
import w1.g0;
import x0.b1;
import x0.n1;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import y.d1;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ed.a f189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f191c;

    public static void A(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, ub.h] */
    public static ge.f B(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            l.d(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            be.b bVarA = ed.d.a(cls);
            String str = xc.d.f24905a;
            be.c cVarA = bVarA.a();
            l.e(cVarA, "fqName");
            be.b bVar = (be.b) xc.d.f24912h.get(cVarA.f2744a);
            if (bVar != null) {
                bVarA = bVar;
            }
            return new ge.f(bVarA, i10);
        }
        if (cls.equals(Void.TYPE)) {
            be.c cVarI = n.f22871d.i();
            return new ge.f(new be.b(cVarI.b(), cVarI.f2744a.g()), i10);
        }
        k kVarD = je.c.b(cls.getName()).d();
        l.d(kVarD, "getPrimitiveType(...)");
        if (i10 > 0) {
            be.c cVar = (be.c) kVarD.f22859d.getValue();
            l.e(cVar, "topLevelFqName");
            return new ge.f(new be.b(cVar.b(), cVar.f2744a.g()), i10 - 1);
        }
        be.c cVar2 = (be.c) kVarD.f22858c.getValue();
        l.e(cVar2, "topLevelFqName");
        return new ge.f(new be.b(cVar2.b(), cVar2.f2744a.g()), i10);
    }

    public static u D(Context context) {
        ProviderInfo providerInfo;
        s3.d dVar;
        ApplicationInfo applicationInfo;
        pe.d cVar = Build.VERSION.SDK_INT >= 28 ? new c4.c(15) : new pe.d(15);
        PackageManager packageManager = context.getPackageManager();
        b0.g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrD = cVar.D(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrD) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new s3.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new u(new t(context, dVar));
    }

    public static o E(Collection collection, String str) {
        l.e(str, "message");
        l.e(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(vb.n.K(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((w) it.next()).n0());
        }
        g gVarS = g8.a.S(arrayList);
        int i10 = gVarS.f2801a;
        o aVar = i10 != 0 ? i10 != 1 ? new le.a(str, (o[]) gVarS.toArray(new o[0])) : (o) gVarS.get(0) : le.n.f12335b;
        return gVarS.f2801a <= 1 ? aVar : new le.k(aVar);
    }

    public static boolean F(yc.b bVar, yc.b bVar2) {
        l.e(bVar, "superDescriptor");
        l.e(bVar2, "subDescriptor");
        if (!(bVar2 instanceof nd.e) || !(bVar instanceof yc.t)) {
            return false;
        }
        nd.e eVar = (nd.e) bVar2;
        eVar.o0().size();
        yc.t tVar = (yc.t) bVar;
        tVar.o0().size();
        List listO0 = eVar.a().o0();
        l.d(listO0, "getValueParameters(...)");
        List listO02 = tVar.a().o0();
        l.d(listO02, "getValueParameters(...)");
        for (ub.k kVar : m.M0(listO0, listO02)) {
            y0 y0Var = (y0) kVar.f21543a;
            y0 y0Var2 = (y0) kVar.f21544b;
            l.b(y0Var);
            boolean z10 = R((yc.t) bVar2, y0Var) instanceof ud.l;
            l.b(y0Var2);
            if (z10 != (R(tVar, y0Var2) instanceof ud.l)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] G(h hVar, String str, byte[] bArr, Map map) throws f0 {
        Map map2;
        List list;
        d0 d0Var = new d0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        p4.c.k(uri, "The uri must be set.");
        s4.m mVar = new s4.m(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        s4.m mVarA = mVar;
        int i11 = 0;
        while (true) {
            try {
                s4.k kVar = new s4.k(d0Var, mVarA);
                try {
                    try {
                        byte[] bArrB = za.b.b(kVar);
                        c0.g(kVar);
                        return bArrB;
                    } catch (y e10) {
                        int i12 = e10.f19484d;
                        String str2 = null;
                        if ((i12 == 307 || i12 == 308) && i11 < 5 && (map2 = e10.f19485e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i10);
                        }
                        if (str2 == null) {
                            throw e10;
                        }
                        i11++;
                        s4.l lVarA = mVarA.a();
                        lVarA.f19433a = Uri.parse(str2);
                        mVarA = lVarA.a();
                        c0.g(kVar);
                    }
                } catch (Throwable th2) {
                    c0.g(kVar);
                    throw th2;
                }
            } catch (Exception e11) {
                throw new f0(mVar, d0Var.f19399c, d0Var.f19397a.p(), d0Var.f19398b, e11);
            }
        }
    }

    public static final void H(j1 j1Var) {
        int i10 = id.c.f9499h;
        if (j1Var.f9177b != 1 || j1Var.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var, " was passed").toString());
        }
    }

    public static y0 J(be.e eVar, yc.e eVar2) {
        if (eVar == null) {
            a(19);
            throw null;
        }
        if (eVar2 == null) {
            a(20);
            throw null;
        }
        Collection collectionT = eVar2.T();
        if (collectionT.size() != 1) {
            return null;
        }
        for (y0 y0Var : ((bd.l) collectionT.iterator().next()).o0()) {
            if (y0Var.getName().equals(eVar)) {
                return y0Var;
            }
        }
        return null;
    }

    public static b1.e K(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new b1.e(m2.b.c(view));
        }
        return null;
    }

    public static final long L(KeyEvent keyEvent) {
        return g8.a.e(keyEvent.getKeyCode());
    }

    public static final f M() {
        f fVar = f191c;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("AutoMirrored.Filled.QueueMusic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(15.0f, 6.0f);
        q0Var.q(3.0f);
        q0Var.z(2.0f);
        q0Var.r(12.0f);
        q0Var.y(6.0f);
        q0Var.l();
        q0Var.u(15.0f, 10.0f);
        q0Var.q(3.0f);
        q0Var.z(2.0f);
        q0Var.r(12.0f);
        q0Var.y(10.0f);
        q0Var.l();
        q0Var.u(3.0f, 16.0f);
        q0Var.r(8.0f);
        q0Var.z(-2.0f);
        q0Var.q(3.0f);
        q0Var.y(16.0f);
        q0Var.l();
        q0Var.u(17.0f, 6.0f);
        q0Var.z(8.18f);
        q0Var.m(16.69f, 14.07f, 16.35f, 14.0f, 16.0f, 14.0f);
        q0Var.n(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        q0Var.w(1.34f, 3.0f, 3.0f, 3.0f);
        q0Var.w(3.0f, -1.34f, 3.0f, -3.0f);
        q0Var.y(8.0f);
        q0Var.r(3.0f);
        q0Var.y(6.0f);
        q0Var.q(17.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f191c = fVarB;
        return fVarB;
    }

    public static final String N(int i10, x0.o oVar) {
        oVar.j(AndroidCompositionLocals_androidKt.f720a);
        Resources resources = ((Context) oVar.j(AndroidCompositionLocals_androidKt.f721b)).getResources();
        return i10 == 0 ? resources.getString(R.string.navigation_menu) : i10 == 1 ? resources.getString(R.string.close_drawer) : i10 == 2 ? resources.getString(R.string.close_sheet) : i10 == 3 ? resources.getString(R.string.default_error_message) : i10 == 4 ? resources.getString(R.string.dropdown_menu) : i10 == 5 ? resources.getString(R.string.range_start) : i10 == 6 ? resources.getString(R.string.range_end) : i10 == 7 ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
    }

    public static final int O(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static boolean P(Throwable th2) {
        return c0.f16548a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean Q(Throwable th2) {
        return c0.f16548a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (ie.d.g(r0).equals(ie.d.g(r2)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ud.m R(yc.t r8, bd.y0 r9) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c.R(yc.t, bd.y0):ud.m");
    }

    public static final void S(jc.o oVar) {
        l.d(yd.d.f26186p, "MEMBER_KIND");
        bc.b bVar = f1.f8386c;
        ArrayList arrayList = new ArrayList(vb.n.K(bVar, 10));
        jc.b bVar2 = new jc.b(7, bVar);
        while (bVar2.hasNext()) {
            arrayList.add(((f1) bVar2.next()).f8387a);
        }
    }

    public static final void T(jc.o oVar) {
        l.d(yd.d.f26175e, "MODALITY");
        bc.b bVar = g1.f8391c;
        ArrayList arrayList = new ArrayList(vb.n.K(bVar, 10));
        jc.b bVar2 = new jc.b(7, bVar);
        while (bVar2.hasNext()) {
            arrayList.add(((g1) bVar2.next()).f8392a);
        }
    }

    public static void U(ud.q qVar, Annotation annotation) throws InvocationTargetException {
        Class clsD = g8.a.D(g8.a.y(annotation));
        ud.o oVarE = qVar.e(ed.d.a(clsD), new dd.a(annotation));
        if (oVarE != null) {
            V(oVarE, annotation, clsD);
        }
    }

    public static void V(ud.o oVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        l.d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                l.b(objInvoke);
                be.e eVarE = be.e.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    oVar.h(eVarE, B((Class) objInvoke));
                } else if (dd.d.f5868a.contains(enclosingClass)) {
                    oVar.d(eVarE, objInvoke);
                } else {
                    List list = ed.d.f6487a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        l.b(enclosingClass);
                        oVar.k(eVarE, ed.d.a(enclosingClass), be.e.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        l.d(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) vb.l.I0(interfaces);
                        l.b(cls2);
                        ud.o oVarQ = oVar.q(ed.d.a(cls2), eVarE);
                        if (oVarQ != null) {
                            V(oVarQ, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        p pVarL = oVar.l(eVarE);
                        if (pVarL != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                be.b bVarA = ed.d.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    l.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    pVarL.j(bVarA, be.e.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    l.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    pVarL.c(B((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    ud.o oVarI = pVarL.i(ed.d.a(componentType));
                                    if (oVarI != null) {
                                        l.c(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        V(oVarI, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    pVarL.o(obj4);
                                }
                            }
                            pVarL.b();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        oVar.b();
    }

    public static final void W(j1 j1Var) {
        int i10 = id.d.f9500h;
        if (j1Var.f9177b != 1 || j1Var.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var, " was passed").toString());
        }
    }

    public static final boolean Z(w wVar) {
        yc.h hVarH = wVar.t().h();
        if (hVarH != null && ((ee.g.b(hVarH) && ee.g.e(hVarH) && !ie.d.g((yc.e) hVarH).equals(vc.o.f22905h)) || ee.g.g(wVar))) {
            return true;
        }
        yc.h hVarH2 = wVar.t().h();
        yc.q0 q0Var = hVarH2 instanceof yc.q0 ? (yc.q0) hVarH2 : null;
        return q0Var != null && Z(ud.e.y(q0Var));
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static LinkedHashSet a0(be.e eVar, Collection collection, Collection collection2, yc.e eVar2, oe.m mVar, ee.l lVar, boolean z10) {
        if (eVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (eVar2 == null) {
            a(15);
            throw null;
        }
        if (mVar == null) {
            a(16);
            throw null;
        }
        if (lVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lVar.h(eVar, collection, collection2, eVar2, new md.a(mVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final ic.a r20, final f1.f r21, j1.q r22, ic.n r23, ic.n r24, ic.n r25, q1.l0 r26, long r27, long r29, j3.q r31, x0.o r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c.b(ic.a, f1.f, j1.q, ic.n, ic.n, ic.n, q1.l0, long, long, j3.q, x0.o, int, int):void");
    }

    public static LinkedHashSet b0(be.e eVar, AbstractCollection abstractCollection, Collection collection, yc.e eVar2, oe.m mVar, ee.l lVar) {
        if (eVar == null) {
            a(0);
            throw null;
        }
        if (eVar2 == null) {
            a(3);
            throw null;
        }
        if (mVar == null) {
            a(4);
            throw null;
        }
        if (lVar != null) {
            return a0(eVar, abstractCollection, collection, eVar2, mVar, lVar, false);
        }
        a(5);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final ic.a r24, final f1.f r25, j1.q r26, ic.n r27, ic.n r28, q1.l0 r29, long r30, long r32, j3.q r34, x0.o r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c.c(ic.a, f1.f, j1.q, ic.n, ic.n, q1.l0, long, long, j3.q, x0.o, int, int):void");
    }

    public static LinkedHashSet c0(be.e eVar, Collection collection, AbstractCollection abstractCollection, i iVar, oe.m mVar, ee.l lVar) {
        if (eVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (iVar == null) {
            a(9);
            throw null;
        }
        if (mVar == null) {
            a(10);
            throw null;
        }
        if (lVar != null) {
            return a0(eVar, collection, abstractCollection, iVar, mVar, lVar, true);
        }
        a(11);
        throw null;
    }

    public static final void d(boolean z10, ic.a aVar, x0.o oVar, int i10) {
        oVar.Y(-361453782);
        int i11 = (oVar.g(z10) ? 4 : 2) | i10 | (oVar.h(aVar) ? 32 : 16);
        if ((i11 & 19) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            w0 w0VarY = v.y(aVar, oVar);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new e.c(z10, w0VarY);
                oVar.h0(objK);
            }
            e.c cVar = (e.c) objK;
            boolean zH = ((i11 & 14) == 4) | oVar.h(cVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new s(cVar, z10, 1);
                oVar.h0(objK2);
            }
            v.h((ic.a) objK2, oVar);
            l0 l0VarA = e.g.a(oVar);
            if (l0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            j0 j0VarA = l0VarA.a();
            x xVar = (x) oVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH2 = oVar.h(j0VarA) | oVar.h(xVar) | oVar.h(cVar);
            Object objK3 = oVar.K();
            if (zH2 || objK3 == r0Var) {
                objK3 = new ba.i(j0VarA, xVar, cVar, 1);
                oVar.h0(objK3);
            }
            v.d(xVar, j0VarA, (ic.k) objK3, oVar);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new s0(z10, aVar, i10, 1);
        }
    }

    public static final ub.t d0(String str) {
        int i10;
        gh.g.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (l.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int i12 = 119304647;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            int i13 = i11 ^ Integer.MIN_VALUE;
            if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                if (i12 != 119304647) {
                    return null;
                }
                i12 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i14 = i11 * 10;
            int i15 = iDigit + i14;
            if (Integer.compare(i15 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i10++;
            i11 = i15;
        }
        return new ub.t(i11);
    }

    public static final long e(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final ub.v e0(String str) {
        int i10;
        long j10;
        l.e(str, "<this>");
        int i11 = 10;
        gh.g.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        char c3 = 1;
        if (l.g(cCharAt, 48) >= 0) {
            i10 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i10 = 1;
        }
        long j11 = 10;
        long j12 = 0;
        long j13 = 512409557603043100L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), i11);
            if (iDigit < 0) {
                return null;
            }
            int i12 = length;
            long j14 = j12 ^ Long.MIN_VALUE;
            int i13 = i10;
            if (Long.compare(j14, j13 ^ Long.MIN_VALUE) <= 0) {
                j10 = j11;
            } else {
                if (j13 != 512409557603043100L) {
                    return null;
                }
                if (j11 >= 0) {
                    long j15 = (Long.MAX_VALUE / j11) << c3;
                    j10 = j11;
                    j13 = j15 + ((long) ((((-1) - (j15 * j11)) ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE) ? 1 : 0));
                } else if (Long.MAX_VALUE < (j11 ^ Long.MIN_VALUE)) {
                    j10 = j11;
                    j13 = 0;
                } else {
                    j13 = 1;
                    j10 = j11;
                }
                if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j16 = j12 * j10;
            long j17 = (((long) iDigit) & 4294967295L) + j16;
            if (Long.compare(j17 ^ Long.MIN_VALUE, j16 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i10 = i13 + 1;
            j12 = j17;
            length = i12;
            j11 = j10;
            i11 = 10;
            c3 = 1;
        }
        return new ub.v(j12);
    }

    public static final void f(boolean z10, ic.k kVar, j1.q qVar, f1.f fVar, x0.o oVar, int i10) {
        f1.f fVar2;
        oVar.Y(-1337700255);
        int i11 = i10 | (oVar.g(z10) ? 4 : 2) | 384;
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            f3.c cVar = (f3.c) oVar.j(l1.f9866h);
            View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
            boolean zF = oVar.f(view);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (zF || objK == obj) {
                objK = new f9(view);
                oVar.h0(objK);
            }
            final f9 f9Var = (f9) objK;
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = new b1(0);
                oVar.h0(objK2);
            }
            final b1 b1Var = (b1) objK2;
            Object objK3 = oVar.K();
            if (objK3 == obj) {
                objK3 = new b1(0);
                oVar.h0(objK3);
            }
            final b1 b1Var2 = (b1) objK3;
            final int iA0 = cVar.a0(f4.f12977b);
            Object objK4 = oVar.K();
            if (objK4 == obj) {
                objK4 = new v1();
                oVar.h0(objK4);
            }
            final v1 v1Var = (v1) objK4;
            boolean zD = oVar.d(b1Var2.e()) | oVar.f(cVar) | oVar.d(b1Var.e());
            Object objK5 = oVar.K();
            if (zD || objK5 == obj) {
                objK5 = new d3(cVar, b1Var2, b1Var);
                oVar.h0(objK5);
            }
            d3 d3Var = (d3) objK5;
            Object objK6 = oVar.K();
            if (objK6 == obj) {
                objK6 = new r();
                oVar.h0(objK6);
            }
            r rVar = (r) objK6;
            boolean zH = oVar.h(v1Var) | oVar.h(f9Var) | oVar.d(iA0);
            Object objK7 = oVar.K();
            if (zH || objK7 == obj) {
                objK7 = new ic.k() { // from class: m0.c3
                    @Override // ic.k
                    public final Object a(Object obj2) {
                        g2.c0 c0Var = (g2.c0) obj2;
                        b1Var.f((int) (c0Var.k() >> 32));
                        i2.v1 v1Var2 = v1Var;
                        v1Var2.f8881a = c0Var;
                        View view2 = f9Var.f13004a;
                        Rect rect = new Rect();
                        view2.getWindowVisibleDisplayFrame(rect);
                        int i12 = rect.top;
                        int i13 = rect.bottom;
                        g2.c0 c0Var2 = v1Var2.f8881a;
                        if (c0Var2 != null) {
                            b1Var2.f(((int) Math.max(g2.n1.g(c0Var2).f16484b - i12, (i13 - i12) - g2.n1.g(c0Var2).f16486d)) - iA0);
                        }
                        return ub.a0.f21526a;
                    }
                };
                oVar.h0(objK7);
            }
            j1.n nVar = j1.n.f9689a;
            j1.q qVarD = androidx.compose.ui.layout.a.d(nVar, (ic.k) objK7);
            int i12 = i11 & 14;
            boolean z11 = i12 == 4;
            Object objK8 = oVar.K();
            if (z11 || objK8 == obj) {
                objK8 = new x0(kVar, z10, 1);
                oVar.h0(objK8);
            }
            ic.a aVar = (ic.a) objK8;
            j1.q qVarB = androidx.compose.ui.focus.a.b(q2.m.a(e0.a(qVarD, aVar, new r2(1, aVar)), false, new i2(N(4, oVar), aVar, 1)), rVar);
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarB, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar2 = j.f8733b;
            oVar.a0();
            qVar = nVar;
            if (oVar.S) {
                oVar.k(aVar2);
            } else {
                oVar.k0();
            }
            v.A(j.f8738g, v0VarD, oVar);
            v.A(j.f8737f, j1VarL, oVar);
            i2.h hVar = j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar);
            fVar2 = fVar;
            fVar2.g(d3Var, oVar, 48);
            oVar.p(true);
            boolean z12 = i12 == 4;
            Object objK9 = oVar.K();
            if (z12 || objK9 == obj) {
                objK9 = new s(z10, rVar, 2);
                oVar.h0(objK9);
            }
            v.h((ic.a) objK9, oVar);
            boolean zH2 = oVar.h(f9Var) | oVar.h(v1Var) | oVar.d(iA0);
            Object objK10 = oVar.K();
            if (zH2 || objK10 == obj) {
                objK10 = new aa.h(f9Var, v1Var, iA0, b1Var2);
                oVar.h0(objK10);
            }
            a.a.h((ic.a) objK10, oVar, 0);
        } else {
            fVar2 = fVar;
            oVar.Q();
        }
        j1.q qVar2 = qVar;
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.b(z10, kVar, qVar2, fVar2, i10);
        }
    }

    public static final void f0(j1 j1Var) {
        int i10 = id.g.f9503h;
        if (j1Var.f9177b != 1 || j1Var.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var, " was passed").toString());
        }
    }

    public static final void g(d0.d dVar, j1.q qVar, d1 d1Var, d0.k kVar, float f10, j1.g gVar, v.f fVar, boolean z10, b2.a aVar, v.k kVar2, s.f fVar2, f1.f fVar3, x0.o oVar, int i10) {
        int i11;
        d1 d1Var2;
        d0.k kVar3;
        float f11;
        j1.g gVar2;
        v.f fVar4;
        boolean z11;
        b2.a aVar2;
        v.k kVar4;
        s.f fVar5;
        d0.k kVar5;
        b2.a aVar3;
        int i12;
        float f12;
        s.f fVar6;
        v.f fVar7;
        d1 d1Var3;
        j1.g gVar3;
        boolean z12;
        oVar.Y(-1372972868);
        int i13 = 2;
        if ((i10 & 6) == 0) {
            i11 = i10 | (oVar.f(dVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        int i14 = 1797504 | i11;
        if ((i10 & 12582912) == 0) {
            i14 = 5991808 | i11;
        }
        int i15 = 905969664 | i14;
        if (oVar.N(i15 & 1, (306783379 & i15) != 306783378)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                float f13 = 0;
                e1 e1Var = new e1(f13, f13, f13, f13);
                float f14 = 0;
                j1.g gVar4 = j1.c.f9672k;
                int i16 = (i15 & 14) | 196608;
                Object zVar = new z();
                r.t tVarA = x1.a(oVar);
                p1.c cVar = f2.f18406a;
                z0 z0VarQ = r.d.q(1, Float.valueOf(1));
                Object obj = (f3.c) oVar.j(l1.f9866h);
                Object obj2 = (f3.m) oVar.j(l1.f9872n);
                boolean zF = oVar.f(obj) | ((((i16 & 14) ^ 6) > 4 && oVar.f(dVar)) || (i16 & 6) == 4) | oVar.f(tVarA) | oVar.f(z0VarQ) | oVar.f(zVar) | oVar.f(obj2);
                Object objK = oVar.K();
                Object obj3 = x0.k.f24334a;
                if (zF || objK == obj3) {
                    m0.w wVar = new m0.w(dVar, new cg.d0(i13, dVar, obj2), zVar, 29);
                    float f15 = v.j.f22127a;
                    objK = new v.f(wVar, tVarA, z0VarQ);
                    oVar.h0(objK);
                }
                v.f fVar8 = (v.f) objK;
                int i17 = i15 & (-29360129);
                int i18 = (i15 & 14) | 432;
                boolean z13 = (((i18 & 14) ^ 6) > 4 && oVar.f(dVar)) || (i18 & 6) == 4;
                Object objK2 = oVar.K();
                if (z13 || objK2 == obj3) {
                    objK2 = new d0.a(dVar);
                    oVar.h0(objK2);
                }
                s.f fVarA = c1.a(oVar);
                kVar5 = d0.k.f5362a;
                aVar3 = (d0.a) objK2;
                i12 = i17;
                f12 = f14;
                fVar6 = fVarA;
                fVar7 = fVar8;
                d1Var3 = e1Var;
                gVar3 = gVar4;
                kVar4 = v.k.f22128a;
                z12 = true;
            } else {
                oVar.Q();
                i12 = i15 & (-29360129);
                d1Var3 = d1Var;
                kVar5 = kVar;
                f12 = f10;
                gVar3 = gVar;
                fVar7 = fVar;
                z12 = z10;
                aVar3 = aVar;
                kVar4 = kVar2;
                fVar6 = fVar2;
            }
            oVar.q();
            int i19 = i12 >> 6;
            int i20 = i12 << 12;
            a.a.i(qVar, dVar, d1Var3, fVar7, z12, fVar6, f12, kVar5, aVar3, gVar3, kVar4, fVar3, oVar, ((i12 >> 3) & 14) | 24576 | ((i12 << 3) & 112) | (i12 & 896) | ((i12 >> 18) & 7168) | (3670016 & i19) | (234881024 & i20) | (i20 & 1879048192), ((i12 >> 9) & 14) | 3456 | (i19 & 57344) | 1769472);
            fVar5 = fVar6;
            f11 = f12;
            gVar2 = gVar3;
            aVar2 = aVar3;
            z11 = z12;
            kVar3 = kVar5;
            fVar4 = fVar7;
            d1Var2 = d1Var3;
        } else {
            oVar.Q();
            d1Var2 = d1Var;
            kVar3 = kVar;
            f11 = f10;
            gVar2 = gVar;
            fVar4 = fVar;
            z11 = z10;
            aVar2 = aVar;
            kVar4 = kVar2;
            fVar5 = fVar2;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new d0.o(dVar, qVar, d1Var2, kVar3, f11, gVar2, fVar4, z11, aVar2, kVar4, fVar5, fVar3, i10);
        }
    }

    public static final void g0(jc.o oVar) {
        l.d(yd.d.f26174d, "VISIBILITY");
        bc.b bVar = h1.f8396c;
        ArrayList arrayList = new ArrayList(vb.n.K(bVar, 10));
        jc.b bVar2 = new jc.b(7, bVar);
        while (bVar2.hasNext()) {
            arrayList.add(((h1) bVar2.next()).f8397a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(int r41, int r42, a0.g0 r43, ic.k r44, j1.f r45, j1.q r46, s.f r47, u.p0 r48, x0.o r49, y.h r50, y.d1 r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c.h(int, int, a0.g0, ic.k, j1.f, j1.q, s.f, u.p0, x0.o, y.h, y.d1, boolean):void");
    }

    public static final void i(e7.j jVar, g1.c cVar, f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(233973821);
        int i11 = 2;
        if ((((oVar.h(jVar) ? 4 : 2) | i10 | (oVar.h(cVar) ? 32 : 16)) & 147) == 146 && oVar.z()) {
            oVar.Q();
        } else {
            v.b(new n1[]{j4.a.f10201a.a(jVar), g4.a.f7345a.a(jVar), x7.a.f24831a.a(jVar)}, f1.g.f(1808964477, new ee.b(i11, cVar, fVar), oVar), oVar, 56);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.p(jVar, cVar, fVar, i10);
        }
    }

    public static final void j(cg.v vVar, x0.o oVar, int i10) {
        l.e(vVar, "vm");
        x0.e1 e1Var = vVar.f4116e;
        oVar.Y(-668025543);
        int iOrdinal = vVar.w().ordinal();
        boolean zBooleanValue = (iOrdinal == 0 || iOrdinal == 1) ? ((Boolean) e1Var.getValue()).booleanValue() : iOrdinal != 3;
        androidx.compose.animation.b.b(vVar.z() && zBooleanValue, androidx.compose.foundation.layout.b.f554a.a(j1.n.f9689a, j1.c.f9665d), q.l0.b(null, 3), q.l0.c(null, 3), null, f1.g.b(oVar, 487204705, new cg.z(vVar, 0)), oVar, 200064);
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a0(vVar, i10, 0);
        }
    }

    public static final void k(j1.q qVar, x0.o oVar, int i10, int i11) {
        int i12;
        j1.q qVar2;
        ca.a aVar;
        p1 p1VarR;
        oVar.Y(-1403600218);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = (oVar.f(qVar) ? 4 : 2) | i10;
        }
        if (oVar.N(i12 & 1, (i12 & 3) != 2)) {
            j1.n nVar = j1.n.f9689a;
            j1.q qVar3 = i13 != 0 ? nVar : qVar;
            e7.a0 a0Var = (e7.a0) oVar.j(a9.u.f265c);
            a2 a2Var = (a2) h9.d.f8241a.getValue();
            bg.z zVarB = h9.d.b();
            String str = zVarB != null ? zVarB.f2996d : null;
            String strM = str != null ? na.w.m(str) : null;
            if (a2Var == null || strM == null) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    aVar = new ca.a(qVar3, i10, i11, 0);
                    p1VarR.f24421d = aVar;
                }
                return;
            }
            j1.q qVarE = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 5).e(qVar3);
            boolean zH = oVar.h(a0Var);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new ca.b(a0Var, 0);
                oVar.h0(objK);
            }
            g8.a.a(androidx.compose.foundation.a.d(qVarE, null, (ic.a) objK, 7), null, 0L, 0.0f, f1.g.f(874429769, new ba.h0(2, a2Var, strM), oVar), oVar, 1572864, 62);
            qVar2 = qVar3;
        } else {
            oVar.Q();
            qVar2 = qVar;
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            aVar = new ca.a(qVar2, i10, i11, 1);
            p1VarR.f24421d = aVar;
        }
    }

    public static final void l(cg.v vVar, x0.o oVar, int i10) {
        x0.o oVar2;
        l.e(vVar, "vm");
        oVar.Y(-1390587994);
        if (((Boolean) vVar.f4119h.getValue()).booleanValue()) {
            oVar2 = oVar;
            v0.w.a(androidx.compose.foundation.layout.b.f554a.a(j1.n.f9689a, j1.c.f9666e), 0L, 0.0f, 0L, 0, oVar2, 0);
        } else {
            oVar2 = oVar;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a0(vVar, i10, 1);
        }
    }

    public static final void m(g1.c cVar, f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(832919318);
        int i11 = (oVar.h(cVar) ? 4 : 2) | i10 | (oVar.h(fVar) ? 32 : 16);
        if ((i11 & 19) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new d9.i(18);
                oVar.h0(objK);
            }
            ic.k kVar = (ic.k) objK;
            androidx.lifecycle.x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            jc.a0 a0Var = jc.z.f10839a;
            pc.c cVarB = a0Var.b(f7.a.class);
            i4.d dVar = new i4.d(0);
            dVar.a(a0Var.b(f7.a.class), kVar);
            f7.a aVar = (f7.a) g8.a.w(x0VarA, cVarB, dVar.b(), x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            aVar.f6758d = new b0.c1(cVar);
            cVar.a(aVar.f6757c, fVar, oVar, ((i11 << 6) & 896) | (i11 & 112));
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.h0(cVar, fVar, i10, 5);
        }
    }

    public static final void n(cg.v vVar, j1.q qVar, x0.o oVar, int i10) {
        boolean zBooleanValue;
        l.e(vVar, "vm");
        oVar.Y(-1483138499);
        float f10 = 0;
        e1 e1Var = new e1(f10, f10, f10, f10);
        int iOrdinal = vVar.w().ordinal();
        if (iOrdinal != 0) {
            zBooleanValue = true;
            if (iOrdinal == 1 || iOrdinal == 3) {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = ((Boolean) vVar.f4116e.getValue()).booleanValue();
        }
        androidx.compose.animation.b.b(zBooleanValue, qVar, q.l0.b(null, 3), q.l0.c(null, 3), null, f1.g.b(oVar, -1107172251, new cg.d0(0, e1Var, vVar)), oVar, (i10 & 112) | 200064);
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.e0(vVar, qVar, e1Var, i10);
        }
    }

    public static final void o(cg.v vVar, j1.q qVar, x0.o oVar, int i10) {
        l.e(vVar, "vm");
        oVar.Y(2027742976);
        int iOrdinal = vVar.w().ordinal();
        androidx.compose.animation.b.b((iOrdinal != 0 ? iOrdinal != 1 && iOrdinal != 3 : ((Boolean) vVar.f4116e.getValue()).booleanValue()) && vVar.z(), qVar, q.l0.b(null, 3), q.l0.c(null, 3), null, f1.g.b(oVar, 1342520792, new cg.z(vVar, 3)), oVar, (i10 & 112) | 200064);
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.e0(vVar, qVar, i10, 1);
        }
    }

    public static final be.b p(String str) {
        be.c cVar = be.h.f2762a;
        return new be.b(be.h.f2769h, be.e.e(str));
    }

    public static final be.b q(String str) {
        be.c cVar = be.h.f2762a;
        return new be.b(be.h.f2762a, be.e.e(str));
    }

    public static final be.b r(String str) {
        be.c cVar = be.h.f2762a;
        return new be.b(be.h.f2764c, be.e.e(str));
    }

    public static final void s(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iT = vb.w.t(vb.n.K(setEntrySet, 10));
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iT);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final be.b t(be.e eVar) {
        be.c cVar = be.h.f2762a;
        be.b bVar = be.h.f2773l;
        return new be.b(bVar.f2740a, be.e.e(eVar.c().concat(bVar.f().c())));
    }

    public static final be.b u(String str) {
        be.c cVar = be.h.f2762a;
        return new be.b(be.h.f2763b, be.e.e(str));
    }

    public static final ExtractedText v(y2.y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f25434a.f20320b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = yVar.f25435b;
        extractedText.selectionStart = k0.e(j10);
        extractedText.selectionEnd = k0.d(j10);
        extractedText.flags = !ef.n.o0(yVar.f25434a.f20320b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final be.b w(be.b bVar) {
        be.c cVar = be.h.f2762a;
        return new be.b(be.h.f2762a, be.e.e("U".concat(bVar.f().c())));
    }

    public abstract boolean C(h2.g gVar);

    public abstract Object I(h2.g gVar);

    public abstract void X(k3.f fVar, k3.f fVar2);

    public abstract void Y(k3.f fVar, Thread thread);

    public abstract boolean x(k3.g gVar, k3.c cVar, k3.c cVar2);

    public abstract boolean y(k3.g gVar, Object obj, Object obj2);

    public abstract boolean z(k3.g gVar, k3.f fVar, k3.f fVar2);
}
