package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements o, jc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.a f11435a;

    public c0(ic.a aVar) {
        this.f11435a = aVar;
    }

    @Override // jc.h
    public final ub.e a() {
        return this.f11435a;
    }

    @Override // l0.o
    public final /* synthetic */ long b() {
        return ((p1.b) this.f11435a.b()).f16481a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !(obj instanceof jc.h)) {
            return false;
        }
        return jc.l.a(this.f11435a, ((jc.h) obj).a());
    }

    public final int hashCode() {
        return this.f11435a.hashCode();
    }
}
