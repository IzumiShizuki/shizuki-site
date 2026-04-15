package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.f f13961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.f f13962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f f13963c;

    public y5(g0.f fVar, g0.f fVar2, g0.f fVar3) {
        this.f13961a = fVar;
        this.f13962b = fVar2;
        this.f13963c = fVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return this.f13961a.equals(y5Var.f13961a) && this.f13962b.equals(y5Var.f13962b) && this.f13963c.equals(y5Var.f13963c);
    }

    public final int hashCode() {
        return this.f13963c.hashCode() + ((this.f13962b.hashCode() + (this.f13961a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f13961a + ", medium=" + this.f13962b + ", large=" + this.f13963c + ')';
    }
}
