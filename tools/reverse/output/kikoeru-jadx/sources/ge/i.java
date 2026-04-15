package ge;

import se.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.b f7528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be.e f7529c;

    public i(be.b bVar, be.e eVar) {
        super(new ub.k(bVar, eVar));
        this.f7528b = bVar;
        this.f7529c = eVar;
    }

    @Override // ge.g
    public final se.w a(yc.y yVar) {
        a0 a0VarE;
        jc.l.e(yVar, "module");
        be.b bVar = this.f7528b;
        yc.e eVarD = yc.v.d(yVar, bVar);
        if (eVarD != null) {
            int i10 = ee.e.f6524a;
            if (!ee.e.m(eVarD, yc.f.f26111c)) {
                eVarD = null;
            }
            if (eVarD != null && (a0VarE = eVarD.E()) != null) {
                return a0VarE;
            }
        }
        String string = bVar.toString();
        String str = this.f7529c.f2751a;
        jc.l.d(str, "toString(...)");
        return ue.l.c(ue.k.ERROR_ENUM_TYPE, string, str);
    }

    @Override // ge.g
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7528b.f());
        sb.append('.');
        sb.append(this.f7529c);
        return sb.toString();
    }
}
