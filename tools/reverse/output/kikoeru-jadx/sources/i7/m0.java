package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements lf.g, jc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9202b;

    public /* synthetic */ m0(int i10, Object obj) {
        this.f9201a = i10;
        this.f9202b = obj;
    }

    @Override // jc.h
    public final ub.e a() {
        switch (this.f9201a) {
            case 0:
                return new jc.j(2, (k2) this.f9202b, k2.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
            default:
                return new jc.a(2, 4, i8.l.class, (i8.l) this.f9202b, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f9201a) {
            case 0:
                if ((obj instanceof lf.g) && (obj instanceof jc.h)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof lf.g) && (obj instanceof jc.h)) {
                    break;
                }
                break;
        }
        return a().equals(((jc.h) obj).a());
    }

    public final int hashCode() {
        switch (this.f9201a) {
        }
        return a().hashCode();
    }

    @Override // lf.g
    public final Object n(Object obj, yb.c cVar) {
        int i10 = this.f9201a;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f9202b;
        switch (i10) {
            case 0:
                Object objJ = ((k2) obj2).f9183a.j((l1) obj, cVar);
                return objJ == zb.a.f26667a ? objJ : a0Var;
            default:
                ((i8.l) obj2).k((i8.h) obj);
                return a0Var;
        }
    }
}
