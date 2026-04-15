package s5;

import d2.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import m4.p0;
import p4.c0;
import r5.b0;
import r5.h0;
import r5.m;
import r5.n;
import r5.o;
import r5.q;
import r5.y;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f19488q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f19489r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f19490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f19491t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f19493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19497f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f19501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h0 f19502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h0 f19503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b0 f19504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19507p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f19492a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19498g = -1;

    static {
        int i10 = c0.f16548a;
        Charset charset = StandardCharsets.UTF_8;
        f19490s = "#!AMR\n".getBytes(charset);
        f19491t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        m mVar = new m();
        this.f19493b = mVar;
        this.f19503l = mVar;
    }

    public final int b(o oVar) throws p0 {
        boolean z10;
        oVar.q();
        byte[] bArr = this.f19492a;
        oVar.z(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw p0.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f19494c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f19489r[i10] : f19488q[i10];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f19494c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i10);
        throw p0.a(null, sb.toString());
    }

    public final boolean d(o oVar) {
        oVar.q();
        byte[] bArr = f19490s;
        byte[] bArr2 = new byte[bArr.length];
        oVar.z(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f19494c = false;
            oVar.r(bArr.length);
            return true;
        }
        oVar.q();
        byte[] bArr3 = f19491t;
        byte[] bArr4 = new byte[bArr3.length];
        oVar.z(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f19494c = true;
        oVar.r(bArr3.length);
        return true;
    }

    @Override // r5.n
    public final boolean f(o oVar) {
        return d(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[PHI: r4
      0x00ec: PHI (r4v1 r5.o) = (r4v0 r5.o), (r4v5 r5.o) binds: [B:53:0x00e9, B:56:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r19, b0.a r20) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f19501j = qVar;
        h0 h0VarU = qVar.u(0, 1);
        this.f19502k = h0VarU;
        this.f19503l = h0VarU;
        qVar.n();
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.f19495d = 0L;
        this.f19496e = 0;
        this.f19497f = 0;
        this.f19506o = j11;
        b0 b0Var = this.f19504m;
        if (!(b0Var instanceof y)) {
            if (j10 == 0 || !(b0Var instanceof k6.a)) {
                this.f19500i = 0L;
                return;
            } else {
                k6.a aVar = (k6.a) b0Var;
                this.f19500i = (Math.max(0L, j10 - aVar.f11111b) * 8000000) / ((long) aVar.f11114e);
                return;
            }
        }
        y yVar = (y) b0Var;
        b bVar = yVar.f18895b;
        long jD = bVar.f5449b == 0 ? -9223372036854775807L : bVar.d(c0.b(yVar.f18894a, j10));
        this.f19500i = jD;
        if (Math.abs(this.f19506o - jD) < 20000) {
            return;
        }
        this.f19505n = true;
        this.f19503l = this.f19493b;
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final n c() {
        return this;
    }
}
