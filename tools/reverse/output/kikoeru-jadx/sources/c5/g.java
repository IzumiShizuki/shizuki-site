package c5;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m5.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3439g;

    @Override // m5.r
    public final int c() {
        return this.f3439g;
    }

    @Override // m5.r
    public final void f(long j10, long j11, long j12, List list, k5.m[] mVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.f3439g, jElapsedRealtime)) {
            for (int i10 = this.f14668b - 1; i10 >= 0; i10--) {
                if (!a(i10, jElapsedRealtime)) {
                    this.f3439g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // m5.r
    public final int n() {
        return 0;
    }

    @Override // m5.r
    public final Object q() {
        return null;
    }
}
