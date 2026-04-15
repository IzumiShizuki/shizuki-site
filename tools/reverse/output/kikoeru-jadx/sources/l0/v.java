package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p pVar, int i10) {
        super(0);
        this.f11647b = pVar;
        this.f11648c = i10;
    }

    @Override // ic.a
    public final Object b() {
        t2.i0 i0Var = this.f11647b.f11590f;
        return Integer.valueOf(i0Var.f20345b.d(this.f11648c));
    }
}
