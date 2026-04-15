package j2;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f9858a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean A(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
            fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
            fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
            fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
            float f40 = -f14;
            fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
            fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
            float f41 = -f22;
            fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
            fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
            fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
            fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
            fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
            fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
            fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
            fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
            fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
            fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        }
        return !(f38 == 0.0f);
    }

    public static final boolean B(q1.h0 h0Var, float f10, float f11) {
        if (h0Var instanceof q1.c0) {
            p1.c cVar = ((q1.c0) h0Var).f17495e;
            return cVar.f16483a <= f10 && f10 < cVar.f16485c && cVar.f16484b <= f11 && f11 < cVar.f16486d;
        }
        if (!(h0Var instanceof q1.d0)) {
            if (h0Var instanceof q1.b0) {
                return C(((q1.b0) h0Var).f17493e, f10, f11);
            }
            throw new ce.j0();
        }
        p1.d dVar = ((q1.d0) h0Var).f17497e;
        float f12 = dVar.f16487a;
        long j10 = dVar.f16492f;
        long j11 = dVar.f16494h;
        long j12 = dVar.f16493g;
        float f13 = dVar.f16490d;
        float f14 = dVar.f16488b;
        float f15 = dVar.f16489c;
        long j13 = dVar.f16491e;
        if (f10 < f12 || f10 >= f15 || f11 < f14 || f11 >= f13) {
            return false;
        }
        int i10 = (int) (j13 >> 32);
        int i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i11) + Float.intBitsToFloat(i10) <= dVar.b()) {
            int i12 = (int) (j11 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i12);
            int i13 = (int) (j12 >> 32);
            if (Float.intBitsToFloat(i13) + fIntBitsToFloat <= dVar.b()) {
                int i14 = (int) (j13 & 4294967295L);
                int i15 = (int) (j11 & 4294967295L);
                if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= dVar.a()) {
                    int i16 = (int) (j10 & 4294967295L);
                    int i17 = (int) (j12 & 4294967295L);
                    if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= dVar.a()) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) + f12;
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i14) + f14;
                        float fIntBitsToFloat4 = f15 - Float.intBitsToFloat(i11);
                        float fIntBitsToFloat5 = Float.intBitsToFloat(i16) + f14;
                        float fIntBitsToFloat6 = f15 - Float.intBitsToFloat(i13);
                        float fIntBitsToFloat7 = f13 - Float.intBitsToFloat(i17);
                        float fIntBitsToFloat8 = f13 - Float.intBitsToFloat(i15);
                        float fIntBitsToFloat9 = Float.intBitsToFloat(i12) + f12;
                        if (f10 < fIntBitsToFloat2 && f11 < fIntBitsToFloat3) {
                            return D(f10, f11, fIntBitsToFloat2, fIntBitsToFloat3, dVar.f16491e);
                        }
                        if (f10 < fIntBitsToFloat9 && f11 > fIntBitsToFloat8) {
                            return D(f10, f11, fIntBitsToFloat9, fIntBitsToFloat8, dVar.f16494h);
                        }
                        if (f10 > fIntBitsToFloat4 && f11 < fIntBitsToFloat5) {
                            return D(f10, f11, fIntBitsToFloat4, fIntBitsToFloat5, dVar.f16492f);
                        }
                        if (f10 <= fIntBitsToFloat6 || f11 <= fIntBitsToFloat7) {
                            return true;
                        }
                        return D(f10, f11, fIntBitsToFloat6, fIntBitsToFloat7, dVar.f16493g);
                    }
                }
            }
        }
        q1.h hVarA = q1.j.a();
        q.t0.f(hVarA, dVar);
        return C(hVarA, f10, f11);
    }

    public static final boolean C(q1.e0 e0Var, float f10, float f11) {
        float f12 = f10 - 0.005f;
        float f13 = f11 - 0.005f;
        float f14 = f10 + 0.005f;
        float f15 = f11 + 0.005f;
        q1.h hVarA = q1.j.a();
        if (Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15)) {
            q1.j.b("Invalid rectangle, make sure no value is NaN");
        }
        if (hVarA.f17512b == null) {
            hVarA.f17512b = new RectF();
        }
        RectF rectF = hVarA.f17512b;
        jc.l.b(rectF);
        rectF.set(f12, f13, f14, f15);
        Path path = hVarA.f17511a;
        RectF rectF2 = hVarA.f17512b;
        jc.l.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        q1.h hVarA2 = q1.j.a();
        hVarA2.c(e0Var, hVarA, 1);
        boolean zIsEmpty = hVarA2.f17511a.isEmpty();
        hVarA2.d();
        hVarA.d();
        return !zIsEmpty;
    }

    public static final boolean D(float f10, float f11, float f12, float f13, long j10) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void E(float[] fArr, float[] fArr2) {
        float fS = s(0, 0, fArr2, fArr);
        float fS2 = s(0, 1, fArr2, fArr);
        float fS3 = s(0, 2, fArr2, fArr);
        float fS4 = s(0, 3, fArr2, fArr);
        float fS5 = s(1, 0, fArr2, fArr);
        float fS6 = s(1, 1, fArr2, fArr);
        float fS7 = s(1, 2, fArr2, fArr);
        float fS8 = s(1, 3, fArr2, fArr);
        float fS9 = s(2, 0, fArr2, fArr);
        float fS10 = s(2, 1, fArr2, fArr);
        float fS11 = s(2, 2, fArr2, fArr);
        float fS12 = s(2, 3, fArr2, fArr);
        float fS13 = s(3, 0, fArr2, fArr);
        float fS14 = s(3, 1, fArr2, fArr);
        float fS15 = s(3, 2, fArr2, fArr);
        float fS16 = s(3, 3, fArr2, fArr);
        fArr[0] = fS;
        fArr[1] = fS2;
        fArr[2] = fS3;
        fArr[3] = fS4;
        fArr[4] = fS5;
        fArr[5] = fS6;
        fArr[6] = fS7;
        fArr[7] = fS8;
        fArr[8] = fS9;
        fArr[9] = fS10;
        fArr[10] = fS11;
        fArr[11] = fS12;
        fArr[12] = fS13;
        fArr[13] = fS14;
        fArr[14] = fS15;
        fArr[15] = fS16;
    }

    public static final i3.h F(y0 y0Var, int i10) {
        Object next;
        Iterator<T> it = y0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((i2.j0) ((Map.Entry) next).getKey()).f8743b == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (i3.h) entry.getValue();
        }
        return null;
    }

    public static final String G(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String H(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static void I(View view) {
        try {
            if (!b3.f9735u) {
                b3.f9735u = true;
                if (Build.VERSION.SDK_INT < 28) {
                    b3.f9733s = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    b3.f9734t = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    b3.f9733s = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    b3.f9734t = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = b3.f9733s;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = b3.f9734t;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = b3.f9734t;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = b3.f9733s;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            b3.f9736v = true;
        }
    }

    public static final boolean h(q2.o oVar) {
        q2.k kVarK = oVar.k();
        return !kVarK.f17630a.c(q2.t.f17678i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View l(android.view.View r4, android.view.View r5, int r6) {
        /*
            r0 = 1
            r1 = -1
            r2 = 0
            if (r6 == r0) goto L33
            r0 = 2
            if (r6 == r0) goto L9
            goto L39
        L9:
            int r6 = r4.getNextFocusForwardId()
            if (r6 != r1) goto L10
            goto L39
        L10:
            a0.a0 r0 = new a0.a0
            r1 = 2
            r0.<init>(r6, r1)
            r6 = r2
        L17:
            android.view.View r6 = u(r4, r0, r6)
            if (r6 != 0) goto L32
            if (r4 != r5) goto L20
            goto L32
        L20:
            android.view.ViewParent r6 = r4.getParent()
            if (r6 == 0) goto L31
            boolean r1 = r6 instanceof android.view.View
            if (r1 != 0) goto L2b
            goto L31
        L2b:
            android.view.View r6 = (android.view.View) r6
            r3 = r6
            r6 = r4
            r4 = r3
            goto L17
        L31:
            return r2
        L32:
            return r6
        L33:
            int r6 = r4.getId()
            if (r6 != r1) goto L3a
        L39:
            return r2
        L3a:
            b0.o1 r6 = new b0.o1
            r0 = 19
            r6.<init>(r0, r5, r4)
            r0 = r2
        L42:
            android.view.View r0 = u(r4, r6, r0)
            if (r0 != 0) goto L5d
            if (r4 != r5) goto L4b
            goto L5d
        L4b:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L5c
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L56
            goto L5c
        L56:
            android.view.View r0 = (android.view.View) r0
            r3 = r0
            r0 = r4
            r4 = r3
            goto L42
        L5c:
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.l0.l(android.view.View, android.view.View, int):android.view.View");
    }

    public static final boolean m(q2.o oVar, Resources resources) {
        Object objG = oVar.f17639d.f17630a.g(q2.t.f17670a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !q2.r.e(oVar) && (oVar.f17639d.f17632c || (oVar.o() && ((list != null ? (String) vb.m.a0(list) : null) != null || x(oVar) != null || w(oVar, resources) != null || v(oVar))));
    }

    public static final void n(View view, ArrayList arrayList, boolean z10) {
        boolean z11 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z11) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z12 = viewGroup.getDescendantFocusability() == 131072;
        if (z11 && z12) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                viewArr[i10] = viewGroup.getChildAt(i10);
            }
            o.g0 g0Var = u1.f10017a;
            boolean z13 = viewGroup.getLayoutDirection() == 1;
            androidx.media3.exoplayer.offline.i iVar = u1.f10022f;
            o.g0 g0Var2 = u1.f10017a;
            o.k0 k0Var = u1.f10020d;
            if (childCount >= 2) {
                int i11 = childCount - g0Var2.f15971b;
                for (int i12 = 0; i12 < i11; i12++) {
                    g0Var2.a(new Rect());
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    View view2 = viewArr[i13];
                    int i14 = u1.f10018b;
                    u1.f10018b = i14 + 1;
                    Rect rect = (Rect) g0Var2.e(i14);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    k0Var.m(view2, rect);
                }
                vb.l.K0(viewArr, u1.f10021e);
                Object objG = k0Var.g(viewArr[0]);
                jc.l.b(objG);
                int iMax = ((Rect) objG).bottom;
                u1.f10019c = z13 ? -1 : 1;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    Object objG2 = k0Var.g(viewArr[i16]);
                    jc.l.b(objG2);
                    Rect rect2 = (Rect) objG2;
                    if (rect2.top >= iMax) {
                        if (i16 - i15 > 1) {
                            vb.l.L0(viewArr, iVar, i15, i16);
                        }
                        iMax = rect2.bottom;
                        i15 = i16;
                    } else {
                        iMax = Math.max(iMax, rect2.bottom);
                    }
                }
                if (childCount - i15 > 1) {
                    vb.l.L0(viewArr, iVar, i15, childCount);
                }
                u1.f10018b = 0;
                k0Var.a();
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                n(viewArr[i17], arrayList, z10);
            }
        }
        if (z11 && !z12 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final void o(q2.o oVar, v3.d dVar) {
        q2.k kVar = oVar.f17639d;
        o.k0 k0Var = kVar.f17630a;
        Object objG = kVar.f17630a.g(q2.t.f17693x);
        if (objG == null) {
            objG = null;
        }
        q2.h hVar = (q2.h) objG;
        if (h(oVar)) {
            if (hVar != null && hVar.f17601a == 8) {
                return;
            }
            Object objG2 = k0Var.g(q2.j.f17627x);
            if (objG2 == null) {
                objG2 = null;
            }
            q2.a aVar = (q2.a) objG2;
            if (aVar != null) {
                dVar.b(new v3.c(null, R.id.accessibilityActionPageUp, aVar.f17586a, null));
            }
            Object objG3 = k0Var.g(q2.j.f17629z);
            if (objG3 == null) {
                objG3 = null;
            }
            q2.a aVar2 = (q2.a) objG3;
            if (aVar2 != null) {
                dVar.b(new v3.c(null, R.id.accessibilityActionPageDown, aVar2.f17586a, null));
            }
            Object objG4 = k0Var.g(q2.j.f17628y);
            if (objG4 == null) {
                objG4 = null;
            }
            q2.a aVar3 = (q2.a) objG4;
            if (aVar3 != null) {
                dVar.b(new v3.c(null, R.id.accessibilityActionPageLeft, aVar3.f17586a, null));
            }
            Object objG5 = k0Var.g(q2.j.A);
            if (objG5 == null) {
                objG5 = null;
            }
            q2.a aVar4 = (q2.a) objG5;
            if (aVar4 != null) {
                dVar.b(new v3.c(null, R.id.accessibilityActionPageRight, aVar4.f17586a, null));
            }
        }
    }

    public static final void p(q2.o oVar, v3.d dVar) {
        if (h(oVar)) {
            Object objG = oVar.f17639d.f17630a.g(q2.j.f17611h);
            if (objG == null) {
                objG = null;
            }
            q2.a aVar = (q2.a) objG;
            if (aVar != null) {
                dVar.b(new v3.c(null, R.id.accessibilityActionSetProgress, aVar.f17586a, null));
            }
        }
    }

    public static final boolean q(Object obj) {
        if (obj instanceof h1.p) {
            h1.p pVar = (h1.p) obj;
            if (pVar.b() == x0.r0.f24436c || pVar.b() == x0.r0.f24439f || pVar.b() == x0.r0.f24437d) {
                Object value = pVar.getValue();
                if (value == null) {
                    return true;
                }
                return q(value);
            }
        } else {
            if ((obj instanceof ub.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f9858a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int r(float f10) {
        return ((int) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10))) * (-1);
    }

    public static final float s(int i10, int i11, float[] fArr, float[] fArr2) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final s2 t(int i10, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((s2) arrayList.get(i11)).f9984a == i10) {
                return (s2) arrayList.get(i11);
            }
        }
        return null;
    }

    public static final View u(View view, ic.k kVar, View view2) {
        View viewU;
        if (((Boolean) kVar.a(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != view2 && (viewU = u(childAt, kVar, view2)) != null) {
                return viewU;
            }
        }
        return null;
    }

    public static final boolean v(q2.o oVar) {
        Object objG = oVar.f17639d.f17630a.g(q2.t.I);
        if (objG == null) {
            objG = null;
        }
        s2.a aVar = (s2.a) objG;
        o.k0 k0Var = oVar.f17639d.f17630a;
        Object objG2 = k0Var.g(q2.t.f17693x);
        if (objG2 == null) {
            objG2 = null;
        }
        q2.h hVar = (q2.h) objG2;
        boolean z10 = aVar != null;
        Object objG3 = k0Var.g(q2.t.H);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (hVar != null && hVar.f17601a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String w(q2.o oVar, Resources resources) {
        int iK;
        q2.k kVar = oVar.f17639d;
        q2.k kVar2 = oVar.f17639d;
        Object objG = kVar.f17630a.g(q2.t.f17671b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        o.k0 k0Var = kVar2.f17630a;
        Object objG2 = k0Var.g(q2.t.I);
        if (objG2 == null) {
            objG2 = null;
        }
        s2.a aVar = (s2.a) objG2;
        Object objG3 = k0Var.g(q2.t.f17693x);
        if (objG3 == null) {
            objG3 = null;
        }
        q2.h hVar = (q2.h) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new ce.j0();
                    }
                    if (objG == null) {
                        objG = resources.getString(com.cnl.kikoeru.R.string.indeterminate);
                    }
                } else if (hVar != null && hVar.f17601a == 2 && objG == null) {
                    objG = resources.getString(com.cnl.kikoeru.R.string.state_off);
                }
            } else if (hVar != null && hVar.f17601a == 2 && objG == null) {
                objG = resources.getString(com.cnl.kikoeru.R.string.state_on);
            }
        }
        Object objG4 = k0Var.g(q2.t.H);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((hVar == null || hVar.f17601a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.cnl.kikoeru.R.string.selected) : resources.getString(com.cnl.kikoeru.R.string.not_selected);
            }
        }
        Object objG5 = k0Var.g(q2.t.f17672c);
        if (objG5 == null) {
            objG5 = null;
        }
        q2.g gVar = (q2.g) objG5;
        if (gVar != null) {
            if (gVar != q2.g.f17597d) {
                if (objG == null) {
                    oc.a aVar2 = gVar.f17599b;
                    float f10 = aVar2.f16306b;
                    float f11 = aVar2.f16305a;
                    float f12 = f10 - f11 == 0.0f ? 0.0f : (gVar.f17598a - f11) / (aVar2.f16306b - f11);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (f12 == 0.0f) {
                        iK = 0;
                    } else {
                        iK = 100;
                        if (f12 != 1.0f) {
                            iK = nh.b.k(Math.round(f12 * 100), 1, 99);
                        }
                    }
                    objG = resources.getString(com.cnl.kikoeru.R.string.template_percent, Integer.valueOf(iK));
                }
            } else if (objG == null) {
                objG = resources.getString(com.cnl.kikoeru.R.string.in_progress);
            }
        }
        q2.w wVar = q2.t.E;
        if (k0Var.c(wVar)) {
            o.k0 k0Var2 = new q2.o(oVar.f17636a, true, oVar.f17638c, kVar2).k().f17630a;
            Object objG6 = k0Var2.g(q2.t.f17670a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = k0Var2.g(q2.t.A);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = k0Var2.g(wVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.cnl.kikoeru.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final t2.g x(q2.o oVar) {
        q2.k kVar = oVar.f17639d;
        q2.w wVar = q2.t.f17670a;
        t2.g gVar = (t2.g) q2.r.d(kVar, q2.t.E);
        List list = (List) q2.r.d(oVar.f17639d, q2.t.A);
        return gVar == null ? list != null ? (t2.g) vb.m.a0(list) : null : gVar;
    }

    public static boolean y() {
        try {
            if (v.Z0 == null) {
                v.Z0 = Class.forName("android.os.SystemProperties");
            }
            if (v.f10023a1 == null) {
                Class cls = v.Z0;
                v.f10023a1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = v.f10023a1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return jc.l.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final t2.i0 z(q2.k kVar) {
        ic.k kVar2;
        ArrayList arrayList = new ArrayList();
        Object objG = kVar.f17630a.g(q2.j.f17604a);
        if (objG == null) {
            objG = null;
        }
        q2.a aVar = (q2.a) objG;
        if (aVar == null || (kVar2 = (ic.k) aVar.f17587b) == null || !((Boolean) kVar2.a(arrayList)).booleanValue()) {
            return null;
        }
        return (t2.i0) arrayList.get(0);
    }
}
