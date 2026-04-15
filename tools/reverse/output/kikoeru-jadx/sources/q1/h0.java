package q1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f17515a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f17516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f17517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f17518d;

    public static final RectF A(p1.c cVar) {
        return new RectF(cVar.f16483a, cVar.f16484b, cVar.f16485c, cVar.f16486d);
    }

    public static final int B(long j10) {
        float[] fArr = r1.d.f18653a;
        return (int) (q.a(j10, r1.d.f18657e) >>> 32);
    }

    public static final Bitmap.Config C(int i10) {
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || i10 != 3) ? (i11 < 26 || i10 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final p1.c D(Rect rect) {
        return new p1.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final p1.c E(RectF rectF) {
        return new p1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode F(int i10) {
        return i10 == 0 ? PorterDuff.Mode.CLEAR : i10 == 1 ? PorterDuff.Mode.SRC : i10 == 2 ? PorterDuff.Mode.DST : i10 == 3 ? PorterDuff.Mode.SRC_OVER : i10 == 4 ? PorterDuff.Mode.DST_OVER : i10 == 5 ? PorterDuff.Mode.SRC_IN : i10 == 6 ? PorterDuff.Mode.DST_IN : i10 == 7 ? PorterDuff.Mode.SRC_OUT : i10 == 8 ? PorterDuff.Mode.DST_OUT : i10 == 9 ? PorterDuff.Mode.SRC_ATOP : i10 == 10 ? PorterDuff.Mode.DST_ATOP : i10 == 11 ? PorterDuff.Mode.XOR : i10 == 12 ? PorterDuff.Mode.ADD : i10 == 14 ? PorterDuff.Mode.SCREEN : i10 == 15 ? PorterDuff.Mode.OVERLAY : i10 == 16 ? PorterDuff.Mode.DARKEN : i10 == 17 ? PorterDuff.Mode.LIGHTEN : i10 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String G(int i10) {
        return i10 == 0 ? "Clear" : i10 == 1 ? "Src" : i10 == 2 ? "Dst" : i10 == 3 ? "SrcOver" : i10 == 4 ? "DstOver" : i10 == 5 ? "SrcIn" : i10 == 6 ? "DstIn" : i10 == 7 ? "SrcOut" : i10 == 8 ? "DstOut" : i10 == 9 ? "SrcAtop" : i10 == 10 ? "DstAtop" : i10 == 11 ? "Xor" : i10 == 12 ? "Plus" : i10 == 13 ? "Modulate" : i10 == 14 ? "Screen" : i10 == 15 ? "Overlay" : i10 == 16 ? "Darken" : i10 == 17 ? "Lighten" : i10 == 18 ? "ColorDodge" : i10 == 19 ? "ColorBurn" : i10 == 20 ? "HardLight" : i10 == 21 ? "Softlight" : i10 == 22 ? "Difference" : i10 == 23 ? "Exclusion" : i10 == 24 ? "Multiply" : i10 == 25 ? "Hue" : i10 == 26 ? "Saturation" : i10 == 27 ? "Color" : i10 == 28 ? "Luminosity" : "Unknown";
    }

    public static final void H(List list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
    }

    public static final int I(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public static final b a(f fVar) {
        Canvas canvas = c.f17494a;
        b bVar = new b();
        bVar.f17490a = new Canvas(k(fVar));
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, r1.c r25) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.h0.b(float, float, float, float, r1.c):long");
    }

    public static final long c(int i10) {
        long j10 = ((long) i10) << 32;
        int i11 = q.f17576i;
        return j10;
    }

    public static final long d(int i10, int i11, int i12, int i13) {
        return c(((i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) << 16) | ((i13 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) << 24) | ((i11 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) << 8) | (i12 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK));
    }

    public static final long e(long j10) {
        long j11 = j10 << 32;
        int i10 = q.f17576i;
        return j11;
    }

    public static f g(int i10, int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        r1.q qVar = r1.d.f18657e;
        Bitmap.Config configC = C(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, C(i12), true, t.a(qVar));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configC);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new f(bitmapCreateBitmap);
    }

    public static final p4.p h() {
        return new p4.p(new Paint(7));
    }

    public static final long i(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = p0.f17567c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(float r17, float r18, float r19, float r20, r1.c r21) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.h0.j(float, float, float, float, r1.c):long");
    }

    public static final Bitmap k(f fVar) {
        if (fVar instanceof f) {
            return fVar.f17505a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long l(long j10, long j11) {
        float f10;
        float f11;
        long jA = q.a(j10, q.f(j11));
        float fD = q.d(j11);
        float fD2 = q.d(jA);
        float f12 = 1.0f - fD2;
        float f13 = (fD * f12) + fD2;
        float fH = q.h(jA);
        float fH2 = q.h(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fH2 * fD) * f12) + (fH * fD2)) / f13;
        }
        float fG = q.g(jA);
        float fG2 = q.g(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fG2 * fD) * f12) + (fG * fD2)) / f13;
        }
        float fE = q.e(jA);
        float fE2 = q.e(j11);
        if (f13 != 0.0f) {
            f14 = (((fE2 * fD) * f12) + (fE * fD2)) / f13;
        }
        return j(f10, f11, f14, f13, q.f(j11));
    }

    public static final int m(List list) {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iR = ud.b.r(list);
        for (int i11 = 1; i11 < iR; i11++) {
            if (q.d(((q) list.get(i11)).f17577a) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static void n(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f17518d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f17516b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f17517c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f17516b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f17517c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f17516b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f17517c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f17518d = true;
        }
        if (z10) {
            try {
                Method method4 = f17516b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f17517c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean p(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long q(long j10, long j11, float f10) {
        r1.l lVar = r1.d.f18676x;
        long jA = q.a(j10, lVar);
        long jA2 = q.a(j11, lVar);
        float fD = q.d(jA);
        float fH = q.h(jA);
        float fG = q.g(jA);
        float fE = q.e(jA);
        float fD2 = q.d(jA2);
        float fH2 = q.h(jA2);
        float fG2 = q.g(jA2);
        float fE2 = q.e(jA2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return q.a(j(android.support.v4.media.session.b.L(fH, fH2, f10), android.support.v4.media.session.b.L(fG, fG2, f10), android.support.v4.media.session.b.L(fE, fE2, f10), android.support.v4.media.session.b.L(fD, fD2, f10), lVar), q.f(j11));
    }

    public static final float r(long j10) {
        r1.c cVarF = q.f(j10);
        if (!r1.b.a(cVarF.f18651b, r1.b.f18645a)) {
            y.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) r1.b.b(cVarF.f18651b)));
        }
        r1.m mVar = ((r1.q) cVarF).f18717p;
        double dC = mVar.c(q.h(j10));
        float fC = (float) ((mVar.c(q.e(j10)) * 0.0722d) + (mVar.c(q.g(j10)) * 0.7152d) + (dC * 0.2126d));
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > 1.0f) {
            return 1.0f;
        }
        return fC;
    }

    public static final int[] s(int i10, List list) {
        int i11;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = B(((q) list.get(i12)).f17577a);
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iR = ud.b.r(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long j10 = ((q) list.get(i12)).f17577a;
            if (q.d(j10) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = B(q.b(0.0f, ((q) list.get(1)).f17577a));
                } else if (i12 == iR) {
                    i11 = i13 + 1;
                    iArr2[i13] = B(q.b(0.0f, ((q) list.get(i12 - 1)).f17577a));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = B(q.b(0.0f, ((q) list.get(i12 - 1)).f17577a));
                    i13 += 2;
                    iArr2[i14] = B(q.b(0.0f, ((q) list.get(i12 + 1)).f17577a));
                }
                i13 = i11;
            } else {
                iArr2[i13] = B(j10);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    public static final float[] t(int i10, List list) {
        if (i10 == 0) {
            return null;
        }
        float[] fArr = new float[list.size() + i10];
        fArr[0] = 0.0f;
        int iR = ud.b.r(list);
        int i11 = 1;
        for (int i12 = 1; i12 < iR; i12++) {
            long j10 = ((q) list.get(i12)).f17577a;
            float fR = i12 / ud.b.r(list);
            int i13 = i11 + 1;
            fArr[i11] = fR;
            if (q.d(j10) == 0.0f) {
                i11 += 2;
                fArr[i13] = fR;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = 1.0f;
        return fArr;
    }

    public static final void u(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void v(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final long w(p1.c cVar) {
        float f10 = cVar.f16485c - cVar.f16483a;
        return (((long) Float.floatToRawIntBits(cVar.f16486d - cVar.f16484b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final BlendMode x(int i10) {
        return i10 == 0 ? BlendMode.CLEAR : i10 == 1 ? BlendMode.SRC : i10 == 2 ? BlendMode.DST : i10 == 3 ? BlendMode.SRC_OVER : i10 == 4 ? BlendMode.DST_OVER : i10 == 5 ? BlendMode.SRC_IN : i10 == 6 ? BlendMode.DST_IN : i10 == 7 ? BlendMode.SRC_OUT : i10 == 8 ? BlendMode.DST_OUT : i10 == 9 ? BlendMode.SRC_ATOP : i10 == 10 ? BlendMode.DST_ATOP : i10 == 11 ? BlendMode.XOR : i10 == 12 ? BlendMode.PLUS : i10 == 13 ? BlendMode.MODULATE : i10 == 14 ? BlendMode.SCREEN : i10 == 15 ? BlendMode.OVERLAY : i10 == 16 ? BlendMode.DARKEN : i10 == 17 ? BlendMode.LIGHTEN : i10 == 18 ? BlendMode.COLOR_DODGE : i10 == 19 ? BlendMode.COLOR_BURN : i10 == 20 ? BlendMode.HARD_LIGHT : i10 == 21 ? BlendMode.SOFT_LIGHT : i10 == 22 ? BlendMode.DIFFERENCE : i10 == 23 ? BlendMode.EXCLUSION : i10 == 24 ? BlendMode.MULTIPLY : i10 == 25 ? BlendMode.HUE : i10 == 26 ? BlendMode.SATURATION : i10 == 27 ? BlendMode.COLOR : i10 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect y(f3.k kVar) {
        return new Rect(kVar.f6662a, kVar.f6663b, kVar.f6664c, kVar.f6665d);
    }

    public static final Rect z(p1.c cVar) {
        return new Rect((int) cVar.f16483a, (int) cVar.f16484b, (int) cVar.f16485c, (int) cVar.f16486d);
    }

    public abstract p1.c o();
}
