package k0;

import h0.q0;
import java.util.List;
import t2.c0;
import t2.h0;
import t2.i0;
import t2.l0;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t2.g f10893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x2.d f10894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f10899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f10900h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f3.c f10902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l0 f10903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ch.l f10904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f3.m f10905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i0 f10906n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10901i = a.f10881a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10907o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10908p = -1;

    public d(t2.g gVar, l0 l0Var, x2.d dVar, int i10, boolean z10, int i11, int i12, r rVar) {
        this.f10893a = gVar;
        this.f10894b = dVar;
        this.f10895c = i10;
        this.f10896d = z10;
        this.f10897e = i11;
        this.f10898f = i12;
        this.f10899g = rVar;
        this.f10903k = l0Var;
    }

    public final int a(int i10, f3.m mVar) {
        int i11 = this.f10907o;
        int i12 = this.f10908p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = f3.b.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f10898f > 1) {
            b bVar = this.f10900h;
            l0 l0Var = this.f10903k;
            f3.c cVar = this.f10902j;
            jc.l.b(cVar);
            b bVarW = gh.g.w(bVar, mVar, l0Var, cVar, this.f10894b);
            this.f10900h = bVarW;
            jA = bVarW.a(this.f10898f, jA);
        }
        int iM = q0.m(b(jA, mVar).f20370e);
        int i13 = f3.a.i(jA);
        if (iM < i13) {
            iM = i13;
        }
        this.f10907o = i10;
        this.f10908p = iM;
        return iM;
    }

    public final t2.n b(long j10, f3.m mVar) {
        ch.l lVarD = d(mVar);
        long jT = g8.a.t(lVarD.j(), this.f10895c, j10, this.f10896d);
        boolean z10 = this.f10896d;
        int i10 = this.f10895c;
        int i11 = this.f10897e;
        return new t2.n(lVarD, jT, ((z10 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10);
    }

    public final void c(f3.c cVar) {
        long jA;
        f3.c cVar2 = this.f10902j;
        if (cVar != null) {
            int i10 = a.f10882b;
            jA = a.a(cVar.a(), cVar.M());
        } else {
            jA = a.f10881a;
        }
        if (cVar2 == null) {
            this.f10902j = cVar;
            this.f10901i = jA;
        } else if (cVar == null || this.f10901i != jA) {
            this.f10902j = cVar;
            this.f10901i = jA;
            this.f10904l = null;
            this.f10906n = null;
            this.f10908p = -1;
            this.f10907o = -1;
        }
    }

    public final ch.l d(f3.m mVar) {
        ch.l lVar = this.f10904l;
        if (lVar == null || mVar != this.f10905m || lVar.c()) {
            this.f10905m = mVar;
            t2.g gVar = this.f10893a;
            l0 l0VarH = c0.h(this.f10903k, mVar);
            f3.c cVar = this.f10902j;
            jc.l.b(cVar);
            x2.d dVar = this.f10894b;
            List list = this.f10899g;
            if (list == null) {
                list = r.f22819a;
            }
            lVar = new ch.l(gVar, l0VarH, list, cVar, dVar);
        }
        this.f10904l = lVar;
        return lVar;
    }

    public final i0 e(f3.m mVar, long j10, t2.n nVar) {
        float fMin = Math.min(nVar.f20366a.j(), nVar.f20369d);
        t2.g gVar = this.f10893a;
        l0 l0Var = this.f10903k;
        List list = this.f10899g;
        if (list == null) {
            list = r.f22819a;
        }
        int i10 = this.f10897e;
        boolean z10 = this.f10896d;
        int i11 = this.f10895c;
        f3.c cVar = this.f10902j;
        jc.l.b(cVar);
        return new i0(new h0(gVar, l0Var, list, i10, z10, i11, cVar, mVar, this.f10894b, j10), nVar, f3.b.d(j10, (((long) q0.m(fMin)) << 32) | (((long) q0.m(nVar.f20370e)) & 4294967295L)));
    }
}
