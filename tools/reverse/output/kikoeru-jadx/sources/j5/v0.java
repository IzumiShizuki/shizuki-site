package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.g f10453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.g f10454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.e1 f10455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.l f10456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10457e;

    public v0(s4.g gVar, r5.l lVar) {
        androidx.media3.exoplayer.offline.g gVar2 = new androidx.media3.exoplayer.offline.g(14, lVar);
        c7.e1 e1Var = new c7.e1(6);
        m3.l lVar2 = new m3.l(11);
        this.f10453a = gVar;
        this.f10454b = gVar2;
        this.f10455c = e1Var;
        this.f10456d = lVar2;
        this.f10457e = 1048576;
    }

    @Override // j5.c0
    public final a a(m4.i0 i0Var) {
        i0Var.f14286b.getClass();
        return new w0(i0Var, this.f10453a, this.f10454b, this.f10455c.v(i0Var), this.f10456d, this.f10457e, null);
    }

    @Override // j5.c0
    public final c0 d() {
        return this;
    }

    @Override // j5.c0
    public final c0 b(m3.l lVar) {
        return this;
    }

    @Override // j5.c0
    public final c0 c(boolean z10) {
        return this;
    }
}
