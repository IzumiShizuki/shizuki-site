package be;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f2743c = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f2745b;

    public c(String str) {
        l.e(str, "fqName");
        this.f2744a = new d(this, str);
    }

    public final c a(e eVar) {
        l.e(eVar, "name");
        return new c(this.f2744a.a(eVar), this);
    }

    public final c b() {
        c cVar = this.f2745b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.f2744a;
        if (dVar.c()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(dVar.e());
        this.f2745b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a(this.f2744a, ((c) obj).f2744a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2744a.f2747a.hashCode();
    }

    public final String toString() {
        return this.f2744a.toString();
    }

    public c(d dVar) {
        this.f2744a = dVar;
    }

    public c(d dVar, c cVar) {
        this.f2744a = dVar;
        this.f2745b = cVar;
    }
}
