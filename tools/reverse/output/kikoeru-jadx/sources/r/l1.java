package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18477b;

    public l1(Object obj, Object obj2) {
        this.f18476a = obj;
        this.f18477b = obj2;
    }

    @Override // r.k1
    public final Object a() {
        return this.f18476a;
    }

    @Override // r.k1
    public final boolean b(Object obj, Object obj2) {
        return obj.equals(a()) && obj2.equals(c());
    }

    @Override // r.k1
    public final Object c() {
        return this.f18477b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return jc.l.a(this.f18476a, k1Var.a()) && jc.l.a(this.f18477b, k1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f18476a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f18477b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
