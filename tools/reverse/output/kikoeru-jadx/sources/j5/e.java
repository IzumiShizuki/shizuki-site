package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10253i;

    public e(m4.i1 i1Var, long j10, long j11) throws f {
        super(i1Var);
        boolean z10 = false;
        if (i1Var.h() != 1) {
            throw new f(0);
        }
        m4.h1 h1VarM = i1Var.m(0, new m4.h1(), 0L);
        long jMax = Math.max(0L, j10);
        if (!h1VarM.f14272k && jMax != 0 && !h1VarM.f14269h) {
            throw new f(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? h1VarM.f14274m : Math.max(0L, j11);
        long j12 = h1VarM.f14274m;
        if (j12 != -9223372036854775807L) {
            long j13 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > j13) {
                throw new f(2, jMax, j13);
            }
            jMax2 = j13;
        }
        this.f10250f = jMax;
        this.f10251g = jMax2;
        this.f10252h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (h1VarM.f14270i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z10 = true;
        }
        this.f10253i = z10;
    }

    @Override // j5.s, m4.i1
    public final m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        this.f10410e.f(0, f1Var, z10);
        long j10 = f1Var.f14205e - this.f10250f;
        long j11 = this.f10252h;
        f1Var.i(f1Var.f14201a, f1Var.f14202b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, m4.b.f14121f, false);
        return f1Var;
    }

    @Override // j5.s, m4.i1
    public final m4.h1 m(int i10, m4.h1 h1Var, long j10) {
        this.f10410e.m(0, h1Var, 0L);
        long j11 = h1Var.f14277p;
        long j12 = this.f10250f;
        h1Var.f14277p = j11 + j12;
        h1Var.f14274m = this.f10252h;
        h1Var.f14270i = this.f10253i;
        long j13 = h1Var.f14273l;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            h1Var.f14273l = jMax;
            long j14 = this.f10251g;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            h1Var.f14273l = jMax - j12;
        }
        long jC0 = p4.c0.c0(j12);
        long j15 = h1Var.f14266e;
        if (j15 != -9223372036854775807L) {
            h1Var.f14266e = j15 + jC0;
        }
        long j16 = h1Var.f14267f;
        if (j16 != -9223372036854775807L) {
            h1Var.f14267f = j16 + jC0;
        }
        return h1Var;
    }
}
