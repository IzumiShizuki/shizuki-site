package rf;

import app.nekogram.translator.r;
import hf.a0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19016h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f19017a;
    }

    @Override // rf.a
    public final void b(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19016h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            r rVar = d.f19017a;
            if (obj2 != rVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    d();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean e() {
        return Math.max(h.f19024g.get(this), 0) == 0;
    }

    public final boolean f() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f19024g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f19025a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f19016h.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.f19015b;
        rf.c.f19016h.set(r2, null);
        r3 = r0.f19014a;
        r3.D(r1, r3.f8552c, new ba.l(4, new e7.y(13, r2, r0)));
     */
    @Override // rf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(yb.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.f()
            ub.a0 r1 = ub.a0.f21526a
            if (r0 == 0) goto L9
            goto L52
        L9:
            yb.c r7 = ud.s.p(r7)
            hf.k r7 = hf.a0.s(r7)
            rf.b r0 = new rf.b     // Catch: java.lang.Throwable -> L53
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L53
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = rf.h.f19024g     // Catch: java.lang.Throwable -> L53
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L53
            int r3 = r6.f19025a     // Catch: java.lang.Throwable -> L53
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3f
            rf.c r2 = r0.f19015b     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = rf.c.f19016h     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L53
            hf.k r3 = r0.f19014a     // Catch: java.lang.Throwable -> L53
            e7.y r4 = new e7.y     // Catch: java.lang.Throwable -> L53
            r5 = 13
            r4.<init>(r5, r2, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r3.f8552c     // Catch: java.lang.Throwable -> L53
            ba.l r2 = new ba.l     // Catch: java.lang.Throwable -> L53
            r5 = 4
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L53
            r3.D(r1, r0, r2)     // Catch: java.lang.Throwable -> L53
            goto L45
        L3f:
            boolean r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L16
        L45:
            java.lang.Object r7 = r7.q()
            zb.a r0 = zb.a.f26667a
            if (r7 != r0) goto L4e
            goto L4f
        L4e:
            r7 = r1
        L4f:
            if (r7 != r0) goto L52
            return r7
        L52:
            return r1
        L53:
            r0 = move-exception
            r7.C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.c.g(yb.c):java.lang.Object");
    }

    public final String toString() {
        return "Mutex@" + a0.q(this) + "[isLocked=" + e() + ",owner=" + f19016h.get(this) + ']';
    }
}
