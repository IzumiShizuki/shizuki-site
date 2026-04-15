package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f21112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f21113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f21114e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21115b;

    static {
        int i10 = 0;
        f21112c = new w(i10, 0);
        f21113d = new w(i10, 1);
        f21114e = new w(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, int i11) {
        super(i10);
        this.f21115b = i11;
    }

    @Override // ic.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f21115b) {
            case 0:
                return ub.a0.f21526a;
            case 1:
                return ub.a0.f21526a;
            default:
                return Boolean.TRUE;
        }
    }
}
