package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f8648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(0);
        this.f8647b = i10;
        this.f8648c = cVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f8647b) {
            case 0:
                this.f8648c.D0();
                break;
            default:
                c cVar = this.f8648c;
                j1.o oVar = cVar.f8654o;
                jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((h2.c) oVar).i(cVar);
                break;
        }
        return ub.a0.f21526a;
    }
}
