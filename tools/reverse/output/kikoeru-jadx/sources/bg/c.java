package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class c implements t {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2852c;

    public c(int i10, Integer num, int i11, String str) {
        if (6 != (i10 & 6)) {
            wf.z0.i(i10, 6, a.f2814b);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f2850a = null;
        } else {
            this.f2850a = num;
        }
        this.f2851b = i11;
        this.f2852c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jc.l.a(this.f2850a, cVar.f2850a) && this.f2851b == cVar.f2851b && jc.l.a(this.f2852c, cVar.f2852c);
    }

    @Override // bg.t
    public final String f() {
        return "circles/" + this.f2851b;
    }

    public final int hashCode() {
        Integer num = this.f2850a;
        return this.f2852c.hashCode() + ((((num == null ? 0 : num.hashCode()) * 31) + this.f2851b) * 31);
    }

    @Override // bg.t
    public final String name() {
        return this.f2852c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Circle(count=");
        sb.append(this.f2850a);
        sb.append(", id=");
        sb.append(this.f2851b);
        sb.append(", name=");
        return q.t0.E(sb, this.f2852c, ')');
    }
}
