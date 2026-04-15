package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements ff.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2038b;

    public /* synthetic */ q0(int i10, boolean z10, long j10) {
        this.f2038b = i10;
        this.f2037a = j10;
    }

    public static q0 b(r5.o oVar, p4.s sVar) {
        oVar.z(sVar.f16611a, 0, 8);
        sVar.G(0);
        return new q0(sVar.g(), false, sVar.l());
    }

    public boolean a() {
        int i10 = this.f2038b;
        return i10 == 0 || i10 == 1;
    }

    @Override // ff.h
    public ff.d toInstant() {
        ff.d dVar = ff.d.f7068c;
        ff.d dVar2 = ff.d.f7068c;
        long j10 = dVar2.f7070a;
        long j11 = this.f2037a;
        if (j11 >= j10) {
            ff.d dVar3 = ff.d.f7069d;
            if (j11 <= dVar3.f7070a) {
                long j12 = this.f2038b;
                long j13 = j12 / 1000000000;
                if ((j12 ^ 1000000000) < 0 && j13 * 1000000000 != j12) {
                    j13--;
                }
                long j14 = j11 + j13;
                if ((j11 ^ j14) < 0 && (j13 ^ j11) >= 0) {
                    return j11 > 0 ? dVar3 : dVar2;
                }
                if (j14 >= -31557014167219200L) {
                    if (j14 <= 31556889864403199L) {
                        long j15 = j12 % 1000000000;
                        return new ff.d(j14, (int) (j15 + ((((j15 ^ 1000000000) & ((-j15) | j15)) >> 63) & 1000000000)));
                    }
                }
            }
        }
        throw new ff.e(0, "The parsed date is outside the range representable by Instant (Unix epoch second " + j11 + ')');
    }

    public q0(int i10, long j10) {
        p4.c.c(j10 >= 0);
        this.f2038b = i10;
        this.f2037a = j10;
    }

    public q0(long j10, int i10) {
        this.f2037a = j10;
        this.f2038b = i10;
    }
}
