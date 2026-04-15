package c5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k5.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f3434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f3435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f3436l;

    @Override // n5.l
    public final void i() {
        try {
            this.f11063i.f(this.f11056b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f3435k) {
                byte[] bArr = this.f3434j;
                if (bArr.length < i11 + 16384) {
                    this.f3434j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f11063i.read(this.f3434j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f3435k) {
                this.f3436l = Arrays.copyOf(this.f3434j, i11);
            }
            nh.a.h(this.f11063i);
        } catch (Throwable th2) {
            nh.a.h(this.f11063i);
            throw th2;
        }
    }

    @Override // n5.l
    public final void l() {
        this.f3435k = true;
    }
}
