package kf;

import jc.z;
import q.t0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f11383k;

    public q(int i10, a aVar) {
        super(i10);
        this.f11383k = aVar;
        if (aVar != a.f11336a) {
            if (i10 < 1) {
                throw new IllegalArgumentException(t0.C(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z.f10839a.b(f.class).y() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(java.lang.Object r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            kf.a r1 = r0.f11383k
            kf.a r2 = kf.a.f11338c
            ub.a0 r8 = ub.a0.f21526a
            if (r1 != r2) goto L19
            java.lang.Object r1 = super.e(r17)
            boolean r2 = r1 instanceof kf.l
            if (r2 == 0) goto L18
            boolean r2 = r1 instanceof kf.k
            if (r2 == 0) goto L17
            goto L18
        L17:
            return r8
        L18:
            return r1
        L19:
            app.nekogram.translator.r r6 = kf.h.f11359d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kf.f.f11349f
            java.lang.Object r1 = r1.get(r0)
            kf.n r1 = (kf.n) r1
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kf.f.f11345b
            long r2 = r2.getAndIncrement(r0)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r0.w(r2, r7)
            int r9 = kf.h.f11357b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r13 = (int) r12
            long r14 = r1.f15854c
            int r12 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r12 == 0) goto L55
            kf.n r2 = kf.f.b(r0, r2, r1)
            if (r2 != 0) goto L54
            if (r7 == 0) goto L23
            java.lang.Throwable r1 = r0.t()
            kf.k r2 = new kf.k
            r2.<init>(r1)
            return r2
        L54:
            r1 = r2
        L55:
            r3 = r17
            r2 = r13
            int r12 = kf.f.h(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb9
            r3 = 1
            if (r12 == r3) goto Lb8
            r3 = 2
            if (r12 == r3) goto L91
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L23
        L6e:
            r1.a()
            goto L23
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kf.f.f11346c
            long r2 = r2.get(r0)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L7f
            r1.a()
        L7f:
            java.lang.Throwable r1 = r0.t()
            kf.k r2 = new kf.k
            r2.<init>(r1)
            return r2
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L91:
            if (r7 == 0) goto La0
            r1.i()
            java.lang.Throwable r1 = r0.t()
            kf.k r2 = new kf.k
            r2.<init>(r1)
            return r2
        La0:
            boolean r3 = r6 instanceof hf.c2
            if (r3 == 0) goto La7
            hf.c2 r6 = (hf.c2) r6
            goto La8
        La7:
            r6 = 0
        La8:
            if (r6 == 0) goto Laf
            int r13 = r2 + r9
            r6.a(r1, r13)
        Laf:
            long r3 = r1.f15854c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.o(r3)
        Lb8:
            return r8
        Lb9:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.q.I(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // kf.f, kf.u
    public final Object e(Object obj) {
        return I(obj, false);
    }

    @Override // kf.f, kf.u
    public final Object j(Object obj, yb.c cVar) throws Throwable {
        if (I(obj, true) instanceof k) {
            throw t();
        }
        return a0.f21526a;
    }

    @Override // kf.f
    public final boolean y() {
        return this.f11383k == a.f11337b;
    }
}
