package y6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f25682f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f25687e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f25683a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f25687e;
            int length = bArr2.length;
            int i13 = this.f25685c + i12;
            if (length < i13) {
                this.f25687e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f25687e, this.f25685c, i12);
            this.f25685c += i12;
        }
    }
}
