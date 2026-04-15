package s;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends i2.n implements i2.p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f19136q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f19137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a0 f19138s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f19139t;

    public e0(c2.j0 j0Var, f fVar, a0 a0Var) {
        this.f19137r = fVar;
        this.f19138s = a0Var;
        B0(j0Var);
    }

    public static boolean E0(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean F0(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
        int i10 = this.f19136q;
    }

    public RenderNode G0() {
        RenderNode renderNode = (RenderNode) this.f19139t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeE = q1.a.e();
        this.f19139t = renderNodeE;
        return renderNodeE;
    }

    @Override // i2.p
    public final void R(i2.l0 l0Var) {
        boolean zF0;
        long j10;
        char c3;
        c7.e1 e1Var;
        f fVar;
        boolean zE0;
        float f10;
        boolean z10;
        char c10;
        float f11;
        float f12;
        float fB;
        switch (this.f19136q) {
            case 0:
                y.d1 d1Var = (y.d1) this.f19139t;
                s1.b bVar = l0Var.f8782a;
                long jD = bVar.f19346b.D();
                f fVar2 = this.f19137r;
                fVar2.i(jD);
                if (p1.e.e(bVar.f19346b.D())) {
                    l0Var.b();
                    return;
                }
                l0Var.b();
                fVar2.f19143d.getValue();
                Canvas canvasA = q1.c.a(bVar.f19346b.z());
                a0 a0Var = this.f19138s;
                if (a0.f(a0Var.f19093f)) {
                    zF0 = F0(270.0f, (((long) Float.floatToRawIntBits(l0Var.Q(d1Var.b(l0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (l0Var.e() & 4294967295L)))) << 32), a0Var.c(), canvasA);
                } else {
                    zF0 = false;
                }
                if (a0.f(a0Var.f19091d)) {
                    j10 = 4294967295L;
                    c3 = ' ';
                    zF0 = F0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(l0Var.Q(d1Var.c()))) & 4294967295L), a0Var.e(), canvasA) || zF0;
                } else {
                    j10 = 4294967295L;
                    c3 = ' ';
                }
                if (a0.f(a0Var.f19094g)) {
                    zF0 = F0(90.0f, (((long) Float.floatToRawIntBits(l0Var.Q(d1Var.d(l0Var.getLayoutDirection())) + (-((float) lc.b.R(Float.intBitsToFloat((int) (l0Var.e() >> c3))))))) & j10) | (((long) Float.floatToRawIntBits(0.0f)) << c3), a0Var.d(), canvasA) || zF0;
                }
                if (a0.f(a0Var.f19092e)) {
                    zF0 = F0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (l0Var.e() >> c3)))) << c3) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (l0Var.e() & j10))) + l0Var.Q(d1Var.a()))) & j10), a0Var.b(), canvasA) || zF0;
                }
                if (zF0) {
                    fVar2.d();
                    return;
                }
                return;
            default:
                s1.b bVar2 = l0Var.f8782a;
                long jD2 = bVar2.f19346b.D();
                f fVar3 = this.f19137r;
                fVar3.i(jD2);
                Canvas canvasA2 = q1.c.a(bVar2.f19346b.z());
                fVar3.f19143d.getValue();
                c7.e1 e1Var2 = bVar2.f19346b;
                if (p1.e.e(e1Var2.D())) {
                    l0Var.b();
                    return;
                }
                boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
                a0 a0Var2 = this.f19138s;
                if (!zIsHardwareAccelerated) {
                    EdgeEffect edgeEffect = a0Var2.f19091d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = a0Var2.f19092e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = a0Var2.f19093f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = a0Var2.f19094g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = a0Var2.f19095h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = a0Var2.f19096i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = a0Var2.f19097j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = a0Var2.f19098k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    l0Var.b();
                    return;
                }
                float fQ = l0Var.Q(s.f19268a);
                boolean z11 = a0.f(a0Var2.f19091d) || a0.g(a0Var2.f19095h) || a0.f(a0Var2.f19092e) || a0.g(a0Var2.f19096i);
                boolean z12 = a0.f(a0Var2.f19093f) || a0.g(a0Var2.f19097j) || a0.f(a0Var2.f19094g) || a0.g(a0Var2.f19098k);
                if (z11 && z12) {
                    G0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z11) {
                    G0().setPosition(0, 0, (lc.b.R(fQ) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z12) {
                        l0Var.b();
                        return;
                    }
                    G0().setPosition(0, 0, canvasA2.getWidth(), (lc.b.R(fQ) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = G0().beginRecording();
                boolean zG = a0.g(a0Var2.f19097j);
                u.e1 e1Var3 = u.e1.f20883b;
                if (zG) {
                    EdgeEffect edgeEffectA = a0Var2.f19097j;
                    if (edgeEffectA == null) {
                        edgeEffectA = a0Var2.a(e1Var3);
                        a0Var2.f19097j = edgeEffectA;
                    }
                    E0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (a0.f(a0Var2.f19093f)) {
                    EdgeEffect edgeEffectC = a0Var2.c();
                    zE0 = E0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (a0.g(a0Var2.f19093f)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar3.c() & 4294967295L));
                        EdgeEffect edgeEffectA2 = a0Var2.f19097j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = a0Var2.a(e1Var3);
                            a0Var2.f19097j = edgeEffectA2;
                        }
                        e1Var = e1Var2;
                        int i10 = Build.VERSION.SDK_INT;
                        float fB2 = i10 >= 31 ? m3.f.b(edgeEffectC) : 0.0f;
                        fVar = fVar3;
                        float f13 = 1 - fIntBitsToFloat;
                        if (i10 >= 31) {
                            m3.f.c(edgeEffectA2, fB2, f13);
                        } else {
                            edgeEffectA2.onPull(fB2, f13);
                        }
                    } else {
                        e1Var = e1Var2;
                        fVar = fVar3;
                    }
                } else {
                    e1Var = e1Var2;
                    fVar = fVar3;
                    zE0 = false;
                }
                boolean zG2 = a0.g(a0Var2.f19095h);
                u.e1 e1Var4 = u.e1.f20882a;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = a0Var2.f19095h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = a0Var2.a(e1Var4);
                        a0Var2.f19095h = edgeEffectA3;
                    }
                    E0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (a0.f(a0Var2.f19091d)) {
                    EdgeEffect edgeEffectE = a0Var2.e();
                    boolean z13 = E0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zE0;
                    if (a0.g(a0Var2.f19091d)) {
                        z10 = z12;
                        c10 = ' ';
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.c() >> 32));
                        EdgeEffect edgeEffectA4 = a0Var2.f19095h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = a0Var2.a(e1Var4);
                            a0Var2.f19095h = edgeEffectA4;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            f10 = fQ;
                            fB = m3.f.b(edgeEffectE);
                        } else {
                            f10 = fQ;
                            fB = 0.0f;
                        }
                        if (i11 >= 31) {
                            m3.f.c(edgeEffectA4, fB, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fB, fIntBitsToFloat2);
                        }
                    } else {
                        f10 = fQ;
                        z10 = z12;
                        c10 = ' ';
                    }
                    zE0 = z13;
                } else {
                    f10 = fQ;
                    z10 = z12;
                    c10 = ' ';
                }
                if (a0.g(a0Var2.f19098k)) {
                    EdgeEffect edgeEffectA5 = a0Var2.f19098k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = a0Var2.a(e1Var3);
                        a0Var2.f19098k = edgeEffectA5;
                    }
                    E0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (a0.f(a0Var2.f19094g)) {
                    EdgeEffect edgeEffectD = a0Var2.d();
                    boolean z14 = E0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zE0;
                    if (a0.g(a0Var2.f19094g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar.c() & 4294967295L));
                        EdgeEffect edgeEffectA6 = a0Var2.f19098k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = a0Var2.a(e1Var3);
                            a0Var2.f19098k = edgeEffectA6;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        float fB3 = i12 >= 31 ? m3.f.b(edgeEffectD) : 0.0f;
                        if (i12 >= 31) {
                            m3.f.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                        }
                    }
                    zE0 = z14;
                }
                if (a0.g(a0Var2.f19096i)) {
                    EdgeEffect edgeEffectA7 = a0Var2.f19096i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = a0Var2.a(e1Var4);
                        a0Var2.f19096i = edgeEffectA7;
                    }
                    E0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (a0.f(a0Var2.f19092e)) {
                    EdgeEffect edgeEffectB = a0Var2.b();
                    boolean z15 = E0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zE0;
                    if (a0.g(a0Var2.f19092e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fVar.c() >> c10));
                        EdgeEffect edgeEffectA8 = a0Var2.f19096i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = a0Var2.a(e1Var4);
                            a0Var2.f19096i = edgeEffectA8;
                        }
                        int i13 = Build.VERSION.SDK_INT;
                        float fB4 = i13 >= 31 ? m3.f.b(edgeEffectB) : 0.0f;
                        float f14 = 1 - fIntBitsToFloat4;
                        if (i13 >= 31) {
                            m3.f.c(edgeEffectA8, fB4, f14);
                        } else {
                            edgeEffectA8.onPull(fB4, f14);
                        }
                    }
                    zE0 = z15;
                }
                if (zE0) {
                    fVar.d();
                }
                float f15 = z10 ? 0.0f : f10;
                float f16 = z11 ? 0.0f : f10;
                f3.m layoutDirection = l0Var.getLayoutDirection();
                q1.b bVar3 = new q1.b();
                bVar3.f17490a = recordingCanvasBeginRecording;
                long jD3 = e1Var.D();
                f3.c cVarB = bVar2.f19346b.B();
                f3.m mVarC = bVar2.f19346b.C();
                q1.o oVarZ = bVar2.f19346b.z();
                long jD4 = bVar2.f19346b.D();
                c7.e1 e1Var5 = bVar2.f19346b;
                t1.b bVar4 = (t1.b) e1Var5.f3619c;
                e1Var5.b0(l0Var);
                e1Var5.c0(layoutDirection);
                e1Var5.a0(bVar3);
                e1Var5.e0(jD3);
                e1Var5.f3619c = null;
                bVar3.f();
                try {
                    ((y1) bVar2.f19346b.f3618b).i0(f15, f16);
                    try {
                        l0Var.b();
                        bVar3.r();
                        c7.e1 e1Var6 = bVar2.f19346b;
                        e1Var6.b0(cVarB);
                        e1Var6.c0(mVarC);
                        e1Var6.a0(oVarZ);
                        e1Var6.e0(jD4);
                        e1Var6.f3619c = bVar4;
                        G0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f11, f12);
                        canvasA2.drawRenderNode(G0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((y1) bVar2.f19346b.f3618b).i0(-f15, -f16);
                    }
                } catch (Throwable th2) {
                    bVar3.r();
                    c7.e1 e1Var7 = bVar2.f19346b;
                    e1Var7.b0(cVarB);
                    e1Var7.c0(mVarC);
                    e1Var7.a0(oVarZ);
                    e1Var7.e0(jD4);
                    e1Var7.f3619c = bVar4;
                    throw th2;
                }
        }
    }

    public e0(c2.j0 j0Var, f fVar, a0 a0Var, y.d1 d1Var) {
        this.f19137r = fVar;
        this.f19138s = a0Var;
        this.f19139t = d1Var;
        B0(j0Var);
    }

    private final /* synthetic */ void H0() {
    }

    private final /* synthetic */ void I0() {
    }
}
