package r2;

import ah.j;
import android.os.Handler;
import i2.d1;
import i2.g1;
import i2.j0;
import i2.o1;
import o.g0;
import q1.a0;
import z0.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f18731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f18732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i3.a f18736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f18738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1.a f18739j;

    public b() {
        j jVar = new j(13, (char) 0);
        jVar.f391c = new long[192];
        jVar.f392d = new long[192];
        this.f18730a = jVar;
        this.f18731b = new c();
        this.f18732c = new g0();
        this.f18737h = -1L;
        this.f18738i = new a(0, this);
        this.f18739j = new p1.a();
    }

    public static long a(g1 g1Var, long j10) {
        float[] fArrMo0getUnderlyingMatrixsQKQjiQ;
        int iD;
        o1 o1Var = g1Var.K;
        if (o1Var == null || (iD = nh.b.d((fArrMo0getUnderlyingMatrixsQKQjiQ = o1Var.mo0getUnderlyingMatrixsQKQjiQ()))) == 3) {
            return j10;
        }
        if ((iD & 2) == 0) {
            return 9223372034707292159L;
        }
        return android.support.v4.media.session.b.X(a0.b((((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32), fArrMo0getUnderlyingMatrixsQKQjiQ));
    }

    public static long h(j0 j0Var) {
        d1 d1Var = j0Var.F;
        g1 g1Var = d1Var.f8665d;
        long jD = 0;
        for (g1 g1Var2 = d1Var.f8664c; g1Var2 != null && g1Var2 != g1Var; g1Var2 = g1Var2.f8704s) {
            long jA = a(g1Var2, jD);
            if (f3.j.b(jA, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            jD = f3.j.d(jA, g1Var2.B);
        }
        return jD;
    }

    public static void i(j0 j0Var) {
        long jH;
        g1 g1Var = j0Var.F.f8665d;
        long jA = a(g1Var, 0L);
        long jD = 9223372034707292159L;
        if (!nh.b.f(jA)) {
            j0Var.f8744c = 9223372034707292159L;
            return;
        }
        long jD2 = f3.j.d(jA, g1Var.B);
        j0 j0VarV = j0Var.v();
        if (j0VarV != null) {
            if (!nh.b.f(j0VarV.f8744c)) {
                i(j0VarV);
            }
            long j10 = j0VarV.f8744c;
            if (nh.b.f(j10)) {
                if (j0VarV.f8747f) {
                    jH = h(j0VarV);
                    j0VarV.f8746e = jH;
                    j0VarV.f8747f = false;
                } else {
                    jH = j0VarV.f8746e;
                }
                if (nh.b.f(jH)) {
                    jD = f3.j.d(f3.j.d(j10, jH), jD2);
                }
            }
        } else {
            jD = jD2;
        }
        j0Var.f8744c = jD;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.b.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(i2.j0 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.b.c(i2.j0, boolean):void");
    }

    public final void d(j0 j0Var) {
        e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            c(j0Var2, false);
            d(j0Var2);
        }
    }

    public final void e(j0 j0Var) {
        this.f18733d = true;
        int i10 = j0Var.f8743b & 67108863;
        j jVar = this.f18730a;
        long[] jArr = (long[]) jVar.f391c;
        int i11 = jVar.f390b;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            long j10 = jArr[i13];
            if ((((int) j10) & 67108863) == i10) {
                jArr[i13] = 2305843009213693952L | j10;
                break;
            }
            i12 += 3;
        }
        k();
    }

    public final void f(j0 j0Var) {
        long jH = h(j0Var);
        if (!nh.b.f(jH)) {
            d(j0Var);
            return;
        }
        j0Var.f8746e = jH;
        j0Var.f8747f = false;
        e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            g((j0) objArr[i11], false);
        }
        e(j0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(i2.j0 r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.b.g(i2.j0, boolean):void");
    }

    public final void j(j0 j0Var) {
        int i10 = j0Var.f8743b & 67108863;
        j jVar = this.f18730a;
        long[] jArr = (long[]) jVar.f391c;
        int i11 = jVar.f390b;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            if ((((int) jArr[i13]) & 67108863) == i10) {
                jArr[i12] = -1;
                jArr[i12 + 1] = -1;
                jArr[i13] = 2305843009213693951L;
                break;
            }
            i12 += 3;
        }
        this.f18733d = true;
        this.f18735f = true;
    }

    public final void k() {
        i3.a aVar = this.f18736g;
        boolean z10 = aVar != null;
        long j10 = this.f18731b.f18741b;
        if (j10 >= 0 || !z10) {
            if (this.f18737h == j10 && z10) {
                return;
            }
            if (aVar != null) {
                Handler handler = j1.b.f9661a;
                j1.b.f9661a.removeCallbacks(aVar);
            }
            Handler handler2 = j1.b.f9661a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j10, ((long) 16) + jCurrentTimeMillis);
            this.f18737h = jMax;
            long j11 = jMax - jCurrentTimeMillis;
            i3.a aVar2 = new i3.a(2, this.f18738i);
            j1.b.f9661a.postDelayed(aVar2, j11);
            this.f18736g = aVar2;
        }
    }
}
