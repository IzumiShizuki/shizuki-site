package j5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends m4.i1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f10276q = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f10281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f10282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f10285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f10286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m4.i0 f10287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m4.c0 f10288p;

    static {
        m4.w wVar = new m4.w();
        m4.z zVar = new m4.z();
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var = ya.a1.f25946e;
        m4.b0 b0Var = new m4.b0();
        m4.e0 e0Var = m4.e0.f14187d;
        Uri uri = Uri.EMPTY;
        p4.c.i(((Uri) zVar.f14645e) == null || ((UUID) zVar.f14644d) != null);
        if (uri != null) {
            new m4.d0(uri, null, ((UUID) zVar.f14644d) != null ? new m4.a0(zVar) : null, null, list, null, a1Var, -9223372036854775807L);
        }
        new m4.y(wVar);
        new m4.c0(b0Var);
        m4.l0 l0Var = m4.l0.K;
    }

    public g1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, pe.d dVar, m4.i0 i0Var, m4.c0 c0Var) {
        this.f10277e = j10;
        this.f10278f = j11;
        this.f10279g = j12;
        this.f10280h = j13;
        this.f10281i = j14;
        this.f10282j = j15;
        this.f10283k = z10;
        this.f10284l = z11;
        this.f10285m = z12;
        this.f10286n = dVar;
        i0Var.getClass();
        this.f10287o = i0Var;
        this.f10288p = c0Var;
    }

    @Override // m4.i1
    public final int b(Object obj) {
        return f10276q.equals(obj) ? 0 : -1;
    }

    @Override // m4.i1
    public final m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        p4.c.f(i10, 1);
        Object obj = z10 ? f10276q : null;
        long j10 = -this.f10281i;
        f1Var.getClass();
        f1Var.i(null, obj, 0, this.f10279g, j10, m4.b.f14121f, false);
        return f1Var;
    }

    @Override // m4.i1
    public final int h() {
        return 1;
    }

    @Override // m4.i1
    public final Object l(int i10) {
        p4.c.f(i10, 1);
        return f10276q;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // m4.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m4.h1 m(int r25, m4.h1 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            p4.c.f(r2, r1)
            long r1 = r0.f10282j
            boolean r14 = r0.f10284l
            if (r14 == 0) goto L2d
            boolean r3 = r0.f10285m
            if (r3 != 0) goto L2d
            r3 = 0
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 == 0) goto L2d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r0.f10280h
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r3
            goto L2f
        L26:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = m4.h1.f14252q
            r21 = 0
            long r1 = r0.f10281i
            m4.i0 r5 = r0.f10287o
            java.lang.Object r6 = r0.f10286n
            long r7 = r0.f10277e
            long r9 = r0.f10278f
            boolean r13 = r0.f10283k
            m4.c0 r15 = r0.f10288p
            long r11 = r0.f10280h
            r20 = 0
            r3 = r26
            r22 = r1
            r18 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.g1.m(int, m4.h1, long):m4.h1");
    }

    @Override // m4.i1
    public final int o() {
        return 1;
    }
}
