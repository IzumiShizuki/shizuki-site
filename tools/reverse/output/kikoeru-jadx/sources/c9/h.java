package c9;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3824c;

    public h(long j10, String str, int i10) {
        l.e(str, "content");
        this.f3822a = i10;
        this.f3823b = j10;
        this.f3824c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3822a == hVar.f3822a && this.f3823b == hVar.f3823b && l.a(this.f3824c, hVar.f3824c);
    }

    public final int hashCode() {
        int i10 = this.f3822a * 31;
        long j10 = this.f3823b;
        return this.f3824c.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        return "SearchHistoryBean(id=" + this.f3822a + ", timestamp=" + this.f3823b + ", content=" + this.f3824c + ")";
    }
}
