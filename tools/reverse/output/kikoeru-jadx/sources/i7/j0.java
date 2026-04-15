package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f9174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f9175b;

    public j0(c0 c0Var, c0 c0Var2) {
        this.f9174a = c0Var;
        this.f9175b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return jc.l.a(this.f9174a, j0Var.f9174a) && jc.l.a(this.f9175b, j0Var.f9175b);
    }

    public final int hashCode() {
        int iHashCode = this.f9174a.hashCode() * 31;
        c0 c0Var = this.f9175b;
        return iHashCode + (c0Var == null ? 0 : c0Var.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f9174a + "\n                    ";
        c0 c0Var = this.f9175b;
        if (c0Var != null) {
            str = str + "|   mediatorLoadStates: " + c0Var + '\n';
        }
        return ef.o.a0(str + "|)");
    }
}
