package y4;

import m4.c0;
import m4.f1;
import m4.i0;
import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f25481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f25483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z4.c f25484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f25485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0 f25486n;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, z4.c cVar, i0 i0Var, c0 c0Var) {
        p4.c.i(cVar.f26392d == (c0Var != null));
        this.f25477e = j10;
        this.f25478f = j11;
        this.f25479g = j12;
        this.f25480h = i10;
        this.f25481i = j13;
        this.f25482j = j14;
        this.f25483k = j15;
        this.f25484l = cVar;
        this.f25485m = i0Var;
        this.f25486n = c0Var;
    }

    @Override // m4.i1
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f25480h) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // m4.i1
    public final f1 f(int i10, f1 f1Var, boolean z10) {
        p4.c.f(i10, h());
        z4.c cVar = this.f25484l;
        String str = z10 ? cVar.b(i10).f26421a : null;
        Integer numValueOf = z10 ? Integer.valueOf(this.f25480h + i10) : null;
        long jD = cVar.d(i10);
        long jN = p4.c0.N(cVar.b(i10).f26422b - cVar.b(0).f26422b) - this.f25481i;
        f1Var.getClass();
        f1Var.i(str, numValueOf, 0, jD, jN, m4.b.f14121f, false);
        return f1Var;
    }

    @Override // m4.i1
    public final int h() {
        return this.f25484l.f26401m.size();
    }

    @Override // m4.i1
    public final Object l(int i10) {
        p4.c.f(i10, h());
        return Integer.valueOf(this.f25480h + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    @Override // m4.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m4.h1 m(int r24, m4.h1 r25, long r26) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e.m(int, m4.h1, long):m4.h1");
    }

    @Override // m4.i1
    public final int o() {
        return 1;
    }
}
