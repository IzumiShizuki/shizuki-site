package j2;

import android.graphics.Outline;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9798a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Outline f9799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q1.h0 f9800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1.h f9801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q1.e0 f9802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q1.e0 f9805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p1.d f9806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9810m;

    public e2() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f9799b = outline;
        this.f9808k = 0L;
        this.f9809l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(q1.o r14) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.e2.a(q1.o):void");
    }

    public final Outline b() {
        e();
        if (this.f9810m && this.f9798a) {
            return this.f9799b;
        }
        return null;
    }

    public final boolean c(long j10) {
        q1.h0 h0Var;
        if (this.f9810m && (h0Var = this.f9800c) != null) {
            return l0.B(h0Var, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        return true;
    }

    public final boolean d(q1.h0 h0Var, float f10, boolean z10, float f11, long j10) {
        this.f9799b.setAlpha(f10);
        boolean zA = jc.l.a(this.f9800c, h0Var);
        boolean z11 = !zA;
        if (!zA) {
            this.f9800c = h0Var;
            this.f9803f = true;
        }
        this.f9809l = j10;
        boolean z12 = h0Var != null && (z10 || f11 > 0.0f);
        if (this.f9810m != z12) {
            this.f9810m = z12;
            this.f9803f = true;
        }
        return z11;
    }

    public final void e() {
        if (this.f9803f) {
            this.f9808k = 0L;
            this.f9807j = 0.0f;
            this.f9802e = null;
            this.f9803f = false;
            this.f9804g = false;
            q1.h0 h0Var = this.f9800c;
            Outline outline = this.f9799b;
            if (h0Var == null || !this.f9810m || Float.intBitsToFloat((int) (this.f9809l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f9809l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f9798a = true;
            if (h0Var instanceof q1.c0) {
                p1.c cVar = ((q1.c0) h0Var).f17495e;
                float f10 = cVar.f16483a;
                float f11 = cVar.f16484b;
                this.f9808k = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                float f12 = cVar.f16485c;
                float f13 = cVar.f16486d;
                this.f9809l = (4294967295L & ((long) Float.floatToRawIntBits(f13 - f11))) | (Float.floatToRawIntBits(f12 - f10) << 32);
                outline.setRect(Math.round(f10), Math.round(f11), Math.round(f12), Math.round(f13));
                return;
            }
            if (!(h0Var instanceof q1.d0)) {
                if (!(h0Var instanceof q1.b0)) {
                    throw new ce.j0();
                }
                f(((q1.b0) h0Var).f17493e);
                return;
            }
            p1.d dVar = ((q1.d0) h0Var).f17497e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f16491e >> 32));
            float f14 = dVar.f16487a;
            float f15 = dVar.f16488b;
            this.f9808k = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
            float fB = dVar.b();
            this.f9809l = (((long) Float.floatToRawIntBits(dVar.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            if (nd.h.q(dVar)) {
                this.f9799b.setRoundRect(Math.round(f14), Math.round(f15), Math.round(dVar.f16489c), Math.round(dVar.f16490d), fIntBitsToFloat);
                this.f9807j = fIntBitsToFloat;
                return;
            }
            q1.h hVarA = this.f9801d;
            if (hVarA == null) {
                hVarA = q1.j.a();
                this.f9801d = hVarA;
            }
            hVarA.d();
            q.t0.f(hVarA, dVar);
            f(hVarA);
        }
    }

    public final void f(q1.e0 e0Var) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f9799b;
        if (i10 > 28 || ((q1.h) e0Var).f17511a.isConvex()) {
            if (i10 >= 30) {
                f2.f9814a.a(outline, e0Var);
            } else {
                if (!(e0Var instanceof q1.h)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((q1.h) e0Var).f17511a);
            }
            this.f9804g = !outline.canClip();
        } else {
            this.f9798a = false;
            outline.setEmpty();
            this.f9804g = true;
        }
        this.f9802e = e0Var;
    }
}
