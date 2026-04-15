package z4;

import java.math.RoundingMode;
import java.util.List;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f26444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f26446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26447i;

    public n(j jVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(jVar, j10, j11);
        this.f26442d = j12;
        this.f26443e = j13;
        this.f26444f = list;
        this.f26447i = j14;
        this.f26445g = j15;
        this.f26446h = j16;
    }

    public final long b(long j10, long j11) {
        long jD = d(j10);
        return jD != -1 ? jD : (int) (f((j11 - this.f26446h) + this.f26447i, j10) - c(j10, j11));
    }

    public final long c(long j10, long j11) {
        long jD = d(j10);
        long j12 = this.f26442d;
        if (jD == -1) {
            long j13 = this.f26445g;
            if (j13 != -9223372036854775807L) {
                return Math.max(j12, f((j11 - this.f26446h) - j13, j10));
            }
        }
        return j12;
    }

    public abstract long d(long j10);

    public final long e(long j10, long j11) {
        long j12 = this.f26457b;
        long j13 = this.f26442d;
        List list = this.f26444f;
        if (list != null) {
            return (((q) list.get((int) (j10 - j13))).f26453b * 1000000) / j12;
        }
        long jD = d(j11);
        return (jD == -1 || j10 != (j13 + jD) - 1) ? (this.f26443e * 1000000) / j12 : j11 - g(j10);
    }

    public final long f(long j10, long j11) {
        long jD = d(j11);
        long j12 = this.f26442d;
        if (jD != 0) {
            if (this.f26444f != null) {
                long j13 = (jD + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long jG = g(j15);
                    if (jG < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (jG <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.f26443e * 1000000) / this.f26457b)) + j12;
            if (j16 >= j12) {
                return jD == -1 ? j16 : Math.min(j16, (j12 + jD) - 1);
            }
        }
        return j12;
    }

    public final long g(long j10) {
        long j11 = this.f26442d;
        List list = this.f26444f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).f26452a - this.f26458c : (j10 - j11) * this.f26443e;
        int i10 = c0.f16548a;
        return c0.V(j12, 1000000L, this.f26457b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j10);

    public boolean i() {
        return this.f26444f != null;
    }
}
