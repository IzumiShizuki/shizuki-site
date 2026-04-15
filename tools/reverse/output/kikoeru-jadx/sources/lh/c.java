package lh;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c extends j0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b7.m f12547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static c f12548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f12549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Condition f12550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f12551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f12552m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12554f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12555g;

    static {
        b7.m mVar = new b7.m(5, (char) 0);
        mVar.f1959c = new c[8];
        f12547h = mVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f12549j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        jc.l.d(conditionNewCondition, "newCondition(...)");
        f12550k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f12551l = millis;
        f12552m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j10 = this.f12582c;
        boolean z10 = this.f12580a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = f12549j;
            reentrantLock.lock();
            try {
                if (this.f12553e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f12553e = 1;
                g5.w.n(this, j10, z10);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f12549j;
        reentrantLock.lock();
        try {
            int i10 = this.f12553e;
            this.f12553e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f12547h.v(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
