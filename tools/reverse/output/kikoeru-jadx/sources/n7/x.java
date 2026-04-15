package n7;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements yb.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3.l f15588c = new m3.l(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.e f15589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f15590b = new AtomicInteger(0);

    public x(yb.e eVar) {
        this.f15589a = eVar;
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        return ud.b.z(this, gVar);
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        return ud.b.o(this, gVar);
    }

    @Override // yb.f
    public final yb.g getKey() {
        return f15588c;
    }

    @Override // yb.h
    public final Object y(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }
}
