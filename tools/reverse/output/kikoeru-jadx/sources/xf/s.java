package xf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25017b;

    public s(Object obj, boolean z10) {
        jc.l.e(obj, "body");
        this.f25016a = z10;
        this.f25017b = obj.toString();
    }

    @Override // xf.c0
    public final String a() {
        return this.f25017b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f25016a == sVar.f25016a && jc.l.a(this.f25017b, sVar.f25017b);
    }

    public final int hashCode() {
        return this.f25017b.hashCode() + ((this.f25016a ? 1231 : 1237) * 31);
    }

    @Override // xf.c0
    public final String toString() {
        boolean z10 = this.f25016a;
        String str = this.f25017b;
        if (!z10) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        yf.v.a(str, sb);
        return sb.toString();
    }
}
