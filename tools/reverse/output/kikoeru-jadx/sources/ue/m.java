package ue;

import java.util.Collection;
import java.util.Set;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g {
    @Override // ue.g, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        throw new IllegalStateException(this.f21620b + ", required name: " + eVar);
    }

    @Override // ue.g, le.o
    public final /* bridge */ /* synthetic */ Collection b(be.e eVar, gd.b bVar) {
        b(eVar, bVar);
        throw null;
    }

    @Override // ue.g, le.o
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // ue.g, le.o
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override // ue.g, le.q
    public final Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        throw new IllegalStateException(this.f21620b);
    }

    @Override // ue.g, le.o
    public final /* bridge */ /* synthetic */ Collection f(be.e eVar, gd.b bVar) {
        f(eVar, bVar);
        throw null;
    }

    @Override // ue.g, le.o
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override // ue.g
    /* JADX INFO: renamed from: h */
    public final Set f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        throw new IllegalStateException(this.f21620b + ", required name: " + eVar);
    }

    @Override // ue.g
    /* JADX INFO: renamed from: i */
    public final Set b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        throw new IllegalStateException(this.f21620b + ", required name: " + eVar);
    }

    @Override // ue.g
    public final String toString() {
        return t0.E(new StringBuilder("ThrowingScope{"), this.f21620b, '}');
    }
}
