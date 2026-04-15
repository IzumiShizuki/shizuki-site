package androidx.media3.exoplayer.dash;

import ah.j;
import androidx.media3.exoplayer.offline.u;
import c7.e1;
import g5.w;
import j5.a;
import j5.c0;
import java.util.List;
import k5.d;
import m3.l;
import m4.i0;
import s4.g;
import z4.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f847g;

    public DashMediaSource$Factory(g gVar) {
        j jVar = new j(gVar);
        this.f841a = jVar;
        this.f842b = gVar;
        this.f843c = new e1(6);
        this.f845e = new l(11);
        this.f846f = 30000L;
        this.f847g = 5000000L;
        this.f844d = new w(19);
        ((d) jVar.f392d).f11043b = true;
    }

    @Override // j5.c0
    public final a a(i0 i0Var) {
        i0Var.f14286b.getClass();
        e eVar = new e();
        List list = i0Var.f14286b.f14182e;
        return new y4.g(i0Var, this.f842b, !list.isEmpty() ? new u(0, eVar, list) : eVar, this.f841a, this.f844d, this.f843c.v(i0Var), this.f845e, this.f846f, this.f847g);
    }

    @Override // j5.c0
    public final c0 b(l lVar) {
        d dVar = (d) this.f841a.f392d;
        dVar.getClass();
        dVar.f11044c = lVar;
        return this;
    }

    @Override // j5.c0
    public final c0 c(boolean z10) {
        ((d) this.f841a.f392d).f11043b = z10;
        return this;
    }

    @Override // j5.c0
    public final c0 d() {
        ((d) this.f841a.f392d).getClass();
        return this;
    }
}
