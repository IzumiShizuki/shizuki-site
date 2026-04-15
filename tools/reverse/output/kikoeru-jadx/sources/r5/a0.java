package r5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f18750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f18751b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f18750a = c0Var;
        this.f18751b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f18750a.equals(a0Var.f18750a) && this.f18751b.equals(a0Var.f18751b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18751b.hashCode() + (this.f18750a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        c0 c0Var = this.f18750a;
        sb.append(c0Var);
        c0 c0Var2 = this.f18751b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return j2.h0.n(sb, str, "]");
    }
}
