package e;

import d.b0;
import hf.y;
import ic.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f6034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f6035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b7.n f6036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6037g;

    @Override // d.b0
    public final void a() {
        b7.n nVar = this.f6036f;
        if (nVar != null) {
            nVar.c();
        }
        b7.n nVar2 = this.f6036f;
        if (nVar2 != null) {
            nVar2.f1984b = false;
        }
        this.f6037g = false;
    }

    @Override // d.b0
    public final void b() {
        b7.n nVar = this.f6036f;
        if (nVar != null && !nVar.f1984b) {
            nVar.c();
            this.f6036f = null;
        }
        if (this.f6036f == null) {
            this.f6036f = new b7.n(this.f6034d, false, this.f6035e, this);
        }
        b7.n nVar2 = this.f6036f;
        if (nVar2 != null) {
            ((kf.f) nVar2.f1985c).k(null);
        }
        b7.n nVar3 = this.f6036f;
        if (nVar3 != null) {
            nVar3.f1984b = false;
        }
        this.f6037g = false;
    }

    @Override // d.b0
    public final void c(d.c cVar) {
        super.c(cVar);
        b7.n nVar = this.f6036f;
        if (nVar != null) {
            ((kf.f) nVar.f1985c).e(cVar);
        }
    }

    @Override // d.b0
    public final void d(d.c cVar) {
        super.d(cVar);
        b7.n nVar = this.f6036f;
        if (nVar != null) {
            nVar.c();
        }
        if (this.f5180a) {
            this.f6036f = new b7.n(this.f6034d, true, this.f6035e, this);
        }
        this.f6037g = true;
    }
}
