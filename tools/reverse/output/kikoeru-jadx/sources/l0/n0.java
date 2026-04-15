package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f11574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f11575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f11576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n0 f11577f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11578b;

    static {
        int i10 = 1;
        f11574c = new n0(i10, 0);
        f11575d = new n0(i10, 1);
        f11576e = new n0(i10, 2);
        f11577f = new n0(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i10, int i11) {
        super(i10);
        this.f11578b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f11578b) {
            case 0:
                long j10 = ((p1.b) obj).f16481a;
                return (9223372034707292159L & j10) != 9205357640488583168L ? new r.m(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L))) : p0.f11591a;
            case 1:
                r.m mVar = (r.m) obj;
                return new p1.b((((long) Float.floatToRawIntBits(mVar.f18478a)) << 32) | (((long) Float.floatToRawIntBits(mVar.f18479b)) & 4294967295L));
            case 2:
                return new a1(((Number) obj).longValue());
            default:
                return ub.a0.f21526a;
        }
    }
}
