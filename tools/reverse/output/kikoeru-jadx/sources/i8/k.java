package i8;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements lf.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf.f f9425b;

    public /* synthetic */ k(lf.f fVar, int i10) {
        this.f9424a = i10;
        this.f9425b = fVar;
    }

    @Override // lf.f
    public final Object b(lf.g gVar, yb.c cVar) {
        switch (this.f9424a) {
            case 0:
                Object objB = this.f9425b.b(new i7.g(gVar, 2), cVar);
                if (objB != zb.a.f26667a) {
                    break;
                }
                break;
            case 1:
                Object objB2 = this.f9425b.b(new i7.g(gVar, 3), cVar);
                if (objB2 != zb.a.f26667a) {
                    break;
                }
                break;
            case 2:
                Object objB3 = this.f9425b.b(new i7.g(gVar, 7), cVar);
                if (objB3 != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                Object objB4 = this.f9425b.b(new i7.g(gVar, 8), cVar);
                if (objB4 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return a0.f21526a;
    }
}
