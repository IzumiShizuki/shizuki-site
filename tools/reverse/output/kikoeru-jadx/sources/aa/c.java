package aa;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.h f281b;

    public /* synthetic */ c(e.h hVar, int i10) {
        this.f280a = i10;
        this.f281b = hVar;
    }

    @Override // ic.a
    public final Object b() throws Exception {
        switch (this.f280a) {
            case 0:
                this.f281b.W("image/*");
                break;
            case 1:
                this.f281b.W("application/octet-stream");
                break;
            default:
                this.f281b.W("application/octet-stream");
                break;
        }
        return a0.f21526a;
    }
}
