package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j1.q f13082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j1.q f13083d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13080a = 56;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y.e0 f13084e = y.d.e(0);

    static {
        float f10 = 4;
        f13081b = f10;
        f13082c = androidx.compose.foundation.layout.c.n(j1.n.f9689a, 16 - f10);
        f13083d = androidx.compose.foundation.layout.c.n(androidx.compose.foundation.layout.c.f556b, 72 - f10);
    }

    public static final void a(long j10, long j11, float f10, y.d1 d1Var, y.r1 r1Var, j1.q qVar, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(1222317265);
        if ((i10 & 6) == 0) {
            i11 = (oVar.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.e(j11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.c(f10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(d1Var) ? 2048 : 1024;
        }
        int i12 = i10 & 24576;
        q1.g0 g0Var = q1.h0.f17515a;
        if (i12 == 0) {
            i11 |= oVar.f(g0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.f(r1Var) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= oVar.f(qVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= oVar.h(fVar) ? 8388608 : 4194304;
        }
        if (oVar.N(i11 & 1, (4793491 & i11) != 4793490)) {
            int i13 = i11 << 6;
            android.support.v4.media.session.b.m(qVar, g0Var, j10, j11, null, f10, f1.g.f(-1628734195, new f0(r1Var, d1Var, fVar, 1), oVar), oVar, 1572864 | ((i11 >> 18) & 14) | ((i11 >> 9) & 112) | (i13 & 896) | (i13 & 7168) | ((i11 << 9) & 458752), 16);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new la.r(j10, j11, f10, d1Var, r1Var, qVar, fVar, i10);
        }
    }

    public static final void b(final f1.f fVar, final y.r1 r1Var, final j1.q qVar, final ic.n nVar, final f1.f fVar2, final long j10, final long j11, final float f10, x0.o oVar, final int i10) {
        int i11;
        oVar.Y(138090236);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(r1Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(nVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(fVar2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.e(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= oVar.e(j11) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= oVar.c(f10) ? 8388608 : 4194304;
        }
        if (oVar.N(i11 & 1, (4793491 & i11) != 4793490)) {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            int i12 = i11 >> 15;
            int i13 = i11 << 12;
            a(j10, j11, f10, c0.f12772b, r1Var, qVar, f1.g.f(-2019867954, new h0(nVar, fVar, fVar2, 0), oVar), oVar, (i12 & 14) | 12610560 | (i12 & 112) | (i12 & 896) | (i13 & 458752) | (i13 & 3670016));
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.e0
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i0.b(fVar, r1Var, qVar, nVar, fVar2, j10, j11, f10, (x0.o) obj, x0.v.D(i10 | 1));
                    return ub.a0.f21526a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(f1.f r17, j1.q r18, ic.n r19, f1.f r20, long r21, long r23, float r25, x0.o r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.i0.c(f1.f, j1.q, ic.n, f1.f, long, long, float, x0.o, int, int):void");
    }
}
