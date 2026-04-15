package ka;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.q f11258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.k f11259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3.q f11262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ic.o f11264i;

    public g(String str, String str2, j1.q qVar, ic.k kVar, String str3, String str4, j3.q qVar2, boolean z10, ic.o oVar) {
        jc.l.e(qVar, "modifier");
        this.f11256a = str;
        this.f11257b = str2;
        this.f11258c = qVar;
        this.f11259d = kVar;
        this.f11260e = str3;
        this.f11261f = str4;
        this.f11262g = qVar2;
        this.f11263h = z10;
        this.f11264i = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11256a.equals(gVar.f11256a) && jc.l.a(this.f11257b, gVar.f11257b) && jc.l.a(this.f11258c, gVar.f11258c) && jc.l.a(this.f11259d, gVar.f11259d) && this.f11260e.equals(gVar.f11260e) && this.f11261f.equals(gVar.f11261f) && this.f11262g.equals(gVar.f11262g) && this.f11263h == gVar.f11263h && jc.l.a(this.f11264i, gVar.f11264i);
    }

    public final int hashCode() {
        int iHashCode = this.f11256a.hashCode() * 31;
        String str = this.f11257b;
        int iHashCode2 = (this.f11258c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 961;
        ic.k kVar = this.f11259d;
        int iHashCode3 = (((this.f11262g.hashCode() + h0.e(h0.e((iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f11260e), 31, this.f11261f)) * 31) + (this.f11263h ? 1231 : 1237)) * 31;
        ic.o oVar = this.f11264i;
        return iHashCode3 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoeDialogData(text=");
        sb.append(this.f11256a);
        sb.append(", title=");
        sb.append(this.f11257b);
        sb.append(", modifier=");
        sb.append(this.f11258c);
        sb.append(", onDismiss=null, onConfirm=");
        sb.append(this.f11259d);
        sb.append(", dismissLabel=");
        h0.w(sb, this.f11260e, ", confirmLabel=", this.f11261f, ", properties=");
        sb.append(this.f11262g);
        sb.append(", fullCustom=");
        sb.append(this.f11263h);
        sb.append(", content=");
        sb.append(this.f11264i);
        sb.append(")");
        return sb.toString();
    }
}
