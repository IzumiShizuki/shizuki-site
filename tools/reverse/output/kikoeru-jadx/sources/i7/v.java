package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f9336b;

    public v(int i10, u2 u2Var) {
        jc.l.e(u2Var, "hint");
        this.f9335a = i10;
        this.f9336b = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f9335a == vVar.f9335a && jc.l.a(this.f9336b, vVar.f9336b);
    }

    public final int hashCode() {
        return this.f9336b.hashCode() + (this.f9335a * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f9335a + ", hint=" + this.f9336b + ')';
    }
}
