package se;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k0, ve.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f19997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f19998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19999c;

    public v(AbstractCollection abstractCollection) {
        jc.l.e(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f19998b = linkedHashSet;
        this.f19999c = linkedHashSet.hashCode();
    }

    public final a0 b() {
        h0.f19950b.getClass();
        return c.x(h0.f19951c, this, vb.r.f22819a, false, a2.c.E(this.f19998b, "member scope for intersection type"), new bd.a(23, this));
    }

    public final String c(ic.k kVar) {
        jc.l.e(kVar, "getProperTypeRelatedToStringify");
        return vb.m.f0(vb.m.C0(this.f19998b, new j9.l(5, kVar)), " & ", "{", "}", new h1.a(kVar, 2), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return jc.l.a(this.f19998b, ((v) obj).f19998b);
    }

    @Override // se.k0
    public final vc.i g() {
        vc.i iVarG = ((w) this.f19998b.iterator().next()).t().g();
        jc.l.d(iVarG, "getBuiltIns(...)");
        return iVarG;
    }

    @Override // se.k0
    public final yc.h h() {
        return null;
    }

    public final int hashCode() {
        return this.f19999c;
    }

    @Override // se.k0
    public final Collection i() {
        return this.f19998b;
    }

    @Override // se.k0
    public final boolean j() {
        return false;
    }

    @Override // se.k0
    public final List o() {
        return vb.r.f22819a;
    }

    public final String toString() {
        return c(u.f19991b);
    }
}
