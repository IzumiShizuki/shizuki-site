package yf;

import d0.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ua.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7.k f26286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f26287b;

    public g(h7.k kVar, xf.c cVar) {
        jc.l.e(cVar, "json");
        this.f26286a = kVar;
        this.f26287b = cVar.f24989b;
    }

    @Override // ua.l, vf.b
    public final short A() {
        ub.y yVar;
        h7.k kVar = this.f26286a;
        String strN = kVar.n();
        try {
            jc.l.e(strN, "<this>");
            ub.t tVarD0 = a2.c.d0(strN);
            if (tVarD0 != null) {
                int i10 = tVarD0.f21558a;
                yVar = Integer.compare(Integer.MIN_VALUE ^ i10, -2147418113) > 0 ? null : new ub.y((short) i10);
            }
            if (yVar != null) {
                return yVar.f21563a;
            }
            ef.u.e0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            h7.k.q(kVar, a0.c.G('\'', "Failed to parse type 'UShort' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // vf.a
    public final int b(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // ua.l, vf.b
    public final int m() {
        h7.k kVar = this.f26286a;
        String strN = kVar.n();
        try {
            jc.l.e(strN, "<this>");
            ub.t tVarD0 = a2.c.d0(strN);
            if (tVarD0 != null) {
                return tVarD0.f21558a;
            }
            ef.u.e0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            h7.k.q(kVar, a0.c.G('\'', "Failed to parse type 'UInt' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // vf.a
    public final y p() {
        return this.f26287b;
    }

    @Override // ua.l, vf.b
    public final long u() {
        h7.k kVar = this.f26286a;
        String strN = kVar.n();
        try {
            jc.l.e(strN, "<this>");
            ub.v vVarE0 = a2.c.e0(strN);
            if (vVarE0 != null) {
                return vVarE0.f21560a;
            }
            ef.u.e0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            h7.k.q(kVar, a0.c.G('\'', "Failed to parse type 'ULong' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // ua.l, vf.b
    public final byte z() {
        ub.r rVar;
        h7.k kVar = this.f26286a;
        String strN = kVar.n();
        try {
            jc.l.e(strN, "<this>");
            ub.t tVarD0 = a2.c.d0(strN);
            if (tVarD0 != null) {
                int i10 = tVarD0.f21558a;
                rVar = Integer.compare(Integer.MIN_VALUE ^ i10, -2147483393) > 0 ? null : new ub.r((byte) i10);
            }
            if (rVar != null) {
                return rVar.f21556a;
            }
            ef.u.e0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            h7.k.q(kVar, a0.c.G('\'', "Failed to parse type 'UByte' for input '", strN), 0, null, 6);
            throw null;
        }
    }
}
