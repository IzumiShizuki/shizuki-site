package t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import c7.e1;
import q.a0;
import q1.h0;
import q1.o;
import q1.p;
import q1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f20196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.b f20197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f20198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f20200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f20201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f20203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f20205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f20206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f20207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f20208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f20209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f20213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20214t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20215u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20217w;

    public g() {
        p pVar = new p();
        s1.b bVar = new s1.b();
        this.f20196b = pVar;
        this.f20197c = bVar;
        RenderNode renderNodeA = f.a();
        this.f20198d = renderNodeA;
        this.f20199e = 0L;
        renderNodeA.setClipToBounds(false);
        P(renderNodeA, 0);
        this.f20203i = 1.0f;
        this.f20204j = 3;
        this.f20205k = 1.0f;
        this.f20206l = 1.0f;
        long j10 = q.f17569b;
        this.f20210p = j10;
        this.f20211q = j10;
        this.f20213s = 8.0f;
        this.f20217w = 0;
    }

    @Override // t1.d
    public final long A() {
        return this.f20211q;
    }

    @Override // t1.d
    public final void B(long j10) {
        this.f20210p = j10;
        this.f20198d.setAmbientShadowColor(h0.B(j10));
    }

    @Override // t1.d
    public final float C() {
        return this.f20213s;
    }

    @Override // t1.d
    public final float D() {
        return this.f20207m;
    }

    @Override // t1.d
    public final void E(boolean z10) {
        this.f20214t = z10;
        O();
    }

    @Override // t1.d
    public final float F() {
        return 0.0f;
    }

    @Override // t1.d
    public final void G(f3.c cVar, f3.m mVar, b bVar, a0 a0Var) {
        s1.b bVar2 = this.f20197c;
        RecordingCanvas recordingCanvasBeginRecording = this.f20198d.beginRecording();
        try {
            p pVar = this.f20196b;
            q1.b bVar3 = pVar.f17565a;
            Canvas canvas = bVar3.f17490a;
            bVar3.f17490a = recordingCanvasBeginRecording;
            e1 e1Var = bVar2.f19346b;
            e1Var.b0(cVar);
            e1Var.c0(mVar);
            e1Var.f3619c = bVar;
            e1Var.e0(this.f20199e);
            e1Var.a0(bVar3);
            a0Var.a(bVar2);
            pVar.f17565a.f17490a = canvas;
        } finally {
            this.f20198d.endRecording();
        }
    }

    @Override // t1.d
    public final void H(int i10) {
        this.f20217w = i10;
        Q();
    }

    @Override // t1.d
    public final void I(long j10) {
        this.f20211q = j10;
        this.f20198d.setSpotShadowColor(h0.B(j10));
    }

    @Override // t1.d
    public final Matrix J() {
        Matrix matrix = this.f20201g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f20201g = matrix;
        }
        this.f20198d.getMatrix(matrix);
        return matrix;
    }

    @Override // t1.d
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // t1.d
    public final float L() {
        return this.f20209o;
    }

    @Override // t1.d
    public final float M() {
        return this.f20206l;
    }

    @Override // t1.d
    public final int N() {
        return this.f20204j;
    }

    public final void O() {
        boolean z10 = this.f20214t;
        boolean z11 = false;
        boolean z12 = z10 && !this.f20202h;
        if (z10 && this.f20202h) {
            z11 = true;
        }
        if (z12 != this.f20215u) {
            this.f20215u = z12;
            this.f20198d.setClipToBounds(z12);
        }
        if (z11 != this.f20216v) {
            this.f20216v = z11;
            this.f20198d.setClipToOutline(z11);
        }
    }

    public final void P(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, this.f20200f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, this.f20200f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f20200f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i10 = this.f20217w;
        if (i10 != 1 && this.f20204j == 3) {
            P(this.f20198d, i10);
        } else {
            P(this.f20198d, 1);
        }
    }

    @Override // t1.d
    public final float a() {
        return this.f20203i;
    }

    @Override // t1.d
    public final float b() {
        return this.f20205k;
    }

    @Override // t1.d
    public final void c(float f10) {
        this.f20212r = f10;
        this.f20198d.setRotationZ(f10);
    }

    @Override // t1.d
    public final void d(float f10) {
        this.f20208n = f10;
        this.f20198d.setTranslationY(f10);
    }

    @Override // t1.d
    public final void e(int i10) {
        this.f20204j = i10;
        Paint paint = this.f20200f;
        if (paint == null) {
            paint = new Paint();
            this.f20200f = paint;
        }
        paint.setBlendMode(h0.x(i10));
        Q();
    }

    @Override // t1.d
    public final void f() {
        this.f20198d.discardDisplayList();
    }

    @Override // t1.d
    public final void g(float f10) {
        this.f20206l = f10;
        this.f20198d.setScaleY(f10);
    }

    @Override // t1.d
    public final void h(float f10) {
        this.f20209o = f10;
        this.f20198d.setElevation(f10);
    }

    @Override // t1.d
    public final boolean i() {
        return this.f20198d.hasDisplayList();
    }

    @Override // t1.d
    public final void j() {
        this.f20198d.setRotationX(0.0f);
    }

    @Override // t1.d
    public final void k(float f10) {
        this.f20203i = f10;
        this.f20198d.setAlpha(f10);
    }

    @Override // t1.d
    public final void l() {
        this.f20198d.setRotationY(0.0f);
    }

    @Override // t1.d
    public final void m() {
        Paint paint = this.f20200f;
        if (paint == null) {
            paint = new Paint();
            this.f20200f = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // t1.d
    public final void n(float f10) {
        this.f20205k = f10;
        this.f20198d.setScaleX(f10);
    }

    @Override // t1.d
    public final void o(float f10) {
        this.f20207m = f10;
        this.f20198d.setTranslationX(f10);
    }

    @Override // t1.d
    public final void p(float f10) {
        this.f20213s = f10;
        this.f20198d.setCameraDistance(f10);
    }

    @Override // t1.d
    public final void q(Outline outline, long j10) {
        this.f20198d.setOutline(outline);
        this.f20202h = outline != null;
        O();
    }

    @Override // t1.d
    public final int r() {
        return this.f20217w;
    }

    @Override // t1.d
    public final q1.k s() {
        return null;
    }

    @Override // t1.d
    public final void t(int i10, int i11, long j10) {
        this.f20198d.setPosition(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (4294967295L & j10)) + i11);
        this.f20199e = gh.g.R(j10);
    }

    @Override // t1.d
    public final float u() {
        return 0.0f;
    }

    @Override // t1.d
    public final void v(o oVar) {
        q1.c.a(oVar).drawRenderNode(this.f20198d);
    }

    @Override // t1.d
    public final float w() {
        return this.f20212r;
    }

    @Override // t1.d
    public final void x(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.f20198d.resetPivot();
        } else {
            this.f20198d.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f20198d.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // t1.d
    public final long y() {
        return this.f20210p;
    }

    @Override // t1.d
    public final float z() {
        return this.f20208n;
    }
}
