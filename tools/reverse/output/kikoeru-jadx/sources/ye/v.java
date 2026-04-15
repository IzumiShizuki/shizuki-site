package ye;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26270c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26271d;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(int i10) {
        StringBuilder sbO = h0.o(i10, "must have at least ", " value parameter");
        sbO.append(i10 > 1 ? "s" : "");
        super(1, sbO.toString());
        this.f26271d = i10;
    }

    @Override // ye.e
    public final boolean a(nd.e eVar) {
        switch (this.f26270c) {
            case 0:
                if (eVar.o0().size() >= this.f26271d) {
                }
                break;
            default:
                if (eVar.o0().size() == this.f26271d) {
                }
                break;
        }
        return false;
    }

    public v() {
        super(1, "must have exactly 2 value parameters");
        this.f26271d = 2;
    }
}
