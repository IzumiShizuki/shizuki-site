package t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import c7.e1;
import j2.v;
import java.util.concurrent.atomic.AtomicBoolean;
import q.a0;
import q1.h0;
import q1.o;
import q1.p;
import q1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f20171z = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f20172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.b f20173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f20174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f20176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f20177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f20182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f20184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f20185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f20186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f20187q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f20191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f20192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20195y;

    public e(v vVar, p pVar, s1.b bVar) {
        this.f20172b = pVar;
        this.f20173c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", vVar);
        this.f20174d = renderNodeCreate;
        this.f20175e = 0L;
        this.f20179i = 0L;
        if (f20171z.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                l.c(renderNodeCreate, l.a(renderNodeCreate));
                l.d(renderNodeCreate, l.b(renderNodeCreate));
            }
            if (i10 >= 24) {
                k.a(renderNodeCreate);
            } else {
                j.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.f20180j = 0;
        this.f20181k = 3;
        this.f20182l = 1.0f;
        this.f20184n = 1.0f;
        this.f20185o = 1.0f;
        long j10 = q.f17569b;
        this.f20189s = j10;
        this.f20190t = j10;
        this.f20192v = 8.0f;
    }

    @Override // t1.d
    public final long A() {
        return this.f20190t;
    }

    @Override // t1.d
    public final void B(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20189s = j10;
            l.c(this.f20174d, h0.B(j10));
        }
    }

    @Override // t1.d
    public final float C() {
        return this.f20192v;
    }

    @Override // t1.d
    public final float D() {
        return this.f20186p;
    }

    @Override // t1.d
    public final void E(boolean z10) {
        this.f20193w = z10;
        O();
    }

    @Override // t1.d
    public final float F() {
        return 0.0f;
    }

    @Override // t1.d
    public final void G(f3.c cVar, f3.m mVar, b bVar, a0 a0Var) {
        Canvas canvasStart = this.f20174d.start(Math.max((int) (this.f20175e >> 32), (int) (this.f20179i >> 32)), Math.max((int) (this.f20175e & 4294967295L), (int) (4294967295L & this.f20179i)));
        try {
            q1.b bVar2 = this.f20172b.f17565a;
            Canvas canvas = bVar2.f17490a;
            bVar2.f17490a = canvasStart;
            s1.b bVar3 = this.f20173c;
            e1 e1Var = bVar3.f19346b;
            long jR = gh.g.R(this.f20175e);
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
                bVar2.f17490a = canvas;
                this.f20174d.end(canvasStart);
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
        } catch (Throwable th3) {
            this.f20174d.end(canvasStart);
            throw th3;
        }
    }

    @Override // t1.d
    public final void H(int i10) {
        this.f20180j = i10;
        Q();
    }

    @Override // t1.d
    public final void I(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20190t = j10;
            l.d(this.f20174d, h0.B(j10));
        }
    }

    @Override // t1.d
    public final Matrix J() {
        Matrix matrix = this.f20177g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f20177g = matrix;
        }
        this.f20174d.getMatrix(matrix);
        return matrix;
    }

    @Override // t1.d
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // t1.d
    public final float L() {
        return this.f20188r;
    }

    @Override // t1.d
    public final float M() {
        return this.f20185o;
    }

    @Override // t1.d
    public final int N() {
        return this.f20181k;
    }

    public final void O() {
        boolean z10 = this.f20193w;
        boolean z11 = false;
        boolean z12 = z10 && !this.f20178h;
        if (z10 && this.f20178h) {
            z11 = true;
        }
        if (z12 != this.f20194x) {
            this.f20194x = z12;
            this.f20174d.setClipToBounds(z12);
        }
        if (z11 != this.f20195y) {
            this.f20195y = z11;
            this.f20174d.setClipToOutline(z11);
        }
    }

    public final void P(int i10) {
        RenderNode renderNode = this.f20174d;
        if (i10 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f20176f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f20176f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f20176f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i10 = this.f20180j;
        if (i10 != 1 && this.f20181k == 3) {
            P(i10);
        } else {
            P(1);
        }
    }

    @Override // t1.d
    public final float a() {
        return this.f20182l;
    }

    @Override // t1.d
    public final float b() {
        return this.f20184n;
    }

    @Override // t1.d
    public final void c(float f10) {
        this.f20191u = f10;
        this.f20174d.setRotation(f10);
    }

    @Override // t1.d
    public final void d(float f10) {
        this.f20187q = f10;
        this.f20174d.setTranslationY(f10);
    }

    @Override // t1.d
    public final void e(int i10) {
        if (this.f20181k == i10) {
            return;
        }
        this.f20181k = i10;
        Paint paint = this.f20176f;
        if (paint == null) {
            paint = new Paint();
            this.f20176f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(h0.F(i10)));
        Q();
    }

    @Override // t1.d
    public final void f() {
        if (Build.VERSION.SDK_INT >= 24) {
            k.a(this.f20174d);
        } else {
            j.a(this.f20174d);
        }
    }

    @Override // t1.d
    public final void g(float f10) {
        this.f20185o = f10;
        this.f20174d.setScaleY(f10);
    }

    @Override // t1.d
    public final void h(float f10) {
        this.f20188r = f10;
        this.f20174d.setElevation(f10);
    }

    @Override // t1.d
    public final boolean i() {
        return this.f20174d.isValid();
    }

    @Override // t1.d
    public final void j() {
        this.f20174d.setRotationX(0.0f);
    }

    @Override // t1.d
    public final void k(float f10) {
        this.f20182l = f10;
        this.f20174d.setAlpha(f10);
    }

    @Override // t1.d
    public final void l() {
        this.f20174d.setRotationY(0.0f);
    }

    @Override // t1.d
    public final void m() {
        Q();
    }

    @Override // t1.d
    public final void n(float f10) {
        this.f20184n = f10;
        this.f20174d.setScaleX(f10);
    }

    @Override // t1.d
    public final void o(float f10) {
        this.f20186p = f10;
        this.f20174d.setTranslationX(f10);
    }

    @Override // t1.d
    public final void p(float f10) {
        this.f20192v = f10;
        this.f20174d.setCameraDistance(-f10);
    }

    @Override // t1.d
    public final void q(Outline outline, long j10) {
        this.f20179i = j10;
        this.f20174d.setOutline(outline);
        this.f20178h = outline != null;
        O();
    }

    @Override // t1.d
    public final int r() {
        return this.f20180j;
    }

    @Override // t1.d
    public final q1.k s() {
        return null;
    }

    @Override // t1.d
    public final void t(int i10, int i11, long j10) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (4294967295L & j10);
        this.f20174d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (f3.l.b(this.f20175e, j10)) {
            return;
        }
        if (this.f20183m) {
            this.f20174d.setPivotX(i12 / 2.0f);
            this.f20174d.setPivotY(i13 / 2.0f);
        }
        this.f20175e = j10;
    }

    @Override // t1.d
    public final float u() {
        return 0.0f;
    }

    @Override // t1.d
    public final void v(o oVar) {
        DisplayListCanvas displayListCanvasA = q1.c.a(oVar);
        jc.l.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f20174d);
    }

    @Override // t1.d
    public final float w() {
        return this.f20191u;
    }

    @Override // t1.d
    public final void x(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.f20183m = true;
            this.f20174d.setPivotX(((int) (this.f20175e >> 32)) / 2.0f);
            this.f20174d.setPivotY(((int) (this.f20175e & 4294967295L)) / 2.0f);
        } else {
            this.f20183m = false;
            this.f20174d.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f20174d.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // t1.d
    public final long y() {
        return this.f20189s;
    }

    @Override // t1.d
    public final float z() {
        return this.f20187q;
    }
}
