package n7;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import b0.w1;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import q1.n0;
import sc.f2;
import sc.v1;
import se.x0;
import u.e1;
import wf.z0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w1.f f15439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w1.f f15440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static w1.f f15441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w1.f f15442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w1.f f15443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static w1.f f15444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static w1.f f15445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static w1.f f15446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static w1.f f15447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static w1.f f15448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static w1.f f15449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static w1.f f15450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static w1.f f15451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static w1.f f15452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static w1.f f15453o;

    public static String A(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + e.I(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + e.I(Float.intBitsToFloat(i10)) + ", " + e.I(Float.intBitsToFloat(i11)) + ')';
    }

    public static final Bundle c(ub.k... kVarArr) {
        Bundle bundle = new Bundle(kVarArr.length);
        for (ub.k kVar : kVarArr) {
            String str = (String) kVar.f21543a;
            Object obj = kVar.f21544b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                jc.l.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static boolean d(p3.d[] dVarArr, p3.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            p3.d dVar = dVarArr[i10];
            char c3 = dVar.f16530a;
            p3.d dVar2 = dVarArr2[i10];
            if (c3 != dVar2.f16530a || dVar.f16531b.length != dVar2.f16531b.length) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j10, e1 e1Var) {
        if (e1Var == e1.f20882a) {
            if (f3.a.g(j10) != Integer.MAX_VALUE) {
                return;
            }
            x.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (f3.a.h(j10) != Integer.MAX_VALUE) {
                return;
            }
            x.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static w1 f(w1 w1Var, yc.g gVar, ed.o oVar, int i10) {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        jc.l.e(w1Var, "<this>");
        return new w1((od.a) w1Var.f1395c, oVar != null ? new h7.k(w1Var, gVar, oVar, 0) : (od.e) w1Var.f1396d, ub.a.c(ub.i.f21541b, new bd.i(6, w1Var, gVar, false)));
    }

    public static byte[] g(char[] cArr, boolean z10) {
        int i10 = 0;
        if (!z10) {
            byte[] bArr = new byte[cArr.length];
            while (i10 < cArr.length) {
                bArr[i10] = (byte) cArr[i10];
                i10++;
            }
            return bArr;
        }
        try {
            ByteBuffer byteBufferEncode = tg.b.f20754a.encode(CharBuffer.wrap(cArr));
            byte[] bArr2 = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr2);
            return bArr2;
        } catch (Exception unused) {
            byte[] bArr3 = new byte[cArr.length];
            while (i10 < cArr.length) {
                bArr3[i10] = (byte) cArr[i10];
                i10++;
            }
            return bArr3;
        }
    }

    public static float[] h(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final w1 i(w1 w1Var, zc.h hVar) {
        jc.l.e(w1Var, "<this>");
        jc.l.e(hVar, "additionalAnnotations");
        if (hVar.isEmpty()) {
            return w1Var;
        }
        return new w1((od.a) w1Var.f1395c, (od.e) w1Var.f1396d, ub.a.c(ub.i.f21541b, new bd.i(7, w1Var, hVar, false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:44:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p3.d[] j(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.d.j(java.lang.String):p3.d[]");
    }

    public static final v1 l(pc.d dVar, List list, boolean z10, List list2) {
        yc.h hVarA;
        se.h0 h0Var;
        se.f0 f0Var;
        jc.l.e(dVar, "<this>");
        jc.l.e(list, "arguments");
        jc.l.e(list2, "annotations");
        sc.e0 e0Var = dVar instanceof sc.e0 ? (sc.e0) dVar : null;
        if (e0Var == null || (hVarA = e0Var.a()) == null) {
            throw new hc.a("Cannot create type for an unsupported classifier: " + dVar + " (" + dVar.getClass() + ')');
        }
        se.k0 k0VarQ = hVarA.Q();
        jc.l.d(k0VarQ, "getTypeConstructor(...)");
        List listO = k0VarQ.o();
        jc.l.d(listO, "getParameters(...)");
        if (listO.size() != list.size()) {
            throw new IllegalArgumentException("Class declares " + listO.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            se.h0.f19950b.getClass();
            h0Var = se.h0.f19951c;
        } else {
            se.h0.f19950b.getClass();
            h0Var = se.h0.f19951c;
        }
        List listO2 = k0VarQ.o();
        jc.l.d(listO2, "getParameters(...)");
        List list3 = list;
        ArrayList arrayList = new ArrayList(vb.n.K(list3, 10));
        int i10 = 0;
        for (Object obj : list3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            pc.y yVar = (pc.y) obj;
            v1 v1Var = (v1) yVar.f16983b;
            se.w wVar = v1Var != null ? v1Var.f19892a : null;
            pc.z zVar = yVar.f16982a;
            int i12 = zVar == null ? -1 : qc.b.f18137a[zVar.ordinal()];
            if (i12 == -1) {
                Object obj2 = listO2.get(i10);
                jc.l.d(obj2, "get(...)");
                f0Var = new se.f0((q0) obj2);
            } else if (i12 == 1) {
                jc.l.b(wVar);
                f0Var = new se.f0(wVar, x0.INVARIANT);
            } else if (i12 == 2) {
                jc.l.b(wVar);
                f0Var = new se.f0(wVar, x0.IN_VARIANCE);
            } else {
                if (i12 != 3) {
                    throw new ce.j0();
                }
                jc.l.b(wVar);
                f0Var = new se.f0(wVar, x0.OUT_VARIANCE);
            }
            arrayList.add(f0Var);
            i10 = i11;
        }
        return new v1(se.c.v(arrayList, h0Var, k0VarQ, z10), null);
    }

    public static p3.d[] m(p3.d[] dVarArr) {
        p3.d[] dVarArr2 = new p3.d[dVarArr.length];
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10] = new p3.d(dVarArr[i10]);
        }
        return dVarArr2;
    }

    public static final boolean n(long j10, long j11) {
        return j10 == j11;
    }

    public static final sf.a o(wf.b bVar, vf.a aVar, String str) {
        jc.l.e(bVar, "<this>");
        sf.a aVarE = bVar.e(aVar, str);
        if (aVarE != null) {
            return aVarE;
        }
        z0.j(str, bVar.g());
        throw null;
    }

    public static final sf.a p(wf.b bVar, yf.t tVar, Object obj) {
        jc.l.e(bVar, "<this>");
        jc.l.e(obj, "value");
        sf.a aVarF = bVar.f(tVar, obj);
        if (aVarF != null) {
            return aVarF;
        }
        pc.c cVarB = jc.z.f10839a.b(obj.getClass());
        pc.c cVarG = bVar.g();
        jc.l.e(cVarG, "baseClass");
        String strY = cVarB.y();
        if (strY == null) {
            strY = String.valueOf(cVarB);
        }
        z0.j(strY, cVarG);
        throw null;
    }

    public static final int q(tc.g gVar) {
        jc.l.e(gVar, "<this>");
        return gVar.a().size();
    }

    public static int r(rg.b bVar) throws og.a {
        int i10 = bVar.f19038p;
        if (i10 != 3) {
            return i10;
        }
        rg.a aVar = bVar.B;
        if (aVar != null) {
            return aVar.f19036q;
        }
        throw new og.a("AesExtraDataRecord not present in local header for aes encrypted data");
    }

    public static final w1.f s() {
        w1.f fVar = f15451m;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.ThumbUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        hd.q0 q0Var = new hd.q0((byte) 0, 6);
        q0Var.u(1.0f, 21.0f);
        q0Var.r(4.0f);
        q0Var.s(5.0f, 9.0f);
        j2.h0.t(q0Var, 1.0f, 9.0f, 12.0f);
        q0Var.u(23.0f, 10.0f);
        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q0Var.r(-6.31f);
        q0Var.t(0.95f, -4.57f);
        q0Var.t(0.03f, -0.32f);
        q0Var.n(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        q0Var.s(14.17f, 1.0f);
        q0Var.s(7.59f, 7.59f);
        q0Var.m(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        q0Var.z(10.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(9.0f);
        q0Var.n(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        q0Var.t(3.02f, -7.05f);
        q0Var.n(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        q0Var.z(-2.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15451m = fVarB;
        return fVarB;
    }

    public static final w1.f t() {
        w1.f fVar = f15452n;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        hd.q0 q0VarH = j2.h0.h(12.0f, 7.0f);
        q0VarH.n(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        q0VarH.n(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f);
        q0VarH.t(2.92f, 2.92f);
        q0VarH.n(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f);
        q0VarH.n(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        q0VarH.n(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f);
        q0VarH.t(2.16f, 2.16f);
        q0VarH.m(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f);
        q0VarH.l();
        q0VarH.u(2.0f, 4.27f);
        q0VarH.t(2.28f, 2.28f);
        q0VarH.t(0.46f, 0.46f);
        q0VarH.m(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f);
        q0VarH.n(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        q0VarH.n(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f);
        q0VarH.t(0.42f, 0.42f);
        q0VarH.s(19.73f, 22.0f);
        q0VarH.s(21.0f, 20.73f);
        q0VarH.s(3.27f, 3.0f);
        q0VarH.s(2.0f, 4.27f);
        q0VarH.l();
        q0VarH.u(7.53f, 9.8f);
        q0VarH.t(1.55f, 1.55f);
        q0VarH.n(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        q0VarH.n(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        q0VarH.n(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        q0VarH.t(1.55f, 1.55f);
        q0VarH.n(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f);
        q0VarH.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        q0VarH.n(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f);
        q0VarH.l();
        q0VarH.u(11.84f, 9.02f);
        q0VarH.t(3.15f, 3.15f);
        q0VarH.t(0.02f, -0.16f);
        q0VarH.n(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        q0VarH.t(-0.17f, 0.01f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f15452n = fVarB;
        return fVarB;
    }

    public static final boolean v(pc.b bVar) {
        tc.g gVarI;
        tc.g gVarM;
        if (bVar instanceof pc.l) {
            pc.u uVar = (pc.u) bVar;
            Field fieldO = u3.x0.o(uVar);
            if (!(fieldO != null ? fieldO.isAccessible() : true)) {
                return false;
            }
            Method methodP = u3.x0.p(uVar.d());
            if (!(methodP != null ? methodP.isAccessible() : true)) {
                return false;
            }
            Method methodP2 = u3.x0.p(((pc.l) bVar).e());
            if (!(methodP2 != null ? methodP2.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof pc.u) {
            pc.u uVar2 = (pc.u) bVar;
            Field fieldO2 = u3.x0.o(uVar2);
            if (!(fieldO2 != null ? fieldO2.isAccessible() : true)) {
                return false;
            }
            Method methodP3 = u3.x0.p(uVar2.d());
            if (!(methodP3 != null ? methodP3.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof pc.p) {
            Field fieldO3 = u3.x0.o(((pc.p) bVar).f());
            if (!(fieldO3 != null ? fieldO3.isAccessible() : true)) {
                return false;
            }
            Method methodP4 = u3.x0.p((pc.f) bVar);
            if (!(methodP4 != null ? methodP4.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof pc.g) {
            Field fieldO4 = u3.x0.o(((pc.g) bVar).f());
            if (!(fieldO4 != null ? fieldO4.isAccessible() : true)) {
                return false;
            }
            Method methodP5 = u3.x0.p((pc.f) bVar);
            if (!(methodP5 != null ? methodP5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(bVar instanceof pc.f)) {
                throw new UnsupportedOperationException("Unknown callable: " + bVar + " (" + bVar.getClass() + ')');
            }
            pc.f fVar = (pc.f) bVar;
            Method methodP6 = u3.x0.p(fVar);
            if (!(methodP6 != null ? methodP6.isAccessible() : true)) {
                return false;
            }
            sc.u uVarA = f2.a(bVar);
            Object objB = (uVarA == null || (gVarM = uVarA.m()) == null) ? null : gVarM.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            sc.u uVarA2 = f2.a(fVar);
            Member memberB = (uVarA2 == null || (gVarI = uVarA2.i()) == null) ? null : gVarI.b();
            Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static j1.q w(j1.q qVar, t0.j jVar) {
        return androidx.compose.ui.input.nestedscroll.a.a(qVar, new t0.h(new de.h(1, jVar, t0.j.class, "onPull", "onPull$material(F)F", 0, 0, 8), new f1.e(2, jVar, t0.j.class, "onRelease", "onRelease$material(F)F", 4, 1)), null);
    }

    public static int x(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = inputStream.read(bArr);
        if (i10 == -1) {
            throw new IOException("Unexpected EOF reached when trying to read stream");
        }
        if (i10 == bArr.length) {
            return i10;
        }
        if (i10 < 0) {
            throw new IOException("Invalid readLength");
        }
        int i11 = 0;
        if (i10 != 0) {
            int length = bArr.length - i10;
            for (int i12 = 1; i10 < bArr.length && i11 != -1 && i12 < 15; i12++) {
                i11 = inputStream.read(bArr, i10, length);
                if (i11 > 0) {
                    i10 += i11;
                    length -= i11;
                }
            }
            i11 = i10;
        }
        if (i11 == bArr.length) {
            return i11;
        }
        throw new IOException("Cannot read fully into byte buffer");
    }

    public static int y(InputStream inputStream, byte[] bArr, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative offset");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 + i11 > bArr.length) {
            throw new IllegalArgumentException("Length greater than buffer size");
        }
        while (true) {
            if (i12 == i11) {
                break;
            }
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    public static void z(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            m2.c.e(window, z10);
        } else {
            if (i10 >= 30) {
                m2.c.d(window, z10);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public abstract String a();

    public abstract void b(z7.c cVar, Object obj);

    public abstract String k();

    public void u(z7.a aVar, Object obj) {
        jc.l.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        z7.c cVarD0 = aVar.d0(k());
        try {
            b(cVarD0, obj);
            cVarD0.Z();
            gh.g.m(cVarD0, null);
            cVarD0 = aVar.d0("SELECT changes()");
            try {
                cVarD0.Z();
                cVarD0.getLong(0);
                gh.g.m(cVarD0, null);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
