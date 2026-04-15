package t4;

import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements s4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f20418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.s f20419b = new s4.s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1 f20420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s4.g f20422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20423f;

    public final f a() {
        s4.g gVar = this.f20422e;
        return b(gVar != null ? gVar.q() : null, this.f20423f | 1);
    }

    public final f b(s4.h hVar, int i10) {
        d dVar;
        b bVar = this.f20418a;
        bVar.getClass();
        if (this.f20421d || hVar == null) {
            dVar = null;
        } else {
            y1 y1Var = this.f20420c;
            if (y1Var != null) {
                y yVar = (y) y1Var.f18634b;
                yVar.getClass();
                dVar = new d(yVar);
            } else {
                dVar = new d(bVar);
            }
        }
        return new f(bVar, hVar, this.f20419b.q(), dVar, i10);
    }

    @Override // s4.g
    public final s4.h q() {
        s4.g gVar = this.f20422e;
        return b(gVar != null ? gVar.q() : null, this.f20423f);
    }
}
