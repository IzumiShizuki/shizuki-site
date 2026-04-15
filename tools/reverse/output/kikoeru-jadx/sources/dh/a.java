package dh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6012c;

    public a(int i10) {
        this.f6010a = i10;
    }

    public static void b(a aVar, long j10, long j11, int i10) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        synchronized (aVar) {
            try {
                if (j10 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j11 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j12 = aVar.f6011b + j10;
                aVar.f6011b = j12;
                long j13 = aVar.f6012c + j11;
                aVar.f6012c = j13;
                if (j13 > j12) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized long a() {
        return this.f6011b - this.f6012c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f6010a + ", total=" + this.f6011b + ", acknowledged=" + this.f6012c + ", unacknowledged=" + a() + ')';
    }
}
