package zg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f26919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f26920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f26921c;

    public /* synthetic */ r(s sVar, Throwable th2, int i10) {
        this(sVar, (d) null, (i10 & 4) != 0 ? null : th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jc.l.a(this.f26919a, rVar.f26919a) && jc.l.a(this.f26920b, rVar.f26920b) && jc.l.a(this.f26921c, rVar.f26921c);
    }

    public final int hashCode() {
        int iHashCode = this.f26919a.hashCode() * 31;
        s sVar = this.f26920b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Throwable th2 = this.f26921c;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f26919a + ", nextPlan=" + this.f26920b + ", throwable=" + this.f26921c + ')';
    }

    public r(s sVar, d dVar, Throwable th2) {
        this.f26919a = sVar;
        this.f26920b = dVar;
        this.f26921c = th2;
    }
}
