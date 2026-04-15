package c0;

import b0.c1;
import b0.g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.j f3060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1 f3061d;

    public f(ic.k kVar) {
        ah.j jVar = new ah.j((byte) 0, 1);
        this.f3060c = jVar;
        this.f3061d = new c1(5, jVar);
        kVar.a(this);
    }

    @Override // b0.g0
    public final ah.j j() {
        return this.f3060c;
    }
}
