package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f8725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f8726d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8727b;

    static {
        int i10 = 0;
        f8725c = new i(i10, 0);
        f8726d = new i(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        super(i10);
        this.f8727b = i11;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f8727b) {
            case 0:
                return new j0(2);
            default:
                return new j0(3);
        }
    }
}
