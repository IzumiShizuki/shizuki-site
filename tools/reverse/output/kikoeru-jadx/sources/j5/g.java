package j5;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends q1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f10263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f10266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m4.h1 f10267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e f10268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f10269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10271v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        aVar.getClass();
        p4.c.c(j10 >= 0);
        this.f10261l = j10;
        this.f10262m = j11;
        this.f10263n = z10;
        this.f10264o = z11;
        this.f10265p = z12;
        this.f10266q = new ArrayList();
        this.f10267r = new m4.h1();
    }

    @Override // j5.q1
    public final void A(m4.i1 i1Var) {
        if (this.f10269t != null) {
            return;
        }
        C(i1Var);
    }

    public final void C(m4.i1 i1Var) {
        long j10;
        long j11;
        long j12;
        m4.h1 h1Var = this.f10267r;
        i1Var.n(0, h1Var);
        long j13 = h1Var.f14277p;
        e eVar = this.f10268s;
        long j14 = this.f10262m;
        ArrayList arrayList = this.f10266q;
        if (eVar == null || arrayList.isEmpty() || this.f10264o) {
            boolean z10 = this.f10265p;
            j10 = this.f10261l;
            if (z10) {
                long j15 = h1Var.f14273l;
                j10 += j15;
                j11 = j15 + j14;
            } else {
                j11 = j14;
            }
            this.f10270u = j13 + j10;
            this.f10271v = j14 != Long.MIN_VALUE ? j13 + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.f10270u;
                long j17 = this.f10271v;
                dVar.f10242e = j16;
                dVar.f10243f = j17;
            }
            j12 = j11;
        } else {
            j10 = this.f10270u - j13;
            j12 = j14 != Long.MIN_VALUE ? this.f10271v - j13 : Long.MIN_VALUE;
        }
        try {
            e eVar2 = new e(i1Var, j10, j12);
            this.f10268s = eVar2;
            n(eVar2);
        } catch (f e10) {
            this.f10269t = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f10244g = this.f10269t;
            }
        }
    }

    @Override // j5.a
    public final boolean a(m4.i0 i0Var) {
        a aVar = this.f10407k;
        return aVar.i().f14289e.equals(i0Var.f14289e) && aVar.a(i0Var);
    }

    @Override // j5.a
    public final b0 c(d0 d0Var, n5.f fVar, long j10) {
        d dVar = new d(this.f10407k.c(d0Var, fVar, j10), this.f10263n, this.f10270u, this.f10271v);
        this.f10266q.add(dVar);
        return dVar;
    }

    @Override // j5.k, j5.a
    public final void k() throws f {
        f fVar = this.f10269t;
        if (fVar != null) {
            throw fVar;
        }
        super.k();
    }

    @Override // j5.a
    public final void o(b0 b0Var) {
        ArrayList arrayList = this.f10266q;
        p4.c.i(arrayList.remove(b0Var));
        this.f10407k.o(((d) b0Var).f10238a);
        if (!arrayList.isEmpty() || this.f10264o) {
            return;
        }
        e eVar = this.f10268s;
        eVar.getClass();
        C(eVar.f10410e);
    }

    @Override // j5.k, j5.a
    public final void q() {
        super.q();
        this.f10269t = null;
        this.f10268s = null;
    }
}
