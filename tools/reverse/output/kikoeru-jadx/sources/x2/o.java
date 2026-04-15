package x2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f24570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f24571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24574e;

    public o(n nVar, k kVar, int i10, int i11, Object obj) {
        this.f24570a = nVar;
        this.f24571b = kVar;
        this.f24572c = i10;
        this.f24573d = i11;
        this.f24574e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jc.l.a(this.f24570a, oVar.f24570a) && jc.l.a(this.f24571b, oVar.f24571b) && this.f24572c == oVar.f24572c && this.f24573d == oVar.f24573d && jc.l.a(this.f24574e, oVar.f24574e);
    }

    public final int hashCode() {
        n nVar = this.f24570a;
        int iHashCode = (((((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f24571b.f24566a) * 31) + this.f24572c) * 31) + this.f24573d) * 31;
        Object obj = this.f24574e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f24570a);
        sb.append(", fontWeight=");
        sb.append(this.f24571b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i10 = this.f24572c;
        sb.append((Object) (i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i11 = this.f24573d;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "Weight";
        } else if (i11 == 2) {
            str = "Style";
        } else if (i11 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f24574e);
        sb.append(')');
        return sb.toString();
    }
}
