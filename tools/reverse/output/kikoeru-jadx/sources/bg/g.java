package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class g {
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2887b;

    public g(int i10, int i11, String str) {
        if (3 != (i10 & 3)) {
            wf.z0.i(i10, 3, e.f2864b);
            throw null;
        }
        this.f2886a = i11;
        this.f2887b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2886a == gVar.f2886a && jc.l.a(this.f2887b, gVar.f2887b);
    }

    public final int hashCode() {
        return this.f2887b.hashCode() + (this.f2886a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LrcItem(time=");
        sb.append(this.f2886a);
        sb.append(", text=");
        return q.t0.E(sb, this.f2887b, ')');
    }
}
