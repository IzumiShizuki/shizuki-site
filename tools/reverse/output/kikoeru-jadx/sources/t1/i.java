package t1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import c7.e1;
import q.a0;
import q1.h0;
import q1.o;
import q1.p;
import q1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d {
    public static final boolean D = !c.f20167e.a();
    public static final Canvas E;
    public long A;
    public float B;
    public final boolean C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1.a f20218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f20219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f20220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f20221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f20222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f20223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Picture f20224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s1.b f20225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f20226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f20235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f20237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f20238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f20239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f20240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f20241y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f20242z;

    static {
        E = Build.VERSION.SDK_INT >= 23 ? new h() : (Canvas) new u1.b();
    }

    public i(u1.a aVar) {
        p pVar = new p();
        s1.b bVar = new s1.b();
        this.f20218b = aVar;
        this.f20219c = pVar;
        m mVar = new m(aVar, pVar, bVar);
        this.f20220d = mVar;
        this.f20221e = aVar.getResources();
        this.f20222f = new Rect();
        boolean z10 = D;
        this.f20224h = z10 ? new Picture() : null;
        this.f20225i = z10 ? new s1.b() : null;
        this.f20226j = z10 ? new p() : null;
        aVar.addView(mVar);
        mVar.setClipBounds(null);
        this.f20229m = 0L;
        View.generateViewId();
        this.f20233q = 3;
        this.f20234r = 0;
        this.f20235s = 1.0f;
        this.f20237u = 1.0f;
        this.f20238v = 1.0f;
        long j10 = q.f17569b;
        this.f20242z = j10;
        this.A = j10;
        this.C = z10;
    }

    @Override // t1.d
    public final long A() {
        return this.A;
    }

    @Override // t1.d
    public final void B(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20242z = j10;
            this.f20220d.setOutlineAmbientShadowColor(h0.B(j10));
        }
    }

    @Override // t1.d
    public final float C() {
        return this.f20220d.getCameraDistance() / this.f20221e.getDisplayMetrics().densityDpi;
    }

    @Override // t1.d
    public final float D() {
        return this.f20239w;
    }

    @Override // t1.d
    public final void E(boolean z10) {
        boolean z11 = false;
        this.f20232p = z10 && !this.f20231o;
        this.f20230n = true;
        if (z10 && this.f20231o) {
            z11 = true;
        }
        this.f20220d.setClipToOutline(z11);
    }

    @Override // t1.d
    public final float F() {
        return 0.0f;
    }

    @Override // t1.d
    public final void G(f3.c cVar, f3.m mVar, b bVar, a0 a0Var) {
        m mVar2 = this.f20220d;
        if (mVar2.getParent() == null) {
            this.f20218b.addView(mVar2);
        }
        mVar2.f20250g = cVar;
        mVar2.f20251h = mVar;
        mVar2.f20252i = a0Var;
        mVar2.f20253j = bVar;
        if (mVar2.isAttachedToWindow()) {
            mVar2.setVisibility(4);
            mVar2.setVisibility(0);
            P();
            Picture picture = this.f20224h;
            if (picture != null) {
                long j10 = this.f20229m;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j10 >> 32), (int) (j10 & 4294967295L));
                try {
                    p pVar = this.f20226j;
                    if (pVar != null) {
                        q1.b bVar2 = pVar.f17565a;
                        Canvas canvas = bVar2.f17490a;
                        bVar2.f17490a = canvasBeginRecording;
                        s1.b bVar3 = this.f20225i;
                        if (bVar3 != null) {
                            e1 e1Var = bVar3.f19346b;
                            long jR = gh.g.R(this.f20229m);
                            f3.c cVarB = e1Var.B();
                            f3.m mVarC = e1Var.C();
                            o oVarZ = e1Var.z();
                            long jD = e1Var.D();
                            b bVar4 = (b) e1Var.f3619c;
                            e1Var.b0(cVar);
                            e1Var.c0(mVar);
                            e1Var.a0(bVar2);
                            e1Var.e0(jR);
                            e1Var.f3619c = bVar;
                            bVar2.f();
                            try {
                                a0Var.a(bVar3);
                                bVar2.r();
                                e1Var.b0(cVarB);
                                e1Var.c0(mVarC);
                                e1Var.a0(oVarZ);
                                e1Var.e0(jD);
                                e1Var.f3619c = bVar4;
                            } catch (Throwable th2) {
                                bVar2.r();
                                e1 e1Var2 = bVar3.f19346b;
                                e1Var2.b0(cVarB);
                                e1Var2.c0(mVarC);
                                e1Var2.a0(oVarZ);
                                e1Var2.e0(jD);
                                e1Var2.f3619c = bVar4;
                                throw th2;
                            }
                        }
                        bVar2.f17490a = canvas;
                    }
                    picture.endRecording();
                } catch (Throwable th3) {
                    picture.endRecording();
                    throw th3;
                }
            }
        }
    }

    @Override // t1.d
    public final void H(int i10) {
        this.f20234r = i10;
        Q();
    }

    @Override // t1.d
    public final void I(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A = j10;
            this.f20220d.setOutlineSpotShadowColor(h0.B(j10));
        }
    }

    @Override // t1.d
    public final Matrix J() {
        return this.f20220d.getMatrix();
    }

    @Override // t1.d
    public final boolean K() {
        return this.C;
    }

    @Override // t1.d
    public final float L() {
        return this.f20241y;
    }

    @Override // t1.d
    public final float M() {
        return this.f20238v;
    }

    @Override // t1.d
    public final int N() {
        return this.f20233q;
    }

    public final void O(int i10) {
        m mVar = this.f20220d;
        boolean z10 = true;
        if (i10 == 1) {
            mVar.setLayerType(2, this.f20223g);
        } else if (i10 == 2) {
            mVar.setLayerType(0, this.f20223g);
            z10 = false;
        } else {
            mVar.setLayerType(0, this.f20223g);
        }
        mVar.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    public final void P() {
        try {
            p pVar = this.f20219c;
            Canvas canvas = E;
            q1.b bVar = pVar.f17565a;
            Canvas canvas2 = bVar.f17490a;
            bVar.f17490a = canvas;
            u1.a aVar = this.f20218b;
            m mVar = this.f20220d;
            aVar.a(bVar, mVar, mVar.getDrawingTime());
            pVar.f17565a.f17490a = canvas2;
        } catch (ClassCastException unused) {
        }
    }

    public final void Q() {
        int i10 = this.f20234r;
        if (i10 != 1 && this.f20233q == 3) {
            O(i10);
        } else {
            O(1);
        }
    }

    @Override // t1.d
    public final float a() {
        return this.f20235s;
    }

    @Override // t1.d
    public final float b() {
        return this.f20237u;
    }

    @Override // t1.d
    public final void c(float f10) {
        this.B = f10;
        this.f20220d.setRotation(f10);
    }

    @Override // t1.d
    public final void d(float f10) {
        this.f20240x = f10;
        this.f20220d.setTranslationY(f10);
    }

    @Override // t1.d
    public final void e(int i10) {
        this.f20233q = i10;
        Paint paint = this.f20223g;
        if (paint == null) {
            paint = new Paint();
            this.f20223g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(h0.F(i10)));
        Q();
    }

    @Override // t1.d
    public final void f() {
        this.f20218b.removeViewInLayout(this.f20220d);
    }

    @Override // t1.d
    public final void g(float f10) {
        this.f20238v = f10;
        this.f20220d.setScaleY(f10);
    }

    @Override // t1.d
    public final void h(float f10) {
        this.f20241y = f10;
        this.f20220d.setElevation(f10);
    }

    @Override // t1.d
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // t1.d
    public final void j() {
        this.f20220d.setRotationX(0.0f);
    }

    @Override // t1.d
    public final void k(float f10) {
        this.f20235s = f10;
        this.f20220d.setAlpha(f10);
    }

    @Override // t1.d
    public final void l() {
        this.f20220d.setRotationY(0.0f);
    }

    @Override // t1.d
    public final void m() {
        Paint paint = this.f20223g;
        if (paint == null) {
            paint = new Paint();
            this.f20223g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // t1.d
    public final void n(float f10) {
        this.f20237u = f10;
        this.f20220d.setScaleX(f10);
    }

    @Override // t1.d
    public final void o(float f10) {
        this.f20239w = f10;
        this.f20220d.setTranslationX(f10);
    }

    @Override // t1.d
    public final void p(float f10) {
        this.f20220d.setCameraDistance(f10 * this.f20221e.getDisplayMetrics().densityDpi);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // t1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.graphics.Outline r6, long r7) {
        /*
            r5 = this;
            t1.m r7 = r5.f20220d
            r7.f20248e = r6
            t1.c r8 = t1.c.f20164b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L13
            r7.invalidateOutline()
        L11:
            r7 = 1
            goto L3e
        L13:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L36
            boolean r0 = t1.c.f20166d     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            if (r0 != 0) goto L2d
            t1.c.f20166d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r4 = "rebuildOutline"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2f
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L2b
            t1.c.f20165c = r0     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r7 = move-exception
            goto L3b
        L2d:
            java.lang.reflect.Method r0 = t1.c.f20165c     // Catch: java.lang.Throwable -> L2b
        L2f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            r0.invoke(r7, r1)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            goto L3d
        L38:
            if (r0 == 0) goto L3d
            goto L11
        L3b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L36
            throw r7     // Catch: java.lang.Throwable -> L36
        L3d:
            r7 = 0
        L3e:
            boolean r8 = r5.f20232p
            if (r8 != 0) goto L4a
            t1.m r8 = r5.f20220d
            boolean r8 = r8.getClipToOutline()
            if (r8 == 0) goto L59
        L4a:
            if (r6 == 0) goto L59
            t1.m r8 = r5.f20220d
            r8.setClipToOutline(r3)
            boolean r8 = r5.f20232p
            if (r8 == 0) goto L59
            r5.f20232p = r2
            r5.f20230n = r3
        L59:
            if (r6 == 0) goto L5c
            r2 = 1
        L5c:
            r5.f20231o = r2
            if (r7 != 0) goto L68
            t1.m r6 = r5.f20220d
            r6.invalidate()
            r5.P()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.i.q(android.graphics.Outline, long):void");
    }

    @Override // t1.d
    public final int r() {
        return this.f20234r;
    }

    @Override // t1.d
    public final q1.k s() {
        return null;
    }

    @Override // t1.d
    public final void t(int i10, int i11, long j10) {
        boolean zB = f3.l.b(this.f20229m, j10);
        m mVar = this.f20220d;
        if (zB) {
            int i12 = this.f20227k;
            if (i12 != i10) {
                mVar.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f20228l;
            if (i13 != i11) {
                mVar.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (this.f20232p || mVar.getClipToOutline()) {
                this.f20230n = true;
            }
            int i14 = (int) (j10 >> 32);
            int i15 = (int) (4294967295L & j10);
            mVar.layout(i10, i11, i10 + i14, i11 + i15);
            this.f20229m = j10;
            if (this.f20236t) {
                mVar.setPivotX(i14 / 2.0f);
                mVar.setPivotY(i15 / 2.0f);
            }
        }
        this.f20227k = i10;
        this.f20228l = i11;
    }

    @Override // t1.d
    public final float u() {
        return 0.0f;
    }

    @Override // t1.d
    public final void v(o oVar) {
        Rect rect;
        boolean z10 = this.f20230n;
        m mVar = this.f20220d;
        if (z10) {
            if ((this.f20232p || mVar.getClipToOutline()) && !this.f20231o) {
                rect = this.f20222f;
                rect.left = 0;
                rect.top = 0;
                rect.right = mVar.getWidth();
                rect.bottom = mVar.getHeight();
            } else {
                rect = null;
            }
            mVar.setClipBounds(rect);
        }
        Canvas canvasA = q1.c.a(oVar);
        if (canvasA.isHardwareAccelerated()) {
            this.f20218b.a(oVar, mVar, mVar.getDrawingTime());
            return;
        }
        Picture picture = this.f20224h;
        if (picture != null) {
            canvasA.drawPicture(picture);
        }
    }

    @Override // t1.d
    public final float w() {
        return this.B;
    }

    @Override // t1.d
    public final void x(long j10) {
        long j11 = 9223372034707292159L & j10;
        m mVar = this.f20220d;
        if (j11 != 9205357640488583168L) {
            this.f20236t = false;
            mVar.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            mVar.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.resetPivot();
                return;
            }
            this.f20236t = true;
            mVar.setPivotX(((int) (this.f20229m >> 32)) / 2.0f);
            mVar.setPivotY(((int) (this.f20229m & 4294967295L)) / 2.0f);
        }
    }

    @Override // t1.d
    public final long y() {
        return this.f20242z;
    }

    @Override // t1.d
    public final float z() {
        return this.f20240x;
    }
}
