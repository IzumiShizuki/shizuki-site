package cg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f4140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(v vVar, int i10) {
        super(0);
        this.f4139b = i10;
        this.f4140c = vVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f4139b) {
            case 0:
                v vVar = this.f4140c;
                hf.a0.y(androidx.lifecycle.m0.h(vVar), null, null, new t(vVar.w() != o.f4086b, vVar, null), 3);
                return ub.a0.f21526a;
            case 1:
                g8.a.T("onValueChangeFinish", "EasyPlayerExtends");
                this.f4140c.A();
                return ub.a0.f21526a;
            case 2:
                v vVar2 = this.f4140c;
                int iOrdinal = vVar2.w().ordinal();
                return Float.valueOf(iOrdinal != 0 ? iOrdinal != 2 ? 0.0f : vVar2.f4117f.e() : ((Number) vVar2.f4121j.getValue()).longValue());
            case 3:
                this.f4140c.A();
                return ub.a0.f21526a;
            case 4:
                this.f4140c.A();
                return ub.a0.f21526a;
            case 5:
                this.f4140c.A();
                return ub.a0.f21526a;
            case 6:
                this.f4140c.A();
                return ub.a0.f21526a;
            default:
                v vVar3 = this.f4140c;
                return Boolean.valueOf(vVar3.z() && vVar3.w() != o.f4086b);
        }
    }
}
