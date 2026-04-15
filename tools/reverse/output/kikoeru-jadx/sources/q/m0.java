package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, long j10, long j11, Object obj2, int i10) {
        super(1);
        this.f17364b = i10;
        this.f17367e = obj;
        this.f17365c = j10;
        this.f17366d = j11;
        this.f17368f = obj2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f17364b) {
            case 0:
                g2.f1 f1Var = (g2.f1) obj;
                g2.g1 g1Var = (g2.g1) this.f17367e;
                long j10 = this.f17365c;
                long j11 = this.f17366d;
                int i10 = ((int) (j10 >> 32)) + ((int) (j11 >> 32));
                int i11 = ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L));
                cg.b bVar = (cg.b) this.f17368f;
                f1Var.getClass();
                g2.f1.b(f1Var, g1Var);
                g1Var.Y(f3.j.d((((long) i10) << 32) | (((long) i11) & 4294967295L), g1Var.f7184e), 0.0f, bVar);
                break;
            default:
                i2.l0 l0Var = (i2.l0) obj;
                l0Var.b();
                t0.p(l0Var, (q1.m) this.f17367e, this.f17365c, this.f17366d, 0.0f, (s1.e) this.f17368f, 104);
                break;
        }
        return ub.a0.f21526a;
    }
}
