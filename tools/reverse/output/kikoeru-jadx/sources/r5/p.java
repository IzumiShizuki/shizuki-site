package r5;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import o.k0;
import o.s0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements q, r8.e, n5.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f18858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f18859c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18860a;

    public /* synthetic */ p(int i10) {
        this.f18860a = i10;
    }

    public static Typeface c(String str, x2.k kVar, int i10) {
        if (i10 == 0 && jc.l.a(kVar, x2.k.f24562d) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f24566a, i10 == 1);
    }

    public static Typeface d(String str, x2.k kVar, int i10) {
        if (i10 == 0 && jc.l.a(kVar, x2.k.f24562d) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iP = ud.b.p(kVar, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iP) : Typeface.create(str, iP);
    }

    @Override // n5.q
    public Object F0(Uri uri, s4.k kVar) {
        return Long.valueOf(p4.c0.Q(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // r5.q
    public void a(b0 b0Var) {
        switch (this.f18860a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public StaticLayout b(u2.h hVar) {
        char c3;
        Constructor constructor;
        switch (this.f18860a) {
            case 4:
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(hVar.f21230a, 0, hVar.f21231b, hVar.f21232c, hVar.f21233d);
                builderObtain.setTextDirection(hVar.f21234e);
                builderObtain.setAlignment(hVar.f21235f);
                builderObtain.setMaxLines(hVar.f21236g);
                builderObtain.setEllipsize(hVar.f21237h);
                builderObtain.setEllipsizedWidth(hVar.f21238i);
                builderObtain.setLineSpacing(0.0f, 1.0f);
                builderObtain.setIncludePad(hVar.f21240k);
                builderObtain.setBreakStrategy(hVar.f21241l);
                builderObtain.setHyphenationFrequency(hVar.f21244o);
                builderObtain.setIndents(null, null);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    builderObtain.setJustificationMode(hVar.f21239j);
                }
                if (i10 >= 28) {
                    builderObtain.setUseLineSpacingFromFallbacks(true);
                }
                if (i10 >= 33) {
                    builderObtain.setLineBreakConfig(d.o.a().setLineBreakStyle(hVar.f21242m).setLineBreakWordStyle(hVar.f21243n).build());
                }
                if (i10 >= 35) {
                    builderObtain.setUseBoundsForWidth(false);
                }
                return builderObtain.build();
            default:
                StaticLayout staticLayout = null;
                if (!f18858b) {
                    f18858b = true;
                    c3 = 11;
                    try {
                        Class cls = Integer.TYPE;
                        Class cls2 = Float.TYPE;
                        f18859c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    } catch (NoSuchMethodException unused) {
                        f18859c = null;
                        Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
                    }
                    constructor = f18859c;
                    break;
                } else {
                    constructor = f18859c;
                    c3 = 11;
                }
                if (constructor != null) {
                    try {
                        CharSequence charSequence = hVar.f21230a;
                        Integer numValueOf = Integer.valueOf(hVar.f21231b);
                        TextPaint textPaint = hVar.f21232c;
                        Integer numValueOf2 = Integer.valueOf(hVar.f21233d);
                        Layout.Alignment alignment = hVar.f21235f;
                        TextDirectionHeuristic textDirectionHeuristic = hVar.f21234e;
                        Float fValueOf = Float.valueOf(1.0f);
                        Float fValueOf2 = Float.valueOf(0.0f);
                        Boolean boolValueOf = Boolean.valueOf(hVar.f21240k);
                        TextUtils.TruncateAt truncateAt = hVar.f21237h;
                        Integer numValueOf3 = Integer.valueOf(hVar.f21238i);
                        Integer numValueOf4 = Integer.valueOf(hVar.f21236g);
                        Object[] objArr = new Object[13];
                        objArr[0] = charSequence;
                        objArr[1] = 0;
                        objArr[2] = numValueOf;
                        objArr[3] = textPaint;
                        objArr[4] = numValueOf2;
                        objArr[5] = alignment;
                        objArr[6] = textDirectionHeuristic;
                        objArr[7] = fValueOf;
                        objArr[8] = fValueOf2;
                        objArr[9] = boolValueOf;
                        objArr[10] = truncateAt;
                        objArr[c3] = numValueOf3;
                        objArr[12] = numValueOf4;
                        staticLayout = (StaticLayout) constructor.newInstance(objArr);
                    } catch (IllegalAccessException unused2) {
                        f18859c = null;
                        Log.e("StaticLayoutFactory", "unable to call constructor");
                    } catch (InstantiationException unused3) {
                        f18859c = null;
                        Log.e("StaticLayoutFactory", "unable to call constructor");
                    } catch (InvocationTargetException unused4) {
                        f18859c = null;
                        Log.e("StaticLayoutFactory", "unable to call constructor");
                    }
                }
                return staticLayout != null ? staticLayout : new StaticLayout(hVar.f21230a, 0, hVar.f21231b, hVar.f21232c, hVar.f21233d, hVar.f21235f, 1.0f, 0.0f, hVar.f21240k, hVar.f21237h, hVar.f21238i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface e(x2.m r5, x2.k r6, int r7) {
        /*
            r4 = this;
            int r0 = r4.f18860a
            switch(r0) {
                case 14: goto L66;
                default: goto L5;
            }
        L5:
            r5.getClass()
            int r5 = r6.f24566a
            int r5 = r5 / 100
            java.lang.String r0 = "sans-serif"
            r1 = 2
            if (r5 < 0) goto L16
            if (r5 >= r1) goto L16
            java.lang.String r5 = "sans-serif-thin"
            goto L38
        L16:
            r2 = 4
            if (r1 > r5) goto L1e
            if (r5 >= r2) goto L1e
            java.lang.String r5 = "sans-serif-light"
            goto L38
        L1e:
            if (r5 != r2) goto L22
        L20:
            r5 = r0
            goto L38
        L22:
            r1 = 5
            if (r5 != r1) goto L28
            java.lang.String r5 = "sans-serif-medium"
            goto L38
        L28:
            r1 = 6
            r2 = 8
            if (r1 > r5) goto L30
            if (r5 >= r2) goto L30
            goto L20
        L30:
            if (r2 > r5) goto L20
            r1 = 11
            if (r5 >= r1) goto L20
            java.lang.String r5 = "sans-serif-black"
        L38:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L40
            goto L5f
        L40:
            android.graphics.Typeface r5 = d(r5, r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            int r3 = ud.b.p(r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
            boolean r1 = jc.l.a(r5, r1)
            if (r1 != 0) goto L5f
            android.graphics.Typeface r1 = d(r2, r6, r7)
            boolean r1 = jc.l.a(r5, r1)
            if (r1 != 0) goto L5f
            r2 = r5
        L5f:
            if (r2 != 0) goto L65
            android.graphics.Typeface r2 = d(r0, r6, r7)
        L65:
            return r2
        L66:
            r5.getClass()
            java.lang.String r5 = "sans-serif"
            android.graphics.Typeface r5 = c(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.p.e(x2.m, x2.k, int):android.graphics.Typeface");
    }

    @Override // r8.e
    public boolean g() {
        return true;
    }

    @Override // r5.q
    public void n() {
        switch (this.f18860a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // r5.q
    public h0 u(int i10, int i11) {
        switch (this.f18860a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return new m();
        }
    }

    public /* synthetic */ p(Context context, int i10) {
        this.f18860a = i10;
    }

    public p() {
        this.f18860a = 13;
        new o.u(16);
        long[] jArr = s0.f16040a;
        new k0();
    }

    private final void f() {
    }

    @Override // r8.e
    public void shutdown() {
    }

    private final void h(b0 b0Var) {
    }
}
