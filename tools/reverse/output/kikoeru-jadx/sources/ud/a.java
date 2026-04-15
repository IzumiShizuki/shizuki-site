package ud;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21567b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21568c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21569a;

    public /* synthetic */ a(int i10) {
        this.f21569a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        d dVar = (d) obj;
        t tVar = (t) obj2;
        switch (this.f21569a) {
            case 0:
                jc.l.e(dVar, "$this$loadConstantFromProperty");
                jc.l.e(tVar, "it");
                return dVar.f21576c.get(tVar);
            default:
                jc.l.e(dVar, "$this$loadConstantFromProperty");
                jc.l.e(tVar, "it");
                return dVar.f21575b.get(tVar);
        }
    }
}
