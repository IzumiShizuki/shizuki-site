package ld;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td.h f12229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f12230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12232d;

    public m(td.h hVar, Collection collection, int i10) {
        this(hVar, collection, hVar.f20684a == td.g.f20682c, (i10 & 8) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return jc.l.a(this.f12229a, mVar.f12229a) && jc.l.a(this.f12230b, mVar.f12230b) && this.f12231c == mVar.f12231c && this.f12232d == mVar.f12232d;
    }

    public final int hashCode() {
        return ((((this.f12230b.hashCode() + (this.f12229a.hashCode() * 31)) * 31) + (this.f12231c ? 1231 : 1237)) * 31) + (this.f12232d ? 1231 : 1237);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f12229a + ", qualifierApplicabilityTypes=" + this.f12230b + ", definitelyNotNull=" + this.f12231c + ", preferQualifierOverBound=" + this.f12232d + ')';
    }

    public m(td.h hVar, Collection collection, boolean z10, boolean z11) {
        jc.l.e(collection, "qualifierApplicabilityTypes");
        this.f12229a = hVar;
        this.f12230b = collection;
        this.f12231c = z10;
        this.f12232d = z11;
    }
}
