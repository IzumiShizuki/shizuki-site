package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oc.a f19183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(float f10, oc.a aVar, int i10) {
        super(1);
        this.f19182b = f10;
        this.f19183c = aVar;
        this.f19184d = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        Float fValueOf = Float.valueOf(this.f19182b);
        oc.a aVar = this.f19183c;
        q2.g gVar = new q2.g(((Number) nh.b.m(fValueOf, aVar)).floatValue(), aVar, this.f19184d);
        pc.u[] uVarArr = q2.v.f17698a;
        q2.w wVar = q2.t.f17672c;
        pc.u uVar = q2.v.f17698a[1];
        wVar.a((q2.k) obj, gVar);
        return ub.a0.f21526a;
    }
}
