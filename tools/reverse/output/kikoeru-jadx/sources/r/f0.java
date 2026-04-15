package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f18399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f18400b;

    public f0(Float f10, v vVar) {
        this.f18399a = f10;
        this.f18400b = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return f0Var.f18399a.equals(this.f18399a) && jc.l.a(f0Var.f18400b, this.f18400b);
    }

    public final int hashCode() {
        return this.f18400b.hashCode() + (this.f18399a.hashCode() * 961);
    }
}
