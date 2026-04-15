package kf;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends nf.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f11381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f11382f;

    public n(long j10, n nVar, f fVar, int i10) {
        super(j10, nVar, i10);
        this.f11381e = fVar;
        this.f11382f = new AtomicReferenceArray(h.f11357b * 2);
    }

    @Override // nf.r
    public final int g() {
        return h.f11357b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        jc.l.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // nf.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, yb.h r6) {
        /*
            r4 = this;
            int r6 = kf.h.f11357b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f11382f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof hf.c2
            kf.f r2 = r4.f11381e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof kf.v
            if (r1 == 0) goto L21
            goto L62
        L21:
            app.nekogram.translator.r r1 = kf.h.f11365j
            if (r6 == r1) goto L59
            app.nekogram.translator.r r1 = kf.h.f11366k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            app.nekogram.translator.r r1 = kf.h.f11362g
            if (r6 == r1) goto L11
            app.nekogram.translator.r r1 = kf.h.f11361f
            if (r6 != r1) goto L33
            goto L11
        L33:
            app.nekogram.translator.r r5 = kf.h.f11364i
            if (r6 == r5) goto L7c
            app.nekogram.translator.r r5 = kf.h.f11359d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            app.nekogram.translator.r r5 = kf.h.f11367l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            jc.l.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            app.nekogram.translator.r r1 = kf.h.f11365j
            goto L69
        L67:
            app.nekogram.translator.r r1 = kf.h.f11366k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            jc.l.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.n.h(int, yb.h):void");
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f11382f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f11382f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            f fVar = this.f11381e;
            jc.l.b(fVar);
            fVar.H((this.f15854c * ((long) h.f11357b)) + ((long) i10));
        }
        i();
    }

    public final void n(int i10, Object obj) {
        this.f11382f.set(i10 * 2, obj);
    }

    public final void o(int i10, Object obj) {
        this.f11382f.set((i10 * 2) + 1, obj);
    }
}
