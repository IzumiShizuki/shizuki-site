package j5;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements p4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ah.j f10291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f10292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f10293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f10294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10295e;

    public /* synthetic */ h0(ah.j jVar, u uVar, z zVar, IOException iOException, boolean z10) {
        this.f10291a = jVar;
        this.f10292b = uVar;
        this.f10293c = zVar;
        this.f10294d = iOException;
        this.f10295e = z10;
    }

    @Override // p4.g
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        ah.j jVar = this.f10291a;
        j0Var.q(jVar.f390b, (d0) jVar.f391c, this.f10292b, this.f10293c, this.f10294d, this.f10295e);
    }
}
