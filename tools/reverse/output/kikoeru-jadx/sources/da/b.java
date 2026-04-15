package da;

import java.util.List;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.w0 f5638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f5640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f5641f;

    public b(b bVar, int i10) {
        h1.s sVar = new h1.s();
        h1.s sVar2 = new h1.s();
        e1 e1VarV = x0.v.v(Boolean.FALSE);
        h1.s sVar3 = new h1.s();
        h1.s sVar4 = new h1.s();
        bVar = (i10 & 32) != 0 ? null : bVar;
        this.f5636a = sVar;
        this.f5637b = sVar2;
        this.f5638c = e1VarV;
        this.f5639d = sVar3;
        this.f5640e = sVar4;
        this.f5641f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jc.l.a(this.f5636a, bVar.f5636a) && jc.l.a(this.f5637b, bVar.f5637b) && jc.l.a(this.f5638c, bVar.f5638c) && jc.l.a(this.f5639d, bVar.f5639d) && jc.l.a(this.f5640e, bVar.f5640e) && jc.l.a(this.f5641f, bVar.f5641f);
    }

    public final int hashCode() {
        int iZ = q.t0.z(q.t0.z((this.f5638c.hashCode() + q.t0.z(this.f5636a.hashCode() * 31, 31, this.f5637b)) * 31, 31, this.f5639d), 31, this.f5640e);
        b bVar = this.f5641f;
        return iZ + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "FileNode(checked=" + this.f5636a + ", childrenDownloadState=" + this.f5637b + ", isExpand=" + this.f5638c + ", children=" + this.f5639d + ", nodes=" + this.f5640e + ", parent=" + this.f5641f + ")";
    }
}
