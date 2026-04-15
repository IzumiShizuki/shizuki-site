package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, boolean z10, boolean z11) {
        super(1);
        this.f11451b = oVar;
        this.f11452c = z10;
        this.f11453d = z11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        q2.k kVar = (q2.k) obj;
        long jB = this.f11451b.b();
        kVar.l(k0.f11522c, new j0(this.f11452c ? h0.h0.f7647b : h0.h0.f7648c, jB, this.f11453d ? i0.f11500a : i0.f11502c, (9223372034707292159L & jB) != 9205357640488583168L));
        return ub.a0.f21526a;
    }
}
