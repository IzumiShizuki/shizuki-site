package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f25138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f25139d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25140b;

    static {
        int i10 = 2;
        f25138c = new i(i10, 0);
        f25139d = new i(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        super(i10);
        this.f25140b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f25140b) {
            case 0:
                return Integer.valueOf(Math.round((1 + (((f3.m) obj2) != f3.m.f6667a ? (-1.0f) * (-1) : -1.0f)) * (((Number) obj).intValue() / 2.0f)));
            default:
                return Integer.valueOf(((r1) obj).b((f3.c) obj2));
        }
    }
}
