package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.d f20889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf.k f20890b;

    public f(e0.d dVar, hf.k kVar) {
        this.f20889a = dVar;
        this.f20890b = kVar;
    }

    public final String toString() {
        String strD;
        hf.k kVar = this.f20890b;
        hf.x xVar = (hf.x) kVar.f8561e.R(hf.x.f8608c);
        String str = xVar != null ? xVar.f8609b : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        gh.g.j(16);
        String string = Integer.toString(iHashCode, 16);
        jc.l.d(string, "toString(...)");
        sb.append(string);
        if (str == null || (strD = q.t0.D("[", str, "](")) == null) {
            strD = "(";
        }
        sb.append(strD);
        sb.append("currentBounds()=");
        sb.append(this.f20889a.b());
        sb.append(", continuation=");
        sb.append(kVar);
        sb.append(')');
        return sb.toString();
    }
}
