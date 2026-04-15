package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.v f21147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(jc.v vVar, int i10) {
        super(2);
        this.f21146b = i10;
        this.f21147c = vVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f21146b) {
            case 0:
                float fFloatValue = ((Number) obj2).floatValue();
                ((c2.t) obj).a();
                this.f21147c.f10835a = fFloatValue;
                break;
            default:
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((c2.t) obj).a();
                this.f21147c.f10835a = fFloatValue2;
                break;
        }
        return ub.a0.f21526a;
    }
}
