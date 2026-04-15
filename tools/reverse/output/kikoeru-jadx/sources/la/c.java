package la;

import bg.f1;
import m0.t2;
import m0.u2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f11917b;

    public /* synthetic */ c(ic.k kVar) {
        this.f11916a = 4;
        this.f11917b = kVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f11916a) {
            case 0:
                this.f11917b.a(new p1.b(0L));
                return Boolean.TRUE;
            case 1:
                this.f11917b.a(new p1.b(0L));
                return Boolean.TRUE;
            case 2:
                this.f11917b.a(f1.f2883d);
                return ub.a0.f21526a;
            case 3:
                this.f11917b.a(f1.f2882c);
                return ub.a0.f21526a;
            default:
                return new t2(u2.f13690a, this.f11917b);
        }
    }

    public /* synthetic */ c(ic.k kVar, int i10) {
        this.f11916a = i10;
        this.f11917b = kVar;
    }
}
