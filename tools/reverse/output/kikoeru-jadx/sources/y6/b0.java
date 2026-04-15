package y6;

import m7.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f25570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.s f25571b = new p4.s(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25575f;

    public b0(a0 a0Var) {
        this.f25570a = a0Var;
    }

    @Override // y6.f0
    public final void a() {
        this.f25575f = true;
    }

    @Override // y6.f0
    public final void b(int i10, p4.s sVar) {
        boolean z10 = (i10 & 1) != 0;
        int iU = z10 ? sVar.f16612b + sVar.u() : -1;
        if (this.f25575f) {
            if (!z10) {
                return;
            }
            this.f25575f = false;
            sVar.G(iU);
            this.f25573d = 0;
        }
        while (sVar.a() > 0) {
            int i11 = this.f25573d;
            p4.s sVar2 = this.f25571b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iU2 = sVar.u();
                    sVar.G(sVar.f16612b - 1);
                    if (iU2 == 255) {
                        this.f25575f = true;
                        return;
                    }
                }
                int iMin = Math.min(sVar.a(), 3 - this.f25573d);
                sVar.e(sVar2.f16611a, this.f25573d, iMin);
                int i12 = this.f25573d + iMin;
                this.f25573d = i12;
                if (i12 == 3) {
                    sVar2.G(0);
                    sVar2.F(3);
                    sVar2.H(1);
                    int iU3 = sVar2.u();
                    int iU4 = sVar2.u();
                    this.f25574e = (iU3 & 128) != 0;
                    int i13 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f25572c = i13;
                    byte[] bArr = sVar2.f16611a;
                    if (bArr.length < i13) {
                        sVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(sVar.a(), this.f25572c - this.f25573d);
                sVar.e(sVar2.f16611a, this.f25573d, iMin2);
                int i14 = this.f25573d + iMin2;
                this.f25573d = i14;
                int i15 = this.f25572c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f25574e) {
                        sVar2.F(i15);
                    } else {
                        if (p4.c0.m(0, i15, -1, sVar2.f16611a) != 0) {
                            this.f25575f = true;
                            return;
                        }
                        sVar2.F(this.f25572c - 4);
                    }
                    sVar2.G(0);
                    this.f25570a.b(sVar2);
                    this.f25573d = 0;
                }
            }
        }
    }

    @Override // y6.f0
    public final void c(p4.y yVar, r5.q qVar, k0 k0Var) {
        this.f25570a.c(yVar, qVar, k0Var);
        this.f25575f = true;
    }
}
