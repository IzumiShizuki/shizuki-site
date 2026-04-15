package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements o1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9847i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f9848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p4.p f9849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9855h;

    public k2(v vVar) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", vVar);
        this.f9848a = renderNodeCreate;
        if (f9847i) {
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
                r2.c(renderNodeCreate, r2.a(renderNodeCreate));
                r2.d(renderNodeCreate, r2.b(renderNodeCreate));
            }
            if (i10 >= 24) {
                q2.a(renderNodeCreate);
            } else {
                p2.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f9847i = false;
        }
        this.f9855h = 3;
    }

    @Override // j2.o1
    public final void A(int i10) {
        this.f9851d += i10;
        this.f9853f += i10;
        this.f9848a.offsetTopAndBottom(i10);
    }

    @Override // j2.o1
    public final void B(q1.p pVar, q1.e0 e0Var, n2 n2Var) {
        Canvas canvasStart = this.f9848a.start(h(), b());
        q1.b bVar = pVar.f17565a;
        Canvas canvas = bVar.f17490a;
        bVar.f17490a = canvasStart;
        if (e0Var != null) {
            bVar.f();
            bVar.n(e0Var);
        }
        n2Var.a(bVar);
        if (e0Var != null) {
            bVar.r();
        }
        pVar.f17565a.f17490a = canvas;
        this.f9848a.end(canvasStart);
    }

    @Override // j2.o1
    public final void C(Outline outline) {
        this.f9848a.setOutline(outline);
    }

    @Override // j2.o1
    public final boolean D() {
        return this.f9848a.setHasOverlappingRendering(true);
    }

    @Override // j2.o1
    public final boolean E() {
        return this.f9854g;
    }

    @Override // j2.o1
    public final int F() {
        return this.f9851d;
    }

    @Override // j2.o1
    public final void G() {
        P();
    }

    @Override // j2.o1
    public final void H(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            r2.c(this.f9848a, i10);
        }
    }

    @Override // j2.o1
    public final int I() {
        return this.f9852e;
    }

    @Override // j2.o1
    public final boolean J() {
        return this.f9848a.getClipToOutline();
    }

    @Override // j2.o1
    public final void K(boolean z10) {
        this.f9848a.setClipToOutline(z10);
    }

    @Override // j2.o1
    public final void L(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            r2.d(this.f9848a, i10);
        }
    }

    @Override // j2.o1
    public final void M(Matrix matrix) {
        this.f9848a.getMatrix(matrix);
    }

    @Override // j2.o1
    public final float N() {
        return this.f9848a.getElevation();
    }

    public final void O(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setLayerType(2);
            p4.p pVar = this.f9849b;
            renderNode.setLayerPaint(pVar != null ? (Paint) pVar.f16600b : null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        if (this.f9855h == 3) {
            O(this.f9848a, 0);
        } else {
            O(this.f9848a, 1);
        }
    }

    @Override // j2.o1
    public final float a() {
        return this.f9848a.getAlpha();
    }

    @Override // j2.o1
    public final int b() {
        return this.f9853f - this.f9851d;
    }

    @Override // j2.o1
    public final void c(float f10) {
        this.f9848a.setRotation(f10);
    }

    @Override // j2.o1
    public final void d(float f10) {
        this.f9848a.setTranslationY(f10);
    }

    @Override // j2.o1
    public final void e(int i10) {
        this.f9855h = i10;
        p4.p pVarH = this.f9849b;
        if (pVarH == null) {
            pVarH = q1.h0.h();
            this.f9849b = pVarH;
        }
        pVarH.h(i10);
        P();
    }

    @Override // j2.o1
    public final void f() {
        if (Build.VERSION.SDK_INT >= 24) {
            q2.a(this.f9848a);
        } else {
            p2.a(this.f9848a);
        }
    }

    @Override // j2.o1
    public final void g(float f10) {
        this.f9848a.setScaleY(f10);
    }

    @Override // j2.o1
    public final int h() {
        return this.f9852e - this.f9850c;
    }

    @Override // j2.o1
    public final boolean i() {
        return this.f9848a.isValid();
    }

    @Override // j2.o1
    public final void j() {
        this.f9848a.setRotationX(0.0f);
    }

    @Override // j2.o1
    public final void k(float f10) {
        this.f9848a.setAlpha(f10);
    }

    @Override // j2.o1
    public final void l() {
        this.f9848a.setRotationY(0.0f);
    }

    @Override // j2.o1
    public final void m() {
        p4.p pVarH = this.f9849b;
        if (pVarH == null) {
            pVarH = q1.h0.h();
            this.f9849b = pVarH;
        }
        pVarH.j(null);
        P();
    }

    @Override // j2.o1
    public final void n(float f10) {
        this.f9848a.setScaleX(f10);
    }

    @Override // j2.o1
    public final void o(float f10) {
        this.f9848a.setTranslationX(f10);
    }

    @Override // j2.o1
    public final void p(float f10) {
        this.f9848a.setCameraDistance(-f10);
    }

    @Override // j2.o1
    public final void q(int i10) {
        this.f9850c += i10;
        this.f9852e += i10;
        this.f9848a.offsetLeftAndRight(i10);
    }

    @Override // j2.o1
    public final int r() {
        return this.f9853f;
    }

    @Override // j2.o1
    public final void t(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f9848a);
    }

    @Override // j2.o1
    public final int u() {
        return this.f9850c;
    }

    @Override // j2.o1
    public final void v(float f10) {
        this.f9848a.setPivotX(f10);
    }

    @Override // j2.o1
    public final void w(boolean z10) {
        this.f9854g = z10;
        this.f9848a.setClipToBounds(z10);
    }

    @Override // j2.o1
    public final boolean x(int i10, int i11, int i12, int i13) {
        this.f9850c = i10;
        this.f9851d = i11;
        this.f9852e = i12;
        this.f9853f = i13;
        return this.f9848a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // j2.o1
    public final void y(float f10) {
        this.f9848a.setPivotY(f10);
    }

    @Override // j2.o1
    public final void z(float f10) {
        this.f9848a.setElevation(f10);
    }

    @Override // j2.o1
    public final void s() {
    }
}
