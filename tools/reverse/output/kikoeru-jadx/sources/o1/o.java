package o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements jc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.k f16120a;

    public o(ic.k kVar) {
        this.f16120a = kVar;
    }

    @Override // jc.h
    public final ub.e a() {
        return this.f16120a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        return jc.l.a(this.f16120a, ((jc.h) obj).a());
    }

    public final int hashCode() {
        return this.f16120a.hashCode();
    }
}
