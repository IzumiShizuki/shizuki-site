package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements yb.g, i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r0 f24435b = new r0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f24436c = new r0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f24437d = new r0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f24438e = new r0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f24439f = new r0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24440a;

    public /* synthetic */ r0(int i10) {
        this.f24440a = i10;
    }

    public static final void b(r0 r0Var) {
        lf.b1 b1Var;
        a1.e eVar;
        d1.b bVar;
        lf.b1 b1Var2 = t1.f24465x;
        do {
            b1Var = t1.f24465x;
            eVar = (a1.e) b1Var.getValue();
            bVar = (d1.b) eVar;
            c1.c cVarB = bVar.f5441c;
            d1.a aVar = (d1.a) cVarB.get(r0Var);
            if (aVar != null) {
                Object obj = aVar.f5436a;
                Object obj2 = aVar.f5437b;
                c1.m mVar = cVarB.f3209a;
                c1.m mVarV = mVar.v(r0Var != null ? r0Var.hashCode() : 0, 0, r0Var);
                if (mVar != mVarV) {
                    cVarB = mVarV == null ? c1.c.f3208c : new c1.c(mVarV, cVarB.f3210b - 1);
                }
                e1.b bVar2 = e1.b.f6061a;
                if (obj != bVar2) {
                    Object obj3 = cVarB.get(obj);
                    jc.l.b(obj3);
                    cVarB = cVarB.b(obj, new d1.a(((d1.a) obj3).f5436a, obj2));
                }
                if (obj2 != bVar2) {
                    Object obj4 = cVarB.get(obj2);
                    jc.l.b(obj4);
                    cVarB = cVarB.b(obj2, new d1.a(obj, ((d1.a) obj4).f5437b));
                }
                Object obj5 = obj != bVar2 ? bVar.f5439a : obj2;
                if (obj2 != bVar2) {
                    obj = bVar.f5440b;
                }
                bVar = new d1.b(obj5, obj, cVarB);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!b1Var.k(eVar, bVar));
    }

    @Override // x0.i2
    public boolean a(Object obj, Object obj2) {
        switch (this.f24440a) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return jc.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f24440a) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
