package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f18331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f18333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f18334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.e1 f18335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f18336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f18337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f18338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f18339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f18340j;

    public c(Object obj, v1 v1Var, Object obj2) {
        this.f18331a = v1Var;
        this.f18332b = obj2;
        k kVar = new k(v1Var, obj, null, 60);
        this.f18333c = kVar;
        this.f18334d = x0.v.v(Boolean.FALSE);
        this.f18335e = x0.v.v(obj);
        this.f18336f = new m0();
        new z0(3, obj2);
        p pVar = kVar.f18469c;
        boolean z10 = pVar instanceof l;
        p pVar2 = z10 ? d.f18363e : pVar instanceof m ? d.f18364f : pVar instanceof n ? d.f18365g : d.f18366h;
        this.f18337g = pVar2;
        p pVar3 = z10 ? d.f18359a : pVar instanceof m ? d.f18360b : pVar instanceof n ? d.f18361c : d.f18362d;
        this.f18338h = pVar3;
        this.f18339i = pVar2;
        this.f18340j = pVar3;
    }

    public static final Object a(c cVar, Object obj) {
        v1 v1Var = cVar.f18331a;
        p pVar = cVar.f18340j;
        p pVar2 = cVar.f18339i;
        if (!jc.l.a(pVar2, cVar.f18337g) || !jc.l.a(pVar, cVar.f18338h)) {
            p pVar3 = (p) v1Var.f18596a.a(obj);
            int iB = pVar3.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < iB; i10++) {
                if (pVar3.a(i10) < pVar2.a(i10) || pVar3.a(i10) > pVar.a(i10)) {
                    pVar3.e(nh.b.j(pVar3.a(i10), pVar2.a(i10), pVar.a(i10)), i10);
                    z10 = true;
                }
            }
            if (z10) {
                return v1Var.f18597b.a(pVar3);
            }
        }
        return obj;
    }

    public static final void b(c cVar) {
        k kVar = cVar.f18333c;
        kVar.f18469c.d();
        kVar.f18470d = Long.MIN_VALUE;
        cVar.f18334d.setValue(Boolean.FALSE);
    }

    public static Object d(c cVar, Object obj, j jVar, ic.k kVar, yb.c cVar2, int i10) {
        Object objA = cVar.f18331a.f18597b.a(cVar.f18333c.f18469c);
        if ((i10 & 8) != 0) {
            kVar = null;
        }
        return cVar.c(obj, jVar, objA, kVar, cVar2);
    }

    public final Object c(Object obj, j jVar, Object obj2, ic.k kVar, yb.c cVar) {
        Object objE = e();
        v1 v1Var = this.f18331a;
        return m0.a(this.f18336f, new a(this, obj2, new h1(jVar, v1Var, objE, obj, (p) v1Var.f18596a.a(obj2)), this.f18333c.f18470d, kVar, null), cVar);
    }

    public final Object e() {
        return this.f18333c.f18468b.getValue();
    }

    public final Object f(Object obj, yb.c cVar) {
        Object objA = m0.a(this.f18336f, new b(this, obj, null), cVar);
        return objA == zb.a.f26667a ? objA : ub.a0.f21526a;
    }

    public final Object g(ac.i iVar) {
        Object objA = m0.a(this.f18336f, new i7.i1(1, this, null), iVar);
        return objA == zb.a.f26667a ? objA : ub.a0.f21526a;
    }

    public /* synthetic */ c(Object obj, v1 v1Var, Object obj2, int i10) {
        this(obj, v1Var, (i10 & 4) != 0 ? null : obj2);
    }

    public /* synthetic */ c(p1.b bVar) {
        this(bVar, w1.f18625f, null);
    }
}
