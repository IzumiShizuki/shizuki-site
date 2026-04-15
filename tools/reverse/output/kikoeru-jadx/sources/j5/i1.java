package j5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements n5.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.m f10305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.d0 f10306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f10307c;

    public i1(s4.h hVar, s4.m mVar) {
        u.f10444b.getAndIncrement();
        this.f10305a = mVar;
        this.f10306b = new s4.d0(hVar);
    }

    @Override // n5.l
    public final void i() {
        s4.d0 d0Var = this.f10306b;
        d0Var.f19398b = 0L;
        try {
            d0Var.f(this.f10305a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) d0Var.f19398b;
                byte[] bArr = this.f10307c;
                if (bArr == null) {
                    this.f10307c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f10307c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f10307c;
                i10 = d0Var.read(bArr2, i11, bArr2.length - i11);
            }
            nh.a.h(d0Var);
        } catch (Throwable th2) {
            nh.a.h(d0Var);
            throw th2;
        }
    }

    @Override // n5.l
    public final void l() {
    }
}
