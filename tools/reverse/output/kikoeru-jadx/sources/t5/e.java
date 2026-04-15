package t5;

import java.math.RoundingMode;
import p4.c0;
import r5.a0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f20524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f20525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f20535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f20536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f20537n;

    public e(int i10, d dVar, h0 h0Var) {
        int i11 = dVar.f20521d;
        this.f20524a = dVar;
        int iA = dVar.a();
        boolean z10 = true;
        if (iA != 1 && iA != 2) {
            z10 = false;
        }
        p4.c.c(z10);
        int i12 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f20526c = (iA == 2 ? 1667497984 : 1651965952) | i12;
        long j10 = ((long) dVar.f20519b) * 1000000;
        long j11 = dVar.f20520c;
        int i13 = c0.f16548a;
        this.f20528e = c0.V(i11, j10, j11, RoundingMode.DOWN);
        this.f20525b = h0Var;
        this.f20527d = iA == 2 ? i12 | 1650720768 : -1;
        this.f20535l = -1L;
        this.f20536m = new long[512];
        this.f20537n = new int[512];
        this.f20529f = i11;
    }

    public final r5.c0 a(int i10) {
        return new r5.c0(((this.f20528e * ((long) 1)) / ((long) this.f20529f)) * ((long) this.f20537n[i10]), this.f20536m[i10]);
    }

    public final a0 b(long j10) {
        if (this.f20534k == 0) {
            r5.c0 c0Var = new r5.c0(0L, this.f20535l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j10 / ((this.f20528e * ((long) 1)) / ((long) this.f20529f)));
        int iD = c0.d(this.f20537n, i10, true, true);
        if (this.f20537n[iD] == i10) {
            r5.c0 c0VarA = a(iD);
            return new a0(c0VarA, c0VarA);
        }
        r5.c0 c0VarA2 = a(iD);
        int i11 = iD + 1;
        return i11 < this.f20536m.length ? new a0(c0VarA2, a(i11)) : new a0(c0VarA2, c0VarA2);
    }
}
