package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements q1.l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f19149b = new f0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f19150c = new f0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19151a;

    public /* synthetic */ f0(int i10) {
        this.f19151a = i10;
    }

    @Override // q1.l0
    public final q1.h0 a(long j10, f3.m mVar, f3.c cVar) {
        switch (this.f19151a) {
            case 0:
                float fA0 = cVar.a0(s.f19268a);
                return new q1.c0(new p1.c(0.0f, -fA0, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) + fA0));
            default:
                float fA02 = cVar.a0(s.f19268a);
                return new q1.c0(new p1.c(-fA02, 0.0f, Float.intBitsToFloat((int) (j10 >> 32)) + fA02, Float.intBitsToFloat((int) (j10 & 4294967295L))));
        }
    }
}
