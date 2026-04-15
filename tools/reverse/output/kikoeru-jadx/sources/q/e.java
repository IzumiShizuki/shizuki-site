package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f17272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f17273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f17274e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17275b;

    static {
        int i10 = 2;
        f17272c = new e(i10, 0);
        f17273d = new e(i10, 1);
        f17274e = new e(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f17275b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f17275b) {
            case 0:
                long j10 = ((f3.l) obj).f6666a;
                long j11 = ((f3.l) obj2).f6666a;
                long j12 = 1;
                return r.d.q(1, new f3.l((j12 & 4294967295L) | (j12 << 32)));
            case 1:
                f0 f0Var = (f0) obj2;
                return Boolean.valueOf(((f0) obj) == f0Var && f0Var == f0.f17292c);
            default:
                return null;
        }
    }
}
