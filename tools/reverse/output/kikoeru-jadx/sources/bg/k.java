package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2917b;

    public k(int i10) {
        this.f2916a = i10;
        switch (i10) {
            case 1:
                uf.g[] gVarArr = new uf.g[0];
                if (ef.n.y0("PPP")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                uf.a aVar = new uf.a("PPP");
                this.f2917b = new uf.h("PPP", uf.k.f21705b, aVar.f21672c.size(), vb.l.M0(gVarArr), aVar);
                return;
            case 2:
                this.f2917b = ub.a.c(ub.i.f21540a, new t9.f(6, this));
                return;
            default:
                uf.g[] gVarArr2 = new uf.g[0];
                if (ef.n.y0("MixedSerializer")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                uf.a aVar2 = new uf.a("MixedSerializer");
                this.f2917b = new uf.h("MixedSerializer", uf.k.f21705b, aVar2.f21672c.size(), vb.l.M0(gVarArr2), aVar2);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ub.h] */
    @Override // sf.a
    public final uf.g a() {
        switch (this.f2916a) {
            case 0:
                return (uf.h) this.f2917b;
            case 1:
                return (uf.h) this.f2917b;
            default:
                return (uf.g) this.f2917b.getValue();
        }
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        Long lValueOf;
        boolean zBooleanValue;
        switch (this.f2916a) {
            case 0:
                xf.c0 c0VarF = xf.n.f(((xf.k) bVar).l());
                Boolean boolC = xf.n.c(c0VarF);
                if (boolC == null) {
                    Integer numValueOf = null;
                    try {
                        lValueOf = Long.valueOf(xf.n.g(c0VarF));
                    } catch (yf.h unused) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                            numValueOf = Integer.valueOf((int) jLongValue);
                        }
                    }
                    zBooleanValue = numValueOf == null || numValueOf.intValue() != 0;
                    break;
                } else {
                    zBooleanValue = boolC.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 1:
                xf.y yVarE = xf.n.e(((xf.k) bVar).l());
                xf.m mVar = (xf.m) yVarE.get("currentPage");
                if (mVar == null) {
                    mVar = (xf.m) yVarE.get("page");
                }
                jc.l.b(mVar);
                int iD = xf.n.d(xf.n.f(mVar));
                Object obj = yVarE.get("pageSize");
                jc.l.b(obj);
                int iD2 = xf.n.d(xf.n.f((xf.m) obj));
                Object obj2 = yVarE.get("totalCount");
                jc.l.b(obj2);
                return new m(iD, iD2, xf.n.d(xf.n.f((xf.m) obj2)));
            default:
                uf.g gVarA = a();
                vf.a aVarI = bVar.i(gVarA);
                int iB = aVarI.b(a());
                if (iB != -1) {
                    throw new sf.h(q.t0.B(iB, "Unexpected index "));
                }
                aVarI.j(gVarA);
                return ub.a0.f21526a;
        }
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        switch (this.f2916a) {
            case 0:
                tVar.b(((Boolean) obj).booleanValue());
                break;
            case 1:
                m mVar = (m) obj;
                jc.l.e(mVar, "value");
                sf.a aVarSerializer = xf.y.Companion.serializer();
                i4.d dVar = new i4.d(5);
                ud.s.v(dVar, "currentPage", Integer.valueOf(mVar.f2924a));
                ud.s.v(dVar, "pageSize", Integer.valueOf(mVar.f2925b));
                ud.s.v(dVar, "totalCount", Integer.valueOf(mVar.f2926c));
                tVar.s(aVarSerializer, dVar.c());
                break;
            default:
                jc.l.e(obj, "value");
                tVar.a(a()).w(a());
                break;
        }
    }
}
