package r5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18827a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18833g;

    public final void a(h0 h0Var, g0 g0Var) {
        if (this.f18829c > 0) {
            h0Var.a(this.f18830d, this.f18831e, this.f18832f, this.f18833g, g0Var);
            this.f18829c = 0;
        }
    }

    public final void b(h0 h0Var, long j10, int i10, int i11, int i12, g0 g0Var) {
        p4.c.h("TrueHD chunk samples must be contiguous in the sample queue.", this.f18833g <= i11 + i12);
        if (this.f18828b) {
            int i13 = this.f18829c;
            int i14 = i13 + 1;
            this.f18829c = i14;
            if (i13 == 0) {
                this.f18830d = j10;
                this.f18831e = i10;
                this.f18832f = 0;
            }
            this.f18832f += i11;
            this.f18833g = i12;
            if (i14 >= 16) {
                a(h0Var, g0Var);
            }
        }
    }

    public final void c(o oVar) {
        if (this.f18828b) {
            return;
        }
        byte[] bArr = this.f18827a;
        oVar.z(bArr, 0, 10);
        oVar.q();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                i = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f18828b = true;
    }
}
