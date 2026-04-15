package p4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k5.d f16585b = new k5.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16587d;

    public m(Object obj) {
        this.f16584a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f16584a.equals(((m) obj).f16584a);
    }

    public final int hashCode() {
        return this.f16584a.hashCode();
    }
}
