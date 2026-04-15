package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f17329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f17330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f17331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i0 f17332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i0 f17333g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17334b;

    static {
        int i10 = 0;
        f17329c = new i0(i10, 0);
        f17330d = new i0(i10, 1);
        f17331e = new i0(i10, 2);
        f17332f = new i0(i10, 3);
        f17333g = new i0(i10, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i10, int i11) {
        super(i10);
        this.f17334b = i11;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f17334b) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            default:
                h1.y yVar = new h1.y(r.f17431k);
                yVar.e();
                return yVar;
        }
    }
}
