package yc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.e f26148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve.e f26149b;

    public u(be.e eVar, ve.e eVar2) {
        jc.l.e(eVar2, "underlyingType");
        this.f26148a = eVar;
        this.f26149b = eVar2;
    }

    @Override // yc.r0
    public final boolean a(be.e eVar) {
        return this.f26148a.equals(eVar);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f26148a + ", underlyingType=" + this.f26149b + ')';
    }
}
