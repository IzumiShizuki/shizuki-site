package g2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f7211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f7212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f7213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f7214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.k f7215g;

    public j0(int i10, int i11, Map map, ic.k kVar, k0 k0Var, p0 p0Var, ic.k kVar2) {
        this.f7209a = i10;
        this.f7210b = i11;
        this.f7211c = map;
        this.f7212d = kVar;
        this.f7213e = k0Var;
        this.f7214f = p0Var;
        this.f7215g = kVar2;
    }

    @Override // g2.w0
    public final int b() {
        return this.f7210b;
    }

    @Override // g2.w0
    public final int h() {
        return this.f7209a;
    }

    @Override // g2.w0
    public final Map i() {
        return this.f7211c;
    }

    @Override // g2.w0
    public final void j() {
        i2.t tVar;
        i2.j0 j0Var = this.f7214f.f7253a;
        boolean zO = this.f7213e.O();
        ic.k kVar = this.f7215g;
        if (!zO || (tVar = j0Var.F.f8664c.S) == null) {
            kVar.a(j0Var.F.f8664c.f8825l);
        } else {
            kVar.a(tVar.f8825l);
        }
    }

    @Override // g2.w0
    public final ic.k k() {
        return this.f7212d;
    }
}
