package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2462a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2465d;

    public /* synthetic */ r0(int i10, String str, String str2) {
        this.f2463b = str;
        this.f2464c = str2;
        this.f2465d = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        Integer num = (Integer) obj2;
        switch (this.f2462a) {
            case 0:
                num.getClass();
                z.e(this.f2463b, this.f2464c, oVar, x0.v.D(1), this.f2465d);
                break;
            default:
                num.intValue();
                ea.a.c(this.f2463b, this.f2464c, oVar, x0.v.D(this.f2465d | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ r0(String str, int i10, int i11, String str2) {
        this.f2463b = str;
        this.f2464c = str2;
        this.f2465d = i11;
    }
}
