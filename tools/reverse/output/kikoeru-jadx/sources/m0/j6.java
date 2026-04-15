package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j6 extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.a f13139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ jc.v f13140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ jc.v f13141k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(oc.a aVar, jc.v vVar, jc.v vVar2) {
        super(1, jc.k.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f13139i = aVar;
        this.f13140j = vVar;
        this.f13141k = vVar2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        oc.a aVar = this.f13139i;
        float f10 = aVar.f16305a;
        float f11 = aVar.f16306b;
        float f12 = this.f13140j.f10835a;
        float f13 = this.f13141k.f10835a;
        float f14 = t6.f13667a;
        float f15 = f11 - f10;
        float f16 = f15 == 0.0f ? 0.0f : (fFloatValue - f10) / f15;
        float f17 = f16 >= 0.0f ? f16 : 0.0f;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        return Float.valueOf(android.support.v4.media.session.b.L(f12, f13, f17));
    }
}
