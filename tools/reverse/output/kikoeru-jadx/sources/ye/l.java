package ye;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f26236d = new l(0, "must be a member function");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f26237e = new l(1, "must be a member or an extension function");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, String str) {
        super(0, str);
        this.f26238c = i10;
    }

    @Override // ye.e
    public final boolean a(nd.e eVar) {
        switch (this.f26238c) {
            case 0:
                return eVar.f2720j != null;
            default:
                return (eVar.f2720j == null && eVar.f2719i == null) ? false : true;
        }
    }
}
