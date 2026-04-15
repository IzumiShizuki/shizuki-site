package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends yb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f8608c = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8609b;

    public x() {
        super(f8608c);
        this.f8609b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && jc.l.a(this.f8609b, ((x) obj).f8609b);
    }

    public final int hashCode() {
        return this.f8609b.hashCode();
    }

    public final String toString() {
        return q.t0.E(new StringBuilder("CoroutineName("), this.f8609b, ')');
    }
}
