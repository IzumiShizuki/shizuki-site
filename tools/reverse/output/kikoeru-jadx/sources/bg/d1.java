package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class d1 {
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2860a;

    public d1(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f2860a = str;
        } else {
            wf.z0.i(i10, 1, b1.f2847b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && jc.l.a(this.f2860a, ((d1) obj).f2860a);
    }

    public final int hashCode() {
        String str = this.f2860a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return q.t0.E(new StringBuilder("Language(name="), this.f2860a, ')');
    }
}
