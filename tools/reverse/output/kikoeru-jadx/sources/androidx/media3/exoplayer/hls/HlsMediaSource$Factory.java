package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.offline.u;
import b0.c1;
import b5.t;
import b7.c3;
import c5.c;
import c7.e1;
import e5.r;
import g5.w;
import j5.a;
import j5.c0;
import java.util.List;
import m3.l;
import m4.i0;
import pe.d;
import s4.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f850c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f855h = new e1(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f852e = new d(22);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c3 f853f = e5.c.f6155o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f856i = new l(11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f854g = new w(19);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f858k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f859l = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f857j = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f851d = true;

    public HlsMediaSource$Factory(g gVar) {
        this.f848a = new c1(7, gVar);
    }

    @Override // j5.c0
    public final a a(i0 i0Var) {
        i0Var.f14286b.getClass();
        if (this.f849b == null) {
            c cVar = new c();
            cVar.f3432a = new l(17);
            this.f849b = cVar;
        }
        l lVar = this.f850c;
        if (lVar != null) {
            this.f849b.f3432a = lVar;
        }
        c cVar2 = this.f849b;
        cVar2.f3433b = this.f851d;
        List list = i0Var.f14286b.f14182e;
        boolean zIsEmpty = list.isEmpty();
        r uVar = this.f852e;
        if (!zIsEmpty) {
            uVar = new u(13, uVar, list);
        }
        t tVarV = this.f855h.v(i0Var);
        this.f853f.getClass();
        c1 c1Var = this.f848a;
        l lVar2 = this.f856i;
        return new c5.l(i0Var, c1Var, cVar2, this.f854g, tVarV, lVar2, new e5.c(c1Var, lVar2, uVar), this.f859l, this.f857j, this.f858k);
    }

    @Override // j5.c0
    public final c0 b(l lVar) {
        this.f850c = lVar;
        return this;
    }

    @Override // j5.c0
    public final c0 c(boolean z10) {
        this.f851d = z10;
        return this;
    }

    @Override // j5.c0
    public final c0 d() {
        return this;
    }
}
