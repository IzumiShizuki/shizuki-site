package v4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22730e;

    public z(int i10) {
        this.f22726a = i10;
        byte[] bArr = new byte[131];
        this.f22730e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f22727b) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f22730e;
            int length = bArr2.length;
            int i13 = this.f22729d;
            if (length < i13 + i12) {
                this.f22730e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f22730e, this.f22729d, i12);
            this.f22729d += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f22727b) {
            return false;
        }
        this.f22729d -= i10;
        this.f22727b = false;
        this.f22728c = true;
        return true;
    }

    public void c(int i10) {
        this.f22727b |= i10 > 0;
        this.f22726a += i10;
    }

    public void d() {
        this.f22727b = false;
        this.f22728c = false;
    }

    public void e(int i10) {
        p4.c.i(!this.f22727b);
        boolean z10 = i10 == this.f22726a;
        this.f22727b = z10;
        if (z10) {
            this.f22729d = 3;
            this.f22728c = false;
        }
    }

    public z(u0 u0Var) {
        this.f22730e = u0Var;
    }
}
