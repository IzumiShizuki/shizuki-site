package y6;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.y f25858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f25859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25865i;

    public x(int i10) {
        this.f25857a = i10;
        switch (i10) {
            case 1:
                this.f25858b = new p4.y(0L);
                this.f25863g = -9223372036854775807L;
                this.f25864h = -9223372036854775807L;
                this.f25865i = -9223372036854775807L;
                this.f25859c = new p4.s();
                break;
            default:
                this.f25858b = new p4.y(0L);
                this.f25863g = -9223372036854775807L;
                this.f25864h = -9223372036854775807L;
                this.f25865i = -9223372036854775807L;
                this.f25859c = new p4.s();
                break;
        }
    }

    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(p4.s sVar) {
        int i10 = sVar.f16612b;
        if (sVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        sVar.e(bArr, 0, 9);
        sVar.G(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(r5.o oVar) {
        switch (this.f25857a) {
            case 0:
                byte[] bArr = p4.c0.f16553f;
                p4.s sVar = this.f25859c;
                sVar.getClass();
                sVar.E(bArr, bArr.length);
                this.f25860d = true;
                oVar.q();
                break;
            default:
                byte[] bArr2 = p4.c0.f16553f;
                p4.s sVar2 = this.f25859c;
                sVar2.getClass();
                sVar2.E(bArr2, bArr2.length);
                this.f25860d = true;
                oVar.q();
                break;
        }
    }
}
