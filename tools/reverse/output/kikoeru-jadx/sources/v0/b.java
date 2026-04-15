package v0;

import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f22165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f22166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f22167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f22168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f22169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f22170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f22171i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22172b;

    static {
        int i10 = 0;
        f22165c = new b(i10, 0);
        f22166d = new b(i10, 1);
        f22167e = new b(i10, 2);
        f22168f = new b(i10, 3);
        f22169g = new b(i10, 4);
        f22170h = new b(i10, 5);
        f22171i = new b(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f22172b = i11;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f22172b) {
            case 0:
                o2 o2Var = c.f22176a;
                long j10 = w0.b.f23003t;
                return new a(j10, w0.b.f22993j, w0.b.f23004u, w0.b.f22994k, w0.b.f22988e, w0.b.f23006w, w0.b.f22995l, w0.b.f23007x, w0.b.f22996m, w0.b.H, w0.b.f22999p, w0.b.I, w0.b.f23000q, w0.b.f22984a, w0.b.f22990g, w0.b.f23008y, w0.b.f22997n, w0.b.G, w0.b.f22998o, j10, w0.b.f22989f, w0.b.f22987d, w0.b.f22985b, w0.b.f22991h, w0.b.f22986c, w0.b.f22992i, w0.b.f23001r, w0.b.f23002s, w0.b.f23005v, w0.b.f23009z, w0.b.F, w0.b.A, w0.b.B, w0.b.C, w0.b.D, w0.b.E);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new q1.q(q1.q.f17569b);
            case 3:
                return Boolean.TRUE;
            case 4:
                return new y();
            case 5:
                return w0.l.f23118a;
            default:
                return new o0();
        }
    }
}
