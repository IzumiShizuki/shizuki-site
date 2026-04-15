package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f7683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.y f7685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.r f7688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1 f7689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ic.k f7690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7691j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(u0 u0Var, l0.l1 l1Var, y2.y yVar, boolean z10, boolean z11, y2.r rVar, s1 s1Var, ic.k kVar, int i10) {
        super(3);
        this.f7683b = u0Var;
        this.f7684c = l1Var;
        this.f7685d = yVar;
        this.f7686e = z10;
        this.f7687f = z11;
        this.f7688g = rVar;
        this.f7689h = s1Var;
        this.f7690i = kVar;
        this.f7691j = i10;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(851809892);
        Object objK = oVar.K();
        x0.r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            objK = new l0.p1();
            oVar.h0(objK);
        }
        l0.p1 p1Var = (l0.p1) objK;
        Object objK2 = oVar.K();
        if (objK2 == r0Var) {
            objK2 = new f0();
            oVar.h0(objK2);
        }
        ic.k kVar = this.f7690i;
        int i10 = this.f7691j;
        h1 h1Var = new h1(this.f7683b, this.f7684c, this.f7685d, this.f7686e, this.f7687f, p1Var, this.f7688g, this.f7689h, (f0) objK2, kVar, i10);
        boolean zH = oVar.h(h1Var);
        Object objK3 = oVar.K();
        if (zH || objK3 == r0Var) {
            de.h hVar = new de.h(1, h1Var, h1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 1);
            oVar.h0(hVar);
            objK3 = hVar;
        }
        j1.q qVarA = androidx.compose.ui.input.key.a.a(j1.n.f9689a, (ic.k) ((pc.f) objK3));
        oVar.p(false);
        return qVarA;
    }
}
