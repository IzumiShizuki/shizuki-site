package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g2 f9816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g2 f9817d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9818b;

    static {
        int i10 = 0;
        f9816c = new g2(i10, 0);
        f9817d = new g2(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(int i10, int i11) {
        super(i10);
        this.f9818b = i11;
    }

    @Override // ic.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f9818b) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
