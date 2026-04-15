package e7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f6327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6329c;

    public h(k0 k0Var, String str, boolean z10) {
        if (z10 && str == null) {
            throw new IllegalArgumentException(("Argument with type " + k0Var.b() + " has null value but is not nullable.").toString());
        }
        this.f6327a = k0Var;
        this.f6329c = str;
        this.f6328b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        Object obj2 = hVar.f6329c;
        if (this.f6328b != hVar.f6328b || !this.f6327a.equals(hVar.f6327a)) {
            return false;
        }
        Object obj3 = this.f6329c;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((this.f6327a.hashCode() * 961) + (this.f6328b ? 1 : 0)) * 31;
        Object obj = this.f6329c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jc.z.f10839a.b(h.class).y());
        sb.append(" Type: " + this.f6327a);
        sb.append(" Nullable: false");
        if (this.f6328b) {
            sb.append(" DefaultValue: " + this.f6329c);
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
