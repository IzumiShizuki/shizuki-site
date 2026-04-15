package la;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hf.y f12070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f12071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f12072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ic.a f12073m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(hf.y yVar, x0.w0 w0Var, long j10, ic.a aVar, int i10) {
        super(1, jc.k.class, "onSelectTag", "TagAddNewDialog$onSelectTag(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;JLkotlin/jvm/functions/Function0;Ljava/lang/String;)V", 0);
        this.f12069i = i10;
        switch (i10) {
            case 1:
                this.f12070j = yVar;
                this.f12071k = w0Var;
                this.f12072l = j10;
                this.f12073m = aVar;
                super(1, jc.k.class, "onSelectTag", "TagAddNewDialog$onSelectTag(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;JLkotlin/jvm/functions/Function0;Ljava/lang/String;)V", 0);
                break;
            default:
                this.f12070j = yVar;
                this.f12071k = w0Var;
                this.f12072l = j10;
                this.f12073m = aVar;
                break;
        }
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f12069i) {
            case 0:
                String str = (String) obj;
                jc.l.e(str, "p0");
                l.r(this.f12070j, this.f12071k, this.f12072l, this.f12073m, str);
                break;
            default:
                String str2 = (String) obj;
                jc.l.e(str2, "p0");
                l.r(this.f12070j, this.f12071k, this.f12072l, this.f12073m, str2);
                break;
        }
        return ub.a0.f21526a;
    }
}
