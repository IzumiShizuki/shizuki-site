package z6;

import java.math.RoundingMode;
import p4.c0;
import r5.a0;
import r5.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6.d f26506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26510e;

    public e(l6.d dVar, int i10, long j10, long j11) {
        this.f26506a = dVar;
        this.f26507b = i10;
        this.f26508c = j10;
        long j12 = (j11 - j10) / ((long) dVar.f11738d);
        this.f26509d = j12;
        this.f26510e = a(j12);
    }

    public final long a(long j10) {
        long j11 = j10 * ((long) this.f26507b);
        long j12 = this.f26506a.f11737c;
        int i10 = c0.f16548a;
        return c0.V(j11, 1000000L, j12, RoundingMode.DOWN);
    }

    @Override // r5.b0
    public final boolean e() {
        return true;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        l6.d dVar = this.f26506a;
        long j11 = (((long) dVar.f11737c) * j10) / (((long) this.f26507b) * 1000000);
        long j12 = this.f26509d;
        long j13 = c0.j(j11, 0L, j12 - 1);
        long j14 = ((long) dVar.f11738d) * j13;
        long j15 = this.f26508c;
        long jA = a(j13);
        r5.c0 c0Var = new r5.c0(jA, j14 + j15);
        if (jA >= j10 || j13 == j12 - 1) {
            return new a0(c0Var, c0Var);
        }
        long j16 = j13 + 1;
        return new a0(c0Var, new r5.c0(a(j16), (((long) dVar.f11738d) * j16) + j15));
    }

    @Override // r5.b0
    public final long m() {
        return this.f26510e;
    }
}
