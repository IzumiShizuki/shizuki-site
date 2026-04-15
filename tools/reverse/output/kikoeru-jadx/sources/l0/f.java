package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f11465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j10, ic.a aVar, boolean z10) {
        super(1);
        this.f11464b = j10;
        this.f11465c = aVar;
        this.f11466d = z10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        n1.c cVar = (n1.c) obj;
        return cVar.b(new a0.s(this.f11465c, this.f11466d, u0.q(cVar, Float.intBitsToFloat((int) (cVar.f15238a.e() >> 32)) / 2.0f), new q1.k(this.f11464b, 5)));
    }
}
