package m4;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14299e;

    public /* synthetic */ j(byte b10, int i10) {
        this.f14295a = i10;
    }

    public void a(int i10) {
        int[] iArr = (int[]) this.f14299e;
        int i11 = this.f14297c;
        iArr[i11] = i10;
        int i12 = this.f14298d & (i11 + 1);
        this.f14297c = i12;
        int i13 = this.f14296b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i15];
            vb.l.h0(0, i13, length, iArr, iArr2);
            vb.l.h0(i14, 0, this.f14296b, (int[]) this.f14299e, iArr2);
            this.f14299e = iArr2;
            this.f14296b = 0;
            this.f14297c = length;
            this.f14298d = i15 - 1;
        }
    }

    public void b(p7.f fVar) {
        Object[] objArr = (Object[]) this.f14299e;
        int i10 = this.f14297c;
        objArr[i10] = fVar;
        int i11 = this.f14298d & (i10 + 1);
        this.f14297c = i11;
        int i12 = this.f14296b;
        if (i11 == i12) {
            int length = objArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i14];
            vb.l.i0(0, i12, length, objArr, objArr2);
            vb.l.i0(i13, 0, this.f14296b, (Object[]) this.f14299e, objArr2);
            this.f14299e = objArr2;
            this.f14296b = 0;
            this.f14297c = length;
            this.f14298d = i14 - 1;
        }
    }

    public k c() {
        p4.c.c(this.f14297c <= this.f14298d);
        return new k(this);
    }

    public int d() {
        return this.f14298d - this.f14297c;
    }

    public int e(int i10) {
        return ((y0.k0) this.f14299e).f25330c[this.f14297c + i10];
    }

    public Object f(int i10) {
        return ((y0.k0) this.f14299e).f25332e[this.f14298d + i10];
    }

    public long g() {
        int i10 = this.f14297c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f14299e;
        int i11 = this.f14296b;
        long j10 = jArr[i11];
        this.f14296b = this.f14298d & (i11 + 1);
        this.f14297c = i10 - 1;
        return j10;
    }

    public String toString() {
        switch (this.f14295a) {
            case 5:
                return "";
            default:
                return super.toString();
        }
    }

    public j() {
        this.f14295a = 2;
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f14298d = iHighestOneBit - 1;
        this.f14299e = new int[iHighestOneBit];
    }

    public j(int i10) {
        this.f14295a = 0;
        this.f14296b = i10;
    }

    public j(y0.k0 k0Var) {
        this.f14295a = 4;
        this.f14299e = k0Var;
    }
}
