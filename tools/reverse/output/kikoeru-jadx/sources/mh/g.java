package mh;

import java.io.IOException;
import lh.h0;
import lh.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15182d;

    public g(h0 h0Var, long j10, boolean z10) {
        super(h0Var);
        this.f15180b = j10;
        this.f15181c = z10;
    }

    @Override // lh.o, lh.h0
    public final long W(lh.f fVar, long j10) throws IOException {
        jc.l.e(fVar, "sink");
        long j11 = this.f15182d;
        long j12 = this.f15180b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f15181c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jW = super.W(fVar, j10);
        if (jW != -1) {
            this.f15182d += jW;
        }
        long j14 = this.f15182d;
        if ((j14 >= j12 || jW != -1) && j14 <= j12) {
            return jW;
        }
        if (jW > 0 && j14 > j12) {
            long j15 = fVar.f12571b - (j14 - j12);
            lh.f fVar2 = new lh.f();
            fVar2.c0(fVar);
            fVar.H(fVar2, j15);
            fVar2.skip(fVar2.f12571b);
        }
        throw new IOException("expected " + j12 + " bytes but got " + this.f15182d);
    }
}
