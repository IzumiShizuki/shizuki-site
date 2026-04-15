package bh;

import c2.t;
import jc.l;
import p4.c0;
import r5.b0;
import r5.h0;
import r5.j;
import r5.o;
import r5.q;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements y4.h, o, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3008c;

    public /* synthetic */ a(long j10, Object obj, int i10) {
        this.f3006a = i10;
        this.f3007b = j10;
        this.f3008c = obj;
    }

    public long A(t tVar, float f10) {
        long jI = p1.b.i(this.f3007b, p1.b.h(tVar.f3324c, tVar.f3328g));
        this.f3007b = jI;
        e1 e1Var = (e1) this.f3008c;
        if ((e1Var == null ? p1.b.d(jI) : Math.abs(D(jI))) < f10) {
            return 9205357640488583168L;
        }
        if (e1Var == null) {
            long j10 = this.f3007b;
            return p1.b.h(this.f3007b, p1.b.j(f10, p1.b.b(p1.b.d(j10), j10)));
        }
        float fD = D(this.f3007b) - (Math.signum(D(this.f3007b)) * f10);
        long j11 = this.f3007b;
        e1 e1Var2 = e1.f20883b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e1Var == e1Var2 ? j11 & 4294967295L : j11 >> 32));
        if (e1Var == e1Var2) {
            return (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
    }

    public int B(int i10) {
        a aVar = (a) this.f3008c;
        if (aVar == null) {
            return i10 >= 64 ? Long.bitCount(this.f3007b) : Long.bitCount(this.f3007b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f3007b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f3007b) + aVar.B(i10 - 64);
    }

    public boolean C(int i10) {
        if (i10 < 64) {
            return (this.f3007b & (1 << i10)) != 0;
        }
        if (((a) this.f3008c) == null) {
            this.f3008c = new a();
        }
        return ((a) this.f3008c).C(i10 - 64);
    }

    public float D(long j10) {
        return Float.intBitsToFloat((int) (((e1) this.f3008c) == e1.f20883b ? j10 >> 32 : j10 & 4294967295L));
    }

    public void E() {
        this.f3007b = 0L;
        a aVar = (a) this.f3008c;
        if (aVar != null) {
            aVar.E();
        }
    }

    @Override // r5.q
    public void a(b0 b0Var) {
        ((q) this.f3008c).a(new z5.c(this, b0Var, b0Var));
    }

    @Override // y4.h
    public long b(long j10) {
        return ((j) this.f3008c).f18838e[(int) j10] - this.f3007b;
    }

    @Override // y4.h
    public long c(long j10, long j11) {
        return ((j) this.f3008c).f18837d[(int) j10];
    }

    @Override // r5.o
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((o) this.f3008c).d(bArr, 0, i11, z10);
    }

    @Override // y4.h
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // y4.h
    public long g(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // r5.o
    public long getLength() {
        return ((o) this.f3008c).getLength() - this.f3007b;
    }

    @Override // r5.o
    public long getPosition() {
        return ((o) this.f3008c).getPosition() - this.f3007b;
    }

    @Override // y4.h
    public z4.j h(long j10) {
        return new z4.j(null, ((j) this.f3008c).f18836c[(int) j10], r1.f18835b[r8]);
    }

    @Override // r5.o
    public boolean i(byte[] bArr, int i10, int i11, boolean z10) {
        return ((o) this.f3008c).i(bArr, i10, i11, z10);
    }

    @Override // r5.o
    public long j() {
        return ((o) this.f3008c).j() - this.f3007b;
    }

    @Override // r5.o
    public void k(int i10) {
        ((o) this.f3008c).k(i10);
    }

    @Override // y4.h
    public long l(long j10, long j11) {
        j jVar = (j) this.f3008c;
        return c0.e(jVar.f18838e, j10 + this.f3007b, true);
    }

    @Override // r5.o
    public int m(int i10) {
        return ((o) this.f3008c).m(i10);
    }

    @Override // r5.q
    public void n() {
        ((q) this.f3008c).n();
    }

    @Override // r5.o
    public int o(byte[] bArr, int i10, int i11) {
        return ((o) this.f3008c).o(bArr, i10, i11);
    }

    @Override // r5.o
    public void q() {
        ((o) this.f3008c).q();
    }

    @Override // r5.o
    public void r(int i10) {
        ((o) this.f3008c).r(i10);
    }

    @Override // m4.i
    public int read(byte[] bArr, int i10, int i11) {
        return ((o) this.f3008c).read(bArr, i10, i11);
    }

    @Override // r5.o
    public void readFully(byte[] bArr, int i10, int i11) {
        ((o) this.f3008c).readFully(bArr, i10, i11);
    }

    @Override // y4.h
    public boolean s() {
        return true;
    }

    public String toString() {
        switch (this.f3006a) {
            case 1:
                if (((a) this.f3008c) == null) {
                    return Long.toBinaryString(this.f3007b);
                }
                return ((a) this.f3008c).toString() + "xx" + Long.toBinaryString(this.f3007b);
            default:
                return super.toString();
        }
    }

    @Override // r5.q
    public h0 u(int i10, int i11) {
        return ((q) this.f3008c).u(i10, i11);
    }

    @Override // y4.h
    public long v() {
        return 0L;
    }

    @Override // y4.h
    public long x(long j10) {
        return ((j) this.f3008c).f18834a;
    }

    @Override // y4.h
    public long y(long j10, long j11) {
        return ((j) this.f3008c).f18834a;
    }

    @Override // r5.o
    public void z(byte[] bArr, int i10, int i11) {
        ((o) this.f3008c).z(bArr, i10, i11);
    }

    public /* synthetic */ a(Object obj, long j10, int i10) {
        this.f3006a = i10;
        this.f3008c = obj;
        this.f3007b = j10;
    }

    public a(lh.b0 b0Var) {
        this.f3006a = 0;
        l.e(b0Var, "source");
        this.f3008c = b0Var;
        this.f3007b = 262144L;
    }

    public a(o oVar, long j10) {
        this.f3006a = 5;
        this.f3008c = oVar;
        p4.c.c(oVar.getPosition() >= j10);
        this.f3007b = j10;
    }

    public a() {
        this.f3006a = 1;
        this.f3007b = 0L;
    }
}
