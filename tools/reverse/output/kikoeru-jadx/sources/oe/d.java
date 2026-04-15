package oe;

import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yd.f f16353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd.k f16354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd.a f16355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f16356d;

    public d(yd.f fVar, wd.k kVar, yd.a aVar, m0 m0Var) {
        jc.l.e(fVar, "nameResolver");
        jc.l.e(kVar, "classProto");
        jc.l.e(m0Var, "sourceElement");
        this.f16353a = fVar;
        this.f16354b = kVar;
        this.f16355c = aVar;
        this.f16356d = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jc.l.a(this.f16353a, dVar.f16353a) && jc.l.a(this.f16354b, dVar.f16354b) && jc.l.a(this.f16355c, dVar.f16355c) && jc.l.a(this.f16356d, dVar.f16356d);
    }

    public final int hashCode() {
        return this.f16356d.hashCode() + ((this.f16355c.hashCode() + ((this.f16354b.hashCode() + (this.f16353a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f16353a + ", classProto=" + this.f16354b + ", metadataVersion=" + this.f16355c + ", sourceElement=" + this.f16356d + ')';
    }
}
