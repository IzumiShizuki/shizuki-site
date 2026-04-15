package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n2 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f13319b;

    public /* synthetic */ n2(t2 t2Var, int i10) {
        this.f13318a = i10;
        this.f13319b = t2Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f13318a) {
            case 0:
                return new f3.j((((long) lc.b.R(this.f13319b.f13649a.f())) << 32) | (((long) 0) & 4294967295L));
            default:
                ((Float) obj).floatValue();
                return Float.valueOf(this.f13319b.b().Q(s2.f13592b));
        }
    }
}
