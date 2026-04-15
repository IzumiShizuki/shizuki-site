package u2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21220c;

    public e(int i10, int i11, boolean z10) {
        this.f21218a = i10;
        this.f21219b = i11;
        this.f21220c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f21218a == eVar.f21218a && this.f21219b == eVar.f21219b && this.f21220c == eVar.f21220c;
    }

    public final int hashCode() {
        return (((this.f21218a * 31) + this.f21219b) * 31) + (this.f21220c ? 1231 : 1237);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f21218a + ", end=" + this.f21219b + ", isRtl=" + this.f21220c + ')';
    }
}
