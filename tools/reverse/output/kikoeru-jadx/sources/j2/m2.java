package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p4.p f9912b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f9911a = androidx.lifecycle.g0.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9913c = 3;

    @Override // j2.o1
    public final void A(int i10) {
        this.f9911a.offsetTopAndBottom(i10);
    }

    @Override // j2.o1
    public final void B(q1.p pVar, q1.e0 e0Var, n2 n2Var) {
        RecordingCanvas recordingCanvasBeginRecording = this.f9911a.beginRecording();
        q1.b bVar = pVar.f17565a;
        Canvas canvas = bVar.f17490a;
        bVar.f17490a = recordingCanvasBeginRecording;
        if (e0Var != null) {
            bVar.f();
            bVar.n(e0Var);
        }
        n2Var.a(bVar);
        if (e0Var != null) {
            bVar.r();
        }
        pVar.f17565a.f17490a = canvas;
        this.f9911a.endRecording();
    }

    @Override // j2.o1
    public final void C(Outline outline) {
        this.f9911a.setOutline(outline);
    }

    @Override // j2.o1
    public final boolean D() {
        return this.f9911a.setHasOverlappingRendering(true);
    }

    @Override // j2.o1
    public final boolean E() {
        return this.f9911a.getClipToBounds();
    }

    @Override // j2.o1
    public final int F() {
        return this.f9911a.getTop();
    }

    @Override // j2.o1
    public final void G() {
        P();
    }

    @Override // j2.o1
    public final void H(int i10) {
        this.f9911a.setAmbientShadowColor(i10);
    }

    @Override // j2.o1
    public final int I() {
        return this.f9911a.getRight();
    }

    @Override // j2.o1
    public final boolean J() {
        return this.f9911a.getClipToOutline();
    }

    @Override // j2.o1
    public final void K(boolean z10) {
        this.f9911a.setClipToOutline(z10);
    }

    @Override // j2.o1
    public final void L(int i10) {
        this.f9911a.setSpotShadowColor(i10);
    }

    @Override // j2.o1
    public final void M(Matrix matrix) {
        this.f9911a.getMatrix(matrix);
    }

    @Override // j2.o1
    public final float N() {
        return this.f9911a.getElevation();
    }

    public final void O(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            p4.p pVar = this.f9912b;
            renderNode.setUseCompositingLayer(true, pVar != null ? (Paint) pVar.f16600b : null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        if (this.f9913c == 3) {
            O(this.f9911a, 0);
        } else {
            O(this.f9911a, 1);
        }
    }

    @Override // j2.o1
    public final float a() {
        return this.f9911a.getAlpha();
    }

    @Override // j2.o1
    public final int b() {
        return this.f9911a.getHeight();
    }

    @Override // j2.o1
    public final void c(float f10) {
        this.f9911a.setRotationZ(f10);
    }

    @Override // j2.o1
    public final void d(float f10) {
        this.f9911a.setTranslationY(f10);
    }

    @Override // j2.o1
    public final void e(int i10) {
        this.f9913c = i10;
        p4.p pVarH = this.f9912b;
        if (pVarH == null) {
            pVarH = q1.h0.h();
            this.f9912b = pVarH;
        }
        pVarH.h(i10);
        P();
    }

    @Override // j2.o1
    public final void f() {
        this.f9911a.discardDisplayList();
    }

    @Override // j2.o1
    public final void g(float f10) {
        this.f9911a.setScaleY(f10);
    }

    @Override // j2.o1
    public final int h() {
        return this.f9911a.getWidth();
    }

    @Override // j2.o1
    public final boolean i() {
        return this.f9911a.hasDisplayList();
    }

    @Override // j2.o1
    public final void j() {
        this.f9911a.setRotationX(0.0f);
    }

    @Override // j2.o1
    public final void k(float f10) {
        this.f9911a.setAlpha(f10);
    }

    @Override // j2.o1
    public final void l() {
        this.f9911a.setRotationY(0.0f);
    }

    @Override // j2.o1
    public final void m() {
        p4.p pVarH = this.f9912b;
        if (pVarH == null) {
            pVarH = q1.h0.h();
            this.f9912b = pVarH;
        }
        pVarH.j(null);
        P();
    }

    @Override // j2.o1
    public final void n(float f10) {
        this.f9911a.setScaleX(f10);
    }

    @Override // j2.o1
    public final void o(float f10) {
        this.f9911a.setTranslationX(f10);
    }

    @Override // j2.o1
    public final void p(float f10) {
        this.f9911a.setCameraDistance(f10);
    }

    @Override // j2.o1
    public final void q(int i10) {
        this.f9911a.offsetLeftAndRight(i10);
    }

    @Override // j2.o1
    public final int r() {
        return this.f9911a.getBottom();
    }

    @Override // j2.o1
    public final void s() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f9911a.setRenderEffect(null);
        }
    }

    @Override // j2.o1
    public final void t(Canvas canvas) {
        canvas.drawRenderNode(this.f9911a);
    }

    @Override // j2.o1
    public final int u() {
        return this.f9911a.getLeft();
    }

    @Override // j2.o1
    public final void v(float f10) {
        this.f9911a.setPivotX(f10);
    }

    @Override // j2.o1
    public final void w(boolean z10) {
        this.f9911a.setClipToBounds(z10);
    }

    @Override // j2.o1
    public final boolean x(int i10, int i11, int i12, int i13) {
        return this.f9911a.setPosition(i10, i11, i12, i13);
    }

    @Override // j2.o1
    public final void y(float f10) {
        this.f9911a.setPivotY(f10);
    }

    @Override // j2.o1
    public final void z(float f10) {
        this.f9911a.setElevation(f10);
    }
}
