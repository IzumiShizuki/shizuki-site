package p2;

import a0.f0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import e.j;
import f3.k;
import hf.a0;
import hf.n1;
import hf.r1;
import i7.p2;
import j2.v;
import java.util.function.Consumer;
import lf.w0;
import m0.m;
import q1.h0;
import q2.o;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f16507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f16508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f16509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f16510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nf.d f16511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f16512f;

    public c(o oVar, k kVar, nf.d dVar, p2 p2Var, v vVar) {
        this.f16507a = oVar;
        this.f16508b = kVar;
        this.f16509c = p2Var;
        this.f16510d = vVar;
        this.f16511e = new nf.d(dVar.f15823a.G(d.f16513a));
        this.f16512f = new f(kVar.a(), new m(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p2.c r11, android.view.ScrollCaptureSession r12, f3.k r13, ac.c r14) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.a(p2.c, android.view.ScrollCaptureSession, f3.k, ac.c):java.lang.Object");
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        a0.y(this.f16511e, n1.f8571b, null, new w0(this, runnable, null, 12), 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        r1 r1VarY = a0.y(this.f16511e, null, null, new j(this, scrollCaptureSession, rect, consumer, null, 18), 3);
        r1VarY.B(new f0(27, cancellationSignal));
        cancellationSignal.setOnCancelListener(new j0.j(1, r1VarY));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(h0.y(this.f16508b));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f16512f.f16518b = 0.0f;
        ((e1) this.f16509c.f9258a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
