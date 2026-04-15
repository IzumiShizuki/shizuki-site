package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1 f21090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f21091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f21092h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, float f10, float f11, yb.c cVar) {
        super(2, cVar);
        this.f21090f = u1Var;
        this.f21091g = f10;
        this.f21092h = f11;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new t1(this.f21090f, this.f21091g, this.f21092h, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((t1) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f21089e;
        if (i10 == 0) {
            ub.a.f(obj);
            c2 c2Var = this.f21090f.D;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f21091g)) << 32) | (((long) Float.floatToRawIntBits(this.f21092h)) & 4294967295L);
            this.f21089e = 1;
            Object objA = androidx.compose.foundation.gestures.a.a(c2Var, jFloatToRawIntBits, this);
            zb.a aVar = zb.a.f26667a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return ub.a0.f21526a;
    }
}
