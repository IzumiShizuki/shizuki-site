package h6;

import java.util.Collections;
import java.util.List;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8128c;

    public a(int i10, long j10, long j11) {
        this.f8126a = i10;
        switch (i10) {
            case 2:
                this.f8127b = j10;
                this.f8128c = j11;
                break;
            default:
                this.f8127b = j11;
                this.f8128c = j10;
                break;
        }
    }

    public static long d(long j10, s sVar) {
        long jU = sVar.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | sVar.w()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // h6.b
    public final String toString() {
        switch (this.f8126a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.f8127b);
                sb.append(", identifier= ");
                return a0.c.H(this.f8128c, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.f8127b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return a0.c.H(this.f8128c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f8127b);
                sb3.append(", playbackPositionUs= ");
                return a0.c.H(this.f8128c, " }", sb3);
        }
    }

    public a(long j10, long j11, List list) {
        this.f8126a = 1;
        this.f8127b = j10;
        this.f8128c = j11;
        Collections.unmodifiableList(list);
    }
}
