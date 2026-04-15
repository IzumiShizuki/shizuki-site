package b0;

import android.view.Choreographer;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements x1, x0.u1, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f1193g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1194a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1196c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1199f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0.e f1195b = new z0.e(new v1[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f1197d = Choreographer.getInstance();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.view.View r6) {
        /*
            r5 = this;
            r5.<init>()
            r5.f1194a = r6
            z0.e r0 = new z0.e
            r1 = 16
            b0.v1[] r1 = new b0.v1[r1]
            r0.<init>(r1)
            r5.f1195b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r5.f1197d = r0
            long r0 = b0.b.f1193g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L3f
            android.view.Display r0 = r6.getDisplay()
            boolean r6 = r6.isInEditMode()
            if (r6 != 0) goto L35
            if (r0 == 0) goto L35
            float r6 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r6 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r6
            long r0 = (long) r0
            b0.b.f1193g = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b.<init>(android.view.View):void");
    }

    @Override // b0.x1
    public final void b(v1 v1Var) {
        this.f1195b.b(v1Var);
        if (this.f1196c) {
            return;
        }
        this.f1196c = true;
        this.f1194a.post(this);
    }

    @Override // x0.u1
    public final void c() {
        this.f1198e = false;
        this.f1194a.removeCallbacks(this);
        this.f1197d.removeFrameCallback(this);
    }

    @Override // x0.u1
    public final void d() {
        this.f1198e = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f1198e) {
            this.f1199f = j10;
            this.f1194a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0.e eVar = this.f1195b;
        if (eVar.f26374c == 0 || !this.f1196c || !this.f1198e || this.f1194a.getWindowVisibility() != 0) {
            this.f1196c = false;
            return;
        }
        long j10 = this.f1199f + f1193g;
        a aVar = new a();
        aVar.f1169a = j10;
        boolean z10 = false;
        while (eVar.f26374c != 0 && !z10) {
            if (Math.max(0L, aVar.f1169a - System.nanoTime()) <= 0 || ((v1) eVar.f26372a[0]).b(aVar)) {
                z10 = true;
            } else {
                eVar.k(0);
            }
        }
        if (z10) {
            this.f1197d.postFrameCallback(this);
        } else {
            this.f1196c = false;
        }
    }

    @Override // x0.u1
    public final void a() {
    }
}
