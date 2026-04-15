package bh;

import java.io.IOException;
import jc.l;
import lh.b0;
import lh.h0;
import lh.j0;
import lh.p;
import ug.r;
import ug.t;
import ug.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f3009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f3010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f3012d;

    public b(h hVar, t tVar) {
        l.e(tVar, "url");
        this.f3012d = hVar;
        this.f3009a = tVar;
        this.f3010b = new p(((b0) hVar.f3028c.f20619c).f12544a.a());
    }

    @Override // lh.h0
    public long W(lh.f fVar, long j10) throws IOException {
        h hVar = this.f3012d;
        l.e(fVar, "sink");
        try {
            return ((b0) hVar.f3028c.f20619c).W(fVar, j10);
        } catch (IOException e10) {
            hVar.f3027b.f();
            b(h.f3025f);
            throw e10;
        }
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f3010b;
    }

    public final void b(r rVar) {
        x xVar;
        ug.b bVar;
        l.e(rVar, "trailers");
        h hVar = this.f3012d;
        int i10 = hVar.f3029d;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + hVar.f3029d);
        }
        p pVar = this.f3010b;
        j0 j0Var = pVar.f12599e;
        pVar.f12599e = j0.f12579d;
        j0Var.a();
        j0Var.b();
        hVar.f3029d = 6;
        if (rVar.size() <= 0 || (xVar = hVar.f3026a) == null || (bVar = xVar.f21916j) == null) {
            return;
        }
        ah.g.b(bVar, this.f3009a, rVar);
    }
}
