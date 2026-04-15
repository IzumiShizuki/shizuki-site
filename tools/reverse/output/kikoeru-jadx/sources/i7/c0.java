package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f9055d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f9056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f9057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f9058c;

    static {
        a0 a0Var = a0.f9030c;
        f9055d = new c0(a0Var, a0Var, a0Var);
    }

    public c0(b0 b0Var, b0 b0Var2, b0 b0Var3) {
        this.f9056a = b0Var;
        this.f9057b = b0Var2;
        this.f9058c = b0Var3;
    }

    public static c0 a(c0 c0Var, int i10) {
        int i11 = i10 & 1;
        b0 b0Var = a0.f9030c;
        b0 b0Var2 = i11 != 0 ? c0Var.f9056a : b0Var;
        b0 b0Var3 = (i10 & 2) != 0 ? c0Var.f9057b : b0Var;
        if ((i10 & 4) != 0) {
            b0Var = c0Var.f9058c;
        }
        return new c0(b0Var2, b0Var3, b0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return jc.l.a(this.f9056a, c0Var.f9056a) && jc.l.a(this.f9057b, c0Var.f9057b) && jc.l.a(this.f9058c, c0Var.f9058c);
    }

    public final int hashCode() {
        return this.f9058c.hashCode() + ((this.f9057b.hashCode() + (this.f9056a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f9056a + ", prepend=" + this.f9057b + ", append=" + this.f9058c + ')';
    }
}
