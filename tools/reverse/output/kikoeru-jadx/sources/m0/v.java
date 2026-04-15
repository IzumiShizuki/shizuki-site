package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13718b;

    public /* synthetic */ v(int i10, Object obj) {
        this.f13717a = i10;
        this.f13718b = obj;
    }

    public final void a(float f10) {
        switch (this.f13717a) {
            case 0:
                x xVar = (x) this.f13718b;
                u uVar = xVar.f13858n;
                float fE = xVar.e(f10);
                x xVar2 = uVar.f13683a;
                xVar2.f13854j.f(fE);
                xVar2.f13855k.f(0.0f);
                break;
            case 1:
                ((a6) this.f13718b).f12655a.a(Float.valueOf(f10));
                break;
            case 2:
                ((f7) ((tc.b0) this.f13718b).f20618b).a(Float.valueOf(f10));
                break;
            default:
                ((v0.l0) this.f13718b).a(f10);
                break;
        }
    }
}
