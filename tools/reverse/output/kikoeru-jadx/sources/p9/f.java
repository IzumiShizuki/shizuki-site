package p9;

import ic.n;
import j2.h0;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.f f16953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.f f16954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.f f16956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.f f16957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f16958f;

    public f(w1.f fVar, w1.f fVar2, String str, f1.f fVar3, f1.f fVar4, f1.f fVar5) {
        this.f16953a = fVar;
        this.f16954b = fVar2;
        this.f16955c = str;
        this.f16956d = fVar3;
        this.f16957e = fVar4;
        this.f16958f = fVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f16953a, fVar.f16953a) && l.a(this.f16954b, fVar.f16954b) && l.a(this.f16955c, fVar.f16955c) && l.a(this.f16956d, fVar.f16956d) && l.a(this.f16957e, fVar.f16957e) && l.a(this.f16958f, fVar.f16958f);
    }

    public final int hashCode() {
        int iHashCode = (this.f16957e.hashCode() + ((this.f16956d.hashCode() + h0.e((this.f16954b.hashCode() + (this.f16953a.hashCode() * 31)) * 31, 31, this.f16955c)) * 31)) * 31;
        n nVar = this.f16958f;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "PageBean(icon=" + this.f16953a + ", iconBack=" + this.f16954b + ", label=" + this.f16955c + ", content=" + this.f16956d + ", topBar=" + this.f16957e + ", overlay=" + this.f16958f + ")";
    }
}
