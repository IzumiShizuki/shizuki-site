package nh;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.cnl.kikoeru.R;
import g2.n1;
import hd.q0;
import i2.g1;
import ic.n;
import j1.q;
import j2.h0;
import j2.l1;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import jc.l;
import oc.d;
import p2.g;
import p2.h;
import pc.m;
import q.t0;
import q1.n0;
import q2.i;
import q2.j;
import q2.k;
import q2.o;
import q2.r;
import q2.t;
import r.v1;
import r.w1;
import sc.a1;
import ta.c;
import u3.s;
import u3.x0;
import ub.p;
import w1.f;
import w1.g0;
import x0.n2;
import x0.p1;
import x0.r0;
import x0.v;
import yc.k0;
import z0.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f15894a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f15895b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f15896c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f15897d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f15898e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f15899f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f15900g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static f f15901h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static f f15902i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static f f15903j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static f f15904k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static f f15905l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static f f15906m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static f f15907n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f f15908o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f15909p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Method f15910q;

    public static final boolean A(k0 k0Var) {
        l.e(k0Var, "<this>");
        return k0Var.d() == null;
    }

    public static long B(long j10) {
        short s10 = (short) (j10 & 65535);
        short s11 = (short) ((j10 >>> 16) & 65535);
        short s12 = (short) (s10 + s11);
        short s13 = (short) (s11 ^ s10);
        return ((((long) ((short) ((s13 >>> 22) | (s13 << 10)))) | (((long) ((short) (((short) ((s12 >>> 23) | (s12 << 9))) + s10))) << 16)) << 16) | ((long) ((short) (((short) (((short) ((s10 << 13) | (s10 >>> 19))) ^ s13)) ^ (s13 << 5))));
    }

    public static final long C(c cVar, long j10) {
        l.e(cVar, "color");
        float f10 = (cVar.f20597a / 180.0f) * 3.1415927f;
        float f11 = cVar.f20598b;
        double d10 = f10;
        float f12 = 1;
        return x0.b((((((float) Math.cos(d10)) * f11) + f12) / 2.0f) * ((int) (j10 >> 32)), (((f11 * ((float) Math.sin(d10))) + f12) / 2.0f) * ((int) (j10 & 4294967295L)));
    }

    public static oc.b D(d dVar, int i10) {
        l.e(dVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i11 = dVar.f16307a;
        int i12 = dVar.f16308b;
        if (dVar.f16309c <= 0) {
            i10 = -i10;
        }
        return new oc.b(i11, i12, i10);
    }

    public static d E(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new d(i10, i11 - 1, 1);
        }
        d dVar = d.f16314d;
        return d.f16314d;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [ic.a, jc.m] */
    public static final void F(o oVar, int i10, g gVar) {
        o oVar2;
        e eVar = new e(new o[16]);
        List listI = oVar.i(false, false);
        while (true) {
            eVar.c(eVar.f26374c, listI);
            while (true) {
                int i11 = eVar.f26374c;
                if (i11 == 0) {
                    return;
                }
                oVar2 = (o) eVar.k(i11 - 1);
                boolean zE = r.e(oVar2);
                k kVar = oVar2.f17639d;
                o.k0 k0Var = kVar.f17630a;
                if (!zE && !k0Var.c(t.f17678i)) {
                    g1 g1VarD = oVar2.d();
                    if (g1VarD == null) {
                        throw h0.g("Expected semantics node to have a coordinator.");
                    }
                    f3.k kVarX = g8.a.X(n1.g(g1VarD));
                    if (kVarX.f6662a < kVarX.f6664c && kVarX.f6663b < kVarX.f6665d) {
                        Object objG = kVar.f17630a.g(j.f17608e);
                        if (objG == null) {
                            objG = null;
                        }
                        n nVar = (n) objG;
                        Object objG2 = k0Var.g(t.f17690u);
                        i iVar = (i) (objG2 != null ? objG2 : null);
                        if (nVar == null || iVar == null || ((Number) iVar.f17603b.b()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i12 = i10 + 1;
                        gVar.a(new h(oVar2, i12, kVarX, g1VarD));
                        F(oVar2, i12, gVar);
                    }
                }
            }
            listI = oVar2.i(false, false);
        }
    }

    public static final void a(int i10, ic.k kVar, q qVar, x0.o oVar) {
        int i11;
        oVar.Y(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(kVar) ? 32 : 16;
        }
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            y.d.d(androidx.compose.ui.draw.a.a(qVar, kVar), oVar);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new i3.l(qVar, kVar, i10);
        }
    }

    public static final void b(int i10, c cVar, boolean z10, boolean z11, x0.o oVar, int i11) {
        r0 r0Var;
        long j10;
        float f10;
        l.e(cVar, "hsvColor");
        oVar.Y(1387272416);
        int i12 = (i11 & 14) == 0 ? (oVar.d(i10) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= oVar.f(cVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= oVar.g(z10) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= oVar.g(z11) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= oVar.f(ua.b.f21491a) ? 16384 : 8192;
        }
        int i13 = i12;
        if ((i13 & 46811) == 9362 && oVar.z()) {
            oVar.Q();
        } else {
            long jC = gh.g.c(i10, i10);
            f3.l lVar = new f3.l(jC);
            oVar.X(511388516);
            boolean zF = oVar.f(lVar) | oVar.f(cVar);
            Object objK = oVar.K();
            r0 r0Var2 = x0.k.f24334a;
            if (zF || objK == r0Var2) {
                p1.b bVar = new p1.b(C(cVar, jC));
                oVar.h0(bVar);
                objK = bVar;
            }
            oVar.p(false);
            long j11 = ((p1.b) objK).f16481a;
            oVar.X(-492369756);
            Object objK2 = oVar.K();
            if (objK2 == r0Var2) {
                p1.b bVar2 = new p1.b(j11);
                v1 v1Var = w1.f18620a;
                objK2 = new r.c(bVar2);
                oVar.h0(objK2);
            }
            oVar.p(false);
            r.c cVar2 = (r.c) objK2;
            v.g(cVar, new f3.l(jC), Boolean.valueOf(z10), new ua.e(z10, cVar2, cVar, jC, null, 0), oVar);
            float fI = ((f3.c) oVar.j(l1.f9866h)).I(i10);
            long j12 = jC;
            n2 n2VarC = r.e.c(new f3.f((!z11 ? 0.18f : 0.15f) * fI), w1.f18622c, r.e.f18374b, null, null, oVar, 0, 24);
            oVar.X(1866160092);
            float f11 = cVar.f20599c;
            float f12 = (f11 - 0.1f) % 1.0f;
            if (f12 != 0.0f && Math.signum(f12) != Math.signum(1.0f)) {
                f12 += 1.0f;
            }
            if (f12 < 0.2f) {
                f12 = 0.2f;
            }
            c cVarA = c.a(cVar, 0.0f, 0.0f, f12, 11);
            float f13 = (f11 + 0.55f) % 1.0f;
            if (f13 != 0.0f && Math.signum(f13) != Math.signum(1.0f)) {
                f13 += 1.0f;
            }
            c cVarA2 = c.a(cVar, 0.0f, 0.0f, f13 < 0.55f ? 0.55f : f13, 11);
            float f14 = (f11 + 0.3f) % 1.0f;
            if (f14 != 0.0f && Math.signum(f14) != Math.signum(1.0f)) {
                f14 += 1.0f;
            }
            c cVarA3 = c.a(cVar, 0.0f, 0.0f, f14 < 0.3f ? 0.3f : f14, 11);
            float f15 = (f11 + 0.05f) % 1.0f;
            if (f15 != 0.0f && Math.signum(f15) != Math.signum(1.0f)) {
                f15 += 1.0f;
            }
            if (f15 < 0.2f) {
                f15 = 0.2f;
            }
            boolean z12 = false;
            for (c cVar3 : ud.b.x(cVarA, cVarA2, cVarA3, c.a(cVar, 0.0f, 0.0f, f15, 11))) {
                oVar.X(-492369756);
                Object objK3 = oVar.K();
                if (objK3 == r0Var2) {
                    r0Var = r0Var2;
                    j10 = j12;
                    f10 = 0.1f;
                    p1.b bVar3 = new p1.b(C(cVar3, j10));
                    v1 v1Var2 = w1.f18620a;
                    objK3 = new r.c(bVar3);
                    oVar.h0(objK3);
                    z12 = false;
                } else {
                    r0Var = r0Var2;
                    j10 = j12;
                    f10 = 0.1f;
                }
                oVar.p(z12);
                r.c cVar4 = (r.c) objK3;
                long j13 = j10;
                v.g(cVar3, new f3.l(j10), Boolean.valueOf(z10), new ua.e(z10, cVar4, cVar3, j13, null, 1), oVar);
                ua.l.F(((p1.b) cVar4.e()).f16481a, cVar3, fI * f10, oVar, 0);
                r0Var2 = r0Var;
                j12 = j13;
                z12 = false;
            }
            oVar.p(z12);
            ua.l.F(((p1.b) cVar2.e()).f16481a, cVar, ((f3.f) n2VarC.getValue()).f6657a, oVar, i13 & 112);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR == null) {
            return;
        }
        p1VarR.f24421d = new ua.f(i10, cVar, z10, z11, i11);
    }

    public static final sa.q c(qa.b bVar) {
        l.e(bVar, "whitePoint");
        return bVar.equals(qa.a.f18134b) ? sa.r.f19737a : bVar.equals(qa.a.f18133a) ? sa.r.f19738b : new sa.q(bVar);
    }

    public static final int d(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    public static final String e(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        l.d(parameterTypes, "getParameterTypes(...)");
        sb.append(vb.l.D0(parameterTypes, "", "(", ")", sc.c.f19776o, 24));
        Class<?> returnType = method.getReturnType();
        l.d(returnType, "getReturnType(...)");
        sb.append(ed.d.b(returnType));
        return sb.toString();
    }

    public static final boolean f(long j10) {
        return !f3.j.b(j10, 9223372034707292159L);
    }

    public static final void g(t.l lVar) {
        lVar.f20087a.setValue(t.i.f20085a);
    }

    public static float h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static double i(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float j(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int k(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long l(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static Comparable m(Float f10, oc.a aVar) {
        l.e(aVar, "range");
        float f11 = aVar.f16306b;
        float f12 = aVar.f16305a;
        if (f12 <= f11) {
            return (!oc.a.a(f10, Float.valueOf(f12)) || oc.a.a(Float.valueOf(f12), f10)) ? (!oc.a.a(Float.valueOf(f11), f10) || oc.a.a(f10, Float.valueOf(f11))) ? f10 : Float.valueOf(f11) : Float.valueOf(f12);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    public static final Object n(Class cls, Map map, List list) {
        l.e(cls, "annotationClass");
        l.e(list, "methods");
        p pVarD = ub.a.d(new bd.e(27, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new tc.d(cls, map, ub.a.d(new bd.i(17, cls, map, false)), pVarD, list));
        l.c(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static qg.h o(rg.j jVar) {
        if (jVar.f19068f.getName().endsWith(".zip.001")) {
            File file = jVar.f19068f;
            qg.f fVar = new qg.f();
            fVar.f18279a = new qg.g(file, a.k(file));
            return fVar;
        }
        File file2 = jVar.f19068f;
        boolean z10 = jVar.f19067e;
        int i10 = jVar.f19064b.f19049o;
        qg.l lVar = new qg.l();
        lVar.f18303e = 0;
        lVar.f18304f = new byte[1];
        lVar.f18299a = new RandomAccessFile(file2, "r");
        lVar.f18300b = file2;
        lVar.f18302d = z10;
        lVar.f18301c = i10;
        if (z10) {
            lVar.f18303e = i10;
        }
        return lVar;
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = s.f21328a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = u3.r.f21324d;
        u3.r rVar = (u3.r) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (rVar == null) {
            rVar = new u3.r();
            rVar.f21325a = null;
            rVar.f21326b = null;
            rVar.f21327c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        WeakReference weakReference2 = rVar.f21327c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        rVar.f21327c = new WeakReference(keyEvent);
        if (rVar.f21326b == null) {
            rVar.f21326b = new SparseArray();
        }
        SparseArray sparseArray = rVar.f21326b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw t0.A(size, arrayList);
    }

    public static final float[] q(float f10, float f11, float f12, float[] fArr) {
        return new float[]{t0.w(fArr, 2, 0, f12, t0.w(fArr, 1, 0, f11, a.i(0, 0, fArr) * f10)), t0.w(fArr, 2, 1, f12, t0.w(fArr, 1, 1, f11, a.i(0, 1, fArr) * f10)), t0.w(fArr, 2, 2, f12, t0.w(fArr, 1, 2, f11, a.i(0, 2, fArr) * f10))};
    }

    public static final float[] r(float f10, float f11, float f12, float[] fArr) {
        l.e(fArr, "$this$dotDiagonal");
        return new float[]{a.i(0, 0, fArr) * f10, a.i(1, 0, fArr) * f11, a.i(2, 0, fArr) * f12, a.i(0, 1, fArr) * f10, a.i(1, 1, fArr) * f11, a.i(2, 1, fArr) * f12, a.i(0, 2, fArr) * f10, a.i(1, 2, fArr) * f11, a.i(2, 2, fArr) * f12};
    }

    public static final float s(int i10, int i11, float[] fArr, float[] fArr2) {
        return t0.w(fArr2, i10, 2, a.i(2, i11, fArr), t0.w(fArr2, i10, 1, a.i(1, i11, fArr), a.i(i10, 0, fArr2) * a.i(0, i11, fArr)));
    }

    public static final f t() {
        f fVar = f15894a;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(19.0f, 13.0f);
        q0Var.r(-6.0f);
        q0Var.z(6.0f);
        q0Var.r(-2.0f);
        q0Var.z(-6.0f);
        q0Var.q(5.0f);
        q0Var.z(-2.0f);
        q0Var.r(6.0f);
        q0Var.y(5.0f);
        q0Var.r(2.0f);
        q0Var.z(6.0f);
        q0Var.r(6.0f);
        q0Var.z(2.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15894a = fVarB;
        return fVarB;
    }

    public static final f u() {
        f fVar = f15895b;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.ClearAll", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(5.0f, 13.0f);
        q0Var.r(14.0f);
        q0Var.z(-2.0f);
        h0.t(q0Var, 5.0f, 11.0f, 2.0f);
        q0Var.u(3.0f, 17.0f);
        q0Var.r(14.0f);
        q0Var.z(-2.0f);
        h0.t(q0Var, 3.0f, 15.0f, 2.0f);
        q0Var.u(7.0f, 7.0f);
        q0Var.z(2.0f);
        q0Var.r(14.0f);
        q0Var.s(21.0f, 7.0f);
        q0Var.s(7.0f, 7.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15895b = fVarB;
        return fVarB;
    }

    public static final f v() {
        f fVar = f15896c;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0VarH = h0.h(6.0f, 19.0f);
        q0VarH.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0VarH.r(8.0f);
        q0VarH.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0VarH.y(7.0f);
        q0VarH.q(6.0f);
        q0VarH.z(12.0f);
        q0VarH.l();
        q0VarH.u(19.0f, 4.0f);
        q0VarH.r(-3.5f);
        q0VarH.t(-1.0f, -1.0f);
        q0VarH.r(-5.0f);
        q0VarH.t(-1.0f, 1.0f);
        q0VarH.q(5.0f);
        q0VarH.z(2.0f);
        q0VarH.r(14.0f);
        q0VarH.y(4.0f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15896c = fVarB;
        return fVarB;
    }

    public static final f w() {
        f fVar = f15898e;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.FolderSpecial", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(20.0f, 6.0f);
        q0Var.r(-8.0f);
        q0Var.t(-2.0f, -2.0f);
        q0Var.s(4.0f, 4.0f);
        q0Var.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q0Var.z(12.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(16.0f);
        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0Var.s(22.0f, 8.0f);
        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q0Var.l();
        q0Var.u(17.94f, 17.0f);
        q0Var.s(15.0f, 15.28f);
        q0Var.s(12.06f, 17.0f);
        q0Var.t(0.78f, -3.33f);
        q0Var.t(-2.59f, -2.24f);
        q0Var.t(3.41f, -0.29f);
        q0Var.s(15.0f, 8.0f);
        q0Var.t(1.34f, 3.14f);
        q0Var.t(3.41f, 0.29f);
        q0Var.t(-2.59f, 2.24f);
        q0Var.t(0.78f, 3.33f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15898e = fVarB;
        return fVarB;
    }

    public static final f x() {
        f fVar = f15903j;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Replay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(12.0f, 5.0f);
        q0Var.y(1.0f);
        q0Var.s(7.0f, 6.0f);
        q0Var.t(5.0f, 5.0f);
        q0Var.y(7.0f);
        q0Var.n(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        q0Var.w(-2.69f, 6.0f, -6.0f, 6.0f);
        q0Var.w(-6.0f, -2.69f, -6.0f, -6.0f);
        q0Var.q(4.0f);
        q0Var.n(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        q0Var.w(8.0f, -3.58f, 8.0f, -8.0f);
        q0Var.w(-3.58f, -8.0f, -8.0f, -8.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15903j = fVarB;
        return fVarB;
    }

    public static final ArrayList y(pc.f fVar) {
        List listO = fVar.o();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((a1) ((pc.n) obj)).f19757c == m.f16978d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static float[] z(float[] fArr) {
        double dI = a.i(0, 0, fArr);
        double dI2 = a.i(1, 0, fArr);
        double dI3 = a.i(2, 0, fArr);
        double dI4 = a.i(0, 1, fArr);
        double dI5 = a.i(1, 1, fArr);
        double dI6 = a.i(2, 1, fArr);
        double dI7 = a.i(0, 2, fArr);
        double dI8 = a.i(1, 2, fArr);
        double dI9 = a.i(2, 2, fArr);
        double d10 = (dI5 * dI9) - (dI8 * dI6);
        double d11 = (dI8 * dI3) - (dI2 * dI9);
        double d12 = (dI2 * dI6) - (dI5 * dI3);
        double d13 = (dI7 * d12) + (dI4 * d11) + (dI * d10);
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        l.d(fArrCopyOf, "copyOf(this, size)");
        fArrCopyOf[0] = (float) (d10 / d13);
        fArrCopyOf[3] = (float) (((dI7 * dI6) - (dI4 * dI9)) / d13);
        fArrCopyOf[6] = (float) (((dI4 * dI8) - (dI7 * dI5)) / d13);
        fArrCopyOf[1] = (float) (d11 / d13);
        fArrCopyOf[4] = (float) (((dI * dI9) - (dI7 * dI3)) / d13);
        fArrCopyOf[7] = (float) (((dI7 * dI2) - (dI8 * dI)) / d13);
        fArrCopyOf[2] = (float) (d12 / d13);
        fArrCopyOf[5] = (float) (((dI4 * dI3) - (dI * dI6)) / d13);
        fArrCopyOf[8] = (float) (((dI * dI5) - (dI4 * dI2)) / d13);
        return fArrCopyOf;
    }
}
