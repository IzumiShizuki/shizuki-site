package jd;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.c f10840a;

    public d(pc.c cVar) {
        l.e(cVar, "klass");
        this.f10840a = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return l.a(this.f10840a, ((d) obj).f10840a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10840a.hashCode();
    }

    public final String toString() {
        return g8.a.D(this.f10840a).getName();
    }
}
