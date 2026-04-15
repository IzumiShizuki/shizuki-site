package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f19237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0 f19238d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19239b;

    static {
        int i10 = 0;
        f19237c = new o0(i10, 0);
        f19238d = new o0(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, int i11) {
        super(i10);
        this.f19239b = i11;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19239b) {
            case 0:
                return y.f19311a;
            case 1:
                return new a1();
            default:
                return new o1(0);
        }
    }
}
