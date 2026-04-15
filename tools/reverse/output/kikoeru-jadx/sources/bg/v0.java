package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class v0 {
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2983c;

    public v0(long j10, String str, float f10) {
        this.f2981a = j10;
        this.f2982b = f10;
        this.f2983c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f2981a == v0Var.f2981a && Float.valueOf(this.f2982b).equals(Float.valueOf(v0Var.f2982b)) && jc.l.a(this.f2983c, v0Var.f2983c);
    }

    public final int hashCode() {
        long j10 = this.f2981a;
        return this.f2983c.hashCode() + q.t0.x(this.f2982b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleQuery(intProductID=");
        sb.append(this.f2981a);
        sb.append(", mediaDuration=");
        sb.append(this.f2982b);
        sb.append(", mediaFileName=");
        return q.t0.E(sb, this.f2983c, ')');
    }

    public v0(long j10, String str, float f10, int i10) {
        if (7 != (i10 & 7)) {
            wf.z0.i(i10, 7, t0.f2969b);
            throw null;
        }
        this.f2981a = j10;
        this.f2982b = f10;
        this.f2983c = str;
    }
}
