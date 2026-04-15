package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f9185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f9186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f9187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f9188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f9189e;

    public l(b0 b0Var, b0 b0Var2, b0 b0Var3, c0 c0Var, c0 c0Var2) {
        jc.l.e(b0Var, "refresh");
        jc.l.e(b0Var2, "prepend");
        jc.l.e(b0Var3, "append");
        jc.l.e(c0Var, "source");
        this.f9185a = b0Var;
        this.f9186b = b0Var2;
        this.f9187c = b0Var3;
        this.f9188d = c0Var;
        this.f9189e = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return jc.l.a(this.f9185a, lVar.f9185a) && jc.l.a(this.f9186b, lVar.f9186b) && jc.l.a(this.f9187c, lVar.f9187c) && jc.l.a(this.f9188d, lVar.f9188d) && jc.l.a(this.f9189e, lVar.f9189e);
    }

    public final int hashCode() {
        int iHashCode = (this.f9188d.hashCode() + ((this.f9187c.hashCode() + ((this.f9186b.hashCode() + (this.f9185a.hashCode() * 31)) * 31)) * 31)) * 31;
        c0 c0Var = this.f9189e;
        return iHashCode + (c0Var != null ? c0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f9185a + ", prepend=" + this.f9186b + ", append=" + this.f9187c + ", source=" + this.f9188d + ", mediator=" + this.f9189e + ')';
    }
}
