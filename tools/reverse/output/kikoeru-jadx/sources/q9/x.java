package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f18123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f18124c;

    public /* synthetic */ x(int i10, hf.y yVar, r0 r0Var) {
        this.f18122a = i10;
        this.f18123b = yVar;
        this.f18124c = r0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f18122a) {
            case 0:
                bg.p pVar = (bg.p) obj;
                jc.l.e(pVar, "it");
                hf.a0.y(this.f18123b, null, null, new f0(pVar, this.f18124c, null, 0), 3);
                break;
            case 1:
                bg.p pVar2 = (bg.p) obj;
                jc.l.e(pVar2, "it");
                hf.a0.y(this.f18123b, null, null, new f0(pVar2, this.f18124c, null, 2), 3);
                break;
            case 2:
                String str = (String) obj;
                jc.l.e(str, "it");
                hf.a0.y(this.f18123b, null, null, new e0(str, this.f18124c, null, 1), 3);
                break;
            default:
                String str2 = (String) obj;
                jc.l.e(str2, "it");
                hf.a0.y(this.f18123b, null, null, new e0(str2, this.f18124c, null, 0), 3);
                break;
        }
        return ub.a0.f21526a;
    }
}
