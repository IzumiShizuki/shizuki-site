package j2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements hf.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.z f9964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hf.y f9965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f9966d = new AtomicReference(null);

    public q0(View view, y2.z zVar, hf.y yVar) {
        this.f9963a = view;
        this.f9964b = zVar;
        this.f9965c = yVar;
    }

    @Override // hf.y
    public final yb.h O() {
        return this.f9965c.O();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(j0.q r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j2.p0
            if (r0 == 0) goto L13
            r0 = r6
            j2.p0 r0 = (j2.p0) r0
            int r1 = r0.f9957f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9957f = r1
            goto L18
        L13:
            j2.p0 r0 = new j2.p0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9955d
            int r1 = r0.f9957f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            ub.a.f(r6)
            goto L51
        L2d:
            ub.a.f(r6)
            b0.o1 r6 = new b0.o1
            r1 = 15
            r6.<init>(r1, r5, r4)
            ba.u0 r5 = new ba.u0
            r1 = 21
            r3 = 0
            r5.<init>(r1, r4, r3)
            r0.f9957f = r2
            e.j r1 = new e.j
            java.util.concurrent.atomic.AtomicReference r2 = r4.f9966d
            r1.<init>(r6, r2, r5, r3)
            java.lang.Object r5 = hf.a0.k(r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L51
            return
        L51:
            ce.j0 r5 = new ce.j0
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.q0.a(j0.q, ac.c):void");
    }
}
