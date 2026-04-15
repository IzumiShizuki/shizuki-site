package s7;

import androidx.lifecycle.n0;
import d9.f;
import hf.r1;
import i7.e2;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n7.v;
import n7.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e2 f19551i = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f19552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f19553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f19554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f19555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f19556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f19557f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f19558g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r1 f19559h;

    public d(String[] strArr, f fVar, e eVar) {
        this.f19552a = strArr;
        this.f19553b = fVar;
        this.f19554c = eVar;
        this.f19555d = fVar.f5559c;
        this.f19556e = fVar.f5558b;
        fVar.d(new n0(27, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r9 == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(i7.c2 r8, ac.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof s7.a
            if (r0 == 0) goto L13
            r0 = r9
            s7.a r0 = (s7.a) r0
            int r1 = r0.f19542f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19542f = r1
            goto L18
        L13:
            s7.a r0 = new s7.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f19540d
            int r1 = r0.f19542f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ub.a.f(r9)     // Catch: java.lang.Exception -> L28
            goto L89
        L28:
            r8 = move-exception
            goto L8c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            ub.a.f(r9)     // Catch: java.lang.Exception -> L28
            goto L7d
        L36:
            ub.a.f(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f19558g
            r1 = 0
            boolean r9 = r9.compareAndSet(r1, r3)
            r1 = 0
            n7.v r4 = r7.f19555d
            if (r9 == 0) goto L56
            hf.y r9 = r4.e()
            s7.b r5 = new s7.b
            r6 = 0
            r5.<init>(r7, r1, r6)
            r6 = 3
            hf.r1 r9 = hf.a0.y(r9, r1, r1, r5, r6)
            r7.f19559h = r9
        L56:
            java.util.concurrent.atomic.AtomicInteger r9 = r7.f19557f
            int r9 = r9.get()
            r5 = -1
            zb.a r6 = zb.a.f26667a
            if (r9 != r5) goto L80
            r0.f19542f = r3     // Catch: java.lang.Exception -> L28
            q.q r9 = new q.q     // Catch: java.lang.Exception -> L28
            r2 = 6
            r9.<init>(r7, r8, r1, r2)     // Catch: java.lang.Exception -> L28
            hf.y r8 = r4.e()     // Catch: java.lang.Exception -> L28
            nf.d r8 = (nf.d) r8     // Catch: java.lang.Exception -> L28
            yb.h r8 = r8.f15823a     // Catch: java.lang.Exception -> L28
            lf.w0 r2 = new lf.w0     // Catch: java.lang.Exception -> L28
            r2.<init>(r4, r9, r1)     // Catch: java.lang.Exception -> L28
            java.lang.Object r9 = hf.a0.H(r8, r2, r0)     // Catch: java.lang.Exception -> L28
            if (r9 != r6) goto L7d
            goto L88
        L7d:
            i7.g2 r9 = (i7.g2) r9     // Catch: java.lang.Exception -> L28
            return r9
        L80:
            r0.f19542f = r2     // Catch: java.lang.Exception -> L28
            java.lang.Object r9 = r7.b(r8, r9, r0)     // Catch: java.lang.Exception -> L28
            if (r9 != r6) goto L89
        L88:
            return r6
        L89:
            i7.g2 r9 = (i7.g2) r9     // Catch: java.lang.Exception -> L28
            return r9
        L8c:
            i7.d2 r9 = new i7.d2
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.d.a(i7.c2, ac.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (hf.a0.H(r9, r1, r0) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(i7.c2 r7, int r8, ac.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof s7.c
            if (r0 == 0) goto L13
            r0 = r9
            s7.c r0 = (s7.c) r0
            int r1 = r0.f19550h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19550h = r1
            goto L18
        L13:
            s7.c r0 = new s7.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f19548f
            int r1 = r0.f19550h
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            i7.g2 r7 = r0.f19547e
            s7.d r8 = r0.f19546d
            ub.a.f(r9)
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            s7.d r7 = r0.f19546d
            ub.a.f(r9)
            r8 = r7
            goto L50
        L3d:
            ub.a.f(r9)
            r0.f19546d = r6
            r0.f19550h = r3
            n7.w r9 = r6.f19556e
            s7.e r1 = r6.f19554c
            java.lang.Object r9 = nd.h.s(r7, r9, r8, r1, r0)
            if (r9 != r4) goto L4f
            goto L70
        L4f:
            r8 = r6
        L50:
            r7 = r9
            i7.g2 r7 = (i7.g2) r7
            n7.v r9 = r8.f19555d
            hf.y r9 = r9.e()
            nf.d r9 = (nf.d) r9
            yb.h r9 = r9.f15823a
            s7.b r1 = new s7.b
            r3 = 0
            r5 = 1
            r1.<init>(r8, r3, r5)
            r0.f19546d = r8
            r0.f19547e = r7
            r0.f19550h = r2
            java.lang.Object r9 = hf.a0.H(r9, r1, r0)
            if (r9 != r4) goto L71
        L70:
            return r4
        L71:
            d9.f r8 = r8.f19553b
            b7.n r8 = r8.f9151a
            boolean r8 = r8.f1984b
            if (r8 == 0) goto L7b
            i7.e2 r7 = s7.d.f19551i
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.d.b(i7.c2, int, ac.c):java.lang.Object");
    }
}
