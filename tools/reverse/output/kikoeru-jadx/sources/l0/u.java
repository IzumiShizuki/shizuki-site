package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f11641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, int i10, int i11, l0 l0Var, ub.h hVar) {
        super(0);
        this.f11638b = pVar;
        this.f11639c = i10;
        this.f11640d = i11;
        this.f11641e = l0Var;
        this.f11642f = hVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ub.h] */
    @Override // ic.a
    public final Object b() {
        int iIntValue = ((Number) this.f11642f.getValue()).intValue();
        l0 l0Var = this.f11641e;
        boolean zA = l0Var.a();
        boolean z10 = l0Var.g() == i.f11496a;
        p pVar = this.f11638b;
        t2.i0 i0Var = pVar.f11590f;
        int i10 = this.f11639c;
        long j10 = i0Var.j(i10);
        t2.i0 i0Var2 = pVar.f11590f;
        t2.n nVar = i0Var2.f20345b;
        int i11 = t2.k0.f20357c;
        int iG = (int) (j10 >> 32);
        int iD = nVar.d(iG);
        int i12 = nVar.f20371f;
        if (iD != iIntValue) {
            iG = iIntValue >= i12 ? i0Var2.g(i12 - 1) : i0Var2.g(iIntValue);
        }
        int iC = (int) (j10 & 4294967295L);
        if (nVar.d(iC) != iIntValue) {
            iC = iIntValue >= i12 ? nVar.c(i12 - 1, false) : nVar.c(iIntValue, false);
        }
        int i13 = this.f11640d;
        if (iG == i13) {
            return pVar.a(iC);
        }
        if (iC == i13) {
            return pVar.a(iG);
        }
        if (!(zA ^ z10) ? i10 >= iG : i10 > iC) {
            iG = iC;
        }
        return pVar.a(iG);
    }
}
