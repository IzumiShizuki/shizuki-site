package ye;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f26272d = new w(0, "must have no value parameters");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f26273e = new w(1, "must have a single value parameter");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, String str) {
        super(1, str);
        this.f26274c = i10;
    }

    @Override // ye.e
    public final boolean a(nd.e eVar) {
        switch (this.f26274c) {
            case 0:
                return eVar.o0().isEmpty();
            default:
                return eVar.o0().size() == 1;
        }
    }
}
