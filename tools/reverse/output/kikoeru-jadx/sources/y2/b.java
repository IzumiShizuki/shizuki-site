package y2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f25360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f25361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f25362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f25363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f25364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f25365h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25366b;

    static {
        int i10 = 1;
        f25360c = new b(i10, 0);
        f25361d = new b(i10, 1);
        f25362e = new b(i10, 2);
        f25363f = new b(i10, 3);
        f25364g = new b(i10, 4);
        f25365h = new b(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f25366b = i11;
    }

    @Override // ic.k
    public final /* synthetic */ Object a(Object obj) {
        switch (this.f25366b) {
            case 0:
                float[] fArr = ((q1.a0) obj).f17489a;
                break;
            case 1:
                float[] fArr2 = ((q1.a0) obj).f17489a;
                break;
            case 2:
                break;
            case 3:
                int i10 = ((i) obj).f25408a;
                break;
            case 4:
                break;
            default:
                int i11 = ((i) obj).f25408a;
                break;
        }
        return ub.a0.f21526a;
    }
}
