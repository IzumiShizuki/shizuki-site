package j3;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.x f10170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f10171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f3.k f10172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f10173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jc.x xVar, u uVar, f3.k kVar, long j10, long j11) {
        super(0);
        this.f10170b = xVar;
        this.f10171c = uVar;
        this.f10172d = kVar;
        this.f10173e = j10;
        this.f10174f = j11;
    }

    @Override // ic.a
    public final Object b() {
        u uVar = this.f10171c;
        this.f10170b.f10837a = uVar.getPositionProvider().a(this.f10172d, this.f10173e, uVar.getParentLayoutDirection(), this.f10174f);
        return a0.f21526a;
    }
}
