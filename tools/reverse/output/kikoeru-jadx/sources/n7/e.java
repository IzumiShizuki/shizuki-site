package n7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import hd.q0;
import hf.a0;
import hf.y;
import j2.l1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import m0.m;
import q.t0;
import q1.n0;
import sc.f2;
import sc.w1;
import sc.z1;
import se.s0;
import se.u0;
import u3.x0;
import wf.g1;
import wf.h1;
import wf.o1;
import wf.z0;
import x0.a1;
import x0.w0;
import yc.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w1.f f15459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w1.f f15460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static w1.f f15461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w1.f f15462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w1.f f15463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static w1.f f15464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static w1.f f15465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static w1.f f15466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static w1.f f15467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static w1.f f15468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static w1.f f15469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static w1.f f15470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static w1.f f15471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static w1.f f15472n;

    public e() {
        new ConcurrentHashMap();
    }

    public static final sf.a A(d0.y yVar, pc.v vVar) {
        jc.l.e(yVar, "<this>");
        jc.l.e(vVar, "type");
        sf.a aVarZ = x0.z(yVar, vVar, true);
        if (aVarZ != null) {
            return aVarZ;
        }
        pc.c cVarH = z0.h(vVar);
        jc.l.e(cVarH, "<this>");
        String strY = cVarH.y();
        if (strY == null) {
            strY = "<local class name not available>";
        }
        throw new sf.h(t0.D("Serializer for class '", strY, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final sf.a B(pc.v vVar) {
        jc.l.e(vVar, "type");
        return A(zf.d.f26817a, vVar);
    }

    public static final sf.a C(pc.c cVar) {
        jc.l.e(cVar, "<this>");
        sf.a aVarD = z0.d(cVar, new sf.a[0]);
        return aVarD == null ? (sf.a) g1.f24121a.get(cVar) : aVarD;
    }

    public static final ArrayList D(d0.y yVar, List list, boolean z10) {
        jc.l.e(yVar, "<this>");
        jc.l.e(list, "typeArguments");
        if (z10) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(A(yVar, (pc.v) it.next()));
            }
            return arrayList;
        }
        List<pc.v> list3 = list;
        ArrayList arrayList2 = new ArrayList(vb.n.K(list3, 10));
        for (pc.v vVar : list3) {
            jc.l.e(vVar, "type");
            sf.a aVarZ = x0.z(yVar, vVar, false);
            if (aVarZ == null) {
                return null;
            }
            arrayList2.add(aVarZ);
        }
        return arrayList2;
    }

    public static final String E(int i10, x0.o oVar) {
        return ((Resources) oVar.j(AndroidCompositionLocals_androidKt.f722c)).getString(i10);
    }

    public static qd.a F(s0 s0Var, boolean z10, pd.e0 e0Var, int i10) {
        boolean z11 = (i10 & 1) != 0 ? false : z10;
        boolean z12 = (i10 & 2) == 0;
        if ((i10 & 4) != 0) {
            e0Var = null;
        }
        return new qd.a(s0Var, z12, z11, e0Var != null ? ud.e.X(e0Var) : null, 34);
    }

    public static final Class G(se.w wVar) {
        se.a0 a0VarH;
        Class clsH = H(wVar.t().h());
        if (clsH == null) {
            return null;
        }
        if (u0.e(wVar) && ((a0VarH = ee.g.h(wVar)) == null || u0.e(a0VarH) || vc.i.F(a0VarH))) {
            return null;
        }
        return clsH;
    }

    public static final Class H(yc.k kVar) {
        if (!(kVar instanceof yc.e) || !ee.g.b(kVar)) {
            return null;
        }
        yc.e eVar = (yc.e) kVar;
        Class clsJ = f2.j(eVar);
        if (clsJ != null) {
            return clsJ;
        }
        throw new hc.a("Class object for the class " + eVar.getName() + " cannot be found (classId=" + ie.d.f((yc.h) kVar) + ')');
    }

    public static final String I(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static float a(EdgeEffect edgeEffect, float f10, float f11, f3.c cVar) {
        float f12 = s.z.f19314a;
        double dA = cVar.a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f10) * 0.35f;
        double d10 = ((double) s.z.f19314a) * dA;
        float fExp = (float) (Math.exp((s.z.f19315b / s.z.f19316c) * Math.log(dAbs / d10)) * d10);
        int i10 = Build.VERSION.SDK_INT;
        if (fExp > (i10 >= 31 ? m3.f.b(edgeEffect) : 0.0f) * f11) {
            return 0.0f;
        }
        int iR = lc.b.R(f10);
        if (i10 >= 31) {
            edgeEffect.onAbsorb(iR);
            return f10;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iR);
        }
        return f10;
    }

    public static final u0.g b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof u0.g) {
                return (u0.g) childAt;
            }
        }
        u0.g gVar = new u0.g(viewGroup.getContext());
        viewGroup.addView(gVar);
        return gVar;
    }

    public static final ViewGroup c(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    public static final Object f(Object obj, yc.c cVar) {
        se.w wVarN;
        Class clsG;
        return (((cVar instanceof yc.k0) && ee.g.d((yc.t0) cVar)) || (wVarN = n(cVar)) == null || (clsG = G(wVarN)) == null) ? obj : o(clsG, cVar).invoke(obj, null);
    }

    public static pe.c g(be.c cVar, re.l lVar, yc.y yVar, InputStream inputStream) throws IOException {
        wd.h0 h0Var;
        ce.b bVar;
        jc.l.e(cVar, "fqName");
        jc.l.e(yVar, "module");
        try {
            xd.a aVar = xd.a.f24963f;
            xd.a aVarO = ud.e.O(inputStream);
            xd.a aVar2 = xd.a.f24963f;
            int i10 = aVarO.f26167c;
            jc.l.e(aVar2, "ourVersion");
            int i11 = aVar2.f26167c;
            int i12 = aVar2.f26166b;
            int i13 = aVarO.f26166b;
            if (i13 == 0) {
                if (i12 == 0 && i10 == i11) {
                    ce.i iVar = new ce.i();
                    xd.b.a(iVar);
                    wd.a aVar3 = wd.h0.f23713k;
                    aVar3.getClass();
                    ce.f fVar = new ce.f(inputStream);
                    bVar = (ce.b) aVar3.a(fVar, iVar);
                    try {
                        fVar.a(0);
                        ce.c.b(bVar);
                        h0Var = (wd.h0) bVar;
                    } catch (ce.s e10) {
                        e10.f3972a = bVar;
                        throw e10;
                    }
                }
                h0Var = null;
            } else if (i13 != i12 || i10 > i11) {
                h0Var = null;
            } else {
                ce.i iVar2 = new ce.i();
                xd.b.a(iVar2);
                wd.a aVar32 = wd.h0.f23713k;
                aVar32.getClass();
                ce.f fVar2 = new ce.f(inputStream);
                bVar = (ce.b) aVar32.a(fVar2, iVar2);
                fVar2.a(0);
                ce.c.b(bVar);
                h0Var = (wd.h0) bVar;
            }
            wd.h0 h0Var2 = h0Var;
            inputStream.close();
            if (h0Var2 != null) {
                return new pe.c(cVar, lVar, yVar, h0Var2, aVarO);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar2 + ", actual " + aVarO + ". Please update Kotlin");
        } finally {
        }
    }

    public static Handler h(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return m3.e.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final tc.g l(tc.g r3, yc.c r4, boolean r5) {
        /*
            java.lang.String r0 = "descriptor"
            jc.l.e(r4, r0)
            boolean r0 = ee.g.a(r4)
            if (r0 != 0) goto La2
            java.util.List r0 = r4.z0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            jc.l.d(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L24
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L24
            goto L3f
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            bd.a0 r1 = (bd.a0) r1
            se.w r1 = r1.b()
            boolean r1 = ee.g.f(r1)
            if (r1 == 0) goto L28
            goto La2
        L3f:
            java.util.List r0 = r4.o0()
            java.lang.String r1 = "getValueParameters(...)"
            jc.l.d(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L58
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L58
            goto L7a
        L58:
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            bd.y0 r1 = (bd.y0) r1
            bd.z0 r1 = (bd.z0) r1
            se.w r1 = r1.b()
            java.lang.String r2 = "getType(...)"
            jc.l.d(r1, r2)
            boolean r1 = ee.g.f(r1)
            if (r1 == 0) goto L5c
            goto La2
        L7a:
            se.w r0 = r4.n()
            r1 = 1
            if (r0 == 0) goto L94
            se.k0 r0 = r0.t()
            yc.h r0 = r0.h()
            if (r0 == 0) goto L90
            boolean r0 = ee.g.b(r0)
            goto L91
        L90:
            r0 = 0
        L91:
            if (r0 != r1) goto L94
            goto La2
        L94:
            se.w r0 = n(r4)
            if (r0 == 0) goto La1
            boolean r0 = ee.g.f(r0)
            if (r0 != r1) goto La1
            goto La2
        La1:
            return r3
        La2:
            tc.d0 r0 = new tc.d0
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.e.l(tc.g, yc.c, boolean):tc.g");
    }

    public static final se.w n(yc.c cVar) {
        bd.a0 a0VarV0 = cVar.v0();
        bd.a0 a0VarS0 = cVar.s0();
        if (a0VarV0 != null) {
            return a0VarV0.b();
        }
        if (a0VarS0 != null) {
            if (cVar instanceof yc.j) {
                return a0VarS0.b();
            }
            yc.k kVarY = cVar.y();
            yc.e eVar = kVarY instanceof yc.e ? (yc.e) kVarY : null;
            if (eVar != null) {
                return eVar.E();
            }
        }
        return null;
    }

    public static final Method o(Class cls, yc.c cVar) {
        jc.l.e(cVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            jc.l.b(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new hc.a("No unbox method found in inline class: " + cls + " (calling " + cVar + ')');
        }
    }

    public static final pc.c p(pc.d dVar) {
        Object obj;
        if (dVar instanceof pc.c) {
            return (pc.c) dVar;
        }
        if (!(dVar instanceof pc.w)) {
            throw new hc.a("Cannot calculate JVM erasure for type: " + dVar);
        }
        z1 z1Var = ((w1) ((pc.w) dVar)).f19907b;
        pc.u uVar = w1.f19905d[0];
        Object objB = z1Var.b();
        jc.l.d(objB, "getValue(...)");
        List list = (List) objB;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            pc.d dVarC = ((pc.v) next).c();
            sc.d0 d0Var = dVarC instanceof sc.d0 ? (sc.d0) dVarC : null;
            if (d0Var != null && d0Var.s() != hd.o.f8428c && d0Var.s() != hd.o.f8431f) {
                obj = next;
                break;
            }
        }
        pc.v vVar = (pc.v) obj;
        if (vVar == null) {
            vVar = (pc.v) vb.m.a0(list);
        }
        return vVar != null ? q(vVar) : jc.z.f10839a.b(Object.class);
    }

    public static final pc.c q(pc.v vVar) {
        pc.c cVarP;
        pc.d dVarC = vVar.c();
        if (dVarC != null && (cVarP = p(dVarC)) != null) {
            return cVarP;
        }
        throw new hc.a("Cannot calculate JVM erasure for type: " + vVar);
    }

    public static final w1.f r() {
        w1.f fVar = f15465g;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Link", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0VarH = j2.h0.h(3.9f, 12.0f);
        q0VarH.n(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        q0VarH.r(4.0f);
        q0VarH.s(11.0f, 7.0f);
        q0VarH.s(7.0f, 7.0f);
        q0VarH.n(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        q0VarH.w(2.24f, 5.0f, 5.0f, 5.0f);
        q0VarH.r(4.0f);
        q0VarH.z(-1.9f);
        q0VarH.s(7.0f, 15.1f);
        q0VarH.n(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        q0VarH.l();
        q0VarH.u(8.0f, 13.0f);
        q0VarH.r(8.0f);
        q0VarH.z(-2.0f);
        j2.h0.t(q0VarH, 8.0f, 11.0f, 2.0f);
        q0VarH.u(17.0f, 7.0f);
        q0VarH.r(-4.0f);
        q0VarH.z(1.9f);
        q0VarH.r(4.0f);
        q0VarH.n(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        q0VarH.w(-1.39f, 3.1f, -3.1f, 3.1f);
        q0VarH.r(-4.0f);
        q0VarH.s(13.0f, 17.0f);
        q0VarH.r(4.0f);
        q0VarH.n(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        q0VarH.w(-2.24f, -5.0f, -5.0f, -5.0f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15465g = fVarB;
        return fVarB;
    }

    public static final ArrayList s(se.a0 a0Var) {
        ArrayList arrayListT = t(se.c.b(a0Var));
        if (arrayListT == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(vb.n.K(arrayListT, 10));
        Iterator it = arrayListT.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        yc.h hVarH = a0Var.t().h();
        jc.l.c(hVarH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsJ = f2.j((yc.e) hVarH);
        jc.l.b(clsJ);
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList t(se.a0 a0Var) {
        ?? W;
        if (!ee.g.g(a0Var)) {
            return null;
        }
        yc.h hVarH = a0Var.t().h();
        jc.l.c(hVarH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i10 = ie.d.f9520a;
        r0 r0VarJ0 = ((yc.e) hVarH).J0();
        yc.z zVar = r0VarJ0 instanceof yc.z ? (yc.z) r0VarJ0 : null;
        jc.l.b(zVar);
        ArrayList<ub.k> arrayList = zVar.f26162a;
        ArrayList arrayList2 = new ArrayList();
        for (ub.k kVar : arrayList) {
            be.e eVar = (be.e) kVar.f21543a;
            ArrayList arrayListT = t((se.a0) kVar.f21544b);
            if (arrayListT != null) {
                W = new ArrayList(vb.n.K(arrayListT, 10));
                Iterator it = arrayListT.iterator();
                while (it.hasNext()) {
                    W.add(eVar.c() + '-' + ((String) it.next()));
                }
            } else {
                W = ud.b.w(eVar.c());
            }
            vb.m.P(arrayList2, (Iterable) W);
        }
        return arrayList2;
    }

    public static final w1.f u() {
        w1.f fVar = f15466h;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.PauseCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0VarH = j2.h0.h(12.0f, 2.0f);
        q0VarH.m(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        q0VarH.w(4.48f, 10.0f, 10.0f, 10.0f);
        q0VarH.w(10.0f, -4.48f, 10.0f, -10.0f);
        q0VarH.v(17.52f, 2.0f, 12.0f, 2.0f);
        q0VarH.l();
        q0VarH.u(11.0f, 16.0f);
        q0VarH.q(9.0f);
        q0VarH.y(8.0f);
        q0VarH.r(2.0f);
        q0VarH.y(16.0f);
        q0VarH.l();
        q0VarH.u(15.0f, 16.0f);
        q0VarH.r(-2.0f);
        q0VarH.y(8.0f);
        q0VarH.r(2.0f);
        q0VarH.y(16.0f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15466h = fVarB;
        return fVarB;
    }

    public static int v(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(t0.B(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final sf.a x(pc.c cVar, ArrayList arrayList, ic.a aVar) {
        sf.a dVar;
        sf.a h1Var;
        jc.l.e(cVar, "<this>");
        jc.a0 a0Var = jc.z.f10839a;
        if (cVar.equals(a0Var.b(Collection.class)) || cVar.equals(a0Var.b(List.class)) || cVar.equals(a0Var.b(List.class)) || cVar.equals(a0Var.b(ArrayList.class))) {
            dVar = new wf.d((sf.a) arrayList.get(0), 0);
        } else if (cVar.equals(a0Var.b(HashSet.class))) {
            dVar = new wf.d((sf.a) arrayList.get(0), 1);
        } else if (cVar.equals(a0Var.b(Set.class)) || cVar.equals(a0Var.b(Set.class)) || cVar.equals(a0Var.b(LinkedHashSet.class))) {
            dVar = new wf.d((sf.a) arrayList.get(0), 2);
        } else if (cVar.equals(a0Var.b(HashMap.class))) {
            dVar = new wf.e0((sf.a) arrayList.get(0), (sf.a) arrayList.get(1), 0);
        } else if (cVar.equals(a0Var.b(Map.class)) || cVar.equals(a0Var.b(Map.class)) || cVar.equals(a0Var.b(LinkedHashMap.class))) {
            dVar = new wf.e0((sf.a) arrayList.get(0), (sf.a) arrayList.get(1), 1);
        } else {
            if (cVar.equals(a0Var.b(Map.Entry.class))) {
                sf.a aVar2 = (sf.a) arrayList.get(0);
                sf.a aVar3 = (sf.a) arrayList.get(1);
                jc.l.e(aVar2, "keySerializer");
                jc.l.e(aVar3, "valueSerializer");
                h1Var = new wf.s0(aVar2, aVar3, 0);
            } else if (cVar.equals(a0Var.b(ub.k.class))) {
                sf.a aVar4 = (sf.a) arrayList.get(0);
                sf.a aVar5 = (sf.a) arrayList.get(1);
                jc.l.e(aVar4, "keySerializer");
                jc.l.e(aVar5, "valueSerializer");
                h1Var = new wf.s0(aVar4, aVar5, 1);
            } else if (cVar.equals(a0Var.b(ub.q.class))) {
                sf.a aVar6 = (sf.a) arrayList.get(0);
                sf.a aVar7 = (sf.a) arrayList.get(1);
                sf.a aVar8 = (sf.a) arrayList.get(2);
                jc.l.e(aVar6, "aSerializer");
                jc.l.e(aVar7, "bSerializer");
                jc.l.e(aVar8, "cSerializer");
                dVar = new o1(aVar6, aVar7, aVar8);
            } else if (g8.a.D(cVar).isArray()) {
                Object objB = aVar.b();
                jc.l.c(objB, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                sf.a aVar9 = (sf.a) arrayList.get(0);
                jc.l.e(aVar9, "elementSerializer");
                h1Var = new h1((pc.c) objB, aVar9);
            } else {
                dVar = null;
            }
            dVar = h1Var;
        }
        if (dVar != null) {
            return dVar;
        }
        sf.a[] aVarArr = (sf.a[]) arrayList.toArray(new sf.a[0]);
        return z0.d(cVar, (sf.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public static final t0.j y(final boolean z10, ic.a aVar, x0.o oVar) {
        float f10 = t0.a.f20090a;
        float f11 = t0.a.f20091b;
        if (Float.compare(f10, 0) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objK = oVar.K();
        Object obj = x0.k.f24334a;
        if (objK == obj) {
            objK = x0.v.m(oVar);
            oVar.h0(objK);
        }
        hf.y yVar = (hf.y) objK;
        w0 w0VarY = x0.v.y(aVar, oVar);
        final jc.v vVar = new jc.v();
        final jc.v vVar2 = new jc.v();
        f3.c cVar = (f3.c) oVar.j(l1.f9866h);
        vVar.f10835a = cVar.Q(f10);
        vVar2.f10835a = cVar.Q(f11);
        boolean zF = oVar.f(yVar);
        Object objK2 = oVar.K();
        if (zF || objK2 == obj) {
            objK2 = new t0.j(yVar, w0VarY, vVar2.f10835a, vVar.f10835a);
            oVar.h0(objK2);
        }
        final t0.j jVar = (t0.j) objK2;
        boolean zH = oVar.h(jVar) | oVar.g(z10) | oVar.c(vVar.f10835a) | oVar.c(vVar2.f10835a);
        Object objK3 = oVar.K();
        if (zH || objK3 == obj) {
            objK3 = new ic.a() { // from class: t0.k
                @Override // ic.a
                public final Object b() {
                    j jVar2 = jVar;
                    boolean zB = jVar2.b();
                    y yVar2 = jVar2.f20123a;
                    a1 a1Var = jVar2.f20130h;
                    yb.c cVar2 = null;
                    boolean z11 = z10;
                    if (zB != z11) {
                        jVar2.f20126d.setValue(Boolean.valueOf(z11));
                        jVar2.f20128f.f(0.0f);
                        a0.y(yVar2, null, null, new m(jVar2, z11 ? a1Var.e() : 0.0f, cVar2, 3), 3);
                    }
                    jVar2.f20129g.f(vVar.f10835a);
                    float f12 = vVar2.f10835a;
                    if (a1Var.e() != f12) {
                        a1Var.f(f12);
                        if (jVar2.b()) {
                            a0.y(yVar2, null, null, new m(jVar2, f12, cVar2, 3), 3);
                        }
                    }
                    return ub.a0.f21526a;
                }
            };
            oVar.h0(objK3);
        }
        x0.v.h((ic.a) objK3, oVar);
        return jVar;
    }

    public static final od.c z(b0.w1 w1Var, sd.b bVar) {
        jc.l.e(w1Var, "<this>");
        jc.l.e(bVar, "annotationsOwner");
        return new od.c(w1Var, bVar, false);
    }

    public abstract String d();

    public abstract void e(z7.c cVar, Object obj);

    public abstract Typeface i(Context context, s3.f[] fVarArr);

    public Typeface j(Context context, InputStream inputStream) {
        File file;
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            file = null;
        } else {
            String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
            for (int i10 = 0; i10 < 100; i10++) {
                file = new File(cacheDir, str + i10);
                if (file.createNewFile()) {
                    break;
                }
            }
            file = null;
        }
        if (file == null) {
            return null;
        }
        try {
            if (x0.i(file, inputStream)) {
                return Typeface.createFromFile(file.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            file.delete();
        }
    }

    public abstract String k();

    public s3.f m(s3.f[] fVarArr) {
        s3.f fVar = null;
        int i10 = Integer.MAX_VALUE;
        for (s3.f fVar2 : fVarArr) {
            int iAbs = (fVar2.f19378d ? 1 : 0) + (Math.abs(fVar2.f19377c - 400) * 2);
            if (fVar == null || i10 > iAbs) {
                fVar = fVar2;
                i10 = iAbs;
            }
        }
        return fVar;
    }

    public void w(z7.a aVar, Object obj) {
        jc.l.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        z7.c cVarD0 = aVar.d0(k());
        try {
            e(cVarD0, obj);
            cVarD0.Z();
            gh.g.m(cVarD0, null);
        } finally {
        }
    }
}
