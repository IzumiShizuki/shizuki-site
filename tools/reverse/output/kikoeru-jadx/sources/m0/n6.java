package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n6 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f13345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.v f13346c;

    public /* synthetic */ n6(v vVar, jc.v vVar2, int i10) {
        this.f13344a = i10;
        this.f13345b = vVar;
        this.f13346c = vVar2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        r.c cVar = (r.c) obj;
        switch (this.f13344a) {
            case 0:
                float fFloatValue = ((Number) cVar.e()).floatValue();
                jc.v vVar = this.f13346c;
                this.f13345b.a(fFloatValue - vVar.f10835a);
                vVar.f10835a = ((Number) cVar.e()).floatValue();
                break;
            default:
                float fFloatValue2 = ((Number) cVar.e()).floatValue();
                jc.v vVar2 = this.f13346c;
                this.f13345b.a(fFloatValue2 - vVar2.f10835a);
                vVar2.f10835a = ((Number) cVar.e()).floatValue();
                break;
        }
        return ub.a0.f21526a;
    }
}
