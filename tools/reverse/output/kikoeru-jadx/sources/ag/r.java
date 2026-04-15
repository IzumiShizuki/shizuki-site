package ag;

import j2.h0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class r {
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f355c;

    public r(int i10, int i11, int i12, long j10) {
        if (7 != (i10 & 7)) {
            z0.i(i10, 7, p.f352b);
            throw null;
        }
        this.f353a = j10;
        this.f354b = i11;
        this.f355c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f353a == rVar.f353a && this.f354b == rVar.f354b && this.f355c == rVar.f355c;
    }

    public final int hashCode() {
        long j10 = this.f353a;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f354b) * 31) + this.f355c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoteRequest(workID=");
        sb.append(this.f353a);
        sb.append(", tagID=");
        sb.append(this.f354b);
        sb.append(", status=");
        return h0.m(sb, this.f355c, ')');
    }

    public r(int i10, int i11, long j10) {
        this.f353a = j10;
        this.f354b = i10;
        this.f355c = i11;
    }
}
