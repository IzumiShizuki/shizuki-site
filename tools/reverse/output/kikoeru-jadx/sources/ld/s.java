package ld;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f12246d = new s(a0.f12179d, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f12247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub.g f12248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f12249c;

    public s(a0 a0Var, ub.g gVar, a0 a0Var2) {
        this.f12247a = a0Var;
        this.f12248b = gVar;
        this.f12249c = a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f12247a == sVar.f12247a && jc.l.a(this.f12248b, sVar.f12248b) && this.f12249c == sVar.f12249c;
    }

    public final int hashCode() {
        int iHashCode = this.f12247a.hashCode() * 31;
        ub.g gVar = this.f12248b;
        return this.f12249c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.f21539d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f12247a + ", sinceVersion=" + this.f12248b + ", reportLevelAfter=" + this.f12249c + ')';
    }

    public s(a0 a0Var, int i10) {
        this(a0Var, (i10 & 2) != 0 ? new ub.g(1, 0, 0) : null, a0Var);
    }
}
