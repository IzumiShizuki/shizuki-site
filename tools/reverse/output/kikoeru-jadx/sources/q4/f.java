package q4;

import m4.k0;
import m4.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17718c;

    public f(long j10, long j11, long j12) {
        this.f17716a = j10;
        this.f17717b = j11;
        this.f17718c = j12;
    }

    @Override // m4.m0
    public final /* synthetic */ m4.q a() {
        return null;
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17716a == fVar.f17716a && this.f17717b == fVar.f17717b && this.f17718c == fVar.f17718c;
    }

    public final int hashCode() {
        return gh.g.y(this.f17718c) + ((gh.g.y(this.f17717b) + ((gh.g.y(this.f17716a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f17716a + ", modification time=" + this.f17717b + ", timescale=" + this.f17718c;
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}
