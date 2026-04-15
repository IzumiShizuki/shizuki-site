package yf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k5.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26285d;

    public f(b7.m mVar, boolean z10) {
        super(mVar);
        this.f26285d = z10;
    }

    @Override // k5.d
    public final void f(byte b10) {
        if (this.f26285d) {
            l(String.valueOf(b10 & 255));
        } else {
            j(String.valueOf(b10 & 255));
        }
    }

    @Override // k5.d
    public final void h(int i10) {
        if (this.f26285d) {
            l(Long.toString(4294967295L & ((long) i10), 10));
        } else {
            j(Long.toString(4294967295L & ((long) i10), 10));
        }
    }

    @Override // k5.d
    public final void i(long j10) {
        int i10 = 63;
        String str = "0";
        if (this.f26285d) {
            if (j10 != 0) {
                if (j10 > 0) {
                    str = Long.toString(j10, 10);
                } else {
                    char[] cArr = new char[64];
                    long j11 = (j10 >>> 1) / ((long) 5);
                    long j12 = 10;
                    cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
                    while (j11 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j11 % j12), 10);
                        j11 /= j12;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            l(str);
            return;
        }
        if (j10 != 0) {
            if (j10 > 0) {
                str = Long.toString(j10, 10);
            } else {
                char[] cArr2 = new char[64];
                long j13 = (j10 >>> 1) / ((long) 5);
                long j14 = 10;
                cArr2[63] = Character.forDigit((int) (j10 - (j13 * j14)), 10);
                while (j13 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j13 % j14), 10);
                    j13 /= j14;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        j(str);
    }

    @Override // k5.d
    public final void k(short s10) {
        if (this.f26285d) {
            l(String.valueOf(s10 & 65535));
        } else {
            j(String.valueOf(s10 & 65535));
        }
    }
}
