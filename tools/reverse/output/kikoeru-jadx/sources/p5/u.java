package p5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f16737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f16739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f16749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16751q;

    public u(Context context) {
        DisplayManager displayManager;
        e eVar = new e();
        eVar.f16652a = new d();
        eVar.f16653b = new d();
        eVar.f16655d = -9223372036854775807L;
        this.f16735a = eVar;
        s sVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new s(this, displayManager);
        this.f16736b = sVar;
        this.f16737c = sVar != null ? t.f16730e : null;
        this.f16745k = -9223372036854775807L;
        this.f16746l = -9223372036854775807L;
        this.f16740f = -1.0f;
        this.f16743i = 1.0f;
        this.f16744j = 0;
    }

    public static void a(u uVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            uVar.f16745k = refreshRate;
            uVar.f16746l = (refreshRate * 80) / 100;
        } else {
            p4.c.B("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            uVar.f16745k = -9223372036854775807L;
            uVar.f16746l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (c0.f16548a < 30 || (surface = this.f16739e) == null || this.f16744j == Integer.MIN_VALUE || this.f16742h == 0.0f) {
            return;
        }
        this.f16742h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e10) {
            p4.c.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = p4.c0.f16548a
            r1 = 30
            if (r0 < r1) goto L8e
            android.view.Surface r0 = r9.f16739e
            if (r0 != 0) goto Lc
            goto L8e
        Lc:
            p5.e r0 = r9.f16735a
            p5.d r2 = r0.f16652a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3a
            p5.d r2 = r0.f16652a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            p5.d r2 = r0.f16652a
            long r4 = r2.f16648e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f16649f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3c
        L37:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3c
        L3a:
            float r2 = r9.f16740f
        L3c:
            float r4 = r9.f16741g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L43
            goto L8e
        L43:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L81
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L81
            p5.d r1 = r0.f16652a
            boolean r1 = r1.a()
            if (r1 == 0) goto L72
            p5.d r1 = r0.f16652a
            boolean r1 = r1.a()
            if (r1 == 0) goto L60
            p5.d r0 = r0.f16652a
            long r0 = r0.f16649f
            goto L65
        L60:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L72
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L74
        L72:
            r0 = 1065353216(0x3f800000, float:1.0)
        L74:
            float r1 = r9.f16741g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8e
            goto L88
        L81:
            if (r5 == 0) goto L84
            goto L88
        L84:
            int r0 = r0.f16656e
            if (r0 < r1) goto L8e
        L88:
            r9.f16741g = r2
            r0 = 0
            r9.d(r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.u.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = p4.c0.f16548a
            r1 = 30
            if (r0 < r1) goto L42
            android.view.Surface r0 = r4.f16739e
            if (r0 == 0) goto L42
            int r1 = r4.f16744j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L42
        L11:
            boolean r1 = r4.f16738d
            r2 = 0
            if (r1 == 0) goto L23
            float r1 = r4.f16741g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L23
            float r3 = r4.f16743i
            float r1 = r1 * r3
            goto L24
        L23:
            r1 = 0
        L24:
            if (r5 != 0) goto L2d
            float r5 = r4.f16742h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2d
            goto L42
        L2d:
            r4.f16742h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L35
            r5 = 0
            goto L36
        L35:
            r5 = 1
        L36:
            b7.u0.p(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L3a
            return
        L3a:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            p4.c.o(r0, r1, r5)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.u.d(boolean):void");
    }
}
